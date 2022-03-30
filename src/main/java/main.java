import Config.AppfileConfig;
import Config.SpringContext;
import com.proto.common.Time;
import com.proto.common.TimeRequest;
import com.proto.controller.*;
import com.proto.render_server.RenderServiceGrpc;
import com.proto.render_server.ServerRequest;
import com.proto.render_server.ServerResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.SpringApplication;
import utils.Backgroundgrapper;
import utils.Renderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class main {
    private static final Logger logger = Logger.getLogger(main.class.getName());
    public static void main(String[] args){
        SpringContext springContext = new SpringContext();
        springContext.setApplicationContext(SpringApplication.run(AppfileConfig.class, args));
        AppfileConfig appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);

        //build channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(appfileConfig.host, appfileConfig.controllerServicePort).usePlaintext().build();

        //create blocking stub
//        ControllerServiceGrpc.ControllerServiceBlockingStub blockingStub = ControllerServiceGrpc.newBlockingStub(channel);
        RenderServiceGrpc.RenderServiceBlockingStub blockingStub = RenderServiceGrpc.newBlockingStub(channel);
        try{
//            //create request
            ServerRequest.Builder requestBuilder = ServerRequest.newBuilder();
            requestBuilder.setDeviceId(appfileConfig.deviceId);
            requestBuilder.setUserid(1);

            //create start, end date
            String start = "2022-03-22 7:00:00";
            String end = "2022-03-22 11:00:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");

            long startTime = sdf.parse(start).getTime();
            long endTime = sdf.parse(end).getTime();

            requestBuilder.setTimeRequest(TimeRequest.newBuilder().setStart(startTime).setEnd(endTime).build());

//            open buffer writer
//            BufferedWriter writer = new BufferedWriter(new FileWriter("one_server_159.csv"));
//            writer.write("index,inferencetime\n");
//
//            for (int i=0;i<100;i++) {
//                //get start time
//                long start_infer = System.currentTimeMillis();

//                get reponse from server
                ServerResponse serverResponse = blockingStub.getHeatmap(requestBuilder.build());
//
////                get infer time
//                long infer = System.currentTimeMillis()-start_infer;
//                writer.write(i+","+infer+"\n");
//            }
//            writer.close();


////            convert byteString to heatmap
            byte[] bytes = serverResponse.getHeatmap().toByteArray();
            System.out.println(bytes.length);
//            System.out.println("Counting: " + serverResponse.getCounting());
            InputStream is = new ByteArrayInputStream(bytes);
            BufferedImage heatmap = ImageIO.read(is);
            //get Background

            ImageIO.write(heatmap,"png",new File("output.png"));
            System.out.println("HEY");





            //stream server
//            BufferedWriter writer = new BufferedWriter(new FileWriter("stream_server.csv"));
//            writer.write("index,inferencetime\n");
//
//            //create start time
//            HashMap<Integer, Long> start_infer_map = new HashMap<Integer, Long>();
//            //create stub
//            RenderServiceGrpc.RenderServiceStub asyncStub = RenderServiceGrpc.newStub(channel);
//            StreamObserver<ServerRequest> clientObserver = asyncStub
//                    .getHeatmapStream(new StreamObserver<ServerResponse>() {
//                        @Override
//                        public void onNext(ServerResponse value) {
//
//
//                            System.out.println("finish "+value.getUserid());
//
//                        }
//
//                        @Override
//                        public void onError(Throwable t) {
//                            t.printStackTrace();
//
//                        }
//
//                        @Override
//                        public void onCompleted() {
//                            System.out.println("get heatmap complete");
//
//                        }
//                    });
//        try{
//            for (int i=0;i<100;i++){
//
//                start_infer_map.put(i, System.currentTimeMillis());
//                ServerRequest serverRequest = ServerRequest.newBuilder()
//                        .setTimeRequest(TimeRequest.newBuilder().setStart(startTime).setEnd(endTime).build())
//                        .setDeviceId(appfileConfig.deviceId)
//                        .setWidth(appfileConfig.width)
//                        .setHeight(appfileConfig.height)
//                        .setUserid(i)
//                        .build();
//
//                clientObserver.onNext(serverRequest);
//                Thread.sleep(120);
//
//            }
//        }catch (Exception e){
//            System.out.println("Stream issue");
//            clientObserver.onError(e);
//        }
//
//        clientObserver.onCompleted();
//
//        writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

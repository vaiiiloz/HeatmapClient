package utils;


import Config.AppfileConfig;
import Config.SpringContext;
import org.apache.tools.ant.taskdefs.Java;
import org.bytedeco.ffmpeg.global.avcodec;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

import java.awt.image.BufferedImage;

import static org.bytedeco.ffmpeg.global.avutil.AV_PIX_FMT_BGR24;

public class Backgroundgrapper {
    private static FFmpegFrameGrabber streamGrabber;
    private static boolean isGPU = false;
    private static AppfileConfig appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);
    private static Java2DFrameConverter biConv = new Java2DFrameConverter();

    public static BufferedImage getBackground(){
        //start stream grabber
        initGrabber();
        try{
            streamGrabber.start();
            //return background if not null
            Frame frame;
            while ((frame=streamGrabber.grabImage())==null){
                System.out.println("wait");
            }
            return biConv.convert(frame);
        } catch (FFmpegFrameGrabber.Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private static void initGrabber(){
        if (streamGrabber!=null){
            try{
                streamGrabber.stop();
            } catch (FFmpegFrameGrabber.Exception e) {
                e.printStackTrace();
            }

        }
        streamGrabber = new FFmpegFrameGrabber(appfileConfig.rtsp);
        streamGrabber.setFormat("RTSP");
        if(isGPU){
            streamGrabber.setOption("hwaccel", "cuvid");
            streamGrabber.setVideoCodecName("h264_cuvid");
        }else{
            streamGrabber.setVideoCodec(avcodec.AV_CODEC_ID_H264);
        }

        streamGrabber.setOption("rtsp_transport", "tcp");
        streamGrabber.setOption("hwaccel", "nvdec");
        streamGrabber.setImageWidth(appfileConfig.width);
        streamGrabber.setImageHeight(appfileConfig.height);
        streamGrabber.setOption("tune", "zerolatency");
        streamGrabber.setOption("an", "");
        streamGrabber.setOption("sn", "");
        streamGrabber.setOption("dn", "");
        streamGrabber.setOption("fflags", "nobuffer");
        streamGrabber.setOption("flags", "low_delay");
        streamGrabber.setOption("framedrop", "");
        streamGrabber.setOption("avioflags", "direct");
        streamGrabber.setPixelFormat(AV_PIX_FMT_BGR24);// AV_PIX_FMT_RGBA);
        // set timeout
        streamGrabber.setOption("stimeout", "1000000");
    }
}

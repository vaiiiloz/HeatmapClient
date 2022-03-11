package Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("file:InferenceProp.properties")
@Component
@Qualifier("appfileConfig")
public class AppfileConfig {

    @Value("${controllerServicePort}")
    public int controllerServicePort;



    @Value("${host}")
    public String host;


    @Value("${model.type}")
    public String modelType;

    @Value("${deviceId}")
    public String deviceId;

    @Value("${rtsp}")
    public String rtsp;

    @Value("${width}")
    public int width;

    @Value("${height}")
    public int height;
}

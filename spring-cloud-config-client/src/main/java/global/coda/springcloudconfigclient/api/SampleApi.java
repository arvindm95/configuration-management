package global.coda.springcloudconfigclient.api;

import global.coda.springcloudconfigclient.models.ConfigModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SampleApi {

    @Autowired
    ConfigModel configModel;

    @GetMapping("/variable/all")
    public HashMap<String, String> getAllEnvVariable() {

        HashMap<String, String> map = new HashMap<>();
        map.put("hostName", this.configModel.getHostName());
        map.put("folderPath", this.configModel.getFolderPath());
        map.put("secretKey", this.configModel.getSecretKey());

        return map;
    }
}

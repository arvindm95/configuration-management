package global.coda.springcloudconfigclient.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class ConfigModel {

    @Value("${hostName: Error loading from aws s3...}")
    private String hostName;

    @Value("${secretKey: Error loading from vault...}")
    private String secretKey;

    @Value("${folderPath: Error loading from git file...}")
    private String folderPath;

    public String getHostName() {
        return hostName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getFolderPath() {
        return folderPath;
    }
}

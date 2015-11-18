package view;

import com.yammer.dropwizard.Service;

import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;


public class ViewService extends Service<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> bootstrap){
        bootstrap.addBundle(new ViewBundle());
        bootstrap.addBundle(new AssetsBundle("/assets/image","/image"));
        bootstrap.addBundle(new AssetsBundle("/assets/css","/css"));
        bootstrap.addBundle(new AssetsBundle("/assets/js","/js"));
    }

    @Override
    public void run(Configuration configuration, Environment environment){
        environment.addResource(ViewResource.class);
        environment.addResource(AboutResource.class);
    }

    public static void main(String[] args) throws Exception{
        new ViewService().run(args);
    }

}

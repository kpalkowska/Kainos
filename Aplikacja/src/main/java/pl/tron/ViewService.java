package pl.tron;


import com.yammer.dropwizard.Service;

import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;

import pl.tron.resource.AboutResource;
import pl.tron.resource.ViewResource;


public class ViewService extends Service<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> bootstrap){
        bootstrap.addBundle(new ViewBundle());
        bootstrap.addBundle(new AssetsBundle("/assets/image","/image"));
        bootstrap.addBundle(new AssetsBundle("/assets/css","/css"));
        bootstrap.addBundle(new AssetsBundle("/assets/js","/js"));
        bootstrap.addBundle(new AssetsBundle("/assets/dist","/dist"));
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

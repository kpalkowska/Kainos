package pl.tron.view;

import com.yammer.dropwizard.views.View;

import pl.tron.About;

public class AboutView extends View {
    final private About about;

    public AboutView(About about){
        super("about.ftl");
        this.about = about;
    }

    public About getAbout(){
        return about;
    }
}
package view;

import com.yammer.dropwizard.views.View;

public class AboutView extends View {
    final private About about;

    protected AboutView(About about){
        super("about.ftl");
        this.about = about;
    }

    public About getAbout(){
        return about;
    }
}
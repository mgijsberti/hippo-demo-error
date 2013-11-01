package org.onehippo.demo.error.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="hippodemoerror:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("hippodemoerror:title");
    }
    
    public String getSummary() {
        return getProperty("hippodemoerror:summary");
    }
    
    public Calendar getDate() {
        return getProperty("hippodemoerror:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("hippodemoerror:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("hippodemoerror:image", HippoGalleryImageSetBean.class);
    }


}

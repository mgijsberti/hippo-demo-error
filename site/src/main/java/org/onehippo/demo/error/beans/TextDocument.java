package org.onehippo.demo.error.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="hippodemoerror:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("hippodemoerror:title");
    }

    public String getSummary() {
        return getProperty("hippodemoerror:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("hippodemoerror:body");    
    }

}

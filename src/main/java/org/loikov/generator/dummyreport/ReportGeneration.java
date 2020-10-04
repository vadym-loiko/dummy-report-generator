package org.loikov.generator.dummyreport;

import java.io.Serializable;
import java.util.Map;

public class ReportGeneration implements Serializable {

    private String key;
    private String requesterName;
    private Map<String, String> props;

    public ReportGeneration() {
    }

    public ReportGeneration(String key, String requesterName) {
        this.key = key;
        this.requesterName = requesterName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public Map<String, String> getProps() {
        return props;
    }

    public void setProps(Map<String, String> props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "ReportGeneration{" +
                "key='" + key + '\'' +
                ", requesterName='" + requesterName + '\'' +
                ", props=" + props +
                '}';
    }
}

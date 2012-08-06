package au.id.wolfe.log4j.crashlog.data;

import java.io.Serializable;

/**
 *
 */
public class Notifier implements Serializable {

    String name;
    String version;

    public Notifier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

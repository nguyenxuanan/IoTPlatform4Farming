/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.tuwien.dsg.cloudlyra.entity.daf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jun
 */

@XmlRootElement(name = "dafDelegator")
@XmlAccessorType(XmlAccessType.FIELD)
public class DafDelegator {
    
    @XmlElement(name = "ip", required = true)
    String ip;
    
    @XmlElement(name = "port", required = true)
    String port;
    
    @XmlElement(name = "restapi", required = true)
    String restapi;

    public DafDelegator() {
    }

    public DafDelegator(String ip, String port, String restapi) {
        this.ip = ip;
        this.port = port;
        this.restapi = restapi;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getRestapi() {
        return restapi;
    }

    public void setRestapi(String restapi) {
        this.restapi = restapi;
    }
    
}

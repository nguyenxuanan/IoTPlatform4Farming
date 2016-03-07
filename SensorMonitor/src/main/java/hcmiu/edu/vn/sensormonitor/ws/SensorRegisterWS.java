/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcmiu.edu.vn.sensormonitor.ws;

/**
 *
 * @author Jun
 */



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

//http://localhost:8080/RESTfulExample/rest/message/hello%20world
@Path("/register")
public class SensorRegisterWS {

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{param}")
    public String printMessage(@PathParam("param") String msg) {
        
        String tempdir = System.getProperty("java.io.tmpdir");
        
        Logger.getLogger(SensorRegisterWS.class.getName()).log(Level.INFO, tempdir);
        String log = "DAF";
        Logger.getLogger(SensorRegisterWS.class.getName()).log(Level.INFO, log);
        
        
        
        
        return log;

    }
    
    @PUT
    @Path("/node")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public String registerNode(String nodeMetadataXML) {
        
        String udidStr = "";
        
        return udidStr;
      }


   

}

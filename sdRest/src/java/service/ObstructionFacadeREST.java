/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.obs.Obstruction;
import static java.lang.System.console;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Facundo
 */
@Stateless
@Path("entity.obs.obstruction")
public class ObstructionFacadeREST extends AbstractFacade<Obstruction> {
    @PersistenceContext(unitName = "sdRestPU")
    private EntityManager em;

    public ObstructionFacadeREST() {
        super(Obstruction.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Obstruction entity) {
        super.create(entity);
    }
 
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Obstruction entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    
    @GET
    @Path("location/{obstructionlocation}")
    @Produces ({"application/xml,application/json"})
    public List<Obstruction> findByLocation(
    @PathParam("obstructionlocation") String obstructionlocation
    ){
        return em.createNamedQuery("Obstruction.findByObstructionlocation",Obstruction.class)
                .setParameter("obstructionlocation",obstructionlocation)
                .getResultList();    
    }
    
    @GET
    @Path("description/{obstructiondescription}")
    @Produces ({"application/xml,application/json"})
    public List<Obstruction> findByDescription(
    @PathParam("obstructiondescription") String obstructiondescription
    ){
        return em.createNamedQuery("Obstruction.findByObstructiondescription",Obstruction.class)
                .setParameter("obstructiondescription",obstructiondescription)
                .getResultList();    
    }

    
    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Obstruction> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Obstruction> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public int countREST() {
        return super.count();
    }
   
    @GET
    @Path("upload")
    @Produces({"application/xml", "application/json"})
    public int upload() {
         return em.createNativeQuery("INSERT INTO Obstruction (idobstruction)VALUES(0)").executeUpdate();
    }
    
   @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

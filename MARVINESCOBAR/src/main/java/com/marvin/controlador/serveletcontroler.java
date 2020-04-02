package com.marvin.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marvin.model.Cliente;


/**
 * Servlet implementation class serveletcontroler
 */
public class serveletcontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletcontroler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("btn");
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("MARVINESCOBAR");
		em = emf.createEntityManager();
		
		
		Cliente cl = new Cliente();
		
		try {
		
		
		
		
		String id = request.getParameter("Id");
		String Nombrecl = request.getParameter("NCLIENTES");
		String Apellidocl = request.getParameter("ACLIENTES");
		String Edadcl = request.getParameter("ECLIENTES");
		String Direccioncl = request.getParameter("DCLIENTES");
		String Duicl = request.getParameter("ICLIENTES");
		String Nitcl = request.getParameter("TCLIENTES");
		String grupoDeClaseProgramacion3Alquepertenececl = request.getParameter("GCLIENTES");
		String utimaNotaObtenidaEnProgramacion2cl = request.getParameter("UCLIENTES");
	
		
		cl.setId(Integer.parseInt(id));
		cl.setNombre(Nombrecl);
		cl.setApellido(Apellidocl);
		cl.setEdad(Integer.parseInt(Edadcl));
		cl.setDireccion(Direccioncl);
		cl.setDui(Duicl);
		cl.setNit(Nitcl);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenececl));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(utimaNotaObtenidaEnProgramacion2cl));
		
		
		
		}catch(Exception e) {
			
		}
		
		if(action.equals("Eliminar")){
			
		
			em.getTransaction().begin();
			cl = em.getReference(Cliente.class, cl.getId());
			em.remove(cl);
			em.flush();
			em.getTransaction().commit();
			
			
		}else if(action.equals("agregar")) {
			
		
			
			em.getTransaction().begin();
			em.persist(cl);
			
			em.flush();
			em.getTransaction().commit();
			
		}else if(action.equals("actualizar")) {
			

			
			em.getTransaction().begin();
			
			em.merge(cl);
			
			em.flush();
			em.getTransaction().commit();
			
		}
		
		response.sendRedirect("index.jsp");
	}

}

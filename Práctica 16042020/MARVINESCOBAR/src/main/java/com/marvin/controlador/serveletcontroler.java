package com.marvin.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.marvin.DAO.ClienteDAO;
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
		Cliente cl = new Cliente();
		ClienteDAO cldao = new ClienteDAO();
		
		String id = null;
		String Nombrecl = null;
		String Apellidocl = null;
		String Edadcl = null;
		String Direccioncl= null;
		String Duicl= null;
		String Nitcl= null;
		String grupoDeClaseProgramacion3Alquepertenececl= null;
		String utimaNotaObtenidaEnProgramacion2cl= null;
		try {
			
			id = request.getParameter("Id");
			Nombrecl= request.getParameter("NCLIENTES");
			Apellidocl = request.getParameter("ACLIENTES");
			Edadcl = request.getParameter("ECLIENTES");
			Direccioncl = request.getParameter("DCLIENTES");
			Duicl = request.getParameter("ICLIENTES");
			Nitcl= request.getParameter("TCLIENTES");
			grupoDeClaseProgramacion3Alquepertenececl= request.getParameter("GCLIENTES");
			utimaNotaObtenidaEnProgramacion2cl = request.getParameter("UCLIENTES");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		cl.setId(Integer.parseInt(id));
		cl.setNombre(Nombrecl);
		cl.setApellido(Apellidocl);
		cl.setEdad(Integer.parseInt(Edadcl));
		cl.setDireccion(Direccioncl);
		cl.setDui(Duicl);
		cl.setNit(Nitcl);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenececl));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(utimaNotaObtenidaEnProgramacion2cl));
		String acction = request.getParameter("btn");
	
		if(acction.equals("GUARDAR")){
		cl.setId(Integer.parseInt(id));
		cl.setNombre(Nombrecl);
		cl.setApellido(Apellidocl);
		cl.setEdad(Integer.parseInt(Edadcl));
		cl.setDireccion(Direccioncl);
		cl.setDui(Duicl);
		cl.setNit(Nitcl);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenececl));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(utimaNotaObtenidaEnProgramacion2cl));
		
		cldao.AgregarDatos(cl);
		
		}else if(acction.equals("ACTUALIZAR")) {
		cl.setId(Integer.parseInt(id));
		cl.setNombre(Nombrecl);
		cl.setApellido(Apellidocl);
		cl.setEdad(Integer.parseInt(Edadcl));
		cl.setDireccion(Direccioncl);
		cl.setDui(Duicl);
		cl.setNit(Nitcl);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenececl));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(utimaNotaObtenidaEnProgramacion2cl));
		
		cldao.ActualizarDatos(cl);
		}else if(acction.equals("ELIMINAR")) {
			cl.setId(Integer.parseInt(id));
			cldao.EliminarDatos(cl);
		}
		
		
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteDAO cldao = new ClienteDAO();
		Gson json = new Gson();
		try {
			response.getWriter().append(json.toJson(cldao.ClientesLista()));
		} catch (Exception e) {
              System.out.println(e);
		}
		
	}

}

package borja.argibay.Accesoadatos;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class modificarMariadb {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//insertarInfoBBDD();
			//modificarInfoBBDD();
			// borrarInfoBBDD();
			consultarInfoBBDD();
			
	    }
		
		public static Connection getConexion() {
			Connection conexion = null;
	        try
	        {
	        	Class.forName("org.mariadb.jdbc.Driver");
	            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Add", "borja.argibay", "1234");
	            if (conexion != null)            
	                System.out.println("Connected");           
	            else          
	                System.out.println("Not Connected");         
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        return conexion;
			
		}	
	    public static void insertarInfoBBDD()
	    {
	    	
	    	//String Numerodepartamento = "50";
	    	//String NombreDepartamento = "Informatica ";
	    	String Numerodepartamento = "60";
	    	String NombreDepartamento = "Comunicaciones ";
	    	String Localidad = "Madrid";      
	        String emp_no = "8001";
	        String apellido = "Justo";
	        String oficio = "Prog.mp";     
	        String dir="7782";
	        String fecha_alt="2021-11-10";
	        String salario="1570";
	        String comision="null";
	        String dept_no="50";

	        try
	        {
	            Connection conexion =getConexion();
	            Statement stmt = conexion.createStatement();
	            //Creacion en tabla empleado
	            // String q1 = "insert into empleados values ( '" +emp_no+ "', '" +apellido+ "', '" +oficio+ "', '" +dir+ "','" +fecha_alt+ "','" +salario+ "','" +comision+ "','" +dept_no+ "')";
	           
	            //Creacion en tabla departamento Informatica
	            //String q1 = "insert into departamentos values ( '" +Numerodepartamento+ "', '" + NombreDepartamento+ "','" +Localidad+ "')";
	            
	            //Creacion en tabla departamento comunicacion
	            String q1 = "insert into departamentos values ( '" +Numerodepartamento+ "', '" + NombreDepartamento+ "', '" +Localidad+ "')";
	            
	            
	            
	            
	            int x = stmt.executeUpdate(q1);
	            if (x > 0)           
	                System.out.println("Successfully Inserted");           
	            else          
	                System.out.println("Insert Failed");            
	            conexion.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	    
	    public static void modificarInfoBBDD()
	    {
	    	String Numerodepartamento = "50";
	    	String NombreDepartamento = "TIC ";
	    	//String Numerodepartamento = "60";
	    	//String NombreDepartamento = "informatica y comunicaciones";
	    	String Localidad = "Madrid";      
	    	String emp_no = "7369";
	        String apellido = "";
	        String oficio = "";     
	        String dir="";
	        String fecha_alt="";
	        String salario="1105";
	        String comision="";
	        String dept_no="50";
	        try
	        {
	            Connection conexion =getConexion();
	            Statement stmt = conexion.createStatement();
	           
	            //Modificar NumeroEmpleado7369   de empleados
	            // String q1 = "UPDATE empleados set salario  = '" +salario +  "', dept_no ='" +dept_no+
	            //		"' WHERE emp_no = '" +emp_no+ "'";
	            
	            //Modificar dept-no 60  de departamentos
	            //String q1 = "UPDATE departamentos set dnombre  = '" +NombreDepartamento +  
	    	            		//"' WHERE dept_no = '" +Numerodepartamento+ "'";
	            //Modificar dept-no 50  de departamentos
	            
	            String q1 = "UPDATE departamentos set dnombre  = '" +NombreDepartamento +  
	            		"' WHERE dept_no = '" +Numerodepartamento+ "'";
	            int x = stmt.executeUpdate(q1);
	            if (x > 0)           
	                System.out.println("Successfully update");           
	            else          
	                System.out.println("Update Failed");            
	            conexion.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	 
	    
	    public static void borrarInfoBBDD()
	    {
	    	
	    	
	    	
	    	String emp_no = "7499";
	        String apellido = "";
	        String oficio = "";     
	        String dir="";
	        String fecha_alt="";
	        String salario="1105";
	        String comision="";
	        String dept_no="60";
	    	String Numerodepartamento = "60";
	    	String NombreDepartamento = "Informatica y comunicaciones";
	    	String Localidad = "Madrid";      
	        try
	        {
	            Connection conexion =getConexion();
	            Statement stmt = conexion.createStatement();
	            // Deleting from database
	            //Borrar Numero de empleado 7499 de tabla empleado
	            //String q1 = "DELETE from empleados WHERE emp_no= '" + emp_no+
	            		 //"'";
	            
	            //Borrar  dept-no 60 tabla departamento
	            String q1 = "DELETE from departamentos WHERE dept_no= '" + dept_no+
	            		 "'";
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            int x = stmt.executeUpdate(q1);
	            if (x > 0)           
	                System.out.println("Successfully delete");           
	            else          
	                System.out.println("Delete Failed");            
	            conexion.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	    
	    public static void consultarInfoBBDD()
	    {
	    	String emp_no = "7499";
	        String apellido = "";
	        String oficio = "";     
	        String dir="";
	        String fecha_alt="";
	        String salario="1105";
	        String comision="";
	        String dept_no="50";
	    	String Numerodepartamento = "50";
	    	String NombreDepartamento = "Informatica y comunicaciones";
	    	String Localidad = "Madrid";      
	        try
	        {
	            Connection conexion =getConexion();
	            Statement stmt = conexion.createStatement();
	       
	         //    Consulta departamento
	         //  String q1 = "select * from departamentos WHERE dept_no = '" + Numerodepartamento +
	          //          "'";
			//	ResultSet rs = stmt.executeQuery(q1);
			//	 if (rs.next())
	            //{
			//	       System.out.println("Numero de departamento: " + rs.getString(1));
			//	       System.out.println("Nombre de Departamento :" + rs.getString(2));
			//		System.out.println("Localidad :" + rs.getString(3));
			
			//
	            //
	            
	            //Consulta Empleados
	            String q1 = "select * from empleados WHERE apellido LIKE 'J%' AND sueldo >1500 = '" + apellido +
	      	                    "'";
	      				ResultSet rs = stmt.executeQuery(q1);
	      				 if (rs.next())
	      	            {
	      			       System.out.println("Numero de empleado: " + rs.getString(1));
	      			       System.out.println("Apellido :" + rs.getString(2));
	      				System.out.println("oficio:" + rs.getString(3));
	      				System.out.println("dir: " + rs.getString(4));
	      			       System.out.println("fecha alta :" + rs.getString(5));
	      				System.out.println("Salario :" + rs.getString(6));
	      				 System.out.println("comision: " + rs.getString(7));
	      			       System.out.println("numero de departamento :" + rs.getString(8));
	            
				    }
				else
				{
				 System.out.println("No such user id is already registered");
				}    
	            conexion.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	    
	}

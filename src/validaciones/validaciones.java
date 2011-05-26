package validaciones;

import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class validaciones
{

	public boolean validacionNumerica(String Cedula)
	{
		try
		{
			Integer.parseInt(Cedula);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}


	public boolean nombreAlfabetico(String strNombre)
		{
			int sw=0; //SIRVE PARA SABER SI ENCONTRO NUMERO O NO
			try
			{

				for (int i =0; i<strNombre.length();i++)
				{
					char c = strNombre.charAt(i);
					if (c =='1' || c =='2' || c =='3' || c =='4' || c =='5' || c =='6' || c =='7' || c =='8' || c =='9')
					{
						sw=1; //ENCONTRO NUMEROS
					}
				}
			}

			catch (Exception e)
			{

                             JOptionPane.showMessageDialog(null,e.toString(),"Error Mostrando las Constantes",JOptionPane.ERROR_MESSAGE);

			}
			if(sw==0)
				{
					return true;
				}
				else
				{
					return false;
				}

		}

		public boolean TipoSexo(String strSexo)
		{
			int sw=0;
			try
			{

				for (int i =0; i<strSexo.length();i++)
				{
					char c = strSexo.charAt(i);
					if (c =='F' || c =='M')
					{
						sw=1;

					}

				}

			}

			catch (Exception e)
			{
                             JOptionPane.showMessageDialog(null,e.toString(),"Error Mostrando las consonantes", JOptionPane.ERROR_MESSAGE);

			}
			if(sw==1)
				{
					return true;
				}
				else
				{
					return false;
				}

		}

		public boolean validacionEmail(String strEmail)
		{
			int sw=0;
			try
			{

				for (int i =0; i<strEmail.length();i++)
				{
					char c = strEmail.charAt(i);
					if (c =='@')
					{
						sw=1;

					}

				}

			}

			catch (Exception e)
			{
                             JOptionPane.showMessageDialog(null,e.toString(),"Error emostranto las consonates", JOptionPane.ERROR_MESSAGE);

			}
			if(sw==1)
				{
					return true;
				}
				else
				{
					return false;
				}

		}

		public boolean validacionCampo(String Campo)
		{
			int sw=0;
			try
			{
				if (Campo=="nombre" || Campo=="apellido1" || Campo=="apellido2" || Campo=="cedula" || Campo=="telefono" || Campo=="sexo" || Campo=="edad" || Campo=="proprofesional" || Campo=="email")
				{
					sw=1;

				}

			}

			catch (Exception e)
			{
                             JOptionPane.showMessageDialog(null,e.toString(),"Error mostrando las consonates", JOptionPane.ERROR_MESSAGE);

			if(sw==1)
				{
					return true;
				}
				else
				{
					return false;
				}

                    }
                         return true;
            }
                          
}

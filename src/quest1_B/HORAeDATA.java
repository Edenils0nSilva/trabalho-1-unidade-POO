package quest1_B;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

public class HORAeDATA {
	
public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat FORMAto = new SimpleDateFormat ("MM/dd/yyyy");

		String data_x;
		
		System.out.println(" ESCREVA UMA DATA NESSE FORMATO -> MES/DIA/ANO: ");
		Scanner entrada = new Scanner(System.in);
		data_x = entrada.next();
		Date data_y = FORMAto.parse(data_x);

		SimpleDateFormat conver = new SimpleDateFormat("\n MMMM/dd/yyyy");
		String Date = conver.format(data_y);

		System.out.println(Date);		

		}
	  }





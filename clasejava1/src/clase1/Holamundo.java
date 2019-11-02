package clase1;
/** 
 * documento de prueba javadocs, este encima de la clase
 * @author Ada Lovelace
 *
 */
public class Holamundo {
public static void main(String[] args) {
		Persona per = new Persona();
		per.setAltura(100);
		Persona per2 = new Persona();
		per2.setAltura(160);
		per.setNacionalidad("Argentina");
		per.setFuma(false);
		per.setFuma(true);
		Persona padre1 = new Persona();
		padre1.setNombre("Jose");
		per.setPadre(padre1);
		Persona madre1 = new Persona();
		madre1.setNombre("Juana");
		per.setMadre(madre1);
		
		System.out.println(per.getAltura());
		System.out.println(per2.getAltura());
		

		per2.setNacionalidad("Argentina");
		per2.setFuma(false);
		per2.setFuma(true);
		Persona padre2 = new Persona();
		per2.setPadre(padre2);
		per2.setNombre("julian");
		Persona madre2 = new Persona();
		per2.setNombre("Maria");
		per2.setMadre(madre2);
		
		System.out.println("per: " + per.getAltura() + "per2: " + per2.getAltura());
		System.out.println("per: nacionalidad: "+ per.getNacionalidad());
		System.out.println("per: fuma: " + per.isFuma());
		System.out.println("per padre:" + per.getPadre().getNombre());
		System.out.println("per madre:"+ per.getMadre().getNombre());
		System.out.println("per2: nacionalidad:" + per.getNacionalidad());
		System.out.println("per2: fuma:" + per2.isFuma());
		System.out.println("per2 padre2:" + per2.getPadre().getNombre());
		System.out.println("per2 madre2:" + per2.getMadre().getNombre());
		
		
	}}
	

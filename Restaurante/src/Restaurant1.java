import java.util.*;

public class Restaurant1 {

	public static void main(String[] args) {

		int billetete5 = 5, billete10 = 10, billete20 = 20, billete50 = 50, billete100 = 100, billete200 = 200, billete500 = 500; 
		int totalidad= 0;

		List<String> menu = new ArrayList<String>();
		menu.add("Pizza");
		menu.add("Lentejas");
		menu.add("Entrecot");
		menu.add("Ensalada");
		menu.add("Pescado");

		Integer[] precio = { 10, 6, 16, 5, 8 };
		
		List<String> comida = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		System.out.println("El menu del dia es: ");
		for (int i = 0; i <= menu.size() - 1; i++) {
			System.out.print(" · " + menu.get(i) + " - ");
			System.out.println(precio[i] + "€");
		}

		System.out.println("- - - - - - - - -");
		
		System.out.print("Introduzca su pedido: ");
		int extra = 1;
		while (extra == 1) {
			comida.add(teclado.next());
			System.out.println(comida);
			System.out.println("Quieres pedir mas cosas? 0~No -- 1~Si ");
			extra = teclado.nextInt();
		}

		for (int x = 0; x < comida.size(); x++) {
			if (menu.contains(comida.get(x))) {
				int position = menu.indexOf(comida.get(x));
				totalidad += precio[position];
			}
		}
		System.out.println("El plato vale " + totalidad + "€");
		
		for (int x = 0; x < comida.size(); x++) {
			int plate = menu.indexOf(comida.get(x));
			if (plate == -1) {
				System.out.println(comida.get(x) + " no se encuentra en el menu.");
			}
		}
		System.out.println("Has pedido esto del menu: " + comida); System.out.println("El precio total del menu son: " + totalidad + "€");
		
		}
		
	}

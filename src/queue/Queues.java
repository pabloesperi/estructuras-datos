package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
	
	public static void main(String[] args) {
		
		Queue <String> queue = new PriorityQueue<>();
				
		//Strings --> prioridad según orden alfabético
		
		queue.offer("Pablo");		
		queue.offer("Esperi");
		queue.offer("Luis");
		queue.offer("Salvatore");
		queue.offer("Aola");
		
		System.out.println("STRINGS");
		
		//Conocer el valor que está en el top
		System.out.println("Cabeza: " + queue.peek());
		
		System.out.println("-------------------------------");
		
		for (String string : queue) {
			System.out.println(string);
		}
		
		System.out.println("-------------------------------");
		
		while(!queue.isEmpty()) {
			//con poll() se elimina el valor a la cabeza y se retorna.
			System.out.println(queue.poll());
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("INTEGER");
		
		Queue <Integer> cola = new PriorityQueue<>();
		
		cola.offer(4);
		cola.offer(1);		
		cola.offer(2);
		cola.offer(3);
		cola.offer(5);
		
		//Conocer el valor que está en el top
		System.out.println("Cabeza: " + cola.peek());
				
		
		//Cuuando es un bucle for es distinto a como va saliendo la fila con un while.
		
		//Con el for no hay orden 
		
		for (Integer integer : cola) {
			System.out.println(integer);
		}
		
		//Con el while van saliendo en orden de menor a mayor.
		
		while(!cola.isEmpty()) {
			//con poll() se elimina el valor a la cabeza y se retorna.
			System.out.println(cola.poll());
		}
		
	}

}

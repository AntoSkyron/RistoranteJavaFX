

import java.util.LinkedList;


public class Buffer {

	private LinkedList<Ordinazione> coda;
	int capacita;

	public Buffer(int capacita)
	{
		coda = new LinkedList<>();
		this.capacita=capacita;
	}

	public synchronized boolean isEmpty()
	{
		return coda.isEmpty();
	}


	public synchronized boolean isFull(){
		return coda.size() >= capacita;
	}


	public synchronized void aggiungi(Ordinazione a)
	{
		while(isFull()){
			try{
			wait();
			}
			catch(InterruptedException ex){
				System.err.println("Interrupted Exception");
			}
		}

		coda.add(a);
		notifyAll();
	}

	public synchronized Ordinazione PreparaArriva(){

		while(isEmpty()){
			try{
				wait();
			}catch (InterruptedException ex){
				System.err.println("Interrupted Exception");
			}
		}

		notifyAll();
		return coda.removeFirst();
	}

	public LinkedList<Ordinazione> getCoda() {
		return coda;
	}

	public void setCoda(LinkedList<Ordinazione> coda) {
		this.coda = coda;
	}

}

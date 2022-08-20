package constructor_overloading;

public class Vegetable {
	String name;
	String color;
	double weight;
	Vegetable(String name,String color,double weight){
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	public Vegetable() {
		
	}
	public void Vegetabledisplay() {
		System.out.println("name is:"+name);
	    System.out.println("color is:"+color);
	    System.out.println("weight is:"+weight);
	    System.out.println("===========================");
	}
	public Vegetable(String name) {
		this.name=name;
	}
	public Vegetable(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
      public static void main(String[] args) {
		
    	  Vegetable v1=new Vegetable("tomato","pink",12.1);
    	  v1.Vegetabledisplay();
    	  Vegetable v2=new Vegetable();
    	  v2.Vegetabledisplay();
    	  Vegetable v3=new Vegetable("bringer");
    	  v3.Vegetabledisplay();
    	  Vegetable v4=new Vegetable("tomato","blue");
    	  v4.Vegetabledisplay();
	}
     

}

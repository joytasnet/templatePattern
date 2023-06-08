public abstract class Introduce{
	String name;
	public Introduce(String name){
		this.name=name;
	}
	public void execute(){
		System.out.printf("こんにちは%sです。",this.name);
		tokugi();
		System.out.println("よろしくお願いします");
	}
	public abstract void tokugi();
}

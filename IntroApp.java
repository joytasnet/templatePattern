public class IntroApp{
	public static void main(String[] args){
		Introduce[] data = 
		{
			new YamaguchiIntroduce("山口"),
			new TakusariIntroduce("田鎖"),
			new KobayashiIntroduce("小林"),
			new FukudaIntroduce("福田"),
			new MaeyamaIntroduce("前山"),
			new SasakiIntroduce("佐々木"),
			new HayamaIntroduce("葉山"),
			new OkudaIntroduce("奥田"),
			new NishinoharaIntroduce("西之原"),
			new KamiyamaIntroduce("神山")
		};
		for(Introduce i :data){
			i.execute();
		}
	}
}

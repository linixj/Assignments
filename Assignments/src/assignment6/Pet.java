package assignment6;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	public Pet(String name, String ownerName, String color){
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getColor() {
		return color;
	}
	public void setSex(int sexid) {
		if(sexid > 4 || sexid < 1){
			System.out.println("Error");
		}else
			sex = sexid;
	}
	public String getSex(){
		String sexString;
		
		switch(sex){
			case MALE:
				sexString = "MALE";
				break;
			case FEMALE:
				sexString = "FEMALE";
				break;
			case SPAYED:
				sexString = "SPAYED";
				break;
			case NEUTERED:
				sexString = "NEUTERED";
				break;
			default:
				sexString = "";
				break;
		}
		return sexString;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(petName + " owned by " + ownerName +"\n");
		sb.append("Color:" + color + "\n");
		sb.append("Sex:" + getSex() + "\n");
		return new String(sb);
	}
	
	public static void main(String[] args){
		Pet Spot = new Pet("Spot", "Mary", "Black and White");
		Spot.setSex(1);
		System.out.println(Spot);
	}
		   
}

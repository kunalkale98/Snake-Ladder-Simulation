class snakeLadderDiceUC2{
	public static void main(String[] args){
		int start_Position = 0;
		int dice = (int)Math.floor(((Math.random() * 10)%6)+1);
		System.out.println("Player is at position "+start_Position);
		System.out.println("number on die is "+dice);
	}
}

class snakeLadderMultiUC7{

	public static final int ladder = 1;
	public static final int snake = 2;

	public int chance(int position){
		int option = (int)Math.floor((Math.random() * 10)%3);
   	int dice = (int)Math.floor(((Math.random() * 10)%6)+1);
		switch (option){
			case ladder:
				position += dice;
				break;
			case snake:
				position -= dice;
				if(position < 0){
           		position = 0;
         	}
				break;
			default:
				position = position;
		}
		if(position > 100){
			position -= dice;
		}
		if(option == ladder){
			return chance(position);
		}
		else{
			return position;
		}
	}

 	public static void main(String[] args){
		int player1 = 0;
		int player2 = 0;
		snakeLadderMultiUC7 obj = new snakeLadderMultiUC7();
		while(player1 != 100 && player2 != 100){
			player1 = obj.chance(player1);
			System.out.println("Player1 is at position "+player1);
			player2 = obj.chance(player2);
			System.out.println("Player2 is at position "+player2);
		}
		if(player1 == 100){
			System.out.println("Player1 reached "+player1);
			System.out.println("Player1 Won");
		}
		else if(player2 == 100){
			System.out.println("Player2 reached "+player2);
         System.out.println("Player2 Won");
		}
	}

}

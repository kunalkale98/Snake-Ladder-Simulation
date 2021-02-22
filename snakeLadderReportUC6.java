class snakeLadderReportUC6{

	public static final int ladder = 1;
	public static final int snake = 2;

	public static void main(String[] args){

		int position = 0, dice_rolled = 0;
		System.out.println("Player is at position "+position);

		while(position != 100){

			int option = (int)Math.floor((Math.random() * 10)%3);
      	int dice = (int)Math.floor(((Math.random() * 10)%6)+1);
			dice_rolled++;
			switch (option){
				case ladder:
					System.out.println("number on die is "+dice);
					position += dice;
					if(position < 100){
						System.out.println("Its a ladder, Now the player is at position "+position);
					}
					break;

				case snake:
					System.out.println("number on die is "+dice);
					position -= dice;
					if(position < 0){
            		position = 0;
         		}
					System.out.println("Its a snake, Now the player is at position "+position);
					break;

				default:
					position = position;
					System.out.println("Its No Play, player is still at position "+position);
			}
			if(position > 100){
				position -= dice;
				System.out.println("Player is still at "+position);
				int need = 100 - position;
            System.out.println("Need a "+need+" to win");
			}

		}
		System.out.println("Player reached "+position);
		System.out.println("Player Won");
		System.out.println("The dice played was "+dice_rolled+" times");
	}
}

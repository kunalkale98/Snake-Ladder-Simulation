class snakeLadderWinUC4{

	public static final int ladder = 1;
	public static final int snake = 2;

	public static void main(String[] args){

		int position = 0;
		System.out.println("Player is at position "+position);

		while(position < 100){

			int option = (int)Math.floor((Math.random() * 10)%3);
      	int dice = (int)Math.floor(((Math.random() * 10)%6)+1);

			switch (option){
				case ladder:
					System.out.println("number on die is "+dice);
					position += dice;
					if(position >= 100){
            		System.out.println("Player Won");
         		}
					else{
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

		}
	}
}

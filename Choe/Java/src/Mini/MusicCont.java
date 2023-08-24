package Mini;
import java.util.Random;

public class MusicCont {
	private Music[] arr = new Music[30];
	
	
	
	public MusicCont() {
		
	}
	
	public Music[] add(String songName, String singer, String genre, String mood) {
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] != null) {
				continue;
			}else {
				this.arr[i] = new Music(songName, singer, genre, mood);
				break;
			}
		}
		return arr;
	}
	
	public void view() {
		System.out.println();
		System.out.println("번호\t\t제목\t\t가수\t\t장르\t\t분위기");
		System.out.println();

		for(int i = 0 ; i < arr.length ; i++) {
			if(this.arr[0] ==null) {
				System.out.print("등록된 노래가 없습니다.");
				break;
			}
			
			if(this.arr[i] == null) {
				System.out.print("더이상 등록된 노래가 없습니다.");
				break;
			}else {			
				System.out.println((i+1) +"\t\t"+ this.arr[i].toString());
				System.out.println();
				
			}
		}
	}
	
	public Music[] delete(String songName) {
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i].getSongName().equals(songName) ) {
				arr[i] = null;
				break;
			}
		}	
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null && arr[i+1] != null) {
				arr[i] = arr[i+1];
				arr[i+1] = null;

			}else if(arr[i] == null) {
				break;
			}
		}	
		return arr;
	}

	
	public void mood(int menuNum) {

			switch(menuNum) {
				case 1 : {
					System.out.println("\'이별\' 노래 입니다.");
					for(int i = 0 ; i < arr.length ; i ++) {
						if(arr[i] == null) {
							continue;
						}
						
						if("이별".equals(arr[i].getMood())){
							System.out.println(arr[i].getSongName());
						} 						
						
					}
					break;
				}
				case 2 : {
					System.out.println("\'사랑\' 노래 입니다.");
					for(int i = 0 ; i < arr.length ; i ++) {
						if(arr[i] == null) {
							continue;
						}
						
						if("사랑".equals(arr[i].getMood())){
							System.out.println(arr[i].getSongName());
						} 						
						
					}
					break;
				}
				case 3 : {
					System.out.println("\'신나는\' 노래 입니다.");
					for(int i = 0 ; i < arr.length ; i ++) {
						if(arr[i] == null) {
							continue;
						}
						
						if("신나는".equals(arr[i].getMood())){
							System.out.println(arr[i].getSongName());
						} 						
						
					}
					break;
				}
				case 4 : {
					System.out.println("\'슬픈\' 노래 입니다.");
					for(int i = 0 ; i < arr.length ; i ++) {
						if(arr[i] == null) {
							continue;
						}
						
						if("슬픈".equals(arr[i].getMood())){
							System.out.println(arr[i].getSongName());
						} 						
						
					}
					break;
				}
				case 5 : {
					System.out.println("\'클럽\' 노래 입니다.");
					for(int i = 0 ; i < arr.length ; i ++) {
						if(arr[i] == null) {
							continue;
						}
						
						if("클럽".equals(arr[i].getMood())){
							System.out.println(arr[i].getSongName());
						} 						
						
					}
					break;
				}
	
			}
		}
	
	public void playTotalSong() {
		
		System.out.println("전체노래 재생입니다.");
		for(int i = 0; i <= this.arr.length; i++) {
			if(arr[i] == null) {
				break;
			}else {
			System.out.println(arr[i]);
			}
		}
	}
	
	public void randomTotalSong() {
		System.out.println("랜덤노래 재생입니다.");
		
		Random r = new Random();
		int count=0;
		
		for(int i = 0 ; i < this.arr.length ; i++) {
			if(arr[i] != null) {
				count++;				
			}else {
				break;
			}
		}
		Music[] rarr = new Music[count];
		
		for(int i = 0; i < this.arr.length ; i++) {
			if(arr[i] != null) {
				rarr[i] = arr[i];
			}else
				break;
		}
		
		for(int i =0 ; i < rarr.length ; i++) {
			for(int j =0; j < i ; j++) {
				if(rarr[i] == rarr[j]) {
					i--;
				}
			}
		}
		for(int i = 0 ; i < count; i++) {
			System.out.println(rarr[r.nextInt(count)].getSongName());
		}

	
	}
	
	
}



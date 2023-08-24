package Mini;
import java.util.Scanner;
import java.util.ArrayList;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	MusicCont mc = new MusicCont();
	
	
	
	public MainMenu() {
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.println("안녕하세요 " +name +"님! 아래 메뉴에서 하나를 선택해 번호를 입력해 주세요!!");
		while(true) {
			System.out.println("");
			System.out.println("==========================");
			System.out.println("1. 음악 재생");
			System.out.println("2. 음악 추가");
			System.out.println("3. 음악 목록");
			System.out.println("4. 음악 삭제");
			System.out.println("5. 음악 분류");
			System.out.println("==========================");
			System.out.println("원하는 메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
				case 1 :{
					playMusic();
				}break;
				case 2 :{
					insertMusic();
				}break;
				case 3 :{
					printMusic();
				}break;
				case 4 :{
					deleteMusic();
		
				}break;
				case 5 :{
					sortMusic();
				}break;
				default :{
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
				}
			}
				
		}
	}
		
		public void playMusic() {
			System.out.println("노래 재생입니다!!");
			System.out.println("==========================");
			System.out.println("1. 전체 재생");
			System.out.println("2. 랜덤 재생");
			System.out.println("3. 분위기 별 재생");
			System.out.println("==========================");
			System.out.println("원하시는 재생 목록의 번호를 선택해주세요 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
				case 1 : {
					//전체 재생으로 이동
					mc.playTotalSong();
				}break;
				case 2 : {
					// 랜덤 재생으로 이동
					
				}
				case 3 : {
					//분위기 별 이동
					
				}
			
				
			}
			
			
			
			
		}
		public void insertMusic() {
			System.out.println("노래 이름 : ");
			String songName = sc.next();
			System.out.println("가수 이름 : ");
			String singer = sc.next();
			System.out.println("장르 : ");
			String genre = sc.next();
			System.out.println("분위기 : ");
			String mood = sc.next();		
			mc.add(songName, singer, genre, mood);	
		}
		
		public void printMusic() {
			mc.view();
		}
		
		public void deleteMusic() {
			System.out.println("삭제할 노래 제목을 입력해주세요. : ");
			String songName = sc.next();
			System.out.println("\'"+songName +"\' 노래가 삭제되었습니다.");
			mc.delete(songName);	
			
		}
		
		public void sortMusic() {
			System.out.println("듣고싶은 분위기의 노래를 선택해주세요.");
			System.out.println("==========================");
			System.out.println("1. 이별");
			System.out.println("2. 사랑");
			System.out.println("3. 신나는");
			System.out.println("4. 슬픈");
			System.out.println("5. 클럽");
			System.out.println("==========================");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			mc.mood(menuNum);
			
			
		}
			
				
}



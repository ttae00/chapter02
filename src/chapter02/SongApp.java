package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song= new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setTrack(3);
		song.setComposer("이민수");
		song.setYear(2010);
		
		song.show();
		
		Song song2= new Song("에일리","첫눈처럼 너에게 가겠다","","",0,2017);
		song2.show();

		Song song3= new Song("크러쉬","beautiful");
		song3.show();
	}

}

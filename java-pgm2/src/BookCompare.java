import java.util.Comparator;

class BookCompare implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return (int) (o1.price - o2.price);
	}

}
import javax.swing.*;

public class first extends JFrame {
	first() {
		setTitle("객체지향프로그래밍 1차 과제");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}

	public static void main(String[] args) {
		first frame = new first();
	}
}

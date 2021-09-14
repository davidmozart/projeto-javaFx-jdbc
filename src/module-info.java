module projetoJavaFxJdbc {
	requires javafx.controls;
	
	/*
	 * exports gui; opens gui to javafx.fxml;
	 */
	
	opens application to javafx.graphics, javafx.fxml;
}

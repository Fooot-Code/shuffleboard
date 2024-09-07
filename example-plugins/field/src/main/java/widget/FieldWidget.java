import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;

@Description(name = "MyPoint2D", dataTypes=FieldData.class)
@ParametrizedController("FieldWidgetXML.fxml")
public class FieldWidget extends SimpleAnnotatedWidget<FieldData> {
    @FXML
    private Pane root;

    @FXML
    private Lable lable;
}

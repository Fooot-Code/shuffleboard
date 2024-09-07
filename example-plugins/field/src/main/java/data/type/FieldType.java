import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import field.src.main.java.data.FieldData.java;

import java.util.Map;
import java.util.function.Function;

public final class FieldType extends ComplexDataType<FieldData> {
  public static final FieldType Instance = new FieldType();

  private FieldType() {
    super("Field2d", FieldData.class);
  }

  @Override
  public Function<Map<String, Object>, FieldData> fromMap() {
    return FieldData::new;
  }

  @Override
  public FieldData getDefaultValue() {
    return new FieldData(new FieldData.SimplePose2d(0, 0, 0), Map.of());
  }
}
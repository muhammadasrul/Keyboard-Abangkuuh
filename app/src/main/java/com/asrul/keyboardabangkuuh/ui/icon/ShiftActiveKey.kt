import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(ShiftActiveKey, null)
}

private var _ShiftActiveKey: ImageVector? = null

public val ShiftActiveKey: ImageVector
    get() {
        if (_ShiftActiveKey != null) {
            return _ShiftActiveKey!!
        }
        _ShiftActiveKey = ImageVector.Builder(
            name = "Eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(19.5f, 15f)
                horizontalLineTo(4.5f)
                curveTo(4.1022f, 15f, 3.7206f, 15.158f, 3.4393f, 15.4393f)
                curveTo(3.158f, 15.7206f, 3f, 16.1022f, 3f, 16.5f)
                verticalLineTo(18.75f)
                curveTo(3f, 19.1478f, 3.158f, 19.5294f, 3.4393f, 19.8107f)
                curveTo(3.7206f, 20.092f, 4.1022f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(19.8978f, 20.25f, 20.2794f, 20.092f, 20.5607f, 19.8107f)
                curveTo(20.842f, 19.5294f, 21f, 19.1478f, 21f, 18.75f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.1022f, 20.842f, 15.7206f, 20.5607f, 15.4393f)
                curveTo(20.2794f, 15.158f, 19.8978f, 15f, 19.5f, 15f)
                close()
                moveTo(19.5f, 18.75f)
                horizontalLineTo(4.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.75f)
                close()
                moveTo(4.5225f, 13.5f)
                horizontalLineTo(19.4775f)
                curveTo(19.7748f, 13.5014f, 20.066f, 13.4155f, 20.3148f, 13.2528f)
                curveTo(20.5637f, 13.0901f, 20.7592f, 12.8579f, 20.8772f, 12.585f)
                curveTo(20.9937f, 12.3189f, 21.0284f, 12.0241f, 20.9766f, 11.7382f)
                curveTo(20.9248f, 11.4523f, 20.789f, 11.1883f, 20.5866f, 10.98f)
                lineTo(13.6744f, 3.71344f)
                curveTo(13.4578f, 3.4878f, 13.1978f, 3.3083f, 12.91f, 3.1857f)
                curveTo(12.6223f, 3.0631f, 12.3128f, 2.9999f, 12f, 2.9999f)
                curveTo(11.6872f, 2.9999f, 11.3777f, 3.0631f, 11.09f, 3.1857f)
                curveTo(10.8022f, 3.3083f, 10.5422f, 3.4878f, 10.3256f, 3.7134f)
                lineTo(3.41344f, 10.98f)
                curveTo(3.211f, 11.1883f, 3.0752f, 11.4523f, 3.0234f, 11.7382f)
                curveTo(2.9716f, 12.0241f, 3.0063f, 12.3189f, 3.1228f, 12.585f)
                curveTo(3.2408f, 12.8579f, 3.4363f, 13.0901f, 3.6852f, 13.2528f)
                curveTo(3.934f, 13.4155f, 4.2252f, 13.5014f, 4.5225f, 13.5f)
                close()
                moveTo(11.4122f, 4.7475f)
                curveTo(11.4888f, 4.6692f, 11.5802f, 4.607f, 11.6811f, 4.5645f)
                curveTo(11.7821f, 4.5221f, 11.8905f, 4.5002f, 12f, 4.5002f)
                curveTo(12.1095f, 4.5002f, 12.2179f, 4.5221f, 12.3189f, 4.5645f)
                curveTo(12.4198f, 4.607f, 12.5112f, 4.6692f, 12.5878f, 4.7475f)
                lineTo(19.4859f, 12f)
                horizontalLineTo(4.51312f)
                lineTo(11.4122f, 4.7475f)
                close()
            }
        }.build()
        return _ShiftActiveKey!!
    }


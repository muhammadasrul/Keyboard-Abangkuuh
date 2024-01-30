import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(BackspaceKey, null)
}

private var _BackspaceKey: ImageVector? = null

public val BackspaceKey: ImageVector
    get() {
        if (_BackspaceKey != null) {
            return _BackspaceKey!!
        }
        _BackspaceKey = ImageVector.Builder(
            name = "Backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF333333)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.25f, 3.75f)
                horizontalLineTo(6.42468f)
                curveTo(6.1658f, 3.7508f, 5.9114f, 3.8182f, 5.6861f, 3.9457f)
                curveTo(5.4608f, 4.0733f, 5.2722f, 4.2568f, 5.1384f, 4.4784f)
                lineTo(0.856863f, 11.6137f)
                curveTo(0.7868f, 11.7304f, 0.7498f, 11.8639f, 0.7498f, 12f)
                curveTo(0.7498f, 12.1361f, 0.7868f, 12.2696f, 0.8569f, 12.3862f)
                lineTo(5.13843f, 19.5216f)
                curveTo(5.2722f, 19.7432f, 5.4608f, 19.9267f, 5.6861f, 20.0543f)
                curveTo(5.9114f, 20.1818f, 6.1658f, 20.2493f, 6.4247f, 20.25f)
                horizontalLineTo(20.25f)
                curveTo(20.6478f, 20.25f, 21.0293f, 20.092f, 21.3106f, 19.8107f)
                curveTo(21.592f, 19.5294f, 21.75f, 19.1478f, 21.75f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(21.75f, 4.8522f, 21.592f, 4.4706f, 21.3106f, 4.1893f)
                curveTo(21.0293f, 3.908f, 20.6478f, 3.75f, 20.25f, 3.75f)
                close()
                moveTo(20.25f, 18.75f)
                horizontalLineTo(6.42468f)
                lineTo(2.37468f, 12f)
                lineTo(6.42468f, 5.25f)
                horizontalLineTo(20.25f)
                verticalLineTo(18.75f)
                close()
                moveTo(9.96936f, 13.7194f)
                lineTo(11.6897f, 12f)
                lineTo(9.96936f, 10.2806f)
                curveTo(9.8286f, 10.1399f, 9.7496f, 9.949f, 9.7496f, 9.75f)
                curveTo(9.7496f, 9.551f, 9.8286f, 9.3601f, 9.9694f, 9.2194f)
                curveTo(10.1101f, 9.0786f, 10.301f, 8.9996f, 10.5f, 8.9996f)
                curveTo(10.699f, 8.9996f, 10.8899f, 9.0786f, 11.0306f, 9.2194f)
                lineTo(12.75f, 10.9397f)
                lineTo(14.4694f, 9.21937f)
                curveTo(14.539f, 9.1497f, 14.6218f, 9.0944f, 14.7128f, 9.0567f)
                curveTo(14.8039f, 9.019f, 14.9014f, 8.9996f, 15f, 8.9996f)
                curveTo(15.0985f, 8.9996f, 15.1961f, 9.019f, 15.2872f, 9.0567f)
                curveTo(15.3782f, 9.0944f, 15.4609f, 9.1497f, 15.5306f, 9.2194f)
                curveTo(15.6003f, 9.2891f, 15.6556f, 9.3718f, 15.6933f, 9.4628f)
                curveTo(15.731f, 9.5539f, 15.7504f, 9.6515f, 15.7504f, 9.75f)
                curveTo(15.7504f, 9.8485f, 15.731f, 9.9461f, 15.6933f, 10.0372f)
                curveTo(15.6556f, 10.1282f, 15.6003f, 10.2109f, 15.5306f, 10.2806f)
                lineTo(13.8103f, 12f)
                lineTo(15.5306f, 13.7194f)
                curveTo(15.6003f, 13.7891f, 15.6556f, 13.8718f, 15.6933f, 13.9628f)
                curveTo(15.731f, 14.0539f, 15.7504f, 14.1515f, 15.7504f, 14.25f)
                curveTo(15.7504f, 14.3485f, 15.731f, 14.4461f, 15.6933f, 14.5372f)
                curveTo(15.6556f, 14.6282f, 15.6003f, 14.7109f, 15.5306f, 14.7806f)
                curveTo(15.4609f, 14.8503f, 15.3782f, 14.9056f, 15.2872f, 14.9433f)
                curveTo(15.1961f, 14.981f, 15.0985f, 15.0004f, 15f, 15.0004f)
                curveTo(14.9014f, 15.0004f, 14.8039f, 14.981f, 14.7128f, 14.9433f)
                curveTo(14.6218f, 14.9056f, 14.539f, 14.8503f, 14.4694f, 14.7806f)
                lineTo(12.75f, 13.0603f)
                lineTo(11.0306f, 14.7806f)
                curveTo(10.9609f, 14.8503f, 10.8782f, 14.9056f, 10.7872f, 14.9433f)
                curveTo(10.6961f, 14.981f, 10.5985f, 15.0004f, 10.5f, 15.0004f)
                curveTo(10.4014f, 15.0004f, 10.3039f, 14.981f, 10.2128f, 14.9433f)
                curveTo(10.1218f, 14.9056f, 10.039f, 14.8503f, 9.9694f, 14.7806f)
                curveTo(9.8997f, 14.7109f, 9.8444f, 14.6282f, 9.8067f, 14.5372f)
                curveTo(9.769f, 14.4461f, 9.7496f, 14.3485f, 9.7496f, 14.25f)
                curveTo(9.7496f, 14.1515f, 9.769f, 14.0539f, 9.8067f, 13.9628f)
                curveTo(9.8444f, 13.8718f, 9.8997f, 13.7891f, 9.9694f, 13.7194f)
                close()
            }
        }.build()
        return _BackspaceKey!!
    }


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
    Image(SendKey, null)
}

private var _SendKey: ImageVector? = null

public val SendKey: ImageVector
    get() {
        if (_SendKey != null) {
            return _SendKey!!
        }
        _SendKey = ImageVector.Builder(
            name = "Paperplaneright",
            defaultWidth = 25.dp,
            defaultHeight = 25.dp,
            viewportWidth = 25f,
            viewportHeight = 25f
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
                moveTo(21.7121f, 11.1972f)
                lineTo(5.96207f, 2.20755f)
                curveTo(5.6966f, 2.0586f, 5.3921f, 1.994f, 5.089f, 2.0223f)
                curveTo(4.7859f, 2.0505f, 4.4986f, 2.1703f, 4.2652f, 2.3657f)
                curveTo(4.0318f, 2.5612f, 3.8634f, 2.823f, 3.7824f, 3.1164f)
                curveTo(3.7013f, 3.4098f, 3.7115f, 3.721f, 3.8114f, 4.0085f)
                lineTo(6.71769f, 12.4901f)
                curveTo(6.7173f, 12.4932f, 6.7173f, 12.4963f, 6.7177f, 12.4994f)
                curveTo(6.7172f, 12.5025f, 6.7172f, 12.5057f, 6.7177f, 12.5088f)
                lineTo(3.81144f, 21.0091f)
                curveTo(3.7314f, 21.2353f, 3.7067f, 21.4774f, 3.7395f, 21.715f)
                curveTo(3.7724f, 21.9527f, 3.8618f, 22.179f, 4.0002f, 22.375f)
                curveTo(4.1386f, 22.571f, 4.322f, 22.7309f, 4.535f, 22.8414f)
                curveTo(4.748f, 22.9518f, 4.9843f, 23.0096f, 5.2242f, 23.0097f)
                curveTo(5.4846f, 23.0091f, 5.7403f, 22.9413f, 5.9668f, 22.8129f)
                lineTo(21.7083f, 13.8082f)
                curveTo(21.9405f, 13.6781f, 22.1339f, 13.4886f, 22.2687f, 13.2591f)
                curveTo(22.4035f, 13.0296f, 22.4748f, 12.7684f, 22.4752f, 12.5022f)
                curveTo(22.4757f, 12.2361f, 22.4054f, 11.9746f, 22.2714f, 11.7446f)
                curveTo(22.1375f, 11.5146f, 21.9447f, 11.3244f, 21.713f, 11.1935f)
                lineTo(21.7121f, 11.1972f)
                close()
                moveTo(5.22425f, 21.5097f)
                verticalLineTo(21.5013f)
                lineTo(8.04988f, 13.2597f)
                horizontalLineTo(13.4743f)
                curveTo(13.6732f, 13.2597f, 13.8639f, 13.1807f, 14.0046f, 13.0401f)
                curveTo(14.1452f, 12.8994f, 14.2243f, 12.7087f, 14.2243f, 12.5097f)
                curveTo(14.2243f, 12.3108f, 14.1452f, 12.1201f, 14.0046f, 11.9794f)
                curveTo(13.8639f, 11.8388f, 13.6732f, 11.7597f, 13.4743f, 11.7597f)
                horizontalLineTo(8.05738f)
                lineTo(5.22988f, 3.52099f)
                lineTo(5.22425f, 3.50974f)
                lineTo(20.9743f, 12.4938f)
                lineTo(5.22425f, 21.5097f)
                close()
            }
        }.build()
        return _SendKey!!
    }


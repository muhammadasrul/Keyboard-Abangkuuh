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
    Image(EnterKey, null)
}

private var _EnterKey: ImageVector? = null

public val EnterKey: ImageVector
    get() {
        if (_EnterKey != null) {
            return _EnterKey!!
        }
        _EnterKey = ImageVector.Builder(
            name = "Arrowbenddownleft",
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
                moveTo(21.75f, 5.25f)
                curveTo(21.7472f, 7.835f, 20.7191f, 10.3134f, 18.8913f, 12.1413f)
                curveTo(17.0634f, 13.9692f, 14.585f, 14.9973f, 12f, 15f)
                horizontalLineTo(4.81029f)
                lineTo(8.03061f, 18.2194f)
                curveTo(8.1713f, 18.3601f, 8.2504f, 18.551f, 8.2504f, 18.75f)
                curveTo(8.2504f, 18.949f, 8.1713f, 19.1399f, 8.0306f, 19.2806f)
                curveTo(7.8899f, 19.4214f, 7.699f, 19.5004f, 7.5f, 19.5004f)
                curveTo(7.301f, 19.5004f, 7.1101f, 19.4214f, 6.9694f, 19.2806f)
                lineTo(2.46935f, 14.7806f)
                curveTo(2.3996f, 14.711f, 2.3443f, 14.6283f, 2.3066f, 14.5372f)
                curveTo(2.2688f, 14.4462f, 2.2494f, 14.3486f, 2.2494f, 14.25f)
                curveTo(2.2494f, 14.1514f, 2.2688f, 14.0538f, 2.3066f, 13.9628f)
                curveTo(2.3443f, 13.8717f, 2.3996f, 13.789f, 2.4693f, 13.7194f)
                lineTo(6.96935f, 9.21937f)
                curveTo(7.1101f, 9.0786f, 7.301f, 8.9996f, 7.5f, 8.9996f)
                curveTo(7.699f, 8.9996f, 7.8899f, 9.0786f, 8.0306f, 9.2194f)
                curveTo(8.1713f, 9.3601f, 8.2504f, 9.551f, 8.2504f, 9.75f)
                curveTo(8.2504f, 9.949f, 8.1713f, 10.1399f, 8.0306f, 10.2806f)
                lineTo(4.81029f, 13.5f)
                horizontalLineTo(12f)
                curveTo(14.1873f, 13.4975f, 16.2842f, 12.6275f, 17.8309f, 11.0809f)
                curveTo(19.3775f, 9.5343f, 20.2475f, 7.4373f, 20.25f, 5.25f)
                curveTo(20.25f, 5.0511f, 20.329f, 4.8603f, 20.4696f, 4.7197f)
                curveTo(20.6103f, 4.579f, 20.8011f, 4.5f, 21f, 4.5f)
                curveTo(21.1989f, 4.5f, 21.3897f, 4.579f, 21.5303f, 4.7197f)
                curveTo(21.671f, 4.8603f, 21.75f, 5.0511f, 21.75f, 5.25f)
                close()
            }
        }.build()
        return _EnterKey!!
    }


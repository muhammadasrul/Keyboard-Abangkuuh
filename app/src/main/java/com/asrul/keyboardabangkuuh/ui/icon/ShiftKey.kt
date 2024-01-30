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
    Image(ShiftKey, null)
}

private var _ShiftKey: ImageVector? = null

public val ShiftKey: ImageVector
    get() {
        if (_ShiftKey != null) {
            return _ShiftKey!!
        }
        _ShiftKey = ImageVector.Builder(
            name = "Ejectsimple",
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
                moveTo(21.75f, 19.5f)
                curveTo(21.75f, 19.6989f, 21.671f, 19.8897f, 21.5303f, 20.0303f)
                curveTo(21.3897f, 20.171f, 21.1989f, 20.25f, 21f, 20.25f)
                horizontalLineTo(3.00001f)
                curveTo(2.8011f, 20.25f, 2.6103f, 20.171f, 2.4697f, 20.0303f)
                curveTo(2.329f, 19.8897f, 2.25f, 19.6989f, 2.25f, 19.5f)
                curveTo(2.25f, 19.3011f, 2.329f, 19.1103f, 2.4697f, 18.9697f)
                curveTo(2.6103f, 18.829f, 2.8011f, 18.75f, 3f, 18.75f)
                horizontalLineTo(21f)
                curveTo(21.1989f, 18.75f, 21.3897f, 18.829f, 21.5303f, 18.9697f)
                curveTo(21.671f, 19.1103f, 21.75f, 19.3011f, 21.75f, 19.5f)
                close()
                moveTo(2.39907f, 14.8913f)
                curveTo(2.2748f, 14.6343f, 2.2265f, 14.3473f, 2.2597f, 14.0638f)
                curveTo(2.2929f, 13.7803f, 2.4063f, 13.5122f, 2.5866f, 13.291f)
                lineTo(10.2431f, 3.83814f)
                curveTo(10.455f, 3.5764f, 10.7227f, 3.3653f, 11.0267f, 3.2202f)
                curveTo(11.3307f, 3.0752f, 11.6632f, 2.9999f, 12f, 2.9999f)
                curveTo(12.3368f, 2.9999f, 12.6693f, 3.0752f, 12.9733f, 3.2202f)
                curveTo(13.2773f, 3.3653f, 13.545f, 3.5764f, 13.7569f, 3.8381f)
                lineTo(21.4116f, 13.291f)
                curveTo(21.5908f, 13.5123f, 21.7037f, 13.7798f, 21.7373f, 14.0626f)
                curveTo(21.7708f, 14.3454f, 21.7237f, 14.632f, 21.6014f, 14.8891f)
                curveTo(21.479f, 15.1463f, 21.2864f, 15.3636f, 21.0458f, 15.5159f)
                curveTo(20.8052f, 15.6683f, 20.5264f, 15.7494f, 20.2416f, 15.75f)
                horizontalLineTo(3.75844f)
                curveTo(3.4737f, 15.7507f, 3.1947f, 15.6702f, 2.954f, 15.5182f)
                curveTo(2.7132f, 15.3661f, 2.5208f, 15.1487f, 2.3991f, 14.8913f)
                close()
                moveTo(3.75001f, 14.2416f)
                curveTo(3.75f, 14.2416f, 3.75f, 14.25f, 3.7575f, 14.2519f)
                horizontalLineTo(20.2416f)
                curveTo(20.2416f, 14.2519f, 20.2491f, 14.2435f, 20.2491f, 14.2397f)
                lineTo(12.5906f, 4.78126f)
                curveTo(12.5194f, 4.6932f, 12.4295f, 4.6221f, 12.3273f, 4.5733f)
                curveTo(12.2251f, 4.5245f, 12.1133f, 4.4992f, 12f, 4.4992f)
                curveTo(11.8868f, 4.4992f, 11.7749f, 4.5245f, 11.6727f, 4.5733f)
                curveTo(11.5705f, 4.6221f, 11.4806f, 4.6932f, 11.4094f, 4.7813f)
                lineTo(3.75001f, 14.235f)
                curveTo(3.7497f, 14.2372f, 3.7497f, 14.2394f, 3.75f, 14.2416f)
                close()
            }
        }.build()
        return _ShiftKey!!
    }


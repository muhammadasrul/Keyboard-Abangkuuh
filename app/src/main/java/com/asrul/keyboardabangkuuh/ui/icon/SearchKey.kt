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
    Image(SearchKey, null)
}

private var _SearchKey: ImageVector? = null

public val SearchKey: ImageVector
    get() {
        if (_SearchKey != null) {
            return _SearchKey!!
        }
        _SearchKey = ImageVector.Builder(
            name = "Magnifyingglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21.5306f, 20.4694f)
                lineTo(16.8365f, 15.7763f)
                curveTo(18.1971f, 14.1429f, 18.8755f, 12.0478f, 18.7307f, 9.9269f)
                curveTo(18.5859f, 7.8061f, 17.629f, 5.8227f, 16.0591f, 4.3894f)
                curveTo(14.4892f, 2.956f, 12.4271f, 2.1831f, 10.3019f, 2.2314f)
                curveTo(8.1766f, 2.2797f, 6.1518f, 3.1455f, 4.6486f, 4.6487f)
                curveTo(3.1455f, 6.1518f, 2.2797f, 8.1767f, 2.2314f, 10.3019f)
                curveTo(2.1831f, 12.4272f, 2.956f, 14.4892f, 4.3893f, 16.0591f)
                curveTo(5.8227f, 17.629f, 7.806f, 18.5859f, 9.9269f, 18.7307f)
                curveTo(12.0478f, 18.8755f, 14.1428f, 18.1971f, 15.7762f, 16.8366f)
                lineTo(20.4693f, 21.5306f)
                curveTo(20.539f, 21.6003f, 20.6218f, 21.6556f, 20.7128f, 21.6933f)
                curveTo(20.8038f, 21.731f, 20.9014f, 21.7504f, 21f, 21.7504f)
                curveTo(21.0985f, 21.7504f, 21.1961f, 21.731f, 21.2871f, 21.6933f)
                curveTo(21.3782f, 21.6556f, 21.4609f, 21.6003f, 21.5306f, 21.5306f)
                curveTo(21.6003f, 21.4609f, 21.6556f, 21.3782f, 21.6933f, 21.2872f)
                curveTo(21.731f, 21.1961f, 21.7504f, 21.0985f, 21.7504f, 21f)
                curveTo(21.7504f, 20.9015f, 21.731f, 20.8039f, 21.6933f, 20.7128f)
                curveTo(21.6556f, 20.6218f, 21.6003f, 20.5391f, 21.5306f, 20.4694f)
                close()
                moveTo(3.74997f, 10.5f)
                curveTo(3.75f, 9.165f, 4.1459f, 7.8599f, 4.8876f, 6.7499f)
                curveTo(5.6292f, 5.6399f, 6.6835f, 4.7747f, 7.9169f, 4.2638f)
                curveTo(9.1503f, 3.7529f, 10.5075f, 3.6193f, 11.8168f, 3.8797f)
                curveTo(13.1262f, 4.1402f, 14.3289f, 4.783f, 15.2729f, 5.727f)
                curveTo(16.2169f, 6.671f, 16.8598f, 7.8738f, 17.1203f, 9.1831f)
                curveTo(17.3807f, 10.4925f, 17.2471f, 11.8497f, 16.7362f, 13.0831f)
                curveTo(16.2253f, 14.3165f, 15.3601f, 15.3707f, 14.2501f, 16.1124f)
                curveTo(13.14f, 16.8541f, 11.835f, 17.25f, 10.5f, 17.25f)
                curveTo(8.7104f, 17.248f, 6.9946f, 16.5362f, 5.7292f, 15.2708f)
                curveTo(4.4638f, 14.0053f, 3.7519f, 12.2896f, 3.75f, 10.5f)
                close()
            }
        }.build()
        return _SearchKey!!
    }


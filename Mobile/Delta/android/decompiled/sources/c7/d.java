package c7;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;
import m6.h;
import org.jetbrains.annotations.NotNull;
import y6.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "input", "", "outputWidth", "outputHeight", "Landroid/graphics/Paint;", "a", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Paint;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    @NotNull
    public static final Paint a(@NotNull Bitmap bitmap, int i10, int i11) {
        Matrix matrix = new Matrix();
        float fD = (float) h.d(bitmap.getWidth(), bitmap.getHeight(), i10, i11, f.FILL);
        float f10 = 2;
        matrix.setTranslate((i10 - (bitmap.getWidth() * fD)) / f10, (i11 - (bitmap.getHeight() * fD)) / f10);
        matrix.preScale(fD, fD);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }
}

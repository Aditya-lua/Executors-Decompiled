package p043c7;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p287m6.C8434h;
import p568y6.EnumC13107f;

/* JADX INFO: renamed from: c7.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroid/graphics/Bitmap;", "input", "", "outputWidth", "outputHeight", "Landroid/graphics/Paint;", "a", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Paint;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1554d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Paint m8147a(@NotNull Bitmap bitmap, int i10, int i11) {
        Matrix matrix = new Matrix();
        float fM34196d = (float) C8434h.m34196d(bitmap.getWidth(), bitmap.getHeight(), i10, i11, EnumC13107f.FILL);
        float f10 = 2;
        matrix.setTranslate((i10 - (bitmap.getWidth() * fM34196d)) / f10, (i11 - (bitmap.getHeight() * fM34196d)) / f10);
        matrix.preScale(fM34196d, fM34196d);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }
}

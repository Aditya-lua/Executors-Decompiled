package e7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Le7/i;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap$Config;", "config", "Ly6/g;", "size", "Ly6/f;", "scale", "", "allowInexactSize", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ly6/g;Ly6/f;Z)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "c", "(ZLandroid/graphics/Bitmap;Ly6/g;Ly6/f;)Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f15192a = new i();

    @NotNull
    public final Bitmap a(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull Size size, @NotNull y6.f scale, boolean allowInexactSize) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(allowInexactSize, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iG = i0.g(drawableMutate);
        int i10 = Barcode.FORMAT_UPC_A;
        if (iG <= 0) {
            iG = 512;
        }
        int iB = i0.b(drawableMutate);
        if (iB > 0) {
            i10 = iB;
        }
        long jB = m6.h.b(iG, i10, size, scale, Size.f35746d);
        double d10 = m6.h.d(iG, i10, r.c(jB), r.d(jB), scale);
        int iC = cu.b.c(((double) iG) * d10);
        int iC2 = cu.b.c(d10 * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, b.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == b.e(config);
    }

    public final boolean c(boolean allowInexactSize, Bitmap bitmap, Size size, y6.f scale) {
        if (allowInexactSize) {
            return true;
        }
        long jB = m6.h.b(bitmap.getWidth(), bitmap.getHeight(), size, scale, Size.f35746d);
        return m6.h.d(bitmap.getWidth(), bitmap.getHeight(), r.c(jB), r.d(jB), scale) == 1.0d;
    }
}

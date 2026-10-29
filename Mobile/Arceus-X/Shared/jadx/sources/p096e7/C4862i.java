package p096e7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import cu.C4366b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p287m6.C8434h;
import p568y6.EnumC13107f;
import p568y6.Size;

/* JADX INFO: renamed from: e7.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Le7/i;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap$Config;", "config", "Ly6/g;", "size", "Ly6/f;", "scale", "", "allowInexactSize", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ly6/g;Ly6/f;Z)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "c", "(ZLandroid/graphics/Bitmap;Ly6/g;Ly6/f;)Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4862i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4862i f19549a = new C4862i();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Bitmap m23452a(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull Size size, @NotNull EnumC13107f scale, boolean allowInexactSize) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m23453b(bitmap, config) && m23454c(allowInexactSize, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM23461g = C4863i0.m23461g(drawableMutate);
        if (iM23461g <= 0) {
            iM23461g = 512;
        }
        int iM23456b = C4863i0.m23456b(drawableMutate);
        int i10 = iM23456b > 0 ? iM23456b : 512;
        long jM34194b = C8434h.m34194b(iM23461g, i10, size, scale, Size.f46345d);
        double dM34196d = C8434h.m34196d(iM23461g, i10, C4872r.m23480c(jM34194b), C4872r.m23481d(jM34194b), scale);
        int iM22015c = C4366b.m22015c(((double) iM23461g) * dM34196d);
        int iM22015c2 = C4366b.m22015c(dM34196d * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM22015c, iM22015c2, C4848b.m23413e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM22015c, iM22015c2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23453b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == C4848b.m23413e(config);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23454c(boolean allowInexactSize, Bitmap bitmap, Size size, EnumC13107f scale) {
        if (allowInexactSize) {
            return true;
        }
        long jM34194b = C8434h.m34194b(bitmap.getWidth(), bitmap.getHeight(), size, scale, Size.f46345d);
        return C8434h.m34196d(bitmap.getWidth(), bitmap.getHeight(), C4872r.m23480c(jM34194b), C4872r.m23481d(jM34194b), scale) == 1.0d;
    }
}

package p043c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.inputmethod.EditorInfoCompat;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4848b;
import p096e7.C4872r;
import p287m6.C8434h;
import p315nt.InterfaceC9557b;
import p568y6.C13109h;
import p568y6.EnumC13107f;
import p568y6.InterfaceC13102a;
import p568y6.Size;

/* JADX INFO: renamed from: c7.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lc7/b;", "Lc7/c;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "Le7/r;", "c", "(Landroid/graphics/Bitmap;Ly6/g;)J", "a", "F", "d", "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1552b extends AbstractC1553c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float topLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float topRight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float bottomLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float bottomRight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1552b(float f10, float f11, float f12, float f13) {
        this.topLeft = f10;
        this.topRight = f11;
        this.bottomLeft = f12;
        this.bottomRight = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.cacheKey = C7731d0.m32002b(C1552b.class).mo28426f() + '-' + f10 + ',' + f11 + ',' + f12 + ',' + f13;
    }

    @Override // p043c7.AbstractC1553c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // p043c7.AbstractC1553c
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo8145b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        long jM8146c = m8146c(bitmap, size);
        int iM23480c = C4872r.m23480c(jM8146c);
        int iM23481d = C4872r.m23481d(jM8146c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM23480c, iM23481d, C4848b.m23411c(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintM8147a = C1554d.m8147a(bitmap, iM23480c, iM23481d);
        float f10 = this.topLeft;
        float f11 = this.topRight;
        if (f10 == f11) {
            float f12 = this.bottomLeft;
            if (f11 == f12 && f12 == this.bottomRight) {
                canvas.drawRoundRect(0.0f, 0.0f, iM23480c, iM23481d, f10, f10, paintM8147a);
                return bitmapCreateBitmap;
            }
        }
        float f13 = this.bottomRight;
        float f14 = this.bottomLeft;
        float[] fArr = {f10, f10, f11, f11, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, iM23480c, iM23481d);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paintM8147a);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public final long m8146c(Bitmap input, Size size) {
        if (C13109h.m48713b(size)) {
            return C4872r.m23478a(input.getWidth(), input.getHeight());
        }
        InterfaceC13102a width = size.getWidth();
        InterfaceC13102a height = size.getHeight();
        if ((width instanceof InterfaceC13102a.a) && (height instanceof InterfaceC13102a.a)) {
            return C4872r.m23478a(((InterfaceC13102a.a) width).getPx(), ((InterfaceC13102a.a) height).getPx());
        }
        int width2 = input.getWidth();
        int height2 = input.getHeight();
        InterfaceC13102a interfaceC13102aM48711d = size.m48711d();
        boolean z10 = interfaceC13102aM48711d instanceof InterfaceC13102a.a;
        int px = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int px2 = z10 ? ((InterfaceC13102a.a) interfaceC13102aM48711d).getPx() : Integer.MIN_VALUE;
        InterfaceC13102a interfaceC13102aM48710c = size.m48710c();
        if (interfaceC13102aM48710c instanceof InterfaceC13102a.a) {
            px = ((InterfaceC13102a.a) interfaceC13102aM48710c).getPx();
        }
        double dM34196d = C8434h.m34196d(width2, height2, px2, px, EnumC13107f.FILL);
        return C4872r.m23478a(C4366b.m22015c(((double) input.getWidth()) * dM34196d), C4366b.m22015c(dM34196d * ((double) input.getHeight())));
    }

    public C1552b(float f10) {
        this(f10, f10, f10, f10);
    }
}

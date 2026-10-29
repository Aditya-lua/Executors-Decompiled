package c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import e7.r;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;
import y6.f;
import y6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Lc7/b;", "Lc7/c;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "Le7/r;", "c", "(Landroid/graphics/Bitmap;Ly6/g;)J", "a", "F", "d", "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float topLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float topRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float bottomLeft;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottomRight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey;

    public b(float f10, float f11, float f12, float f13) {
        this.topLeft = f10;
        this.topRight = f11;
        this.bottomLeft = f12;
        this.bottomRight = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.cacheKey = d0.b(b.class).f() + '-' + f10 + ',' + f11 + ',' + f12 + ',' + f13;
    }

    @Override // c7.c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // c7.c
    @Nullable
    public Object b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull nt.b<? super Bitmap> bVar) {
        long jC = c(bitmap, size);
        int iC = r.c(jC);
        int iD = r.d(jC);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iD, e7.b.c(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintA = d.a(bitmap, iC, iD);
        float f10 = this.topLeft;
        float f11 = this.topRight;
        if (f10 == f11) {
            float f12 = this.bottomLeft;
            if (f11 == f12 && f12 == this.bottomRight) {
                canvas.drawRoundRect(0.0f, 0.0f, iC, iD, f10, f10, paintA);
                return bitmapCreateBitmap;
            }
        }
        float f13 = this.bottomRight;
        float f14 = this.bottomLeft;
        float[] fArr = {f10, f10, f11, f11, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, iC, iD);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paintA);
        return bitmapCreateBitmap;
    }

    public final long c(Bitmap input, Size size) {
        if (h.b(size)) {
            return r.a(input.getWidth(), input.getHeight());
        }
        y6.a width = size.getWidth();
        y6.a height = size.getHeight();
        if ((width instanceof y6.a.C0655a) && (height instanceof y6.a.C0655a)) {
            return r.a(((y6.a.C0655a) width).getPx(), ((y6.a.C0655a) height).getPx());
        }
        int width2 = input.getWidth();
        int height2 = input.getHeight();
        y6.a aVarD = size.d();
        int px = aVarD instanceof y6.a.C0655a ? ((y6.a.C0655a) aVarD).getPx() : Integer.MIN_VALUE;
        y6.a aVarC = size.c();
        double d10 = m6.h.d(width2, height2, px, aVarC instanceof y6.a.C0655a ? ((y6.a.C0655a) aVarC).getPx() : Integer.MIN_VALUE, f.FILL);
        return r.a(cu.b.c(((double) input.getWidth()) * d10), cu.b.c(d10 * ((double) input.getHeight())));
    }

    public b(float f10) {
        this(f10, f10, f10, f10);
    }
}

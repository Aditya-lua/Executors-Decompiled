package p266l7;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l7.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8002a {

    /* JADX INFO: renamed from: a */
    public final PointF f29926a;

    /* JADX INFO: renamed from: b */
    public final PointF f29927b;

    /* JADX INFO: renamed from: c */
    public final PointF f29928c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8002a() {
        this.f29926a = new PointF();
        this.f29927b = new PointF();
        this.f29928c = new PointF();
    }

    /* JADX INFO: renamed from: a */
    public PointF m33060a() {
        return this.f29926a;
    }

    /* JADX INFO: renamed from: b */
    public PointF m33061b() {
        return this.f29927b;
    }

    /* JADX INFO: renamed from: c */
    public PointF m33062c() {
        return this.f29928c;
    }

    /* JADX INFO: renamed from: d */
    public void m33063d(float f10, float f11) {
        this.f29926a.set(f10, f11);
    }

    /* JADX INFO: renamed from: e */
    public void m33064e(float f10, float f11) {
        this.f29927b.set(f10, f11);
    }

    /* JADX INFO: renamed from: f */
    public void m33065f(float f10, float f11) {
        this.f29928c.set(f10, f11);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f29928c.x), Float.valueOf(this.f29928c.y), Float.valueOf(this.f29926a.x), Float.valueOf(this.f29926a.y), Float.valueOf(this.f29927b.x), Float.valueOf(this.f29927b.y));
    }

    public C8002a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f29926a = pointF;
        this.f29927b = pointF2;
        this.f29928c = pointF3;
    }
}

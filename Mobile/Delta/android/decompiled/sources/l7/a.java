package l7;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f22951a;
    public final PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f22952c;

    public a() {
        this.f22951a = new PointF();
        this.b = new PointF();
        this.f22952c = new PointF();
    }

    public PointF a() {
        return this.f22951a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.f22952c;
    }

    public void d(float f10, float f11) {
        this.f22951a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f22952c.set(f10, f11);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f22952c.x), Float.valueOf(this.f22952c.y), Float.valueOf(this.f22951a.x), Float.valueOf(this.f22951a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f22951a = pointF;
        this.b = pointF2;
        this.f22952c = pointF3;
    }
}

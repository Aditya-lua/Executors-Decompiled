package t7;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f32143a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f32144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f32146e = null;

    public b(float f10, float f11, float f12, int i10) {
        this.f32143a = f10;
        this.b = f11;
        this.f32144c = f12;
        this.f32145d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f32145d) > 0) {
            paint.setShadowLayer(Math.max(this.f32143a, Float.MIN_VALUE), this.b, this.f32144c, this.f32145d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(l.a aVar) {
        if (Color.alpha(this.f32145d) > 0) {
            aVar.f32195d = this;
        } else {
            aVar.f32195d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = m.l(Color.alpha(this.f32145d), j.c(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f32143a, Float.MIN_VALUE), this.b, this.f32144c, Color.argb(iL, Color.red(this.f32145d), Color.green(this.f32145d), Color.blue(this.f32145d)));
        }
    }

    public void d(int i10, l.a aVar) {
        b bVar = new b(this);
        aVar.f32195d = bVar;
        bVar.i(i10);
    }

    public int e() {
        return this.f32145d;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.f32144c;
    }

    public float h() {
        return this.f32143a;
    }

    public void i(int i10) {
        this.f32145d = Color.argb(Math.round((Color.alpha(this.f32145d) * j.c(i10, 0, 255)) / 255.0f), Color.red(this.f32145d), Color.green(this.f32145d), Color.blue(this.f32145d));
    }

    public boolean j(b bVar) {
        return this.f32143a == bVar.f32143a && this.b == bVar.b && this.f32144c == bVar.f32144c && this.f32145d == bVar.f32145d;
    }

    public void k(Matrix matrix) {
        if (this.f32146e == null) {
            this.f32146e = new float[2];
        }
        float[] fArr = this.f32146e;
        fArr[0] = this.b;
        fArr[1] = this.f32144c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f32146e;
        this.b = fArr2[0];
        this.f32144c = fArr2[1];
        this.f32143a = matrix.mapRadius(this.f32143a);
    }

    public b(b bVar) {
        this.f32143a = 0.0f;
        this.b = 0.0f;
        this.f32144c = 0.0f;
        this.f32145d = 0;
        this.f32143a = bVar.f32143a;
        this.b = bVar.b;
        this.f32144c = bVar.f32144c;
        this.f32145d = bVar.f32145d;
    }
}

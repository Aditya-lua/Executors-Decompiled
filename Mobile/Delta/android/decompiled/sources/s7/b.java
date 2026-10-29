package s7;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30490a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f30493e = null;

    public b(float f10, float f11, float f12, int i10) {
        this.f30490a = f10;
        this.b = f11;
        this.f30491c = f12;
        this.f30492d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f30492d) > 0) {
            paint.setShadowLayer(Math.max(this.f30490a, Float.MIN_VALUE), this.b, this.f30491c, this.f30492d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(l.a aVar) {
        if (Color.alpha(this.f30492d) > 0) {
            aVar.f30542d = this;
        } else {
            aVar.f30542d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = m.l(Color.alpha(this.f30492d), j.c(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f30490a, Float.MIN_VALUE), this.b, this.f30491c, Color.argb(iL, Color.red(this.f30492d), Color.green(this.f30492d), Color.blue(this.f30492d)));
        }
    }

    public void d(int i10, l.a aVar) {
        b bVar = new b(this);
        aVar.f30542d = bVar;
        bVar.i(i10);
    }

    public int e() {
        return this.f30492d;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.f30491c;
    }

    public float h() {
        return this.f30490a;
    }

    public void i(int i10) {
        this.f30492d = Color.argb(Math.round((Color.alpha(this.f30492d) * j.c(i10, 0, 255)) / 255.0f), Color.red(this.f30492d), Color.green(this.f30492d), Color.blue(this.f30492d));
    }

    public boolean j(b bVar) {
        return this.f30490a == bVar.f30490a && this.b == bVar.b && this.f30491c == bVar.f30491c && this.f30492d == bVar.f30492d;
    }

    public void k(Matrix matrix) {
        if (this.f30493e == null) {
            this.f30493e = new float[2];
        }
        float[] fArr = this.f30493e;
        fArr[0] = this.b;
        fArr[1] = this.f30491c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f30493e;
        this.b = fArr2[0];
        this.f30491c = fArr2[1];
        this.f30490a = matrix.mapRadius(this.f30490a);
    }

    public b(b bVar) {
        this.f30490a = 0.0f;
        this.b = 0.0f;
        this.f30491c = 0.0f;
        this.f30492d = 0;
        this.f30490a = bVar.f30490a;
        this.b = bVar.b;
        this.f30491c = bVar.f30491c;
        this.f30492d = bVar.f30492d;
    }
}

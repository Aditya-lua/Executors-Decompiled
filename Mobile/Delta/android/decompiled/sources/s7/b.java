package s7;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31037a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f31040e = null;

    public b(float f10, float f11, float f12, int i10) {
        this.f31037a = f10;
        this.b = f11;
        this.f31038c = f12;
        this.f31039d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f31039d) > 0) {
            paint.setShadowLayer(Math.max(this.f31037a, Float.MIN_VALUE), this.b, this.f31038c, this.f31039d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(l.a aVar) {
        if (Color.alpha(this.f31039d) > 0) {
            aVar.f31089d = this;
        } else {
            aVar.f31089d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = m.l(Color.alpha(this.f31039d), j.c(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f31037a, Float.MIN_VALUE), this.b, this.f31038c, Color.argb(iL, Color.red(this.f31039d), Color.green(this.f31039d), Color.blue(this.f31039d)));
        }
    }

    public void d(int i10, l.a aVar) {
        b bVar = new b(this);
        aVar.f31089d = bVar;
        bVar.i(i10);
    }

    public int e() {
        return this.f31039d;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.f31038c;
    }

    public float h() {
        return this.f31037a;
    }

    public void i(int i10) {
        this.f31039d = Color.argb(Math.round((Color.alpha(this.f31039d) * j.c(i10, 0, 255)) / 255.0f), Color.red(this.f31039d), Color.green(this.f31039d), Color.blue(this.f31039d));
    }

    public boolean j(b bVar) {
        return this.f31037a == bVar.f31037a && this.b == bVar.b && this.f31038c == bVar.f31038c && this.f31039d == bVar.f31039d;
    }

    public void k(Matrix matrix) {
        if (this.f31040e == null) {
            this.f31040e = new float[2];
        }
        float[] fArr = this.f31040e;
        fArr[0] = this.b;
        fArr[1] = this.f31038c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f31040e;
        this.b = fArr2[0];
        this.f31038c = fArr2[1];
        this.f31037a = matrix.mapRadius(this.f31037a);
    }

    public b(b bVar) {
        this.f31037a = 0.0f;
        this.b = 0.0f;
        this.f31038c = 0.0f;
        this.f31039d = 0;
        this.f31037a = bVar.f31037a;
        this.b = bVar.b;
        this.f31038c = bVar.f31038c;
        this.f31039d = bVar.f31039d;
    }
}

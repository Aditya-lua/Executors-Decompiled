package p431s7;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: renamed from: s7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C11186b {

    /* JADX INFO: renamed from: a */
    public float f39458a;

    /* JADX INFO: renamed from: b */
    public float f39459b;

    /* JADX INFO: renamed from: c */
    public float f39460c;

    /* JADX INFO: renamed from: d */
    public int f39461d;

    /* JADX INFO: renamed from: e */
    public float[] f39462e = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11186b(float f10, float f11, float f12, int i10) {
        this.f39458a = f10;
        this.f39459b = f11;
        this.f39460c = f12;
        this.f39461d = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m42136a(Paint paint) {
        if (Color.alpha(this.f39461d) > 0) {
            paint.setShadowLayer(Math.max(this.f39458a, Float.MIN_VALUE), this.f39459b, this.f39460c, this.f39461d);
        } else {
            paint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42137b(C11196l.a aVar) {
        if (Color.alpha(this.f39461d) > 0) {
            aVar.f39518d = this;
        } else {
            aVar.f39518d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m42138c(int i10, Paint paint) {
        int iM42223l = C11197m.m42223l(Color.alpha(this.f39461d), C11194j.m42185c(i10, 0, 255));
        if (iM42223l <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f39458a, Float.MIN_VALUE), this.f39459b, this.f39460c, Color.argb(iM42223l, Color.red(this.f39461d), Color.green(this.f39461d), Color.blue(this.f39461d)));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m42139d(int i10, C11196l.a aVar) {
        C11186b c11186b = new C11186b(this);
        aVar.f39518d = c11186b;
        c11186b.m42144i(i10);
    }

    /* JADX INFO: renamed from: e */
    public int m42140e() {
        return this.f39461d;
    }

    /* JADX INFO: renamed from: f */
    public float m42141f() {
        return this.f39459b;
    }

    /* JADX INFO: renamed from: g */
    public float m42142g() {
        return this.f39460c;
    }

    /* JADX INFO: renamed from: h */
    public float m42143h() {
        return this.f39458a;
    }

    /* JADX INFO: renamed from: i */
    public void m42144i(int i10) {
        this.f39461d = Color.argb(Math.round((Color.alpha(this.f39461d) * C11194j.m42185c(i10, 0, 255)) / 255.0f), Color.red(this.f39461d), Color.green(this.f39461d), Color.blue(this.f39461d));
    }

    /* JADX INFO: renamed from: j */
    public boolean m42145j(C11186b c11186b) {
        return this.f39458a == c11186b.f39458a && this.f39459b == c11186b.f39459b && this.f39460c == c11186b.f39460c && this.f39461d == c11186b.f39461d;
    }

    /* JADX INFO: renamed from: k */
    public void m42146k(Matrix matrix) {
        if (this.f39462e == null) {
            this.f39462e = new float[2];
        }
        float[] fArr = this.f39462e;
        fArr[0] = this.f39459b;
        fArr[1] = this.f39460c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f39462e;
        this.f39459b = fArr2[0];
        this.f39460c = fArr2[1];
        this.f39458a = matrix.mapRadius(this.f39458a);
    }

    public C11186b(C11186b c11186b) {
        this.f39458a = 0.0f;
        this.f39459b = 0.0f;
        this.f39460c = 0.0f;
        this.f39461d = 0;
        this.f39458a = c11186b.f39458a;
        this.f39459b = c11186b.f39459b;
        this.f39460c = c11186b.f39460c;
        this.f39461d = c11186b.f39461d;
    }
}

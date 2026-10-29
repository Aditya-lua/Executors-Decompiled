package p075dd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import bd.C1304a;
import p463uc.C11840a;

/* JADX INFO: renamed from: dd.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4543c extends AbstractC4548h<C4545e> {

    /* JADX INFO: renamed from: b */
    public float f18592b;

    /* JADX INFO: renamed from: c */
    public float f18593c;

    /* JADX INFO: renamed from: d */
    public float f18594d;

    /* JADX INFO: renamed from: e */
    public boolean f18595e;

    /* JADX INFO: renamed from: f */
    public float f18596f;

    public C4543c(@NonNull C4545e c4545e) {
        super(c4545e);
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: a */
    public void mo22522a(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / mo22527f();
        float fHeight = rect.height() / mo22526e();
        S s8 = this.f18638a;
        float f11 = (((C4545e) s8).f18612h / 2.0f) + ((C4545e) s8).f18613i;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((C4545e) this.f18638a).f18614j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s10 = this.f18638a;
        this.f18595e = ((C4545e) s10).f18585a / 2 <= ((C4545e) s10).f18586b;
        this.f18592b = ((C4545e) s10).f18585a * f10;
        this.f18593c = Math.min(((C4545e) s10).f18585a / 2, ((C4545e) s10).f18586b) * f10;
        S s11 = this.f18638a;
        float f13 = (((C4545e) s11).f18612h - ((C4545e) s11).f18585a) / 2.0f;
        this.f18594d = f13;
        if (z10 || z11) {
            if ((z10 && ((C4545e) s11).f18589e == 2) || (z11 && ((C4545e) s11).f18590f == 1)) {
                this.f18594d = f13 + (((1.0f - f10) * ((C4545e) s11).f18585a) / 2.0f);
            } else if ((z10 && ((C4545e) s11).f18589e == 1) || (z11 && ((C4545e) s11).f18590f == 2)) {
                this.f18594d = f13 - (((1.0f - f10) * ((C4545e) s11).f18585a) / 2.0f);
            }
        }
        if (z11 && ((C4545e) s11).f18590f == 3) {
            this.f18596f = f10;
        } else {
            this.f18596f = 1.0f;
        }
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: b */
    public void mo22523b(@NonNull Canvas canvas, @NonNull Paint paint, int i10, int i11) {
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: c */
    public void mo22524c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull AbstractC4548h.a aVar, int i10) {
        int iM44225a = C11840a.m44225a(aVar.f18641c, i10);
        float f10 = aVar.f18639a;
        float f11 = aVar.f18640b;
        int i11 = aVar.f18642d;
        m22528h(canvas, paint, f10, f11, iM44225a, i11, i11);
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: d */
    public void mo22525d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        m22528h(canvas, paint, f10, f11, C11840a.m44225a(i10, i11), i12, i12);
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: e */
    public int mo22526e() {
        return m22531k();
    }

    @Override // p075dd.AbstractC4548h
    /* JADX INFO: renamed from: f */
    public int mo22527f() {
        return m22531k();
    }

    /* JADX INFO: renamed from: h */
    public final void m22528h(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.f18596f < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                m22528h(canvas, paint, f13, 1.0f, i10, i11, 0);
                m22528h(canvas, paint, 1.0f, f14, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f18593c / this.f18594d);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += ((f12 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fM7098c = C1304a.m7098c(1.0f - this.f18596f, 1.0f, f13);
        float fM7098c2 = C1304a.m7098c(0.0f, this.f18596f, f12);
        float degrees2 = (float) Math.toDegrees(i11 / this.f18594d);
        float degrees3 = ((fM7098c2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f18594d));
        float f15 = (fM7098c * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f18592b);
        float f16 = degrees * 2.0f;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            paint.setStyle(Paint.Style.FILL);
            m22530j(canvas, paint, f15 + (degrees * f17), this.f18593c * 2.0f, this.f18592b, f17);
            return;
        }
        float f18 = this.f18594d;
        RectF rectF = new RectF(-f18, -f18, f18, f18);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f18595e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f15 + degrees;
        canvas.drawArc(rectF, f19, degrees3 - f16, false, paint);
        if (this.f18595e || this.f18593c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m22529i(canvas, paint, f19, this.f18593c * 2.0f, this.f18592b);
        m22529i(canvas, paint, (f15 + degrees3) - degrees, this.f18593c * 2.0f, this.f18592b);
    }

    /* JADX INFO: renamed from: i */
    public final void m22529i(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12) {
        m22530j(canvas, paint, f10, f11, f12, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m22530j(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12, float f13) {
        float fMin = (int) Math.min(f12, this.f18592b);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.f18593c * fMin) / this.f18592b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f11) / 2.0f, fMin / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (((double) this.f18594d) * Math.cos(Math.toRadians(d10))), (float) (((double) this.f18594d) * Math.sin(Math.toRadians(d10))));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: k */
    public final int m22531k() {
        S s8 = this.f18638a;
        return ((C4545e) s8).f18612h + (((C4545e) s8).f18613i * 2);
    }
}

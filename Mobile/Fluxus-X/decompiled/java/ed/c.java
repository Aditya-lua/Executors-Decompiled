package ed;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends h<e> {
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13330f;

    public c(@NonNull e eVar) {
        super(eVar);
    }

    @Override // ed.h
    public void a(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        S s8 = this.f13371a;
        float f11 = (((e) s8).f13346h / 2.0f) + ((e) s8).f13347i;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((e) this.f13371a).f13348j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s10 = this.f13371a;
        this.f13329e = ((e) s10).f13321a / 2 <= ((e) s10).b;
        this.b = ((e) s10).f13321a * f10;
        this.f13327c = Math.min(((e) s10).f13321a / 2, ((e) s10).b) * f10;
        S s11 = this.f13371a;
        float f13 = (((e) s11).f13346h - ((e) s11).f13321a) / 2.0f;
        this.f13328d = f13;
        if (z10 || z11) {
            if ((z10 && ((e) s11).f13324e == 2) || (z11 && ((e) s11).f13325f == 1)) {
                this.f13328d = f13 + (((1.0f - f10) * ((e) s11).f13321a) / 2.0f);
            } else if ((z10 && ((e) s11).f13324e == 1) || (z11 && ((e) s11).f13325f == 2)) {
                this.f13328d = f13 - (((1.0f - f10) * ((e) s11).f13321a) / 2.0f);
            }
        }
        if (z11 && ((e) s11).f13325f == 3) {
            this.f13330f = f10;
        } else {
            this.f13330f = 1.0f;
        }
    }

    @Override // ed.h
    public void b(@NonNull Canvas canvas, @NonNull Paint paint, int i10, int i11) {
    }

    @Override // ed.h
    public void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull h.a aVar, int i10) {
        int iA = vc.a.a(aVar.f13373c, i10);
        float f10 = aVar.f13372a;
        float f11 = aVar.b;
        int i11 = aVar.f13374d;
        h(canvas, paint, f10, f11, iA, i11, i11);
    }

    @Override // ed.h
    public void d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        h(canvas, paint, f10, f11, vc.a.a(i10, i11), i12, i12);
    }

    @Override // ed.h
    public int e() {
        return k();
    }

    @Override // ed.h
    public int f() {
        return k();
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.f13330f < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                h(canvas, paint, f13, 1.0f, i10, i11, 0);
                h(canvas, paint, 1.0f, f14, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f13327c / this.f13328d);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += ((f12 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fC = cd.a.c(1.0f - this.f13330f, 1.0f, f13);
        float fC2 = cd.a.c(0.0f, this.f13330f, f12);
        float degrees2 = (float) Math.toDegrees(i11 / this.f13328d);
        float degrees3 = ((fC2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f13328d));
        float f15 = (fC * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.b);
        float f16 = degrees * 2.0f;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, f15 + (degrees * f17), this.f13327c * 2.0f, this.b, f17);
            return;
        }
        float f18 = this.f13328d;
        RectF rectF = new RectF(-f18, -f18, f18, f18);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f13329e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f15 + degrees;
        canvas.drawArc(rectF, f19, degrees3 - f16, false, paint);
        if (this.f13329e || this.f13327c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f19, this.f13327c * 2.0f, this.b);
        i(canvas, paint, (f15 + degrees3) - degrees, this.f13327c * 2.0f, this.b);
    }

    public final void i(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12) {
        j(canvas, paint, f10, f11, f12, 1.0f);
    }

    public final void j(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12, float f13) {
        float fMin = (int) Math.min(f12, this.b);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.f13327c * fMin) / this.b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f11) / 2.0f, fMin / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (((double) this.f13328d) * Math.cos(Math.toRadians(d10))), (float) (((double) this.f13328d) * Math.sin(Math.toRadians(d10))));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        S s8 = this.f13371a;
        return ((e) s8).f13346h + (((e) s8).f13347i * 2);
    }
}

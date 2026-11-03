package dd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends h<e> {
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14539f;

    public c(@NonNull e eVar) {
        super(eVar);
    }

    @Override // dd.h
    public void a(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        S s8 = this.f14580a;
        float f11 = (((e) s8).f14555h / 2.0f) + ((e) s8).f14556i;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((e) this.f14580a).f14557j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s10 = this.f14580a;
        this.f14538e = ((e) s10).f14530a / 2 <= ((e) s10).b;
        this.b = ((e) s10).f14530a * f10;
        this.f14536c = Math.min(((e) s10).f14530a / 2, ((e) s10).b) * f10;
        S s11 = this.f14580a;
        float f13 = (((e) s11).f14555h - ((e) s11).f14530a) / 2.0f;
        this.f14537d = f13;
        if (z10 || z11) {
            if ((z10 && ((e) s11).f14533e == 2) || (z11 && ((e) s11).f14534f == 1)) {
                this.f14537d = f13 + (((1.0f - f10) * ((e) s11).f14530a) / 2.0f);
            } else if ((z10 && ((e) s11).f14533e == 1) || (z11 && ((e) s11).f14534f == 2)) {
                this.f14537d = f13 - (((1.0f - f10) * ((e) s11).f14530a) / 2.0f);
            }
        }
        if (z11 && ((e) s11).f14534f == 3) {
            this.f14539f = f10;
        } else {
            this.f14539f = 1.0f;
        }
    }

    @Override // dd.h
    public void b(@NonNull Canvas canvas, @NonNull Paint paint, int i10, int i11) {
    }

    @Override // dd.h
    public void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull h.a aVar, int i10) {
        int iA = uc.a.a(aVar.f14582c, i10);
        float f10 = aVar.f14581a;
        float f11 = aVar.b;
        int i11 = aVar.f14583d;
        h(canvas, paint, f10, f11, iA, i11, i11);
    }

    @Override // dd.h
    public void d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        h(canvas, paint, f10, f11, uc.a.a(i10, i11), i12, i12);
    }

    @Override // dd.h
    public int e() {
        return k();
    }

    @Override // dd.h
    public int f() {
        return k();
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.f14539f < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                h(canvas, paint, f13, 1.0f, i10, i11, 0);
                h(canvas, paint, 1.0f, f14, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f14536c / this.f14537d);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += ((f12 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fC = bd.a.c(1.0f - this.f14539f, 1.0f, f13);
        float fC2 = bd.a.c(0.0f, this.f14539f, f12);
        float degrees2 = (float) Math.toDegrees(i11 / this.f14537d);
        float degrees3 = ((fC2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f14537d));
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
            j(canvas, paint, f15 + (degrees * f17), this.f14536c * 2.0f, this.b, f17);
            return;
        }
        float f18 = this.f14537d;
        RectF rectF = new RectF(-f18, -f18, f18, f18);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f14538e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f15 + degrees;
        canvas.drawArc(rectF, f19, degrees3 - f16, false, paint);
        if (this.f14538e || this.f14536c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f19, this.f14536c * 2.0f, this.b);
        i(canvas, paint, (f15 + degrees3) - degrees, this.f14536c * 2.0f, this.b);
    }

    public final void i(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12) {
        j(canvas, paint, f10, f11, f12, 1.0f);
    }

    public final void j(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12, float f13) {
        float fMin = (int) Math.min(f12, this.b);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.f14536c * fMin) / this.b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f11) / 2.0f, fMin / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (((double) this.f14537d) * Math.cos(Math.toRadians(d10))), (float) (((double) this.f14537d) * Math.sin(Math.toRadians(d10))));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        S s8 = this.f14580a;
        return ((e) s8).f14555h + (((e) s8).f14556i * 2);
    }
}

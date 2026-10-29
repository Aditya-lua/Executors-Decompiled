package p481v1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: v1.d */
/* JADX INFO: loaded from: classes.dex */
public class C11996d extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f42468a;

    /* JADX INFO: renamed from: c */
    public final RectF f42470c;

    /* JADX INFO: renamed from: d */
    public final Rect f42471d;

    /* JADX INFO: renamed from: e */
    public float f42472e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f42475h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f42476i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f42477j;

    /* JADX INFO: renamed from: f */
    public boolean f42473f = false;

    /* JADX INFO: renamed from: g */
    public boolean f42474g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f42478k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f42469b = new Paint(5);

    public C11996d(ColorStateList colorStateList, float f10) {
        this.f42468a = f10;
        m44768e(colorStateList);
        this.f42470c = new RectF();
        this.f42471d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m44764a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m44765b() {
        return this.f42475h;
    }

    /* JADX INFO: renamed from: c */
    public float m44766c() {
        return this.f42472e;
    }

    /* JADX INFO: renamed from: d */
    public float m44767d() {
        return this.f42468a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f42469b;
        if (this.f42476i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f42476i);
            z10 = true;
        }
        RectF rectF = this.f42470c;
        float f10 = this.f42468a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m44768e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f42475h = colorStateList;
        this.f42469b.setColor(colorStateList.getColorForState(getState(), this.f42475h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: f */
    public void m44769f(ColorStateList colorStateList) {
        m44768e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m44770g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f42472e && this.f42473f == z10 && this.f42474g == z11) {
            return;
        }
        this.f42472e = f10;
        this.f42473f = z10;
        this.f42474g = z11;
        m44772i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f42471d, this.f42468a);
    }

    /* JADX INFO: renamed from: h */
    public void m44771h(float f10) {
        if (f10 == this.f42468a) {
            return;
        }
        this.f42468a = f10;
        m44772i(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m44772i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f42470c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f42471d.set(rect);
        if (this.f42473f) {
            this.f42471d.inset((int) Math.ceil(C11997e.m44773a(this.f42472e, this.f42468a, this.f42474g)), (int) Math.ceil(C11997e.m44774b(this.f42472e, this.f42468a, this.f42474g)));
            this.f42470c.set(this.f42471d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f42477j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f42475h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m44772i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f42475h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f42469b.getColor();
        if (z10) {
            this.f42469b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f42477j;
        if (colorStateList2 == null || (mode = this.f42478k) == null) {
            return z10;
        }
        this.f42476i = m44764a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f42469b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42469b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f42477j = colorStateList;
        this.f42476i = m44764a(colorStateList, this.f42478k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f42478k = mode;
        this.f42476i = m44764a(this.f42477j, mode);
        invalidateSelf();
    }
}

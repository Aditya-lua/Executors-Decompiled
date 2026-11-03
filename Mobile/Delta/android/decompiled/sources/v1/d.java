package v1;

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

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33252a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f33253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f33255e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f33258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f33259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f33260j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33256f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33257g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f33261k = PorterDuff.Mode.SRC_IN;
    public final Paint b = new Paint(5);

    public d(ColorStateList colorStateList, float f10) {
        this.f33252a = f10;
        e(colorStateList);
        this.f33253c = new RectF();
        this.f33254d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f33258h;
    }

    public float c() {
        return this.f33255e;
    }

    public float d() {
        return this.f33252a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.b;
        if (this.f33259i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f33259i);
            z10 = true;
        }
        RectF rectF = this.f33253c;
        float f10 = this.f33252a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f33258h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f33258h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f33255e && this.f33256f == z10 && this.f33257g == z11) {
            return;
        }
        this.f33255e = f10;
        this.f33256f = z10;
        this.f33257g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f33254d, this.f33252a);
    }

    public void h(float f10) {
        if (f10 == this.f33252a) {
            return;
        }
        this.f33252a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f33253c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f33254d.set(rect);
        if (this.f33256f) {
            this.f33254d.inset((int) Math.ceil(e.a(this.f33255e, this.f33252a, this.f33257g)), (int) Math.ceil(e.b(this.f33255e, this.f33252a, this.f33257g)));
            this.f33253c.set(this.f33254d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f33260j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f33258h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f33258h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.b.getColor();
        if (z10) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f33260j;
        if (colorStateList2 == null || (mode = this.f33261k) == null) {
            return z10;
        }
        this.f33259i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f33260j = colorStateList;
        this.f33259i = a(colorStateList, this.f33261k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f33261k = mode;
        this.f33259i = a(this.f33260j, mode);
        invalidateSelf();
    }
}

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
    public float f32684a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f32685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f32686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f32687e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f32690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f32691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f32692j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32688f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32689g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f32693k = PorterDuff.Mode.SRC_IN;
    public final Paint b = new Paint(5);

    public d(ColorStateList colorStateList, float f10) {
        this.f32684a = f10;
        e(colorStateList);
        this.f32685c = new RectF();
        this.f32686d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f32690h;
    }

    public float c() {
        return this.f32687e;
    }

    public float d() {
        return this.f32684a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.b;
        if (this.f32691i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f32691i);
            z10 = true;
        }
        RectF rectF = this.f32685c;
        float f10 = this.f32684a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f32690h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f32690h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f32687e && this.f32688f == z10 && this.f32689g == z11) {
            return;
        }
        this.f32687e = f10;
        this.f32688f = z10;
        this.f32689g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f32686d, this.f32684a);
    }

    public void h(float f10) {
        if (f10 == this.f32684a) {
            return;
        }
        this.f32684a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f32685c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f32686d.set(rect);
        if (this.f32688f) {
            this.f32686d.inset((int) Math.ceil(e.a(this.f32687e, this.f32684a, this.f32689g)), (int) Math.ceil(e.b(this.f32687e, this.f32684a, this.f32689g)));
            this.f32685c.set(this.f32686d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f32692j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f32690h;
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
        ColorStateList colorStateList = this.f32690h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.b.getColor();
        if (z10) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f32692j;
        if (colorStateList2 == null || (mode = this.f32693k) == null) {
            return z10;
        }
        this.f32691i = a(colorStateList2, mode);
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
        this.f32692j = colorStateList;
        this.f32691i = a(colorStateList, this.f32693k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f32693k = mode;
        this.f32691i = a(this.f32692j, mode);
        invalidateSelf();
    }
}

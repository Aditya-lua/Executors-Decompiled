package bd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class g extends androidx.appcompat.widget.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f3921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f3922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f3923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3926u;

    public g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3921p;
        if (drawable != null) {
            if (this.f3926u) {
                this.f3926u = false;
                Rect rect = this.f3922q;
                Rect rect2 = this.f3923r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3925t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3924s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f3921p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3921p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3921p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3921p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3924s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3921p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3926u = z10 | this.f3926u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f3926u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3921p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3921p);
            }
            this.f3921p = drawable;
            this.f3926u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3924s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f3924s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f3924s = i10;
            if (i10 == 119 && this.f3921p != null) {
                this.f3921p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3921p;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3922q = new Rect();
        this.f3923r = new Rect();
        this.f3924s = 119;
        this.f3925t = true;
        this.f3926u = false;
        TypedArray typedArrayI = o.i(context, attributeSet, jc.k.f20478b2, i10, 0, new int[0]);
        this.f3924s = typedArrayI.getInt(jc.k.f20498d2, this.f3924s);
        Drawable drawable = typedArrayI.getDrawable(jc.k.f20488c2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3925t = typedArrayI.getBoolean(jc.k.f20507e2, true);
        typedArrayI.recycle();
    }
}

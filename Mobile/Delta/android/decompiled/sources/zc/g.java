package zc;

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
    public Drawable f37408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f37409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f37410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f37411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f37413u;

    public g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f37408p;
        if (drawable != null) {
            if (this.f37413u) {
                this.f37413u = false;
                Rect rect = this.f37409q;
                Rect rect2 = this.f37410r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f37412t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f37411s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f37408p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f37408p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f37408p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f37408p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f37411s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f37408p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37413u = z10 | this.f37413u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f37413u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f37408p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f37408p);
            }
            this.f37408p = drawable;
            this.f37413u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f37411s == 119) {
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
        if (this.f37411s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f37411s = i10;
            if (i10 == 119 && this.f37408p != null) {
                this.f37408p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37408p;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37409q = new Rect();
        this.f37410r = new Rect();
        this.f37411s = 119;
        this.f37412t = true;
        this.f37413u = false;
        TypedArray typedArrayI = o.i(context, attributeSet, hc.k.f18968b2, i10, 0, new int[0]);
        this.f37411s = typedArrayI.getInt(hc.k.f18988d2, this.f37411s);
        Drawable drawable = typedArrayI.getDrawable(hc.k.f18978c2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f37412t = typedArrayI.getBoolean(hc.k.f18997e2, true);
        typedArrayI.recycle();
    }
}

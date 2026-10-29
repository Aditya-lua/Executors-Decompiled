package ad;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C0484b;
import androidx.core.view.GravityCompat;
import p194ic.C6747k;

/* JADX INFO: renamed from: ad.g */
/* JADX INFO: loaded from: classes2.dex */
public class C0135g extends C0484b {

    /* JADX INFO: renamed from: p */
    public Drawable f468p;

    /* JADX INFO: renamed from: q */
    public final Rect f469q;

    /* JADX INFO: renamed from: r */
    public final Rect f470r;

    /* JADX INFO: renamed from: s */
    public int f471s;

    /* JADX INFO: renamed from: t */
    public boolean f472t;

    /* JADX INFO: renamed from: u */
    public boolean f473u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0135g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f468p;
        if (drawable != null) {
            if (this.f473u) {
                this.f473u = false;
                Rect rect = this.f469q;
                Rect rect2 = this.f470r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f472t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f471s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f468p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f468p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f468p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f468p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f471s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f468p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f473u = z10 | this.f473u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f473u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f468p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f468p);
            }
            this.f468p = drawable;
            this.f473u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f471s == 119) {
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
        if (this.f471s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f471s = i10;
            if (i10 == 119 && this.f468p != null) {
                this.f468p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f468p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0135g(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f469q = new Rect();
        this.f470r = new Rect();
        this.f471s = 119;
        this.f472t = true;
        this.f473u = false;
        TypedArray typedArrayM436i = C0143o.m436i(context, attributeSet, C6747k.f26382b2, i10, 0, new int[0]);
        this.f471s = typedArrayM436i.getInt(C6747k.f26402d2, this.f471s);
        Drawable drawable = typedArrayM436i.getDrawable(C6747k.f26392c2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f472t = typedArrayM436i.getBoolean(C6747k.f26411e2, true);
        typedArrayM436i.recycle();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import i.f;
import i.j;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1002a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1010j;

    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new q.b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f20018a);
        this.f1005e = typedArrayObtainStyledAttributes.getDrawable(j.b);
        this.f1006f = typedArrayObtainStyledAttributes.getDrawable(j.f20032d);
        this.f1010j = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20062j, -1);
        boolean z10 = true;
        if (getId() == f.M) {
            this.f1008h = true;
            this.f1007g = typedArrayObtainStyledAttributes.getDrawable(j.f20027c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1008h ? this.f1005e != null || this.f1006f != null : this.f1007g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1005e;
        if (drawable != null && drawable.isStateful()) {
            this.f1005e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1006f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1006f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1007g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1007g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1005e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1006f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1007g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1003c = findViewById(f.f19954a);
        this.f1004d = findViewById(f.f19958f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1002a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1008h) {
            Drawable drawable2 = this.f1007g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f1005e != null) {
                if (this.f1003c.getVisibility() == 0) {
                    this.f1005e.setBounds(this.f1003c.getLeft(), this.f1003c.getTop(), this.f1003c.getRight(), this.f1003c.getBottom());
                } else {
                    View view2 = this.f1004d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1005e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1005e.setBounds(this.f1004d.getLeft(), this.f1004d.getTop(), this.f1004d.getRight(), this.f1004d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f1009i = z13;
            if (!z13 || (drawable = this.f1006f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f1003c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1010j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1003c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f1003c)) {
            iA = !b(this.f1004d) ? a(this.f1004d) : 0;
        } else {
            iA = a(this.f1003c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1005e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1005e);
        }
        this.f1005e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1003c;
            if (view != null) {
                this.f1005e.setBounds(view.getLeft(), this.f1003c.getTop(), this.f1003c.getRight(), this.f1003c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1008h ? !(this.f1005e != null || this.f1006f != null) : this.f1007g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1007g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1007g);
        }
        this.f1007g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1008h && (drawable2 = this.f1007g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1008h ? !(this.f1005e != null || this.f1006f != null) : this.f1007g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1006f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1006f);
        }
        this.f1006f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1009i && (drawable2 = this.f1006f) != null) {
                drawable2.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1008h ? !(this.f1005e != null || this.f1006f != null) : this.f1007g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(c cVar) {
        View view = this.b;
        if (view != null) {
            removeView(view);
        }
        this.b = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1002a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1005e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1006f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1007g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (drawable == this.f1005e && !this.f1008h) {
            return true;
        }
        if (drawable == this.f1006f && this.f1009i) {
            return true;
        }
        return (drawable == this.f1007g && this.f1008h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

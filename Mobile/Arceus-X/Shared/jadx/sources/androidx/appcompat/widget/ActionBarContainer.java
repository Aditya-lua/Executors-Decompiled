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
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6594f;
import p181i.C6598j;
import p365q.C10358b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1298a;

    /* JADX INFO: renamed from: b */
    public View f1299b;

    /* JADX INFO: renamed from: c */
    public View f1300c;

    /* JADX INFO: renamed from: d */
    public View f1301d;

    /* JADX INFO: renamed from: e */
    public Drawable f1302e;

    /* JADX INFO: renamed from: f */
    public Drawable f1303f;

    /* JADX INFO: renamed from: g */
    public Drawable f1304g;

    /* JADX INFO: renamed from: h */
    public boolean f1305h;

    /* JADX INFO: renamed from: i */
    public boolean f1306i;

    /* JADX INFO: renamed from: j */
    public int f1307j;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    public static class C0423a {
        /* JADX INFO: renamed from: a */
        public static void m1708a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C10358b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25326a);
        this.f1302e = typedArrayObtainStyledAttributes.getDrawable(C6598j.f25331b);
        this.f1303f = typedArrayObtainStyledAttributes.getDrawable(C6598j.f25341d);
        this.f1307j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6598j.f25371j, -1);
        boolean z10 = true;
        if (getId() == C6594f.f25125M) {
            this.f1305h = true;
            this.f1304g = typedArrayObtainStyledAttributes.getDrawable(C6598j.f25336c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1305h ? this.f1302e != null || this.f1303f != null : this.f1304g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    /* JADX INFO: renamed from: a */
    public final int m1706a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1707b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1302e;
        if (drawable != null && drawable.isStateful()) {
            this.f1302e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1303f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1303f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1304g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1304g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1299b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1302e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1303f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1304g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1300c = findViewById(C6594f.f25134a);
        this.f1301d = findViewById(C6594f.f25139f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1298a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1299b;
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
        if (this.f1305h) {
            Drawable drawable2 = this.f1304g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f1302e != null) {
                if (this.f1300c.getVisibility() == 0) {
                    this.f1302e.setBounds(this.f1300c.getLeft(), this.f1300c.getTop(), this.f1300c.getRight(), this.f1300c.getBottom());
                } else {
                    View view2 = this.f1301d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1302e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1302e.setBounds(this.f1301d.getLeft(), this.f1301d.getTop(), this.f1301d.getRight(), this.f1301d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f1306i = z13;
            if (!z13 || (drawable = this.f1303f) == null) {
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
        int iM1706a;
        int i12;
        if (this.f1300c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1307j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i10, i11);
        if (this.f1300c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1299b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (m1707b(this.f1300c)) {
            iM1706a = !m1707b(this.f1301d) ? m1706a(this.f1301d) : 0;
        } else {
            iM1706a = m1706a(this.f1300c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iM1706a + m1706a(this.f1299b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1302e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1302e);
        }
        this.f1302e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1300c;
            if (view != null) {
                this.f1302e.setBounds(view.getLeft(), this.f1300c.getTop(), this.f1300c.getRight(), this.f1300c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1305h ? !(this.f1302e != null || this.f1303f != null) : this.f1304g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        C0423a.m1708a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1304g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1304g);
        }
        this.f1304g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1305h && (drawable2 = this.f1304g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1305h ? !(this.f1302e != null || this.f1303f != null) : this.f1304g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        C0423a.m1708a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1303f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1303f);
        }
        this.f1303f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1306i && (drawable2 = this.f1303f) != null) {
                drawable2.setBounds(this.f1299b.getLeft(), this.f1299b.getTop(), this.f1299b.getRight(), this.f1299b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1305h ? !(this.f1302e != null || this.f1303f != null) : this.f1304g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        C0423a.m1708a(this);
    }

    public void setTabContainer(C0485c c0485c) {
        View view = this.f1299b;
        if (view != null) {
            removeView(view);
        }
        this.f1299b = c0485c;
        if (c0485c != null) {
            addView(c0485c);
            ViewGroup.LayoutParams layoutParams = c0485c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0485c.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1298a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1302e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1303f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1304g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (drawable == this.f1302e && !this.f1305h) {
            return true;
        }
        if (drawable == this.f1303f && this.f1306i) {
            return true;
        }
        return (drawable == this.f1304g && this.f1305h) || super.verifyDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

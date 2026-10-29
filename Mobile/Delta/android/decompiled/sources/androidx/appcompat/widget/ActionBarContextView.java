package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.core.view.o0;
import androidx.core.view.y0;
import i.f;
import i.g;
import i.j;
import q.a1;
import q.g1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends q.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f1015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f1016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f1017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f1018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1022t;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.b f1023a;

        public a(o.b bVar) {
            this.f1023a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1023a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ y0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1013k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1012j;
    }

    public CharSequence getTitle() {
        return this.f1011i;
    }

    public void h(o.b bVar) {
        View view = this.f1013k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1022t, (ViewGroup) this, false);
            this.f1013k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1013k);
        }
        View viewFindViewById = this.f1013k.findViewById(f.f19961i);
        this.f1014l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        androidx.appcompat.widget.a aVar = this.f28897d;
        if (aVar != null) {
            aVar.z();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f28897d = aVar2;
        aVar2.K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f28897d, this.b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f28897d.p(this);
        this.f28896c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f28896c, layoutParams);
    }

    public final void i() {
        if (this.f1016n == null) {
            LayoutInflater.from(getContext()).inflate(g.f19979a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1016n = linearLayout;
            this.f1017o = (TextView) linearLayout.findViewById(f.f19957e);
            this.f1018p = (TextView) this.f1016n.findViewById(f.f19956d);
            if (this.f1019q != 0) {
                this.f1017o.setTextAppearance(getContext(), this.f1019q);
            }
            if (this.f1020r != 0) {
                this.f1018p.setTextAppearance(getContext(), this.f1020r);
            }
        }
        this.f1017o.setText(this.f1011i);
        this.f1018p.setText(this.f1012j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1011i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1012j);
        this.f1018p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1016n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1016n.getParent() == null) {
            addView(this.f1016n);
        }
    }

    public boolean j() {
        return this.f1021s;
    }

    public void k() {
        removeAllViews();
        this.f1015m = null;
        this.f28896c = null;
        this.f28897d = null;
        View view = this.f1014l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f28897d;
        if (aVar != null) {
            return aVar.L();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f28897d;
        if (aVar != null) {
            aVar.C();
            this.f28897d.D();
        }
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = g1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1013k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1013k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = q.a.d(paddingRight, i14, zB);
            paddingRight = q.a.d(iD + e(this.f1013k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f1016n;
        if (linearLayout != null && this.f1015m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f1016n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f1015m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f28896c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f28898e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1013k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1013k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f28896c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f28896c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1016n;
        if (linearLayout != null && this.f1015m == null) {
            if (this.f1021s) {
                this.f1016n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1016n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1016n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1015m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f1015m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f28898e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // q.a
    public void setContentHeight(int i10) {
        this.f28898e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1015m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1015m = view;
        if (view != null && (linearLayout = this.f1016n) != null) {
            removeView(linearLayout);
            this.f1016n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1012j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1011i = charSequence;
        i();
        o0.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1021s) {
            requestLayout();
        }
        this.f1021s = z10;
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f19895k);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1 a1VarV = a1.v(context, attributeSet, j.f20137y, i10, 0);
        setBackground(a1VarV.g(j.f20142z));
        this.f1019q = a1VarV.n(j.D, 0);
        this.f1020r = a1VarV.n(j.C, 0);
        this.f28898e = a1VarV.m(j.B, 0);
        this.f1022t = a1VarV.n(j.A, g.f19981d);
        a1VarV.x();
    }
}

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
import q.b1;
import q.h1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends q.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f848t;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.b f849a;

        public a(o.b bVar) {
            this.f849a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f849a.c();
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
        if (this.f839k == null) {
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
        return this.f838j;
    }

    public CharSequence getTitle() {
        return this.f837i;
    }

    public void h(o.b bVar) {
        View view = this.f839k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f848t, (ViewGroup) this, false);
            this.f839k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f839k);
        }
        View viewFindViewById = this.f839k.findViewById(f.f18804i);
        this.f840l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        androidx.appcompat.widget.a aVar = this.f29436d;
        if (aVar != null) {
            aVar.z();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f29436d = aVar2;
        aVar2.K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f29436d, this.b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f29436d.p(this);
        this.f29435c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f29435c, layoutParams);
    }

    public final void i() {
        if (this.f842n == null) {
            LayoutInflater.from(getContext()).inflate(g.f18822a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f842n = linearLayout;
            this.f843o = (TextView) linearLayout.findViewById(f.f18800e);
            this.f844p = (TextView) this.f842n.findViewById(f.f18799d);
            if (this.f845q != 0) {
                this.f843o.setTextAppearance(getContext(), this.f845q);
            }
            if (this.f846r != 0) {
                this.f844p.setTextAppearance(getContext(), this.f846r);
            }
        }
        this.f843o.setText(this.f837i);
        this.f844p.setText(this.f838j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f837i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f838j);
        this.f844p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f842n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f842n.getParent() == null) {
            addView(this.f842n);
        }
    }

    public boolean j() {
        return this.f847s;
    }

    public void k() {
        removeAllViews();
        this.f841m = null;
        this.f29435c = null;
        this.f29436d = null;
        View view = this.f840l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f29436d;
        if (aVar != null) {
            return aVar.L();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f29436d;
        if (aVar != null) {
            aVar.C();
            this.f29436d.D();
        }
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = h1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f839k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f839k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = q.a.d(paddingRight, i14, zB);
            paddingRight = q.a.d(iD + e(this.f839k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f842n;
        if (linearLayout != null && this.f841m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f842n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f841m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f29435c;
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
        int size2 = this.f29437e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f839k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f839k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f29435c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f29435c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f842n;
        if (linearLayout != null && this.f841m == null) {
            if (this.f847s) {
                this.f842n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f842n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f842n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f841m;
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
            this.f841m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f29437e > 0) {
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
        this.f29437e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f841m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f841m = view;
        if (view != null && (linearLayout = this.f842n) != null) {
            removeView(linearLayout);
            this.f842n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f838j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f837i = charSequence;
        i();
        o0.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f847s) {
            requestLayout();
        }
        this.f847s = z10;
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
        this(context, attributeSet, i.a.f18738k);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1 b1VarV = b1.v(context, attributeSet, j.f18980y, i10, 0);
        setBackground(b1VarV.g(j.f18985z));
        this.f845q = b1VarV.n(j.D, 0);
        this.f846r = b1VarV.n(j.C, 0);
        this.f29437e = b1VarV.m(j.B, 0);
        this.f848t = b1VarV.n(j.A, g.f18824d);
        b1VarV.x();
    }
}

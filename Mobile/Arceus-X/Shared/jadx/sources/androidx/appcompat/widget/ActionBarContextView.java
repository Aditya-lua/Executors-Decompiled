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
import androidx.appcompat.view.menu.C0415e;
import androidx.core.view.C0625o0;
import androidx.core.view.C0645y0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6589a;
import p181i.C6594f;
import p181i.C6595g;
import p181i.C6598j;
import p316o.AbstractC9609b;
import p365q.AbstractC10355a;
import p365q.C10357a1;
import p365q.C10375g1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC10355a {

    /* JADX INFO: renamed from: i */
    public CharSequence f1308i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1309j;

    /* JADX INFO: renamed from: k */
    public View f1310k;

    /* JADX INFO: renamed from: l */
    public View f1311l;

    /* JADX INFO: renamed from: m */
    public View f1312m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f1313n;

    /* JADX INFO: renamed from: o */
    public TextView f1314o;

    /* JADX INFO: renamed from: p */
    public TextView f1315p;

    /* JADX INFO: renamed from: q */
    public int f1316q;

    /* JADX INFO: renamed from: r */
    public int f1317r;

    /* JADX INFO: renamed from: s */
    public boolean f1318s;

    /* JADX INFO: renamed from: t */
    public int f1319t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0424a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9609b f1320a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewOnClickListenerC0424a(AbstractC9609b abstractC9609b) {
            this.f1320a = abstractC9609b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1320a.mo29658c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p365q.AbstractC10355a
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ C0645y0 mo1709f(int i10, long j10) {
        return super.mo1709f(i10, j10);
    }

    /* JADX INFO: renamed from: g */
    public void m1710g() {
        if (this.f1310k == null) {
            m1714k();
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

    @Override // p365q.AbstractC10355a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p365q.AbstractC10355a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1309j;
    }

    public CharSequence getTitle() {
        return this.f1308i;
    }

    /* JADX INFO: renamed from: h */
    public void m1711h(AbstractC9609b abstractC9609b) {
        View view = this.f1310k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1319t, (ViewGroup) this, false);
            this.f1310k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1310k);
        }
        View viewFindViewById = this.f1310k.findViewById(C6594f.f25142i);
        this.f1311l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0424a(abstractC9609b));
        C0415e c0415e = (C0415e) abstractC9609b.mo29660e();
        C0483a c0483a = this.f37210d;
        if (c0483a != null) {
            c0483a.m1966z();
        }
        C0483a c0483a2 = new C0483a(getContext());
        this.f37210d = c0483a2;
        c0483a2.m1963K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0415e.m1630c(this.f37210d, this.f37208b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f37210d.mo1566p(this);
        this.f37209c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f37209c, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m1712i() {
        if (this.f1313n == null) {
            LayoutInflater.from(getContext()).inflate(C6595g.f25160a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1313n = linearLayout;
            this.f1314o = (TextView) linearLayout.findViewById(C6594f.f25138e);
            this.f1315p = (TextView) this.f1313n.findViewById(C6594f.f25137d);
            if (this.f1316q != 0) {
                this.f1314o.setTextAppearance(getContext(), this.f1316q);
            }
            if (this.f1317r != 0) {
                this.f1315p.setTextAppearance(getContext(), this.f1317r);
            }
        }
        this.f1314o.setText(this.f1308i);
        this.f1315p.setText(this.f1309j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1308i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1309j);
        this.f1315p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1313n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1313n.getParent() == null) {
            addView(this.f1313n);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m1713j() {
        return this.f1318s;
    }

    /* JADX INFO: renamed from: k */
    public void m1714k() {
        removeAllViews();
        this.f1312m = null;
        this.f37209c = null;
        this.f37210d = null;
        View view = this.f1311l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m1715l() {
        C0483a c0483a = this.f37210d;
        if (c0483a != null) {
            return c0483a.m1964L();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0483a c0483a = this.f37210d;
        if (c0483a != null) {
            c0483a.m1955C();
            this.f37210d.m1956D();
        }
    }

    @Override // p365q.AbstractC10355a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zM39840b = C10375g1.m39840b(this);
        int paddingRight = zM39840b ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1310k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1310k.getLayoutParams();
            int i14 = zM39840b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zM39840b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM39686d = AbstractC10355a.m39686d(paddingRight, i14, zM39840b);
            paddingRight = AbstractC10355a.m39686d(iM39686d + m39688e(this.f1310k, iM39686d, paddingTop, paddingTop2, zM39840b), i15, zM39840b);
        }
        int iM39688e = paddingRight;
        LinearLayout linearLayout = this.f1313n;
        if (linearLayout != null && this.f1312m == null && linearLayout.getVisibility() != 8) {
            iM39688e += m39688e(this.f1313n, iM39688e, paddingTop, paddingTop2, zM39840b);
        }
        View view2 = this.f1312m;
        if (view2 != null) {
            m39688e(view2, iM39688e, paddingTop, paddingTop2, zM39840b);
        }
        int paddingLeft = zM39840b ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f37209c;
        if (actionMenuView != null) {
            m39688e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM39840b);
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
        int size2 = this.f37211e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        View view = this.f1310k;
        if (view != null) {
            int iM39687c = m39687c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1310k.getLayoutParams();
            paddingLeft = iM39687c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f37209c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m39687c(this.f37209c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1313n;
        if (linearLayout != null && this.f1312m == null) {
            if (this.f1318s) {
                this.f1313n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1313n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1313n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = m39687c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1312m;
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
            this.f1312m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f37211e > 0) {
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

    @Override // p365q.AbstractC10355a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p365q.AbstractC10355a
    public void setContentHeight(int i10) {
        this.f37211e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1312m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1312m = view;
        if (view != null && (linearLayout = this.f1313n) != null) {
            removeView(linearLayout);
            this.f1313n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1309j = charSequence;
        m1712i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1308i = charSequence;
        m1712i();
        C0625o0.m3046p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1318s) {
            requestLayout();
        }
        this.f1318s = z10;
    }

    @Override // p365q.AbstractC10355a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25032k);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, C6598j.f25446y, i10, 0);
        setBackground(c10357a1M39728v.m39735g(C6598j.f25451z));
        this.f1316q = c10357a1M39728v.m39742n(C6598j.f25217D, 0);
        this.f1317r = c10357a1M39728v.m39742n(C6598j.f25212C, 0);
        this.f37211e = c10357a1M39728v.m39741m(C6598j.f25207B, 0);
        this.f1319t = c10357a1M39728v.m39742n(C6598j.f25202A, C6595g.f25163d);
        c10357a1M39728v.m39749x();
    }
}

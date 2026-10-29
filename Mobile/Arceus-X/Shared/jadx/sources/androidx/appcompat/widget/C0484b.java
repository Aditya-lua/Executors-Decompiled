package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6598j;
import p365q.C10357a1;
import p365q.C10375g1;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C0484b extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f1669a;

    /* JADX INFO: renamed from: b */
    public int f1670b;

    /* JADX INFO: renamed from: c */
    public int f1671c;

    /* JADX INFO: renamed from: d */
    public int f1672d;

    /* JADX INFO: renamed from: e */
    public int f1673e;

    /* JADX INFO: renamed from: f */
    public int f1674f;

    /* JADX INFO: renamed from: g */
    public float f1675g;

    /* JADX INFO: renamed from: h */
    public boolean f1676h;

    /* JADX INFO: renamed from: i */
    public int[] f1677i;

    /* JADX INFO: renamed from: j */
    public int[] f1678j;

    /* JADX INFO: renamed from: k */
    public Drawable f1679k;

    /* JADX INFO: renamed from: l */
    public int f1680l;

    /* JADX INFO: renamed from: m */
    public int f1681m;

    /* JADX INFO: renamed from: n */
    public int f1682n;

    /* JADX INFO: renamed from: o */
    public int f1683o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    public static class a extends LinearLayout.LayoutParams {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0484b(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: j */
    private void m1967j(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewM1977q = m1977q(i13);
            if (viewM1977q.getVisibility() != 8) {
                a aVar = (a) viewM1977q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewM1977q.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(viewM1977q, iMakeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                } else {
                    i12 = i11;
                }
            } else {
                i12 = i11;
            }
            i13++;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1968y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: e */
    public void m1969e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zM39840b = C10375g1.m39840b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewM1977q = m1977q(i11);
            if (viewM1977q != null && viewM1977q.getVisibility() != 8 && m1978r(i11)) {
                a aVar = (a) viewM1977q.getLayoutParams();
                m1972h(canvas, zM39840b ? viewM1977q.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewM1977q.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1680l);
            }
        }
        if (m1978r(virtualChildCount)) {
            View viewM1977q2 = m1977q(virtualChildCount - 1);
            if (viewM1977q2 != null) {
                a aVar2 = (a) viewM1977q2.getLayoutParams();
                if (zM39840b) {
                    left = viewM1977q2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f1680l;
                    right = left - i10;
                } else {
                    right = viewM1977q2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zM39840b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f1680l;
                right = left - i10;
            }
            m1972h(canvas, right);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1970f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewM1977q = m1977q(i10);
            if (viewM1977q != null && viewM1977q.getVisibility() != 8 && m1978r(i10)) {
                m1971g(canvas, (viewM1977q.getTop() - ((LinearLayout.LayoutParams) ((a) viewM1977q.getLayoutParams())).topMargin) - this.f1681m);
            }
        }
        if (m1978r(virtualChildCount)) {
            View viewM1977q2 = m1977q(virtualChildCount - 1);
            m1971g(canvas, viewM1977q2 == null ? (getHeight() - getPaddingBottom()) - this.f1681m : viewM1977q2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewM1977q2.getLayoutParams())).bottomMargin);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1971g(Canvas canvas, int i10) {
        this.f1679k.setBounds(getPaddingLeft() + this.f1683o, i10, (getWidth() - getPaddingRight()) - this.f1683o, this.f1681m + i10);
        this.f1679k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1670b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1670b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1670b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1671c;
        if (this.f1672d == 1 && (i10 = this.f1673e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1674f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1674f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1670b;
    }

    public Drawable getDividerDrawable() {
        return this.f1679k;
    }

    public int getDividerPadding() {
        return this.f1683o;
    }

    public int getDividerWidth() {
        return this.f1680l;
    }

    public int getGravity() {
        return this.f1673e;
    }

    public int getOrientation() {
        return this.f1672d;
    }

    public int getShowDividers() {
        return this.f1682n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1675g;
    }

    /* JADX INFO: renamed from: h */
    public void m1972h(Canvas canvas, int i10) {
        this.f1679k.setBounds(i10, getPaddingTop() + this.f1683o, this.f1680l + i10, (getHeight() - getPaddingBottom()) - this.f1683o);
        this.f1679k.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: i */
    public final void m1973i(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewM1977q = m1977q(i13);
            if (viewM1977q.getVisibility() != 8) {
                a aVar = (a) viewM1977q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewM1977q.getMeasuredWidth();
                    i12 = i11;
                    measureChildWithMargins(viewM1977q, i12, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                } else {
                    i12 = i11;
                }
            } else {
                i12 = i11;
            }
            i13++;
            i11 = i12;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1672d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    /* JADX INFO: renamed from: n */
    public int m1974n(View view, int i10) {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int m1975o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f1679k == null) {
            return;
        }
        if (this.f1672d == 1) {
            m1970f(canvas);
        } else {
            m1969e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1672d == 1) {
            m1980t(i10, i11, i12, i13);
        } else {
            m1979s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1672d == 1) {
            m1984x(i10, i11);
        } else {
            m1982v(i10, i11);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m1976p(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public View m1977q(int i10) {
        return getChildAt(i10);
    }

    /* JADX INFO: renamed from: r */
    public boolean m1978r(int i10) {
        if (i10 == 0) {
            return (this.f1682n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1682n & 4) != 0;
        }
        if ((this.f1682n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX INFO: renamed from: s */
    public void m1979s(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int iM1974n;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        boolean zM39840b = C10375g1.m39840b(this);
        int paddingTop = getPaddingTop();
        int i22 = i13 - i11;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i23 = this.f1673e;
        int i24 = i23 & 112;
        boolean z10 = this.f1669a;
        int[] iArr = this.f1677i;
        int[] iArr2 = this.f1678j;
        int iM2930b = C0614k.m2930b(8388615 & i23, getLayoutDirection());
        char c12 = 2;
        char c13 = 1;
        if (iM2930b != 1) {
            paddingLeft = iM2930b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f1674f;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f1674f) / 2);
        }
        if (zM39840b) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i25 = 0;
        while (i25 < virtualChildCount) {
            int i26 = i14 + (i15 * i25);
            int i27 = i25;
            View viewM1977q = m1977q(i26);
            if (viewM1977q == null) {
                paddingLeft += m1983w(i26);
                iM1974n = i27;
                i16 = paddingTop;
                c10 = c12;
                c11 = c13;
            } else {
                c10 = c12;
                c11 = c13;
                if (viewM1977q.getVisibility() != 8) {
                    int measuredWidth = viewM1977q.getMeasuredWidth();
                    int measuredHeight2 = viewM1977q.getMeasuredHeight();
                    a aVar = (a) viewM1977q.getLayoutParams();
                    int i28 = paddingLeft;
                    if (z10) {
                        i17 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewM1977q.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i18 < 0) {
                            i18 = i24;
                        }
                        i19 = i18 & 112;
                        i16 = paddingTop;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                i20 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i20 += iArr[c11] - baseline;
                                }
                            } else if (i19 != 80) {
                                i20 = i16;
                            } else {
                                i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c10] - (viewM1977q.getMeasuredHeight() - baseline);
                                }
                            }
                            if (m1978r(i26)) {
                                i21 = i28 + this.f1680l;
                            } else {
                                i21 = i28;
                            }
                            int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                            m1968y(viewM1977q, m1975o(viewM1977q) + i29, i20, measuredWidth, i17);
                            int iM1976p = i29 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m1976p(viewM1977q);
                            iM1974n = m1974n(viewM1977q, i26) + i27;
                            paddingLeft = iM1976p;
                        } else {
                            i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (m1978r(i26)) {
                            i21 = i28 + this.f1680l;
                        } else {
                            i21 = i28;
                        }
                        int i210 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        m1968y(viewM1977q, m1975o(viewM1977q) + i210, i20, measuredWidth, i17);
                        int iM1976p2 = i210 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m1976p(viewM1977q);
                        iM1974n = m1974n(viewM1977q, i26) + i27;
                        paddingLeft = iM1976p2;
                    } else {
                        i17 = measuredHeight2;
                    }
                    i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                        i18 = i24;
                    }
                    i19 = i18 & 112;
                    i16 = paddingTop;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            i20 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i20 += iArr[c11] - baseline;
                            }
                        } else if (i19 != 80) {
                            i20 = i16;
                        } else {
                            i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c10] - (viewM1977q.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m1978r(i26)) {
                            i21 = i28 + this.f1680l;
                        } else {
                            i21 = i28;
                        }
                        int i211 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        m1968y(viewM1977q, m1975o(viewM1977q) + i211, i20, measuredWidth, i17);
                        int iM1976p3 = i211 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m1976p(viewM1977q);
                        iM1974n = m1974n(viewM1977q, i26) + i27;
                        paddingLeft = iM1976p3;
                    } else {
                        i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (m1978r(i26)) {
                        i21 = i28 + this.f1680l;
                    } else {
                        i21 = i28;
                    }
                    int i212 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                    m1968y(viewM1977q, m1975o(viewM1977q) + i212, i20, measuredWidth, i17);
                    int iM1976p4 = i212 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m1976p(viewM1977q);
                    iM1974n = m1974n(viewM1977q, i26) + i27;
                    paddingLeft = iM1976p4;
                } else {
                    i16 = paddingTop;
                    iM1974n = i27;
                }
            }
            i25 = iM1974n + 1;
            c12 = c10;
            c13 = c11;
            paddingTop = i16;
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1669a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1670b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1679k) {
            return;
        }
        this.f1679k = drawable;
        if (drawable != null) {
            this.f1680l = drawable.getIntrinsicWidth();
            this.f1681m = drawable.getIntrinsicHeight();
        } else {
            this.f1680l = 0;
            this.f1681m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1683o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1673e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1673e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i12 = this.f1673e;
        if ((8388615 & i12) != i11) {
            this.f1673e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1676h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1672d != i10) {
            this.f1672d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1682n) {
            requestLayout();
        }
        this.f1682n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1673e;
        if ((i12 & 112) != i11) {
            this.f1673e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1675g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: t */
    public void m1980t(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f1673e;
        int i19 = i18 & 112;
        int i20 = i18 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i19 != 16) {
            paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f1674f;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f1674f) / 2);
        }
        int iM1974n = 0;
        while (iM1974n < virtualChildCount) {
            View viewM1977q = m1977q(iM1974n);
            if (viewM1977q == null) {
                paddingTop += m1983w(iM1974n);
            } else {
                if (viewM1977q.getVisibility() != 8) {
                    int measuredWidth = viewM1977q.getMeasuredWidth();
                    int measuredHeight = viewM1977q.getMeasuredHeight();
                    a aVar = (a) viewM1977q.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i21 < 0) {
                        i21 = i20;
                    }
                    int iM2930b = C0614k.m2930b(i21, getLayoutDirection()) & 7;
                    if (iM2930b != 1) {
                        if (iM2930b != 5) {
                            i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i22 = i16;
                        if (m1978r(iM1974n)) {
                            paddingTop += this.f1681m;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        m1968y(viewM1977q, i22, i23 + m1975o(viewM1977q), measuredWidth, measuredHeight);
                        paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + m1976p(viewM1977q);
                        iM1974n += m1974n(viewM1977q, iM1974n);
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i24 = i16;
                    if (m1978r(iM1974n)) {
                        paddingTop += this.f1681m;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    m1968y(viewM1977q, i24, i25 + m1975o(viewM1977q), measuredWidth, measuredHeight);
                    paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + m1976p(viewM1977q);
                    iM1974n += m1974n(viewM1977q, iM1974n);
                }
                iM1974n++;
            }
            iM1974n++;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1981u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    /* JADX INFO: renamed from: v */
    public void m1982v(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int iMax;
        int i18;
        int baseline;
        int i19;
        int i20;
        byte b;
        int i21;
        int i22;
        int i23;
        boolean z10;
        View view;
        boolean z11;
        int baseline2;
        this.f1674f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f1677i == null || this.f1678j == null) {
            this.f1677i = new int[4];
            this.f1678j = new int[4];
        }
        int[] iArr = this.f1677i;
        int[] iArr2 = this.f1678j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z12 = this.f1669a;
        boolean z13 = this.f1676h;
        int i24 = 1073741824;
        boolean z14 = mode == 1073741824;
        boolean z15 = z13;
        int iM1974n = 0;
        int i25 = 0;
        int iMax2 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f11 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i12 = i25;
            if (iM1974n >= virtualChildCount) {
                break;
            }
            boolean z19 = z12;
            View viewM1977q = m1977q(iM1974n);
            if (viewM1977q == null) {
                this.f1674f += m1983w(iM1974n);
            } else {
                if (viewM1977q.getVisibility() == 8) {
                    iM1974n += m1974n(viewM1977q, iM1974n);
                } else {
                    if (m1978r(iM1974n)) {
                        this.f1674f += this.f1680l;
                    }
                    a aVar = (a) viewM1977q.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f13 = f11 + f12;
                    if (mode == i24 && ((LinearLayout.LayoutParams) aVar).width == 0 && f12 > 0.0f) {
                        if (z14) {
                            this.f1674f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i26 = this.f1674f;
                            this.f1674f = Math.max(i26, ((LinearLayout.LayoutParams) aVar).leftMargin + i26 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z19) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewM1977q.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z16 = true;
                        }
                        i22 = i12;
                        i23 = 1073741824;
                        z10 = z15;
                        view = viewM1977q;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f12 <= 0.0f) {
                            b = -2;
                            i21 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            b = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i21 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i22 = i12;
                        i23 = 1073741824;
                        z10 = z15;
                        iArr2 = iArr2;
                        int i27 = i21;
                        m1981u(viewM1977q, iM1974n, i10, f13 == 0.0f ? this.f1674f : 0, i11, 0);
                        view = viewM1977q;
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i27;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z14) {
                            this.f1674f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + m1976p(view);
                        } else {
                            int i28 = this.f1674f;
                            this.f1674f = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + m1976p(view));
                        }
                        if (z10) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i23 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z17 = true;
                    }
                    int i29 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i29;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z19 && (baseline2 = view.getBaseline()) != -1) {
                        int i30 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i30 < 0) {
                            i30 = this.f1673e;
                        }
                        int i31 = (((i30 & 112) >> 4) & (-2)) >> 1;
                        iArr[i31] = Math.max(iArr[i31], baseline2);
                        iArr2[i31] = Math.max(iArr2[i31], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i22, measuredHeight);
                    z18 = z18 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z11) {
                            i29 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i29);
                    } else {
                        if (z11 == 0) {
                            i29 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i29);
                    }
                    iM1974n += m1974n(view, iM1974n);
                    i25 = iMax5;
                    f11 = f13;
                }
                iM1974n++;
                z15 = z10;
                iArr2 = iArr2;
                z12 = z19;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i24 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i25 = i12;
            z10 = z15;
            iM1974n++;
            z15 = z10;
            iArr2 = iArr2;
            z12 = z19;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i24 = 1073741824;
        }
        boolean z20 = z12;
        int i32 = virtualChildCount;
        int i33 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i34 = iCombineMeasuredStates;
        boolean z21 = z15;
        if (this.f1674f > 0) {
            i13 = i32;
            if (m1978r(i13)) {
                this.f1674f += this.f1680l;
            }
        } else {
            i13 = i32;
        }
        int i35 = iArr3[1];
        int iMax6 = (i35 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i12 : Math.max(i12, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i35, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z21) {
            i14 = i33;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f1674f = 0;
                int iM1974n2 = 0;
                while (iM1974n2 < i13) {
                    View viewM1977q2 = m1977q(iM1974n2);
                    if (viewM1977q2 == null) {
                        this.f1674f += m1983w(iM1974n2);
                    } else {
                        if (viewM1977q2.getVisibility() == 8) {
                            iM1974n2 += m1974n(viewM1977q2, iM1974n2);
                        } else {
                            a aVar2 = (a) viewM1977q2.getLayoutParams();
                            if (z14) {
                                this.f1674f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + m1976p(viewM1977q2);
                            } else {
                                f11 = f11;
                                int i36 = this.f1674f;
                                this.f1674f = Math.max(i36, i36 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + m1976p(viewM1977q2));
                            }
                        }
                        iM1974n2++;
                        f11 = f11;
                        iMax6 = iMax6;
                    }
                    iM1974n2++;
                    f11 = f11;
                    iMax6 = iMax6;
                }
            }
            f10 = f11;
        } else {
            f10 = f11;
            i14 = i33;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f1674f + getPaddingLeft() + getPaddingRight();
        this.f1674f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i37 = (16777215 & iResolveSizeAndState) - this.f1674f;
        if (z16 || (i37 != 0 && f10 > 0.0f)) {
            float f14 = this.f1675g;
            if (f14 > 0.0f) {
                f10 = f14;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.f1674f = 0;
            int iCombineMeasuredStates2 = i34;
            int iMax8 = -1;
            int i38 = 0;
            while (i38 < i13) {
                View viewM1977q3 = m1977q(i38);
                if (viewM1977q3 == null || viewM1977q3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewM1977q3.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f15 > 0.0f) {
                        int i39 = (int) ((i37 * f15) / f10);
                        f10 -= f15;
                        i37 -= i39;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i20 = 1073741824;
                            if (i14 == 1073741824) {
                                if (i39 <= 0) {
                                    i39 = 0;
                                }
                                viewM1977q3.measure(View.MeasureSpec.makeMeasureSpec(i39, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM1977q3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        } else {
                            i20 = 1073741824;
                        }
                        int measuredWidth2 = viewM1977q3.getMeasuredWidth() + i39;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewM1977q3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i20), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM1977q3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                    }
                    if (z14) {
                        this.f1674f += viewM1977q3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + m1976p(viewM1977q3);
                    } else {
                        int i40 = this.f1674f;
                        this.f1674f = Math.max(i40, viewM1977q3.getMeasuredWidth() + i40 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + m1976p(viewM1977q3));
                    }
                    boolean z22 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i41 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewM1977q3.getMeasuredHeight() + i41;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z22) {
                        i41 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i41);
                    if (z18) {
                        i18 = -1;
                        boolean z23 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z20 && (baseline = viewM1977q3.getBaseline()) != i18) {
                            i19 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i19 < 0) {
                                i19 = this.f1673e;
                            }
                            int i42 = (((i19 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i42] = Math.max(iArr3[i42], baseline);
                            iArr4[i42] = Math.max(iArr4[i42], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z18 = z23;
                    } else {
                        i18 = -1;
                    }
                    if (z20) {
                        i19 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i19 < 0) {
                            i19 = this.f1673e;
                        }
                        int i43 = (((i19 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i43] = Math.max(iArr3[i43], baseline);
                        iArr4[i43] = Math.max(iArr4[i43], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z18 = z23;
                }
                i38++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i15 = iResolveSizeAndState;
            i16 = ViewCompat.MEASURED_STATE_MASK;
            this.f1674f += getPaddingLeft() + getPaddingRight();
            int i44 = iArr3[1];
            iMax7 = (i44 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i44, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i17 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z21 && i14 != 1073741824) {
                for (int i45 = 0; i45 < i13; i45++) {
                    View viewM1977q4 = m1977q(i45);
                    if (viewM1977q4 != null && viewM1977q4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewM1977q4.getLayoutParams())).weight > 0.0f) {
                        viewM1977q4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewM1977q4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = iResolveSizeAndState;
            i17 = i34;
            i16 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (z18 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z17) {
            m1973i(i13, i10);
        }
    }

    /* JADX INFO: renamed from: w */
    public int m1983w(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX INFO: renamed from: x */
    public void m1984x(int i10, int i11) {
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        boolean z10;
        int iMax2;
        boolean z11;
        int iMax3;
        int i22;
        this.f1674f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i23 = this.f1670b;
        boolean z12 = this.f1676h;
        int iM1974n = 0;
        int i24 = 0;
        int iMax4 = 0;
        int i25 = 0;
        int i26 = 0;
        int iMax5 = 0;
        boolean z13 = false;
        boolean z14 = false;
        float f10 = 0.0f;
        boolean z15 = true;
        while (true) {
            int i27 = 8;
            if (iM1974n >= virtualChildCount) {
                float f11 = f10;
                int i28 = i24;
                int i29 = virtualChildCount;
                int i30 = mode2;
                boolean z16 = z12;
                int i31 = iMax4;
                int iMax6 = i25;
                int iCombineMeasuredStates = i26;
                if (this.f1674f > 0) {
                    i12 = i29;
                    if (m1978r(i12)) {
                        this.f1674f += this.f1681m;
                    }
                } else {
                    i12 = i29;
                }
                int i32 = i30;
                if (z16 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.f1674f = 0;
                    int iM1974n2 = 0;
                    while (iM1974n2 < i12) {
                        View viewM1977q = m1977q(iM1974n2);
                        if (viewM1977q == null) {
                            this.f1674f += m1983w(iM1974n2);
                        } else if (viewM1977q.getVisibility() == i27) {
                            iM1974n2 += m1974n(viewM1977q, iM1974n2);
                        } else {
                            a aVar = (a) viewM1977q.getLayoutParams();
                            int i33 = this.f1674f;
                            this.f1674f = Math.max(i33, i33 + i31 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + m1976p(viewM1977q));
                        }
                        iM1974n2++;
                        i27 = 8;
                    }
                }
                int paddingTop = this.f1674f + getPaddingTop() + getPaddingBottom();
                this.f1674f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i34 = (16777215 & iResolveSizeAndState) - this.f1674f;
                if (z13 || (i34 != 0 && f11 > 0.0f)) {
                    float f12 = this.f1675g;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f1674f = 0;
                    float f13 = f12;
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < i12) {
                        View viewM1977q2 = m1977q(i36);
                        if (viewM1977q2.getVisibility() == 8) {
                            i32 = i32;
                            i36 = i36;
                        } else {
                            a aVar2 = (a) viewM1977q2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                int i37 = (int) ((i35 * f14) / f13);
                                f13 -= f14;
                                i35 -= i37;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i14 = 1073741824;
                                    if (i32 == 1073741824) {
                                        viewM1977q2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i37 > 0 ? i37 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM1977q2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredHeight = viewM1977q2.getMeasuredHeight() + i37;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewM1977q2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM1977q2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            } else {
                                i32 = i32;
                            }
                            int i38 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewM1977q2.getMeasuredWidth() + i38;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i38;
                                }
                            } else {
                                i13 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z17 = z15 && ((LinearLayout.LayoutParams) aVar2).width == i13;
                            int i39 = this.f1674f;
                            this.f1674f = Math.max(i39, i39 + viewM1977q2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + m1976p(viewM1977q2));
                            iMax5 = iMax7;
                            z15 = z17;
                        }
                        i36++;
                        i32 = i32;
                    }
                    this.f1674f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i28);
                    if (z16 && i32 != 1073741824) {
                        for (int i40 = 0; i40 < i12; i40++) {
                            View viewM1977q3 = m1977q(i40);
                            if (viewM1977q3 != null && viewM1977q3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewM1977q3.getLayoutParams())).weight > 0.0f) {
                                viewM1977q3.measure(View.MeasureSpec.makeMeasureSpec(viewM1977q3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                }
                if (!z15 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z14) {
                    m1967j(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View viewM1977q4 = m1977q(iM1974n);
            if (viewM1977q4 == null) {
                this.f1674f += m1983w(iM1974n);
            } else {
                if (viewM1977q4.getVisibility() == 8) {
                    iM1974n += m1974n(viewM1977q4, iM1974n);
                } else {
                    if (m1978r(iM1974n)) {
                        this.f1674f += this.f1681m;
                    }
                    a aVar3 = (a) viewM1977q4.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f17 = f15 + f16;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                        int i41 = this.f1674f;
                        this.f1674f = Math.max(i41, ((LinearLayout.LayoutParams) aVar3).topMargin + i41 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i24;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        z13 = true;
                        i21 = i25;
                        i20 = i26;
                        z10 = z12;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                            i15 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i15 = 0;
                        }
                        if (f17 == 0.0f) {
                            int i42 = i26;
                            i17 = this.f1674f;
                            i16 = i42;
                        } else {
                            i16 = i26;
                            i17 = 0;
                        }
                        int i43 = iMax4;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        i20 = i16;
                        i21 = i25;
                        view = viewM1977q4;
                        z10 = z12;
                        iMax2 = i24;
                        m1981u(view, iM1974n, i10, 0, i11, i17);
                        if (i15 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i15;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i44 = this.f1674f;
                        this.f1674f = Math.max(i44, i44 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + m1976p(view));
                        iMax4 = z10 ? Math.max(measuredHeight2, i43) : i43;
                    }
                    if (i23 >= 0 && i23 == iM1974n + 1) {
                        view = viewM1977q4;
                        this.f1671c = this.f1674f;
                    }
                    if (iM1974n < i23 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z14 = true;
                    }
                    int i45 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i45;
                    iMax3 = Math.max(i21, measuredWidth2);
                    int i46 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i20, view.getMeasuredState());
                    if (z15) {
                        i22 = iCombineMeasuredStates2;
                        z15 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z11) {
                                i45 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i45);
                        } else {
                            if (!z11) {
                                i45 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i45);
                        }
                        iM1974n += m1974n(view, iM1974n);
                        f10 = f17;
                        iMax4 = i46;
                        i26 = i22;
                    } else {
                        i22 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z11) {
                            i45 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i45);
                    } else {
                        if (!z11) {
                            i45 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i45);
                    }
                    iM1974n += m1974n(view, iM1974n);
                    f10 = f17;
                    iMax4 = i46;
                    i26 = i22;
                }
                iM1974n++;
                i25 = iMax3;
                i24 = iMax2;
                z12 = z10;
                mode2 = i19;
                virtualChildCount = i18;
            }
            iMax2 = i24;
            i18 = virtualChildCount;
            i19 = mode2;
            z10 = z12;
            f10 = f15;
            iMax3 = i25;
            iM1974n++;
            i25 = iMax3;
            i24 = iMax2;
            z12 = z10;
            mode2 = i19;
            virtualChildCount = i18;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0484b(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0484b(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1669a = true;
        this.f1670b = -1;
        this.f1671c = 0;
        this.f1673e = 8388659;
        int[] iArr = C6598j.f25338c1;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        int iM39739k = c10357a1M39728v.m39739k(C6598j.f25348e1, -1);
        if (iM39739k >= 0) {
            setOrientation(iM39739k);
        }
        int iM39739k2 = c10357a1M39728v.m39739k(C6598j.f25343d1, -1);
        if (iM39739k2 >= 0) {
            setGravity(iM39739k2);
        }
        boolean zM39729a = c10357a1M39728v.m39729a(C6598j.f25353f1, true);
        if (!zM39729a) {
            setBaselineAligned(zM39729a);
        }
        this.f1675g = c10357a1M39728v.m39737i(C6598j.f25363h1, -1.0f);
        this.f1670b = c10357a1M39728v.m39739k(C6598j.f25358g1, -1);
        this.f1676h = c10357a1M39728v.m39729a(C6598j.f25378k1, false);
        setDividerDrawable(c10357a1M39728v.m39735g(C6598j.f25368i1));
        this.f1682n = c10357a1M39728v.m39739k(C6598j.f25383l1, 0);
        this.f1683o = c10357a1M39728v.m39734f(C6598j.f25373j1, 0);
        c10357a1M39728v.m39749x();
    }
}

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
import androidx.core.view.k;
import androidx.core.view.o0;
import i.j;
import q.a1;
import q.g1;

/* JADX INFO: loaded from: classes.dex */
public class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1270a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1283o;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

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

    public b(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void j(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewQ = q(i13);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i12, 0);
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

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = g1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewQ = q(i11);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i11)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1280l);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f1280l;
                    right = left - i10;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f1280l;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    public void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewQ = q(i10);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i10)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f1281m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f1281m : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    public void g(Canvas canvas, int i10) {
        this.f1279k.setBounds(getPaddingLeft() + this.f1283o, i10, (getWidth() - getPaddingRight()) - this.f1283o, this.f1281m + i10);
        this.f1279k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1271c;
        if (this.f1272d == 1 && (i10 = this.f1273e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1274f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1274f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.f1279k;
    }

    public int getDividerPadding() {
        return this.f1283o;
    }

    public int getDividerWidth() {
        return this.f1280l;
    }

    public int getGravity() {
        return this.f1273e;
    }

    public int getOrientation() {
        return this.f1272d;
    }

    public int getShowDividers() {
        return this.f1282n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1275g;
    }

    public void h(Canvas canvas, int i10) {
        this.f1279k.setBounds(i10, getPaddingTop() + this.f1283o, this.f1280l + i10, (getHeight() - getPaddingBottom()) - this.f1283o);
        this.f1279k.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final void i(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewQ = q(i13);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    i12 = i11;
                    measureChildWithMargins(viewQ, i12, 0, iMakeMeasureSpec, 0);
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

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1272d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int n(View view, int i10) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f1279k == null) {
            return;
        }
        if (this.f1272d == 1) {
            f(canvas);
        } else {
            e(canvas);
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
        if (this.f1272d == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1272d == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    public int p(View view) {
        return 0;
    }

    public View q(int i10) {
        return getChildAt(i10);
    }

    public boolean r(int i10) {
        if (i10 == 0) {
            return (this.f1282n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1282n & 4) != 0;
        }
        if ((this.f1282n & 2) != 0) {
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
    public void s(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int iN;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        boolean zB = g1.b(this);
        int paddingTop = getPaddingTop();
        int i22 = i13 - i11;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i23 = this.f1273e;
        int i24 = i23 & 112;
        boolean z10 = this.f1270a;
        int[] iArr = this.f1277i;
        int[] iArr2 = this.f1278j;
        int iB = k.b(8388615 & i23, getLayoutDirection());
        char c12 = 2;
        char c13 = 1;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f1274f;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f1274f) / 2);
        }
        if (zB) {
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
            View viewQ = q(i26);
            if (viewQ == null) {
                paddingLeft += w(i26);
                iN = i27;
                i16 = paddingTop;
                c10 = c12;
                c11 = c13;
            } else {
                c10 = c12;
                c11 = c13;
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i28 = paddingLeft;
                    if (z10) {
                        i17 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
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
                                    measuredHeight = iArr2[c10] - (viewQ.getMeasuredHeight() - baseline);
                                }
                            }
                            if (r(i26)) {
                                i21 = i28 + this.f1280l;
                            } else {
                                i21 = i28;
                            }
                            int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                            y(viewQ, o(viewQ) + i29, i20, measuredWidth, i17);
                            int iP = i29 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                            iN = n(viewQ, i26) + i27;
                            paddingLeft = iP;
                        } else {
                            i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (r(i26)) {
                            i21 = i28 + this.f1280l;
                        } else {
                            i21 = i28;
                        }
                        int i210 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        y(viewQ, o(viewQ) + i210, i20, measuredWidth, i17);
                        int iP2 = i210 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i26) + i27;
                        paddingLeft = iP2;
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
                                measuredHeight = iArr2[c10] - (viewQ.getMeasuredHeight() - baseline);
                            }
                        }
                        if (r(i26)) {
                            i21 = i28 + this.f1280l;
                        } else {
                            i21 = i28;
                        }
                        int i211 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        y(viewQ, o(viewQ) + i211, i20, measuredWidth, i17);
                        int iP3 = i211 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i26) + i27;
                        paddingLeft = iP3;
                    } else {
                        i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (r(i26)) {
                        i21 = i28 + this.f1280l;
                    } else {
                        i21 = i28;
                    }
                    int i212 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                    y(viewQ, o(viewQ) + i212, i20, measuredWidth, i17);
                    int iP4 = i212 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                    iN = n(viewQ, i26) + i27;
                    paddingLeft = iP4;
                } else {
                    i16 = paddingTop;
                    iN = i27;
                }
            }
            i25 = iN + 1;
            c12 = c10;
            c13 = c11;
            paddingTop = i16;
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1270a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1279k) {
            return;
        }
        this.f1279k = drawable;
        if (drawable != null) {
            this.f1280l = drawable.getIntrinsicWidth();
            this.f1281m = drawable.getIntrinsicHeight();
        } else {
            this.f1280l = 0;
            this.f1281m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1283o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1273e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1273e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1273e;
        if ((8388615 & i12) != i11) {
            this.f1273e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1276h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1272d != i10) {
            this.f1272d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1282n) {
            requestLayout();
        }
        this.f1282n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1273e;
        if ((i12 & 112) != i11) {
            this.f1273e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1275g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    public void t(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f1273e;
        int i19 = i18 & 112;
        int i20 = i18 & 8388615;
        if (i19 != 16) {
            paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f1274f;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f1274f) / 2);
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i21 < 0) {
                        i21 = i20;
                    }
                    int iB = k.b(i21, getLayoutDirection()) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i22 = i16;
                        if (r(iN)) {
                            paddingTop += this.f1281m;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        y(viewQ, i22, i23 + o(viewQ), measuredWidth, measuredHeight);
                        paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                        iN += n(viewQ, iN);
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i24 = i16;
                    if (r(iN)) {
                        paddingTop += this.f1281m;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i24, i25 + o(viewQ), measuredWidth, measuredHeight);
                    paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                }
                iN++;
            }
            iN++;
        }
    }

    public void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    public void v(int i10, int i11) {
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
        this.f1274f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f1277i == null || this.f1278j == null) {
            this.f1277i = new int[4];
            this.f1278j = new int[4];
        }
        int[] iArr = this.f1277i;
        int[] iArr2 = this.f1278j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z12 = this.f1270a;
        boolean z13 = this.f1276h;
        int i24 = 1073741824;
        boolean z14 = mode == 1073741824;
        boolean z15 = z13;
        int iN = 0;
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
            if (iN >= virtualChildCount) {
                break;
            }
            boolean z19 = z12;
            View viewQ = q(iN);
            if (viewQ == null) {
                this.f1274f += w(iN);
            } else {
                if (viewQ.getVisibility() == 8) {
                    iN += n(viewQ, iN);
                } else {
                    if (r(iN)) {
                        this.f1274f += this.f1280l;
                    }
                    a aVar = (a) viewQ.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f13 = f11 + f12;
                    if (mode == i24 && ((LinearLayout.LayoutParams) aVar).width == 0 && f12 > 0.0f) {
                        if (z14) {
                            this.f1274f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i26 = this.f1274f;
                            this.f1274f = Math.max(i26, ((LinearLayout.LayoutParams) aVar).leftMargin + i26 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z19) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z16 = true;
                        }
                        i22 = i12;
                        i23 = 1073741824;
                        z10 = z15;
                        view = viewQ;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f12 <= 0.0f) {
                            b = -2;
                            i21 = Integer.MIN_VALUE;
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
                        u(viewQ, iN, i10, f13 == 0.0f ? this.f1274f : 0, i11, 0);
                        view = viewQ;
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i27;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z14) {
                            this.f1274f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                        } else {
                            int i28 = this.f1274f;
                            this.f1274f = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
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
                            i30 = this.f1273e;
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
                    iN += n(view, iN);
                    i25 = iMax5;
                    f11 = f13;
                }
                iN++;
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
            iN++;
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
        if (this.f1274f > 0) {
            i13 = i32;
            if (r(i13)) {
                this.f1274f += this.f1280l;
            }
        } else {
            i13 = i32;
        }
        int i35 = iArr3[1];
        int iMax6 = (i35 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i12 : Math.max(i12, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i35, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z21) {
            i14 = i33;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f1274f = 0;
                int iN2 = 0;
                while (iN2 < i13) {
                    View viewQ2 = q(iN2);
                    if (viewQ2 == null) {
                        this.f1274f += w(iN2);
                    } else {
                        if (viewQ2.getVisibility() == 8) {
                            iN2 += n(viewQ2, iN2);
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            if (z14) {
                                this.f1274f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                            } else {
                                f11 = f11;
                                int i36 = this.f1274f;
                                this.f1274f = Math.max(i36, i36 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                            }
                        }
                        iN2++;
                        f11 = f11;
                        iMax6 = iMax6;
                    }
                    iN2++;
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
        int paddingLeft = this.f1274f + getPaddingLeft() + getPaddingRight();
        this.f1274f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i37 = (16777215 & iResolveSizeAndState) - this.f1274f;
        if (z16 || (i37 != 0 && f10 > 0.0f)) {
            float f14 = this.f1275g;
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
            this.f1274f = 0;
            int iCombineMeasuredStates2 = i34;
            int iMax8 = -1;
            int i38 = 0;
            while (i38 < i13) {
                View viewQ3 = q(i38);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
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
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(i39, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                        } else {
                            i20 = 1073741824;
                        }
                        int measuredWidth2 = viewQ3.getMeasuredWidth() + i39;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i20), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                    }
                    if (z14) {
                        this.f1274f += viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        int i40 = this.f1274f;
                        this.f1274f = Math.max(i40, viewQ3.getMeasuredWidth() + i40 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z22 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i41 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i41;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z22) {
                        i41 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i41);
                    if (z18) {
                        i18 = -1;
                        boolean z23 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z20 && (baseline = viewQ3.getBaseline()) != i18) {
                            i19 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i19 < 0) {
                                i19 = this.f1273e;
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
                            i19 = this.f1273e;
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
            i16 = -16777216;
            this.f1274f += getPaddingLeft() + getPaddingRight();
            int i44 = iArr3[1];
            iMax7 = (i44 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i44, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i17 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z21 && i14 != 1073741824) {
                for (int i45 = 0; i45 < i13; i45++) {
                    View viewQ4 = q(i45);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = iResolveSizeAndState;
            i17 = i34;
            i16 = -16777216;
        }
        if (z18 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z17) {
            i(i13, i10);
        }
    }

    public int w(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    public void x(int i10, int i11) {
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
        this.f1274f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i23 = this.b;
        boolean z12 = this.f1276h;
        int iN = 0;
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
            if (iN >= virtualChildCount) {
                float f11 = f10;
                int i28 = i24;
                int i29 = virtualChildCount;
                int i30 = mode2;
                boolean z16 = z12;
                int i31 = iMax4;
                int iMax6 = i25;
                int iCombineMeasuredStates = i26;
                if (this.f1274f > 0) {
                    i12 = i29;
                    if (r(i12)) {
                        this.f1274f += this.f1281m;
                    }
                } else {
                    i12 = i29;
                }
                int i32 = i30;
                if (z16 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.f1274f = 0;
                    int iN2 = 0;
                    while (iN2 < i12) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            this.f1274f += w(iN2);
                        } else if (viewQ.getVisibility() == i27) {
                            iN2 += n(viewQ, iN2);
                        } else {
                            a aVar = (a) viewQ.getLayoutParams();
                            int i33 = this.f1274f;
                            this.f1274f = Math.max(i33, i33 + i31 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                        }
                        iN2++;
                        i27 = 8;
                    }
                }
                int paddingTop = this.f1274f + getPaddingTop() + getPaddingBottom();
                this.f1274f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i34 = (16777215 & iResolveSizeAndState) - this.f1274f;
                if (z13 || (i34 != 0 && f11 > 0.0f)) {
                    float f12 = this.f1275g;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f1274f = 0;
                    float f13 = f12;
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < i12) {
                        View viewQ2 = q(i36);
                        if (viewQ2.getVisibility() == 8) {
                            i32 = i32;
                            i36 = i36;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                int i37 = (int) ((i35 * f14) / f13);
                                f13 -= f14;
                                i35 -= i37;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i14 = 1073741824;
                                    if (i32 == 1073741824) {
                                        viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i37 > 0 ? i37 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredHeight = viewQ2.getMeasuredHeight() + i37;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                            } else {
                                i32 = i32;
                            }
                            int i38 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i38;
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
                            int i39 = this.f1274f;
                            this.f1274f = Math.max(i39, i39 + viewQ2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            iMax5 = iMax7;
                            z15 = z17;
                        }
                        i36++;
                        i32 = i32;
                    }
                    this.f1274f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i28);
                    if (z16 && i32 != 1073741824) {
                        for (int i40 = 0; i40 < i12; i40++) {
                            View viewQ3 = q(i40);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                }
                if (!z15 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z14) {
                    j(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f1274f += w(iN);
            } else {
                if (viewQ4.getVisibility() == 8) {
                    iN += n(viewQ4, iN);
                } else {
                    if (r(iN)) {
                        this.f1274f += this.f1281m;
                    }
                    a aVar3 = (a) viewQ4.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f17 = f15 + f16;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                        int i41 = this.f1274f;
                        this.f1274f = Math.max(i41, ((LinearLayout.LayoutParams) aVar3).topMargin + i41 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i24;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        z13 = true;
                        i21 = i25;
                        i20 = i26;
                        z10 = z12;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i15 = 0;
                        }
                        if (f17 == 0.0f) {
                            int i42 = i26;
                            i17 = this.f1274f;
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
                        view = viewQ4;
                        z10 = z12;
                        iMax2 = i24;
                        u(view, iN, i10, 0, i11, i17);
                        if (i15 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i15;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i44 = this.f1274f;
                        this.f1274f = Math.max(i44, i44 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                        iMax4 = z10 ? Math.max(measuredHeight2, i43) : i43;
                    }
                    if (i23 >= 0 && i23 == iN + 1) {
                        view = viewQ4;
                        this.f1271c = this.f1274f;
                    }
                    if (iN < i23 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
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
                        iN += n(view, iN);
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
                    iN += n(view, iN);
                    f10 = f17;
                    iMax4 = i46;
                    i26 = i22;
                }
                iN++;
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
            iN++;
            i25 = iMax3;
            i24 = iMax2;
            z12 = z10;
            mode2 = i19;
            virtualChildCount = i18;
        }
    }

    public b(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1270a = true;
        this.b = -1;
        this.f1271c = 0;
        this.f1273e = 8388659;
        int[] iArr = j.f20029c1;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, a1VarV.r(), i10, 0);
        int iK = a1VarV.k(j.f20039e1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = a1VarV.k(j.f20034d1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = a1VarV.a(j.f20044f1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1275g = a1VarV.i(j.f20054h1, -1.0f);
        this.b = a1VarV.k(j.f20049g1, -1);
        this.f1276h = a1VarV.a(j.f20069k1, false);
        setDividerDrawable(a1VarV.g(j.f20059i1));
        this.f1282n = a1VarV.k(j.f20074l1, 0);
        this.f1283o = a1VarV.f(j.f20064j1, 0);
        a1VarV.x();
    }
}

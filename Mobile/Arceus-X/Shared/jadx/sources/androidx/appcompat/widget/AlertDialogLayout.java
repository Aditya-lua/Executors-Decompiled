package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import p181i.C6594f;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends C0484b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: z */
    public static int m1785z(View view) {
        int iM2978A = C0625o0.m2978A(view);
        if (iM2978A > 0) {
            return iM2978A;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1785z(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1786A(int i10, int i11) {
        int iCombineMeasuredStates;
        int iM1785z;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == C6594f.f25133U) {
                    view = childAt;
                } else if (id2 == C6594f.f25145l) {
                    view2 = childAt;
                } else {
                    if ((id2 != C6594f.f25147n && id2 != C6594f.f25149p) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iM1785z = m1785z(view2);
            measuredHeight = view2.getMeasuredHeight() - iM1785z;
            paddingTop += iM1785z;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM1785z = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingTop;
        if (view2 != null) {
            int i14 = paddingTop - iM1785z;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iM1785z += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iM1785z, 1073741824));
            paddingTop = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        m1787j(childCount, i11);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: j */
    public final void m1787j(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0484b.a aVar = (C0484b.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i12, 0);
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

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.C0484b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : getPaddingTop() + (((i13 - i11) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0484b.a aVar = (C0484b.a) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i21 < 0) {
                    i21 = i19;
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
                    if (m1978r(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    m1788y(childAt, i22, i23, measuredWidth, measuredHeight2);
                    paddingTop = i23 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = i14 - i15;
                int i24 = i16;
                if (m1978r(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                m1788y(childAt, i24, i25, measuredWidth, measuredHeight2);
                paddingTop = i25 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.View
    public void onMeasure(int i10, int i11) {
        if (m1786A(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    /* JADX INFO: renamed from: y */
    public final void m1788y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }
}

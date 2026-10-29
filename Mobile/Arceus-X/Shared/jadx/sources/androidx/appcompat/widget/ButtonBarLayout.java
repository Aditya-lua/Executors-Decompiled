package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6594f;
import p181i.C6598j;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1442a;

    /* JADX INFO: renamed from: b */
    public boolean f1443b;

    /* JADX INFO: renamed from: c */
    public int f1444c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1444c = -1;
        int[] iArr = C6598j.f25278P0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0625o0.m3036k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f1442a = typedArrayObtainStyledAttributes.getBoolean(C6598j.f25283Q0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1442a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f1443b != z10) {
            if (!z10 || this.f1442a) {
                this.f1443b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? GravityCompat.END : 80);
                View viewFindViewById = findViewById(C6594f.f25124L);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1810a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1811b() {
        return this.f1443b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f1442a) {
            if (size > this.f1444c && m1811b()) {
                setStacked(false);
            }
            this.f1444c = size;
        }
        if (m1811b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f1442a && !m1811b() && (getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int iM1810a = m1810a(0);
        if (iM1810a >= 0) {
            View childAt = getChildAt(iM1810a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m1811b()) {
                int iM1810a2 = m1810a(iM1810a + 1);
                if (iM1810a2 >= 0) {
                    paddingTop += getChildAt(iM1810a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (C0625o0.m2978A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1442a != z10) {
            this.f1442a = z10;
            if (!z10 && m1811b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

package ad;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.C0622n;
import androidx.core.view.C0625o0;
import p194ic.C6742f;

/* JADX INFO: renamed from: ad.f */
/* JADX INFO: loaded from: classes2.dex */
public class C0134f extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f464a;

    /* JADX INFO: renamed from: b */
    public int f465b;

    /* JADX INFO: renamed from: c */
    public boolean f466c;

    /* JADX INFO: renamed from: d */
    public int f467d;

    /* JADX INFO: renamed from: a */
    public static int m397a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    /* JADX INFO: renamed from: b */
    public int m398b(@NonNull View view) {
        Object tag = view.getTag(C6742f.f26016J);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo399c() {
        return this.f466c;
    }

    public int getItemSpacing() {
        return this.f465b;
    }

    public int getLineSpacing() {
        return this.f464a;
    }

    public int getRowCount() {
        return this.f467d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iM2974a;
        int iM2975b;
        if (getChildCount() == 0) {
            this.f467d = 0;
            return;
        }
        this.f467d = 1;
        boolean z11 = C0625o0.m3065z(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C6742f.f26016J, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iM2975b = C0622n.m2975b(marginLayoutParams);
                    iM2974a = C0622n.m2974a(marginLayoutParams);
                } else {
                    iM2974a = 0;
                    iM2975b = 0;
                }
                int measuredWidth2 = measuredWidth + iM2975b + childAt.getMeasuredWidth();
                if (!this.f466c && measuredWidth2 > i14) {
                    i15 = this.f464a + paddingTop;
                    this.f467d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C6742f.f26016J, Integer.valueOf(this.f467d - 1));
                int i17 = measuredWidth + iM2975b;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - iM2975b, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += iM2975b + iM2974a + childAt.getMeasuredWidth() + this.f465b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || mo399c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f464a + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f465b;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m397a(size, mode, i16 + getPaddingRight()), m397a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i10) {
        this.f465b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f464a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f466c = z10;
    }
}

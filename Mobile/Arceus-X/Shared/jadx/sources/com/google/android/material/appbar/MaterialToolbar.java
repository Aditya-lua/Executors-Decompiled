package com.google.android.material.appbar;

import ad.C0143o;
import ad.C0144p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0625o0;
import md.C8485a;
import p168hd.C6363g;
import p168hd.C6364h;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p368q2.C10425a;
import p513wc.C12348c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: b0 */
    public static final int f9612b0 = C6746j.f26108D;

    /* JADX INFO: renamed from: c0 */
    public static final ImageView.ScaleType[] f9613c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: T */
    public Integer f9614T;

    /* JADX INFO: renamed from: U */
    public boolean f9615U;

    /* JADX INFO: renamed from: V */
    public boolean f9616V;

    /* JADX INFO: renamed from: W */
    public ImageView.ScaleType f9617W;

    /* JADX INFO: renamed from: a0 */
    public Boolean f9618a0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25902i0);
    }

    /* JADX INFO: renamed from: U */
    public final Pair<Integer, Integer> m11987U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* JADX INFO: renamed from: V */
    public final void m11988V(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : C12348c.m46208g(background);
        if (colorStateListValueOf != null) {
            C6363g c6363g = new C6363g();
            c6363g.m27719a0(colorStateListValueOf);
            c6363g.m27710Q(context);
            c6363g.m27718Z(C0625o0.m3055u(this));
            C0625o0.m3048q0(this, c6363g);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m11989W(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    /* JADX INFO: renamed from: X */
    public final void m11990X() {
        if (this.f9615U || this.f9616V) {
            TextView textViewM444g = C0144p.m444g(this);
            TextView textViewM442e = C0144p.m442e(this);
            if (textViewM444g == null && textViewM442e == null) {
                return;
            }
            Pair<Integer, Integer> pairM11987U = m11987U(textViewM444g, textViewM442e);
            if (this.f9615U && textViewM444g != null) {
                m11989W(textViewM444g, pairM11987U);
            }
            if (!this.f9616V || textViewM442e == null) {
                return;
            }
            m11989W(textViewM442e, pairM11987U);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final Drawable m11991Y(Drawable drawable) {
        if (drawable == null || this.f9614T == null) {
            return drawable;
        }
        Drawable drawableM40121r = C10425a.m40121r(drawable.mutate());
        C10425a.m40117n(drawableM40121r, this.f9614T.intValue());
        return drawableM40121r;
    }

    /* JADX INFO: renamed from: Z */
    public final void m11992Z() {
        ImageView imageViewM440c = C0144p.m440c(this);
        if (imageViewM440c != null) {
            Boolean bool = this.f9618a0;
            if (bool != null) {
                imageViewM440c.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9617W;
            if (scaleType != null) {
                imageViewM440c.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9617W;
    }

    public Integer getNavigationIconTint() {
        return this.f9614T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27759e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m11990X();
        m11992Z();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C6364h.m27758d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f9618a0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f9618a0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f9617W != scaleType) {
            this.f9617W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m11991Y(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f9614T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f9616V != z10) {
            this.f9616V = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f9615U != z10) {
            this.f9615U = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: y */
    public void mo1935y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof C0415e;
        if (z10) {
            ((C0415e) menu).m1635e0();
        }
        super.mo1935y(i10);
        if (z10) {
            ((C0415e) menu).m1633d0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9612b0;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26602z4, i10, i11, new int[0]);
        int i12 = C6747k.f26158C4;
        if (typedArrayM436i.hasValue(i12)) {
            setNavigationIconTint(typedArrayM436i.getColor(i12, -1));
        }
        this.f9615U = typedArrayM436i.getBoolean(C6747k.f26176E4, false);
        this.f9616V = typedArrayM436i.getBoolean(C6747k.f26167D4, false);
        int i13 = typedArrayM436i.getInt(C6747k.f26149B4, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9613c0;
            if (i13 < scaleTypeArr.length) {
                this.f9617W = scaleTypeArr[i13];
            }
        }
        int i14 = C6747k.f26140A4;
        if (typedArrayM436i.hasValue(i14)) {
            this.f9618a0 = Boolean.valueOf(typedArrayM436i.getBoolean(i14, false));
        }
        typedArrayM436i.recycle();
        m11988V(context2);
    }
}

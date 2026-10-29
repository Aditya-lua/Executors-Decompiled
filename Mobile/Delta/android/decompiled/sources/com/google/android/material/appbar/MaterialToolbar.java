package com.google.android.material.appbar;

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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.o0;
import gd.g;
import gd.h;
import hc.b;
import hc.j;
import hc.k;
import q2.a;
import vc.c;
import zc.o;
import zc.p;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f7518b0 = j.D;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f7519c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T;
    public boolean U;
    public boolean V;
    public ImageView.ScaleType W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Boolean f7520a0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f18784i0);
    }

    public final Pair<Integer, Integer> U(TextView textView, TextView textView2) {
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

    public final void V(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : c.g(background);
        if (colorStateListValueOf != null) {
            g gVar = new g();
            gVar.a0(colorStateListValueOf);
            gVar.Q(context);
            gVar.Z(o0.u(this));
            o0.q0(this, gVar);
        }
    }

    public final void W(View view, Pair<Integer, Integer> pair) {
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

    public final void X() {
        if (this.U || this.V) {
            TextView textViewG = p.g(this);
            TextView textViewE = p.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairU = U(textViewG, textViewE);
            if (this.U && textViewG != null) {
                W(textViewG, pairU);
            }
            if (!this.V || textViewE == null) {
                return;
            }
            W(textViewE, pairU);
        }
    }

    public final Drawable Y(Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable drawableR = a.r(drawable.mutate());
        a.n(drawableR, this.T.intValue());
        return drawableR;
    }

    public final void Z() {
        ImageView imageViewC = p.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f7520a0;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
        Z();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f7520a0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f7520a0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof e;
        if (z10) {
            ((e) menu).e0();
        }
        super.y(i10);
        if (z10) {
            ((e) menu).d0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7518b0;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, k.f19186z4, i10, i11, new int[0]);
        int i12 = k.C4;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.U = typedArrayI.getBoolean(k.E4, false);
        this.V = typedArrayI.getBoolean(k.D4, false);
        int i13 = typedArrayI.getInt(k.B4, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f7519c0;
            if (i13 < scaleTypeArr.length) {
                this.W = scaleTypeArr[i13];
            }
        }
        int i14 = k.A4;
        if (typedArrayI.hasValue(i14)) {
            this.f7520a0 = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        V(context2);
    }
}

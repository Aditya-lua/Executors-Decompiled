package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import bd.o;
import id.h;
import id.k;
import id.n;
import jc.b;
import jc.j;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f7613n = {R.attr.state_checkable};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f7614o = {R.attr.state_checked};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f7615p = {b.Z};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f7616q = j.f20456q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final qc.b f7617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7620m;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.A);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f7617j.l().getBounds());
        return rectF;
    }

    public final void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f7617j.k();
        }
    }

    public boolean g() {
        qc.b bVar = this.f7617j;
        return bVar != null && bVar.F();
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f7617j.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f7617j.n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7617j.o();
    }

    public int getCheckedIconGravity() {
        return this.f7617j.p();
    }

    public int getCheckedIconMargin() {
        return this.f7617j.q();
    }

    public int getCheckedIconSize() {
        return this.f7617j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7617j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f7617j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f7617j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f7617j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f7617j.C().top;
    }

    public float getProgress() {
        return this.f7617j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f7617j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f7617j.x();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f7617j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f7617j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7617j.A();
    }

    public int getStrokeWidth() {
        return this.f7617j.B();
    }

    public boolean h() {
        return this.f7620m;
    }

    public void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7619l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7617j.f0();
        h.f(this, this.f7617j.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7613n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7614o);
        }
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7615p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f7617j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f7618k) {
            if (!this.f7617j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f7617j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f7617j.L(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f7617j.h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f7617j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f7617j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f7619l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7617j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f7617j.p() != i10) {
            this.f7617j.R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f7617j.S(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f7617j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f7617j.Q(k.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f7617j.T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f7617j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f7617j.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        qc.b bVar = this.f7617j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f7620m != z10) {
            this.f7620m = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f7617j.j0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f7617j.j0();
        this.f7617j.g0();
    }

    public void setProgress(float f10) {
        this.f7617j.W(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f7617j.V(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f7617j.X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f7617j.X(k.a.a(getContext(), i10));
    }

    @Override // id.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f7617j.Y(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f7617j.a0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f7617j.j0();
        this.f7617j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.f7619l = !this.f7619l;
            refreshDrawableState();
            f();
            this.f7617j.P(this.f7619l, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7616q;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7619l = false;
        this.f7620m = false;
        this.f7618k = true;
        TypedArray typedArrayI = o.i(getContext(), attributeSet, jc.k.A3, i10, i11, new int[0]);
        qc.b bVar = new qc.b(this, attributeSet, i10, i11);
        this.f7617j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayI);
        typedArrayI.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7617j.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f7617j.Z(colorStateList);
        invalidate();
    }
}

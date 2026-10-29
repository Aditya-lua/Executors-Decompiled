package com.google.android.material.card;

import ad.C0143o;
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
import md.C8485a;
import p168hd.C6364h;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p357pc.C10195b;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC6370n {

    /* JADX INFO: renamed from: n */
    public static final int[] f9839n = {R.attr.state_checkable};

    /* JADX INFO: renamed from: o */
    public static final int[] f9840o = {R.attr.state_checked};

    /* JADX INFO: renamed from: p */
    public static final int[] f9841p = {C6738b.f25884Z};

    /* JADX INFO: renamed from: q */
    public static final int f9842q = C6746j.f26125q;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C10195b f9843j;

    /* JADX INFO: renamed from: k */
    public boolean f9844k;

    /* JADX INFO: renamed from: l */
    public boolean f9845l;

    /* JADX INFO: renamed from: m */
    public boolean f9846m;

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC2768a {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25859A);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f9843j.m39255l().getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: f */
    public final void m12238f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f9843j.m39253k();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m12239g() {
        C10195b c10195b = this.f9843j;
        return c10195b != null && c10195b.m39213F();
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f9843j.m39257m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f9843j.m39258n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9843j.m39259o();
    }

    public int getCheckedIconGravity() {
        return this.f9843j.m39260p();
    }

    public int getCheckedIconMargin() {
        return this.f9843j.m39261q();
    }

    public int getCheckedIconSize() {
        return this.f9843j.m39262r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9843j.m39263s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f9843j.m39210C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f9843j.m39210C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f9843j.m39210C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f9843j.m39210C().top;
    }

    public float getProgress() {
        return this.f9843j.m39267w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f9843j.m39265u();
    }

    public ColorStateList getRippleColor() {
        return this.f9843j.m39268x();
    }

    @NonNull
    public C6367k getShapeAppearanceModel() {
        return this.f9843j.m39269y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f9843j.m39270z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9843j.m39208A();
    }

    public int getStrokeWidth() {
        return this.f9843j.m39209B();
    }

    /* JADX INFO: renamed from: h */
    public boolean m12240h() {
        return this.f9846m;
    }

    /* JADX INFO: renamed from: i */
    public void m12241i(int i10, int i11, int i12, int i13) {
        super.m2430d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9845l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9843j.m39244f0();
        C6364h.m27760f(this, this.f9843j.m39255l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (m12239g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9839n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9840o);
        }
        if (m12240h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9841p);
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
        accessibilityNodeInfo.setCheckable(m12239g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9843j.m39217J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9844k) {
            if (!this.f9843j.m39212E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9843j.m39218K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f9843j.m39219L(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f9843j.m39248h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f9843j.m39220M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f9843j.m39221N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f9845l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9843j.m39224Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f9843j.m39260p() != i10) {
            this.f9843j.m39225R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f9843j.m39226S(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f9843j.m39226S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f9843j.m39224Q(C7399a.m30679b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f9843j.m39227T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f9843j.m39227T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f9843j.m39228U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        C10195b c10195b = this.f9843j;
        if (c10195b != null) {
            c10195b.m39244f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f9846m != z10) {
            this.f9846m = z10;
            refreshDrawableState();
            m12238f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f9843j.m39252j0();
    }

    public void setOnCheckedChangeListener(InterfaceC2768a interfaceC2768a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f9843j.m39252j0();
        this.f9843j.m39246g0();
    }

    public void setProgress(float f10) {
        this.f9843j.m39230W(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f9843j.m39229V(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f9843j.m39231X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f9843j.m39231X(C7399a.m30678a(getContext(), i10));
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        setClipToOutline(c6367k.m27782u(getBoundsAsRectF()));
        this.f9843j.m39232Y(c6367k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f9843j.m39234a0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f9843j.m39252j0();
        this.f9843j.m39246g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m12239g() && isEnabled()) {
            this.f9845l = !this.f9845l;
            refreshDrawableState();
            m12238f();
            this.f9843j.m39223P(this.f9845l, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9842q;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9845l = false;
        this.f9846m = false;
        this.f9844k = true;
        TypedArray typedArrayM436i = C0143o.m436i(getContext(), attributeSet, C6747k.f26139A3, i10, i11, new int[0]);
        C10195b c10195b = new C10195b(this, attributeSet, i10, i11);
        this.f9843j = c10195b;
        c10195b.m39219L(super.getCardBackgroundColor());
        c10195b.m39236b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c10195b.m39216I(typedArrayM436i);
        typedArrayM436i.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9843j.m39219L(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9843j.m39233Z(colorStateList);
        invalidate();
    }
}

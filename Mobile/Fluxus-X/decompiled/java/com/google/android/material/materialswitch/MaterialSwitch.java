package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.c;
import bd.o;
import bd.r;
import jc.b;
import jc.j;
import jc.k;
import q.b1;
import q2.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f7959k0 = j.f20450k;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f7960l0 = {b.f20286e0};
    public Drawable U;
    public Drawable V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f7961a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f7962b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f7963c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorStateList f7964d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7965e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f7966f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f7967g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7968h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int[] f7969i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f7970j0;

    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.D);
    }

    public static void t(Drawable drawable, ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        a.n(drawable, c.c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.U;
    }

    public Drawable getThumbIconDrawable() {
        return this.V;
    }

    public int getThumbIconSize() {
        return this.W;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f7964d0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f7965e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f7963c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f7962b0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f7967g0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f7968h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f7961a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f7966f0;
    }

    @Override // android.view.View
    public void invalidate() {
        u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.V != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7960l0);
        }
        this.f7969i0 = xc.c.j(iArrOnCreateDrawableState);
        this.f7970j0 = xc.c.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    public final void r() {
        this.U = xc.c.c(this.U, this.f7963c0, getThumbTintMode());
        this.V = xc.c.c(this.V, this.f7964d0, this.f7965e0);
        u();
        Drawable drawable = this.U;
        Drawable drawable2 = this.V;
        int i10 = this.W;
        super.setThumbDrawable(xc.c.b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void s() {
        this.f7961a0 = xc.c.c(this.f7961a0, this.f7966f0, getTrackTintMode());
        this.f7962b0 = xc.c.c(this.f7962b0, this.f7967g0, this.f7968h0);
        u();
        Drawable layerDrawable = this.f7961a0;
        if (layerDrawable != null && this.f7962b0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f7961a0, this.f7962b0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f7962b0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.U = drawable;
        r();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.V = drawable;
        r();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(k.a.b(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.W != i10) {
            this.W = i10;
            r();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f7964d0 = colorStateList;
        r();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f7965e0 = mode;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7963c0 = colorStateList;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f7962b0 = drawable;
        s();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f7967g0 = colorStateList;
        s();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f7968h0 = mode;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f7961a0 = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7966f0 = colorStateList;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        s();
    }

    public final void u() {
        if (this.f7963c0 == null && this.f7964d0 == null && this.f7966f0 == null && this.f7967g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f7963c0;
        if (colorStateList != null) {
            t(this.U, colorStateList, this.f7969i0, this.f7970j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f7964d0;
        if (colorStateList2 != null) {
            t(this.V, colorStateList2, this.f7969i0, this.f7970j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f7966f0;
        if (colorStateList3 != null) {
            t(this.f7961a0, colorStateList3, this.f7969i0, this.f7970j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f7967g0;
        if (colorStateList4 != null) {
            t(this.f7962b0, colorStateList4, this.f7969i0, this.f7970j0, thumbPosition);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7959k0;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.W = -1;
        Context context2 = getContext();
        this.U = super.getThumbDrawable();
        this.f7963c0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f7961a0 = super.getTrackDrawable();
        this.f7966f0 = super.getTrackTintList();
        super.setTrackTintList(null);
        b1 b1VarJ = o.j(context2, attributeSet, k.f20545i4, i10, i11, new int[0]);
        this.V = b1VarJ.g(k.f20554j4);
        this.W = b1VarJ.f(k.f20563k4, -1);
        this.f7964d0 = b1VarJ.c(k.f20572l4);
        int iK = b1VarJ.k(k.f20581m4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f7965e0 = r.i(iK, mode);
        this.f7962b0 = b1VarJ.g(k.f20590n4);
        this.f7967g0 = b1VarJ.c(k.f20599o4);
        this.f7968h0 = r.i(b1VarJ.k(k.f20608p4, -1), mode);
        b1VarJ.x();
        setEnforceSwitchWidth(false);
        r();
        s();
    }
}

package com.google.android.material.materialswitch;

import ad.o;
import ad.r;
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
import ic.b;
import ic.j;
import ic.k;
import q.a1;
import q2.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f8115k0 = j.f20762k;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f8116l0 = {b.f20598e0};
    public Drawable U;
    public Drawable V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f8117a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f8118b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f8119c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorStateList f8120d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f8121e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f8122f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f8123g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f8124h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int[] f8125i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f8126j0;

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
        return this.f8120d0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f8121e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f8119c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f8118b0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f8123g0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f8124h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f8117a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f8122f0;
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
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8116l0);
        }
        this.f8125i0 = wc.c.j(iArrOnCreateDrawableState);
        this.f8126j0 = wc.c.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    public final void r() {
        this.U = wc.c.c(this.U, this.f8119c0, getThumbTintMode());
        this.V = wc.c.c(this.V, this.f8120d0, this.f8121e0);
        u();
        Drawable drawable = this.U;
        Drawable drawable2 = this.V;
        int i10 = this.W;
        super.setThumbDrawable(wc.c.b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void s() {
        this.f8117a0 = wc.c.c(this.f8117a0, this.f8122f0, getTrackTintMode());
        this.f8118b0 = wc.c.c(this.f8118b0, this.f8123g0, this.f8124h0);
        u();
        Drawable layerDrawable = this.f8117a0;
        if (layerDrawable != null && this.f8118b0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f8117a0, this.f8118b0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f8118b0;
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
        this.f8120d0 = colorStateList;
        r();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f8121e0 = mode;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8119c0 = colorStateList;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f8118b0 = drawable;
        s();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f8123g0 = colorStateList;
        s();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f8124h0 = mode;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f8117a0 = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8122f0 = colorStateList;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        s();
    }

    public final void u() {
        if (this.f8119c0 == null && this.f8120d0 == null && this.f8122f0 == null && this.f8123g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f8119c0;
        if (colorStateList != null) {
            t(this.U, colorStateList, this.f8125i0, this.f8126j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f8120d0;
        if (colorStateList2 != null) {
            t(this.V, colorStateList2, this.f8125i0, this.f8126j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f8122f0;
        if (colorStateList3 != null) {
            t(this.f8117a0, colorStateList3, this.f8125i0, this.f8126j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f8123g0;
        if (colorStateList4 != null) {
            t(this.f8118b0, colorStateList4, this.f8125i0, this.f8126j0, thumbPosition);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f8115k0;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.W = -1;
        Context context2 = getContext();
        this.U = super.getThumbDrawable();
        this.f8119c0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f8117a0 = super.getTrackDrawable();
        this.f8122f0 = super.getTrackTintList();
        super.setTrackTintList(null);
        a1 a1VarJ = o.j(context2, attributeSet, k.f20857i4, i10, i11, new int[0]);
        this.V = a1VarJ.g(k.f20866j4);
        this.W = a1VarJ.f(k.f20875k4, -1);
        this.f8120d0 = a1VarJ.c(k.f20884l4);
        int iK = a1VarJ.k(k.f20893m4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f8121e0 = r.i(iK, mode);
        this.f8118b0 = a1VarJ.g(k.f20902n4);
        this.f8123g0 = a1VarJ.c(k.f20911o4);
        this.f8124h0 = r.i(a1VarJ.k(k.f20920p4, -1), mode);
        a1VarJ.x();
        setEnforceSwitchWidth(false);
        r();
        s();
    }
}

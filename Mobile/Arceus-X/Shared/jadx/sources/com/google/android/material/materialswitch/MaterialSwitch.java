package com.google.android.material.materialswitch;

import ad.C0143o;
import ad.C0146r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.C0546c;
import md.C8485a;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p365q.C10357a1;
import p368q2.C10425a;
import p513wc.C12348c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: k0 */
    public static final int f10327k0 = C6746j.f26119k;

    /* JADX INFO: renamed from: l0 */
    public static final int[] f10328l0 = {C6738b.f25894e0};

    /* JADX INFO: renamed from: U */
    public Drawable f10329U;

    /* JADX INFO: renamed from: V */
    public Drawable f10330V;

    /* JADX INFO: renamed from: W */
    public int f10331W;

    /* JADX INFO: renamed from: a0 */
    public Drawable f10332a0;

    /* JADX INFO: renamed from: b0 */
    public Drawable f10333b0;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f10334c0;

    /* JADX INFO: renamed from: d0 */
    public ColorStateList f10335d0;

    /* JADX INFO: renamed from: e0 */
    @NonNull
    public PorterDuff.Mode f10336e0;

    /* JADX INFO: renamed from: f0 */
    public ColorStateList f10337f0;

    /* JADX INFO: renamed from: g0 */
    public ColorStateList f10338g0;

    /* JADX INFO: renamed from: h0 */
    @NonNull
    public PorterDuff.Mode f10339h0;

    /* JADX INFO: renamed from: i0 */
    public int[] f10340i0;

    /* JADX INFO: renamed from: j0 */
    public int[] f10341j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25862D);
    }

    /* JADX INFO: renamed from: t */
    public static void m12856t(Drawable drawable, ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        C10425a.m40117n(drawable, C0546c.m2669c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f10329U;
    }

    public Drawable getThumbIconDrawable() {
        return this.f10330V;
    }

    public int getThumbIconSize() {
        return this.f10331W;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f10335d0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f10336e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f10334c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f10333b0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f10338g0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f10339h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f10332a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f10337f0;
    }

    @Override // android.view.View
    public void invalidate() {
        m12859u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f10330V != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10328l0);
        }
        this.f10340i0 = C12348c.m46211j(iArrOnCreateDrawableState);
        this.f10341j0 = C12348c.m46207f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    /* JADX INFO: renamed from: r */
    public final void m12857r() {
        this.f10329U = C12348c.m46204c(this.f10329U, this.f10334c0, getThumbTintMode());
        this.f10330V = C12348c.m46204c(this.f10330V, this.f10335d0, this.f10336e0);
        m12859u();
        Drawable drawable = this.f10329U;
        Drawable drawable2 = this.f10330V;
        int i10 = this.f10331W;
        super.setThumbDrawable(C12348c.m46203b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: s */
    public final void m12858s() {
        this.f10332a0 = C12348c.m46204c(this.f10332a0, this.f10337f0, getTrackTintMode());
        this.f10333b0 = C12348c.m46204c(this.f10333b0, this.f10338g0, this.f10339h0);
        m12859u();
        Drawable layerDrawable = this.f10332a0;
        if (layerDrawable != null && this.f10333b0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f10332a0, this.f10333b0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f10333b0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f10329U = drawable;
        m12857r();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f10330V = drawable;
        m12857r();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.f10331W != i10) {
            this.f10331W = i10;
            m12857r();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f10335d0 = colorStateList;
        m12857r();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f10336e0 = mode;
        m12857r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f10334c0 = colorStateList;
        m12857r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m12857r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f10333b0 = drawable;
        m12858s();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f10338g0 = colorStateList;
        m12858s();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f10339h0 = mode;
        m12858s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f10332a0 = drawable;
        m12858s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f10337f0 = colorStateList;
        m12858s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m12858s();
    }

    /* JADX INFO: renamed from: u */
    public final void m12859u() {
        if (this.f10334c0 == null && this.f10335d0 == null && this.f10337f0 == null && this.f10338g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f10334c0;
        if (colorStateList != null) {
            m12856t(this.f10329U, colorStateList, this.f10340i0, this.f10341j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f10335d0;
        if (colorStateList2 != null) {
            m12856t(this.f10330V, colorStateList2, this.f10340i0, this.f10341j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f10337f0;
        if (colorStateList3 != null) {
            m12856t(this.f10332a0, colorStateList3, this.f10340i0, this.f10341j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f10338g0;
        if (colorStateList4 != null) {
            m12856t(this.f10333b0, colorStateList4, this.f10340i0, this.f10341j0, thumbPosition);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10327k0;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10331W = -1;
        Context context2 = getContext();
        this.f10329U = super.getThumbDrawable();
        this.f10334c0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f10332a0 = super.getTrackDrawable();
        this.f10337f0 = super.getTrackTintList();
        super.setTrackTintList(null);
        C10357a1 c10357a1M437j = C0143o.m437j(context2, attributeSet, C6747k.f26449i4, i10, i11, new int[0]);
        this.f10330V = c10357a1M437j.m39735g(C6747k.f26458j4);
        this.f10331W = c10357a1M437j.m39734f(C6747k.f26467k4, -1);
        this.f10335d0 = c10357a1M437j.m39731c(C6747k.f26476l4);
        int iM39739k = c10357a1M437j.m39739k(C6747k.f26485m4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f10336e0 = C0146r.m454i(iM39739k, mode);
        this.f10333b0 = c10357a1M437j.m39735g(C6747k.f26494n4);
        this.f10338g0 = c10357a1M437j.m39731c(C6747k.f26503o4);
        this.f10339h0 = C0146r.m454i(c10357a1M437j.m39739k(C6747k.f26512p4, -1), mode);
        c10357a1M437j.m39749x();
        setEnforceSwitchWidth(false);
        m12857r();
        m12858s();
    }
}

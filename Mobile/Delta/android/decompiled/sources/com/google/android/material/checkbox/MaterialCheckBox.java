package com.google.android.material.checkbox;

import ad.o;
import ad.r;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import d3.d;
import ic.e;
import ic.f;
import ic.i;
import ic.j;
import ic.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.a1;
import q.g;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends g {
    public static final int[] A;
    public static final int[][] B;

    @SuppressLint({"DiscouragedApi"})
    public static final int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f7815y = j.f20772u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7816z = {ic.b.f20592b0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f7817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f7823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f7824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f7825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f7827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f7828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f7831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f7833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p5.c f7835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p5.b f7836x;

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7837a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        public final String a() {
            int i10 = this.f7837a;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f7837a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7837a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends p5.b {
        public a() {
        }

        @Override // p5.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f7827o;
            if (colorStateList != null) {
                q2.a.o(drawable, colorStateList);
            }
        }

        @Override // p5.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f7827o;
            if (colorStateList != null) {
                q2.a.n(drawable, colorStateList.getColorForState(materialCheckBox.f7831s, MaterialCheckBox.this.f7827o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = ic.b.f20591a0;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20595d);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f7830r;
        if (i10 == 1) {
            return getResources().getString(i.f20737h);
        }
        return i10 == 0 ? getResources().getString(i.f20739j) : getResources().getString(i.f20738i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7819g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = uc.a.d(this, ic.b.f20601g);
            int iD2 = uc.a.d(this, ic.b.f20605i);
            int iD3 = uc.a.d(this, ic.b.f20612o);
            int iD4 = uc.a.d(this, ic.b.f20607j);
            iArr2[0] = uc.a.j(iD3, iD2, 1.0f);
            iArr2[1] = uc.a.j(iD3, iD, 1.0f);
            iArr2[2] = uc.a.j(iD3, iD4, 0.54f);
            iArr2[3] = uc.a.j(iD3, iD4, 0.38f);
            iArr2[4] = uc.a.j(iD3, iD4, 0.38f);
            this.f7819g = new ColorStateList(iArr, iArr2);
        }
        return this.f7819g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7827o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void c(@NonNull b bVar) {
        this.f7818f.add(bVar);
    }

    public final boolean d(a1 a1Var) {
        return a1Var.n(k.M3, 0) == C && a1Var.n(k.N3, 0) == 0;
    }

    public boolean e() {
        return this.f7822j;
    }

    public final void f() {
        this.f7824l = wc.c.d(this.f7824l, this.f7827o, d.c(this));
        this.f7825m = wc.c.d(this.f7825m, this.f7828p, this.f7829q);
        h();
        i();
        super.setButtonDrawable(wc.c.a(this.f7824l, this.f7825m));
        refreshDrawableState();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f7833u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7824l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7825m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7828p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7829q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7827o;
    }

    public int getCheckedState() {
        return this.f7830r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7823k;
    }

    public final void h() {
        p5.c cVar;
        if (this.f7826n) {
            p5.c cVar2 = this.f7835w;
            if (cVar2 != null) {
                cVar2.f(this.f7836x);
                this.f7835w.b(this.f7836x);
            }
            Drawable drawable = this.f7824l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f7835w) == null) {
                return;
            }
            int i10 = f.b;
            int i11 = f.W;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f7824l).addTransition(f.f20690j, i11, this.f7835w, false);
        }
    }

    public final void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f7824l;
        if (drawable != null && (colorStateList2 = this.f7827o) != null) {
            q2.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f7825m;
        if (drawable2 == null || (colorStateList = this.f7828p) == null) {
            return;
        }
        q2.a.o(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f7830r == 1;
    }

    public final void j() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7820h && this.f7827o == null && this.f7828p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7816z);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.f7831s = wc.c.f(iArrOnCreateDrawableState);
        j();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f7821i || !TextUtils.isEmpty(getText()) || (drawableA = d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (r.h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            q2.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && e()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7823k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f7837a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7837a = getCheckedState();
        return savedState;
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7825m = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7828p == colorStateList) {
            return;
        }
        this.f7828p = colorStateList;
        f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f7829q == mode) {
            return;
        }
        this.f7829q = mode;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7827o == colorStateList) {
            return;
        }
        this.f7827o = colorStateList;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f7821i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7830r != i10) {
            this.f7830r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            g();
            if (this.f7832t) {
                return;
            }
            this.f7832t = true;
            LinkedHashSet<b> linkedHashSet = this.f7818f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f7830r);
                }
            }
            if (this.f7830r != 2 && (onCheckedChangeListener = this.f7834v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f7832t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7823k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f7822j == z10) {
            return;
        }
        this.f7822j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f7817e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f7822j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7834v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7833u = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7820h = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7815y;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7817e = new LinkedHashSet<>();
        this.f7818f = new LinkedHashSet<>();
        this.f7835w = p5.c.a(getContext(), e.f20676h);
        this.f7836x = new a();
        Context context2 = getContext();
        this.f7824l = d.a(this);
        this.f7827o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a1 a1VarJ = o.j(context2, attributeSet, k.L3, i10, i11, new int[0]);
        this.f7825m = a1VarJ.g(k.O3);
        if (this.f7824l != null && o.g(context2) && d(a1VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f7824l = k.a.b(context2, e.f20675g);
            this.f7826n = true;
            if (this.f7825m == null) {
                this.f7825m = k.a.b(context2, e.f20677i);
            }
        }
        this.f7828p = ed.c.b(context2, a1VarJ, k.P3);
        this.f7829q = r.i(a1VarJ.k(k.Q3, -1), PorterDuff.Mode.SRC_IN);
        this.f7820h = a1VarJ.a(k.V3, false);
        this.f7821i = a1VarJ.a(k.R3, true);
        this.f7822j = a1VarJ.a(k.U3, false);
        this.f7823k = a1VarJ.p(k.T3);
        int i12 = k.S3;
        if (a1VarJ.s(i12)) {
            setCheckedState(a1VarJ.k(i12, 0));
        }
        a1VarJ.x();
        f();
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7824l = drawable;
        this.f7826n = false;
        f();
    }
}

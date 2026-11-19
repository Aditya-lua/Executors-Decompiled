package com.google.android.material.checkbox;

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
import bd.o;
import bd.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.e;
import jc.f;
import jc.i;
import jc.j;
import jc.k;
import q.b1;
import q.g;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends g {
    public static final int[] A;
    public static final int[][] B;

    @SuppressLint({"DiscouragedApi"})
    public static final int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f7659y = j.f20460u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7660z = {jc.b.f20280b0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f7661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f7667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f7668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f7669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f7671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f7672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f7675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f7677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q5.c f7679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q5.b f7680x;

    public class a extends q5.b {
        public a() {
        }

        @Override // q5.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f7671o;
            if (colorStateList != null) {
                q2.a.o(drawable, colorStateList);
            }
        }

        @Override // q5.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f7671o;
            if (colorStateList != null) {
                q2.a.n(drawable, colorStateList.getColorForState(materialCheckBox.f7675s, MaterialCheckBox.this.f7671o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    public static class d extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7681a;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        public final String a() {
            int i10 = this.f7681a;
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
            parcel.writeValue(Integer.valueOf(this.f7681a));
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f7681a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = jc.b.f20279a0;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jc.b.f20283d);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f7674r;
        if (i10 == 1) {
            return getResources().getString(i.f20425h);
        }
        return i10 == 0 ? getResources().getString(i.f20427j) : getResources().getString(i.f20426i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7663g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = vc.a.d(this, jc.b.f20289g);
            int iD2 = vc.a.d(this, jc.b.f20293i);
            int iD3 = vc.a.d(this, jc.b.f20300o);
            int iD4 = vc.a.d(this, jc.b.f20295j);
            iArr2[0] = vc.a.j(iD3, iD2, 1.0f);
            iArr2[1] = vc.a.j(iD3, iD, 1.0f);
            iArr2[2] = vc.a.j(iD3, iD4, 0.54f);
            iArr2[3] = vc.a.j(iD3, iD4, 0.38f);
            iArr2[4] = vc.a.j(iD3, iD4, 0.38f);
            this.f7663g = new ColorStateList(iArr, iArr2);
        }
        return this.f7663g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7671o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void c(@NonNull b bVar) {
        this.f7662f.add(bVar);
    }

    public final boolean d(b1 b1Var) {
        return b1Var.n(k.M3, 0) == C && b1Var.n(k.N3, 0) == 0;
    }

    public boolean e() {
        return this.f7666j;
    }

    public final void f() {
        this.f7668l = xc.c.d(this.f7668l, this.f7671o, d3.d.c(this));
        this.f7669m = xc.c.d(this.f7669m, this.f7672p, this.f7673q);
        h();
        i();
        super.setButtonDrawable(xc.c.a(this.f7668l, this.f7669m));
        refreshDrawableState();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f7677u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7668l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7669m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7672p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7673q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7671o;
    }

    public int getCheckedState() {
        return this.f7674r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7667k;
    }

    public final void h() {
        q5.c cVar;
        if (this.f7670n) {
            q5.c cVar2 = this.f7679w;
            if (cVar2 != null) {
                cVar2.f(this.f7680x);
                this.f7679w.b(this.f7680x);
            }
            Drawable drawable = this.f7668l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f7679w) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(f.b, f.W, cVar, false);
            ((AnimatedStateListDrawable) this.f7668l).addTransition(f.f20378j, f.W, this.f7679w, false);
        }
    }

    public final void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f7668l;
        if (drawable != null && (colorStateList2 = this.f7671o) != null) {
            q2.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f7669m;
        if (drawable2 == null || (colorStateList = this.f7672p) == null) {
            return;
        }
        q2.a.o(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f7674r == 1;
    }

    public final void j() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7664h && this.f7671o == null && this.f7672p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7660z);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.f7675s = xc.c.f(iArrOnCreateDrawableState);
        j();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f7665i || !TextUtils.isEmpty(getText()) || (drawableA = d3.d.a(this)) == null) {
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
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7667k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f7681a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f7681a = getCheckedState();
        return dVar;
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7669m = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7672p == colorStateList) {
            return;
        }
        this.f7672p = colorStateList;
        f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f7673q == mode) {
            return;
        }
        this.f7673q = mode;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7671o == colorStateList) {
            return;
        }
        this.f7671o = colorStateList;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f7665i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7674r != i10) {
            this.f7674r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            g();
            if (this.f7676t) {
                return;
            }
            this.f7676t = true;
            LinkedHashSet<b> linkedHashSet = this.f7662f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f7674r);
                }
            }
            if (this.f7674r != 2 && (onCheckedChangeListener = this.f7678v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f7676t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7667k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f7666j == z10) {
            return;
        }
        this.f7666j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f7661e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f7666j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7678v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7677u = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7664h = z10;
        if (z10) {
            d3.d.d(this, getMaterialThemeColorsTintList());
        } else {
            d3.d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7659y;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7661e = new LinkedHashSet<>();
        this.f7662f = new LinkedHashSet<>();
        this.f7679w = q5.c.a(getContext(), e.f20364h);
        this.f7680x = new a();
        Context context2 = getContext();
        this.f7668l = d3.d.a(this);
        this.f7671o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        b1 b1VarJ = o.j(context2, attributeSet, k.L3, i10, i11, new int[0]);
        this.f7669m = b1VarJ.g(k.O3);
        if (this.f7668l != null && o.g(context2) && d(b1VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f7668l = k.a.b(context2, e.f20363g);
            this.f7670n = true;
            if (this.f7669m == null) {
                this.f7669m = k.a.b(context2, e.f20365i);
            }
        }
        this.f7672p = fd.c.b(context2, b1VarJ, k.P3);
        this.f7673q = r.i(b1VarJ.k(k.Q3, -1), PorterDuff.Mode.SRC_IN);
        this.f7664h = b1VarJ.a(k.V3, false);
        this.f7665i = b1VarJ.a(k.R3, true);
        this.f7666j = b1VarJ.a(k.U3, false);
        this.f7667k = b1VarJ.p(k.T3);
        if (b1VarJ.s(k.S3)) {
            setCheckedState(b1VarJ.k(k.S3, 0));
        }
        b1VarJ.x();
        f();
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7668l = drawable;
        this.f7670n = false;
        f();
    }
}

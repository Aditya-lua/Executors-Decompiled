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
import d3.d;
import hc.e;
import hc.f;
import hc.i;
import hc.j;
import hc.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.a1;
import q.g;
import zc.o;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends g {
    public static final int[] A;
    public static final int[][] B;

    @SuppressLint({"DiscouragedApi"})
    public static final int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f7741y = j.f18950u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7742z = {hc.b.f18770b0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f7743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f7749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f7750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f7751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f7753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f7754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f7757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f7759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p5.c f7761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p5.b f7762x;

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7763a;

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
            int i10 = this.f7763a;
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
            parcel.writeValue(Integer.valueOf(this.f7763a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7763a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends p5.b {
        public a() {
        }

        @Override // p5.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f7753o;
            if (colorStateList != null) {
                q2.a.o(drawable, colorStateList);
            }
        }

        @Override // p5.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f7753o;
            if (colorStateList != null) {
                q2.a.n(drawable, colorStateList.getColorForState(materialCheckBox.f7757s, MaterialCheckBox.this.f7753o.getDefaultColor()));
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
        int i10 = hc.b.f18769a0;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.f18773d);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f7756r;
        if (i10 == 1) {
            return getResources().getString(i.f18915h);
        }
        return i10 == 0 ? getResources().getString(i.f18917j) : getResources().getString(i.f18916i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7745g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = tc.a.d(this, hc.b.f18779g);
            int iD2 = tc.a.d(this, hc.b.f18783i);
            int iD3 = tc.a.d(this, hc.b.f18790o);
            int iD4 = tc.a.d(this, hc.b.f18785j);
            iArr2[0] = tc.a.j(iD3, iD2, 1.0f);
            iArr2[1] = tc.a.j(iD3, iD, 1.0f);
            iArr2[2] = tc.a.j(iD3, iD4, 0.54f);
            iArr2[3] = tc.a.j(iD3, iD4, 0.38f);
            iArr2[4] = tc.a.j(iD3, iD4, 0.38f);
            this.f7745g = new ColorStateList(iArr, iArr2);
        }
        return this.f7745g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7753o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void c(@NonNull b bVar) {
        this.f7744f.add(bVar);
    }

    public final boolean d(a1 a1Var) {
        return a1Var.n(k.M3, 0) == C && a1Var.n(k.N3, 0) == 0;
    }

    public boolean e() {
        return this.f7748j;
    }

    public final void f() {
        this.f7750l = vc.c.d(this.f7750l, this.f7753o, d.c(this));
        this.f7751m = vc.c.d(this.f7751m, this.f7754p, this.f7755q);
        h();
        i();
        super.setButtonDrawable(vc.c.a(this.f7750l, this.f7751m));
        refreshDrawableState();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f7759u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7750l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7751m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7754p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7755q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7753o;
    }

    public int getCheckedState() {
        return this.f7756r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7749k;
    }

    public final void h() {
        p5.c cVar;
        if (this.f7752n) {
            p5.c cVar2 = this.f7761w;
            if (cVar2 != null) {
                cVar2.f(this.f7762x);
                this.f7761w.b(this.f7762x);
            }
            Drawable drawable = this.f7750l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f7761w) == null) {
                return;
            }
            int i10 = f.b;
            int i11 = f.W;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f7750l).addTransition(f.f18868j, i11, this.f7761w, false);
        }
    }

    public final void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f7750l;
        if (drawable != null && (colorStateList2 = this.f7753o) != null) {
            q2.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f7751m;
        if (drawable2 == null || (colorStateList = this.f7754p) == null) {
            return;
        }
        q2.a.o(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f7756r == 1;
    }

    public final void j() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7746h && this.f7753o == null && this.f7754p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7742z);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.f7757s = vc.c.f(iArrOnCreateDrawableState);
        j();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f7747i || !TextUtils.isEmpty(getText()) || (drawableA = d.a(this)) == null) {
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
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7749k));
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
        setCheckedState(savedState.f7763a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7763a = getCheckedState();
        return savedState;
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7751m = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7754p == colorStateList) {
            return;
        }
        this.f7754p = colorStateList;
        f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f7755q == mode) {
            return;
        }
        this.f7755q = mode;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7753o == colorStateList) {
            return;
        }
        this.f7753o = colorStateList;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f7747i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7756r != i10) {
            this.f7756r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            g();
            if (this.f7758t) {
                return;
            }
            this.f7758t = true;
            LinkedHashSet<b> linkedHashSet = this.f7744f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f7756r);
                }
            }
            if (this.f7756r != 2 && (onCheckedChangeListener = this.f7760v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f7758t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7749k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f7748j == z10) {
            return;
        }
        this.f7748j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f7743e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f7748j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7760v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7759u = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7746h = z10;
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
        int i11 = f7741y;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7743e = new LinkedHashSet<>();
        this.f7744f = new LinkedHashSet<>();
        this.f7761w = p5.c.a(getContext(), e.f18854h);
        this.f7762x = new a();
        Context context2 = getContext();
        this.f7750l = d.a(this);
        this.f7753o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a1 a1VarJ = o.j(context2, attributeSet, k.L3, i10, i11, new int[0]);
        this.f7751m = a1VarJ.g(k.O3);
        if (this.f7750l != null && o.g(context2) && d(a1VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f7750l = k.a.b(context2, e.f18853g);
            this.f7752n = true;
            if (this.f7751m == null) {
                this.f7751m = k.a.b(context2, e.f18855i);
            }
        }
        this.f7754p = dd.c.b(context2, a1VarJ, k.P3);
        this.f7755q = r.i(a1VarJ.k(k.Q3, -1), PorterDuff.Mode.SRC_IN);
        this.f7746h = a1VarJ.a(k.V3, false);
        this.f7747i = a1VarJ.a(k.R3, true);
        this.f7748j = a1VarJ.a(k.U3, false);
        this.f7749k = a1VarJ.p(k.T3);
        int i12 = k.S3;
        if (a1VarJ.s(i12)) {
            setCheckedState(a1VarJ.k(i12, 0));
        }
        a1VarJ.x();
        f();
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7750l = drawable;
        this.f7752n = false;
        f();
    }
}

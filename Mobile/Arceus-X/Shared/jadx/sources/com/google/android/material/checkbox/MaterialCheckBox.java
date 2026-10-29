package com.google.android.material.checkbox;

import ad.C0143o;
import ad.C0146r;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.C8485a;
import p066d3.C4426d;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6741e;
import p194ic.C6742f;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p352p5.AbstractC10160b;
import p352p5.C10161c;
import p365q.C10357a1;
import p365q.C10373g;
import p368q2.C10425a;
import p463uc.C11840a;
import p513wc.C12348c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends C10373g {

    /* JADX INFO: renamed from: A */
    public static final int[] f9899A;

    /* JADX INFO: renamed from: B */
    public static final int[][] f9900B;

    /* JADX INFO: renamed from: C */
    @SuppressLint({"DiscouragedApi"})
    public static final int f9901C;

    /* JADX INFO: renamed from: y */
    public static final int f9902y = C6746j.f26129u;

    /* JADX INFO: renamed from: z */
    public static final int[] f9903z = {C6738b.f25888b0};

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinkedHashSet<InterfaceC2779c> f9904e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinkedHashSet<InterfaceC2778b> f9905f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f9906g;

    /* JADX INFO: renamed from: h */
    public boolean f9907h;

    /* JADX INFO: renamed from: i */
    public boolean f9908i;

    /* JADX INFO: renamed from: j */
    public boolean f9909j;

    /* JADX INFO: renamed from: k */
    public CharSequence f9910k;

    /* JADX INFO: renamed from: l */
    public Drawable f9911l;

    /* JADX INFO: renamed from: m */
    public Drawable f9912m;

    /* JADX INFO: renamed from: n */
    public boolean f9913n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f9914o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f9915p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public PorterDuff.Mode f9916q;

    /* JADX INFO: renamed from: r */
    public int f9917r;

    /* JADX INFO: renamed from: s */
    public int[] f9918s;

    /* JADX INFO: renamed from: t */
    public boolean f9919t;

    /* JADX INFO: renamed from: u */
    public CharSequence f9920u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f9921v;

    /* JADX INFO: renamed from: w */
    public final C10161c f9922w;

    /* JADX INFO: renamed from: x */
    public final AbstractC10160b f9923x;

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new C2776a();

        /* JADX INFO: renamed from: a */
        public int f9924a;

        /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        public class C2776a implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.os.Parcel) A[MD:(android.os.Parcel):void (m)] (LINE:1) call: com.google.android.material.checkbox.MaterialCheckBox.SavedState.<init>(android.os.Parcel):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ SavedState(Parcel parcel, C2777a c2777a) {
            this(parcel);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final String m12373a() {
            int i10 = this.f9924a;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m12373a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f9924a));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f9924a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    public class C2777a extends AbstractC10160b {
        public C2777a() {
        }

        @Override // p352p5.AbstractC10160b
        /* JADX INFO: renamed from: b */
        public void mo12376b(Drawable drawable) {
            super.mo12376b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f9914o;
            if (colorStateList != null) {
                C10425a.m40118o(drawable, colorStateList);
            }
        }

        @Override // p352p5.AbstractC10160b
        /* JADX INFO: renamed from: c */
        public void mo12377c(Drawable drawable) {
            super.mo12377c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f9914o;
            if (colorStateList != null) {
                C10425a.m40117n(drawable, colorStateList.getColorForState(materialCheckBox.f9918s, MaterialCheckBox.this.f9914o.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    public interface InterfaceC2778b {
        /* JADX INFO: renamed from: a */
        void mo12378a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$c */
    public interface InterfaceC2779c {
        /* JADX INFO: renamed from: a */
        void m12379a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = C6738b.f25886a0;
        f9899A = new int[]{i10};
        f9900B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f9901C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25891d);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f9917r;
        if (i10 == 1) {
            return getResources().getString(C6745i.f26089h);
        }
        return i10 == 0 ? getResources().getString(C6745i.f26091j) : getResources().getString(C6745i.f26090i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9906g == null) {
            int[][] iArr = f9900B;
            int[] iArr2 = new int[iArr.length];
            int iM44228d = C11840a.m44228d(this, C6738b.f25897g);
            int iM44228d2 = C11840a.m44228d(this, C6738b.f25901i);
            int iM44228d3 = C11840a.m44228d(this, C6738b.f25908o);
            int iM44228d4 = C11840a.m44228d(this, C6738b.f25903j);
            iArr2[0] = C11840a.m44234j(iM44228d3, iM44228d2, 1.0f);
            iArr2[1] = C11840a.m44234j(iM44228d3, iM44228d, 1.0f);
            iArr2[2] = C11840a.m44234j(iM44228d3, iM44228d4, 0.54f);
            iArr2[3] = C11840a.m44234j(iM44228d3, iM44228d4, 0.38f);
            iArr2[4] = C11840a.m44234j(iM44228d3, iM44228d4, 0.38f);
            this.f9906g = new ColorStateList(iArr, iArr2);
        }
        return this.f9906g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f9914o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: c */
    public void m12365c(@NonNull InterfaceC2778b interfaceC2778b) {
        this.f9905f.add(interfaceC2778b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12366d(C10357a1 c10357a1) {
        return c10357a1.m39742n(C6747k.f26247M3, 0) == f9901C && c10357a1.m39742n(C6747k.f26256N3, 0) == 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12367e() {
        return this.f9909j;
    }

    /* JADX INFO: renamed from: f */
    public final void m12368f() {
        this.f9911l = C12348c.m46205d(this.f9911l, this.f9914o, C4426d.m22265c(this));
        this.f9912m = C12348c.m46205d(this.f9912m, this.f9915p, this.f9916q);
        m12370h();
        m12371i();
        super.setButtonDrawable(C12348c.m46202a(this.f9911l, this.f9912m));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: g */
    public final void m12369g() {
        if (Build.VERSION.SDK_INT < 30 || this.f9920u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f9911l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f9912m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f9915p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f9916q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f9914o;
    }

    public int getCheckedState() {
        return this.f9917r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f9910k;
    }

    /* JADX INFO: renamed from: h */
    public final void m12370h() {
        C10161c c10161c;
        if (this.f9913n) {
            C10161c c10161c2 = this.f9922w;
            if (c10161c2 != null) {
                c10161c2.m39116f(this.f9923x);
                this.f9922w.m39113b(this.f9923x);
            }
            Drawable drawable = this.f9911l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (c10161c = this.f9922w) == null) {
                return;
            }
            int i10 = C6742f.f26031b;
            int i11 = C6742f.f26029W;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, c10161c, false);
            ((AnimatedStateListDrawable) this.f9911l).addTransition(C6742f.f26039j, i11, this.f9922w, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12371i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f9911l;
        if (drawable != null && (colorStateList2 = this.f9914o) != null) {
            C10425a.m40118o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f9912m;
        if (drawable2 == null || (colorStateList = this.f9915p) == null) {
            return;
        }
        C10425a.m40118o(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f9917r == 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m12372j() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9907h && this.f9914o == null && this.f9915p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9903z);
        }
        if (m12367e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9899A);
        }
        this.f9918s = C12348c.m46207f(iArrOnCreateDrawableState);
        m12372j();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableM22263a;
        if (!this.f9908i || !TextUtils.isEmpty(getText()) || (drawableM22263a = C4426d.m22263a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM22263a.getIntrinsicWidth()) / 2) * (C0146r.m453h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM22263a.getBounds();
            C10425a.m40115l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && m12367e()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f9910k));
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
        setCheckedState(savedState.f9924a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9924a = getCheckedState();
        return savedState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p365q.C10373g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f9912m = drawable;
        m12368f();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f9915p == colorStateList) {
            return;
        }
        this.f9915p = colorStateList;
        m12368f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f9916q == mode) {
            return;
        }
        this.f9916q = mode;
        m12368f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f9914o == colorStateList) {
            return;
        }
        this.f9914o = colorStateList;
        m12368f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m12368f();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f9908i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f9917r != i10) {
            this.f9917r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            m12369g();
            if (this.f9919t) {
                return;
            }
            this.f9919t = true;
            LinkedHashSet<InterfaceC2778b> linkedHashSet = this.f9905f;
            if (linkedHashSet != null) {
                Iterator<InterfaceC2778b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().mo12378a(this, this.f9917r);
                }
            }
            if (this.f9917r != 2 && (onCheckedChangeListener = this.f9921v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f9919t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        m12372j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f9910k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f9909j == z10) {
            return;
        }
        this.f9909j = z10;
        refreshDrawableState();
        Iterator<InterfaceC2779c> it = this.f9904e.iterator();
        while (it.hasNext()) {
            it.next().m12379a(this, this.f9909j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9921v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f9920u = charSequence;
        if (charSequence == null) {
            m12369g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f9907h = z10;
        if (z10) {
            C4426d.m22266d(this, getMaterialThemeColorsTintList());
        } else {
            C4426d.m22266d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9902y;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9904e = new LinkedHashSet<>();
        this.f9905f = new LinkedHashSet<>();
        this.f9922w = C10161c.m39110a(getContext(), C6741e.f26001h);
        this.f9923x = new C2777a();
        Context context2 = getContext();
        this.f9911l = C4426d.m22263a(this);
        this.f9914o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C10357a1 c10357a1M437j = C0143o.m437j(context2, attributeSet, C6747k.f26238L3, i10, i11, new int[0]);
        this.f9912m = c10357a1M437j.m39735g(C6747k.f26265O3);
        if (this.f9911l != null && C0143o.m434g(context2) && m12366d(c10357a1M437j)) {
            super.setButtonDrawable((Drawable) null);
            this.f9911l = C7399a.m30679b(context2, C6741e.f26000g);
            this.f9913n = true;
            if (this.f9912m == null) {
                this.f9912m = C7399a.m30679b(context2, C6741e.f26002i);
            }
        }
        this.f9915p = C5050c.m23737b(context2, c10357a1M437j, C6747k.f26274P3);
        this.f9916q = C0146r.m454i(c10357a1M437j.m39739k(C6747k.f26283Q3, -1), PorterDuff.Mode.SRC_IN);
        this.f9907h = c10357a1M437j.m39729a(C6747k.f26328V3, false);
        this.f9908i = c10357a1M437j.m39729a(C6747k.f26292R3, true);
        this.f9909j = c10357a1M437j.m39729a(C6747k.f26319U3, false);
        this.f9910k = c10357a1M437j.m39744p(C6747k.f26310T3);
        int i12 = C6747k.f26301S3;
        if (c10357a1M437j.m39747s(i12)) {
            setCheckedState(c10357a1M437j.m39739k(i12, 0));
        }
        c10357a1M437j.m39749x();
        m12368f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p365q.C10373g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f9911l = drawable;
        this.f9913n = false;
        m12368f();
    }
}

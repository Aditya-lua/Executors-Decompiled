package com.google.android.material.button;

import ad.C0143o;
import ad.C0146r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.C8485a;
import nc.C9406a;
import p066d3.C4431i;
import p101ed.C5050c;
import p168hd.C6364h;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p365q.C10370f;
import p368q2.C10425a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends C10370f implements Checkable, InterfaceC6370n {

    /* JADX INFO: renamed from: r */
    public static final int[] f9802r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f9803s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t */
    public static final int f9804t = C6746j.f26124p;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C9406a f9805d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinkedHashSet<InterfaceC2761a> f9806e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2762b f9807f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f9808g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f9809h;

    /* JADX INFO: renamed from: i */
    public Drawable f9810i;

    /* JADX INFO: renamed from: j */
    public String f9811j;

    /* JADX INFO: renamed from: k */
    public int f9812k;

    /* JADX INFO: renamed from: l */
    public int f9813l;

    /* JADX INFO: renamed from: m */
    public int f9814m;

    /* JADX INFO: renamed from: n */
    public int f9815n;

    /* JADX INFO: renamed from: o */
    public boolean f9816o;

    /* JADX INFO: renamed from: p */
    public boolean f9817p;

    /* JADX INFO: renamed from: q */
    public int f9818q;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2760a();

        /* JADX INFO: renamed from: c */
        public boolean f9819c;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public class C2760a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: f */
        public final void m12203f(@NonNull Parcel parcel) {
            this.f9819c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9819c ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m12203f(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC2761a {
        /* JADX INFO: renamed from: a */
        void m12207a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC2762b {
        /* JADX INFO: renamed from: a */
        void mo12208a(MaterialButton materialButton, boolean z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public boolean m12194a() {
        C9406a c9406a = this.f9805d;
        return c9406a != null && c9406a.m37125p();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12195b() {
        int i10 = this.f9818q;
        return i10 == 3 || i10 == 4;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12196c() {
        int i10 = this.f9818q;
        return i10 == 1 || i10 == 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12197d() {
        int i10 = this.f9818q;
        return i10 == 16 || i10 == 32;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12198e() {
        return C0625o0.m3065z(this) == 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12199f() {
        C9406a c9406a = this.f9805d;
        return (c9406a == null || c9406a.m37124o()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final void m12200g() {
        if (m12196c()) {
            C4431i.m22306m(this, this.f9810i, null, null, null);
        } else if (m12195b()) {
            C4431i.m22306m(this, null, null, this.f9810i, null);
        } else if (m12197d()) {
            C4431i.m22306m(this, null, this.f9810i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f9811j)) {
            return (m12194a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f9811j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m12199f()) {
            return this.f9805d.m37111b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9810i;
    }

    public int getIconGravity() {
        return this.f9818q;
    }

    public int getIconPadding() {
        return this.f9815n;
    }

    public int getIconSize() {
        return this.f9812k;
    }

    public ColorStateList getIconTint() {
        return this.f9809h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9808g;
    }

    public int getInsetBottom() {
        return this.f9805d.m37112c();
    }

    public int getInsetTop() {
        return this.f9805d.m37113d();
    }

    public ColorStateList getRippleColor() {
        if (m12199f()) {
            return this.f9805d.m37117h();
        }
        return null;
    }

    @NonNull
    public C6367k getShapeAppearanceModel() {
        if (m12199f()) {
            return this.f9805d.m37118i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m12199f()) {
            return this.f9805d.m37119j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m12199f()) {
            return this.f9805d.m37120k();
        }
        return 0;
    }

    @Override // p365q.C10370f
    public ColorStateList getSupportBackgroundTintList() {
        return m12199f() ? this.f9805d.m37121l() : super.getSupportBackgroundTintList();
    }

    @Override // p365q.C10370f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m12199f() ? this.f9805d.m37122m() : super.getSupportBackgroundTintMode();
    }

    /* JADX INFO: renamed from: h */
    public final void m12201h(boolean z10) {
        Drawable drawable = this.f9810i;
        if (drawable != null) {
            Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
            this.f9810i = drawableMutate;
            C10425a.m40118o(drawableMutate, this.f9809h);
            PorterDuff.Mode mode = this.f9808g;
            if (mode != null) {
                C10425a.m40119p(this.f9810i, mode);
            }
            int intrinsicWidth = this.f9812k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f9810i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f9812k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f9810i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9810i;
            int i10 = this.f9813l;
            int i11 = this.f9814m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f9810i.setVisible(true, z10);
        }
        if (z10) {
            m12200g();
            return;
        }
        Drawable[] drawableArrM22297d = C4431i.m22297d(this);
        Drawable drawable3 = drawableArrM22297d[0];
        Drawable drawable4 = drawableArrM22297d[1];
        Drawable drawable5 = drawableArrM22297d[2];
        if ((!m12196c() || drawable3 == this.f9810i) && ((!m12195b() || drawable5 == this.f9810i) && (!m12197d() || drawable4 == this.f9810i))) {
            return;
        }
        m12200g();
    }

    /* JADX INFO: renamed from: i */
    public final void m12202i(int i10, int i11) {
        if (this.f9810i == null || getLayout() == null) {
            return;
        }
        if (!m12196c() && !m12195b()) {
            if (m12197d()) {
                this.f9813l = 0;
                if (this.f9818q == 16) {
                    this.f9814m = 0;
                    m12201h(false);
                    return;
                }
                int intrinsicHeight = this.f9812k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f9810i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f9815n) - getPaddingBottom()) / 2);
                if (this.f9814m != iMax) {
                    this.f9814m = iMax;
                    m12201h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f9814m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f9818q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f9813l = 0;
            m12201h(false);
            return;
        }
        int intrinsicWidth = this.f9812k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f9810i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - C0625o0.m2984D(this)) - intrinsicWidth) - this.f9815n) - C0625o0.m2986E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (m12198e() != (this.f9818q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f9813l != textLayoutWidth) {
            this.f9813l = textLayoutWidth;
            m12201h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9816o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m12199f()) {
            C6364h.m27760f(this, this.f9805d.m37115f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (m12194a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9802r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9803s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p365q.C10370f, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p365q.C10370f, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m12194a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p365q.C10370f, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m12202i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        setChecked(savedState.f9819c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9819c = this.f9816o;
        return savedState;
    }

    @Override // p365q.C10370f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m12202i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f9805d.m37126q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9810i != null) {
            if (this.f9810i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f9811j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m12199f()) {
            this.f9805d.m37128s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // p365q.C10370f, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!m12199f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f9805d.m37129t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p365q.C10370f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m12199f()) {
            this.f9805d.m37130u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (m12194a() && isEnabled() && this.f9816o != z10) {
            this.f9816o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m12222m(this, this.f9816o);
            }
            if (this.f9817p) {
                return;
            }
            this.f9817p = true;
            Iterator<InterfaceC2761a> it = this.f9806e.iterator();
            while (it.hasNext()) {
                it.next().m12207a(this, this.f9816o);
            }
            this.f9817p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (m12199f()) {
            this.f9805d.m37131v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m12199f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m12199f()) {
            this.f9805d.m37115f().m27718Z(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9810i != drawable) {
            this.f9810i = drawable;
            m12201h(true);
            m12202i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f9818q != i10) {
            this.f9818q = i10;
            m12202i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f9815n != i10) {
            this.f9815n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f9812k != i10) {
            this.f9812k = i10;
            m12201h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9809h != colorStateList) {
            this.f9809h = colorStateList;
            m12201h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9808g != mode) {
            this.f9808g = mode;
            m12201h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C7399a.m30678a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f9805d.m37132w(i10);
    }

    public void setInsetTop(int i10) {
        this.f9805d.m37133x(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2762b interfaceC2762b) {
        this.f9807f = interfaceC2762b;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        InterfaceC2762b interfaceC2762b = this.f9807f;
        if (interfaceC2762b != null) {
            interfaceC2762b.mo12208a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m12199f()) {
            this.f9805d.m37134y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m12199f()) {
            setRippleColor(C7399a.m30678a(getContext(), i10));
        }
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        if (!m12199f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f9805d.m37135z(c6367k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m12199f()) {
            this.f9805d.m37099A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m12199f()) {
            this.f9805d.m37100B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m12199f()) {
            setStrokeColor(C7399a.m30678a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m12199f()) {
            this.f9805d.m37101C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m12199f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p365q.C10370f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m12199f()) {
            this.f9805d.m37102D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // p365q.C10370f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m12199f()) {
            this.f9805d.m37103E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        m12202i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f9805d.m37104F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9816o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25917x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9804t;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9806e = new LinkedHashSet<>();
        this.f9816o = false;
        this.f9817p = false;
        Context context2 = getContext();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26183F2, i10, i11, new int[0]);
        this.f9815n = typedArrayM436i.getDimensionPixelSize(C6747k.f26300S2, 0);
        this.f9808g = C0146r.m454i(typedArrayM436i.getInt(C6747k.f26327V2, -1), PorterDuff.Mode.SRC_IN);
        this.f9809h = C5050c.m23736a(getContext(), typedArrayM436i, C6747k.f26318U2);
        this.f9810i = C5050c.m23739d(getContext(), typedArrayM436i, C6747k.f26282Q2);
        this.f9818q = typedArrayM436i.getInteger(C6747k.f26291R2, 1);
        this.f9812k = typedArrayM436i.getDimensionPixelSize(C6747k.f26309T2, 0);
        C9406a c9406a = new C9406a(this, C6367k.m27766e(context2, attributeSet, i10, i11).m27806m());
        this.f9805d = c9406a;
        c9406a.m37127r(typedArrayM436i);
        typedArrayM436i.recycle();
        setCompoundDrawablePadding(this.f9815n);
        m12201h(this.f9810i != null);
    }
}

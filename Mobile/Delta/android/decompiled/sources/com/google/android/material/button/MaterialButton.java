package com.google.android.material.button;

import ad.o;
import ad.r;
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
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import d3.i;
import ed.c;
import hd.h;
import hd.k;
import hd.n;
import ic.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.f;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f7734r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f7735s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f7736t = j.f20767p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final nc.a f7737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<a> f7738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f7739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f7740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f7741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f7742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7750q;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7751c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void f(@NonNull Parcel parcel) {
            this.f7751c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7751c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            f(parcel);
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

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
        int gravity = getGravity() & 8388615;
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

    public boolean a() {
        nc.a aVar = this.f7737d;
        return aVar != null && aVar.p();
    }

    public final boolean b() {
        int i10 = this.f7750q;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.f7750q;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.f7750q;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        return o0.z(this) == 1;
    }

    public final boolean f() {
        nc.a aVar = this.f7737d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            i.m(this, this.f7742i, null, null, null);
        } else if (b()) {
            i.m(this, null, null, this.f7742i, null);
        } else if (d()) {
            i.m(this, null, this.f7742i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7743j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7743j;
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
        if (f()) {
            return this.f7737d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7742i;
    }

    public int getIconGravity() {
        return this.f7750q;
    }

    public int getIconPadding() {
        return this.f7747n;
    }

    public int getIconSize() {
        return this.f7744k;
    }

    public ColorStateList getIconTint() {
        return this.f7741h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7740g;
    }

    public int getInsetBottom() {
        return this.f7737d.c();
    }

    public int getInsetTop() {
        return this.f7737d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f7737d.h();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f7737d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f7737d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f7737d.k();
        }
        return 0;
    }

    @Override // q.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f7737d.l() : super.getSupportBackgroundTintList();
    }

    @Override // q.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f7737d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f7742i;
        if (drawable != null) {
            Drawable drawableMutate = q2.a.r(drawable).mutate();
            this.f7742i = drawableMutate;
            q2.a.o(drawableMutate, this.f7741h);
            PorterDuff.Mode mode = this.f7740g;
            if (mode != null) {
                q2.a.p(this.f7742i, mode);
            }
            int intrinsicWidth = this.f7744k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f7742i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f7744k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f7742i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7742i;
            int i10 = this.f7745l;
            int i11 = this.f7746m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f7742i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrD = i.d(this);
        Drawable drawable3 = drawableArrD[0];
        Drawable drawable4 = drawableArrD[1];
        Drawable drawable5 = drawableArrD[2];
        if ((!c() || drawable3 == this.f7742i) && ((!b() || drawable5 == this.f7742i) && (!d() || drawable4 == this.f7742i))) {
            return;
        }
        g();
    }

    public final void i(int i10, int i11) {
        if (this.f7742i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f7745l = 0;
                if (this.f7750q == 16) {
                    this.f7746m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f7744k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f7742i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f7747n) - getPaddingBottom()) / 2);
                if (this.f7746m != iMax) {
                    this.f7746m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f7746m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f7750q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7745l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f7744k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f7742i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - o0.D(this)) - intrinsicWidth) - this.f7747n) - o0.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f7750q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f7745l != textLayoutWidth) {
            this.f7745l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7748o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f7737d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7734r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7735s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // q.f, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // q.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // q.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f7751c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7751c = this.f7748o;
        return savedState;
    }

    @Override // q.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f7737d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7742i != null) {
            if (this.f7742i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7743j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f7737d.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // q.f, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f7737d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // q.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? k.a.b(getContext(), i10) : null);
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
        if (f()) {
            this.f7737d.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f7748o != z10) {
            this.f7748o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f7748o);
            }
            if (this.f7749p) {
                return;
            }
            this.f7749p = true;
            Iterator<a> it = this.f7738e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f7748o);
            }
            this.f7749p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f7737d.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f7737d.f().Z(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7742i != drawable) {
            this.f7742i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f7750q != i10) {
            this.f7750q = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f7747n != i10) {
            this.f7747n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7744k != i10) {
            this.f7744k = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7741h != colorStateList) {
            this.f7741h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7740g != mode) {
            this.f7740g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(k.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f7737d.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f7737d.x(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f7739f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f7739f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7737d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(k.a.a(getContext(), i10));
        }
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7737d.z(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f7737d.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7737d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(k.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f7737d.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // q.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f7737d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // q.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f7737d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f7737d.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7748o);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20621x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7736t;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7738e = new LinkedHashSet<>();
        this.f7748o = false;
        this.f7749p = false;
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, ic.k.F2, i10, i11, new int[0]);
        this.f7747n = typedArrayI.getDimensionPixelSize(ic.k.S2, 0);
        this.f7740g = r.i(typedArrayI.getInt(ic.k.V2, -1), PorterDuff.Mode.SRC_IN);
        this.f7741h = c.a(getContext(), typedArrayI, ic.k.U2);
        this.f7742i = c.d(getContext(), typedArrayI, ic.k.Q2);
        this.f7750q = typedArrayI.getInteger(ic.k.R2, 1);
        this.f7744k = typedArrayI.getDimensionPixelSize(ic.k.T2, 0);
        nc.a aVar = new nc.a(this, k.e(context2, attributeSet, i10, i11).m());
        this.f7737d = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f7747n);
        h(this.f7742i != null);
    }
}

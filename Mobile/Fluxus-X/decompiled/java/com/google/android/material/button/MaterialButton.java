package com.google.android.material.button;

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
import bd.o;
import bd.r;
import d3.i;
import id.h;
import id.k;
import id.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.j;
import q.f;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f7578r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f7579s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f7580t = j.f20455p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final oc.a f7581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<a> f7582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f7583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f7584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f7585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f7586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7594q;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public static class c extends r3.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7595c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void f(@NonNull Parcel parcel) {
            this.f7595c = parcel.readInt() == 1;
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7595c ? 1 : 0);
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            f(parcel);
        }
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
        oc.a aVar = this.f7581d;
        return aVar != null && aVar.p();
    }

    public final boolean b() {
        int i10 = this.f7594q;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.f7594q;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.f7594q;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        return o0.z(this) == 1;
    }

    public final boolean f() {
        oc.a aVar = this.f7581d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            i.m(this, this.f7586i, null, null, null);
        } else if (b()) {
            i.m(this, null, null, this.f7586i, null);
        } else if (d()) {
            i.m(this, null, this.f7586i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7587j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7587j;
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
            return this.f7581d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7586i;
    }

    public int getIconGravity() {
        return this.f7594q;
    }

    public int getIconPadding() {
        return this.f7591n;
    }

    public int getIconSize() {
        return this.f7588k;
    }

    public ColorStateList getIconTint() {
        return this.f7585h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7584g;
    }

    public int getInsetBottom() {
        return this.f7581d.c();
    }

    public int getInsetTop() {
        return this.f7581d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f7581d.h();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f7581d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f7581d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f7581d.k();
        }
        return 0;
    }

    @Override // q.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f7581d.l() : super.getSupportBackgroundTintList();
    }

    @Override // q.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f7581d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f7586i;
        if (drawable != null) {
            Drawable drawableMutate = q2.a.r(drawable).mutate();
            this.f7586i = drawableMutate;
            q2.a.o(drawableMutate, this.f7585h);
            PorterDuff.Mode mode = this.f7584g;
            if (mode != null) {
                q2.a.p(this.f7586i, mode);
            }
            int intrinsicWidth = this.f7588k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f7586i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f7588k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f7586i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7586i;
            int i10 = this.f7589l;
            int i11 = this.f7590m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f7586i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrD = i.d(this);
        Drawable drawable3 = drawableArrD[0];
        Drawable drawable4 = drawableArrD[1];
        Drawable drawable5 = drawableArrD[2];
        if ((!c() || drawable3 == this.f7586i) && ((!b() || drawable5 == this.f7586i) && (!d() || drawable4 == this.f7586i))) {
            return;
        }
        g();
    }

    public final void i(int i10, int i11) {
        if (this.f7586i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f7589l = 0;
                if (this.f7594q == 16) {
                    this.f7590m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f7588k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f7586i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f7591n) - getPaddingBottom()) / 2);
                if (this.f7590m != iMax) {
                    this.f7590m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f7590m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f7594q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7589l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f7588k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f7586i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - o0.D(this)) - intrinsicWidth) - this.f7591n) - o0.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f7594q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f7589l != textLayoutWidth) {
            this.f7589l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7592o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f7581d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7578r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7579s);
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
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f7595c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f7595c = this.f7592o;
        return cVar;
    }

    @Override // q.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f7581d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7586i != null) {
            if (this.f7586i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7587j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f7581d.s(i10);
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
            this.f7581d.t();
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
            this.f7581d.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f7592o != z10) {
            this.f7592o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f7592o);
            }
            if (this.f7593p) {
                return;
            }
            this.f7593p = true;
            Iterator<a> it = this.f7582e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f7592o);
            }
            this.f7593p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f7581d.v(i10);
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
            this.f7581d.f().Z(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7586i != drawable) {
            this.f7586i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f7594q != i10) {
            this.f7594q = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f7591n != i10) {
            this.f7591n = i10;
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
        if (this.f7588k != i10) {
            this.f7588k = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7585h != colorStateList) {
            this.f7585h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7584g != mode) {
            this.f7584g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(k.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f7581d.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f7581d.x(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f7583f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f7583f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7581d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(k.a.a(getContext(), i10));
        }
    }

    @Override // id.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7581d.z(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f7581d.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7581d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(k.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f7581d.C(i10);
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
            this.f7581d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // q.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f7581d.E(mode);
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
        this.f7581d.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7592o);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jc.b.f20309x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7580t;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7582e = new LinkedHashSet<>();
        this.f7592o = false;
        this.f7593p = false;
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, jc.k.F2, i10, i11, new int[0]);
        this.f7591n = typedArrayI.getDimensionPixelSize(jc.k.S2, 0);
        this.f7584g = r.i(typedArrayI.getInt(jc.k.V2, -1), PorterDuff.Mode.SRC_IN);
        this.f7585h = fd.c.a(getContext(), typedArrayI, jc.k.U2);
        this.f7586i = fd.c.d(getContext(), typedArrayI, jc.k.Q2);
        this.f7594q = typedArrayI.getInteger(jc.k.R2, 1);
        this.f7588k = typedArrayI.getDimensionPixelSize(jc.k.T2, 0);
        oc.a aVar = new oc.a(this, k.e(context2, attributeSet, i10, i11).m());
        this.f7581d = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f7591n);
        h(this.f7586i != null);
    }
}

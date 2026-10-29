package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.chip.Chip;
import dd.d;
import dd.f;
import gd.k;
import gd.n;
import hc.i;
import hc.j;
import ic.h;
import java.util.List;
import q.g;
import y2.p;
import zc.o;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends g implements com.google.android.material.chip.a.InterfaceC0119a, n, Checkable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f7764w = j.f18948s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Rect f7765x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f7766y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7767z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f7768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f7769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RippleDrawable f7770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f7771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f7780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final c f7781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f7783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f7784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f7785v;

    public class a extends f {
        public a() {
        }

        @Override // dd.f
        public void a(int i10) {
        }

        @Override // dd.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f7768e.P2() ? Chip.this.f7768e.k1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f7768e != null) {
                Chip.this.f7768e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends r3.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // r3.a
        public int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // r3.a
        public void C(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f7771h != null) {
                list.add(1);
            }
        }

        @Override // r3.a
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // r3.a
        public void M(@NonNull p pVar) {
            pVar.j0(Chip.this.r());
            pVar.m0(Chip.this.isClickable());
            pVar.l0(Chip.this.getAccessibilityClassName());
            pVar.K0(Chip.this.getText());
        }

        @Override // r3.a
        public void N(int i10, @NonNull p pVar) {
            if (i10 != 1) {
                pVar.p0("");
                pVar.g0(Chip.f7765x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                pVar.p0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                pVar.p0(Chip.this.getContext().getString(i.f18918k, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            pVar.g0(Chip.this.getCloseIconTouchBoundsInt());
            pVar.b(p.a.f35506i);
            pVar.r0(Chip.this.isEnabled());
        }

        @Override // r3.a
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f7776m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.f18775e);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f7772i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f7784u.setEmpty();
        if (n() && this.f7771h != null) {
            this.f7768e.b1(this.f7784u);
        }
        return this.f7784u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7783t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7783t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f7775l != z10) {
            this.f7775l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f7774k != z10) {
            this.f7774k = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f7768e) == null) {
            return;
        }
        int iM0 = (int) (aVar.M0() + this.f7768e.m1() + this.f7768e.t0());
        int iR0 = (int) (this.f7768e.R0() + this.f7768e.n1() + this.f7768e.p0());
        if (this.f7769f != null) {
            Rect rect = new Rect();
            this.f7769f.getPadding(rect);
            iR0 += rect.left;
            iM0 += rect.right;
        }
        o0.B0(this, iR0, getPaddingTop(), iM0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f7785v);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0119a
    public void a() {
        l(this.f7779p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f7782s) {
            return this.f7781r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7782s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f7781r.w(keyEvent) || this.f7781r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // q.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f7768e;
        if ((aVar == null || !aVar.s1()) ? false : this.f7768e.o2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f7780q)) {
            return this.f7780q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof qc.b) && ((qc.b) parent).f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7769f;
        return insetDrawable == null ? this.f7768e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.L0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7768e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f7782s && (this.f7781r.A() == 1 || this.f7781r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f7768e.E();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public final void j(@NonNull com.google.android.material.chip.a aVar) {
        aVar.s2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f7776m) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f7775l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f7774k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f7776m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f7775l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f7774k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean l(int i10) {
        this.f7779p = i10;
        if (!v()) {
            if (this.f7769f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f7768e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f7768e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f7769f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f7769f != null) {
            Rect rect = new Rect();
            this.f7769f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.f7769f && this.f7768e.getCallback() == null) {
            this.f7768e.setCallback(this.f7769f);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f7768e;
        return (aVar == null || aVar.U0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = o.i(context, attributeSet, hc.k.f19085o0, i10, f7764w, new int[0]);
        this.f7777n = typedArrayI.getBoolean(hc.k.U0, false);
        this.f7779p = (int) Math.ceil(typedArrayI.getDimension(hc.k.I0, (float) Math.ceil(r.d(getContext(), 48))));
        typedArrayI.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gd.h.f(this, this.f7768e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7766y);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7767z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f7782s) {
            this.f7781r.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof qc.b) {
            qc.b bVar = (qc.b) getParent();
            p.O0(accessibilityNodeInfo).o0(p.g.b(bVar.b(this), 1, bVar.c() ? bVar.d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f7778o != i10) {
            this.f7778o = i10;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f7774k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f7774k) {
                    t();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f7769f = new InsetDrawable((Drawable) this.f7768e, i10, i11, i12, i13);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f7768e;
        return aVar != null && aVar.r1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f7768e;
        return aVar != null && aVar.t1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7780q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7770g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // q.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7770g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // q.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.A1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar == null) {
            this.f7773j = z10;
        } else if (aVar.r1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.C1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.I1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.K1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f7768e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f7768e = aVar;
            aVar.D2(false);
            j(this.f7768e);
            l(this.f7779p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.O1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.W1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.a2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.c2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.f2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.g2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.h2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.j2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.k2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.p2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // q.g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // q.g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.Z(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7768e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.t2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f7777n = z10;
        l(this.f7779p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.u2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.w2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.y2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(zc.i<Chip> iVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f7768e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7772i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7771h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.B2(colorStateList);
        }
        if (this.f7768e.p1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.C2(i10);
            if (this.f7768e.p1()) {
                return;
            }
            z();
        }
    }

    @Override // gd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f7768e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.E2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.P2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f7768e;
        if (aVar2 != null) {
            aVar2.G2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.H2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.J2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.K2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.L2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.M2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.N2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f7771h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f7782s) {
            this.f7781r.U(1, 1);
        }
        return z10;
    }

    public final void u() {
        if (this.f7769f != null) {
            this.f7769f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f7777n;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.s2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f7771h != null) {
            o0.m0(this, this.f7781r);
            this.f7782s = true;
        } else {
            o0.m0(this, null);
            this.f7782s = false;
        }
    }

    public final void y() {
        if (ed.b.f15434a) {
            z();
            return;
        }
        this.f7768e.O2(true);
        o0.q0(this, getBackgroundDrawable());
        A();
        m();
    }

    public final void z() {
        this.f7770g = new RippleDrawable(ed.b.a(this.f7768e.i1()), getBackgroundDrawable(), null);
        this.f7768e.O2(false);
        o0.q0(this, this.f7770g);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7764w;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7783t = new Rect();
        this.f7784u = new RectF();
        this.f7785v = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarY0 = com.google.android.material.chip.a.y0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarY0);
        aVarY0.Z(o0.u(this));
        TypedArray typedArrayI = o.i(context2, attributeSet, hc.k.f19085o0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(hc.k.Z0);
        typedArrayI.recycle();
        this.f7781r = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f7773j);
        setText(aVarY0.k1());
        setEllipsize(aVarY0.e1());
        B();
        if (!this.f7768e.P2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f7779p);
        }
        this.f7778o = o0.z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qc.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f29300a, compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.r2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.H1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.V1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.I2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f7768e;
        if (aVar != null) {
            aVar.I2(i10);
        }
        B();
    }
}

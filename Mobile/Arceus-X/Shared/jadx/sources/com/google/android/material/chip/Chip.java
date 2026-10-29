package com.google.android.material.chip;

import ad.C0143o;
import ad.C0146r;
import ad.InterfaceC0137i;
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
import androidx.core.view.C0625o0;
import androidx.core.view.PointerIconCompat;
import com.google.android.material.chip.Chip;
import java.util.List;
import md.C8485a;
import p101ed.AbstractC5053f;
import p101ed.C5051d;
import p126fd.C5584b;
import p168hd.C6364h;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7144h;
import p365q.C10373g;
import p400r3.AbstractC10780a;
import p408rc.C10814b;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends C10373g implements C2783a.a, InterfaceC6370n, Checkable {

    /* JADX INFO: renamed from: w */
    public static final int f9926w = C6746j.f26127s;

    /* JADX INFO: renamed from: x */
    public static final Rect f9927x = new Rect();

    /* JADX INFO: renamed from: y */
    public static final int[] f9928y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z */
    public static final int[] f9929z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C2783a f9930e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f9931f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f9932g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f9933h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f9934i;

    /* JADX INFO: renamed from: j */
    public boolean f9935j;

    /* JADX INFO: renamed from: k */
    public boolean f9936k;

    /* JADX INFO: renamed from: l */
    public boolean f9937l;

    /* JADX INFO: renamed from: m */
    public boolean f9938m;

    /* JADX INFO: renamed from: n */
    public boolean f9939n;

    /* JADX INFO: renamed from: o */
    public int f9940o;

    /* JADX INFO: renamed from: p */
    public int f9941p;

    /* JADX INFO: renamed from: q */
    public CharSequence f9942q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final C2782c f9943r;

    /* JADX INFO: renamed from: s */
    public boolean f9944s;

    /* JADX INFO: renamed from: t */
    public final Rect f9945t;

    /* JADX INFO: renamed from: u */
    public final RectF f9946u;

    /* JADX INFO: renamed from: v */
    public final AbstractC5053f f9947v;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    public class C2780a extends AbstractC5053f {
        public C2780a() {
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: a */
        public void mo425a(int i10) {
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: b */
        public void mo426b(@NonNull Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f9930e.m12467P2() ? Chip.this.f9930e.m12514k1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    public class C2781b extends ViewOutlineProvider {
        public C2781b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f9930e != null) {
                Chip.this.f9930e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$c */
    public class C2782c extends AbstractC10780a {
        public C2782c(Chip chip) {
            super(chip);
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: B */
        public int mo12409B(float f10, float f11) {
            return (Chip.this.m12396n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: C */
        public void mo12410C(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.m12396n() && Chip.this.m12401s() && Chip.this.f9933h != null) {
                list.add(1);
            }
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: J */
        public boolean mo12411J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.m12402t();
            }
            return false;
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: M */
        public void mo12412M(@NonNull C13017p c13017p) {
            c13017p.m48404j0(Chip.this.m12400r());
            c13017p.m48410m0(Chip.this.isClickable());
            c13017p.m48408l0(Chip.this.getAccessibilityClassName());
            c13017p.m48370K0(Chip.this.getText());
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: N */
        public void mo12413N(int i10, @NonNull C13017p c13017p) {
            if (i10 != 1) {
                c13017p.m48416p0("");
                c13017p.m48398g0(Chip.f9927x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c13017p.m48416p0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                c13017p.m48416p0(Chip.this.getContext().getString(C6745i.f26092k, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            c13017p.m48398g0(Chip.this.getCloseIconTouchBoundsInt());
            c13017p.m48388b(C13017p.a.f46067i);
            c13017p.m48419r0(Chip.this.isEnabled());
        }

        @Override // p400r3.AbstractC10780a
        /* JADX INFO: renamed from: O */
        public void mo12414O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f9938m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25893e);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12380b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f9934i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f9946u.setEmpty();
        if (m12396n() && this.f9933h != null) {
            this.f9930e.m12496b1(this.f9946u);
        }
        return this.f9946u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f9945t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f9945t;
    }

    private C5051d getTextAppearance() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12516l1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f9937l != z10) {
            this.f9937l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f9936k != z10) {
            this.f9936k = z10;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m12388A() {
        C2783a c2783a;
        if (TextUtils.isEmpty(getText()) || (c2783a = this.f9930e) == null) {
            return;
        }
        int iM12456M0 = (int) (c2783a.m12456M0() + this.f9930e.m12518m1() + this.f9930e.m12537t0());
        int iM12471R0 = (int) (this.f9930e.m12471R0() + this.f9930e.m12521n1() + this.f9930e.m12526p0());
        if (this.f9931f != null) {
            Rect rect = new Rect();
            this.f9931f.getPadding(rect);
            iM12471R0 += rect.left;
            iM12456M0 += rect.right;
        }
        C0625o0.m2981B0(this, iM12471R0, getPaddingTop(), iM12456M0, getPaddingBottom());
    }

    /* JADX INFO: renamed from: B */
    public final void m12389B() {
        TextPaint paint = getPaint();
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            paint.drawableState = c2783a.getState();
        }
        C5051d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m23757n(getContext(), paint, this.f9947v);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12390C(AttributeSet attributeSet) {
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

    @Override // com.google.android.material.chip.C2783a.a
    /* JADX INFO: renamed from: a */
    public void mo12391a() {
        m12394l(this.f9941p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f9944s) {
            return this.f9943r.m41038v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9944s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f9943r.m41039w(keyEvent) || this.f9943r.m41016A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // p365q.C10373g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2783a c2783a = this.f9930e;
        if ((c2783a == null || !c2783a.m12535s1()) ? false : this.f9930e.m12525o2(m12393k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9942q)) {
            return this.f9942q;
        }
        if (!m12400r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof C10814b) && ((C10814b) parent).m41181f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9931f;
        return insetDrawable == null ? this.f9930e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12444I0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12447J0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12450K0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return Math.max(0.0f, c2783a.m12453L0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9930e;
    }

    public float getChipEndPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12456M0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12459N0();
        }
        return null;
    }

    public float getChipIconSize() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12462O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12465P0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12468Q0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12471R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12474S0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12477T0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12480U0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12483V0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12486W0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12488X0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12490Y0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12494a1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12502e1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f9944s && (this.f9943r.m41016A() == 1 || this.f9943r.m41040x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C7144h getHideMotionSpec() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12504f1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12506g1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12508h1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12510i1();
        }
        return null;
    }

    @NonNull
    public C6367k getShapeAppearanceModel() {
        return this.f9930e.m27698E();
    }

    public C7144h getShowMotionSpec() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12512j1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12518m1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            return c2783a.m12521n1();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public final void m12392j(@NonNull C2783a c2783a) {
        c2783a.m12536s2(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    /* JADX INFO: renamed from: k */
    public final int[] m12393k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f9938m) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f9937l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f9936k) {
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
        if (this.f9938m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f9937l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f9936k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: l */
    public boolean m12394l(int i10) {
        this.f9941p = i10;
        if (!m12404v()) {
            if (this.f9931f != null) {
                m12403u();
            } else {
                m12407y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f9930e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f9930e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f9931f != null) {
                m12403u();
            } else {
                m12407y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f9931f != null) {
            Rect rect = new Rect();
            this.f9931f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                m12407y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        m12399q(i11, i12, i11, i12);
        m12407y();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m12395m() {
        if (getBackgroundDrawable() == this.f9931f && this.f9930e.getCallback() == null) {
            this.f9930e.setCallback(this.f9931f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12396n() {
        C2783a c2783a = this.f9930e;
        return (c2783a == null || c2783a.m12480U0() == null) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public final void m12397o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayM436i = C0143o.m436i(context, attributeSet, C6747k.f26499o0, i10, f9926w, new int[0]);
        this.f9939n = typedArrayM436i.getBoolean(C6747k.f26316U0, false);
        this.f9941p = (int) Math.ceil(typedArrayM436i.getDimension(C6747k.f26208I0, (float) Math.ceil(C0146r.m449d(getContext(), 48))));
        typedArrayM436i.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27760f(this, this.f9930e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9928y);
        }
        if (m12400r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9929z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f9944s) {
            this.f9943r.m41020I(z10, i10, rect);
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
        accessibilityNodeInfo.setCheckable(m12400r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C10814b) {
            C10814b c10814b = (C10814b) getParent();
            C13017p.m48342O0(accessibilityNodeInfo).m48414o0(C13017p.g.m48455b(c10814b.m398b(this), 1, c10814b.mo399c() ? c10814b.m41179d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f9940o != i10) {
            this.f9940o = i10;
            m12388A();
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
                } else if (this.f9936k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f9936k) {
                    m12402t();
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

    /* JADX INFO: renamed from: p */
    public final void m12398p() {
        setOutlineProvider(new C2781b());
    }

    /* JADX INFO: renamed from: q */
    public final void m12399q(int i10, int i11, int i12, int i13) {
        this.f9931f = new InsetDrawable((Drawable) this.f9930e, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: r */
    public boolean m12400r() {
        C2783a c2783a = this.f9930e;
        return c2783a != null && c2783a.m12532r1();
    }

    /* JADX INFO: renamed from: s */
    public boolean m12401s() {
        C2783a c2783a = this.f9930e;
        return c2783a != null && c2783a.m12538t1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9942q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9932g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p365q.C10373g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9932g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p365q.C10373g, android.view.View
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12421A1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12424B1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        C2783a c2783a = this.f9930e;
        if (c2783a == null) {
            this.f9935j = z10;
        } else if (c2783a.m12532r1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12427C1(drawable);
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12430D1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12433E1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12436F1(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconVisible(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12439G1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12445I1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12448J1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12451K1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12454L1(i10);
        }
    }

    public void setChipDrawable(@NonNull C2783a c2783a) {
        C2783a c2783a2 = this.f9930e;
        if (c2783a2 != c2783a) {
            m12405w(c2783a2);
            this.f9930e = c2783a;
            c2783a.m12431D2(false);
            m12392j(this.f9930e);
            m12394l(this.f9941p);
        }
    }

    public void setChipEndPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12457M1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12460N1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12463O1(drawable);
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12466P1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12469Q1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12472R1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12475S1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12478T1(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconVisible(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12481U1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12487W1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12489X1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12491Y1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12493Z1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12495a2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12497b2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12499c2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12501d2(i10);
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12505f2(drawable);
        }
        m12406x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12507g2(charSequence);
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12509h2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12511i2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12513j2(i10);
        }
        m12406x();
    }

    public void setCloseIconSize(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12515k2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12517l2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12519m2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12522n2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12528p2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12530q2(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // p365q.C10373g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p365q.C10373g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m27718Z(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9930e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12539t2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f9939n = z10;
        m12394l(this.f9941p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C7144h c7144h) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12541u2(c7144h);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12543v2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12545w2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12548x2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12550y2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12553z2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0137i<Chip> interfaceC0137i) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f9930e == null) {
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12422A2(i10);
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
        this.f9934i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9933h = onClickListener;
        m12406x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12425B2(colorStateList);
        }
        if (this.f9930e.m12527p1()) {
            return;
        }
        m12408z();
    }

    public void setRippleColorResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12428C2(i10);
            if (this.f9930e.m12527p1()) {
                return;
            }
            m12408z();
        }
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        this.f9930e.setShapeAppearanceModel(c6367k);
    }

    public void setShowMotionSpec(C7144h c7144h) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12434E2(c7144h);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12437F2(i10);
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
        C2783a c2783a = this.f9930e;
        if (c2783a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2783a.m12467P2() ? null : charSequence, bufferType);
        C2783a c2783a2 = this.f9930e;
        if (c2783a2 != null) {
            c2783a2.m12440G2(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearance(C5051d c5051d) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12443H2(c5051d);
        }
        m12389B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12449J2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12452K2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12455L2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        m12389B();
    }

    public void setTextStartPadding(float f10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12458M2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12461N2(i10);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m12402t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f9933h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f9944s) {
            this.f9943r.m41028U(1, 1);
        }
        return z10;
    }

    /* JADX INFO: renamed from: u */
    public final void m12403u() {
        if (this.f9931f != null) {
            this.f9931f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m12407y();
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m12404v() {
        return this.f9939n;
    }

    /* JADX INFO: renamed from: w */
    public final void m12405w(C2783a c2783a) {
        if (c2783a != null) {
            c2783a.m12536s2(null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m12406x() {
        if (m12396n() && m12401s() && this.f9933h != null) {
            C0625o0.m3040m0(this, this.f9943r);
            this.f9944s = true;
        } else {
            C0625o0.m3040m0(this, null);
            this.f9944s = false;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12407y() {
        if (C5584b.f21377a) {
            m12408z();
            return;
        }
        this.f9930e.m12464O2(true);
        C0625o0.m3048q0(this, getBackgroundDrawable());
        m12388A();
        m12395m();
    }

    /* JADX INFO: renamed from: z */
    public final void m12408z() {
        this.f9932g = new RippleDrawable(C5584b.m25241a(this.f9930e.m12510i1()), getBackgroundDrawable(), null);
        this.f9930e.m12464O2(false);
        C0625o0.m3048q0(this, this.f9932g);
        m12388A();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9926w;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9945t = new Rect();
        this.f9946u = new RectF();
        this.f9947v = new C2780a();
        Context context2 = getContext();
        m12390C(attributeSet);
        C2783a c2783aM12419y0 = C2783a.m12419y0(context2, attributeSet, i10, i11);
        m12397o(context2, attributeSet, i10);
        setChipDrawable(c2783aM12419y0);
        c2783aM12419y0.m27718Z(C0625o0.m3055u(this));
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26499o0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayM436i.hasValue(C6747k.f26361Z0);
        typedArrayM436i.recycle();
        this.f9943r = new C2782c(this);
        m12406x();
        if (!zHasValue) {
            m12398p();
        }
        setChecked(this.f9935j);
        setText(c2783aM12419y0.m12514k1());
        setEllipsize(c2783aM12419y0.m12502e1());
        m12389B();
        if (!this.f9930e.m12467P2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m12388A();
        if (m12404v()) {
            setMinHeight(this.f9941p);
        }
        this.f9940o = C0625o0.m3065z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rc.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.m12380b(this.f38518a, compoundButton, z10);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCloseIconVisible(boolean z10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12533r2(z10);
        }
        m12406x();
    }

    public void setCheckedIconVisible(boolean z10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12442H1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12484V1(z10);
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
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12446I2(i10);
        }
        m12389B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C2783a c2783a = this.f9930e;
        if (c2783a != null) {
            c2783a.m12446I2(i10);
        }
        m12389B();
    }
}

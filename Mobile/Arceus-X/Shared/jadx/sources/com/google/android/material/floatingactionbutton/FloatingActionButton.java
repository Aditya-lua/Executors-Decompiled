package com.google.android.material.floatingactionbutton;

import ad.C0131c;
import ad.C0143o;
import ad.C0146r;
import ad.C0147s;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import gd.InterfaceC6089b;
import java.util.List;
import md.C8485a;
import p101ed.C5050c;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7144h;
import p216jc.InterfaceC7147k;
import p365q.C10383k;
import p365q.C10393p;
import p368q2.C10425a;
import p533x2.C12637g;
import p573yc.C13171b;
import p573yc.InterfaceC13170a;
import p600zc.C13771b;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends C0147s implements InterfaceC13170a, InterfaceC6370n, CoordinatorLayout.InterfaceC0523b {

    /* JADX INFO: renamed from: r */
    public static final int f10191r = C6746j.f26116h;

    /* JADX INFO: renamed from: b */
    public ColorStateList f10192b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f10193c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f10194d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f10195e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f10196f;

    /* JADX INFO: renamed from: g */
    public int f10197g;

    /* JADX INFO: renamed from: h */
    public int f10198h;

    /* JADX INFO: renamed from: i */
    public int f10199i;

    /* JADX INFO: renamed from: j */
    public int f10200j;

    /* JADX INFO: renamed from: k */
    public int f10201k;

    /* JADX INFO: renamed from: l */
    public boolean f10202l;

    /* JADX INFO: renamed from: m */
    public final Rect f10203m;

    /* JADX INFO: renamed from: n */
    public final Rect f10204n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final C10393p f10205o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final C13171b f10206p;

    /* JADX INFO: renamed from: q */
    public C2815a f10207q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo2606f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.mo2606f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: L */
        public /* bridge */ /* synthetic */ boolean mo2612l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.mo2612l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.mo2616p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
            super.mo2611k(c0527f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C2811a implements C2815a.k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC2812b f10211a;

        public C2811a(AbstractC2812b abstractC2812b) {
            this.f10211a = abstractC2812b;
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.k
        /* JADX INFO: renamed from: a */
        public void mo12770a() {
            this.f10211a.mo12079b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.k
        /* JADX INFO: renamed from: b */
        public void mo12771b() {
            this.f10211a.mo12078a(FloatingActionButton.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class AbstractC2812b {
        /* JADX INFO: renamed from: a */
        public void mo12078a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void mo12079b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C2813c implements InterfaceC6089b {
        public C2813c() {
        }

        @Override // gd.InterfaceC6089b
        /* JADX INFO: renamed from: a */
        public void mo12772a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f10203m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f10200j, i11 + FloatingActionButton.this.f10200j, i12 + FloatingActionButton.this.f10200j, i13 + FloatingActionButton.this.f10200j);
        }

        @Override // gd.InterfaceC6089b
        /* JADX INFO: renamed from: b */
        public void mo12773b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // gd.InterfaceC6089b
        /* JADX INFO: renamed from: c */
        public boolean mo12774c() {
            return FloatingActionButton.this.f10202l;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public class C2814d<T extends FloatingActionButton> implements C2815a.j {
        public C2814d(InterfaceC7147k<T> interfaceC7147k) {
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.j
        /* JADX INFO: renamed from: a */
        public void mo12775a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.j
        /* JADX INFO: renamed from: b */
        public void mo12776b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2814d) {
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25914u);
    }

    private C2815a getImpl() {
        if (this.f10207q == null) {
            this.f10207q = m12748h();
        }
        return this.f10207q;
    }

    @Override // p573yc.InterfaceC13170a
    /* JADX INFO: renamed from: a */
    public boolean mo12744a() {
        return this.f10206p.m48771c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo12785E(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public void m12745e(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().m12811e(animatorListener);
    }

    /* JADX INFO: renamed from: f */
    public void m12746f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().m12813f(animatorListener);
    }

    /* JADX INFO: renamed from: g */
    public void m12747g(@NonNull InterfaceC7147k<? extends FloatingActionButton> interfaceC7147k) {
        getImpl().m12815g(new C2814d(interfaceC7147k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f10192b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10193c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0523b
    @NonNull
    public CoordinatorLayout.AbstractC0524c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo12823m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m12826p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m12829s();
    }

    public Drawable getContentBackground() {
        return getImpl().m12822l();
    }

    public int getCustomSize() {
        return this.f10199i;
    }

    public int getExpandedComponentIdHint() {
        return this.f10206p.m48770b();
    }

    public C7144h getHideMotionSpec() {
        return getImpl().m12825o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10196f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f10196f;
    }

    @NonNull
    public C6367k getShapeAppearanceModel() {
        return (C6367k) C12637g.m47075g(getImpl().m12830t());
    }

    public C7144h getShowMotionSpec() {
        return getImpl().m12831u();
    }

    public int getSize() {
        return this.f10198h;
    }

    public int getSizeDimension() {
        return m12751k(this.f10198h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f10194d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10195e;
    }

    public boolean getUseCompatPadding() {
        return this.f10202l;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final C2815a m12748h() {
        return new C13771b(this, new C2813c());
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public boolean m12749i(@NonNull Rect rect) {
        if (!C0625o0.m3006R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m12757q(rect);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m12750j(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m12757q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo12781A();
    }

    /* JADX INFO: renamed from: k */
    public final int m12751k(int i10) {
        int i11 = this.f10199i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(C6740d.f25960c) : resources.getDimensionPixelSize(C6740d.f25958b);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m12751k(1) : m12751k(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m12752l(@NonNull Rect rect) {
        m12750j(rect);
        int i10 = -this.f10207q.m12832v();
        rect.inset(i10, i10);
    }

    /* JADX INFO: renamed from: m */
    public void m12753m(AbstractC2812b abstractC2812b) {
        m12754n(abstractC2812b, true);
    }

    /* JADX INFO: renamed from: n */
    public void m12754n(AbstractC2812b abstractC2812b, boolean z10) {
        getImpl().m12833w(m12761u(abstractC2812b), z10);
    }

    /* JADX INFO: renamed from: o */
    public boolean m12755o() {
        return getImpl().m12835y();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m12782B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m12784D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f10200j = (sizeDimension - this.f10201k) / 2;
        getImpl().m12814f0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f10203m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m3321a());
        this.f10206p.m48772d((Bundle) C12637g.m47075g(extendableSavedState.f10532c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f10532c.put("expandableWidgetHelper", this.f10206p.m48773e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m12752l(this.f10204n);
            if (!this.f10204n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public boolean m12756p() {
        return getImpl().m12836z();
    }

    /* JADX INFO: renamed from: q */
    public final void m12757q(@NonNull Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f10203m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* JADX INFO: renamed from: r */
    public final void m12758r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f10194d;
        if (colorStateList == null) {
            C10425a.m40106c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f10195e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C10383k.m39863e(colorForState, mode));
    }

    /* JADX INFO: renamed from: s */
    public void m12759s(AbstractC2812b abstractC2812b) {
        m12760t(abstractC2812b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10192b != colorStateList) {
            this.f10192b = colorStateList;
            getImpl().m12792L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10193c != mode) {
            this.f10193c = mode;
            getImpl().m12793M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().m12794N(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().m12797Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().m12801U(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f10199i) {
            this.f10199i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().m12816g0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().m12824n()) {
            getImpl().m12795O(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f10206p.m48774f(i10);
    }

    public void setHideMotionSpec(C7144h c7144h) {
        getImpl().m12796P(c7144h);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m12812e0();
            if (this.f10194d != null) {
                m12758r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f10205o.m39983i(i10);
        m12758r();
    }

    public void setMaxImageSize(int i10) {
        this.f10201k = i10;
        getImpl().m12799S(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().m12789I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().m12789I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().m12803W(z10);
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        getImpl().m12804X(c6367k);
    }

    public void setShowMotionSpec(C7144h c7144h) {
        getImpl().m12805Y(c7144h);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f10199i = 0;
        if (i10 != this.f10198h) {
            this.f10198h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10194d != colorStateList) {
            this.f10194d = colorStateList;
            m12758r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10195e != mode) {
            this.f10195e = mode;
            m12758r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().m12790J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().m12790J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().m12790J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f10202l != z10) {
            this.f10202l = z10;
            getImpl().mo12783C();
        }
    }

    @Override // ad.C0147s, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* JADX INFO: renamed from: t */
    public void m12760t(AbstractC2812b abstractC2812b, boolean z10) {
        getImpl().m12809c0(m12761u(abstractC2812b), z10);
    }

    /* JADX INFO: renamed from: u */
    public final C2815a.k m12761u(AbstractC2812b abstractC2812b) {
        if (abstractC2812b == null) {
            return null;
        }
        return new C2811a(abstractC2812b);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0524c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f10208a;

        /* JADX INFO: renamed from: b */
        public AbstractC2812b f10209b;

        /* JADX INFO: renamed from: c */
        public boolean f10210c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
            this.f10210c = true;
        }

        /* JADX INFO: renamed from: J */
        private static boolean m12762J(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0527f) {
                return ((CoordinatorLayout.C0527f) layoutParams).m2632f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: f(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo2606f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f10203m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX INFO: renamed from: K */
        public final void m12764K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f10203m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0527f c0527f = (CoordinatorLayout.C0527f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0527f).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0527f).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                C0625o0.m3012X(floatingActionButton, i11);
            }
            if (i10 != 0) {
                C0625o0.m3011W(floatingActionButton, i10);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: l(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean mo2612l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m12768O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m12762J(view)) {
                return false;
            }
            m12769P(view, floatingActionButton);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> listM2585r = coordinatorLayout.m2585r(floatingActionButton);
            int size = listM2585r.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listM2585r.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (m12762J(view) && m12769P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m12768O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2565I(floatingActionButton, i10);
            m12764K(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: N */
        public final boolean m12767N(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f10210c && ((CoordinatorLayout.C0527f) floatingActionButton.getLayoutParams()).m2631e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* JADX INFO: renamed from: O */
        public final boolean m12768O(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!m12767N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10208a == null) {
                this.f10208a = new Rect();
            }
            Rect rect = this.f10208a;
            C0131c.m387a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m12754n(this.f10209b, false);
                return true;
            }
            floatingActionButton.m12760t(this.f10209b, false);
            return true;
        }

        /* JADX INFO: renamed from: P */
        public final boolean m12769P(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!m12767N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0527f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m12754n(this.f10209b, false);
                return true;
            }
            floatingActionButton.m12760t(this.f10209b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: k */
        public void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
            if (c0527f.f2253h == 0) {
                c0527f.f2253h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26335W1);
            this.f10210c = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26344X1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10191r;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10203m = new Rect();
        this.f10204n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26191G1, i10, i11, new int[0]);
        this.f10192b = C5050c.m23736a(context2, typedArrayM436i, C6747k.f26209I1);
        this.f10193c = C0146r.m454i(typedArrayM436i.getInt(C6747k.f26218J1, -1), null);
        this.f10196f = C5050c.m23736a(context2, typedArrayM436i, C6747k.f26308T1);
        this.f10198h = typedArrayM436i.getInt(C6747k.f26263O1, -1);
        this.f10199i = typedArrayM436i.getDimensionPixelSize(C6747k.f26254N1, 0);
        this.f10197g = typedArrayM436i.getDimensionPixelSize(C6747k.f26227K1, 0);
        float dimension = typedArrayM436i.getDimension(C6747k.f26236L1, 0.0f);
        float dimension2 = typedArrayM436i.getDimension(C6747k.f26281Q1, 0.0f);
        float dimension3 = typedArrayM436i.getDimension(C6747k.f26299S1, 0.0f);
        this.f10202l = typedArrayM436i.getBoolean(C6747k.f26326V1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C6740d.f25959b0);
        setMaxImageSize(typedArrayM436i.getDimensionPixelSize(C6747k.f26290R1, 0));
        C7144h c7144hM29932b = C7144h.m29932b(context2, typedArrayM436i, C6747k.f26317U1);
        C7144h c7144hM29932b2 = C7144h.m29932b(context2, typedArrayM436i, C6747k.f26272P1);
        C6367k c6367kM27806m = C6367k.m27768g(context2, attributeSet, i10, i11, C6367k.f24173m).m27806m();
        boolean z10 = typedArrayM436i.getBoolean(C6747k.f26245M1, false);
        setEnabled(typedArrayM436i.getBoolean(C6747k.f26200H1, true));
        typedArrayM436i.recycle();
        C10393p c10393p = new C10393p(this);
        this.f10205o = c10393p;
        c10393p.m39981g(attributeSet, i10);
        this.f10206p = new C13171b(this);
        getImpl().m12804X(c6367kM27806m);
        getImpl().mo12834x(this.f10192b, this.f10193c, this.f10196f, this.f10197g);
        getImpl().m12800T(dimensionPixelSize);
        getImpl().m12794N(dimension);
        getImpl().m12797Q(dimension2);
        getImpl().m12801U(dimension3);
        getImpl().m12805Y(c7144hM29932b);
        getImpl().m12796P(c7144hM29932b2);
        getImpl().m12795O(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f10196f != colorStateList) {
            this.f10196f = colorStateList;
            getImpl().mo12802V(this.f10196f);
        }
    }
}

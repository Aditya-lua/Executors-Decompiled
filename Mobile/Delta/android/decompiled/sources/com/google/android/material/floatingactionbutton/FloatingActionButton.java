package com.google.android.material.floatingactionbutton;

import ad.o;
import ad.r;
import ad.s;
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
import androidx.core.view.o0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import hd.n;
import ic.j;
import java.util.List;
import jc.h;
import jc.k;
import q.p;
import x2.g;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends s implements yc.a, n, CoordinatorLayout.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f8011r = j.f20759h;
    public ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f8014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f8015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f8022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f8023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final p f8024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final yc.b f8025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f8026q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(@NonNull CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class a implements com.google.android.material.floatingactionbutton.a.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f8029a;

        public a(b bVar) {
            this.f8029a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f8029a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f8029a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements gd.b {
        public c() {
        }

        @Override // gd.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f8022m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f8019j, i11 + FloatingActionButton.this.f8019j, i12 + FloatingActionButton.this.f8019j, i13 + FloatingActionButton.this.f8019j);
        }

        @Override // gd.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // gd.b
        public boolean c() {
            return FloatingActionButton.this.f8021l;
        }
    }

    public class d<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.a.j {
        public d(k<T> kVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20618u);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f8026q == null) {
            this.f8026q = h();
        }
        return this.f8026q;
    }

    @Override // yc.a
    public boolean a() {
        return this.f8025p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(@NonNull k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f8012c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f8018i;
    }

    public int getExpandedComponentIdHint() {
        return this.f8025p.b();
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f8015f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f8015f;
    }

    @NonNull
    public hd.k getShapeAppearanceModel() {
        return (hd.k) g.g(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f8017h;
    }

    public int getSizeDimension() {
        return k(this.f8017h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f8013d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f8014e;
    }

    public boolean getUseCompatPadding() {
        return this.f8021l;
    }

    @NonNull
    public final com.google.android.material.floatingactionbutton.a h() {
        return new zc.b(this, new c());
    }

    @Deprecated
    public boolean i(@NonNull Rect rect) {
        if (!o0.R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public final int k(int i10) {
        int i11 = this.f8018i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(ic.d.f20636c) : resources.getDimensionPixelSize(ic.d.b);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    public final void l(@NonNull Rect rect) {
        j(rect);
        int i10 = -this.f8026q.v();
        rect.inset(i10, i10);
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    public void n(b bVar, boolean z10) {
        getImpl().w(u(bVar), z10);
    }

    public boolean o() {
        return getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f8019j = (sizeDimension - this.f8020k) / 2;
        getImpl().f0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f8022m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.f8025p.d((Bundle) g.g(extendableSavedState.f8284c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f8284c.put("expandableWidgetHelper", this.f8025p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f8023n);
            if (!this.f8023n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public final void q(@NonNull Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f8022m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f8013d;
        if (colorStateList == null) {
            q2.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f8014e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(q.k.e(colorForState, mode));
    }

    public void s(b bVar) {
        t(bVar, true);
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
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f8012c != mode) {
            this.f8012c = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().N(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f8018i) {
            this.f8018i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().g0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().O(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f8025p.f(i10);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f8013d != null) {
                r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f8024o.i(i10);
        r();
    }

    public void setMaxImageSize(int i10) {
        this.f8020k = i10;
        getImpl().S(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().W(z10);
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull hd.k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f8018i = 0;
        if (i10 != this.f8017h) {
            this.f8017h = i10;
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
        if (this.f8013d != colorStateList) {
            this.f8013d = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f8014e != mode) {
            this.f8014e = mode;
            r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f8021l != z10) {
            this.f8021l = z10;
            getImpl().C();
        }
    }

    @Override // ad.s, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void t(b bVar, boolean z10) {
        getImpl().c0(u(bVar), z10);
    }

    public final com.google.android.material.floatingactionbutton.a.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f8027a;
        public b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8028c;

        public BaseBehavior() {
            this.f8028c = true;
        }

        private static boolean J(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f8022m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f8022m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                o0.X(floatingActionButton, i11);
            }
            if (i10 != 0) {
                o0.W(floatingActionButton, i10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean N(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f8028c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean O(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8027a == null) {
                this.f8027a = new Rect();
            }
            Rect rect = this.f8027a;
            ad.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        public final boolean P(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f1579h == 0) {
                fVar.f1579h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.W1);
            this.f8028c = typedArrayObtainStyledAttributes.getBoolean(ic.k.X1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f8011r;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8022m = new Rect();
        this.f8023n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, ic.k.G1, i10, i11, new int[0]);
        this.b = ed.c.a(context2, typedArrayI, ic.k.I1);
        this.f8012c = r.i(typedArrayI.getInt(ic.k.J1, -1), null);
        this.f8015f = ed.c.a(context2, typedArrayI, ic.k.T1);
        this.f8017h = typedArrayI.getInt(ic.k.O1, -1);
        this.f8018i = typedArrayI.getDimensionPixelSize(ic.k.N1, 0);
        this.f8016g = typedArrayI.getDimensionPixelSize(ic.k.K1, 0);
        float dimension = typedArrayI.getDimension(ic.k.L1, 0.0f);
        float dimension2 = typedArrayI.getDimension(ic.k.Q1, 0.0f);
        float dimension3 = typedArrayI.getDimension(ic.k.S1, 0.0f);
        this.f8021l = typedArrayI.getBoolean(ic.k.V1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(ic.d.f20635b0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(ic.k.R1, 0));
        h hVarB = h.b(context2, typedArrayI, ic.k.U1);
        h hVarB2 = h.b(context2, typedArrayI, ic.k.P1);
        hd.k kVarM = hd.k.g(context2, attributeSet, i10, i11, hd.k.f19330m).m();
        boolean z10 = typedArrayI.getBoolean(ic.k.M1, false);
        setEnabled(typedArrayI.getBoolean(ic.k.H1, true));
        typedArrayI.recycle();
        p pVar = new p(this);
        this.f8024o = pVar;
        pVar.g(attributeSet, i10);
        this.f8025p = new yc.b(this);
        getImpl().X(kVarM);
        getImpl().x(this.b, this.f8012c, this.f8015f, this.f8016g);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().Y(hVarB);
        getImpl().P(hVarB2);
        getImpl().O(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f8015f != colorStateList) {
            this.f8015f = colorStateList;
            getImpl().V(this.f8015f);
        }
    }
}

package yc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import gd.g;
import gd.k;
import hc.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b extends com.google.android.material.floatingactionbutton.a {
    public StateListAnimator O;

    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // gd.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public b(FloatingActionButton floatingActionButton, fd.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void C() {
        f0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void F(float f10, float f11, float f12) {
        if (this.f7979w.getStateListAnimator() == this.O) {
            StateListAnimator stateListAnimatorJ0 = j0(f10, f11, f12);
            this.O = stateListAnimatorJ0;
            this.f7979w.setStateListAnimator(stateListAnimatorJ0);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f7959c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ed.b.a(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean Z() {
        return this.f7980x.c() || !b0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void d0() {
    }

    @NonNull
    public yc.a i0(int i10, ColorStateList colorStateList) {
        Context context = this.f7979w.getContext();
        yc.a aVar = new yc.a((k) x2.g.g(this.f7958a));
        aVar.e(l2.b.c(context, c.f18805e), l2.b.c(context, c.f18804d), l2.b.c(context, c.b), l2.b.c(context, c.f18803c));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    @NonNull
    public final StateListAnimator j0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.I, k0(f10, f12));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.J, k0(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.K, k0(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.L, k0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f7979w, "elevation", f10).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f7979w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.M, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.N, k0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @NonNull
    public final Animator k0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7979w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f7979w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        return animatorSet;
    }

    @NonNull
    public g l0() {
        return new a((k) x2.g.g(this.f7958a));
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f7979w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void r(@NonNull Rect rect) {
        if (this.f7980x.c()) {
            super.r(rect);
        } else if (b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f7967k - this.f7979w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        g gVarL0 = l0();
        this.b = gVarL0;
        gVarL0.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.Q(this.f7979w.getContext());
        if (i10 > 0) {
            this.f7960d = i0(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) x2.g.g(this.f7960d), (Drawable) x2.g.g(this.b)});
        } else {
            this.f7960d = null;
            layerDrawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ed.b.a(colorStateList2), layerDrawable, null);
        this.f7959c = rippleDrawable;
        this.f7961e = rippleDrawable;
    }
}

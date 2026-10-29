package p600zc;

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
import com.google.android.material.floatingactionbutton.C2815a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import gd.InterfaceC6089b;
import java.util.ArrayList;
import p126fd.C5584b;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6739c;
import p261l2.C7975b;
import p533x2.C12637g;

/* JADX INFO: renamed from: zc.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13771b extends C2815a {

    /* JADX INFO: renamed from: O */
    public StateListAnimator f48353O;

    /* JADX INFO: renamed from: zc.b$a */
    public static class a extends C6363g {
        public a(C6367k c6367k) {
            super(c6367k);
        }

        @Override // p168hd.C6363g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C13771b(FloatingActionButton floatingActionButton, InterfaceC6089b interfaceC6089b) {
        super(floatingActionButton, interfaceC6089b);
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: A */
    public void mo12781A() {
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: C */
    public void mo12783C() {
        m12814f0();
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: E */
    public void mo12785E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: F */
    public void mo12786F(float f10, float f11, float f12) {
        if (this.f10251w.getStateListAnimator() == this.f48353O) {
            StateListAnimator stateListAnimatorM50185j0 = m50185j0(f10, f11, f12);
            this.f48353O = stateListAnimatorM50185j0;
            this.f10251w.setStateListAnimator(stateListAnimatorM50185j0);
        }
        if (mo12806Z()) {
            m12814f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: K */
    public boolean mo12791K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: V */
    public void mo12802V(ColorStateList colorStateList) {
        Drawable drawable = this.f10231c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C5584b.m25241a(colorStateList));
        } else {
            super.mo12802V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: Z */
    public boolean mo12806Z() {
        return this.f10252x.mo12774c() || !m12808b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: d0 */
    public void mo12810d0() {
    }

    @NonNull
    /* JADX INFO: renamed from: i0 */
    public C13770a m50184i0(int i10, ColorStateList colorStateList) {
        Context context = this.f10251w.getContext();
        C13770a c13770a = new C13770a((C6367k) C12637g.m47075g(this.f10229a));
        c13770a.m50182e(C7975b.m33005c(context, C6739c.f25924e), C7975b.m33005c(context, C6739c.f25923d), C7975b.m33005c(context, C6739c.f25921b), C7975b.m33005c(context, C6739c.f25922c));
        c13770a.m50181d(i10);
        c13770a.m50180c(colorStateList);
        return c13770a;
    }

    @NonNull
    /* JADX INFO: renamed from: j0 */
    public final StateListAnimator m50185j0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C2815a.f10220I, m50186k0(f10, f12));
        stateListAnimator.addState(C2815a.f10221J, m50186k0(f10, f11));
        stateListAnimator.addState(C2815a.f10222K, m50186k0(f10, f11));
        stateListAnimator.addState(C2815a.f10223L, m50186k0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f10251w, "elevation", f10).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f10251w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C2815a.f10215D);
        stateListAnimator.addState(C2815a.f10224M, animatorSet);
        stateListAnimator.addState(C2815a.f10225N, m50186k0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @NonNull
    /* JADX INFO: renamed from: k0 */
    public final Animator m50186k0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10251w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10251w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C2815a.f10215D);
        return animatorSet;
    }

    @NonNull
    /* JADX INFO: renamed from: l0 */
    public C6363g m50187l0() {
        return new a((C6367k) C12637g.m47075g(this.f10229a));
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: m */
    public float mo12823m() {
        return this.f10251w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: r */
    public void mo12828r(@NonNull Rect rect) {
        if (this.f10252x.mo12774c()) {
            super.mo12828r(rect);
        } else if (m12808b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f10239k - this.f10251w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2815a
    /* JADX INFO: renamed from: x */
    public void mo12834x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        C6363g c6363gM50187l0 = m50187l0();
        this.f10230b = c6363gM50187l0;
        c6363gM50187l0.setTintList(colorStateList);
        if (mode != null) {
            this.f10230b.setTintMode(mode);
        }
        this.f10230b.m27710Q(this.f10251w.getContext());
        if (i10 > 0) {
            this.f10232d = m50184i0(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) C12637g.m47075g(this.f10232d), (Drawable) C12637g.m47075g(this.f10230b)});
        } else {
            this.f10232d = null;
            layerDrawable = this.f10230b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C5584b.m25241a(colorStateList2), layerDrawable, null);
        this.f10231c = rippleDrawable;
        this.f10233e = rippleDrawable;
    }
}

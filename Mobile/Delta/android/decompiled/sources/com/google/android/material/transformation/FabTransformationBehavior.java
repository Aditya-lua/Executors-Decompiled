package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import hc.f;
import ic.h;
import ic.i;
import ic.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f8358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f8359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f8360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8362h;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8363a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f8364c;

        public a(boolean z10, View view, View view2) {
            this.f8363a = z10;
            this.b = view;
            this.f8364c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8363a) {
                return;
            }
            this.b.setVisibility(4);
            this.f8364c.setAlpha(1.0f);
            this.f8364c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8363a) {
                this.b.setVisibility(0);
                this.f8364c.setAlpha(0.0f);
                this.f8364c.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8366a;

        public b(View view) {
            this.f8366a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8366a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rc.d f8367a;
        public final /* synthetic */ Drawable b;

        public c(rc.d dVar, Drawable drawable) {
            this.f8367a = dVar;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8367a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8367a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rc.d f8369a;

        public d(rc.d dVar) {
            this.f8369a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            rc.d.e revealInfo = this.f8369a.getRevealInfo();
            revealInfo.f29855c = Float.MAX_VALUE;
            this.f8369a.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f8370a;
        public j b;
    }

    public FabTransformationBehavior() {
        this.f8357c = new Rect();
        this.f8358d = new RectF();
        this.f8359e = new RectF();
        this.f8360f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet N(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        e eVarI0 = i0(view2.getContext(), z10);
        if (z10) {
            this.f8361g = view.getTranslationX();
            this.f8362h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f8358d;
        g0(view, view2, z10, z11, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z10, eVarI0, arrayList);
        d0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        c0(view, view2, z10, z11, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        Y(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        ic.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final ViewGroup O(@NonNull View view) {
        View viewFindViewById = view.findViewById(f.E);
        if (viewFindViewById != null) {
            return j0(viewFindViewById);
        }
        return ((view instanceof md.b) || (view instanceof md.a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    public final void P(@NonNull View view, @NonNull e eVar, @NonNull i iVar, @NonNull i iVar2, float f10, float f11, float f12, float f13, @NonNull RectF rectF) {
        float fW = W(eVar, iVar, f10, f12);
        float fW2 = W(eVar, iVar2, f11, f13);
        Rect rect = this.f8357c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8358d;
        rectF2.set(rect);
        RectF rectF3 = this.f8359e;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void Q(@NonNull View view, @NonNull RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f8361g, this.f8362h);
    }

    @NonNull
    public final Pair<i, i> R(float f10, float f11, boolean z10, @NonNull e eVar) {
        i iVarE;
        i iVarE2;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVarE = eVar.f8370a.e("translationXLinear");
            iVarE2 = eVar.f8370a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            iVarE = eVar.f8370a.e("translationXCurveDownwards");
            iVarE2 = eVar.f8370a.e("translationYCurveDownwards");
        } else {
            iVarE = eVar.f8370a.e("translationXCurveUpwards");
            iVarE2 = eVar.f8370a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVarE, iVarE2);
    }

    public final float S(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f8358d;
        RectF rectF2 = this.f8359e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float T(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f8358d;
        RectF rectF2 = this.f8359e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float U(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f8358d;
        RectF rectF2 = this.f8359e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f20486a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i10 != 3) {
                if (i10 != 5) {
                    f10 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f10 + jVar.b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + jVar.b;
    }

    public final float V(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f8358d;
        RectF rectF2 = this.f8359e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f20486a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i10 != 48) {
                if (i10 != 80) {
                    f10 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f10 + jVar.f20487c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + jVar.f20487c;
    }

    public final float W(@NonNull e eVar, @NonNull i iVar, float f10, float f11) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarE = eVar.f8370a.e("expansion");
        return ic.a.a(f10, f11, iVar.e().getInterpolation((((iVarE.c() + iVarE.d()) + 17) - jC) / jD));
    }

    public final void X(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f8360f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void Y(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof rc.d) && rc.c.f29850a == 0) || (viewGroupO = O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    ic.d.f20476a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, ic.d.f20476a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, ic.d.f20476a, 0.0f);
            }
            eVar.f8370a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof rc.d) {
            rc.d dVar = (rc.d) view2;
            int iH0 = h0(view);
            int i10 = 16777215 & iH0;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, rc.d.C0533d.f29853a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, rc.d.C0533d.f29853a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(ic.c.b());
            eVar.f8370a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    public final void a0(@NonNull View view, @NonNull View view2, boolean z10, @NonNull e eVar, @NonNull List<Animator> list) {
        float fU = U(view, view2, eVar.b);
        float fV = V(view, view2, eVar.b);
        Pair<i, i> pairR = R(fU, fV, z10, eVar);
        i iVar = (i) pairR.first;
        i iVar2 = (i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fU = this.f8361g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fV = this.f8362h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    public final void b0(View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fU = o0.u(view2) - o0.u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fU);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fU);
        }
        eVar.f8370a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull e eVar, float f10, float f11, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof rc.d) {
            rc.d dVar = (rc.d) view2;
            float fS = S(view, view2, eVar.b);
            float fT = T(view, view2, eVar.b);
            ((FloatingActionButton) view).i(this.f8357c);
            float fWidth = this.f8357c.width() / 2.0f;
            i iVarE = eVar.f8370a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new rc.d.e(fS, fT, fWidth));
                }
                if (z11) {
                    fWidth = dVar.getRevealInfo().f29855c;
                }
                animatorA = rc.a.a(dVar, fS, fT, ad.a.b(fS, fT, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(dVar));
                f0(view2, iVarE.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f12 = dVar.getRevealInfo().f29855c;
                Animator animatorA2 = rc.a.a(dVar, fS, fT, fWidth);
                int i10 = (int) fS;
                int i11 = (int) fT;
                f0(view2, iVarE.c(), i10, i11, f12, list);
                e0(view2, iVarE.c(), iVarE.d(), eVar.f8370a.f(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            iVarE.a(animatorA);
            list.add(animatorA);
            list2.add(rc.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(View view, View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof rc.d) && (view instanceof ImageView)) {
            rc.d dVar = (rc.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, ic.e.b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, ic.e.b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f8370a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    public final void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @NonNull List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void f0(View view, long j10, int i10, int i11, float f10, @NonNull List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void g0(@NonNull View view, @NonNull View view2, boolean z10, boolean z11, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.b);
        float fV = V(view, view2, eVar.b);
        Pair<i, i> pairR = R(fU, fV, z10, eVar);
        i iVar3 = (i) pairR.first;
        i iVar4 = (i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            iVar = iVar4;
            iVar2 = iVar3;
            P(view2, eVar, iVar2, iVar, -fU, -fV, 0.0f, 0.0f, rectF);
        } else {
            iVar = iVar4;
            iVar2 = iVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        iVar2.a(objectAnimatorOfFloat);
        iVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final int h0(@NonNull View view) {
        ColorStateList colorStateListR = o0.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public abstract e i0(Context context, boolean z10);

    public final ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.f1734h == 0) {
            fVar.f1734h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8357c = new Rect();
        this.f8358d = new RectF();
        this.f8359e = new RectF();
        this.f8360f = new int[2];
    }
}

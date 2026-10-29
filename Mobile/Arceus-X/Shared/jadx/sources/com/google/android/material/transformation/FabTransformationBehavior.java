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
import androidx.core.view.C0625o0;
import bd.C1304a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p194ic.C6742f;
import p216jc.C7137a;
import p216jc.C7138b;
import p216jc.C7139c;
import p216jc.C7140d;
import p216jc.C7141e;
import p216jc.C7144h;
import p216jc.C7145i;
import p216jc.C7146j;
import p307nd.C9407a;
import p307nd.C9408b;
import sc.C11285a;
import sc.C11287c;
import sc.InterfaceC11288d;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f10739c;

    /* JADX INFO: renamed from: d */
    public final RectF f10740d;

    /* JADX INFO: renamed from: e */
    public final RectF f10741e;

    /* JADX INFO: renamed from: f */
    public final int[] f10742f;

    /* JADX INFO: renamed from: g */
    public float f10743g;

    /* JADX INFO: renamed from: h */
    public float f10744h;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C2882a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10745a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10746b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f10747c;

        public C2882a(boolean z10, View view, View view2) {
            this.f10745a = z10;
            this.f10746b = view;
            this.f10747c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10745a) {
                return;
            }
            this.f10746b.setVisibility(4);
            this.f10747c.setAlpha(1.0f);
            this.f10747c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10745a) {
                this.f10746b.setVisibility(0);
                this.f10747c.setAlpha(0.0f);
                this.f10747c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C2883b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f10749a;

        public C2883b(View view) {
            this.f10749a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10749a.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C2884c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11288d f10751a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f10752b;

        public C2884c(InterfaceC11288d interfaceC11288d, Drawable drawable) {
            this.f10751a = interfaceC11288d;
            this.f10752b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10751a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10751a.setCircularRevealOverlayDrawable(this.f10752b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C2885d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11288d f10754a;

        public C2885d(InterfaceC11288d interfaceC11288d) {
            this.f10754a = interfaceC11288d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC11288d.e revealInfo = this.f10754a.getRevealInfo();
            revealInfo.f39627c = Float.MAX_VALUE;
            this.f10754a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C2886e {

        /* JADX INFO: renamed from: a */
        public C7144h f10756a;

        /* JADX INFO: renamed from: b */
        public C7146j f10757b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FabTransformationBehavior() {
        this.f10739c = new Rect();
        this.f10740d = new RectF();
        this.f10741e = new RectF();
        this.f10742f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    /* JADX INFO: renamed from: N */
    public AnimatorSet mo13320N(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        C2886e c2886eMo13341i0 = mo13341i0(view2.getContext(), z10);
        if (z10) {
            this.f10743g = view.getTranslationX();
            this.f10744h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m13334b0(view, view2, z10, z11, c2886eMo13341i0, arrayList, arrayList2);
        RectF rectF = this.f10740d;
        m13339g0(view, view2, z10, z11, c2886eMo13341i0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        m13333a0(view, view2, z10, c2886eMo13341i0, arrayList);
        m13336d0(view, view2, z10, z11, c2886eMo13341i0, arrayList, arrayList2);
        m13335c0(view, view2, z10, z11, c2886eMo13341i0, fWidth, fHeight, arrayList, arrayList2);
        m13332Z(view, view2, z10, z11, c2886eMo13341i0, arrayList, arrayList2);
        m13331Y(view, view2, z10, z11, c2886eMo13341i0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C7138b.m29922a(animatorSet, arrayList);
        animatorSet.addListener(new C2882a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: O */
    public final ViewGroup m13321O(@NonNull View view) {
        View viewFindViewById = view.findViewById(C6742f.f26011E);
        if (viewFindViewById != null) {
            return m13342j0(viewFindViewById);
        }
        return ((view instanceof C9408b) || (view instanceof C9407a)) ? m13342j0(((ViewGroup) view).getChildAt(0)) : m13342j0(view);
    }

    /* JADX INFO: renamed from: P */
    public final void m13322P(@NonNull View view, @NonNull C2886e c2886e, @NonNull C7145i c7145i, @NonNull C7145i c7145i2, float f10, float f11, float f12, float f13, @NonNull RectF rectF) {
        float fM13329W = m13329W(c2886e, c7145i, f10, f12);
        float fM13329W2 = m13329W(c2886e, c7145i2, f11, f13);
        Rect rect = this.f10739c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f10740d;
        rectF2.set(rect);
        RectF rectF3 = this.f10741e;
        m13330X(view, rectF3);
        rectF3.offset(fM13329W, fM13329W2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* JADX INFO: renamed from: Q */
    public final void m13323Q(@NonNull View view, @NonNull RectF rectF) {
        m13330X(view, rectF);
        rectF.offset(this.f10743g, this.f10744h);
    }

    @NonNull
    /* JADX INFO: renamed from: R */
    public final Pair<C7145i, C7145i> m13324R(float f10, float f11, boolean z10, @NonNull C2886e c2886e) {
        C7145i c7145iM29935e;
        C7145i c7145iM29935e2;
        if (f10 == 0.0f || f11 == 0.0f) {
            c7145iM29935e = c2886e.f10756a.m29935e("translationXLinear");
            c7145iM29935e2 = c2886e.f10756a.m29935e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            c7145iM29935e = c2886e.f10756a.m29935e("translationXCurveDownwards");
            c7145iM29935e2 = c2886e.f10756a.m29935e("translationYCurveDownwards");
        } else {
            c7145iM29935e = c2886e.f10756a.m29935e("translationXCurveUpwards");
            c7145iM29935e2 = c2886e.f10756a.m29935e("translationYCurveUpwards");
        }
        return new Pair<>(c7145iM29935e, c7145iM29935e2);
    }

    /* JADX INFO: renamed from: S */
    public final float m13325S(@NonNull View view, @NonNull View view2, @NonNull C7146j c7146j) {
        RectF rectF = this.f10740d;
        RectF rectF2 = this.f10741e;
        m13323Q(view, rectF);
        m13330X(view2, rectF2);
        rectF2.offset(-m13327U(view, view2, c7146j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* JADX INFO: renamed from: T */
    public final float m13326T(@NonNull View view, @NonNull View view2, @NonNull C7146j c7146j) {
        RectF rectF = this.f10740d;
        RectF rectF2 = this.f10741e;
        m13323Q(view, rectF);
        m13330X(view2, rectF2);
        rectF2.offset(0.0f, -m13328V(view, view2, c7146j));
        return rectF.centerY() - rectF2.top;
    }

    /* JADX INFO: renamed from: U */
    public final float m13327U(@NonNull View view, @NonNull View view2, @NonNull C7146j c7146j) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f10740d;
        RectF rectF2 = this.f10741e;
        m13323Q(view, rectF);
        m13330X(view2, rectF2);
        int i10 = c7146j.f27804a & 7;
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
                return f10 + c7146j.f27805b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + c7146j.f27805b;
    }

    /* JADX INFO: renamed from: V */
    public final float m13328V(@NonNull View view, @NonNull View view2, @NonNull C7146j c7146j) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f10740d;
        RectF rectF2 = this.f10741e;
        m13323Q(view, rectF);
        m13330X(view2, rectF2);
        int i10 = c7146j.f27804a & 112;
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
                return f10 + c7146j.f27806c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + c7146j.f27806c;
    }

    /* JADX INFO: renamed from: W */
    public final float m13329W(@NonNull C2886e c2886e, @NonNull C7145i c7145i, float f10, float f11) {
        long jM29943c = c7145i.m29943c();
        long jM29944d = c7145i.m29944d();
        C7145i c7145iM29935e = c2886e.f10756a.m29935e("expansion");
        return C7137a.m29919a(f10, f11, c7145i.m29945e().getInterpolation((((c7145iM29935e.m29943c() + c7145iM29935e.m29944d()) + 17) - jM29943c) / jM29944d));
    }

    /* JADX INFO: renamed from: X */
    public final void m13330X(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f10742f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: Y */
    public final void m13331Y(View view, View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupM13321O;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC11288d) && C11287c.f39620a == 0) || (viewGroupM13321O = m13321O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    C7140d.f27790a.set(viewGroupM13321O, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM13321O, C7140d.f27790a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM13321O, C7140d.f27790a, 0.0f);
            }
            c2886e.f10756a.m29935e("contentFade").m29942a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public final void m13332Z(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof InterfaceC11288d) {
            InterfaceC11288d interfaceC11288d = (InterfaceC11288d) view2;
            int iM13340h0 = m13340h0(view);
            int i10 = 16777215 & iM13340h0;
            if (z10) {
                if (!z11) {
                    interfaceC11288d.setCircularRevealScrimColor(iM13340h0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC11288d, InterfaceC11288d.d.f39624a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC11288d, InterfaceC11288d.d.f39624a, iM13340h0);
            }
            objectAnimatorOfInt.setEvaluator(C7139c.m29923b());
            c2886e.f10756a.m29935e("color").m29942a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m13333a0(@NonNull View view, @NonNull View view2, boolean z10, @NonNull C2886e c2886e, @NonNull List<Animator> list) {
        float fM13327U = m13327U(view, view2, c2886e.f10757b);
        float fM13328V = m13328V(view, view2, c2886e.f10757b);
        Pair<C7145i, C7145i> pairM13324R = m13324R(fM13327U, fM13328V, z10, c2886e);
        C7145i c7145i = (C7145i) pairM13324R.first;
        C7145i c7145i2 = (C7145i) pairM13324R.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fM13327U = this.f10743g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM13327U);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fM13328V = this.f10744h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fM13328V);
        c7145i.m29942a(objectAnimatorOfFloat);
        c7145i2.m29942a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: b0 */
    public final void m13334b0(View view, @NonNull View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fM3055u = C0625o0.m3055u(view2) - C0625o0.m3055u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fM3055u);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM3055u);
        }
        c2886e.f10756a.m29935e("elevation").m29942a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final void m13335c0(@NonNull View view, View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, float f10, float f11, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorM42362a;
        if (view2 instanceof InterfaceC11288d) {
            InterfaceC11288d interfaceC11288d = (InterfaceC11288d) view2;
            float fM13325S = m13325S(view, view2, c2886e.f10757b);
            float fM13326T = m13326T(view, view2, c2886e.f10757b);
            ((FloatingActionButton) view).m12749i(this.f10739c);
            float fWidth = this.f10739c.width() / 2.0f;
            C7145i c7145iM29935e = c2886e.f10756a.m29935e("expansion");
            if (z10) {
                if (!z11) {
                    interfaceC11288d.setRevealInfo(new InterfaceC11288d.e(fM13325S, fM13326T, fWidth));
                }
                if (z11) {
                    fWidth = interfaceC11288d.getRevealInfo().f39627c;
                }
                animatorM42362a = C11285a.m42362a(interfaceC11288d, fM13325S, fM13326T, C1304a.m7097b(fM13325S, fM13326T, 0.0f, 0.0f, f10, f11));
                animatorM42362a.addListener(new C2885d(interfaceC11288d));
                m13338f0(view2, c7145iM29935e.m29943c(), (int) fM13325S, (int) fM13326T, fWidth, list);
            } else {
                float f12 = interfaceC11288d.getRevealInfo().f39627c;
                Animator animatorM42362a2 = C11285a.m42362a(interfaceC11288d, fM13325S, fM13326T, fWidth);
                int i10 = (int) fM13325S;
                int i11 = (int) fM13326T;
                m13338f0(view2, c7145iM29935e.m29943c(), i10, i11, f12, list);
                m13337e0(view2, c7145iM29935e.m29943c(), c7145iM29935e.m29944d(), c2886e.f10756a.m29936f(), i10, i11, fWidth, list);
                animatorM42362a = animatorM42362a2;
            }
            c7145iM29935e.m29942a(animatorM42362a);
            list.add(animatorM42362a);
            list2.add(C11285a.m42363b(interfaceC11288d));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final void m13336d0(View view, View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof InterfaceC11288d) && (view instanceof ImageView)) {
            InterfaceC11288d interfaceC11288d = (InterfaceC11288d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C7141e.f27791b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C7141e.f27791b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new C2883b(view2));
            c2886e.f10756a.m29935e("iconFade").m29942a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new C2884c(interfaceC11288d, drawable));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13337e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @NonNull List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m13338f0(View view, long j10, int i10, int i11, float f10, @NonNull List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13339g0(@NonNull View view, @NonNull View view2, boolean z10, boolean z11, @NonNull C2886e c2886e, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        C7145i c7145i;
        C7145i c7145i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM13327U = m13327U(view, view2, c2886e.f10757b);
        float fM13328V = m13328V(view, view2, c2886e.f10757b);
        Pair<C7145i, C7145i> pairM13324R = m13324R(fM13327U, fM13328V, z10, c2886e);
        C7145i c7145i3 = (C7145i) pairM13324R.first;
        C7145i c7145i4 = (C7145i) pairM13324R.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fM13327U);
                view2.setTranslationY(-fM13328V);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            c7145i = c7145i4;
            c7145i2 = c7145i3;
            m13322P(view2, c2886e, c7145i2, c7145i, -fM13327U, -fM13328V, 0.0f, 0.0f, rectF);
        } else {
            c7145i = c7145i4;
            c7145i2 = c7145i3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM13327U);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM13328V);
        }
        c7145i2.m29942a(objectAnimatorOfFloat);
        c7145i.m29942a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m13340h0(@NonNull View view) {
        ColorStateList colorStateListM3049r = C0625o0.m3049r(view);
        if (colorStateListM3049r != null) {
            return colorStateListM3049r.getColorForState(view.getDrawableState(), colorStateListM3049r.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: i */
    public boolean mo2609i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    /* JADX INFO: renamed from: i0 */
    public abstract C2886e mo13341i0(Context context, boolean z10);

    /* JADX INFO: renamed from: j0 */
    public final ViewGroup m13342j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: k */
    public void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
        if (c0527f.f2253h == 0) {
            c0527f.f2253h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10739c = new Rect();
        this.f10740d = new RectF();
        this.f10741e = new RectF();
        this.f10742f = new int[2];
    }
}

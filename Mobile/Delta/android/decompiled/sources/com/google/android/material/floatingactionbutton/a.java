package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import gd.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator D = ic.a.f20472c;
    public static final int E = hc.b.F;
    public static final int F = hc.b.P;
    public static final int G = hc.b.G;
    public static final int H = hc.b.N;
    public static final int[] I = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] M = {R.attr.state_enabled};
    public static final int[] N = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gd.k f7958a;
    public gd.g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f7959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yc.a f7960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f7961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7962f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final zc.j f7968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animator f7969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ic.h f7970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ic.h f7971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7972p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7974r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<j> f7978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f7979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fd.b f7980x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7963g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f7973q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7975s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f7981y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f7982z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0121a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7983a;
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f7984c;

        public C0121a(boolean z10, k kVar) {
            this.b = z10;
            this.f7984c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7983a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f7975s = 0;
            a.this.f7969m = null;
            if (this.f7983a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f7979w;
            boolean z10 = this.b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f7984c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f7979w.b(0, this.b);
            a.this.f7975s = 1;
            a.this.f7969m = animator;
            this.f7983a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7986a;
        public final /* synthetic */ k b;

        public b(boolean z10, k kVar) {
            this.f7986a = z10;
            this.b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f7975s = 0;
            a.this.f7969m = null;
            k kVar = this.b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f7979w.b(0, this.f7986a);
            a.this.f7975s = 2;
            a.this.f7969m = animator;
        }
    }

    public class c extends ic.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            a.this.f7973q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f7989a;
        public final /* synthetic */ float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f7990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f7991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f7992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f7993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f7994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f7995h;

        public d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f7989a = f10;
            this.b = f11;
            this.f7990c = f12;
            this.f7991d = f13;
            this.f7992e = f14;
            this.f7993f = f15;
            this.f7994g = f16;
            this.f7995h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f7979w.setAlpha(ic.a.b(this.f7989a, this.b, 0.0f, 0.2f, fFloatValue));
            a.this.f7979w.setScaleX(ic.a.a(this.f7990c, this.f7991d, fFloatValue));
            a.this.f7979w.setScaleY(ic.a.a(this.f7992e, this.f7991d, fFloatValue));
            a.this.f7973q = ic.a.a(this.f7993f, this.f7994g, fFloatValue);
            a.this.h(ic.a.a(this.f7993f, this.f7994g, fFloatValue), this.f7995h);
            a.this.f7979w.setImageMatrix(this.f7995h);
        }
    }

    public class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f7997a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f7997a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.H();
            return true;
        }
    }

    public class g extends m {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return 0.0f;
        }
    }

    public class h extends m {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f7964h + aVar.f7965i;
        }
    }

    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f7964h + aVar.f7966j;
        }
    }

    public interface j {
        void a();

        void b();
    }

    public interface k {
        void a();

        void b();
    }

    public class l extends m {
        public l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return a.this.f7964h;
        }
    }

    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8003a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8004c;

        public m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.g0((int) this.f8004c);
            this.f8003a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f8003a) {
                gd.g gVar = a.this.b;
                this.b = gVar == null ? 0.0f : gVar.w();
                this.f8004c = a();
                this.f8003a = true;
            }
            a aVar = a.this;
            float f10 = this.b;
            aVar.g0((int) (f10 + ((this.f8004c - f10) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ m(a aVar, C0121a c0121a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, fd.b bVar) {
        this.f7979w = floatingActionButton;
        this.f7980x = bVar;
        zc.j jVar = new zc.j();
        this.f7968l = jVar;
        jVar.a(I, k(new i()));
        jVar.a(J, k(new h()));
        jVar.a(K, k(new h()));
        jVar.a(L, k(new h()));
        jVar.a(M, k(new l()));
        jVar.a(N, k(new g()));
        this.f7972p = floatingActionButton.getRotation();
    }

    public void A() {
        throw null;
    }

    public void B() {
        gd.g gVar = this.b;
        if (gVar != null) {
            gd.h.f(this.f7979w, gVar);
        }
        if (K()) {
            this.f7979w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    public void C() {
        throw null;
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.f7979w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    public void E(int[] iArr) {
        throw null;
    }

    public void F(float f10, float f11, float f12) {
        throw null;
    }

    public void G(@NonNull Rect rect) {
        x2.g.h(this.f7961e, "Didn't initialize content background");
        if (!Z()) {
            this.f7980x.b(this.f7961e);
        } else {
            this.f7980x.b(new InsetDrawable(this.f7961e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void H() {
        float rotation = this.f7979w.getRotation();
        if (this.f7972p != rotation) {
            this.f7972p = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<j> arrayList = this.f7978v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.b();
            }
        }
    }

    public void J() {
        ArrayList<j> arrayList = this.f7978v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.a();
            }
        }
    }

    public boolean K() {
        throw null;
    }

    public void L(ColorStateList colorStateList) {
        gd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        yc.a aVar = this.f7960d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        gd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f10) {
        if (this.f7964h != f10) {
            this.f7964h = f10;
            F(f10, this.f7965i, this.f7966j);
        }
    }

    public void O(boolean z10) {
        this.f7962f = z10;
    }

    public final void P(ic.h hVar) {
        this.f7971o = hVar;
    }

    public final void Q(float f10) {
        if (this.f7965i != f10) {
            this.f7965i = f10;
            F(this.f7964h, f10, this.f7966j);
        }
    }

    public final void R(float f10) {
        this.f7973q = f10;
        Matrix matrix = this.B;
        h(f10, matrix);
        this.f7979w.setImageMatrix(matrix);
    }

    public final void S(int i10) {
        if (this.f7974r != i10) {
            this.f7974r = i10;
            e0();
        }
    }

    public void T(int i10) {
        this.f7967k = i10;
    }

    public final void U(float f10) {
        if (this.f7966j != f10) {
            this.f7966j = f10;
            F(this.f7964h, this.f7965i, f10);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f7959c;
        if (drawable != null) {
            q2.a.o(drawable, ed.b.a(colorStateList));
        }
    }

    public void W(boolean z10) {
        this.f7963g = z10;
        f0();
    }

    public final void X(@NonNull gd.k kVar) {
        this.f7958a = kVar;
        gd.g gVar = this.b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f7959c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        yc.a aVar = this.f7960d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(ic.h hVar) {
        this.f7970n = hVar;
    }

    public boolean Z() {
        throw null;
    }

    public final boolean a0() {
        return o0.R(this.f7979w) && !this.f7979w.isInEditMode();
    }

    public final boolean b0() {
        return !this.f7962f || this.f7979w.getSizeDimension() >= this.f7967k;
    }

    public void c0(k kVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetJ;
        if (z()) {
            return;
        }
        Animator animator = this.f7969m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f7970n == null;
        if (!a0()) {
            this.f7979w.b(0, z10);
            this.f7979w.setAlpha(1.0f);
            this.f7979w.setScaleY(1.0f);
            this.f7979w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f7979w.getVisibility() != 0) {
            this.f7979w.setAlpha(0.0f);
            this.f7979w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f7979w.setScaleX(z11 ? 0.4f : 0.0f);
            R(z11 ? 0.4f : 0.0f);
        }
        ic.h hVar = this.f7970n;
        if (hVar != null) {
            animatorSetJ = i(hVar, 1.0f, 1.0f, 1.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetJ = aVar.j(1.0f, 1.0f, 1.0f, E, F);
        }
        animatorSetJ.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f7976t;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                animatorSetJ.addListener(animatorListener);
            }
        }
        animatorSetJ.start();
    }

    public void d0() {
        throw null;
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f7977u == null) {
            this.f7977u = new ArrayList<>();
        }
        this.f7977u.add(animatorListener);
    }

    public final void e0() {
        R(this.f7973q);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f7976t == null) {
            this.f7976t = new ArrayList<>();
        }
        this.f7976t.add(animatorListener);
    }

    public final void f0() {
        Rect rect = this.f7981y;
        r(rect);
        G(rect);
        this.f7980x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(@NonNull j jVar) {
        if (this.f7978v == null) {
            this.f7978v = new ArrayList<>();
        }
        this.f7978v.add(jVar);
    }

    public void g0(float f10) {
        gd.g gVar = this.b;
        if (gVar != null) {
            gVar.Z(f10);
        }
    }

    public final void h(float f10, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7979w.getDrawable();
        if (drawable == null || this.f7974r == 0) {
            return;
        }
        RectF rectF = this.f7982z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f7974r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f7974r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @NonNull
    public final AnimatorSet i(@NonNull ic.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7979w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f7979w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f7979w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f7979w, new ic.f(), new c(), new Matrix(this.B));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ic.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f7979w.getAlpha(), f10, this.f7979w.getScaleX(), f11, this.f7979w.getScaleY(), this.f7973q, f12, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        ic.b.a(animatorSet, arrayList);
        animatorSet.setDuration(bd.h.f(this.f7979w.getContext(), i10, this.f7979w.getContext().getResources().getInteger(hc.g.b)));
        animatorSet.setInterpolator(bd.h.g(this.f7979w.getContext(), i11, ic.a.b));
        return animatorSet;
    }

    @NonNull
    public final ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable l() {
        return this.f7961e;
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f7962f;
    }

    public final ic.h o() {
        return this.f7971o;
    }

    public float p() {
        return this.f7965i;
    }

    @NonNull
    public final ViewTreeObserver.OnPreDrawListener q() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    public void r(@NonNull Rect rect) {
        int iV = v();
        float fM = this.f7963g ? m() + this.f7966j : 0.0f;
        int iMax = Math.max(iV, (int) Math.ceil(fM));
        int iMax2 = Math.max(iV, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float s() {
        return this.f7966j;
    }

    public final gd.k t() {
        return this.f7958a;
    }

    public final ic.h u() {
        return this.f7970n;
    }

    public int v() {
        if (this.f7962f) {
            return Math.max((this.f7967k - this.f7979w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void w(k kVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetJ;
        if (y()) {
            return;
        }
        Animator animator = this.f7969m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f7979w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        ic.h hVar = this.f7971o;
        if (hVar != null) {
            animatorSetJ = i(hVar, 0.0f, 0.0f, 0.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetJ = aVar.j(0.0f, 0.4f, 0.4f, G, H);
        }
        animatorSetJ.addListener(new C0121a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f7977u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                animatorSetJ.addListener(animatorListener);
            }
        }
        animatorSetJ.start();
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public boolean y() {
        if (this.f7979w.getVisibility() == 0) {
            return this.f7975s == 1;
        }
        return this.f7975s != 2;
    }

    public boolean z() {
        if (this.f7979w.getVisibility() != 0) {
            return this.f7975s == 2;
        }
        return this.f7975s != 1;
    }
}

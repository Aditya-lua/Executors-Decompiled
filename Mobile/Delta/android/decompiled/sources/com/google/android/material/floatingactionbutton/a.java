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
import hd.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator D = jc.a.f21813c;
    public static final int E = ic.b.F;
    public static final int F = ic.b.P;
    public static final int G = ic.b.G;
    public static final int H = ic.b.N;
    public static final int[] I = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] M = {R.attr.state_enabled};
    public static final int[] N = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hd.k f8032a;
    public hd.g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f8033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zc.a f8034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f8035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8036f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f8039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ad.j f8042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animator f8043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jc.h f8044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jc.h f8045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8046p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8048r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f8050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f8051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<j> f8052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f8053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gd.b f8054x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8037g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f8047q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8049s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f8055y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f8056z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0125a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8057a;
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f8058c;

        public C0125a(boolean z10, k kVar) {
            this.b = z10;
            this.f8058c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8057a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f8049s = 0;
            a.this.f8043m = null;
            if (this.f8057a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f8053w;
            boolean z10 = this.b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f8058c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f8053w.b(0, this.b);
            a.this.f8049s = 1;
            a.this.f8043m = animator;
            this.f8057a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8060a;
        public final /* synthetic */ k b;

        public b(boolean z10, k kVar) {
            this.f8060a = z10;
            this.b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f8049s = 0;
            a.this.f8043m = null;
            k kVar = this.b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f8053w.b(0, this.f8060a);
            a.this.f8049s = 2;
            a.this.f8043m = animator;
        }
    }

    public class c extends jc.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            a.this.f8047q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f8063a;
        public final /* synthetic */ float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f8064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f8065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f8066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f8067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f8068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f8069h;

        public d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f8063a = f10;
            this.b = f11;
            this.f8064c = f12;
            this.f8065d = f13;
            this.f8066e = f14;
            this.f8067f = f15;
            this.f8068g = f16;
            this.f8069h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f8053w.setAlpha(jc.a.b(this.f8063a, this.b, 0.0f, 0.2f, fFloatValue));
            a.this.f8053w.setScaleX(jc.a.a(this.f8064c, this.f8065d, fFloatValue));
            a.this.f8053w.setScaleY(jc.a.a(this.f8066e, this.f8065d, fFloatValue));
            a.this.f8047q = jc.a.a(this.f8067f, this.f8068g, fFloatValue);
            a.this.h(jc.a.a(this.f8067f, this.f8068g, fFloatValue), this.f8069h);
            a.this.f8053w.setImageMatrix(this.f8069h);
        }
    }

    public class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f8071a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f8071a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
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
            return aVar.f8038h + aVar.f8039i;
        }
    }

    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f8038h + aVar.f8040j;
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
            return a.this.f8038h;
        }
    }

    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8077a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8078c;

        public m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.g0((int) this.f8078c);
            this.f8077a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f8077a) {
                hd.g gVar = a.this.b;
                this.b = gVar == null ? 0.0f : gVar.w();
                this.f8078c = a();
                this.f8077a = true;
            }
            a aVar = a.this;
            float f10 = this.b;
            aVar.g0((int) (f10 + ((this.f8078c - f10) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ m(a aVar, C0125a c0125a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, gd.b bVar) {
        this.f8053w = floatingActionButton;
        this.f8054x = bVar;
        ad.j jVar = new ad.j();
        this.f8042l = jVar;
        jVar.a(I, k(new i()));
        jVar.a(J, k(new h()));
        jVar.a(K, k(new h()));
        jVar.a(L, k(new h()));
        jVar.a(M, k(new l()));
        jVar.a(N, k(new g()));
        this.f8046p = floatingActionButton.getRotation();
    }

    public void A() {
        throw null;
    }

    public void B() {
        hd.g gVar = this.b;
        if (gVar != null) {
            hd.h.f(this.f8053w, gVar);
        }
        if (K()) {
            this.f8053w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    public void C() {
        throw null;
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.f8053w.getViewTreeObserver();
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
        x2.g.h(this.f8035e, "Didn't initialize content background");
        if (!Z()) {
            this.f8054x.b(this.f8035e);
        } else {
            this.f8054x.b(new InsetDrawable(this.f8035e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void H() {
        float rotation = this.f8053w.getRotation();
        if (this.f8046p != rotation) {
            this.f8046p = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<j> arrayList = this.f8052v;
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
        ArrayList<j> arrayList = this.f8052v;
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
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        zc.a aVar = this.f8034d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f10) {
        if (this.f8038h != f10) {
            this.f8038h = f10;
            F(f10, this.f8039i, this.f8040j);
        }
    }

    public void O(boolean z10) {
        this.f8036f = z10;
    }

    public final void P(jc.h hVar) {
        this.f8045o = hVar;
    }

    public final void Q(float f10) {
        if (this.f8039i != f10) {
            this.f8039i = f10;
            F(this.f8038h, f10, this.f8040j);
        }
    }

    public final void R(float f10) {
        this.f8047q = f10;
        Matrix matrix = this.B;
        h(f10, matrix);
        this.f8053w.setImageMatrix(matrix);
    }

    public final void S(int i10) {
        if (this.f8048r != i10) {
            this.f8048r = i10;
            e0();
        }
    }

    public void T(int i10) {
        this.f8041k = i10;
    }

    public final void U(float f10) {
        if (this.f8040j != f10) {
            this.f8040j = f10;
            F(this.f8038h, this.f8039i, f10);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f8033c;
        if (drawable != null) {
            q2.a.o(drawable, fd.b.a(colorStateList));
        }
    }

    public void W(boolean z10) {
        this.f8037g = z10;
        f0();
    }

    public final void X(@NonNull hd.k kVar) {
        this.f8032a = kVar;
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f8033c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        zc.a aVar = this.f8034d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(jc.h hVar) {
        this.f8044n = hVar;
    }

    public boolean Z() {
        throw null;
    }

    public final boolean a0() {
        return o0.R(this.f8053w) && !this.f8053w.isInEditMode();
    }

    public final boolean b0() {
        return !this.f8036f || this.f8053w.getSizeDimension() >= this.f8041k;
    }

    public void c0(k kVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetJ;
        if (z()) {
            return;
        }
        Animator animator = this.f8043m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f8044n == null;
        if (!a0()) {
            this.f8053w.b(0, z10);
            this.f8053w.setAlpha(1.0f);
            this.f8053w.setScaleY(1.0f);
            this.f8053w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f8053w.getVisibility() != 0) {
            this.f8053w.setAlpha(0.0f);
            this.f8053w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f8053w.setScaleX(z11 ? 0.4f : 0.0f);
            R(z11 ? 0.4f : 0.0f);
        }
        jc.h hVar = this.f8044n;
        if (hVar != null) {
            animatorSetJ = i(hVar, 1.0f, 1.0f, 1.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetJ = aVar.j(1.0f, 1.0f, 1.0f, E, F);
        }
        animatorSetJ.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f8050t;
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
        if (this.f8051u == null) {
            this.f8051u = new ArrayList<>();
        }
        this.f8051u.add(animatorListener);
    }

    public final void e0() {
        R(this.f8047q);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f8050t == null) {
            this.f8050t = new ArrayList<>();
        }
        this.f8050t.add(animatorListener);
    }

    public final void f0() {
        Rect rect = this.f8055y;
        r(rect);
        G(rect);
        this.f8054x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(@NonNull j jVar) {
        if (this.f8052v == null) {
            this.f8052v = new ArrayList<>();
        }
        this.f8052v.add(jVar);
    }

    public void g0(float f10) {
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.Z(f10);
        }
    }

    public final void h(float f10, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f8053w.getDrawable();
        if (drawable == null || this.f8048r == 0) {
            return;
        }
        RectF rectF = this.f8056z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f8048r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f8048r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @NonNull
    public final AnimatorSet i(@NonNull jc.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8053w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8053w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f8053w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f8053w, new jc.f(), new c(), new Matrix(this.B));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        jc.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f8053w.getAlpha(), f10, this.f8053w.getScaleX(), f11, this.f8053w.getScaleY(), this.f8047q, f12, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        jc.b.a(animatorSet, arrayList);
        animatorSet.setDuration(cd.h.f(this.f8053w.getContext(), i10, this.f8053w.getContext().getResources().getInteger(ic.g.b)));
        animatorSet.setInterpolator(cd.h.g(this.f8053w.getContext(), i11, jc.a.b));
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
        return this.f8035e;
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f8036f;
    }

    public final jc.h o() {
        return this.f8045o;
    }

    public float p() {
        return this.f8039i;
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
        float fM = this.f8037g ? m() + this.f8040j : 0.0f;
        int iMax = Math.max(iV, (int) Math.ceil(fM));
        int iMax2 = Math.max(iV, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float s() {
        return this.f8040j;
    }

    public final hd.k t() {
        return this.f8032a;
    }

    public final jc.h u() {
        return this.f8044n;
    }

    public int v() {
        if (this.f8036f) {
            return Math.max((this.f8041k - this.f8053w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void w(k kVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetJ;
        if (y()) {
            return;
        }
        Animator animator = this.f8043m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f8053w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        jc.h hVar = this.f8045o;
        if (hVar != null) {
            animatorSetJ = i(hVar, 0.0f, 0.0f, 0.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetJ = aVar.j(0.0f, 0.4f, 0.4f, G, H);
        }
        animatorSetJ.addListener(new C0125a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f8051u;
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
        if (this.f8053w.getVisibility() == 0) {
            return this.f8049s == 1;
        }
        return this.f8049s != 2;
    }

    public boolean z() {
        if (this.f8053w.getVisibility() != 0) {
            return this.f8049s == 2;
        }
        return this.f8049s != 1;
    }
}

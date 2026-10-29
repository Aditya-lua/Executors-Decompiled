package com.google.android.material.floatingactionbutton;

import ad.C0138j;
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
import androidx.core.view.C0625o0;
import cd.C1627h;
import gd.InterfaceC6089b;
import java.util.ArrayList;
import p126fd.C5584b;
import p168hd.C6363g;
import p168hd.C6364h;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6743g;
import p216jc.C7137a;
import p216jc.C7138b;
import p216jc.C7142f;
import p216jc.C7143g;
import p216jc.C7144h;
import p368q2.C10425a;
import p533x2.C12637g;
import p600zc.C13770a;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a */
/* JADX INFO: loaded from: classes2.dex */
public class C2815a {

    /* JADX INFO: renamed from: D */
    public static final TimeInterpolator f10215D = C7137a.f27786c;

    /* JADX INFO: renamed from: E */
    public static final int f10216E = C6738b.f25864F;

    /* JADX INFO: renamed from: F */
    public static final int f10217F = C6738b.f25874P;

    /* JADX INFO: renamed from: G */
    public static final int f10218G = C6738b.f25865G;

    /* JADX INFO: renamed from: H */
    public static final int f10219H = C6738b.f25872N;

    /* JADX INFO: renamed from: I */
    public static final int[] f10220I = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: J */
    public static final int[] f10221J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: K */
    public static final int[] f10222K = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: L */
    public static final int[] f10223L = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: M */
    public static final int[] f10224M = {R.attr.state_enabled};

    /* JADX INFO: renamed from: N */
    public static final int[] f10225N = new int[0];

    /* JADX INFO: renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f10228C;

    /* JADX INFO: renamed from: a */
    public C6367k f10229a;

    /* JADX INFO: renamed from: b */
    public C6363g f10230b;

    /* JADX INFO: renamed from: c */
    public Drawable f10231c;

    /* JADX INFO: renamed from: d */
    public C13770a f10232d;

    /* JADX INFO: renamed from: e */
    public Drawable f10233e;

    /* JADX INFO: renamed from: f */
    public boolean f10234f;

    /* JADX INFO: renamed from: h */
    public float f10236h;

    /* JADX INFO: renamed from: i */
    public float f10237i;

    /* JADX INFO: renamed from: j */
    public float f10238j;

    /* JADX INFO: renamed from: k */
    public int f10239k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final C0138j f10240l;

    /* JADX INFO: renamed from: m */
    public Animator f10241m;

    /* JADX INFO: renamed from: n */
    public C7144h f10242n;

    /* JADX INFO: renamed from: o */
    public C7144h f10243o;

    /* JADX INFO: renamed from: p */
    public float f10244p;

    /* JADX INFO: renamed from: r */
    public int f10246r;

    /* JADX INFO: renamed from: t */
    public ArrayList<Animator.AnimatorListener> f10248t;

    /* JADX INFO: renamed from: u */
    public ArrayList<Animator.AnimatorListener> f10249u;

    /* JADX INFO: renamed from: v */
    public ArrayList<j> f10250v;

    /* JADX INFO: renamed from: w */
    public final FloatingActionButton f10251w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC6089b f10252x;

    /* JADX INFO: renamed from: g */
    public boolean f10235g = true;

    /* JADX INFO: renamed from: q */
    public float f10245q = 1.0f;

    /* JADX INFO: renamed from: s */
    public int f10247s = 0;

    /* JADX INFO: renamed from: y */
    public final Rect f10253y = new Rect();

    /* JADX INFO: renamed from: z */
    public final RectF f10254z = new RectF();

    /* JADX INFO: renamed from: A */
    public final RectF f10226A = new RectF();

    /* JADX INFO: renamed from: B */
    public final Matrix f10227B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f10255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10256b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ k f10257c;

        public a(boolean z10, k kVar) {
            this.f10256b = z10;
            this.f10257c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10255a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2815a.this.f10247s = 0;
            C2815a.this.f10241m = null;
            if (this.f10255a) {
                return;
            }
            FloatingActionButton floatingActionButton = C2815a.this.f10251w;
            boolean z10 = this.f10256b;
            floatingActionButton.m462b(z10 ? 8 : 4, z10);
            k kVar = this.f10257c;
            if (kVar != null) {
                kVar.mo12771b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2815a.this.f10251w.m462b(0, this.f10256b);
            C2815a.this.f10247s = 1;
            C2815a.this.f10241m = animator;
            this.f10255a = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$b */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10259a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ k f10260b;

        public b(boolean z10, k kVar) {
            this.f10259a = z10;
            this.f10260b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2815a.this.f10247s = 0;
            C2815a.this.f10241m = null;
            k kVar = this.f10260b;
            if (kVar != null) {
                kVar.mo12770a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2815a.this.f10251w.m462b(0, this.f10259a);
            C2815a.this.f10247s = 2;
            C2815a.this.f10241m = animator;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$c */
    public class c extends C7143g {
        public c() {
        }

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            C2815a.this.f10245q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f10263a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f10264b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f10265c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f10266d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f10267e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f10268f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f10269g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Matrix f10270h;

        public d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f10263a = f10;
            this.f10264b = f11;
            this.f10265c = f12;
            this.f10266d = f13;
            this.f10267e = f14;
            this.f10268f = f15;
            this.f10269g = f16;
            this.f10270h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2815a.this.f10251w.setAlpha(C7137a.m29920b(this.f10263a, this.f10264b, 0.0f, 0.2f, fFloatValue));
            C2815a.this.f10251w.setScaleX(C7137a.m29919a(this.f10265c, this.f10266d, fFloatValue));
            C2815a.this.f10251w.setScaleY(C7137a.m29919a(this.f10267e, this.f10266d, fFloatValue));
            C2815a.this.f10245q = C7137a.m29919a(this.f10268f, this.f10269g, fFloatValue);
            C2815a.this.m12817h(C7137a.m29919a(this.f10268f, this.f10269g, fFloatValue), this.f10270h);
            C2815a.this.f10251w.setImageMatrix(this.f10270h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$e */
    public class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a */
        public FloatEvaluator f10272a = new FloatEvaluator();

        public e() {
        }

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f10272a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$f */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C2815a.this.m12788H();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$g */
    public class g extends m {
        public g() {
            super(C2815a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.m
        /* JADX INFO: renamed from: a */
        public float mo12839a() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$h */
    public class h extends m {
        public h() {
            super(C2815a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.m
        /* JADX INFO: renamed from: a */
        public float mo12839a() {
            C2815a c2815a = C2815a.this;
            return c2815a.f10236h + c2815a.f10237i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$i */
    public class i extends m {
        public i() {
            super(C2815a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.m
        /* JADX INFO: renamed from: a */
        public float mo12839a() {
            C2815a c2815a = C2815a.this;
            return c2815a.f10236h + c2815a.f10238j;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void mo12775a();

        /* JADX INFO: renamed from: b */
        void mo12776b();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$k */
    public interface k {
        /* JADX INFO: renamed from: a */
        void mo12770a();

        /* JADX INFO: renamed from: b */
        void mo12771b();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$l */
    public class l extends m {
        public l() {
            super(C2815a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2815a.m
        /* JADX INFO: renamed from: a */
        public float mo12839a() {
            return C2815a.this.f10236h;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$m */
    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f10279a;

        /* JADX INFO: renamed from: b */
        public float f10280b;

        /* JADX INFO: renamed from: c */
        public float f10281c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public m() {
        }

        /* JADX INFO: renamed from: a */
        public abstract float mo12839a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2815a.this.m12816g0((int) this.f10281c);
            this.f10279a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f10279a) {
                C6363g c6363g = C2815a.this.f10230b;
                this.f10280b = c6363g == null ? 0.0f : c6363g.m27748w();
                this.f10281c = mo12839a();
                this.f10279a = true;
            }
            C2815a c2815a = C2815a.this;
            float f10 = this.f10280b;
            c2815a.m12816g0((int) (f10 + ((this.f10281c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.android.material.floatingactionbutton.a) A[MD:(com.google.android.material.floatingactionbutton.a):void (m)] (LINE:2) call: com.google.android.material.floatingactionbutton.a.m.<init>(com.google.android.material.floatingactionbutton.a):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ m(C2815a c2815a, a aVar) {
            this();
        }
    }

    public C2815a(FloatingActionButton floatingActionButton, InterfaceC6089b interfaceC6089b) {
        this.f10251w = floatingActionButton;
        this.f10252x = interfaceC6089b;
        C0138j c0138j = new C0138j();
        this.f10240l = c0138j;
        c0138j.m402a(f10220I, m12821k(new i()));
        c0138j.m402a(f10221J, m12821k(new h()));
        c0138j.m402a(f10222K, m12821k(new h()));
        c0138j.m402a(f10223L, m12821k(new h()));
        c0138j.m402a(f10224M, m12821k(new l()));
        c0138j.m402a(f10225N, m12821k(new g()));
        this.f10244p = floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: A */
    public void mo12781A() {
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public void m12782B() {
        C6363g c6363g = this.f10230b;
        if (c6363g != null) {
            C6364h.m27760f(this.f10251w, c6363g);
        }
        if (mo12791K()) {
            this.f10251w.getViewTreeObserver().addOnPreDrawListener(m12827q());
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo12783C() {
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public void m12784D() {
        ViewTreeObserver viewTreeObserver = this.f10251w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f10228C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f10228C = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo12785E(int[] iArr) {
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public void mo12786F(float f10, float f11, float f12) {
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public void m12787G(@NonNull Rect rect) {
        C12637g.m47076h(this.f10233e, "Didn't initialize content background");
        if (!mo12806Z()) {
            this.f10252x.mo12773b(this.f10233e);
        } else {
            this.f10252x.mo12773b(new InsetDrawable(this.f10233e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m12788H() {
        float rotation = this.f10251w.getRotation();
        if (this.f10244p != rotation) {
            this.f10244p = rotation;
            mo12810d0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m12789I() {
        ArrayList<j> arrayList = this.f10250v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.mo12776b();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m12790J() {
        ArrayList<j> arrayList = this.f10250v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.mo12775a();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean mo12791K() {
        throw null;
    }

    /* JADX INFO: renamed from: L */
    public void m12792L(ColorStateList colorStateList) {
        C6363g c6363g = this.f10230b;
        if (c6363g != null) {
            c6363g.setTintList(colorStateList);
        }
        C13770a c13770a = this.f10232d;
        if (c13770a != null) {
            c13770a.m50180c(colorStateList);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m12793M(PorterDuff.Mode mode) {
        C6363g c6363g = this.f10230b;
        if (c6363g != null) {
            c6363g.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m12794N(float f10) {
        if (this.f10236h != f10) {
            this.f10236h = f10;
            mo12786F(f10, this.f10237i, this.f10238j);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m12795O(boolean z10) {
        this.f10234f = z10;
    }

    /* JADX INFO: renamed from: P */
    public final void m12796P(C7144h c7144h) {
        this.f10243o = c7144h;
    }

    /* JADX INFO: renamed from: Q */
    public final void m12797Q(float f10) {
        if (this.f10237i != f10) {
            this.f10237i = f10;
            mo12786F(this.f10236h, f10, this.f10238j);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m12798R(float f10) {
        this.f10245q = f10;
        Matrix matrix = this.f10227B;
        m12817h(f10, matrix);
        this.f10251w.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: S */
    public final void m12799S(int i10) {
        if (this.f10246r != i10) {
            this.f10246r = i10;
            m12812e0();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12800T(int i10) {
        this.f10239k = i10;
    }

    /* JADX INFO: renamed from: U */
    public final void m12801U(float f10) {
        if (this.f10238j != f10) {
            this.f10238j = f10;
            mo12786F(this.f10236h, this.f10237i, f10);
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo12802V(ColorStateList colorStateList) {
        Drawable drawable = this.f10231c;
        if (drawable != null) {
            C10425a.m40118o(drawable, C5584b.m25241a(colorStateList));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m12803W(boolean z10) {
        this.f10235g = z10;
        m12814f0();
    }

    /* JADX INFO: renamed from: X */
    public final void m12804X(@NonNull C6367k c6367k) {
        this.f10229a = c6367k;
        C6363g c6363g = this.f10230b;
        if (c6363g != null) {
            c6363g.setShapeAppearanceModel(c6367k);
        }
        Object obj = this.f10231c;
        if (obj instanceof InterfaceC6370n) {
            ((InterfaceC6370n) obj).setShapeAppearanceModel(c6367k);
        }
        C13770a c13770a = this.f10232d;
        if (c13770a != null) {
            c13770a.m50183f(c6367k);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m12805Y(C7144h c7144h) {
        this.f10242n = c7144h;
    }

    /* JADX INFO: renamed from: Z */
    public boolean mo12806Z() {
        throw null;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m12807a0() {
        return C0625o0.m3006R(this.f10251w) && !this.f10251w.isInEditMode();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m12808b0() {
        return !this.f10234f || this.f10251w.getSizeDimension() >= this.f10239k;
    }

    /* JADX INFO: renamed from: c0 */
    public void m12809c0(k kVar, boolean z10) {
        C2815a c2815a;
        AnimatorSet animatorSetM12820j;
        if (m12836z()) {
            return;
        }
        Animator animator = this.f10241m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f10242n == null;
        if (!m12807a0()) {
            this.f10251w.m462b(0, z10);
            this.f10251w.setAlpha(1.0f);
            this.f10251w.setScaleY(1.0f);
            this.f10251w.setScaleX(1.0f);
            m12798R(1.0f);
            if (kVar != null) {
                kVar.mo12770a();
                return;
            }
            return;
        }
        if (this.f10251w.getVisibility() != 0) {
            this.f10251w.setAlpha(0.0f);
            this.f10251w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f10251w.setScaleX(z11 ? 0.4f : 0.0f);
            m12798R(z11 ? 0.4f : 0.0f);
        }
        C7144h c7144h = this.f10242n;
        if (c7144h != null) {
            animatorSetM12820j = m12819i(c7144h, 1.0f, 1.0f, 1.0f);
            c2815a = this;
        } else {
            c2815a = this;
            animatorSetM12820j = c2815a.m12820j(1.0f, 1.0f, 1.0f, f10216E, f10217F);
        }
        animatorSetM12820j.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = c2815a.f10248t;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                animatorSetM12820j.addListener(animatorListener);
            }
        }
        animatorSetM12820j.start();
    }

    /* JADX INFO: renamed from: d0 */
    public void mo12810d0() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public void m12811e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f10249u == null) {
            this.f10249u = new ArrayList<>();
        }
        this.f10249u.add(animatorListener);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m12812e0() {
        m12798R(this.f10245q);
    }

    /* JADX INFO: renamed from: f */
    public void m12813f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f10248t == null) {
            this.f10248t = new ArrayList<>();
        }
        this.f10248t.add(animatorListener);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12814f0() {
        Rect rect = this.f10253y;
        mo12828r(rect);
        m12787G(rect);
        this.f10252x.mo12772a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: g */
    public void m12815g(@NonNull j jVar) {
        if (this.f10250v == null) {
            this.f10250v = new ArrayList<>();
        }
        this.f10250v.add(jVar);
    }

    /* JADX INFO: renamed from: g0 */
    public void m12816g0(float f10) {
        C6363g c6363g = this.f10230b;
        if (c6363g != null) {
            c6363g.m27718Z(f10);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12817h(float f10, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f10251w.getDrawable();
        if (drawable == null || this.f10246r == 0) {
            return;
        }
        RectF rectF = this.f10254z;
        RectF rectF2 = this.f10226A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f10246r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f10246r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m12818h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public final AnimatorSet m12819i(@NonNull C7144h c7144h, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10251w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        c7144h.m29935e("opacity").m29942a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f10251w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c7144h.m29935e("scale").m29942a(objectAnimatorOfFloat2);
        m12818h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f10251w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c7144h.m29935e("scale").m29942a(objectAnimatorOfFloat3);
        m12818h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        m12817h(f12, this.f10227B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f10251w, new C7142f(), new c(), new Matrix(this.f10227B));
        c7144h.m29935e("iconScale").m29942a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7138b.m29922a(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m12820j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f10251w.getAlpha(), f10, this.f10251w.getScaleX(), f11, this.f10251w.getScaleY(), this.f10245q, f12, new Matrix(this.f10227B)));
        arrayList.add(valueAnimatorOfFloat);
        C7138b.m29922a(animatorSet, arrayList);
        animatorSet.setDuration(C1627h.m8223f(this.f10251w.getContext(), i10, this.f10251w.getContext().getResources().getInteger(C6743g.f26057b)));
        animatorSet.setInterpolator(C1627h.m8224g(this.f10251w.getContext(), i11, C7137a.f27785b));
        return animatorSet;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public final ValueAnimator m12821k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f10215D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m12822l() {
        return this.f10233e;
    }

    /* JADX INFO: renamed from: m */
    public float mo12823m() {
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m12824n() {
        return this.f10234f;
    }

    /* JADX INFO: renamed from: o */
    public final C7144h m12825o() {
        return this.f10243o;
    }

    /* JADX INFO: renamed from: p */
    public float m12826p() {
        return this.f10237i;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener m12827q() {
        if (this.f10228C == null) {
            this.f10228C = new f();
        }
        return this.f10228C;
    }

    /* JADX INFO: renamed from: r */
    public void mo12828r(@NonNull Rect rect) {
        int iM12832v = m12832v();
        float fMo12823m = this.f10235g ? mo12823m() + this.f10238j : 0.0f;
        int iMax = Math.max(iM12832v, (int) Math.ceil(fMo12823m));
        int iMax2 = Math.max(iM12832v, (int) Math.ceil(fMo12823m * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: s */
    public float m12829s() {
        return this.f10238j;
    }

    /* JADX INFO: renamed from: t */
    public final C6367k m12830t() {
        return this.f10229a;
    }

    /* JADX INFO: renamed from: u */
    public final C7144h m12831u() {
        return this.f10242n;
    }

    /* JADX INFO: renamed from: v */
    public int m12832v() {
        if (this.f10234f) {
            return Math.max((this.f10239k - this.f10251w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public void m12833w(k kVar, boolean z10) {
        C2815a c2815a;
        AnimatorSet animatorSetM12820j;
        if (m12835y()) {
            return;
        }
        Animator animator = this.f10241m;
        if (animator != null) {
            animator.cancel();
        }
        if (!m12807a0()) {
            this.f10251w.m462b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.mo12771b();
                return;
            }
            return;
        }
        C7144h c7144h = this.f10243o;
        if (c7144h != null) {
            animatorSetM12820j = m12819i(c7144h, 0.0f, 0.0f, 0.0f);
            c2815a = this;
        } else {
            c2815a = this;
            animatorSetM12820j = c2815a.m12820j(0.0f, 0.4f, 0.4f, f10218G, f10219H);
        }
        animatorSetM12820j.addListener(new a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = c2815a.f10249u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                animatorSetM12820j.addListener(animatorListener);
            }
        }
        animatorSetM12820j.start();
    }

    /* JADX INFO: renamed from: x */
    public void mo12834x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public boolean m12835y() {
        if (this.f10251w.getVisibility() == 0) {
            return this.f10247s == 1;
        }
        return this.f10247s != 2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m12836z() {
        if (this.f10251w.getVisibility() != 0) {
            return this.f10247s == 2;
        }
        return this.f10247s != 1;
    }
}

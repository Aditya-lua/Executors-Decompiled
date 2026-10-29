package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1831a;

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WindowInsetsCompat f1833a;
        public final int b;

        public b(int i10) {
            this.b = i10;
        }

        public final int a() {
            return this.b;
        }

        public void b(d1 d1Var) {
        }

        public void c(d1 d1Var) {
        }

        public abstract WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<d1> list);

        public abstract a e(d1 d1Var, a aVar);
    }

    public static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Interpolator f1834f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Interpolator f1835g = new g4.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Interpolator f1836h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Interpolator f1837i = new AccelerateInterpolator(1.5f);

        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f1838a;
            public WindowInsetsCompat b;

            /* JADX INFO: renamed from: androidx.core.view.d1$c$a$a, reason: collision with other inner class name */
            public class C0029a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d1 f1839a;
                public final /* synthetic */ WindowInsetsCompat b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f1840c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f1841d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f1842e;

                public C0029a(d1 d1Var, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10, View view) {
                    this.f1839a = d1Var;
                    this.b = windowInsetsCompat;
                    this.f1840c = windowInsetsCompat2;
                    this.f1841d = i10;
                    this.f1842e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1839a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.f1842e, c.p(this.b, this.f1840c, this.f1839a.c(), this.f1841d), Collections.singletonList(this.f1839a));
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d1 f1844a;
                public final /* synthetic */ View b;

                public b(d1 d1Var, View view) {
                    this.f1844a = d1Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f1844a.f(1.0f);
                    c.j(this.b, this.f1844a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.d1$c$a$c, reason: collision with other inner class name */
            public class RunnableC0030c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f1846a;
                public final /* synthetic */ d1 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f1847c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f1848d;

                public RunnableC0030c(View view, d1 d1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f1846a = view;
                    this.b = d1Var;
                    this.f1847c = aVar;
                    this.f1848d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m(this.f1846a, this.b, this.f1847c);
                    this.f1848d.start();
                }
            }

            public a(View view, b bVar) {
                this.f1838a = bVar;
                WindowInsetsCompat windowInsetsCompatF = o0.F(view);
                this.b = windowInsetsCompatF != null ? new WindowInsetsCompat.Builder(windowInsetsCompatF).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.b == null) {
                    this.b = o0.F(view);
                }
                if (this.b == null) {
                    this.b = windowInsetsCompat;
                    return c.n(view, windowInsets);
                }
                b bVarO = c.o(view);
                if (bVarO != null && Objects.equals(bVarO.f1833a, windowInsetsCompat)) {
                    return c.n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.f(windowInsetsCompat, this.b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = windowInsetsCompat;
                    return c.n(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.b;
                d1 d1Var = new d1(i12, c.h(i10, i11), (WindowInsetsCompat.Type.ime() & i12) != 0 ? 160L : 250L);
                d1Var.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(d1Var.b());
                a aVarG = c.g(windowInsetsCompat, windowInsetsCompat2, i12);
                c.k(view, d1Var, windowInsetsCompat, false);
                duration.addUpdateListener(new C0029a(d1Var, windowInsetsCompat, windowInsetsCompat2, i12, view));
                duration.addListener(new b(d1Var, view));
                b0.a(view, new RunnableC0030c(view, d1Var, aVarG, duration));
                this.b = windowInsetsCompat;
                return c.n(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        public static void f(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                Insets insets = windowInsetsCompat.getInsets(i10);
                Insets insets2 = windowInsetsCompat2.getInsets(i10);
                int i11 = insets.left;
                int i12 = insets2.left;
                boolean z10 = i11 > i12 || insets.top > insets2.top || insets.right > insets2.right || insets.bottom > insets2.bottom;
                if (z10 != (i11 < i12 || insets.top < insets2.top || insets.right < insets2.right || insets.bottom < insets2.bottom)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        public static a g(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10) {
            Insets insets = windowInsetsCompat.getInsets(i10);
            Insets insets2 = windowInsetsCompat2.getInsets(i10);
            return new a(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        public static Interpolator h(int i10, int i11) {
            if ((WindowInsetsCompat.Type.ime() & i10) != 0) {
                return f1834f;
            }
            if ((WindowInsetsCompat.Type.ime() & i11) != 0) {
                return f1835g;
            }
            if ((i10 & WindowInsetsCompat.Type.systemBars()) != 0) {
                return f1836h;
            }
            if ((WindowInsetsCompat.Type.systemBars() & i11) != 0) {
                return f1837i;
            }
            return null;
        }

        public static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void j(View view, d1 d1Var) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.b(d1Var);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), d1Var);
                }
            }
        }

        public static void k(View view, d1 d1Var, WindowInsetsCompat windowInsetsCompat, boolean z10) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.f1833a = windowInsetsCompat;
                if (!z10) {
                    bVarO.c(d1Var);
                    z10 = bVarO.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), d1Var, windowInsetsCompat, z10);
                }
            }
        }

        public static void l(View view, WindowInsetsCompat windowInsetsCompat, List<d1> list) {
            b bVarO = o(view);
            if (bVarO != null) {
                windowInsetsCompat = bVarO.d(windowInsetsCompat, list);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), windowInsetsCompat, list);
                }
            }
        }

        public static void m(View view, d1 d1Var, a aVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.e(d1Var, aVar);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m(viewGroup.getChildAt(i10), d1Var, aVar);
                }
            }
        }

        public static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(j2.e.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b o(View view) {
            Object tag = view.getTag(j2.e.U);
            if (tag instanceof a) {
                return ((a) tag).f1838a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static WindowInsetsCompat p(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f10, int i10) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    builder.setInsets(i11, windowInsetsCompat.getInsets(i11));
                } else {
                    Insets insets = windowInsetsCompat.getInsets(i11);
                    Insets insets2 = windowInsetsCompat2.getInsets(i11);
                    float f11 = 1.0f - f10;
                    builder.setInsets(i11, WindowInsetsCompat.insetInsets(insets, (int) (((double) ((insets.left - insets2.left) * f11)) + 0.5d), (int) (((double) ((insets.top - insets2.top) * f11)) + 0.5d), (int) (((double) ((insets.right - insets2.right) * f11)) + 0.5d), (int) (((double) ((insets.bottom - insets2.bottom) * f11)) + 0.5d)));
                }
            }
            return builder.build();
        }

        public static void q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerI = bVar != null ? i(view, bVar) : null;
            view.setTag(j2.e.U, onApplyWindowInsetsListenerI);
            if (view.getTag(j2.e.L) == null && view.getTag(j2.e.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerI);
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1854a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f1855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f1856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1857e = 1.0f;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f1854a = i10;
            this.f1855c = interpolator;
            this.f1856d = j10;
        }

        public float a() {
            return this.f1857e;
        }

        public long b() {
            return this.f1856d;
        }

        public float c() {
            Interpolator interpolator = this.f1855c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int d() {
            return this.f1854a;
        }

        public void e(float f10) {
            this.b = f10;
        }
    }

    public d1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1831a = new d(i10, interpolator, j10);
        } else {
            this.f1831a = new c(i10, interpolator, j10);
        }
    }

    public static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    public static d1 g(WindowInsetsAnimation windowInsetsAnimation) {
        return new d1(windowInsetsAnimation);
    }

    public float a() {
        return this.f1831a.a();
    }

    public long b() {
        return this.f1831a.b();
    }

    public float c() {
        return this.f1831a.c();
    }

    public int d() {
        return this.f1831a.d();
    }

    public void f(float f10) {
        this.f1831a.e(f10);
    }

    public static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final WindowInsetsAnimation f1850f;

        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f1851a;
            public List<d1> b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList<d1> f1852c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, d1> f1853d;

            public a(b bVar) {
                super(bVar.a());
                this.f1853d = new HashMap<>();
                this.f1851a = bVar;
            }

            public final d1 a(WindowInsetsAnimation windowInsetsAnimation) {
                d1 d1Var = this.f1853d.get(windowInsetsAnimation);
                if (d1Var != null) {
                    return d1Var;
                }
                d1 d1VarG = d1.g(windowInsetsAnimation);
                this.f1853d.put(windowInsetsAnimation, d1VarG);
                return d1VarG;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1851a.b(a(windowInsetsAnimation));
                this.f1853d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1851a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<d1> arrayList = this.f1852c;
                if (arrayList == null) {
                    ArrayList<d1> arrayList2 = new ArrayList<>(list.size());
                    this.f1852c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = h1.a(list.get(size));
                    d1 d1VarA = a(windowInsetsAnimationA);
                    d1VarA.f(windowInsetsAnimationA.getFraction());
                    this.f1852c.add(d1VarA);
                }
                return this.f1851a.d(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.b).toWindowInsets();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f1851a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f1850f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            g1.a();
            return f1.a(aVar.a().toPlatformInsets(), aVar.b().toPlatformInsets());
        }

        public static Insets g(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getUpperBound());
        }

        public static Insets h(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getLowerBound());
        }

        public static void i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.d1.e
        public float a() {
            return this.f1850f.getAlpha();
        }

        @Override // androidx.core.view.d1.e
        public long b() {
            return this.f1850f.getDurationMillis();
        }

        @Override // androidx.core.view.d1.e
        public float c() {
            return this.f1850f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.d1.e
        public int d() {
            return this.f1850f.getTypeMask();
        }

        @Override // androidx.core.view.d1.e
        public void e(float f10) {
            this.f1850f.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(e1.a(i10, interpolator, j10));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Insets f1832a;
        public final Insets b;

        public a(Insets insets, Insets insets2) {
            this.f1832a = insets;
            this.b = insets2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public Insets a() {
            return this.f1832a;
        }

        public Insets b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f1832a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f1832a = d.h(bounds);
            this.b = d.g(bounds);
        }
    }

    public d1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1831a = new d(windowInsetsAnimation);
        }
    }
}

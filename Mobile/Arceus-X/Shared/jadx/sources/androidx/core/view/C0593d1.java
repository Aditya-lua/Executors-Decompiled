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
import p144g4.C6002a;
import p206j2.C7023e;

/* JADX INFO: renamed from: androidx.core.view.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0593d1 {

    /* JADX INFO: renamed from: a */
    public e f2375a;

    /* JADX INFO: renamed from: androidx.core.view.d1$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat f2378a;

        /* JADX INFO: renamed from: b */
        public final int f2379b;

        public b(int i10) {
            this.f2379b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final int m2853a() {
            return this.f2379b;
        }

        /* JADX INFO: renamed from: b */
        public void mo2854b(C0593d1 c0593d1) {
        }

        /* JADX INFO: renamed from: c */
        public void mo2855c(C0593d1 c0593d1) {
        }

        /* JADX INFO: renamed from: d */
        public abstract WindowInsetsCompat mo2856d(WindowInsetsCompat windowInsetsCompat, List<C0593d1> list);

        /* JADX INFO: renamed from: e */
        public abstract a mo2857e(C0593d1 c0593d1, a aVar);
    }

    /* JADX INFO: renamed from: androidx.core.view.d1$c */
    public static class c extends e {

        /* JADX INFO: renamed from: f */
        public static final Interpolator f2380f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        public static final Interpolator f2381g = new C6002a();

        /* JADX INFO: renamed from: h */
        public static final Interpolator f2382h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        public static final Interpolator f2383i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: androidx.core.view.d1$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final b f2384a;

            /* JADX INFO: renamed from: b */
            public WindowInsetsCompat f2385b;

            /* JADX INFO: renamed from: androidx.core.view.d1$c$a$a, reason: collision with other inner class name */
            public class C14071a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0593d1 f2386a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ WindowInsetsCompat f2387b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ WindowInsetsCompat f2388c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2389d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f2390e;

                /* JADX DEBUG: Incorrect args count in method signature: ()V */
                public C14071a(C0593d1 c0593d1, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10, View view) {
                    this.f2386a = c0593d1;
                    this.f2387b = windowInsetsCompat;
                    this.f2388c = windowInsetsCompat2;
                    this.f2389d = i10;
                    this.f2390e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f2386a.m2848f(valueAnimator.getAnimatedFraction());
                    c.m2864l(this.f2390e, c.m2868p(this.f2387b, this.f2388c, this.f2386a.m2846c(), this.f2389d), Collections.singletonList(this.f2386a));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.d1$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0593d1 f2392a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f2393b;

                public b(C0593d1 c0593d1, View view) {
                    this.f2392a = c0593d1;
                    this.f2393b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f2392a.m2848f(1.0f);
                    c.m2862j(this.f2393b, this.f2392a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.d1$c$a$c, reason: collision with other inner class name */
            public class RunnableC14072c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f2395a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0593d1 f2396b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ a f2397c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f2398d;

                /* JADX DEBUG: Incorrect args count in method signature: ()V */
                public RunnableC14072c(View view, C0593d1 c0593d1, a aVar, ValueAnimator valueAnimator) {
                    this.f2395a = view;
                    this.f2396b = c0593d1;
                    this.f2397c = aVar;
                    this.f2398d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m2865m(this.f2395a, this.f2396b, this.f2397c);
                    this.f2398d.start();
                }
            }

            public a(View view, b bVar) {
                this.f2384a = bVar;
                WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(view);
                this.f2385b = windowInsetsCompatM2988F != null ? new WindowInsetsCompat.Builder(windowInsetsCompatM2988F).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f2385b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return c.m2866n(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.f2385b == null) {
                    this.f2385b = C0625o0.m2988F(view);
                }
                if (this.f2385b == null) {
                    this.f2385b = windowInsetsCompat;
                    return c.m2866n(view, windowInsets);
                }
                b bVarM2867o = c.m2867o(view);
                if (bVarM2867o != null && Objects.equals(bVarM2867o.f2378a, windowInsetsCompat)) {
                    return c.m2866n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.m2858f(windowInsetsCompat, this.f2385b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f2385b = windowInsetsCompat;
                    return c.m2866n(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f2385b;
                C0593d1 c0593d1 = new C0593d1(i12, c.m2860h(i10, i11), (WindowInsetsCompat.Type.ime() & i12) != 0 ? 160L : 250L);
                c0593d1.m2848f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0593d1.m2845b());
                a aVarM2859g = c.m2859g(windowInsetsCompat, windowInsetsCompat2, i12);
                c.m2863k(view, c0593d1, windowInsetsCompat, false);
                duration.addUpdateListener(new C14071a(c0593d1, windowInsetsCompat, windowInsetsCompat2, i12, view));
                duration.addListener(new b(c0593d1, view));
                ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(view, new RunnableC14072c(view, c0593d1, aVarM2859g, duration));
                this.f2385b = windowInsetsCompat;
                return c.m2866n(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: f */
        public static void m2858f(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
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

        /* JADX INFO: renamed from: g */
        public static a m2859g(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10) {
            Insets insets = windowInsetsCompat.getInsets(i10);
            Insets insets2 = windowInsetsCompat2.getInsets(i10);
            return new a(Insets.m2661of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.m2661of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        /* JADX INFO: renamed from: h */
        public static Interpolator m2860h(int i10, int i11) {
            if ((WindowInsetsCompat.Type.ime() & i10) != 0) {
                return f2380f;
            }
            if ((WindowInsetsCompat.Type.ime() & i11) != 0) {
                return f2381g;
            }
            if ((i10 & WindowInsetsCompat.Type.systemBars()) != 0) {
                return f2382h;
            }
            if ((WindowInsetsCompat.Type.systemBars() & i11) != 0) {
                return f2383i;
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static View.OnApplyWindowInsetsListener m2861i(View view, b bVar) {
            return new a(view, bVar);
        }

        /* JADX INFO: renamed from: j */
        public static void m2862j(View view, C0593d1 c0593d1) {
            b bVarM2867o = m2867o(view);
            if (bVarM2867o != null) {
                bVarM2867o.mo2854b(c0593d1);
                if (bVarM2867o.m2853a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m2862j(viewGroup.getChildAt(i10), c0593d1);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m2863k(View view, C0593d1 c0593d1, WindowInsetsCompat windowInsetsCompat, boolean z10) {
            b bVarM2867o = m2867o(view);
            if (bVarM2867o != null) {
                bVarM2867o.f2378a = windowInsetsCompat;
                if (!z10) {
                    bVarM2867o.mo2855c(c0593d1);
                    z10 = bVarM2867o.m2853a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m2863k(viewGroup.getChildAt(i10), c0593d1, windowInsetsCompat, z10);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public static void m2864l(View view, WindowInsetsCompat windowInsetsCompat, List<C0593d1> list) {
            b bVarM2867o = m2867o(view);
            if (bVarM2867o != null) {
                windowInsetsCompat = bVarM2867o.mo2856d(windowInsetsCompat, list);
                if (bVarM2867o.m2853a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m2864l(viewGroup.getChildAt(i10), windowInsetsCompat, list);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public static void m2865m(View view, C0593d1 c0593d1, a aVar) {
            b bVarM2867o = m2867o(view);
            if (bVarM2867o != null) {
                bVarM2867o.mo2857e(c0593d1, aVar);
                if (bVarM2867o.m2853a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m2865m(viewGroup.getChildAt(i10), c0593d1, aVar);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public static WindowInsets m2866n(View view, WindowInsets windowInsets) {
            return view.getTag(C7023e.f27494M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: o */
        public static b m2867o(View view) {
            Object tag = view.getTag(C7023e.f27502U);
            if (tag instanceof a) {
                return ((a) tag).f2384a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: p */
        public static WindowInsetsCompat m2868p(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f10, int i10) {
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

        /* JADX INFO: renamed from: q */
        public static void m2869q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM2861i = bVar != null ? m2861i(view, bVar) : null;
            view.setTag(C7023e.f27502U, onApplyWindowInsetsListenerM2861i);
            if (view.getTag(C7023e.f27493L) == null && view.getTag(C7023e.f27494M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM2861i);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d1$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final int f2405a;

        /* JADX INFO: renamed from: b */
        public float f2406b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f2407c;

        /* JADX INFO: renamed from: d */
        public final long f2408d;

        /* JADX INFO: renamed from: e */
        public float f2409e = 1.0f;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f2405a = i10;
            this.f2407c = interpolator;
            this.f2408d = j10;
        }

        /* JADX INFO: renamed from: a */
        public float mo2874a() {
            return this.f2409e;
        }

        /* JADX INFO: renamed from: b */
        public long mo2875b() {
            return this.f2408d;
        }

        /* JADX INFO: renamed from: c */
        public float mo2876c() {
            Interpolator interpolator = this.f2407c;
            return interpolator != null ? interpolator.getInterpolation(this.f2406b) : this.f2406b;
        }

        /* JADX INFO: renamed from: d */
        public int mo2877d() {
            return this.f2405a;
        }

        /* JADX INFO: renamed from: e */
        public void mo2878e(float f10) {
            this.f2406b = f10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0593d1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2375a = new d(i10, interpolator, j10);
        } else {
            this.f2375a = new c(i10, interpolator, j10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2842e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.m2873i(view, bVar);
        } else {
            c.m2869q(view, bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C0593d1 m2843g(WindowInsetsAnimation windowInsetsAnimation) {
        return new C0593d1(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public float m2844a() {
        return this.f2375a.mo2874a();
    }

    /* JADX INFO: renamed from: b */
    public long m2845b() {
        return this.f2375a.mo2875b();
    }

    /* JADX INFO: renamed from: c */
    public float m2846c() {
        return this.f2375a.mo2876c();
    }

    /* JADX INFO: renamed from: d */
    public int m2847d() {
        return this.f2375a.mo2877d();
    }

    /* JADX INFO: renamed from: f */
    public void m2848f(float f10) {
        this.f2375a.mo2878e(f10);
    }

    /* JADX INFO: renamed from: androidx.core.view.d1$d */
    public static class d extends e {

        /* JADX INFO: renamed from: f */
        public final WindowInsetsAnimation f2400f;

        /* JADX INFO: renamed from: androidx.core.view.d1$d$a */
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final b f2401a;

            /* JADX INFO: renamed from: b */
            public List<C0593d1> f2402b;

            /* JADX INFO: renamed from: c */
            public ArrayList<C0593d1> f2403c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, C0593d1> f2404d;

            public a(b bVar) {
                super(bVar.m2853a());
                this.f2404d = new HashMap<>();
                this.f2401a = bVar;
            }

            /* JADX INFO: renamed from: a */
            public final C0593d1 m2879a(WindowInsetsAnimation windowInsetsAnimation) {
                C0593d1 c0593d1 = this.f2404d.get(windowInsetsAnimation);
                if (c0593d1 != null) {
                    return c0593d1;
                }
                C0593d1 c0593d1M2843g = C0593d1.m2843g(windowInsetsAnimation);
                this.f2404d.put(windowInsetsAnimation, c0593d1M2843g);
                return c0593d1M2843g;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2401a.mo2854b(m2879a(windowInsetsAnimation));
                this.f2404d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2401a.mo2855c(m2879a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C0593d1> arrayList = this.f2403c;
                if (arrayList == null) {
                    ArrayList<C0593d1> arrayList2 = new ArrayList<>(list.size());
                    this.f2403c = arrayList2;
                    this.f2402b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM2905a = C0605h1.m2905a(list.get(size));
                    C0593d1 c0593d1M2879a = m2879a(windowInsetsAnimationM2905a);
                    c0593d1M2879a.m2848f(windowInsetsAnimationM2905a.getFraction());
                    this.f2403c.add(c0593d1M2879a);
                }
                return this.f2401a.mo2856d(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.f2402b).toWindowInsets();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f2401a.mo2857e(m2879a(windowInsetsAnimation), a.m2849d(bounds)).m2852c();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f2400f = windowInsetsAnimation;
        }

        /* JADX INFO: renamed from: f */
        public static WindowInsetsAnimation.Bounds m2870f(a aVar) {
            C0602g1.m2897a();
            return C0599f1.m2895a(aVar.m2850a().toPlatformInsets(), aVar.m2851b().toPlatformInsets());
        }

        /* JADX INFO: renamed from: g */
        public static Insets m2871g(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getUpperBound());
        }

        /* JADX INFO: renamed from: h */
        public static Insets m2872h(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: i */
        public static void m2873i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.C0593d1.e
        /* JADX INFO: renamed from: a */
        public float mo2874a() {
            return this.f2400f.getAlpha();
        }

        @Override // androidx.core.view.C0593d1.e
        /* JADX INFO: renamed from: b */
        public long mo2875b() {
            return this.f2400f.getDurationMillis();
        }

        @Override // androidx.core.view.C0593d1.e
        /* JADX INFO: renamed from: c */
        public float mo2876c() {
            return this.f2400f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.C0593d1.e
        /* JADX INFO: renamed from: d */
        public int mo2877d() {
            return this.f2400f.getTypeMask();
        }

        @Override // androidx.core.view.C0593d1.e
        /* JADX INFO: renamed from: e */
        public void mo2878e(float f10) {
            this.f2400f.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(C0596e1.m2890a(i10, interpolator, j10));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Insets f2376a;

        /* JADX INFO: renamed from: b */
        public final Insets f2377b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Insets insets, Insets insets2) {
            this.f2376a = insets;
            this.f2377b = insets2;
        }

        /* JADX INFO: renamed from: d */
        public static a m2849d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        /* JADX INFO: renamed from: a */
        public Insets m2850a() {
            return this.f2376a;
        }

        /* JADX INFO: renamed from: b */
        public Insets m2851b() {
            return this.f2377b;
        }

        /* JADX INFO: renamed from: c */
        public WindowInsetsAnimation.Bounds m2852c() {
            return d.m2870f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f2376a + " upper=" + this.f2377b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f2376a = d.m2872h(bounds);
            this.f2377b = d.m2871g(bounds);
        }
    }

    public C0593d1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2375a = new d(windowInsetsAnimation);
        }
    }
}

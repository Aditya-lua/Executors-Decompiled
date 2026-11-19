package b3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f3598l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Interpolator f3599m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Interpolator f3600n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Interpolator f3601o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3602a;
    public final a b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Insets f3603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets f3604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f3609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f3610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ValueAnimator f3611k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3612a = -1;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Insets f3613c = Insets.NONE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3614d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Drawable f3615e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f3616f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3617g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3618h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC0077a f3619i;

        /* JADX INFO: renamed from: b3.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0077a {
            default void a(int i10) {
            }

            default void b(boolean z10) {
            }

            default void c(Insets insets) {
            }

            default void d(float f10) {
            }

            default void e(int i10) {
            }

            default void f(float f10) {
            }

            default void g(float f10) {
            }

            default void h(Drawable drawable) {
            }
        }

        public final void A(int i10) {
            if (this.f3612a != i10) {
                this.f3612a = i10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.e(i10);
                }
            }
        }

        public float k() {
            return this.f3618h;
        }

        public Drawable l() {
            return this.f3615e;
        }

        public int m() {
            return this.b;
        }

        public Insets n() {
            return this.f3613c;
        }

        public float o() {
            return this.f3616f;
        }

        public float p() {
            return this.f3617g;
        }

        public int q() {
            return this.f3612a;
        }

        public boolean r() {
            return this.f3614d;
        }

        public final void s(float f10) {
            if (this.f3618h != f10) {
                this.f3618h = f10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.d(f10);
                }
            }
        }

        public void t(InterfaceC0077a interfaceC0077a) {
            if (this.f3619i != null && interfaceC0077a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.f3619i = interfaceC0077a;
        }

        public final void u(Drawable drawable) {
            this.f3615e = drawable;
            InterfaceC0077a interfaceC0077a = this.f3619i;
            if (interfaceC0077a != null) {
                interfaceC0077a.h(drawable);
            }
        }

        public final void v(int i10) {
            if (this.b != i10) {
                this.b = i10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.a(i10);
                }
            }
        }

        public final void w(Insets insets) {
            if (this.f3613c.equals(insets)) {
                return;
            }
            this.f3613c = insets;
            InterfaceC0077a interfaceC0077a = this.f3619i;
            if (interfaceC0077a != null) {
                interfaceC0077a.c(insets);
            }
        }

        public final void x(float f10) {
            if (this.f3616f != f10) {
                this.f3616f = f10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.f(f10);
                }
            }
        }

        public final void y(float f10) {
            if (this.f3617g != f10) {
                this.f3617g = f10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.g(f10);
                }
            }
        }

        public final void z(boolean z10) {
            if (this.f3614d != z10) {
                this.f3614d = z10;
                InterfaceC0077a interfaceC0077a = this.f3619i;
                if (interfaceC0077a != null) {
                    interfaceC0077a.b(z10);
                }
            }
        }
    }

    public b(int i10) {
        Insets insets = Insets.NONE;
        this.f3603c = insets;
        this.f3604d = insets;
        this.f3605e = 1.0f;
        this.f3606f = 1.0f;
        this.f3607g = 1.0f;
        this.f3608h = 1.0f;
        this.f3609i = null;
        this.f3610j = null;
        this.f3611k = null;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            this.f3602a = i10;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i10);
    }

    public void a(int i10) {
    }

    public Insets b(Insets insets, Insets insets2, Insets insets3) {
        this.f3603c = insets;
        this.f3604d = insets2;
        this.b.w(insets3);
        return o();
    }

    public a c() {
        return this.b;
    }

    public Object d() {
        return this.f3609i;
    }

    public int e() {
        return this.f3602a;
    }

    public int f(int i10) {
        return i10;
    }

    public boolean g() {
        return false;
    }

    public void h(Object obj) {
        this.f3609i = obj;
    }

    public void i(Drawable drawable) {
        this.b.u(drawable);
    }

    public void j(float f10) {
        this.f3605e = f10;
        m();
    }

    public void k(float f10) {
        this.f3607g = f10;
        n();
    }

    public void l(boolean z10) {
        this.b.z(z10);
    }

    public final void m() {
        this.b.s(this.f3605e * this.f3606f);
    }

    public final void n() {
        float f10 = this.f3608h * this.f3607g;
        int i10 = this.f3602a;
        if (i10 == 1) {
            a aVar = this.b;
            aVar.x((-(1.0f - f10)) * aVar.f3612a);
            return;
        }
        if (i10 == 2) {
            a aVar2 = this.b;
            aVar2.y((-(1.0f - f10)) * aVar2.b);
        } else if (i10 == 4) {
            a aVar3 = this.b;
            aVar3.x((1.0f - f10) * aVar3.f3612a);
        } else {
            if (i10 != 8) {
                return;
            }
            a aVar4 = this.b;
            aVar4.y((1.0f - f10) * aVar4.b);
        }
    }

    public Insets o() {
        int i10;
        Insets insetsOf = Insets.NONE;
        int i11 = this.f3602a;
        if (i11 == 1) {
            i10 = this.f3603c.left;
            this.b.A(f(this.f3604d.left));
            if (g()) {
                insetsOf = Insets.of(f(i10), 0, 0, 0);
            }
        } else if (i11 == 2) {
            i10 = this.f3603c.top;
            this.b.v(f(this.f3604d.top));
            if (g()) {
                insetsOf = Insets.of(0, f(i10), 0, 0);
            }
        } else if (i11 == 4) {
            i10 = this.f3603c.right;
            this.b.A(f(this.f3604d.right));
            if (g()) {
                insetsOf = Insets.of(0, 0, f(i10), 0);
            }
        } else if (i11 != 8) {
            i10 = 0;
        } else {
            i10 = this.f3603c.bottom;
            this.b.v(f(this.f3604d.bottom));
            if (g()) {
                insetsOf = Insets.of(0, 0, 0, f(i10));
            }
        }
        l(i10 > 0);
        j(i10 > 0 ? 1.0f : 0.0f);
        k(i10 > 0 ? 1.0f : 0.0f);
        return insetsOf;
    }
}

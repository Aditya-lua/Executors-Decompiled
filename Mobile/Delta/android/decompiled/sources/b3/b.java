package b3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f3847l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Interpolator f3848m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Interpolator f3849n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Interpolator f3850o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3851a;
    public final a b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Insets f3852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets f3853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f3858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f3859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ValueAnimator f3860k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3861a = -1;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Insets f3862c = Insets.NONE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3863d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Drawable f3864e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f3865f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3866g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3867h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC0069a f3868i;

        /* JADX INFO: renamed from: b3.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0069a {
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
            if (this.f3861a != i10) {
                this.f3861a = i10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.e(i10);
                }
            }
        }

        public float k() {
            return this.f3867h;
        }

        public Drawable l() {
            return this.f3864e;
        }

        public int m() {
            return this.b;
        }

        public Insets n() {
            return this.f3862c;
        }

        public float o() {
            return this.f3865f;
        }

        public float p() {
            return this.f3866g;
        }

        public int q() {
            return this.f3861a;
        }

        public boolean r() {
            return this.f3863d;
        }

        public final void s(float f10) {
            if (this.f3867h != f10) {
                this.f3867h = f10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.d(f10);
                }
            }
        }

        public void t(InterfaceC0069a interfaceC0069a) {
            if (this.f3868i != null && interfaceC0069a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.f3868i = interfaceC0069a;
        }

        public final void u(Drawable drawable) {
            this.f3864e = drawable;
            InterfaceC0069a interfaceC0069a = this.f3868i;
            if (interfaceC0069a != null) {
                interfaceC0069a.h(drawable);
            }
        }

        public final void v(int i10) {
            if (this.b != i10) {
                this.b = i10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.a(i10);
                }
            }
        }

        public final void w(Insets insets) {
            if (this.f3862c.equals(insets)) {
                return;
            }
            this.f3862c = insets;
            InterfaceC0069a interfaceC0069a = this.f3868i;
            if (interfaceC0069a != null) {
                interfaceC0069a.c(insets);
            }
        }

        public final void x(float f10) {
            if (this.f3865f != f10) {
                this.f3865f = f10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.f(f10);
                }
            }
        }

        public final void y(float f10) {
            if (this.f3866g != f10) {
                this.f3866g = f10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.g(f10);
                }
            }
        }

        public final void z(boolean z10) {
            if (this.f3863d != z10) {
                this.f3863d = z10;
                InterfaceC0069a interfaceC0069a = this.f3868i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.b(z10);
                }
            }
        }
    }

    public b(int i10) {
        Insets insets = Insets.NONE;
        this.f3852c = insets;
        this.f3853d = insets;
        this.f3854e = 1.0f;
        this.f3855f = 1.0f;
        this.f3856g = 1.0f;
        this.f3857h = 1.0f;
        this.f3858i = null;
        this.f3859j = null;
        this.f3860k = null;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            this.f3851a = i10;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i10);
    }

    public void a(int i10) {
    }

    public Insets b(Insets insets, Insets insets2, Insets insets3) {
        this.f3852c = insets;
        this.f3853d = insets2;
        this.b.w(insets3);
        return o();
    }

    public a c() {
        return this.b;
    }

    public Object d() {
        return this.f3858i;
    }

    public int e() {
        return this.f3851a;
    }

    public int f(int i10) {
        return i10;
    }

    public boolean g() {
        return false;
    }

    public void h(Object obj) {
        this.f3858i = obj;
    }

    public void i(Drawable drawable) {
        this.b.u(drawable);
    }

    public void j(float f10) {
        this.f3854e = f10;
        m();
    }

    public void k(float f10) {
        this.f3856g = f10;
        n();
    }

    public void l(boolean z10) {
        this.b.z(z10);
    }

    public final void m() {
        this.b.s(this.f3854e * this.f3855f);
    }

    public final void n() {
        float f10 = this.f3857h * this.f3856g;
        int i10 = this.f3851a;
        if (i10 == 1) {
            a aVar = this.b;
            aVar.x((-(1.0f - f10)) * aVar.f3861a);
            return;
        }
        if (i10 == 2) {
            a aVar2 = this.b;
            aVar2.y((-(1.0f - f10)) * aVar2.b);
        } else if (i10 == 4) {
            a aVar3 = this.b;
            aVar3.x((1.0f - f10) * aVar3.f3861a);
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
        int i11 = this.f3851a;
        if (i11 == 1) {
            i10 = this.f3852c.left;
            this.b.A(f(this.f3853d.left));
            if (g()) {
                insetsOf = Insets.of(f(i10), 0, 0, 0);
            }
        } else if (i11 == 2) {
            i10 = this.f3852c.top;
            this.b.v(f(this.f3853d.top));
            if (g()) {
                insetsOf = Insets.of(0, f(i10), 0, 0);
            }
        } else if (i11 == 4) {
            i10 = this.f3852c.right;
            this.b.A(f(this.f3853d.right));
            if (g()) {
                insetsOf = Insets.of(0, 0, f(i10), 0);
            }
        } else if (i11 != 8) {
            i10 = 0;
        } else {
            i10 = this.f3852c.bottom;
            this.b.v(f(this.f3853d.bottom));
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

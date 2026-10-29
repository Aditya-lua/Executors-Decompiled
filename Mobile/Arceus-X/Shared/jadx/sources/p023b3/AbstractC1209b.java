package p023b3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* JADX INFO: renamed from: b3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1209b {

    /* JADX INFO: renamed from: l */
    public static final Interpolator f5034l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: m */
    public static final Interpolator f5035m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n */
    public static final Interpolator f5036n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: o */
    public static final Interpolator f5037o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final int f5038a;

    /* JADX INFO: renamed from: b */
    public final a f5039b = new a();

    /* JADX INFO: renamed from: c */
    public Insets f5040c;

    /* JADX INFO: renamed from: d */
    public Insets f5041d;

    /* JADX INFO: renamed from: e */
    public float f5042e;

    /* JADX INFO: renamed from: f */
    public float f5043f;

    /* JADX INFO: renamed from: g */
    public float f5044g;

    /* JADX INFO: renamed from: h */
    public float f5045h;

    /* JADX INFO: renamed from: i */
    public Object f5046i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f5047j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f5048k;

    /* JADX INFO: renamed from: b3.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f5049a = -1;

        /* JADX INFO: renamed from: b */
        public int f5050b = -1;

        /* JADX INFO: renamed from: c */
        public Insets f5051c = Insets.NONE;

        /* JADX INFO: renamed from: d */
        public boolean f5052d = false;

        /* JADX INFO: renamed from: e */
        public Drawable f5053e = null;

        /* JADX INFO: renamed from: f */
        public float f5054f = 0.0f;

        /* JADX INFO: renamed from: g */
        public float f5055g = 0.0f;

        /* JADX INFO: renamed from: h */
        public float f5056h = 1.0f;

        /* JADX INFO: renamed from: i */
        public InterfaceC14090a f5057i;

        /* JADX INFO: renamed from: b3.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC14090a {
            /* JADX INFO: renamed from: a */
            default void mo6796a(int i10) {
            }

            /* JADX INFO: renamed from: b */
            default void mo6797b(boolean z10) {
            }

            /* JADX INFO: renamed from: c */
            default void mo6798c(Insets insets) {
            }

            /* JADX INFO: renamed from: d */
            default void mo6799d(float f10) {
            }

            /* JADX INFO: renamed from: e */
            default void mo6800e(int i10) {
            }

            /* JADX INFO: renamed from: f */
            default void mo6801f(float f10) {
            }

            /* JADX INFO: renamed from: g */
            default void mo6802g(float f10) {
            }

            /* JADX INFO: renamed from: h */
            default void mo6803h(Drawable drawable) {
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m6779A(int i10) {
            if (this.f5049a != i10) {
                this.f5049a = i10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6800e(i10);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public float m6780k() {
            return this.f5056h;
        }

        /* JADX INFO: renamed from: l */
        public Drawable m6781l() {
            return this.f5053e;
        }

        /* JADX INFO: renamed from: m */
        public int m6782m() {
            return this.f5050b;
        }

        /* JADX INFO: renamed from: n */
        public Insets m6783n() {
            return this.f5051c;
        }

        /* JADX INFO: renamed from: o */
        public float m6784o() {
            return this.f5054f;
        }

        /* JADX INFO: renamed from: p */
        public float m6785p() {
            return this.f5055g;
        }

        /* JADX INFO: renamed from: q */
        public int m6786q() {
            return this.f5049a;
        }

        /* JADX INFO: renamed from: r */
        public boolean m6787r() {
            return this.f5052d;
        }

        /* JADX INFO: renamed from: s */
        public final void m6788s(float f10) {
            if (this.f5056h != f10) {
                this.f5056h = f10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6799d(f10);
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m6789t(InterfaceC14090a interfaceC14090a) {
            if (this.f5057i != null && interfaceC14090a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.f5057i = interfaceC14090a;
        }

        /* JADX INFO: renamed from: u */
        public final void m6790u(Drawable drawable) {
            this.f5053e = drawable;
            InterfaceC14090a interfaceC14090a = this.f5057i;
            if (interfaceC14090a != null) {
                interfaceC14090a.mo6803h(drawable);
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m6791v(int i10) {
            if (this.f5050b != i10) {
                this.f5050b = i10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6796a(i10);
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m6792w(Insets insets) {
            if (this.f5051c.equals(insets)) {
                return;
            }
            this.f5051c = insets;
            InterfaceC14090a interfaceC14090a = this.f5057i;
            if (interfaceC14090a != null) {
                interfaceC14090a.mo6798c(insets);
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m6793x(float f10) {
            if (this.f5054f != f10) {
                this.f5054f = f10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6801f(f10);
                }
            }
        }

        /* JADX INFO: renamed from: y */
        public final void m6794y(float f10) {
            if (this.f5055g != f10) {
                this.f5055g = f10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6802g(f10);
                }
            }
        }

        /* JADX INFO: renamed from: z */
        public final void m6795z(boolean z10) {
            if (this.f5052d != z10) {
                this.f5052d = z10;
                InterfaceC14090a interfaceC14090a = this.f5057i;
                if (interfaceC14090a != null) {
                    interfaceC14090a.mo6797b(z10);
                }
            }
        }
    }

    public AbstractC1209b(int i10) {
        Insets insets = Insets.NONE;
        this.f5040c = insets;
        this.f5041d = insets;
        this.f5042e = 1.0f;
        this.f5043f = 1.0f;
        this.f5044g = 1.0f;
        this.f5045h = 1.0f;
        this.f5046i = null;
        this.f5047j = null;
        this.f5048k = null;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            this.f5038a = i10;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i10);
    }

    /* JADX INFO: renamed from: a */
    public void mo6752a(int i10) {
    }

    /* JADX INFO: renamed from: b */
    public Insets m6756b(Insets insets, Insets insets2, Insets insets3) {
        this.f5040c = insets;
        this.f5041d = insets2;
        this.f5039b.m6792w(insets3);
        return m6768o();
    }

    /* JADX INFO: renamed from: c */
    public a m6757c() {
        return this.f5039b;
    }

    /* JADX INFO: renamed from: d */
    public Object m6758d() {
        return this.f5046i;
    }

    /* JADX INFO: renamed from: e */
    public int m6759e() {
        return this.f5038a;
    }

    /* JADX INFO: renamed from: f */
    public int m6760f(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo6753g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m6761h(Object obj) {
        this.f5046i = obj;
    }

    /* JADX INFO: renamed from: i */
    public void m6762i(Drawable drawable) {
        this.f5039b.m6790u(drawable);
    }

    /* JADX INFO: renamed from: j */
    public void m6763j(float f10) {
        this.f5042e = f10;
        m6766m();
    }

    /* JADX INFO: renamed from: k */
    public void m6764k(float f10) {
        this.f5044g = f10;
        m6767n();
    }

    /* JADX INFO: renamed from: l */
    public void m6765l(boolean z10) {
        this.f5039b.m6795z(z10);
    }

    /* JADX INFO: renamed from: m */
    public final void m6766m() {
        this.f5039b.m6788s(this.f5042e * this.f5043f);
    }

    /* JADX INFO: renamed from: n */
    public final void m6767n() {
        float f10 = this.f5045h * this.f5044g;
        int i10 = this.f5038a;
        if (i10 == 1) {
            a aVar = this.f5039b;
            aVar.m6793x((-(1.0f - f10)) * aVar.f5049a);
            return;
        }
        if (i10 == 2) {
            a aVar2 = this.f5039b;
            aVar2.m6794y((-(1.0f - f10)) * aVar2.f5050b);
        } else if (i10 == 4) {
            a aVar3 = this.f5039b;
            aVar3.m6793x((1.0f - f10) * aVar3.f5049a);
        } else {
            if (i10 != 8) {
                return;
            }
            a aVar4 = this.f5039b;
            aVar4.m6794y((1.0f - f10) * aVar4.f5050b);
        }
    }

    /* JADX INFO: renamed from: o */
    public Insets m6768o() {
        int i10;
        Insets insetsM2661of = Insets.NONE;
        int i11 = this.f5038a;
        if (i11 == 1) {
            i10 = this.f5040c.left;
            this.f5039b.m6779A(m6760f(this.f5041d.left));
            if (mo6753g()) {
                insetsM2661of = Insets.m2661of(m6760f(i10), 0, 0, 0);
            }
        } else if (i11 == 2) {
            i10 = this.f5040c.top;
            this.f5039b.m6791v(m6760f(this.f5041d.top));
            if (mo6753g()) {
                insetsM2661of = Insets.m2661of(0, m6760f(i10), 0, 0);
            }
        } else if (i11 == 4) {
            i10 = this.f5040c.right;
            this.f5039b.m6779A(m6760f(this.f5041d.right));
            if (mo6753g()) {
                insetsM2661of = Insets.m2661of(0, 0, m6760f(i10), 0);
            }
        } else if (i11 != 8) {
            i10 = 0;
        } else {
            i10 = this.f5040c.bottom;
            this.f5039b.m6791v(m6760f(this.f5041d.bottom));
            if (mo6753g()) {
                insetsM2661of = Insets.m2661of(0, 0, 0, m6760f(i10));
            }
        }
        m6765l(i10 > 0);
        m6763j(i10 > 0 ? 1.0f : 0.0f);
        m6764k(i10 > 0 ? 1.0f : 0.0f);
        return insetsM2661of;
    }
}

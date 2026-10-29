package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1883a;

    public static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f1884a;
        public final i0 b;

        public a(Window window, i0 i0Var) {
            this.f1884a = window;
            this.b = i0Var;
        }

        @Override // androidx.core.view.l1.g
        public void a(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        @Override // androidx.core.view.l1.g
        public void e(int i10) {
            this.f1884a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                k(6144);
                return;
            }
            if (i10 == 1) {
                k(Barcode.FORMAT_AZTEC);
                h(Barcode.FORMAT_PDF417);
            } else {
                if (i10 != 2) {
                    return;
                }
                k(Barcode.FORMAT_PDF417);
                h(Barcode.FORMAT_AZTEC);
            }
        }

        @Override // androidx.core.view.l1.g
        public void f(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    j(i11);
                }
            }
        }

        public final void g(int i10) {
            if (i10 == 1) {
                h(4);
            } else if (i10 == 2) {
                h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.b.a();
            }
        }

        public void h(int i10) {
            View decorView = this.f1884a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void i(int i10) {
            this.f1884a.addFlags(i10);
        }

        public final void j(int i10) {
            if (i10 == 1) {
                k(4);
                l(Barcode.FORMAT_UPC_E);
            } else if (i10 == 2) {
                k(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.b.b();
            }
        }

        public void k(int i10) {
            View decorView = this.f1884a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void l(int i10) {
            this.f1884a.clearFlags(i10);
        }
    }

    public static class b extends a {
        public b(Window window, i0 i0Var) {
            super(window, i0Var);
        }

        @Override // androidx.core.view.l1.g
        public boolean b() {
            return (this.f1884a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.l1.g
        public void d(boolean z10) {
            if (!z10) {
                k(8192);
                return;
            }
            l(67108864);
            i(Integer.MIN_VALUE);
            h(8192);
        }
    }

    public static class c extends b {
        public c(Window window, i0 i0Var) {
            super(window, i0Var);
        }

        @Override // androidx.core.view.l1.g
        public void c(boolean z10) {
            if (!z10) {
                k(16);
                return;
            }
            l(134217728);
            i(Integer.MIN_VALUE);
            h(16);
        }
    }

    public static class e extends d {
        public e(Window window, l1 l1Var, i0 i0Var) {
            super(window, l1Var, i0Var);
        }

        @Override // androidx.core.view.l1.d, androidx.core.view.l1.g
        public void e(int i10) {
            this.b.setSystemBarsBehavior(i10);
        }

        public e(WindowInsetsController windowInsetsController, l1 l1Var, i0 i0Var) {
            super(windowInsetsController, l1Var, i0Var);
        }
    }

    public static class f extends e {
        public f(Window window, l1 l1Var, i0 i0Var) {
            super(window, l1Var, i0Var);
        }

        @Override // androidx.core.view.l1.d, androidx.core.view.l1.g
        public boolean b() {
            return (this.b.getSystemBarsAppearance() & 8) != 0;
        }

        public f(WindowInsetsController windowInsetsController, l1 l1Var, i0 i0Var) {
            super(windowInsetsController, l1Var, i0Var);
        }
    }

    public static class g {
        public void a(int i10) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e(int i10) {
            throw null;
        }

        public void f(int i10) {
            throw null;
        }
    }

    @Deprecated
    public l1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1883a = new f(windowInsetsController, this, new i0(windowInsetsController));
        } else {
            this.f1883a = new d(windowInsetsController, this, new i0(windowInsetsController));
        }
    }

    @Deprecated
    public static l1 g(WindowInsetsController windowInsetsController) {
        return new l1(windowInsetsController);
    }

    public void a(int i10) {
        this.f1883a.a(i10);
    }

    public boolean b() {
        return this.f1883a.b();
    }

    public void c(boolean z10) {
        this.f1883a.c(z10);
    }

    public void d(boolean z10) {
        this.f1883a.d(z10);
    }

    public void e(int i10) {
        this.f1883a.e(i10);
    }

    public void f(int i10) {
        this.f1883a.f(i10);
    }

    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l1 f1885a;
        public final WindowInsetsController b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i0 f1886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w1.j<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Window f1888e;

        public d(Window window, l1 l1Var, i0 i0Var) {
            this(window.getInsetsController(), l1Var, i0Var);
            this.f1888e = window;
        }

        @Override // androidx.core.view.l1.g
        public void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f1886c.a();
            }
            this.b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.l1.g
        public boolean b() {
            this.b.setSystemBarsAppearance(0, 0);
            return (this.b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.l1.g
        public void c(boolean z10) {
            if (z10) {
                if (this.f1888e != null) {
                    g(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f1888e != null) {
                    h(16);
                }
                this.b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.l1.g
        public void d(boolean z10) {
            if (z10) {
                if (this.f1888e != null) {
                    g(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f1888e != null) {
                    h(8192);
                }
                this.b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.l1.g
        public void e(int i10) {
            Window window = this.f1888e;
            if (window == null) {
                this.b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                h(6144);
                return;
            }
            if (i10 == 1) {
                h(Barcode.FORMAT_AZTEC);
                g(Barcode.FORMAT_PDF417);
            } else {
                if (i10 != 2) {
                    return;
                }
                h(Barcode.FORMAT_PDF417);
                g(Barcode.FORMAT_AZTEC);
            }
        }

        @Override // androidx.core.view.l1.g
        public void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f1886c.b();
            }
            this.b.show(i10 & (-9));
        }

        public void g(int i10) {
            View decorView = this.f1888e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void h(int i10) {
            View decorView = this.f1888e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, l1 l1Var, i0 i0Var) {
            this.f1887d = new w1.j<>();
            this.b = windowInsetsController;
            this.f1885a = l1Var;
            this.f1886c = i0Var;
        }
    }

    public l1(Window window, View view) {
        i0 i0Var = new i0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f1883a = new f(window, this, i0Var);
        } else if (i10 >= 30) {
            this.f1883a = new d(window, this, i0Var);
        } else {
            this.f1883a = new c(window, i0Var);
        }
    }
}

package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p504w1.C12286j;

/* JADX INFO: renamed from: androidx.core.view.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0619l1 {

    /* JADX INFO: renamed from: a */
    public final g f2440a;

    /* JADX INFO: renamed from: androidx.core.view.l1$a */
    public static class a extends g {

        /* JADX INFO: renamed from: a */
        public final Window f2441a;

        /* JADX INFO: renamed from: b */
        public final C0607i0 f2442b;

        public a(Window window, C0607i0 c0607i0) {
            this.f2441a = window;
            this.f2442b = c0607i0;
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: a */
        public void mo2953a(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    m2956g(i11);
                }
            }
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: e */
        public void mo2954e(int i10) {
            this.f2441a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                m2960k(6144);
                return;
            }
            if (i10 == 1) {
                m2960k(4096);
                m2957h(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                m2960k(2048);
                m2957h(4096);
            }
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: f */
        public void mo2955f(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    m2959j(i11);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m2956g(int i10) {
            if (i10 == 1) {
                m2957h(4);
            } else if (i10 == 2) {
                m2957h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f2442b.m2909a();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m2957h(int i10) {
            View decorView = this.f2441a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: i */
        public void m2958i(int i10) {
            this.f2441a.addFlags(i10);
        }

        /* JADX INFO: renamed from: j */
        public final void m2959j(int i10) {
            if (i10 == 1) {
                m2960k(4);
                m2961l(1024);
            } else if (i10 == 2) {
                m2960k(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f2442b.m2910b();
            }
        }

        /* JADX INFO: renamed from: k */
        public void m2960k(int i10) {
            View decorView = this.f2441a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: l */
        public void m2961l(int i10) {
            this.f2441a.clearFlags(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$b */
    public static class b extends a {
        public b(Window window, C0607i0 c0607i0) {
            super(window, c0607i0);
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: b */
        public boolean mo2962b() {
            return (this.f2441a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: d */
        public void mo2963d(boolean z10) {
            if (!z10) {
                m2960k(8192);
                return;
            }
            m2961l(67108864);
            m2958i(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            m2957h(8192);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$c */
    public static class c extends b {
        public c(Window window, C0607i0 c0607i0) {
            super(window, c0607i0);
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: c */
        public void mo2964c(boolean z10) {
            if (!z10) {
                m2960k(16);
                return;
            }
            m2961l(134217728);
            m2958i(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            m2957h(16);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$e */
    public static class e extends d {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(Window window, C0619l1 c0619l1, C0607i0 c0607i0) {
            super(window, c0619l1, c0607i0);
        }

        @Override // androidx.core.view.C0619l1.d, androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: e */
        public void mo2954e(int i10) {
            this.f2444b.setSystemBarsBehavior(i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e(WindowInsetsController windowInsetsController, C0619l1 c0619l1, C0607i0 c0607i0) {
            super(windowInsetsController, c0619l1, c0607i0);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$f */
    public static class f extends e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f(Window window, C0619l1 c0619l1, C0607i0 c0607i0) {
            super(window, c0619l1, c0607i0);
        }

        @Override // androidx.core.view.C0619l1.d, androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: b */
        public boolean mo2962b() {
            return (this.f2444b.getSystemBarsAppearance() & 8) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public f(WindowInsetsController windowInsetsController, C0619l1 c0619l1, C0607i0 c0607i0) {
            super(windowInsetsController, c0619l1, c0607i0);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public void mo2953a(int i10) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo2962b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo2964c(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo2963d(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public void mo2954e(int i10) {
            throw null;
        }

        /* JADX INFO: renamed from: f */
        public void mo2955f(int i10) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C0619l1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2440a = new f(windowInsetsController, this, new C0607i0(windowInsetsController));
        } else {
            this.f2440a = new d(windowInsetsController, this, new C0607i0(windowInsetsController));
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static C0619l1 m2946g(WindowInsetsController windowInsetsController) {
        return new C0619l1(windowInsetsController);
    }

    /* JADX INFO: renamed from: a */
    public void m2947a(int i10) {
        this.f2440a.mo2953a(i10);
    }

    /* JADX INFO: renamed from: b */
    public boolean m2948b() {
        return this.f2440a.mo2962b();
    }

    /* JADX INFO: renamed from: c */
    public void m2949c(boolean z10) {
        this.f2440a.mo2964c(z10);
    }

    /* JADX INFO: renamed from: d */
    public void m2950d(boolean z10) {
        this.f2440a.mo2963d(z10);
    }

    /* JADX INFO: renamed from: e */
    public void m2951e(int i10) {
        this.f2440a.mo2954e(i10);
    }

    /* JADX INFO: renamed from: f */
    public void m2952f(int i10) {
        this.f2440a.mo2955f(i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.l1$d */
    public static class d extends g {

        /* JADX INFO: renamed from: a */
        public final C0619l1 f2443a;

        /* JADX INFO: renamed from: b */
        public final WindowInsetsController f2444b;

        /* JADX INFO: renamed from: c */
        public final C0607i0 f2445c;

        /* JADX INFO: renamed from: d */
        public final C12286j<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2446d;

        /* JADX INFO: renamed from: e */
        public Window f2447e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(Window window, C0619l1 c0619l1, C0607i0 c0607i0) {
            this(window.getInsetsController(), c0619l1, c0607i0);
            this.f2447e = window;
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: a */
        public void mo2953a(int i10) {
            if ((i10 & 8) != 0) {
                this.f2445c.m2909a();
            }
            this.f2444b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: b */
        public boolean mo2962b() {
            this.f2444b.setSystemBarsAppearance(0, 0);
            return (this.f2444b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: c */
        public void mo2964c(boolean z10) {
            if (z10) {
                if (this.f2447e != null) {
                    m2965g(16);
                }
                this.f2444b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2447e != null) {
                    m2966h(16);
                }
                this.f2444b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: d */
        public void mo2963d(boolean z10) {
            if (z10) {
                if (this.f2447e != null) {
                    m2965g(8192);
                }
                this.f2444b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2447e != null) {
                    m2966h(8192);
                }
                this.f2444b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: e */
        public void mo2954e(int i10) {
            Window window = this.f2447e;
            if (window == null) {
                this.f2444b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                m2966h(6144);
                return;
            }
            if (i10 == 1) {
                m2966h(4096);
                m2965g(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                m2966h(2048);
                m2965g(4096);
            }
        }

        @Override // androidx.core.view.C0619l1.g
        /* JADX INFO: renamed from: f */
        public void mo2955f(int i10) {
            if ((i10 & 8) != 0) {
                this.f2445c.m2910b();
            }
            this.f2444b.show(i10 & (-9));
        }

        /* JADX INFO: renamed from: g */
        public void m2965g(int i10) {
            View decorView = this.f2447e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: h */
        public void m2966h(int i10) {
            View decorView = this.f2447e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, C0619l1 c0619l1, C0607i0 c0607i0) {
            this.f2446d = new C12286j<>();
            this.f2444b = windowInsetsController;
            this.f2443a = c0619l1;
            this.f2445c = c0607i0;
        }
    }

    public C0619l1(Window window, View view) {
        C0607i0 c0607i0 = new C0607i0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f2440a = new f(window, this, c0607i0);
        } else if (i10 >= 30) {
            this.f2440a = new d(window, this, c0607i0);
        } else {
            this.f2440a = new c(window, c0607i0);
        }
    }
}

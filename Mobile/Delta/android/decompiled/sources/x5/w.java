package x5;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f35009a = new Object();
    public static volatile w b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35010c = 20;

    public static class a extends w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35011d;

        public a(int i10) {
            super(i10);
            this.f35011d = i10;
        }

        @Override // x5.w
        public void a(String str, String str2) {
            if (this.f35011d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // x5.w
        public void b(String str, String str2, Throwable th2) {
            if (this.f35011d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // x5.w
        public void c(String str, String str2) {
            if (this.f35011d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // x5.w
        public void d(String str, String str2, Throwable th2) {
            if (this.f35011d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // x5.w
        public void f(String str, String str2) {
            if (this.f35011d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // x5.w
        public void g(String str, String str2, Throwable th2) {
            if (this.f35011d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // x5.w
        public void j(String str, String str2) {
            if (this.f35011d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // x5.w
        public void k(String str, String str2) {
            if (this.f35011d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // x5.w
        public void l(String str, String str2, Throwable th2) {
            if (this.f35011d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public w(int i10) {
    }

    public static w e() {
        w wVar;
        synchronized (f35009a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                wVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public static void h(w wVar) {
        synchronized (f35009a) {
            try {
                if (b == null) {
                    b = wVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f35010c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}

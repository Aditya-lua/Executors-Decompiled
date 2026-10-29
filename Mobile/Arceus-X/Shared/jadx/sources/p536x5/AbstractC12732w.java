package p536x5;

import android.util.Log;

/* JADX INFO: renamed from: x5.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12732w {

    /* JADX INFO: renamed from: a */
    public static final Object f45336a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile AbstractC12732w f45337b = null;

    /* JADX INFO: renamed from: c */
    public static final int f45338c = 20;

    /* JADX INFO: renamed from: x5.w$a */
    public static class a extends AbstractC12732w {

        /* JADX INFO: renamed from: d */
        public final int f45339d;

        public a(int i10) {
            super(i10);
            this.f45339d = i10;
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: a */
        public void mo47444a(String str, String str2) {
            if (this.f45339d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: b */
        public void mo47445b(String str, String str2, Throwable th2) {
            if (this.f45339d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: c */
        public void mo47446c(String str, String str2) {
            if (this.f45339d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: d */
        public void mo47447d(String str, String str2, Throwable th2) {
            if (this.f45339d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: f */
        public void mo47448f(String str, String str2) {
            if (this.f45339d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: g */
        public void mo47449g(String str, String str2, Throwable th2) {
            if (this.f45339d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: j */
        public void mo47450j(String str, String str2) {
            if (this.f45339d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: k */
        public void mo47451k(String str, String str2) {
            if (this.f45339d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // p536x5.AbstractC12732w
        /* JADX INFO: renamed from: l */
        public void mo47452l(String str, String str2, Throwable th2) {
            if (this.f45339d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public AbstractC12732w(int i10) {
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC12732w m47441e() {
        AbstractC12732w abstractC12732w;
        synchronized (f45336a) {
            try {
                if (f45337b == null) {
                    f45337b = new a(3);
                }
                abstractC12732w = f45337b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC12732w;
    }

    /* JADX INFO: renamed from: h */
    public static void m47442h(AbstractC12732w abstractC12732w) {
        synchronized (f45336a) {
            try {
                if (f45337b == null) {
                    f45337b = abstractC12732w;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m47443i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f45338c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo47444a(String str, String str2);

    /* JADX INFO: renamed from: b */
    public abstract void mo47445b(String str, String str2, Throwable th2);

    /* JADX INFO: renamed from: c */
    public abstract void mo47446c(String str, String str2);

    /* JADX INFO: renamed from: d */
    public abstract void mo47447d(String str, String str2, Throwable th2);

    /* JADX INFO: renamed from: f */
    public abstract void mo47448f(String str, String str2);

    /* JADX INFO: renamed from: g */
    public abstract void mo47449g(String str, String str2, Throwable th2);

    /* JADX INFO: renamed from: j */
    public abstract void mo47450j(String str, String str2);

    /* JADX INFO: renamed from: k */
    public abstract void mo47451k(String str, String str2);

    /* JADX INFO: renamed from: l */
    public abstract void mo47452l(String str, String str2, Throwable th2);
}

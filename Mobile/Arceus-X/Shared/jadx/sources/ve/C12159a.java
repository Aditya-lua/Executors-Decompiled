package ve;

import af.C0222h0;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p076df.C4594p;
import pe.C10213b;
import pe.C10226h0;
import pe.C10229j;
import pe.C10234o;
import pe.C10235p;
import pe.C10236q;
import pe.C10241v;
import pe.InterfaceC10211a;
import pe.InterfaceC10238s;

/* JADX INFO: renamed from: ve.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12159a {

    /* JADX INFO: renamed from: d */
    public static final Object f42775d = new Object();

    /* JADX INFO: renamed from: e */
    public static final String f42776e = "a";

    /* JADX INFO: renamed from: a */
    public final InterfaceC10238s f42777a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10211a f42778b;

    /* JADX INFO: renamed from: c */
    public C10236q f42779c;

    /* JADX INFO: renamed from: ve.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Context f42780a = null;

        /* JADX INFO: renamed from: b */
        public String f42781b = null;

        /* JADX INFO: renamed from: c */
        public String f42782c = null;

        /* JADX INFO: renamed from: d */
        public String f42783d = null;

        /* JADX INFO: renamed from: e */
        public InterfaceC10211a f42784e = null;

        /* JADX INFO: renamed from: f */
        public boolean f42785f = true;

        /* JADX INFO: renamed from: g */
        public C10234o f42786g = null;

        /* JADX INFO: renamed from: h */
        public C0222h0 f42787h = null;

        /* JADX INFO: renamed from: i */
        public C10236q f42788i;

        /* JADX INFO: renamed from: h */
        public static byte[] m44995h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return C4594p.m22709a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        /* JADX INFO: renamed from: f */
        public synchronized C12159a m44996f() {
            C12159a c12159a;
            try {
                if (this.f42781b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                C0222h0 c0222h0 = this.f42787h;
                if (c0222h0 != null && this.f42786g == null) {
                    this.f42786g = C10234o.m39339a(C10226h0.m39315a(c0222h0.m13375n()));
                }
                synchronized (C12159a.f42775d) {
                    try {
                        byte[] bArrM44995h = m44995h(this.f42780a, this.f42781b, this.f42782c);
                        if (bArrM44995h == null) {
                            if (this.f42783d != null) {
                                this.f42784e = m45000k();
                            }
                            this.f42788i = m44997g();
                        } else if (this.f42783d == null || !C12159a.m44987f()) {
                            this.f42788i = m44998i(bArrM44995h);
                        } else {
                            this.f42788i = m44999j(bArrM44995h);
                        }
                        c12159a = new C12159a(this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return c12159a;
        }

        /* JADX INFO: renamed from: g */
        public final C10236q m44997g() throws GeneralSecurityException {
            C10234o c10234o = this.f42786g;
            if (c10234o == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            C10235p c10235pM39355k = C10235p.m39355k(c10234o);
            C12159a.m44988g(c10235pM39355k, new C12163e(this.f42780a, this.f42781b, this.f42782c), this.f42784e);
            return C10236q.m39395b(c10235pM39355k);
        }

        /* JADX INFO: renamed from: i */
        public final C10236q m44998i(byte[] bArr) {
            return C10236q.m39395b(C10241v.m39401b(C10213b.m39296b(bArr), C10229j.m39322a()));
        }

        /* JADX INFO: renamed from: j */
        public final C10236q m44999j(byte[] bArr) {
            try {
                this.f42784e = new C12162d().mo39398b(this.f42783d);
                try {
                    return C10236q.m39395b(C10241v.m39400a(C10213b.m39296b(bArr), this.f42784e, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return m44998i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    C10236q c10236qM44998i = m44998i(bArr);
                    Log.w(C12159a.f42776e, "cannot use Android Keystore, it'll be disabled", e11);
                    return c10236qM44998i;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public final InterfaceC10211a m45000k() throws KeyStoreException {
            if (!C12159a.m44987f()) {
                Log.w(C12159a.f42776e, "Android Keystore requires at least Android M");
                return null;
            }
            C12162d c12162d = new C12162d();
            try {
                boolean zM45012d = C12162d.m45012d(this.f42783d);
                try {
                    return c12162d.mo39398b(this.f42783d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zM45012d) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f42783d), e10);
                    }
                    Log.w(C12159a.f42776e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(C12159a.f42776e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        /* JADX INFO: renamed from: l */
        public b m45001l(C10234o c10234o) {
            this.f42786g = c10234o;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public b m45002m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f42785f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f42783d = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public b m45003n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f42780a = context;
            this.f42781b = str;
            this.f42782c = str2;
            return this;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m44987f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m44988g(C10235p c10235p, InterfaceC10238s interfaceC10238s, InterfaceC10211a interfaceC10211a) throws GeneralSecurityException {
        try {
            if (interfaceC10211a != null) {
                C10241v.m39402c(c10235p, interfaceC10238s, interfaceC10211a, new byte[0]);
            } else {
                C10241v.m39403d(c10235p, interfaceC10238s, C10229j.m39322a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized C10235p m44989e() {
        return this.f42779c.m39396a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12159a(b bVar) {
        this.f42777a = new C12163e(bVar.f42780a, bVar.f42781b, bVar.f42782c);
        this.f42778b = bVar.f42784e;
        this.f42779c = bVar.f42788i;
    }
}

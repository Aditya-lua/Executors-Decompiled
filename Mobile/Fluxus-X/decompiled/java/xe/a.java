package xe;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import cf.h0;
import ff.p;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import re.j;
import re.o;
import re.q;
import re.s;
import re.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f36649d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f36650e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f36651a;
    public final re.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f36652c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f36653a = null;
        public String b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f36654c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f36655d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public re.a f36656e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36657f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f36658g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h0 f36659h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f36660i;

        public static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return p.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                h0 h0Var = this.f36659h;
                if (h0Var != null && this.f36658g == null) {
                    this.f36658g = o.a(re.h0.a(h0Var.n()));
                }
                synchronized (a.f36649d) {
                    try {
                        byte[] bArrH = h(this.f36653a, this.b, this.f36654c);
                        if (bArrH == null) {
                            if (this.f36655d != null) {
                                this.f36656e = k();
                            }
                            this.f36660i = g();
                        } else if (this.f36655d == null || !a.f()) {
                            this.f36660i = i(bArrH);
                        } else {
                            this.f36660i = j(bArrH);
                        }
                        aVar = new a(this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return aVar;
        }

        public final q g() throws GeneralSecurityException {
            o oVar = this.f36658g;
            if (oVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            re.p pVarK = re.p.k(oVar);
            a.g(pVarK, new e(this.f36653a, this.b, this.f36654c), this.f36656e);
            return q.b(pVarK);
        }

        public final q i(byte[] bArr) {
            return q.b(v.b(re.b.b(bArr), j.a()));
        }

        public final q j(byte[] bArr) {
            try {
                this.f36656e = new d().b(this.f36655d);
                try {
                    return q.b(v.a(re.b.b(bArr), this.f36656e, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    q qVarI = i(bArr);
                    Log.w(a.f36650e, "cannot use Android Keystore, it'll be disabled", e11);
                    return qVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final re.a k() throws KeyStoreException {
            if (!a.f()) {
                Log.w(a.f36650e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean zD = d.d(this.f36655d);
                try {
                    return dVar.b(this.f36655d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f36655d), e10);
                    }
                    Log.w(a.f36650e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f36650e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(o oVar) {
            this.f36658g = oVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f36657f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f36655d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f36653a = context;
            this.b = str;
            this.f36654c = str2;
            return this;
        }
    }

    public static boolean f() {
        return true;
    }

    public static void g(re.p pVar, s sVar, re.a aVar) throws GeneralSecurityException {
        try {
            if (aVar != null) {
                v.c(pVar, sVar, aVar, new byte[0]);
            } else {
                v.d(pVar, sVar, j.a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public synchronized re.p e() {
        return this.f36652c.a();
    }

    public a(b bVar) {
        this.f36651a = new e(bVar.f36653a, bVar.b, bVar.f36654c);
        this.b = bVar.f36656e;
        this.f36652c = bVar.f36660i;
    }
}

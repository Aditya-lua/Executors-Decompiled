package ue;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import cf.p;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import oe.j;
import oe.o;
import oe.q;
import oe.s;
import oe.v;
import ze.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f32117d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32118e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f32119a;
    public final oe.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f32120c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f32121a = null;
        public String b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f32122c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32123d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public oe.a f32124e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f32125f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f32126g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h0 f32127h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f32128i;

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
                h0 h0Var = this.f32127h;
                if (h0Var != null && this.f32126g == null) {
                    this.f32126g = o.a(oe.h0.a(h0Var.n()));
                }
                synchronized (a.f32117d) {
                    try {
                        byte[] bArrH = h(this.f32121a, this.b, this.f32122c);
                        if (bArrH == null) {
                            if (this.f32123d != null) {
                                this.f32124e = k();
                            }
                            this.f32128i = g();
                        } else if (this.f32123d == null || !a.f()) {
                            this.f32128i = i(bArrH);
                        } else {
                            this.f32128i = j(bArrH);
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
            o oVar = this.f32126g;
            if (oVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            oe.p pVarK = oe.p.k(oVar);
            a.g(pVarK, new e(this.f32121a, this.b, this.f32122c), this.f32124e);
            return q.b(pVarK);
        }

        public final q i(byte[] bArr) {
            return q.b(v.b(oe.b.b(bArr), j.a()));
        }

        public final q j(byte[] bArr) {
            try {
                this.f32124e = new d().b(this.f32123d);
                try {
                    return q.b(v.a(oe.b.b(bArr), this.f32124e, new byte[0]));
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
                    Log.w(a.f32118e, "cannot use Android Keystore, it'll be disabled", e11);
                    return qVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final oe.a k() throws KeyStoreException {
            if (!a.f()) {
                Log.w(a.f32118e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean zD = d.d(this.f32123d);
                try {
                    return dVar.b(this.f32123d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f32123d), e10);
                    }
                    Log.w(a.f32118e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f32118e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(o oVar) {
            this.f32126g = oVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f32125f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f32123d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f32121a = context;
            this.b = str;
            this.f32122c = str2;
            return this;
        }
    }

    public static boolean f() {
        return true;
    }

    public static void g(oe.p pVar, s sVar, oe.a aVar) throws GeneralSecurityException {
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

    public synchronized oe.p e() {
        return this.f32120c.a();
    }

    public a(b bVar) {
        this.f32119a = new e(bVar.f32121a, bVar.b, bVar.f32122c);
        this.b = bVar.f32124e;
        this.f32120c = bVar.f32128i;
    }
}

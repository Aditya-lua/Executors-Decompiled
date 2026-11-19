package xe;

import ff.a0;
import ff.u;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import re.t;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements t {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36663a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36664a = null;

        public a() {
            if (!d.e()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    public d() {
        this(new a());
    }

    public static boolean d(String str) {
        synchronized (b) {
            try {
                String strB = a0.b("android-keystore://", str);
                if (b.e(strB)) {
                    return false;
                }
                b.a(strB);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean e() {
        return true;
    }

    public static re.a f(re.a aVar) throws KeyStoreException {
        byte[] bArrA = u.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrA, aVar.b(aVar.a(bArrA, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // re.t
    public boolean a(String str) {
        String str2 = this.f36663a;
        if (str2 == null || !str2.equals(str)) {
            return this.f36663a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // re.t
    public re.a b(String str) throws GeneralSecurityException {
        re.a aVarF;
        String str2 = this.f36663a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f36663a, str));
        }
        try {
            synchronized (b) {
                aVarF = f(new c(a0.b("android-keystore://", str)));
            }
            return aVarF;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public d(a aVar) {
        this.f36663a = aVar.f36664a;
    }
}

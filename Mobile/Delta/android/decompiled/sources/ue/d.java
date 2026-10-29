package ue;

import cf.a0;
import cf.u;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import oe.t;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements t {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32131a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32132a = null;

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

    public static oe.a f(oe.a aVar) throws KeyStoreException {
        byte[] bArrA = u.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrA, aVar.b(aVar.a(bArrA, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // oe.t
    public boolean a(String str) {
        String str2 = this.f32131a;
        if (str2 == null || !str2.equals(str)) {
            return this.f32131a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // oe.t
    public oe.a b(String str) throws GeneralSecurityException {
        oe.a aVarF;
        String str2 = this.f32131a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f32131a, str));
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
        this.f32131a = aVar.f32132a;
    }
}

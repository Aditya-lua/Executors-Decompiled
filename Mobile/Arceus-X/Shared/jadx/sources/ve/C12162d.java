package ve;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import p076df.C4578a0;
import p076df.C4599u;
import pe.InterfaceC10211a;
import pe.InterfaceC10239t;

/* JADX INFO: renamed from: ve.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C12162d implements InterfaceC10239t {

    /* JADX INFO: renamed from: b */
    public static final Object f42792b = new Object();

    /* JADX INFO: renamed from: a */
    public final String f42793a;

    /* JADX INFO: renamed from: ve.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f42794a = null;

        public a() {
            if (!C12162d.m45013e()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12162d() {
        this(new a());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m45012d(String str) {
        synchronized (f42792b) {
            try {
                String strM22638b = C4578a0.m22638b("android-keystore://", str);
                if (C12160b.m45008e(strM22638b)) {
                    return false;
                }
                C12160b.m45004a(strM22638b);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m45013e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC10211a m45014f(InterfaceC10211a interfaceC10211a) throws KeyStoreException {
        byte[] bArrM22724a = C4599u.m22724a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrM22724a, interfaceC10211a.mo22646b(interfaceC10211a.mo22645a(bArrM22724a, bArr), bArr))) {
            return interfaceC10211a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // pe.InterfaceC10239t
    /* JADX INFO: renamed from: a */
    public boolean mo39397a(String str) {
        String str2 = this.f42793a;
        if (str2 == null || !str2.equals(str)) {
            return this.f42793a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // pe.InterfaceC10239t
    /* JADX INFO: renamed from: b */
    public InterfaceC10211a mo39398b(String str) throws GeneralSecurityException {
        InterfaceC10211a interfaceC10211aM45014f;
        String str2 = this.f42793a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f42793a, str));
        }
        try {
            synchronized (f42792b) {
                interfaceC10211aM45014f = m45014f(new C12161c(C4578a0.m22638b("android-keystore://", str)));
            }
            return interfaceC10211aM45014f;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12162d(a aVar) {
        this.f42793a = aVar.f42794a;
    }
}

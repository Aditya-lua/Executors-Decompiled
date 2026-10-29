package ve;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: ve.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C12161c implements InterfaceC10211a {

    /* JADX INFO: renamed from: b */
    public static final String f42790b = "c";

    /* JADX INFO: renamed from: a */
    public final InterfaceC10211a f42791a;

    public C12161c(String str) {
        this.f42791a = C12160b.m45006c(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m45010c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) {
        try {
            return this.f42791a.mo22645a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f42790b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            m45010c();
            return this.f42791a.mo22645a(bArr, bArr2);
        }
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        try {
            return this.f42791a.mo22646b(bArr, bArr2);
        } catch (GeneralSecurityException e10) {
            e = e10;
            Log.w(f42790b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m45010c();
            return this.f42791a.mo22646b(bArr, bArr2);
        } catch (ProviderException e11) {
            e = e11;
            Log.w(f42790b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m45010c();
            return this.f42791a.mo22646b(bArr, bArr2);
        } catch (BadPaddingException e12) {
            throw e12;
        }
    }
}

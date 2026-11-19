package xe;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements re.a {
    public static final String b = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.a f36662a;

    public c(String str) {
        this.f36662a = b.c(str);
    }

    public static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // re.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return this.f36662a.a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            c();
            return this.f36662a.a(bArr, bArr2);
        }
    }

    @Override // re.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        try {
            return this.f36662a.b(bArr, bArr2);
        } catch (GeneralSecurityException e10) {
            e = e10;
            Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f36662a.b(bArr, bArr2);
        } catch (ProviderException e11) {
            e = e11;
            Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f36662a.b(bArr, bArr2);
        } catch (BadPaddingException e12) {
            throw e12;
        }
    }
}

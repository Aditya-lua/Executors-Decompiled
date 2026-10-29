package ae;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends d1 {
    public final byte[] b;

    public c1(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.b;
    }
}

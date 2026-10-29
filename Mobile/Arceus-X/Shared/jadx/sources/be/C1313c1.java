package be;

import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: be.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1313c1 extends C1316d1 {

    /* JADX INFO: renamed from: b */
    public final byte[] f5348b;

    public C1313c1(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f5348b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f5348b;
    }
}

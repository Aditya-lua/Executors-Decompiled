package af;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements ze.g {
    public static final we.b.EnumC0736b b = we.b.EnumC0736b.f35740a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ze.a f418a;

    public g(ze.a aVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f418a = aVar;
    }
}

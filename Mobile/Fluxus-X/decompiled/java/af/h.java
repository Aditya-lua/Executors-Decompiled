package af;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements ze.g {
    public static final we.b.EnumC0736b b = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ze.i f419a;

    public h(ze.i iVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f419a = iVar;
    }
}

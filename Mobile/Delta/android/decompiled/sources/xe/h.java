package xe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements we.g {
    public static final te.b.EnumC0569b b = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we.i f35169a;

    public h(we.i iVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f35169a = iVar;
    }
}

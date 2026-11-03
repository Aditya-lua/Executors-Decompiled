package ye;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements xe.g {
    public static final ue.b.EnumC0590b b = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe.i f36679a;

    public h(xe.i iVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f36679a = iVar;
    }
}

package ye;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements xe.g {
    public static final ue.b.EnumC0590b b = ue.b.EnumC0590b.f32770a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe.a f36678a;

    public g(xe.a aVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f36678a = aVar;
    }
}

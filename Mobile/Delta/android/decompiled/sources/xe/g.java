package xe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements we.g {
    public static final te.b.EnumC0569b b = te.b.EnumC0569b.f31710a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we.a f35168a;

    public g(we.a aVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f35168a = aVar;
    }
}

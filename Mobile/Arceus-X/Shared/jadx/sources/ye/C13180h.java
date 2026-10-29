package ye;

import java.security.GeneralSecurityException;
import p465ue.C11844b;
import p544xe.C12811i;
import p544xe.InterfaceC12809g;

/* JADX INFO: renamed from: ye.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C13180h implements InterfaceC12809g {

    /* JADX INFO: renamed from: b */
    public static final C11844b.b f46442b = C11844b.b.f41602b;

    /* JADX INFO: renamed from: a */
    public final C12811i f46443a;

    public C13180h(C12811i c12811i) throws GeneralSecurityException {
        if (!f46442b.mo44243a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f46443a = c12811i;
    }
}

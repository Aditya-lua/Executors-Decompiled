package ye;

import java.security.GeneralSecurityException;
import p465ue.C11844b;
import p544xe.C12803a;
import p544xe.InterfaceC12809g;

/* JADX INFO: renamed from: ye.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C13179g implements InterfaceC12809g {

    /* JADX INFO: renamed from: b */
    public static final C11844b.b f46440b = C11844b.b.f41601a;

    /* JADX INFO: renamed from: a */
    public final C12803a f46441a;

    public C13179g(C12803a c12803a) throws GeneralSecurityException {
        if (!f46440b.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f46441a = c12803a;
    }
}

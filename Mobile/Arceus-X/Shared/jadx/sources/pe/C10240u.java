package pe;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: pe.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C10240u {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList<InterfaceC10239t> f36860a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public static InterfaceC10239t m39399a(String str) throws GeneralSecurityException {
        for (InterfaceC10239t interfaceC10239t : f36860a) {
            if (interfaceC10239t.mo39397a(str)) {
                return interfaceC10239t;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}

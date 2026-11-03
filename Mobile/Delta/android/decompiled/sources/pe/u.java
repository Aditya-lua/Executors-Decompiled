package pe;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<t> f28697a = new CopyOnWriteArrayList<>();

    public static t a(String str) throws GeneralSecurityException {
        for (t tVar : f28697a) {
            if (tVar.a(str)) {
                return tVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}

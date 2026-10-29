package p515we;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

/* JADX INFO: renamed from: we.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C12361c {

    /* JADX INFO: renamed from: a */
    public static final String[] f44217a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    /* JADX INFO: renamed from: a */
    public static Provider m46233a() {
        for (String str : f44217a) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Provider m46234b() {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}

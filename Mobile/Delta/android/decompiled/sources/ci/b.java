package ci;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import vu.b0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, byte[]> f4980a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4981a = new b();
    }

    public static b b() {
        return a.f4981a;
    }

    public synchronized byte[] a(Context context, String str) {
        if (this.f4980a.containsKey(str)) {
            return this.f4980a.get(str);
        }
        String str2 = "android/shared_compression_dictionaries/" + str + ".dict";
        if (rh.h.a().h1()) {
            ek.d.a(str2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                vu.g gVarC = b0.c(b0.j(inputStreamOpen));
                try {
                    byte[] bArrX1 = gVarC.X1();
                    this.f4980a.put(str, bArrX1);
                    gVarC.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return bArrX1;
                } catch (Throwable th2) {
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e10) {
            ek.q.f("DictionaryManager", "Error reading dictionary " + str, e10);
            return null;
        }
    }

    public synchronized void c() {
        this.f4980a.clear();
    }
}

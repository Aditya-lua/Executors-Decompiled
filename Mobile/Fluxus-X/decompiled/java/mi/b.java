package mi;

import android.content.Context;
import ew.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, byte[]> f23254a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23255a = new b();
    }

    public static b b() {
        return a.f23255a;
    }

    public synchronized byte[] a(Context context, String str) {
        if (this.f23254a.containsKey(str)) {
            return this.f23254a.get(str);
        }
        String str2 = "android/shared_compression_dictionaries/" + str + ".dict";
        if (bi.h.a().h1()) {
            ok.d.a(str2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                ew.g gVarC = v.c(v.j(inputStreamOpen));
                try {
                    byte[] bArrA2 = gVarC.a2();
                    this.f23254a.put(str, bArrA2);
                    gVarC.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return bArrA2;
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
            ok.q.f("DictionaryManager", "Error reading dictionary " + str, e10);
            return null;
        }
    }

    public synchronized void c() {
        this.f23254a.clear();
    }
}

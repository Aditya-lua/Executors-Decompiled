package ei;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import xu.b0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, byte[]> f15568a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15569a = new b();
    }

    public static b b() {
        return a.f15569a;
    }

    public synchronized byte[] a(Context context, String str) {
        if (this.f15568a.containsKey(str)) {
            return this.f15568a.get(str);
        }
        String str2 = "android/shared_compression_dictionaries/" + str + ".dict";
        if (th.h.a().Z0()) {
            gk.d.a(str2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                xu.g gVarC = b0.c(b0.j(inputStreamOpen));
                try {
                    byte[] bArrX1 = gVarC.X1();
                    this.f15568a.put(str, bArrX1);
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
            gk.p.f("DictionaryManager", "Error reading dictionary " + str, e10);
            return null;
        }
    }

    public synchronized void c() {
        this.f15568a.clear();
    }
}

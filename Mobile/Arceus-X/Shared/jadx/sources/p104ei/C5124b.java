package p104ei;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p151gk.C6109d;
import p151gk.C6124q;
import p560xu.C12919b0;
import p560xu.InterfaceC12928g;
import th.C11659h;

/* JADX INFO: renamed from: ei.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5124b {

    /* JADX INFO: renamed from: a */
    public final Map<String, byte[]> f19995a = new HashMap();

    /* JADX INFO: renamed from: ei.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C5124b f19996a = new C5124b();
    }

    /* JADX INFO: renamed from: b */
    public static C5124b m23913b() {
        return a.f19996a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m23914a(Context context, String str) {
        if (this.f19995a.containsKey(str)) {
            return this.f19995a.get(str);
        }
        String str2 = "android/shared_compression_dictionaries/" + str + ".dict";
        if (C11659h.m43403a().mo43618e1()) {
            C6109d.m27018a(str2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(C12919b0.m47968j(inputStreamOpen));
                try {
                    byte[] bArrMo48013X1 = interfaceC12928gM47961c.mo48013X1();
                    this.f19995a.put(str, bArrMo48013X1);
                    interfaceC12928gM47961c.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return bArrMo48013X1;
                } catch (Throwable th2) {
                    if (interfaceC12928gM47961c != null) {
                        try {
                            interfaceC12928gM47961c.close();
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
            C6124q.m27061f("DictionaryManager", "Error reading dictionary " + str, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m23915c() {
        this.f19995a.clear();
    }
}

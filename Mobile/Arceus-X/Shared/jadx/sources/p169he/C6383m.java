package p169he;

import java.util.logging.Logger;

/* JADX INFO: renamed from: he.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6383m {

    /* JADX INFO: renamed from: a */
    public static final Logger f24265a = Logger.getLogger(C6383m.class.getName());

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6382l f24266b = m27915b();

    /* JADX INFO: renamed from: he.m$b */
    public static final class b implements InterfaceC6382l {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m27914a(String str) {
        if (m27916c(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6382l m27915b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m27916c(String str) {
        return str == null || str.isEmpty();
    }
}

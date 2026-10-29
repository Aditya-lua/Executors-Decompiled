package p465ue;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ue.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C11844b {

    /* JADX INFO: renamed from: a */
    public static final Logger f41599a = Logger.getLogger(C11844b.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f41600b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ue.b$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public static final b f41601a;

        /* JADX INFO: renamed from: b */
        public static final b f41602b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ b[] f41603c;

        /* JADX INFO: renamed from: ue.b$b$a */
        public final enum a extends b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // p465ue.C11844b.b
            /* JADX INFO: renamed from: a */
            public boolean mo44243a() {
                return !C11844b.m44242c();
            }
        }

        /* JADX INFO: renamed from: ue.b$b$b, reason: collision with other inner class name */
        public final enum C14266b extends b {
            public C14266b(String str, int i10) {
                super(str, i10);
            }

            @Override // p465ue.C11844b.b
            /* JADX INFO: renamed from: a */
            public boolean mo44243a() {
                return !C11844b.m44242c() || C11844b.m44241b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f41601a = aVar;
            C14266b c14266b = new C14266b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f41602b = c14266b;
            f41603c = new b[]{aVar, c14266b};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, int i10) {
            super(str, i10);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f41603c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo44243a();
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m44240a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f41599a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44241b() {
        return m44240a().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44242c() {
        return C11843a.m44239a() || f41600b.get();
    }
}

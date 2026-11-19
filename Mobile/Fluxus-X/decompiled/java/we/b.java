package we;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f35739a = Logger.getLogger(b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: we.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0736b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0736b f35740a;
        public static final EnumC0736b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0736b[] f35741c;

        /* JADX INFO: renamed from: we.b$b$a */
        public final enum a extends EnumC0736b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // we.b.EnumC0736b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: we.b$b$b, reason: collision with other inner class name */
        public final enum C0737b extends EnumC0736b {
            public C0737b(String str, int i10) {
                super(str, i10);
            }

            @Override // we.b.EnumC0736b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f35740a = aVar;
            C0737b c0737b = new C0737b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = c0737b;
            f35741c = new EnumC0736b[]{aVar, c0737b};
        }

        public EnumC0736b(String str, int i10) {
            super(str, i10);
        }

        public static EnumC0736b valueOf(String str) {
            return (EnumC0736b) Enum.valueOf(EnumC0736b.class, str);
        }

        public static EnumC0736b[] values() {
            return (EnumC0736b[]) f35741c.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f35739a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return we.a.a() || b.get();
    }
}

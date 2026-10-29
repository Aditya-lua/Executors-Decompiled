package te;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f31709a = Logger.getLogger(b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: te.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0569b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0569b f31710a;
        public static final EnumC0569b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0569b[] f31711c;

        /* JADX INFO: renamed from: te.b$b$a */
        public final enum a extends EnumC0569b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // te.b.EnumC0569b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: te.b$b$b, reason: collision with other inner class name */
        public final enum C0570b extends EnumC0569b {
            public C0570b(String str, int i10) {
                super(str, i10);
            }

            @Override // te.b.EnumC0569b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f31710a = aVar;
            C0570b c0570b = new C0570b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = c0570b;
            f31711c = new EnumC0569b[]{aVar, c0570b};
        }

        public EnumC0569b(String str, int i10) {
            super(str, i10);
        }

        public static EnumC0569b valueOf(String str) {
            return (EnumC0569b) Enum.valueOf(EnumC0569b.class, str);
        }

        public static EnumC0569b[] values() {
            return (EnumC0569b[]) f31711c.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f31709a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return te.a.a() || b.get();
    }
}

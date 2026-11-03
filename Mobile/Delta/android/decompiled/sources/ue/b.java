package ue;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f32769a = Logger.getLogger(b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ue.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0590b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0590b f32770a;
        public static final EnumC0590b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0590b[] f32771c;

        /* JADX INFO: renamed from: ue.b$b$a */
        public final enum a extends EnumC0590b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // ue.b.EnumC0590b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: ue.b$b$b, reason: collision with other inner class name */
        public final enum C0591b extends EnumC0590b {
            public C0591b(String str, int i10) {
                super(str, i10);
            }

            @Override // ue.b.EnumC0590b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f32770a = aVar;
            C0591b c0591b = new C0591b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = c0591b;
            f32771c = new EnumC0590b[]{aVar, c0591b};
        }

        public EnumC0590b(String str, int i10) {
            super(str, i10);
        }

        public static EnumC0590b valueOf(String str) {
            return (EnumC0590b) Enum.valueOf(EnumC0590b.class, str);
        }

        public static EnumC0590b[] values() {
            return (EnumC0590b[]) f32771c.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f32769a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return ue.a.a() || b.get();
    }
}

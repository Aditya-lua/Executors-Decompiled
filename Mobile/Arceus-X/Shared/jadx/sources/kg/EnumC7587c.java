package kg;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kg.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC7587c implements InterfaceC7588d {

    /* JADX INFO: renamed from: a */
    public static final EnumC7587c f29042a = new a("IDENTITY", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC7587c f29043b = new EnumC7587c("UPPER_CAMEL_CASE", 1) { // from class: kg.c.b
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31391e(field.getName());
        }
    };

    /* JADX INFO: renamed from: c */
    public static final EnumC7587c f29044c = new EnumC7587c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: kg.c.c
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31391e(EnumC7587c.m31390d(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d */
    public static final EnumC7587c f29045d = new EnumC7587c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: kg.c.d
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31390d(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final EnumC7587c f29046e = new EnumC7587c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: kg.c.e
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31390d(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final EnumC7587c f29047f = new EnumC7587c("LOWER_CASE_WITH_DASHES", 5) { // from class: kg.c.f
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31390d(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final EnumC7587c f29048g = new EnumC7587c("LOWER_CASE_WITH_DOTS", 6) { // from class: kg.c.g
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return EnumC7587c.m31390d(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC7587c[] f29049h = m31389c();

    /* JADX INFO: renamed from: kg.c$a */
    public final enum a extends EnumC7587c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // kg.InterfaceC7588d
        /* JADX INFO: renamed from: b */
        public String mo31392b(Field field) {
            return field.getName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC7587c(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ EnumC7587c[] m31389c() {
        return new EnumC7587c[]{f29042a, f29043b, f29044c, f29045d, f29046e, f29047f, f29048g};
    }

    /* JADX INFO: renamed from: d */
    public static String m31390d(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m31391e(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static EnumC7587c valueOf(String str) {
        return (EnumC7587c) Enum.valueOf(EnumC7587c.class, str);
    }

    public static EnumC7587c[] values() {
        return (EnumC7587c[]) f29049h.clone();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: kg.c.<init>(java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC7587c(String str, int i10, a aVar) {
        this(str, i10);
    }
}

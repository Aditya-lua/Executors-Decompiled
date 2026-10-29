package jg;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements jg.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21378a = new a("IDENTITY", 0);
    public static final c b = new c("UPPER_CAMEL_CASE", 1) { // from class: jg.c.b
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.e(field.getName());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21379c = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: jg.c.c
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.e(c.d(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21380d = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: jg.c.d
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.d(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21381e = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: jg.c.e
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.d(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21382f = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: jg.c.f
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.d(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f21383g = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: jg.c.g
        {
            a aVar = null;
        }

        @Override // jg.d
        public String b(Field field) {
            return c.d(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f21384h = c();

    public final enum a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // jg.d
        public String b(Field field) {
            return field.getName();
        }
    }

    public c(String str, int i10) {
        super(str, i10);
    }

    public static /* synthetic */ c[] c() {
        return new c[]{f21378a, b, f21379c, f21380d, f21381e, f21382f, f21383g};
    }

    public static String d(String str, char c10) {
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

    public static String e(String str) {
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

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f21384h.clone();
    }

    public /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}

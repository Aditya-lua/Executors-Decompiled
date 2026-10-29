package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g5 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2510g5 {

    /* JADX INFO: renamed from: b */
    public static final EnumC2510g5 f8984b;

    /* JADX INFO: renamed from: c */
    public static final EnumC2510g5 f8985c;

    /* JADX INFO: renamed from: d */
    public static final EnumC2510g5 f8986d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2510g5 f8987e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2510g5 f8988f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2510g5 f8989g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2510g5 f8990h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2510g5 f8991i;

    /* JADX INFO: renamed from: j */
    public static final EnumC2510g5 f8992j;

    /* JADX INFO: renamed from: k */
    public static final EnumC2510g5 f8993k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC2510g5[] f8994l;

    /* JADX INFO: renamed from: a */
    public final Class f8995a;

    static {
        EnumC2510g5 enumC2510g5 = new EnumC2510g5("VOID", 0, Void.class, Void.class, null);
        f8984b = enumC2510g5;
        Class cls = Integer.TYPE;
        EnumC2510g5 enumC2510g6 = new EnumC2510g5("INT", 1, cls, Integer.class, 0);
        f8985c = enumC2510g6;
        EnumC2510g5 enumC2510g7 = new EnumC2510g5("LONG", 2, Long.TYPE, Long.class, 0L);
        f8986d = enumC2510g7;
        EnumC2510g5 enumC2510g8 = new EnumC2510g5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8987e = enumC2510g8;
        EnumC2510g5 enumC2510g9 = new EnumC2510g5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8988f = enumC2510g9;
        EnumC2510g5 enumC2510g10 = new EnumC2510g5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8989g = enumC2510g10;
        EnumC2510g5 enumC2510g11 = new EnumC2510g5("STRING", 6, String.class, String.class, "");
        f8990h = enumC2510g11;
        EnumC2510g5 enumC2510g12 = new EnumC2510g5("BYTE_STRING", 7, AbstractC2640s3.class, AbstractC2640s3.class, AbstractC2640s3.f9227b);
        f8991i = enumC2510g12;
        EnumC2510g5 enumC2510g13 = new EnumC2510g5("ENUM", 8, cls, Integer.class, null);
        f8992j = enumC2510g13;
        EnumC2510g5 enumC2510g14 = new EnumC2510g5("MESSAGE", 9, Object.class, Object.class, null);
        f8993k = enumC2510g14;
        f8994l = new EnumC2510g5[]{enumC2510g5, enumC2510g6, enumC2510g7, enumC2510g8, enumC2510g9, enumC2510g10, enumC2510g11, enumC2510g12, enumC2510g13, enumC2510g14};
    }

    public EnumC2510g5(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f8995a = cls2;
    }

    public static EnumC2510g5[] values() {
        return (EnumC2510g5[]) f8994l.clone();
    }

    /* JADX INFO: renamed from: a */
    public final Class m11437a() {
        return this.f8995a;
    }
}

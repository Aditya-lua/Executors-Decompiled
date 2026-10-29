package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.tb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2321tb {

    /* JADX INFO: renamed from: b */
    public static final EnumC2321tb f8665b;

    /* JADX INFO: renamed from: c */
    public static final EnumC2321tb f8666c;

    /* JADX INFO: renamed from: d */
    public static final EnumC2321tb f8667d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2321tb f8668e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2321tb f8669f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2321tb f8670g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2321tb f8671h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2321tb f8672i;

    /* JADX INFO: renamed from: j */
    public static final EnumC2321tb f8673j;

    /* JADX INFO: renamed from: k */
    public static final EnumC2321tb f8674k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC2321tb[] f8675l;

    /* JADX INFO: renamed from: a */
    public final Class f8676a;

    static {
        EnumC2321tb enumC2321tb = new EnumC2321tb("VOID", 0, Void.class, Void.class, null);
        f8665b = enumC2321tb;
        Class cls = Integer.TYPE;
        EnumC2321tb enumC2321tb2 = new EnumC2321tb("INT", 1, cls, Integer.class, 0);
        f8666c = enumC2321tb2;
        EnumC2321tb enumC2321tb3 = new EnumC2321tb("LONG", 2, Long.TYPE, Long.class, 0L);
        f8667d = enumC2321tb3;
        EnumC2321tb enumC2321tb4 = new EnumC2321tb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8668e = enumC2321tb4;
        EnumC2321tb enumC2321tb5 = new EnumC2321tb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8669f = enumC2321tb5;
        EnumC2321tb enumC2321tb6 = new EnumC2321tb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8670g = enumC2321tb6;
        EnumC2321tb enumC2321tb7 = new EnumC2321tb("STRING", 6, String.class, String.class, "");
        f8671h = enumC2321tb7;
        EnumC2321tb enumC2321tb8 = new EnumC2321tb("BYTE_STRING", 7, AbstractC2104ha.class, AbstractC2104ha.class, AbstractC2104ha.f8218b);
        f8672i = enumC2321tb8;
        EnumC2321tb enumC2321tb9 = new EnumC2321tb("ENUM", 8, cls, Integer.class, null);
        f8673j = enumC2321tb9;
        EnumC2321tb enumC2321tb10 = new EnumC2321tb("MESSAGE", 9, Object.class, Object.class, null);
        f8674k = enumC2321tb10;
        f8675l = new EnumC2321tb[]{enumC2321tb, enumC2321tb2, enumC2321tb3, enumC2321tb4, enumC2321tb5, enumC2321tb6, enumC2321tb7, enumC2321tb8, enumC2321tb9, enumC2321tb10};
    }

    public EnumC2321tb(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f8676a = cls2;
    }

    public static EnumC2321tb[] values() {
        return (EnumC2321tb[]) f8675l.clone();
    }

    /* JADX INFO: renamed from: a */
    public final Class m10769a() {
        return this.f8676a;
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2906c0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC2906c0 f10808d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2906c0 f10809e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2906c0 f10810f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2906c0 f10811g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2906c0 f10812h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2906c0 f10813i;

    /* JADX INFO: renamed from: j */
    public static final EnumC2906c0 f10814j;

    /* JADX INFO: renamed from: k */
    public static final EnumC2906c0 f10815k;

    /* JADX INFO: renamed from: l */
    public static final EnumC2906c0 f10816l;

    /* JADX INFO: renamed from: m */
    public static final EnumC2906c0 f10817m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC2906c0[] f10818n;

    /* JADX INFO: renamed from: a */
    public final Class<?> f10819a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f10820b;

    /* JADX INFO: renamed from: c */
    public final Object f10821c;

    static {
        EnumC2906c0 enumC2906c0 = new EnumC2906c0("VOID", 0, Void.class, Void.class, null);
        f10808d = enumC2906c0;
        Class cls = Integer.TYPE;
        EnumC2906c0 enumC2906c1 = new EnumC2906c0("INT", 1, cls, Integer.class, 0);
        f10809e = enumC2906c1;
        EnumC2906c0 enumC2906c2 = new EnumC2906c0("LONG", 2, Long.TYPE, Long.class, 0L);
        f10810f = enumC2906c2;
        EnumC2906c0 enumC2906c3 = new EnumC2906c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f10811g = enumC2906c3;
        EnumC2906c0 enumC2906c4 = new EnumC2906c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f10812h = enumC2906c4;
        EnumC2906c0 enumC2906c5 = new EnumC2906c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f10813i = enumC2906c5;
        EnumC2906c0 enumC2906c6 = new EnumC2906c0("STRING", 6, String.class, String.class, "");
        f10814j = enumC2906c6;
        EnumC2906c0 enumC2906c7 = new EnumC2906c0("BYTE_STRING", 7, AbstractC2920h.class, AbstractC2920h.class, AbstractC2920h.f10853b);
        f10815k = enumC2906c7;
        EnumC2906c0 enumC2906c8 = new EnumC2906c0("ENUM", 8, cls, Integer.class, null);
        f10816l = enumC2906c8;
        EnumC2906c0 enumC2906c9 = new EnumC2906c0("MESSAGE", 9, Object.class, Object.class, null);
        f10817m = enumC2906c9;
        f10818n = new EnumC2906c0[]{enumC2906c0, enumC2906c1, enumC2906c2, enumC2906c3, enumC2906c4, enumC2906c5, enumC2906c6, enumC2906c7, enumC2906c8, enumC2906c9};
    }

    public EnumC2906c0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f10819a = cls;
        this.f10820b = cls2;
        this.f10821c = obj;
    }

    public static EnumC2906c0 valueOf(String str) {
        return (EnumC2906c0) Enum.valueOf(EnumC2906c0.class, str);
    }

    public static EnumC2906c0[] values() {
        return (EnumC2906c0[]) f10818n.clone();
    }

    /* JADX INFO: renamed from: a */
    public Class<?> m13411a() {
        return this.f10820b;
    }
}

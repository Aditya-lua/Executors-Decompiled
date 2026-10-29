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
/* JADX INFO: loaded from: classes.dex */
public final class g5 {
    public static final g5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g5 f7052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g5 f7053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g5 f7054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g5 f7055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g5 f7056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g5 f7057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g5 f7058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g5 f7059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g5 f7060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g5[] f7061l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7062a;

    static {
        g5 g5Var = new g5("VOID", 0, Void.class, Void.class, null);
        b = g5Var;
        Class cls = Integer.TYPE;
        g5 g5Var2 = new g5("INT", 1, cls, Integer.class, 0);
        f7052c = g5Var2;
        g5 g5Var3 = new g5("LONG", 2, Long.TYPE, Long.class, 0L);
        f7053d = g5Var3;
        g5 g5Var4 = new g5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7054e = g5Var4;
        g5 g5Var5 = new g5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7055f = g5Var5;
        g5 g5Var6 = new g5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7056g = g5Var6;
        g5 g5Var7 = new g5("STRING", 6, String.class, String.class, "");
        f7057h = g5Var7;
        g5 g5Var8 = new g5("BYTE_STRING", 7, s3.class, s3.class, s3.b);
        f7058i = g5Var8;
        g5 g5Var9 = new g5("ENUM", 8, cls, Integer.class, null);
        f7059j = g5Var9;
        g5 g5Var10 = new g5("MESSAGE", 9, Object.class, Object.class, null);
        f7060k = g5Var10;
        f7061l = new g5[]{g5Var, g5Var2, g5Var3, g5Var4, g5Var5, g5Var6, g5Var7, g5Var8, g5Var9, g5Var10};
    }

    public g5(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f7062a = cls2;
    }

    public static g5[] values() {
        return (g5[]) f7061l.clone();
    }

    public final Class a() {
        return this.f7062a;
    }
}

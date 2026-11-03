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
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f8473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f8474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f8475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f8476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f8477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f8478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f8479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c0 f8480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c0 f8481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c0 f8482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c0[] f8483n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f8484a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8485c;

    static {
        c0 c0Var = new c0("VOID", 0, Void.class, Void.class, null);
        f8473d = c0Var;
        Class cls = Integer.TYPE;
        c0 c0Var2 = new c0("INT", 1, cls, Integer.class, 0);
        f8474e = c0Var2;
        c0 c0Var3 = new c0("LONG", 2, Long.TYPE, Long.class, 0L);
        f8475f = c0Var3;
        c0 c0Var4 = new c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8476g = c0Var4;
        c0 c0Var5 = new c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8477h = c0Var5;
        c0 c0Var6 = new c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8478i = c0Var6;
        c0 c0Var7 = new c0("STRING", 6, String.class, String.class, "");
        f8479j = c0Var7;
        c0 c0Var8 = new c0("BYTE_STRING", 7, h.class, h.class, h.b);
        f8480k = c0Var8;
        c0 c0Var9 = new c0("ENUM", 8, cls, Integer.class, null);
        f8481l = c0Var9;
        c0 c0Var10 = new c0("MESSAGE", 9, Object.class, Object.class, null);
        f8482m = c0Var10;
        f8483n = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
    }

    public c0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f8484a = cls;
        this.b = cls2;
        this.f8485c = obj;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f8483n.clone();
    }

    public Class<?> a() {
        return this.b;
    }
}

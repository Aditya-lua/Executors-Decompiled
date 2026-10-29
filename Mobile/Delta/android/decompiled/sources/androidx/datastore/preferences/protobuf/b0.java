package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f2131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f2132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f2133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f2134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f2135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f2136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f2137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0 f2138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f2139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0 f2140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b0[] f2141n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f2142a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2143c;

    static {
        b0 b0Var = new b0("VOID", 0, Void.class, Void.class, null);
        f2131d = b0Var;
        Class cls = Integer.TYPE;
        b0 b0Var2 = new b0("INT", 1, cls, Integer.class, 0);
        f2132e = b0Var2;
        b0 b0Var3 = new b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f2133f = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f2134g = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f2135h = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f2136i = b0Var6;
        b0 b0Var7 = new b0("STRING", 6, String.class, String.class, "");
        f2137j = b0Var7;
        b0 b0Var8 = new b0("BYTE_STRING", 7, g.class, g.class, g.b);
        f2138k = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8, cls, Integer.class, null);
        f2139l = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9, Object.class, Object.class, null);
        f2140m = b0Var10;
        f2141n = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    public b0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f2142a = cls;
        this.b = cls2;
        this.f2143c = obj;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f2141n.clone();
    }

    public Class<?> a() {
        return this.b;
    }
}

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0826b0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0826b0 f2814d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0826b0 f2815e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0826b0 f2816f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0826b0 f2817g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0826b0 f2818h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0826b0 f2819i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0826b0 f2820j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0826b0 f2821k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0826b0 f2822l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0826b0 f2823m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC0826b0[] f2824n;

    /* JADX INFO: renamed from: a */
    public final Class<?> f2825a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f2826b;

    /* JADX INFO: renamed from: c */
    public final Object f2827c;

    static {
        EnumC0826b0 enumC0826b0 = new EnumC0826b0("VOID", 0, Void.class, Void.class, null);
        f2814d = enumC0826b0;
        Class cls = Integer.TYPE;
        EnumC0826b0 enumC0826b1 = new EnumC0826b0("INT", 1, cls, Integer.class, 0);
        f2815e = enumC0826b1;
        EnumC0826b0 enumC0826b2 = new EnumC0826b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f2816f = enumC0826b2;
        EnumC0826b0 enumC0826b3 = new EnumC0826b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f2817g = enumC0826b3;
        EnumC0826b0 enumC0826b4 = new EnumC0826b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f2818h = enumC0826b4;
        EnumC0826b0 enumC0826b5 = new EnumC0826b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f2819i = enumC0826b5;
        EnumC0826b0 enumC0826b6 = new EnumC0826b0("STRING", 6, String.class, String.class, "");
        f2820j = enumC0826b6;
        EnumC0826b0 enumC0826b7 = new EnumC0826b0("BYTE_STRING", 7, AbstractC0840g.class, AbstractC0840g.class, AbstractC0840g.f2854b);
        f2821k = enumC0826b7;
        EnumC0826b0 enumC0826b8 = new EnumC0826b0("ENUM", 8, cls, Integer.class, null);
        f2822l = enumC0826b8;
        EnumC0826b0 enumC0826b9 = new EnumC0826b0("MESSAGE", 9, Object.class, Object.class, null);
        f2823m = enumC0826b9;
        f2824n = new EnumC0826b0[]{enumC0826b0, enumC0826b1, enumC0826b2, enumC0826b3, enumC0826b4, enumC0826b5, enumC0826b6, enumC0826b7, enumC0826b8, enumC0826b9};
    }

    public EnumC0826b0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f2825a = cls;
        this.f2826b = cls2;
        this.f2827c = obj;
    }

    public static EnumC0826b0 valueOf(String str) {
        return (EnumC0826b0) Enum.valueOf(EnumC0826b0.class, str);
    }

    public static EnumC0826b0[] values() {
        return (EnumC0826b0[]) f2824n.clone();
    }

    /* JADX INFO: renamed from: a */
    public Class<?> m3357a() {
        return this.f2826b;
    }
}

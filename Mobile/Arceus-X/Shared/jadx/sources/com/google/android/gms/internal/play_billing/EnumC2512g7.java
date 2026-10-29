package com.google.android.gms.internal.play_billing;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2512g7 {

    /* JADX INFO: renamed from: c */
    public static final EnumC2512g7 f9000c;

    /* JADX INFO: renamed from: d */
    public static final EnumC2512g7 f9001d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2512g7 f9002e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2512g7 f9003f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2512g7 f9004g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2512g7 f9005h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2512g7 f9006i;

    /* JADX INFO: renamed from: j */
    public static final EnumC2512g7 f9007j;

    /* JADX INFO: renamed from: k */
    public static final EnumC2512g7 f9008k;

    /* JADX INFO: renamed from: l */
    public static final EnumC2512g7 f9009l;

    /* JADX INFO: renamed from: m */
    public static final EnumC2512g7 f9010m;

    /* JADX INFO: renamed from: n */
    public static final EnumC2512g7 f9011n;

    /* JADX INFO: renamed from: o */
    public static final EnumC2512g7 f9012o;

    /* JADX INFO: renamed from: p */
    public static final EnumC2512g7 f9013p;

    /* JADX INFO: renamed from: q */
    public static final EnumC2512g7 f9014q;

    /* JADX INFO: renamed from: r */
    public static final EnumC2512g7 f9015r;

    /* JADX INFO: renamed from: s */
    public static final EnumC2512g7 f9016s;

    /* JADX INFO: renamed from: t */
    public static final EnumC2512g7 f9017t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC2512g7[] f9018u;

    /* JADX INFO: renamed from: a */
    public final EnumC2523h7 f9019a;

    /* JADX INFO: renamed from: b */
    public final int f9020b;

    static {
        EnumC2512g7 enumC2512g7 = new EnumC2512g7("DOUBLE", 0, EnumC2523h7.DOUBLE, 1);
        f9000c = enumC2512g7;
        EnumC2512g7 enumC2512g8 = new EnumC2512g7("FLOAT", 1, EnumC2523h7.FLOAT, 5);
        f9001d = enumC2512g8;
        EnumC2523h7 enumC2523h7 = EnumC2523h7.LONG;
        EnumC2512g7 enumC2512g9 = new EnumC2512g7("INT64", 2, enumC2523h7, 0);
        f9002e = enumC2512g9;
        EnumC2512g7 enumC2512g10 = new EnumC2512g7("UINT64", 3, enumC2523h7, 0);
        f9003f = enumC2512g10;
        EnumC2523h7 enumC2523h8 = EnumC2523h7.INT;
        EnumC2512g7 enumC2512g11 = new EnumC2512g7("INT32", 4, enumC2523h8, 0);
        f9004g = enumC2512g11;
        EnumC2512g7 enumC2512g12 = new EnumC2512g7("FIXED64", 5, enumC2523h7, 1);
        f9005h = enumC2512g12;
        EnumC2512g7 enumC2512g13 = new EnumC2512g7("FIXED32", 6, enumC2523h8, 5);
        f9006i = enumC2512g13;
        EnumC2512g7 enumC2512g14 = new EnumC2512g7("BOOL", 7, EnumC2523h7.BOOLEAN, 0);
        f9007j = enumC2512g14;
        EnumC2512g7 enumC2512g15 = new EnumC2512g7("STRING", 8, EnumC2523h7.STRING, 2);
        f9008k = enumC2512g15;
        EnumC2523h7 enumC2523h9 = EnumC2523h7.MESSAGE;
        EnumC2512g7 enumC2512g16 = new EnumC2512g7("GROUP", 9, enumC2523h9, 3);
        f9009l = enumC2512g16;
        EnumC2512g7 enumC2512g17 = new EnumC2512g7("MESSAGE", 10, enumC2523h9, 2);
        f9010m = enumC2512g17;
        EnumC2512g7 enumC2512g18 = new EnumC2512g7("BYTES", 11, EnumC2523h7.BYTE_STRING, 2);
        f9011n = enumC2512g18;
        EnumC2512g7 enumC2512g19 = new EnumC2512g7("UINT32", 12, enumC2523h8, 0);
        f9012o = enumC2512g19;
        EnumC2512g7 enumC2512g20 = new EnumC2512g7("ENUM", 13, EnumC2523h7.ENUM, 0);
        f9013p = enumC2512g20;
        EnumC2512g7 enumC2512g21 = new EnumC2512g7("SFIXED32", 14, enumC2523h8, 5);
        f9014q = enumC2512g21;
        EnumC2512g7 enumC2512g22 = new EnumC2512g7("SFIXED64", 15, enumC2523h7, 1);
        f9015r = enumC2512g22;
        EnumC2512g7 enumC2512g23 = new EnumC2512g7("SINT32", 16, enumC2523h8, 0);
        f9016s = enumC2512g23;
        EnumC2512g7 enumC2512g24 = new EnumC2512g7("SINT64", 17, enumC2523h7, 0);
        f9017t = enumC2512g24;
        f9018u = new EnumC2512g7[]{enumC2512g7, enumC2512g8, enumC2512g9, enumC2512g10, enumC2512g11, enumC2512g12, enumC2512g13, enumC2512g14, enumC2512g15, enumC2512g16, enumC2512g17, enumC2512g18, enumC2512g19, enumC2512g20, enumC2512g21, enumC2512g22, enumC2512g23, enumC2512g24};
    }

    public EnumC2512g7(String str, int i10, EnumC2523h7 enumC2523h7, int i11) {
        super(str, i10);
        this.f9019a = enumC2523h7;
        this.f9020b = i11;
    }

    public static EnumC2512g7[] values() {
        return (EnumC2512g7[]) f9018u.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC2523h7 m11440a() {
        return this.f9019a;
    }
}

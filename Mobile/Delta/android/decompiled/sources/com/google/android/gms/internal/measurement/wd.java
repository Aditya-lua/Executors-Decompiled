package com.google.android.gms.internal.measurement;

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
public final class wd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd f6945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wd f6946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wd f6947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wd f6948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wd f6949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wd f6950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wd f6951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wd f6952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wd f6953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wd f6954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final wd f6955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final wd f6956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wd f6957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final wd f6958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final wd f6959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final wd f6960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final wd f6961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wd f6962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ wd[] f6963u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd f6964a;
    public final int b;

    static {
        wd wdVar = new wd("DOUBLE", 0, xd.DOUBLE, 1);
        f6945c = wdVar;
        wd wdVar2 = new wd("FLOAT", 1, xd.FLOAT, 5);
        f6946d = wdVar2;
        xd xdVar = xd.LONG;
        wd wdVar3 = new wd("INT64", 2, xdVar, 0);
        f6947e = wdVar3;
        wd wdVar4 = new wd("UINT64", 3, xdVar, 0);
        f6948f = wdVar4;
        xd xdVar2 = xd.INT;
        wd wdVar5 = new wd("INT32", 4, xdVar2, 0);
        f6949g = wdVar5;
        wd wdVar6 = new wd("FIXED64", 5, xdVar, 1);
        f6950h = wdVar6;
        wd wdVar7 = new wd("FIXED32", 6, xdVar2, 5);
        f6951i = wdVar7;
        wd wdVar8 = new wd("BOOL", 7, xd.BOOLEAN, 0);
        f6952j = wdVar8;
        wd wdVar9 = new wd("STRING", 8, xd.STRING, 2);
        f6953k = wdVar9;
        xd xdVar3 = xd.MESSAGE;
        wd wdVar10 = new wd("GROUP", 9, xdVar3, 3);
        f6954l = wdVar10;
        wd wdVar11 = new wd("MESSAGE", 10, xdVar3, 2);
        f6955m = wdVar11;
        wd wdVar12 = new wd("BYTES", 11, xd.BYTE_STRING, 2);
        f6956n = wdVar12;
        wd wdVar13 = new wd("UINT32", 12, xdVar2, 0);
        f6957o = wdVar13;
        wd wdVar14 = new wd("ENUM", 13, xd.ENUM, 0);
        f6958p = wdVar14;
        wd wdVar15 = new wd("SFIXED32", 14, xdVar2, 5);
        f6959q = wdVar15;
        wd wdVar16 = new wd("SFIXED64", 15, xdVar, 1);
        f6960r = wdVar16;
        wd wdVar17 = new wd("SINT32", 16, xdVar2, 0);
        f6961s = wdVar17;
        wd wdVar18 = new wd("SINT64", 17, xdVar, 0);
        f6962t = wdVar18;
        f6963u = new wd[]{wdVar, wdVar2, wdVar3, wdVar4, wdVar5, wdVar6, wdVar7, wdVar8, wdVar9, wdVar10, wdVar11, wdVar12, wdVar13, wdVar14, wdVar15, wdVar16, wdVar17, wdVar18};
    }

    public wd(String str, int i10, xd xdVar, int i11) {
        super(str, i10);
        this.f6964a = xdVar;
        this.b = i11;
    }

    public static wd[] values() {
        return (wd[]) f6963u.clone();
    }

    public final xd a() {
        return this.f6964a;
    }

    public final int b() {
        return this.b;
    }
}

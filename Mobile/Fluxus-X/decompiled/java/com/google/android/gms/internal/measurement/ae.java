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
public final class ae {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ae f6377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ae f6378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ae f6379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ae f6380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ae f6381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ae f6382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ae f6383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ae f6384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ae f6385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ae f6386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ae f6387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ae f6388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ae f6389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ae f6390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ae f6391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ae f6392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ae f6393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ae f6394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ae[] f6395u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be f6396a;
    public final int b;

    static {
        ae aeVar = new ae("DOUBLE", 0, be.DOUBLE, 1);
        f6377c = aeVar;
        ae aeVar2 = new ae("FLOAT", 1, be.FLOAT, 5);
        f6378d = aeVar2;
        be beVar = be.LONG;
        ae aeVar3 = new ae("INT64", 2, beVar, 0);
        f6379e = aeVar3;
        ae aeVar4 = new ae("UINT64", 3, beVar, 0);
        f6380f = aeVar4;
        be beVar2 = be.INT;
        ae aeVar5 = new ae("INT32", 4, beVar2, 0);
        f6381g = aeVar5;
        ae aeVar6 = new ae("FIXED64", 5, beVar, 1);
        f6382h = aeVar6;
        ae aeVar7 = new ae("FIXED32", 6, beVar2, 5);
        f6383i = aeVar7;
        ae aeVar8 = new ae("BOOL", 7, be.BOOLEAN, 0);
        f6384j = aeVar8;
        ae aeVar9 = new ae("STRING", 8, be.STRING, 2);
        f6385k = aeVar9;
        be beVar3 = be.MESSAGE;
        ae aeVar10 = new ae("GROUP", 9, beVar3, 3);
        f6386l = aeVar10;
        ae aeVar11 = new ae("MESSAGE", 10, beVar3, 2);
        f6387m = aeVar11;
        ae aeVar12 = new ae("BYTES", 11, be.BYTE_STRING, 2);
        f6388n = aeVar12;
        ae aeVar13 = new ae("UINT32", 12, beVar2, 0);
        f6389o = aeVar13;
        ae aeVar14 = new ae("ENUM", 13, be.ENUM, 0);
        f6390p = aeVar14;
        ae aeVar15 = new ae("SFIXED32", 14, beVar2, 5);
        f6391q = aeVar15;
        ae aeVar16 = new ae("SFIXED64", 15, beVar, 1);
        f6392r = aeVar16;
        ae aeVar17 = new ae("SINT32", 16, beVar2, 0);
        f6393s = aeVar17;
        ae aeVar18 = new ae("SINT64", 17, beVar, 0);
        f6394t = aeVar18;
        f6395u = new ae[]{aeVar, aeVar2, aeVar3, aeVar4, aeVar5, aeVar6, aeVar7, aeVar8, aeVar9, aeVar10, aeVar11, aeVar12, aeVar13, aeVar14, aeVar15, aeVar16, aeVar17, aeVar18};
    }

    public ae(String str, int i10, be beVar, int i11) {
        super(str, i10);
        this.f6396a = beVar;
        this.b = i11;
    }

    public static ae[] values() {
        return (ae[]) f6395u.clone();
    }

    public final be a() {
        return this.f6396a;
    }

    public final int b() {
        return this.b;
    }
}

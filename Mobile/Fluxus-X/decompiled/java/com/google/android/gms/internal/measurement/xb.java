package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

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
public final class xb {
    public static final xb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xb f6927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xb f6928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xb f6929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xb f6930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xb f6931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xb f6932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xb f6933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xb f6934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final xb f6935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ xb[] f6936l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6937a;

    static {
        xb xbVar = new xb("VOID", 0, Void.class, Void.class, null);
        b = xbVar;
        Class cls = Integer.TYPE;
        xb xbVar2 = new xb("INT", 1, cls, Integer.class, 0);
        f6927c = xbVar2;
        xb xbVar3 = new xb("LONG", 2, Long.TYPE, Long.class, 0L);
        f6928d = xbVar3;
        xb xbVar4 = new xb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6929e = xbVar4;
        xb xbVar5 = new xb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6930f = xbVar5;
        xb xbVar6 = new xb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6931g = xbVar6;
        xb xbVar7 = new xb("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f6932h = xbVar7;
        xb xbVar8 = new xb("BYTE_STRING", 7, la.class, la.class, la.b);
        f6933i = xbVar8;
        xb xbVar9 = new xb("ENUM", 8, cls, Integer.class, null);
        f6934j = xbVar9;
        xb xbVar10 = new xb("MESSAGE", 9, Object.class, Object.class, null);
        f6935k = xbVar10;
        f6936l = new xb[]{xbVar, xbVar2, xbVar3, xbVar4, xbVar5, xbVar6, xbVar7, xbVar8, xbVar9, xbVar10};
    }

    public xb(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f6937a = cls2;
    }

    public static xb[] values() {
        return (xb[]) f6936l.clone();
    }

    public final Class a() {
        return this.f6937a;
    }
}

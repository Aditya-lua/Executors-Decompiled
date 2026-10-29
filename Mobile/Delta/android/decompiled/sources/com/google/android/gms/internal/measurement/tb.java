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
/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public static final tb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tb f6806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tb f6807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tb f6808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tb f6809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tb f6810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tb f6811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tb f6812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tb f6813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final tb f6814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ tb[] f6815l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6816a;

    static {
        tb tbVar = new tb("VOID", 0, Void.class, Void.class, null);
        b = tbVar;
        Class cls = Integer.TYPE;
        tb tbVar2 = new tb("INT", 1, cls, Integer.class, 0);
        f6806c = tbVar2;
        tb tbVar3 = new tb("LONG", 2, Long.TYPE, Long.class, 0L);
        f6807d = tbVar3;
        tb tbVar4 = new tb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6808e = tbVar4;
        tb tbVar5 = new tb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6809f = tbVar5;
        tb tbVar6 = new tb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6810g = tbVar6;
        tb tbVar7 = new tb("STRING", 6, String.class, String.class, "");
        f6811h = tbVar7;
        tb tbVar8 = new tb("BYTE_STRING", 7, ha.class, ha.class, ha.b);
        f6812i = tbVar8;
        tb tbVar9 = new tb("ENUM", 8, cls, Integer.class, null);
        f6813j = tbVar9;
        tb tbVar10 = new tb("MESSAGE", 9, Object.class, Object.class, null);
        f6814k = tbVar10;
        f6815l = new tb[]{tbVar, tbVar2, tbVar3, tbVar4, tbVar5, tbVar6, tbVar7, tbVar8, tbVar9, tbVar10};
    }

    public tb(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f6816a = cls2;
    }

    public static tb[] values() {
        return (tb[]) f6815l.clone();
    }

    public final Class a() {
        return this.f6816a;
    }
}

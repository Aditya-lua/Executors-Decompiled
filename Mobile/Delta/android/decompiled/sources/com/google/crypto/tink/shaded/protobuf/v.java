package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static final v A;
    public static final v B;
    public static final v C;
    public static final v D;
    public static final v E;
    public static final v F;
    public static final v G;
    public static final v H;
    public static final v I;
    public static final v J;
    public static final v K;
    public static final v L;
    public static final v M;
    public static final v N;
    public static final v O;
    public static final v P;
    public static final v Q;
    public static final v R;
    public static final v S;
    public static final v T;
    public static final v U;
    public static final v V;
    public static final v W;
    public static final v X;
    public static final v Y;
    public static final v Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v f8591a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v f8592b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final v f8593c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final v f8594d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final v[] f8595e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f8596f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Type[] f8597f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f8598g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ v[] f8599g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f8600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f8601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f8602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f8603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f8604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v f8605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v f8606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f8607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f8608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f8609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f8610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f8611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f8612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f8613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f8614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f8615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f8616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v f8617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v f8618z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f8619a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f8620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f8621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8622e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8623a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c0.values().length];
            b = iArr;
            try {
                iArr[c0.f8406k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c0.f8408m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c0.f8405j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f8623a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8623a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8623a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8628a;

        b(boolean z10) {
            this.f8628a = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        c0 c0Var = c0.f8403h;
        v vVar = new v("DOUBLE", 0, 0, bVar, c0Var);
        f8596f = vVar;
        c0 c0Var2 = c0.f8402g;
        v vVar2 = new v("FLOAT", 1, 1, bVar, c0Var2);
        f8598g = vVar2;
        c0 c0Var3 = c0.f8401f;
        v vVar3 = new v("INT64", 2, 2, bVar, c0Var3);
        f8600h = vVar3;
        v vVar4 = new v("UINT64", 3, 3, bVar, c0Var3);
        f8601i = vVar4;
        c0 c0Var4 = c0.f8400e;
        v vVar5 = new v("INT32", 4, 4, bVar, c0Var4);
        f8602j = vVar5;
        v vVar6 = new v("FIXED64", 5, 5, bVar, c0Var3);
        f8603k = vVar6;
        v vVar7 = new v("FIXED32", 6, 6, bVar, c0Var4);
        f8604l = vVar7;
        c0 c0Var5 = c0.f8404i;
        v vVar8 = new v("BOOL", 7, 7, bVar, c0Var5);
        f8605m = vVar8;
        c0 c0Var6 = c0.f8405j;
        v vVar9 = new v("STRING", 8, 8, bVar, c0Var6);
        f8606n = vVar9;
        c0 c0Var7 = c0.f8408m;
        v vVar10 = new v("MESSAGE", 9, 9, bVar, c0Var7);
        f8607o = vVar10;
        c0 c0Var8 = c0.f8406k;
        v vVar11 = new v("BYTES", 10, 10, bVar, c0Var8);
        f8608p = vVar11;
        v vVar12 = new v("UINT32", 11, 11, bVar, c0Var4);
        f8609q = vVar12;
        c0 c0Var9 = c0.f8407l;
        v vVar13 = new v("ENUM", 12, 12, bVar, c0Var9);
        f8610r = vVar13;
        v vVar14 = new v("SFIXED32", 13, 13, bVar, c0Var4);
        f8611s = vVar14;
        v vVar15 = new v("SFIXED64", 14, 14, bVar, c0Var3);
        f8612t = vVar15;
        v vVar16 = new v("SINT32", 15, 15, bVar, c0Var4);
        f8613u = vVar16;
        v vVar17 = new v("SINT64", 16, 16, bVar, c0Var3);
        f8614v = vVar17;
        v vVar18 = new v("GROUP", 17, 17, bVar, c0Var7);
        f8615w = vVar18;
        b bVar2 = b.VECTOR;
        v vVar19 = new v("DOUBLE_LIST", 18, 18, bVar2, c0Var);
        f8616x = vVar19;
        v vVar20 = new v("FLOAT_LIST", 19, 19, bVar2, c0Var2);
        f8617y = vVar20;
        v vVar21 = new v("INT64_LIST", 20, 20, bVar2, c0Var3);
        f8618z = vVar21;
        v vVar22 = new v("UINT64_LIST", 21, 21, bVar2, c0Var3);
        A = vVar22;
        v vVar23 = new v("INT32_LIST", 22, 22, bVar2, c0Var4);
        B = vVar23;
        v vVar24 = new v("FIXED64_LIST", 23, 23, bVar2, c0Var3);
        C = vVar24;
        v vVar25 = new v("FIXED32_LIST", 24, 24, bVar2, c0Var4);
        D = vVar25;
        v vVar26 = new v("BOOL_LIST", 25, 25, bVar2, c0Var5);
        E = vVar26;
        v vVar27 = new v("STRING_LIST", 26, 26, bVar2, c0Var6);
        F = vVar27;
        v vVar28 = new v("MESSAGE_LIST", 27, 27, bVar2, c0Var7);
        G = vVar28;
        v vVar29 = new v("BYTES_LIST", 28, 28, bVar2, c0Var8);
        H = vVar29;
        v vVar30 = new v("UINT32_LIST", 29, 29, bVar2, c0Var4);
        I = vVar30;
        v vVar31 = new v("ENUM_LIST", 30, 30, bVar2, c0Var9);
        J = vVar31;
        v vVar32 = new v("SFIXED32_LIST", 31, 31, bVar2, c0Var4);
        K = vVar32;
        v vVar33 = new v("SFIXED64_LIST", 32, 32, bVar2, c0Var3);
        L = vVar33;
        v vVar34 = new v("SINT32_LIST", 33, 33, bVar2, c0Var4);
        M = vVar34;
        v vVar35 = new v("SINT64_LIST", 34, 34, bVar2, c0Var3);
        N = vVar35;
        b bVar3 = b.PACKED_VECTOR;
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, bVar3, c0Var);
        O = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, bVar3, c0Var2);
        P = vVar37;
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, bVar3, c0Var3);
        Q = vVar38;
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, bVar3, c0Var3);
        R = vVar39;
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, bVar3, c0Var4);
        S = vVar40;
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, bVar3, c0Var3);
        T = vVar41;
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, bVar3, c0Var4);
        U = vVar42;
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, bVar3, c0Var5);
        V = vVar43;
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, bVar3, c0Var4);
        W = vVar44;
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, bVar3, c0Var9);
        X = vVar45;
        v vVar46 = new v("SFIXED32_LIST_PACKED", 45, 45, bVar3, c0Var4);
        Y = vVar46;
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, bVar3, c0Var3);
        Z = vVar47;
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, bVar3, c0Var4);
        f8591a0 = vVar48;
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, bVar3, c0Var3);
        f8592b0 = vVar49;
        v vVar50 = new v("GROUP_LIST", 49, 49, bVar2, c0Var7);
        f8593c0 = vVar50;
        v vVar51 = new v("MAP", 50, 50, b.MAP, c0.f8399d);
        f8594d0 = vVar51;
        f8599g0 = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, vVar50, vVar51};
        f8597f0 = new Type[0];
        v[] vVarArrValues = values();
        f8595e0 = new v[vVarArrValues.length];
        for (v vVar52 : vVarArrValues) {
            f8595e0[vVar52.b] = vVar52;
        }
    }

    public v(String str, int i10, int i11, b bVar, c0 c0Var) {
        int i12;
        super(str, i10);
        this.b = i11;
        this.f8620c = bVar;
        this.f8619a = c0Var;
        int i13 = a.f8623a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.f8621d = c0Var.a();
        } else {
            this.f8621d = null;
        }
        this.f8622e = (bVar != b.SCALAR || (i12 = a.b[c0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f8599g0.clone();
    }

    public int a() {
        return this.b;
    }
}

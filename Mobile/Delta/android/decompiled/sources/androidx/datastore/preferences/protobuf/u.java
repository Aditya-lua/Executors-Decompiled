package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u A;
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u E;
    public static final u F;
    public static final u G;
    public static final u H;
    public static final u I;
    public static final u J;
    public static final u K;
    public static final u L;
    public static final u M;
    public static final u N;
    public static final u O;
    public static final u P;
    public static final u Q;
    public static final u R;
    public static final u S;
    public static final u T;
    public static final u U;
    public static final u V;
    public static final u W;
    public static final u X;
    public static final u Y;
    public static final u Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final u f2323a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final u f2324b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final u f2325c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final u f2326d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final u[] f2327e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f2328f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Type[] f2329f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f2330g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ u[] f2331g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f2332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f2333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f2334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f2335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f2336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f2337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f2338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f2339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f2340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f2341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f2342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f2343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f2344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u f2345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f2346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f2347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f2348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u f2349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f2350z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f2351a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f2353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2354e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2355a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b0.values().length];
            b = iArr;
            try {
                iArr[b0.f2138k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b0.f2140m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b0.f2137j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f2355a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2355a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2355a[b.SCALAR.ordinal()] = 3;
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
        public final boolean f2360a;

        b(boolean z10) {
            this.f2360a = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        b0 b0Var = b0.f2135h;
        u uVar = new u("DOUBLE", 0, 0, bVar, b0Var);
        f2328f = uVar;
        b0 b0Var2 = b0.f2134g;
        u uVar2 = new u("FLOAT", 1, 1, bVar, b0Var2);
        f2330g = uVar2;
        b0 b0Var3 = b0.f2133f;
        u uVar3 = new u("INT64", 2, 2, bVar, b0Var3);
        f2332h = uVar3;
        u uVar4 = new u("UINT64", 3, 3, bVar, b0Var3);
        f2333i = uVar4;
        b0 b0Var4 = b0.f2132e;
        u uVar5 = new u("INT32", 4, 4, bVar, b0Var4);
        f2334j = uVar5;
        u uVar6 = new u("FIXED64", 5, 5, bVar, b0Var3);
        f2335k = uVar6;
        u uVar7 = new u("FIXED32", 6, 6, bVar, b0Var4);
        f2336l = uVar7;
        b0 b0Var5 = b0.f2136i;
        u uVar8 = new u("BOOL", 7, 7, bVar, b0Var5);
        f2337m = uVar8;
        b0 b0Var6 = b0.f2137j;
        u uVar9 = new u("STRING", 8, 8, bVar, b0Var6);
        f2338n = uVar9;
        b0 b0Var7 = b0.f2140m;
        u uVar10 = new u("MESSAGE", 9, 9, bVar, b0Var7);
        f2339o = uVar10;
        b0 b0Var8 = b0.f2138k;
        u uVar11 = new u("BYTES", 10, 10, bVar, b0Var8);
        f2340p = uVar11;
        u uVar12 = new u("UINT32", 11, 11, bVar, b0Var4);
        f2341q = uVar12;
        b0 b0Var9 = b0.f2139l;
        u uVar13 = new u("ENUM", 12, 12, bVar, b0Var9);
        f2342r = uVar13;
        u uVar14 = new u("SFIXED32", 13, 13, bVar, b0Var4);
        f2343s = uVar14;
        u uVar15 = new u("SFIXED64", 14, 14, bVar, b0Var3);
        f2344t = uVar15;
        u uVar16 = new u("SINT32", 15, 15, bVar, b0Var4);
        f2345u = uVar16;
        u uVar17 = new u("SINT64", 16, 16, bVar, b0Var3);
        f2346v = uVar17;
        u uVar18 = new u("GROUP", 17, 17, bVar, b0Var7);
        f2347w = uVar18;
        b bVar2 = b.VECTOR;
        u uVar19 = new u("DOUBLE_LIST", 18, 18, bVar2, b0Var);
        f2348x = uVar19;
        u uVar20 = new u("FLOAT_LIST", 19, 19, bVar2, b0Var2);
        f2349y = uVar20;
        u uVar21 = new u("INT64_LIST", 20, 20, bVar2, b0Var3);
        f2350z = uVar21;
        u uVar22 = new u("UINT64_LIST", 21, 21, bVar2, b0Var3);
        A = uVar22;
        u uVar23 = new u("INT32_LIST", 22, 22, bVar2, b0Var4);
        B = uVar23;
        u uVar24 = new u("FIXED64_LIST", 23, 23, bVar2, b0Var3);
        C = uVar24;
        u uVar25 = new u("FIXED32_LIST", 24, 24, bVar2, b0Var4);
        D = uVar25;
        u uVar26 = new u("BOOL_LIST", 25, 25, bVar2, b0Var5);
        E = uVar26;
        u uVar27 = new u("STRING_LIST", 26, 26, bVar2, b0Var6);
        F = uVar27;
        u uVar28 = new u("MESSAGE_LIST", 27, 27, bVar2, b0Var7);
        G = uVar28;
        u uVar29 = new u("BYTES_LIST", 28, 28, bVar2, b0Var8);
        H = uVar29;
        u uVar30 = new u("UINT32_LIST", 29, 29, bVar2, b0Var4);
        I = uVar30;
        u uVar31 = new u("ENUM_LIST", 30, 30, bVar2, b0Var9);
        J = uVar31;
        u uVar32 = new u("SFIXED32_LIST", 31, 31, bVar2, b0Var4);
        K = uVar32;
        u uVar33 = new u("SFIXED64_LIST", 32, 32, bVar2, b0Var3);
        L = uVar33;
        u uVar34 = new u("SINT32_LIST", 33, 33, bVar2, b0Var4);
        M = uVar34;
        u uVar35 = new u("SINT64_LIST", 34, 34, bVar2, b0Var3);
        N = uVar35;
        b bVar3 = b.PACKED_VECTOR;
        u uVar36 = new u("DOUBLE_LIST_PACKED", 35, 35, bVar3, b0Var);
        O = uVar36;
        u uVar37 = new u("FLOAT_LIST_PACKED", 36, 36, bVar3, b0Var2);
        P = uVar37;
        u uVar38 = new u("INT64_LIST_PACKED", 37, 37, bVar3, b0Var3);
        Q = uVar38;
        u uVar39 = new u("UINT64_LIST_PACKED", 38, 38, bVar3, b0Var3);
        R = uVar39;
        u uVar40 = new u("INT32_LIST_PACKED", 39, 39, bVar3, b0Var4);
        S = uVar40;
        u uVar41 = new u("FIXED64_LIST_PACKED", 40, 40, bVar3, b0Var3);
        T = uVar41;
        u uVar42 = new u("FIXED32_LIST_PACKED", 41, 41, bVar3, b0Var4);
        U = uVar42;
        u uVar43 = new u("BOOL_LIST_PACKED", 42, 42, bVar3, b0Var5);
        V = uVar43;
        u uVar44 = new u("UINT32_LIST_PACKED", 43, 43, bVar3, b0Var4);
        W = uVar44;
        u uVar45 = new u("ENUM_LIST_PACKED", 44, 44, bVar3, b0Var9);
        X = uVar45;
        u uVar46 = new u("SFIXED32_LIST_PACKED", 45, 45, bVar3, b0Var4);
        Y = uVar46;
        u uVar47 = new u("SFIXED64_LIST_PACKED", 46, 46, bVar3, b0Var3);
        Z = uVar47;
        u uVar48 = new u("SINT32_LIST_PACKED", 47, 47, bVar3, b0Var4);
        f2323a0 = uVar48;
        u uVar49 = new u("SINT64_LIST_PACKED", 48, 48, bVar3, b0Var3);
        f2324b0 = uVar49;
        u uVar50 = new u("GROUP_LIST", 49, 49, bVar2, b0Var7);
        f2325c0 = uVar50;
        u uVar51 = new u("MAP", 50, 50, b.MAP, b0.f2131d);
        f2326d0 = uVar51;
        f2331g0 = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, uVar51};
        f2329f0 = new Type[0];
        u[] uVarArrValues = values();
        f2327e0 = new u[uVarArrValues.length];
        for (u uVar52 : uVarArrValues) {
            f2327e0[uVar52.b] = uVar52;
        }
    }

    public u(String str, int i10, int i11, b bVar, b0 b0Var) {
        int i12;
        super(str, i10);
        this.b = i11;
        this.f2352c = bVar;
        this.f2351a = b0Var;
        int i13 = a.f2355a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.f2353d = b0Var.a();
        } else {
            this.f2353d = null;
        }
        this.f2354e = (bVar != b.SCALAR || (i12 = a.b[b0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f2331g0.clone();
    }

    public int a() {
        return this.b;
    }
}

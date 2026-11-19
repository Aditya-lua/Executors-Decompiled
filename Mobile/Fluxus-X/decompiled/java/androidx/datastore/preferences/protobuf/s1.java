package androidx.datastore.preferences.protobuf;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2089a = c(1, 3);
    public static final int b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2090c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2091d = c(3, 2);

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
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f2092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f2093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f2094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f2095f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f2096g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f2097h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f2098i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f2099j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f2100k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f2101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f2102m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f2103n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f2104o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f2105p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f2106q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f2107r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f2108s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f2109t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f2110u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2111a;
        public final int b;

        public final enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s1$b$b, reason: collision with other inner class name */
        public final enum C0041b extends b {
            public C0041b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        public final enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        public final enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f2092c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2093d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2094e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2095f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2096g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2097h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2098i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2099j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2100k = aVar;
            c cVar3 = c.MESSAGE;
            C0041b c0041b = new C0041b("GROUP", 9, cVar3, 3);
            f2101l = c0041b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2102m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2103n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2104o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2105p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2106q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2107r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2108s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2109t = bVar14;
            f2110u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0041b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2110u.clone();
        }

        public c a() {
            return this.f2111a;
        }

        public int b() {
            return this.b;
        }

        public b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f2111a = cVar;
            this.b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(BuildConfig.FLAVOR),
        BYTE_STRING(g.b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2121a;

        c(Object obj) {
            this.f2121a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    public static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}

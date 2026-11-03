package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2128a = c(1, 3);
    public static final int b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2129c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2130d = c(3, 2);

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
        public static final b f2131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f2132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f2133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f2134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f2135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f2136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f2137i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f2138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f2139k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f2140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f2141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f2142n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f2143o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f2144p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f2145q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f2146r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f2147s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f2148t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f2149u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2150a;
        public final int b;

        public final enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s1$b$b, reason: collision with other inner class name */
        public final enum C0029b extends b {
            public C0029b(String str, int i10, c cVar, int i11) {
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
            f2131c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2132d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2133e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2134f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2135g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2136h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2137i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2138j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2139k = aVar;
            c cVar3 = c.MESSAGE;
            C0029b c0029b = new C0029b("GROUP", 9, cVar3, 3);
            f2140l = c0029b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2141m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2142n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2143o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2144p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2145q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2146r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2147s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2148t = bVar14;
            f2149u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0029b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2149u.clone();
        }

        public c a() {
            return this.f2150a;
        }

        public int b() {
            return this.b;
        }

        public b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f2150a = cVar;
            this.b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(g.b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2160a;

        c(Object obj) {
            this.f2160a = obj;
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

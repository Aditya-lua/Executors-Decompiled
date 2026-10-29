package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2283a = c(1, 3);
    public static final int b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2284c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2285d = c(3, 2);

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
        public static final b f2286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f2287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f2288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f2289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f2290g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f2291h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f2292i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f2293j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f2294k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f2295l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f2296m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f2297n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f2298o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f2299p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f2300q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f2301r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f2302s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f2303t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f2304u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2305a;
        public final int b;

        public final enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s1$b$b, reason: collision with other inner class name */
        public final enum C0033b extends b {
            public C0033b(String str, int i10, c cVar, int i11) {
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
            f2286c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2287d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2288e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2289f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2290g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2291h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2292i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2293j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2294k = aVar;
            c cVar3 = c.MESSAGE;
            C0033b c0033b = new C0033b("GROUP", 9, cVar3, 3);
            f2295l = c0033b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2296m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2297n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2298o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2299p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2300q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2301r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2302s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2303t = bVar14;
            f2304u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0033b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2304u.clone();
        }

        public c a() {
            return this.f2305a;
        }

        public int b() {
            return this.b;
        }

        public b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f2305a = cVar;
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
        public final Object f2315a;

        c(Object obj) {
            this.f2315a = obj;
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

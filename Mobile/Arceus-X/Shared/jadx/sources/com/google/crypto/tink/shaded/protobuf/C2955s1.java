package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2955s1 {

    /* JADX INFO: renamed from: a */
    public static final int f10992a = m14181c(1, 3);

    /* JADX INFO: renamed from: b */
    public static final int f10993b = m14181c(1, 4);

    /* JADX INFO: renamed from: c */
    public static final int f10994c = m14181c(2, 0);

    /* JADX INFO: renamed from: d */
    public static final int f10995d = m14181c(3, 2);

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
    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$b */
    public static class b {

        /* JADX INFO: renamed from: c */
        public static final b f10996c;

        /* JADX INFO: renamed from: d */
        public static final b f10997d;

        /* JADX INFO: renamed from: e */
        public static final b f10998e;

        /* JADX INFO: renamed from: f */
        public static final b f10999f;

        /* JADX INFO: renamed from: g */
        public static final b f11000g;

        /* JADX INFO: renamed from: h */
        public static final b f11001h;

        /* JADX INFO: renamed from: i */
        public static final b f11002i;

        /* JADX INFO: renamed from: j */
        public static final b f11003j;

        /* JADX INFO: renamed from: k */
        public static final b f11004k;

        /* JADX INFO: renamed from: l */
        public static final b f11005l;

        /* JADX INFO: renamed from: m */
        public static final b f11006m;

        /* JADX INFO: renamed from: n */
        public static final b f11007n;

        /* JADX INFO: renamed from: o */
        public static final b f11008o;

        /* JADX INFO: renamed from: p */
        public static final b f11009p;

        /* JADX INFO: renamed from: q */
        public static final b f11010q;

        /* JADX INFO: renamed from: r */
        public static final b f11011r;

        /* JADX INFO: renamed from: s */
        public static final b f11012s;

        /* JADX INFO: renamed from: t */
        public static final b f11013t;

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ b[] f11014u;

        /* JADX INFO: renamed from: a */
        public final c f11015a;

        /* JADX INFO: renamed from: b */
        public final int f11016b;

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$b$a */
        public final enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$b$b, reason: collision with other inner class name */
        public final enum C14107b extends b {
            public C14107b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$b$c */
        public final enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$b$d */
        public final enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f10996c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f10997d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f10998e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f10999f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f11000g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f11001h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f11002i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f11003j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f11004k = aVar;
            c cVar3 = c.MESSAGE;
            C14107b c14107b = new C14107b("GROUP", 9, cVar3, 3);
            f11005l = c14107b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f11006m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f11007n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f11008o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f11009p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f11010q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f11011r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f11012s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f11013t = bVar14;
            f11014u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c14107b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11014u.clone();
        }

        /* JADX INFO: renamed from: a */
        public c m14182a() {
            return this.f11015a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f11015a = cVar;
            this.f11016b = i11;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s1$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC2920h.f10853b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a */
        public final Object f11027a;

        c(Object obj) {
            this.f11027a = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m14179a(int i10) {
        return i10 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m14180b(int i10) {
        return i10 & 7;
    }

    /* JADX INFO: renamed from: c */
    public static int m14181c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}

package ye;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37788a = new b(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37789a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f37789a = iArr;
            try {
                iArr[tg.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37789a[tg.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37789a[tg.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37789a[tg.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37789a[tg.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37789a[tg.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b extends lg.a0<lg.l> {
        private b() {
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public lg.l read(tg.a aVar) throws IOException {
            String strE;
            tg.b bVarQ = aVar.Q();
            lg.l lVarC = c(aVar, bVarQ);
            if (lVarC == null) {
                return b(aVar, bVarQ);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.p()) {
                    if (lVarC instanceof lg.o) {
                        strE = aVar.E();
                        if (!k.b(strE)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strE = null;
                    }
                    tg.b bVarQ2 = aVar.Q();
                    lg.l lVarC2 = c(aVar, bVarQ2);
                    boolean z10 = lVarC2 != null;
                    if (lVarC2 == null) {
                        lVarC2 = b(aVar, bVarQ2);
                    }
                    if (lVarC instanceof lg.i) {
                        ((lg.i) lVarC).w(lVarC2);
                    } else {
                        lg.o oVar = (lg.o) lVarC;
                        if (oVar.H(strE)) {
                            throw new IOException("duplicate key: " + strE);
                        }
                        oVar.v(strE, lVarC2);
                    }
                    if (z10) {
                        arrayDeque.addLast(lVarC);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        lVarC = lVarC2;
                    } else {
                        continue;
                    }
                } else {
                    if (lVarC instanceof lg.i) {
                        aVar.g();
                    } else {
                        aVar.h();
                    }
                    if (arrayDeque.isEmpty()) {
                        return lVarC;
                    }
                    lVarC = (lg.l) arrayDeque.removeLast();
                }
            }
        }

        public final lg.l b(tg.a aVar, tg.b bVar) throws IOException {
            int i10 = a.f37789a[bVar.ordinal()];
            if (i10 == 3) {
                String strN = aVar.N();
                if (k.b(strN)) {
                    return new lg.r(strN);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new lg.r(new c(aVar.N()));
            }
            if (i10 == 5) {
                return new lg.r(Boolean.valueOf(aVar.w()));
            }
            if (i10 == 6) {
                aVar.K();
                return lg.n.f22140a;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        public final lg.l c(tg.a aVar, tg.b bVar) throws IOException {
            int i10 = a.f37789a[bVar.ordinal()];
            if (i10 == 1) {
                aVar.b();
                return new lg.i();
            }
            if (i10 != 2) {
                return null;
            }
            aVar.c();
            return new lg.o();
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, lg.l lVar) {
            throw new UnsupportedOperationException("write is not supported");
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends Number {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37790a;

        public c(String str) {
            this.f37790a = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f37790a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f37790a.equals(((c) obj).f37790a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f37790a);
        }

        public int hashCode() {
            return this.f37790a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f37790a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f37790a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f37790a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f37790a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f37790a).longValue();
            }
        }

        public String toString() {
            return this.f37790a;
        }
    }

    public static long a(Number number) {
        if (number instanceof c) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static lg.l c(String str) throws IOException {
        try {
            tg.a aVar = new tg.a(new StringReader(str));
            aVar.d0(false);
            return f37788a.read(aVar);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }
}

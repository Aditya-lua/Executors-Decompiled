package og;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import ng.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final lg.a0<BigInteger> A;
    public static final lg.a0<ng.a0> B;
    public static final lg.b0 C;
    public static final lg.a0<StringBuilder> D;
    public static final lg.b0 E;
    public static final lg.a0<StringBuffer> F;
    public static final lg.b0 G;
    public static final lg.a0<URL> H;
    public static final lg.b0 I;
    public static final lg.a0<URI> J;
    public static final lg.b0 K;
    public static final lg.a0<InetAddress> L;
    public static final lg.b0 M;
    public static final lg.a0<UUID> N;
    public static final lg.b0 O;
    public static final lg.a0<Currency> P;
    public static final lg.b0 Q;
    public static final lg.a0<Calendar> R;
    public static final lg.b0 S;
    public static final lg.a0<Locale> T;
    public static final lg.b0 U;
    public static final lg.a0<lg.l> V;
    public static final lg.b0 W;
    public static final lg.b0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lg.a0<Class> f28194a;
    public static final lg.b0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lg.a0<BitSet> f28195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lg.b0 f28196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lg.a0<Boolean> f28197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lg.a0<Boolean> f28198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lg.b0 f28199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lg.a0<Number> f28200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lg.b0 f28201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final lg.a0<Number> f28202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final lg.b0 f28203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final lg.a0<Number> f28204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lg.b0 f28205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lg.a0<AtomicInteger> f28206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lg.b0 f28207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final lg.a0<AtomicBoolean> f28208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final lg.b0 f28209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final lg.a0<AtomicIntegerArray> f28210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final lg.b0 f28211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final lg.a0<Number> f28212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final lg.a0<Number> f28213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final lg.a0<Number> f28214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final lg.a0<Character> f28215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final lg.b0 f28216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final lg.a0<String> f28217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final lg.a0<BigDecimal> f28218z;

    public class a extends lg.a0<AtomicIntegerArray> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray read(tg.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.z()));
                } catch (NumberFormatException e10) {
                    throw new lg.u(e10);
                }
            }
            aVar.g();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.O(atomicIntegerArray.get(i10));
            }
            cVar.g();
        }
    }

    public class a0 extends lg.a0<Boolean> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(tg.a aVar) throws IOException {
            tg.b bVarQ = aVar.Q();
            if (bVarQ != tg.b.NULL) {
                return bVarQ == tg.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.N())) : Boolean.valueOf(aVar.w());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Boolean bool) throws IOException {
            cVar.Q(bool);
        }
    }

    public class b extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            try {
                return Long.valueOf(aVar.A());
            } catch (NumberFormatException e10) {
                throw new lg.u(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.O(number.longValue());
            }
        }
    }

    public class b0 extends lg.a0<Boolean> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Boolean.valueOf(aVar.N());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Boolean bool) throws IOException {
            cVar.Y(bool == null ? "null" : bool.toString());
        }
    }

    public class c extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Float.valueOf((float) aVar.y());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.T(number);
        }
    }

    public class c0 extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            try {
                int iZ = aVar.z();
                if (iZ <= 255 && iZ >= -128) {
                    return Byte.valueOf((byte) iZ);
                }
                throw new lg.u("Lossy conversion from " + iZ + " to byte; at path " + aVar.n());
            } catch (NumberFormatException e10) {
                throw new lg.u(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.O(number.byteValue());
            }
        }
    }

    public class d extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Double.valueOf(aVar.y());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.N(number.doubleValue());
            }
        }
    }

    public class d0 extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            try {
                int iZ = aVar.z();
                if (iZ <= 65535 && iZ >= -32768) {
                    return Short.valueOf((short) iZ);
                }
                throw new lg.u("Lossy conversion from " + iZ + " to short; at path " + aVar.n());
            } catch (NumberFormatException e10) {
                throw new lg.u(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.O(number.shortValue());
            }
        }
    }

    public class e extends lg.a0<Character> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            String strN = aVar.N();
            if (strN.length() == 1) {
                return Character.valueOf(strN.charAt(0));
            }
            throw new lg.u("Expecting character, got: " + strN + "; at " + aVar.n());
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Character ch2) throws IOException {
            cVar.Y(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class e0 extends lg.a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            try {
                return Integer.valueOf(aVar.z());
            } catch (NumberFormatException e10) {
                throw new lg.u(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.O(number.intValue());
            }
        }
    }

    public class f extends lg.a0<String> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String read(tg.a aVar) throws IOException {
            tg.b bVarQ = aVar.Q();
            if (bVarQ != tg.b.NULL) {
                return bVarQ == tg.b.BOOLEAN ? Boolean.toString(aVar.w()) : aVar.N();
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, String str) throws IOException {
            cVar.Y(str);
        }
    }

    public class f0 extends lg.a0<AtomicInteger> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger read(tg.a aVar) {
            try {
                return new AtomicInteger(aVar.z());
            } catch (NumberFormatException e10) {
                throw new lg.u(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.O(atomicInteger.get());
        }
    }

    public class g extends lg.a0<BigDecimal> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigDecimal read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            String strN = aVar.N();
            try {
                return ng.c0.b(strN);
            } catch (NumberFormatException e10) {
                throw new lg.u("Failed parsing '" + strN + "' as BigDecimal; at path " + aVar.n(), e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.T(bigDecimal);
        }
    }

    public class g0 extends lg.a0<AtomicBoolean> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean read(tg.a aVar) {
            return new AtomicBoolean(aVar.w());
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.b0(atomicBoolean.get());
        }
    }

    public class h extends lg.a0<BigInteger> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            String strN = aVar.N();
            try {
                return ng.c0.c(strN);
            } catch (NumberFormatException e10) {
                throw new lg.u("Failed parsing '" + strN + "' as BigInteger; at path " + aVar.n(), e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, BigInteger bigInteger) throws IOException {
            cVar.T(bigInteger);
        }
    }

    public class i extends lg.a0<ng.a0> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ng.a0 read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return new ng.a0(aVar.N());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, ng.a0 a0Var) throws IOException {
            cVar.T(a0Var);
        }
    }

    public class j extends lg.a0<StringBuilder> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return new StringBuilder(aVar.N());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, StringBuilder sb2) throws IOException {
            cVar.Y(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends lg.a0<Class> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class read(tg.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }
    }

    public class l extends lg.a0<StringBuffer> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuffer read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return new StringBuffer(aVar.N());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.Y(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends lg.a0<URL> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URL read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            String strN = aVar.N();
            if (strN.equals("null")) {
                return null;
            }
            return new URL(strN);
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, URL url) throws IOException {
            cVar.Y(url == null ? null : url.toExternalForm());
        }
    }

    public class n extends lg.a0<URI> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URI read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            try {
                String strN = aVar.N();
                if (strN.equals("null")) {
                    return null;
                }
                return new URI(strN);
            } catch (URISyntaxException e10) {
                throw new lg.m(e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, URI uri) throws IOException {
            cVar.Y(uri == null ? null : uri.toASCIIString());
        }
    }

    public class o extends lg.a0<InetAddress> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InetAddress read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return InetAddress.getByName(aVar.N());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, InetAddress inetAddress) throws IOException {
            cVar.Y(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: og.p$p, reason: collision with other inner class name */
    public class C0544p extends lg.a0<UUID> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UUID read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            String strN = aVar.N();
            try {
                return UUID.fromString(strN);
            } catch (IllegalArgumentException e10) {
                throw new lg.u("Failed parsing '" + strN + "' as UUID; at path " + aVar.n(), e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, UUID uuid) throws IOException {
            cVar.Y(uuid == null ? null : uuid.toString());
        }
    }

    public class q extends lg.a0<Currency> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Currency read(tg.a aVar) throws IOException {
            String strN = aVar.N();
            try {
                return Currency.getInstance(strN);
            } catch (IllegalArgumentException e10) {
                throw new lg.u("Failed parsing '" + strN + "' as Currency; at path " + aVar.n(), e10);
            }
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Currency currency) throws IOException {
            cVar.Y(currency.getCurrencyCode());
        }
    }

    public class r extends lg.a0<Calendar> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.Q() != tg.b.END_OBJECT) {
                String strE = aVar.E();
                int iZ = aVar.z();
                strE.getClass();
                switch (strE) {
                    case "dayOfMonth":
                        i12 = iZ;
                        break;
                    case "minute":
                        i14 = iZ;
                        break;
                    case "second":
                        i15 = iZ;
                        break;
                    case "year":
                        i10 = iZ;
                        break;
                    case "month":
                        i11 = iZ;
                        break;
                    case "hourOfDay":
                        i13 = iZ;
                        break;
                }
            }
            aVar.h();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.s();
                return;
            }
            cVar.e();
            cVar.p("year");
            cVar.O(calendar.get(1));
            cVar.p("month");
            cVar.O(calendar.get(2));
            cVar.p("dayOfMonth");
            cVar.O(calendar.get(5));
            cVar.p("hourOfDay");
            cVar.O(calendar.get(11));
            cVar.p("minute");
            cVar.O(calendar.get(12));
            cVar.p("second");
            cVar.O(calendar.get(13));
            cVar.h();
        }
    }

    public class s extends lg.a0<Locale> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Locale read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.N(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Locale locale) throws IOException {
            cVar.Y(locale == null ? null : locale.toString());
        }
    }

    public class t implements lg.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sg.a f28219a;
        public final /* synthetic */ lg.a0 b;

        public t(sg.a aVar, lg.a0 a0Var) {
            this.f28219a = aVar;
            this.b = a0Var;
        }

        @Override // lg.b0
        public <T> lg.a0<T> create(lg.f fVar, sg.a<T> aVar) {
            if (aVar.equals(this.f28219a)) {
                return this.b;
            }
            return null;
        }
    }

    public class u implements lg.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f28220a;
        public final /* synthetic */ lg.a0 b;

        public u(Class cls, lg.a0 a0Var) {
            this.f28220a = cls;
            this.b = a0Var;
        }

        @Override // lg.b0
        public <T> lg.a0<T> create(lg.f fVar, sg.a<T> aVar) {
            if (aVar.c() == this.f28220a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f28220a.getName() + ",adapter=" + this.b + "]";
        }
    }

    public class v extends lg.a0<BitSet> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitSet read(tg.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.b();
            tg.b bVarQ = aVar.Q();
            int i10 = 0;
            while (bVarQ != tg.b.END_ARRAY) {
                int i11 = z.f28227a[bVarQ.ordinal()];
                boolean zW = true;
                if (i11 == 1 || i11 == 2) {
                    int iZ = aVar.z();
                    if (iZ == 0) {
                        zW = false;
                    } else if (iZ != 1) {
                        throw new lg.u("Invalid bitset value " + iZ + ", expected 0 or 1; at path " + aVar.n());
                    }
                } else {
                    if (i11 != 3) {
                        throw new lg.u("Invalid bitset value type: " + bVarQ + "; at path " + aVar.x());
                    }
                    zW = aVar.w();
                }
                if (zW) {
                    bitSet.set(i10);
                }
                i10++;
                bVarQ = aVar.Q();
            }
            aVar.g();
            return bitSet;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, BitSet bitSet) throws IOException {
            cVar.d();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.O(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.g();
        }
    }

    public class w implements lg.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f28221a;
        public final /* synthetic */ Class b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lg.a0 f28222c;

        public w(Class cls, Class cls2, lg.a0 a0Var) {
            this.f28221a = cls;
            this.b = cls2;
            this.f28222c = a0Var;
        }

        @Override // lg.b0
        public <T> lg.a0<T> create(lg.f fVar, sg.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f28221a || clsC == this.b) {
                return this.f28222c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.b.getName() + "+" + this.f28221a.getName() + ",adapter=" + this.f28222c + "]";
        }
    }

    public class x implements lg.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f28223a;
        public final /* synthetic */ Class b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lg.a0 f28224c;

        public x(Class cls, Class cls2, lg.a0 a0Var) {
            this.f28223a = cls;
            this.b = cls2;
            this.f28224c = a0Var;
        }

        @Override // lg.b0
        public <T> lg.a0<T> create(lg.f fVar, sg.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f28223a || clsC == this.b) {
                return this.f28224c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f28223a.getName() + "+" + this.b.getName() + ",adapter=" + this.f28224c + "]";
        }
    }

    public class y implements lg.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f28225a;
        public final /* synthetic */ lg.a0 b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        public class a<T1> extends lg.a0<T1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f28226a;

            public a(Class cls) {
                this.f28226a = cls;
            }

            @Override // lg.a0
            public T1 read(tg.a aVar) {
                T1 t8 = (T1) y.this.b.read(aVar);
                if (t8 == null || this.f28226a.isInstance(t8)) {
                    return t8;
                }
                throw new lg.u("Expected a " + this.f28226a.getName() + " but was " + t8.getClass().getName() + "; at path " + aVar.n());
            }

            @Override // lg.a0
            public void write(tg.c cVar, T1 t8) {
                y.this.b.write(cVar, t8);
            }
        }

        public y(Class cls, lg.a0 a0Var) {
            this.f28225a = cls;
            this.b = a0Var;
        }

        @Override // lg.b0
        public <T2> lg.a0<T2> create(lg.f fVar, sg.a<T2> aVar) {
            Class<? super T2> clsC = aVar.c();
            if (this.f28225a.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f28225a.getName() + ",adapter=" + this.b + "]";
        }
    }

    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28227a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f28227a = iArr;
            try {
                iArr[tg.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28227a[tg.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28227a[tg.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        lg.a0<Class> a0VarNullSafe = new k().nullSafe();
        f28194a = a0VarNullSafe;
        b = b(Class.class, a0VarNullSafe);
        lg.a0<BitSet> a0VarNullSafe2 = new v().nullSafe();
        f28195c = a0VarNullSafe2;
        f28196d = b(BitSet.class, a0VarNullSafe2);
        a0 a0Var = new a0();
        f28197e = a0Var;
        f28198f = new b0();
        f28199g = a(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f28200h = c0Var;
        f28201i = a(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f28202j = d0Var;
        f28203k = a(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f28204l = e0Var;
        f28205m = a(Integer.TYPE, Integer.class, e0Var);
        lg.a0<AtomicInteger> a0VarNullSafe3 = new f0().nullSafe();
        f28206n = a0VarNullSafe3;
        f28207o = b(AtomicInteger.class, a0VarNullSafe3);
        lg.a0<AtomicBoolean> a0VarNullSafe4 = new g0().nullSafe();
        f28208p = a0VarNullSafe4;
        f28209q = b(AtomicBoolean.class, a0VarNullSafe4);
        lg.a0<AtomicIntegerArray> a0VarNullSafe5 = new a().nullSafe();
        f28210r = a0VarNullSafe5;
        f28211s = b(AtomicIntegerArray.class, a0VarNullSafe5);
        f28212t = new b();
        f28213u = new c();
        f28214v = new d();
        e eVar = new e();
        f28215w = eVar;
        f28216x = a(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f28217y = fVar;
        f28218z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        C0544p c0544p = new C0544p();
        N = c0544p;
        O = b(UUID.class, c0544p);
        lg.a0<Currency> a0VarNullSafe6 = new q().nullSafe();
        P = a0VarNullSafe6;
        Q = b(Currency.class, a0VarNullSafe6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        og.f fVar2 = og.f.f28135a;
        V = fVar2;
        W = e(lg.l.class, fVar2);
        X = og.d.f28129d;
    }

    public static <TT> lg.b0 a(Class<TT> cls, Class<TT> cls2, lg.a0<? super TT> a0Var) {
        return new w(cls, cls2, a0Var);
    }

    public static <TT> lg.b0 b(Class<TT> cls, lg.a0<TT> a0Var) {
        return new u(cls, a0Var);
    }

    public static <TT> lg.b0 c(sg.a<TT> aVar, lg.a0<TT> a0Var) {
        return new t(aVar, a0Var);
    }

    public static <TT> lg.b0 d(Class<TT> cls, Class<? extends TT> cls2, lg.a0<? super TT> a0Var) {
        return new x(cls, cls2, a0Var);
    }

    public static <T1> lg.b0 e(Class<T1> cls, lg.a0<T1> a0Var) {
        return new y(cls, a0Var);
    }
}

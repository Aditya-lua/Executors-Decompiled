package og;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import lg.r;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends tg.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Reader f28137u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f28138v = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f28139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f28141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f28142t;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28143a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f28143a = iArr;
            try {
                iArr[tg.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28143a[tg.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28143a[tg.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28143a[tg.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(lg.l lVar) {
        super(f28137u);
        this.f28139q = new Object[32];
        this.f28140r = 0;
        this.f28141s = new String[32];
        this.f28142t = new int[32];
        I0(lVar);
    }

    private String u() {
        return " at path " + x();
    }

    @Override // tg.a
    public long A() throws tg.d {
        tg.b bVarQ = Q();
        tg.b bVar = tg.b.NUMBER;
        if (bVarQ != bVar && bVarQ != tg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarQ + u());
        }
        long jI = ((r) E0()).i();
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jI;
    }

    public final String A0(boolean z10) {
        x0(tg.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E0()).next();
        String str = (String) entry.getKey();
        this.f28141s[this.f28140r - 1] = z10 ? "<skipped>" : str;
        I0(entry.getValue());
        return str;
    }

    @Override // tg.a
    public String E() {
        return A0(false);
    }

    public final Object E0() {
        return this.f28139q[this.f28140r - 1];
    }

    public final Object F0() {
        Object[] objArr = this.f28139q;
        int i10 = this.f28140r - 1;
        this.f28140r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public void G0() {
        x0(tg.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E0()).next();
        I0(entry.getValue());
        I0(new r((String) entry.getKey()));
    }

    public final void I0(Object obj) {
        int i10 = this.f28140r;
        Object[] objArr = this.f28139q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f28139q = Arrays.copyOf(objArr, i11);
            this.f28142t = Arrays.copyOf(this.f28142t, i11);
            this.f28141s = (String[]) Arrays.copyOf(this.f28141s, i11);
        }
        Object[] objArr2 = this.f28139q;
        int i12 = this.f28140r;
        this.f28140r = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // tg.a
    public void K() {
        x0(tg.b.NULL);
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // tg.a
    public String N() throws tg.d {
        tg.b bVarQ = Q();
        tg.b bVar = tg.b.STRING;
        if (bVarQ == bVar || bVarQ == tg.b.NUMBER) {
            String strL = ((r) F0()).l();
            int i10 = this.f28140r;
            if (i10 > 0) {
                int[] iArr = this.f28142t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strL;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarQ + u());
    }

    @Override // tg.a
    public tg.b Q() throws tg.d {
        if (this.f28140r == 0) {
            return tg.b.END_DOCUMENT;
        }
        Object objE0 = E0();
        if (objE0 instanceof Iterator) {
            boolean z10 = this.f28139q[this.f28140r - 2] instanceof lg.o;
            Iterator it = (Iterator) objE0;
            if (!it.hasNext()) {
                return z10 ? tg.b.END_OBJECT : tg.b.END_ARRAY;
            }
            if (z10) {
                return tg.b.NAME;
            }
            I0(it.next());
            return Q();
        }
        if (objE0 instanceof lg.o) {
            return tg.b.BEGIN_OBJECT;
        }
        if (objE0 instanceof lg.i) {
            return tg.b.BEGIN_ARRAY;
        }
        if (objE0 instanceof r) {
            r rVar = (r) objE0;
            if (rVar.D()) {
                return tg.b.STRING;
            }
            if (rVar.A()) {
                return tg.b.BOOLEAN;
            }
            if (rVar.C()) {
                return tg.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objE0 instanceof lg.n) {
            return tg.b.NULL;
        }
        if (objE0 == f28138v) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new tg.d("Custom JsonElement subclass " + objE0.getClass().getName() + " is not supported");
    }

    @Override // tg.a
    public void b() {
        x0(tg.b.BEGIN_ARRAY);
        I0(((lg.i) E0()).iterator());
        this.f28142t[this.f28140r - 1] = 0;
    }

    @Override // tg.a
    public void c() {
        x0(tg.b.BEGIN_OBJECT);
        I0(((lg.o) E0()).D().iterator());
    }

    @Override // tg.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28139q = new Object[]{f28138v};
        this.f28140r = 1;
    }

    @Override // tg.a
    public void g() {
        x0(tg.b.END_ARRAY);
        F0();
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // tg.a
    public void h() {
        x0(tg.b.END_OBJECT);
        this.f28141s[this.f28140r - 1] = null;
        F0();
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String m(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f28140r;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f28139q;
            Object obj = objArr[i10];
            if (obj instanceof lg.i) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f28142t[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof lg.o) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f28141s[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // tg.a
    public String n() {
        return m(true);
    }

    @Override // tg.a
    public void n0() throws tg.d {
        int i10 = b.f28143a[Q().ordinal()];
        if (i10 == 1) {
            A0(true);
            return;
        }
        if (i10 == 2) {
            g();
            return;
        }
        if (i10 == 3) {
            h();
            return;
        }
        if (i10 != 4) {
            F0();
            int i11 = this.f28140r;
            if (i11 > 0) {
                int[] iArr = this.f28142t;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // tg.a
    public boolean p() throws tg.d {
        tg.b bVarQ = Q();
        return (bVarQ == tg.b.END_OBJECT || bVarQ == tg.b.END_ARRAY || bVarQ == tg.b.END_DOCUMENT) ? false : true;
    }

    @Override // tg.a
    public String toString() {
        return g.class.getSimpleName() + u();
    }

    @Override // tg.a
    public boolean w() {
        x0(tg.b.BOOLEAN);
        boolean zB = ((r) F0()).b();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zB;
    }

    @Override // tg.a
    public String x() {
        return m(false);
    }

    public final void x0(tg.b bVar) {
        if (Q() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + Q() + u());
    }

    @Override // tg.a
    public double y() throws tg.d {
        tg.b bVarQ = Q();
        tg.b bVar = tg.b.NUMBER;
        if (bVarQ != bVar && bVarQ != tg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarQ + u());
        }
        double dC = ((r) E0()).c();
        if (!r() && (Double.isNaN(dC) || Double.isInfinite(dC))) {
            throw new tg.d("JSON forbids NaN and infinities: " + dC);
        }
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dC;
    }

    @Override // tg.a
    public int z() throws tg.d {
        tg.b bVarQ = Q();
        tg.b bVar = tg.b.NUMBER;
        if (bVarQ != bVar && bVarQ != tg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarQ + u());
        }
        int iE = ((r) E0()).e();
        F0();
        int i10 = this.f28140r;
        if (i10 > 0) {
            int[] iArr = this.f28142t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iE;
    }

    public lg.l z0() throws tg.d {
        tg.b bVarQ = Q();
        if (bVarQ != tg.b.NAME && bVarQ != tg.b.END_ARRAY && bVarQ != tg.b.END_OBJECT && bVarQ != tg.b.END_DOCUMENT) {
            lg.l lVar = (lg.l) E0();
            n0();
            return lVar;
        }
        throw new IllegalStateException("Unexpected " + bVarQ + " when reading a JsonElement.");
    }
}

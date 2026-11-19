package hn;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18338a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f18339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18342f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18343a;

        static {
            int[] iArr = new int[c.values().length];
            f18343a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18343a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18343a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18343a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18343a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18343a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f18344a;
        public final ew.z b;

        public b(String[] strArr, ew.z zVar) {
            this.f18344a = strArr;
            this.b = zVar;
        }

        public static b a(String... strArr) {
            try {
                ew.h[] hVarArr = new ew.h[strArr.length];
                ew.e eVar = new ew.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    p.i0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.J2();
                }
                return new b((String[]) strArr.clone(), ew.z.j(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public m() {
        this.b = new int[32];
        this.f18339c = new String[32];
        this.f18340d = new int[32];
    }

    public static m u(ew.g gVar) {
        return new o(gVar);
    }

    public final void A(int i10) {
        int i11 = this.f18338a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new j("Nesting too deep at " + x());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18339c;
            this.f18339c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18340d;
            this.f18340d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f18338a;
        this.f18338a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final Object E() {
        switch (a.f18343a[w().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (f()) {
                    arrayList.add(E());
                }
                c();
                return arrayList;
            case 2:
                u uVar = new u();
                b();
                while (f()) {
                    String strO = o();
                    Object objE = E();
                    Object objPut = uVar.put(strO, objE);
                    if (objPut != null) {
                        throw new j("Map key '" + strO + "' has multiple values at path " + x() + ": " + objPut + " and " + objE);
                    }
                }
                d();
                return uVar;
            case 3:
                return s();
            case 4:
                return Double.valueOf(k());
            case 5:
                return Boolean.valueOf(h());
            case 6:
                return p();
            default:
                throw new IllegalStateException("Expected a value but was " + w() + " at path " + x());
        }
    }

    public abstract int I(b bVar);

    public abstract int K(b bVar);

    public final void L(boolean z10) {
        this.f18342f = z10;
    }

    public final void N(boolean z10) {
        this.f18341e = z10;
    }

    public abstract void O();

    public abstract void Q();

    public final k T(String str) throws k {
        throw new k(str + " at path " + x());
    }

    public final j Y(Object obj, Object obj2) {
        if (obj == null) {
            return new j("Expected " + obj2 + " but was null at path " + x());
        }
        return new j("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + x());
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final boolean e() {
        return this.f18342f;
    }

    public abstract boolean f();

    public final boolean g() {
        return this.f18341e;
    }

    public abstract boolean h();

    public abstract double k();

    public abstract int m();

    public abstract long n();

    public abstract String o();

    public abstract <T> T p();

    public abstract ew.g r();

    public abstract String s();

    public abstract c w();

    public final String x() {
        return n.a(this.f18338a, this.b, this.f18339c, this.f18340d);
    }

    public abstract m y();

    public abstract void z();

    public m(m mVar) {
        this.f18338a = mVar.f18338a;
        this.b = (int[]) mVar.b.clone();
        this.f18339c = (String[]) mVar.f18339c.clone();
        this.f18340d = (int[]) mVar.f18340d.clone();
        this.f18341e = mVar.f18341e;
        this.f18342f = mVar.f18342f;
    }
}

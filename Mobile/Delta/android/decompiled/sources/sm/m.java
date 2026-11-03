package sm;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import vu.f0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31583a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f31584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f31585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31587f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31588a;

        static {
            int[] iArr = new int[c.values().length];
            f31588a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31588a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31588a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31588a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31588a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31588a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f31589a;
        public final f0 b;

        public b(String[] strArr, f0 f0Var) {
            this.f31589a = strArr;
            this.b = f0Var;
        }

        public static b a(String... strArr) {
            try {
                vu.h[] hVarArr = new vu.h[strArr.length];
                vu.e eVar = new vu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    p.f0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.G2();
                }
                return new b((String[]) strArr.clone(), f0.l(hVarArr));
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
        this.f31584c = new String[32];
        this.f31585d = new int[32];
    }

    public static m s(vu.g gVar) {
        return new o(gVar);
    }

    public final Object A() {
        switch (a.f31588a[u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (f()) {
                    arrayList.add(A());
                }
                c();
                return arrayList;
            case 2:
                u uVar = new u();
                b();
                while (f()) {
                    String strN = n();
                    Object objA = A();
                    Object objPut = uVar.put(strN, objA);
                    if (objPut != null) {
                        throw new j("Map key '" + strN + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objA);
                    }
                }
                d();
                return uVar;
            case 3:
                return r();
            case 4:
                return Double.valueOf(j());
            case 5:
                return Boolean.valueOf(h());
            case 6:
                return o();
            default:
                throw new IllegalStateException("Expected a value but was " + u() + " at path " + getPath());
        }
    }

    public abstract int F(b bVar);

    public abstract int H(b bVar);

    public final void I(boolean z10) {
        this.f31587f = z10;
    }

    public final void L(boolean z10) {
        this.f31586e = z10;
    }

    public abstract void M();

    public abstract void P();

    public final k U(String str) throws k {
        throw new k(str + " at path " + getPath());
    }

    public final j W(Object obj, Object obj2) {
        if (obj == null) {
            return new j("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new j("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final boolean e() {
        return this.f31587f;
    }

    public abstract boolean f();

    public final boolean g() {
        return this.f31586e;
    }

    public final String getPath() {
        return n.a(this.f31583a, this.b, this.f31584c, this.f31585d);
    }

    public abstract boolean h();

    public abstract double j();

    public abstract int l();

    public abstract long m();

    public abstract String n();

    public abstract <T> T o();

    public abstract vu.g q();

    public abstract String r();

    public abstract c u();

    public abstract m v();

    public abstract void w();

    public final void x(int i10) {
        int i11 = this.f31583a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new j("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f31584c;
            this.f31584c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f31585d;
            this.f31585d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f31583a;
        this.f31583a = i12 + 1;
        iArr3[i12] = i10;
    }

    public m(m mVar) {
        this.f31583a = mVar.f31583a;
        this.b = (int[]) mVar.b.clone();
        this.f31584c = (String[]) mVar.f31584c.clone();
        this.f31585d = (int[]) mVar.f31585d.clone();
        this.f31586e = mVar.f31586e;
        this.f31587f = mVar.f31587f;
    }
}

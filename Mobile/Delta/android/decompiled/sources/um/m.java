package um;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import xu.f0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32393a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f32394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f32395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32397f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32398a;

        static {
            int[] iArr = new int[c.values().length];
            f32398a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32398a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32398a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32398a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32398a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32398a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f32399a;
        public final f0 b;

        public b(String[] strArr, f0 f0Var) {
            this.f32399a = strArr;
            this.b = f0Var;
        }

        public static b a(String... strArr) {
            try {
                xu.h[] hVarArr = new xu.h[strArr.length];
                xu.e eVar = new xu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    p.i0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.F2();
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
        this.f32394c = new String[32];
        this.f32395d = new int[32];
    }

    public static m s(xu.g gVar) {
        return new o(gVar);
    }

    public final Object B() {
        switch (a.f32398a[u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (f()) {
                    arrayList.add(B());
                }
                c();
                return arrayList;
            case 2:
                u uVar = new u();
                b();
                while (f()) {
                    String strN = n();
                    Object objB = B();
                    Object objPut = uVar.put(strN, objB);
                    if (objPut != null) {
                        throw new j("Map key '" + strN + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objB);
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
        this.f32397f = z10;
    }

    public final void L(boolean z10) {
        this.f32396e = z10;
    }

    public abstract void M();

    public abstract void P();

    public final k U(String str) throws k {
        throw new k(str + " at path " + getPath());
    }

    public final j X(Object obj, Object obj2) {
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
        return this.f32397f;
    }

    public abstract boolean f();

    public final boolean g() {
        return this.f32396e;
    }

    public final String getPath() {
        return n.a(this.f32393a, this.b, this.f32394c, this.f32395d);
    }

    public abstract boolean h();

    public abstract double j();

    public abstract int l();

    public abstract long m();

    public abstract String n();

    public abstract <T> T o();

    public abstract xu.g q();

    public abstract String r();

    public abstract c u();

    public abstract m v();

    public abstract void w();

    public final void y(int i10) {
        int i11 = this.f32393a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new j("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32394c;
            this.f32394c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32395d;
            this.f32395d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f32393a;
        this.f32393a = i12 + 1;
        iArr3[i12] = i10;
    }

    public m(m mVar) {
        this.f32393a = mVar.f32393a;
        this.b = (int[]) mVar.b.clone();
        this.f32394c = (String[]) mVar.f32394c.clone();
        this.f32395d = (int[]) mVar.f32395d.clone();
        this.f32396e = mVar.f32396e;
        this.f32397f = mVar.f32397f;
    }
}

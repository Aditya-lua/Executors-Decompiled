package p471um;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p560xu.C12924e;
import p560xu.C12927f0;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: um.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11878m implements Closeable {

    /* JADX INFO: renamed from: a */
    public int f42108a;

    /* JADX INFO: renamed from: b */
    public int[] f42109b;

    /* JADX INFO: renamed from: c */
    public String[] f42110c;

    /* JADX INFO: renamed from: d */
    public int[] f42111d;

    /* JADX INFO: renamed from: e */
    public boolean f42112e;

    /* JADX INFO: renamed from: f */
    public boolean f42113f;

    /* JADX INFO: renamed from: um.m$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42114a;

        static {
            int[] iArr = new int[c.values().length];
            f42114a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42114a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42114a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42114a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42114a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42114a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: um.m$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String[] f42115a;

        /* JADX INFO: renamed from: b */
        public final C12927f0 f42116b;

        public b(String[] strArr, C12927f0 c12927f0) {
            this.f42115a = strArr;
            this.f42116b = c12927f0;
        }

        /* JADX INFO: renamed from: a */
        public static b m44343a(String... strArr) {
            try {
                C12930h[] c12930hArr = new C12930h[strArr.length];
                C12924e c12924e = new C12924e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    C11881p.m44362i0(c12924e, strArr[i10]);
                    c12924e.readByte();
                    c12930hArr[i10] = c12924e.mo47997F2();
                }
                return new b((String[]) strArr.clone(), C12927f0.m48066l(c12930hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: renamed from: um.m$c */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC11878m() {
        this.f42109b = new int[32];
        this.f42110c = new String[32];
        this.f42111d = new int[32];
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC11878m m44314s(InterfaceC12928g interfaceC12928g) {
        return new C11880o(interfaceC12928g);
    }

    /* JADX INFO: renamed from: B */
    public final Object m44315B() {
        switch (a.f42114a[mo44339u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo44324a();
                while (mo44329f()) {
                    arrayList.add(m44315B());
                }
                mo44326c();
                return arrayList;
            case 2:
                C11886u c11886u = new C11886u();
                mo44325b();
                while (mo44329f()) {
                    String strMo44335n = mo44335n();
                    Object objM44315B = m44315B();
                    Object objPut = c11886u.put(strMo44335n, objM44315B);
                    if (objPut != null) {
                        throw new C11875j("Map key '" + strMo44335n + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objM44315B);
                    }
                }
                mo44327d();
                return c11886u;
            case 3:
                return mo44338r();
            case 4:
                return Double.valueOf(mo44332j());
            case 5:
                return Boolean.valueOf(mo44331h());
            case 6:
                return mo44336o();
            default:
                throw new IllegalStateException("Expected a value but was " + mo44339u() + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract int mo44316F(b bVar);

    /* JADX INFO: renamed from: H */
    public abstract int mo44317H(b bVar);

    /* JADX INFO: renamed from: I */
    public final void m44318I(boolean z10) {
        this.f42113f = z10;
    }

    /* JADX INFO: renamed from: L */
    public final void m44319L(boolean z10) {
        this.f42112e = z10;
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo44320M();

    /* JADX INFO: renamed from: P */
    public abstract void mo44321P();

    /* JADX INFO: renamed from: U */
    public final C11876k m44322U(String str) throws C11876k {
        throw new C11876k(str + " at path " + getPath());
    }

    /* JADX INFO: renamed from: X */
    public final C11875j m44323X(Object obj, Object obj2) {
        if (obj == null) {
            return new C11875j("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new C11875j("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo44324a();

    /* JADX INFO: renamed from: b */
    public abstract void mo44325b();

    /* JADX INFO: renamed from: c */
    public abstract void mo44326c();

    /* JADX INFO: renamed from: d */
    public abstract void mo44327d();

    /* JADX INFO: renamed from: e */
    public final boolean m44328e() {
        return this.f42113f;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo44329f();

    /* JADX INFO: renamed from: g */
    public final boolean m44330g() {
        return this.f42112e;
    }

    public final String getPath() {
        return C11879n.m44345a(this.f42108a, this.f42109b, this.f42110c, this.f42111d);
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo44331h();

    /* JADX INFO: renamed from: j */
    public abstract double mo44332j();

    /* JADX INFO: renamed from: l */
    public abstract int mo44333l();

    /* JADX INFO: renamed from: m */
    public abstract long mo44334m();

    /* JADX INFO: renamed from: n */
    public abstract String mo44335n();

    /* JADX INFO: renamed from: o */
    public abstract <T> T mo44336o();

    /* JADX INFO: renamed from: q */
    public abstract InterfaceC12928g mo44337q();

    /* JADX INFO: renamed from: r */
    public abstract String mo44338r();

    /* JADX INFO: renamed from: u */
    public abstract c mo44339u();

    /* JADX INFO: renamed from: v */
    public abstract AbstractC11878m mo44340v();

    /* JADX INFO: renamed from: w */
    public abstract void mo44341w();

    /* JADX INFO: renamed from: y */
    public final void m44342y(int i10) {
        int i11 = this.f42108a;
        int[] iArr = this.f42109b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C11875j("Nesting too deep at " + getPath());
            }
            this.f42109b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42110c;
            this.f42110c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f42111d;
            this.f42111d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f42109b;
        int i12 = this.f42108a;
        this.f42108a = i12 + 1;
        iArr3[i12] = i10;
    }

    public AbstractC11878m(AbstractC11878m abstractC11878m) {
        this.f42108a = abstractC11878m.f42108a;
        this.f42109b = (int[]) abstractC11878m.f42109b.clone();
        this.f42110c = (String[]) abstractC11878m.f42110c.clone();
        this.f42111d = (int[]) abstractC11878m.f42111d.clone();
        this.f42112e = abstractC11878m.f42112e;
        this.f42113f = abstractC11878m.f42113f;
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {
    public static final g b = new j(z.f2400d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f2164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<g> f2165d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2166a = 0;

    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2167a = 0;
        public final int b;

        public a() {
            this.b = g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0032g
        public byte c() {
            int i10 = this.f2167a;
            if (i10 >= this.b) {
                throw new NoSuchElementException();
            }
            this.f2167a = i10 + 1;
            return g.this.i(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2167a < this.b;
        }
    }

    public class b implements Comparator<g> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0032g it = gVar.iterator();
            InterfaceC0032g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(g.y(it.c())).compareTo(Integer.valueOf(g.y(it2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    public static abstract class c implements InterfaceC0032g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f2170g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.d(i10, i10 + i11, bArr.length);
            this.f2169f = i10;
            this.f2170g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        public int E() {
            return this.f2169f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            g.c(i10, size());
            return this.f2172e[this.f2169f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2172e, E() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte i(int i10) {
            return this.f2172e[this.f2169f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f2170g;
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0032g extends Iterator<Byte> {
        byte c();
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.datastore.preferences.protobuf.j f2171a;
        public final byte[] b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public g a() {
            this.f2171a.c();
            return new j(this.b);
        }

        public androidx.datastore.preferences.protobuf.j b() {
            return this.f2171a;
        }

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.b = bArr;
            this.f2171a = androidx.datastore.preferences.protobuf.j.f0(bArr);
        }
    }

    public static abstract class i extends g {
        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        public i() {
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f2172e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f2172e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void C(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f2172e, E(), size());
        }

        public final boolean D(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.u(i10, i12).equals(u(0, i11));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f2172e;
            byte[] bArr2 = jVar.f2172e;
            int iE = E() + i11;
            int iE2 = E();
            int iE3 = jVar.E() + i10;
            while (iE2 < iE) {
                if (bArr[iE2] != bArr2[iE3]) {
                    return false;
                }
                iE2++;
                iE3++;
            }
            return true;
        }

        public int E() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            return this.f2172e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iT = t();
            int iT2 = jVar.t();
            if (iT == 0 || iT2 == 0 || iT == iT2) {
                return D(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2172e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte i(int i10) {
            return this.f2172e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h m() {
            return androidx.datastore.preferences.protobuf.h.k(this.f2172e, E(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int p(int i10, int i11, int i12) {
            return z.h(i10, this.f2172e, E() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f2172e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g u(int i10, int i11) {
            int iD = g.d(i10, i11, size());
            return iD == 0 ? g.b : new e(this.f2172e, E() + i10, iD);
        }
    }

    public static final class k implements f {
        public k() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f2164c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f2165d = new b();
    }

    public static g A(byte[] bArr) {
        return new j(bArr);
    }

    public static g B(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static void c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static g e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static g f(byte[] bArr, int i10, int i11) {
        d(i10, i10 + i11, bArr.length);
        return new j(f2164c.a(bArr, i10, i11));
    }

    public static g g(String str) {
        return new j(str.getBytes(z.b));
    }

    public static h l(int i10) {
        return new h(i10, null);
    }

    public static int y(byte b10) {
        return b10 & 255;
    }

    public abstract void C(androidx.datastore.preferences.protobuf.f fVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public abstract void h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iP = this.f2166a;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f2166a = iP;
        }
        return iP;
    }

    public abstract byte i(int i10);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC0032g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.h m();

    public abstract int p(int i10, int i11, int i12);

    public abstract int size();

    public final int t() {
        return this.f2166a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    public abstract g u(int i10, int i11);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return z.f2400d;
        }
        byte[] bArr = new byte[size];
        h(bArr, 0, 0, size);
        return bArr;
    }

    public final String z() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(u(0, 47)) + "...";
    }
}

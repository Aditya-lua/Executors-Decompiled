package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements Iterable<Byte>, Serializable {
    public static final h b = new j(a0.f8390d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<h> f8437d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8438a = 0;

    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8439a = 0;
        public final int b;

        public a() {
            this.b = h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.g
        public byte c() {
            int i10 = this.f8439a;
            if (i10 >= this.b) {
                throw new NoSuchElementException();
            }
            this.f8439a = i10 + 1;
            return h.this.i(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8439a < this.b;
        }
    }

    public class b implements Comparator<h> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(h.y(it.c())).compareTo(Integer.valueOf(h.y(it2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    public static abstract class c implements g {
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

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8442g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.d(i10, i10 + i11, bArr.length);
            this.f8441f = i10;
            this.f8442g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j
        public int E() {
            return this.f8441f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte b(int i10) {
            h.c(i10, size());
            return this.f8444e[this.f8441f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f8444e, E() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte i(int i10) {
            return this.f8444e[this.f8441f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f8442g;
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface g extends Iterator<Byte> {
        byte c();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    public static final class C0127h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.crypto.tink.shaded.protobuf.k f8443a;
        public final byte[] b;

        public /* synthetic */ C0127h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f8443a.c();
            return new j(this.b);
        }

        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.f8443a;
        }

        public C0127h(int i10) {
            byte[] bArr = new byte[i10];
            this.b = bArr;
            this.f8443a = com.google.crypto.tink.shaded.protobuf.k.f0(bArr);
        }
    }

    public static abstract class i extends h {
        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        public i() {
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f8444e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f8444e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final void C(com.google.crypto.tink.shaded.protobuf.g gVar) {
            gVar.a(this.f8444e, E(), size());
        }

        public final boolean D(h hVar, int i10, int i11) {
            if (i11 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
            }
            if (!(hVar instanceof j)) {
                return hVar.u(i10, i12).equals(u(0, i11));
            }
            j jVar = (j) hVar;
            byte[] bArr = this.f8444e;
            byte[] bArr2 = jVar.f8444e;
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

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte b(int i10) {
            return this.f8444e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
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

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f8444e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte i(int i10) {
            return this.f8444e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final com.google.crypto.tink.shaded.protobuf.i m() {
            return com.google.crypto.tink.shaded.protobuf.i.k(this.f8444e, E(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final int p(int i10, int i11, int i12) {
            return a0.h(i10, this.f8444e, E() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f8444e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final h u(int i10, int i11) {
            int iD = h.d(i10, i11, size());
            return iD == 0 ? h.b : new e(this.f8444e, E() + i10, iD);
        }
    }

    public static final class k implements f {
        public k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
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
        f8436c = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f8437d = new b();
    }

    public static h A(byte[] bArr) {
        return new j(bArr);
    }

    public static h B(byte[] bArr, int i10, int i11) {
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

    public static h e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static h f(byte[] bArr, int i10, int i11) {
        d(i10, i10 + i11, bArr.length);
        return new j(f8436c.a(bArr, i10, i11));
    }

    public static h g(String str) {
        return new j(str.getBytes(a0.b));
    }

    public static C0127h l(int i10) {
        return new C0127h(i10, null);
    }

    public static int y(byte b10) {
        return b10 & 255;
    }

    public abstract void C(com.google.crypto.tink.shaded.protobuf.g gVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public abstract void h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iP = this.f8438a;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f8438a = iP;
        }
        return iP;
    }

    public abstract byte i(int i10);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract com.google.crypto.tink.shaded.protobuf.i m();

    public abstract int p(int i10, int i11, int i12);

    public abstract int size();

    public final int t() {
        return this.f8438a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    public abstract h u(int i10, int i11);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return a0.f8390d;
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

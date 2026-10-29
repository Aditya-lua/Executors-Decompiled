package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2920h implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2920h f10853b = new j(C2900a0.f10797d);

    /* JADX INFO: renamed from: c */
    public static final f f10854c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<AbstractC2920h> f10855d;

    /* JADX INFO: renamed from: a */
    public int f10856a = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    public class a extends c {

        /* JADX INFO: renamed from: a */
        public int f10857a = 0;

        /* JADX INFO: renamed from: b */
        public final int f10858b;

        public a() {
            this.f10858b = AbstractC2920h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.g
        /* JADX INFO: renamed from: c */
        public byte mo13571c() {
            int i10 = this.f10857a;
            if (i10 >= this.f10858b) {
                throw new NoSuchElementException();
            }
            this.f10857a = i10 + 1;
            return AbstractC2920h.this.mo13563i(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10857a < this.f10858b;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    public class b implements Comparator<AbstractC2920h> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2920h abstractC2920h, AbstractC2920h abstractC2920h2) {
            g it = abstractC2920h.iterator();
            g it2 = abstractC2920h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2920h.m13559y(it.mo13571c())).compareTo(Integer.valueOf(AbstractC2920h.m13559y(it2.mo13571c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2920h.size()).compareTo(Integer.valueOf(abstractC2920h2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    public static abstract class c implements g {
        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo13571c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    public static final class d implements f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.f
        /* JADX INFO: renamed from: a */
        public byte[] mo13574a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.google.crypto.tink.shaded.protobuf.h.d.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    public static final class e extends j {

        /* JADX INFO: renamed from: f */
        public final int f10860f;

        /* JADX INFO: renamed from: g */
        public final int f10861g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2920h.m13554d(i10, i10 + i11, bArr.length);
            this.f10860f = i10;
            this.f10861g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.j
        /* JADX INFO: renamed from: E */
        public int mo13575E() {
            return this.f10860f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: b */
        public byte mo13561b(int i10) {
            AbstractC2920h.m13553c(i10, size());
            return this.f10864e[this.f10860f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: h */
        public void mo13562h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f10864e, mo13575E() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: i */
        public byte mo13563i(int i10) {
            return this.f10864e[this.f10860f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        public int size() {
            return this.f10861g;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        byte[] mo13574a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        /* JADX INFO: renamed from: c */
        byte mo13571c();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final AbstractC2929k f10862a;

        /* JADX INFO: renamed from: b */
        public final byte[] f10863b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] (LINE:1) call: com.google.crypto.tink.shaded.protobuf.h.h.<init>(int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* JADX INFO: renamed from: a */
        public AbstractC2920h m13576a() {
            this.f10862a.m13829c();
            return new j(this.f10863b);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC2929k m13577b() {
            return this.f10862a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f10863b = bArr;
            this.f10862a = AbstractC2929k.m13787f0(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    public static abstract class i extends AbstractC2920h {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.google.crypto.tink.shaded.protobuf.h.i.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ i(a aVar) {
            this();
        }

        /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public i() {
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    public static class j extends i {

        /* JADX INFO: renamed from: e */
        public final byte[] f10864e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f10864e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: C */
        public final void mo13560C(AbstractC2917g abstractC2917g) {
            abstractC2917g.mo13536a(this.f10864e, mo13575E(), size());
        }

        /* JADX INFO: renamed from: D */
        public final boolean m13578D(AbstractC2920h abstractC2920h, int i10, int i11) {
            if (i11 > abstractC2920h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2920h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2920h.size());
            }
            if (!(abstractC2920h instanceof j)) {
                return abstractC2920h.mo13568u(i10, i12).equals(mo13568u(0, i11));
            }
            j jVar = (j) abstractC2920h;
            byte[] bArr = this.f10864e;
            byte[] bArr2 = jVar.f10864e;
            int iMo13575E = mo13575E() + i11;
            int iMo13575E2 = mo13575E();
            int iMo13575E3 = jVar.mo13575E() + i10;
            while (iMo13575E2 < iMo13575E) {
                if (bArr[iMo13575E2] != bArr2[iMo13575E3]) {
                    return false;
                }
                iMo13575E2++;
                iMo13575E3++;
            }
            return true;
        }

        /* JADX INFO: renamed from: E */
        public int mo13575E() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: b */
        public byte mo13561b(int i10) {
            return this.f10864e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2920h) || size() != ((AbstractC2920h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iM13567t = m13567t();
            int iM13567t2 = jVar.m13567t();
            if (iM13567t == 0 || iM13567t2 == 0 || iM13567t == iM13567t2) {
                return m13578D(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: h */
        public void mo13562h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f10864e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: i */
        public byte mo13563i(int i10) {
            return this.f10864e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: m */
        public final AbstractC2923i mo13565m() {
            return AbstractC2923i.m13587k(this.f10864e, mo13575E(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: p */
        public final int mo13566p(int i10, int i11, int i12) {
            return C2900a0.m13386h(i10, this.f10864e, mo13575E() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        public int size() {
            return this.f10864e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h
        /* JADX INFO: renamed from: u */
        public final AbstractC2920h mo13568u(int i10, int i11) {
            int iM13554d = AbstractC2920h.m13554d(i10, i11, size());
            return iM13554d == 0 ? AbstractC2920h.f10853b : new e(this.f10864e, mo13575E() + i10, iM13554d);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    public static final class k implements f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2920h.f
        /* JADX INFO: renamed from: a */
        public byte[] mo13574a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.google.crypto.tink.shaded.protobuf.h.k.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f10854c = C2908d.m13418c() ? new k(aVar) : new d(aVar);
        f10855d = new b();
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC2920h m13550A(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC2920h m13551B(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static void m13553c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m13554d(int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: e */
    public static AbstractC2920h m13555e(byte[] bArr) {
        return m13556f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC2920h m13556f(byte[] bArr, int i10, int i11) {
        m13554d(i10, i10 + i11, bArr.length);
        return new j(f10854c.mo13574a(bArr, i10, i11));
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC2920h m13557g(String str) {
        return new j(str.getBytes(C2900a0.f10795b));
    }

    /* JADX INFO: renamed from: l */
    public static h m13558l(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: renamed from: y */
    public static int m13559y(byte b10) {
        return b10 & 255;
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo13560C(AbstractC2917g abstractC2917g);

    /* JADX INFO: renamed from: b */
    public abstract byte mo13561b(int i10);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo13562h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iMo13566p = this.f10856a;
        if (iMo13566p == 0) {
            int size = size();
            iMo13566p = mo13566p(size, 0, size);
            if (iMo13566p == 0) {
                iMo13566p = 1;
            }
            this.f10856a = iMo13566p;
        }
        return iMo13566p;
    }

    /* JADX INFO: renamed from: i */
    public abstract byte mo13563i(int i10);

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC2923i mo13565m();

    /* JADX INFO: renamed from: p */
    public abstract int mo13566p(int i10, int i11, int i12);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public final int m13567t() {
        return this.f10856a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m13570z());
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC2920h mo13568u(int i10, int i11);

    /* JADX INFO: renamed from: x */
    public final byte[] m13569x() {
        int size = size();
        if (size == 0) {
            return C2900a0.f10797d;
        }
        byte[] bArr = new byte[size];
        mo13562h(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: z */
    public final String m13570z() {
        if (size() <= 50) {
            return C2934l1.m13956a(this);
        }
        return C2934l1.m13956a(mo13568u(0, 47)) + "...";
    }
}

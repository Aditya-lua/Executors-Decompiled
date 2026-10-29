package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0840g implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC0840g f2854b = new j(C0892z.f3160d);

    /* JADX INFO: renamed from: c */
    public static final f f2855c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<AbstractC0840g> f2856d;

    /* JADX INFO: renamed from: a */
    public int f2857a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$a */
    public class a extends c {

        /* JADX INFO: renamed from: a */
        public int f2858a = 0;

        /* JADX INFO: renamed from: b */
        public final int f2859b;

        public a() {
            this.f2859b = AbstractC0840g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.g
        /* JADX INFO: renamed from: c */
        public byte mo3459c() {
            int i10 = this.f2858a;
            if (i10 >= this.f2859b) {
                throw new NoSuchElementException();
            }
            this.f2858a = i10 + 1;
            return AbstractC0840g.this.mo3451i(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2858a < this.f2859b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    public class b implements Comparator<AbstractC0840g> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0840g abstractC0840g, AbstractC0840g abstractC0840g2) {
            g it = abstractC0840g.iterator();
            g it2 = abstractC0840g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC0840g.m3447y(it.mo3459c())).compareTo(Integer.valueOf(AbstractC0840g.m3447y(it2.mo3459c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC0840g.size()).compareTo(Integer.valueOf(abstractC0840g2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static abstract class c implements g {
        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo3459c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d implements f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.f
        /* JADX INFO: renamed from: a */
        public byte[] mo3462a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.datastore.preferences.protobuf.g.d.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$e */
    public static final class e extends j {

        /* JADX INFO: renamed from: f */
        public final int f2861f;

        /* JADX INFO: renamed from: g */
        public final int f2862g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC0840g.m3442d(i10, i10 + i11, bArr.length);
            this.f2861f = i10;
            this.f2862g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.j
        /* JADX INFO: renamed from: E */
        public int mo3463E() {
            return this.f2861f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.j, androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: b */
        public byte mo3449b(int i10) {
            AbstractC0840g.m3441c(i10, size());
            return this.f2865e[this.f2861f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.j, androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: h */
        public void mo3450h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2865e, mo3463E() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.j, androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: i */
        public byte mo3451i(int i10) {
            return this.f2865e[this.f2861f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.j, androidx.datastore.preferences.protobuf.AbstractC0840g
        public int size() {
            return this.f2862g;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        byte[] mo3462a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g */
    public interface g extends Iterator<Byte> {
        /* JADX INFO: renamed from: c */
        byte mo3459c();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final AbstractC0849j f2863a;

        /* JADX INFO: renamed from: b */
        public final byte[] f2864b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] (LINE:1) call: androidx.datastore.preferences.protobuf.g.h.<init>(int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* JADX INFO: renamed from: a */
        public AbstractC0840g m3464a() {
            this.f2863a.m3707c();
            return new j(this.f2864b);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0849j m3465b() {
            return this.f2863a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f2864b = bArr;
            this.f2863a = AbstractC0849j.m3658f0(bArr);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$i */
    public static abstract class i extends AbstractC0840g {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.datastore.preferences.protobuf.g.i.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ i(a aVar) {
            this();
        }

        /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public i() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$j */
    public static class j extends i {

        /* JADX INFO: renamed from: e */
        public final byte[] f2865e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f2865e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: C */
        public final void mo3448C(AbstractC0837f abstractC0837f) {
            abstractC0837f.mo3392a(this.f2865e, mo3463E(), size());
        }

        /* JADX INFO: renamed from: D */
        public final boolean m3466D(AbstractC0840g abstractC0840g, int i10, int i11) {
            if (i11 > abstractC0840g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC0840g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC0840g.size());
            }
            if (!(abstractC0840g instanceof j)) {
                return abstractC0840g.mo3456u(i10, i12).equals(mo3456u(0, i11));
            }
            j jVar = (j) abstractC0840g;
            byte[] bArr = this.f2865e;
            byte[] bArr2 = jVar.f2865e;
            int iMo3463E = mo3463E() + i11;
            int iMo3463E2 = mo3463E();
            int iMo3463E3 = jVar.mo3463E() + i10;
            while (iMo3463E2 < iMo3463E) {
                if (bArr[iMo3463E2] != bArr2[iMo3463E3]) {
                    return false;
                }
                iMo3463E2++;
                iMo3463E3++;
            }
            return true;
        }

        /* JADX INFO: renamed from: E */
        public int mo3463E() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: b */
        public byte mo3449b(int i10) {
            return this.f2865e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0840g) || size() != ((AbstractC0840g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iM3455t = m3455t();
            int iM3455t2 = jVar.m3455t();
            if (iM3455t == 0 || iM3455t2 == 0 || iM3455t == iM3455t2) {
                return m3466D(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: h */
        public void mo3450h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2865e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: i */
        public byte mo3451i(int i10) {
            return this.f2865e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: m */
        public final AbstractC0843h mo3453m() {
            return AbstractC0843h.m3483k(this.f2865e, mo3463E(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: p */
        public final int mo3454p(int i10, int i11, int i12) {
            return C0892z.m4243h(i10, this.f2865e, mo3463E() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        public int size() {
            return this.f2865e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g
        /* JADX INFO: renamed from: u */
        public final AbstractC0840g mo3456u(int i10, int i11) {
            int iM3442d = AbstractC0840g.m3442d(i10, i11, size());
            return iM3442d == 0 ? AbstractC0840g.f2854b : new e(this.f2865e, mo3463E() + i10, iM3442d);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$k */
    public static final class k implements f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public k() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0840g.f
        /* JADX INFO: renamed from: a */
        public byte[] mo3462a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.datastore.preferences.protobuf.g.k.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f2855c = C0831d.m3370c() ? new k(aVar) : new d(aVar);
        f2856d = new b();
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC0840g m3438A(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC0840g m3439B(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static void m3441c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3442d(int i10, int i11, int i12) {
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
    public static AbstractC0840g m3443e(byte[] bArr) {
        return m3444f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0840g m3444f(byte[] bArr, int i10, int i11) {
        m3442d(i10, i10 + i11, bArr.length);
        return new j(f2855c.mo3462a(bArr, i10, i11));
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0840g m3445g(String str) {
        return new j(str.getBytes(C0892z.f3158b));
    }

    /* JADX INFO: renamed from: l */
    public static h m3446l(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: renamed from: y */
    public static int m3447y(byte b10) {
        return b10 & 255;
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo3448C(AbstractC0837f abstractC0837f);

    /* JADX INFO: renamed from: b */
    public abstract byte mo3449b(int i10);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo3450h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iMo3454p = this.f2857a;
        if (iMo3454p == 0) {
            int size = size();
            iMo3454p = mo3454p(size, 0, size);
            if (iMo3454p == 0) {
                iMo3454p = 1;
            }
            this.f2857a = iMo3454p;
        }
        return iMo3454p;
    }

    /* JADX INFO: renamed from: i */
    public abstract byte mo3451i(int i10);

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC0843h mo3453m();

    /* JADX INFO: renamed from: p */
    public abstract int mo3454p(int i10, int i11, int i12);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public final int m3455t() {
        return this.f2857a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m3458z());
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0840g mo3456u(int i10, int i11);

    /* JADX INFO: renamed from: x */
    public final byte[] m3457x() {
        int size = size();
        if (size == 0) {
            return C0892z.f3160d;
        }
        byte[] bArr = new byte[size];
        mo3450h(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: z */
    public final String m3458z() {
        if (size() <= 50) {
            return C0857l1.m3873a(this);
        }
        return C0857l1.m3873a(mo3456u(0, 47)) + "...";
    }
}

package p044c8;

import java.util.Arrays;
import p028b8.AbstractC1261i;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1555a extends AbstractC1560f {

    /* JADX INFO: renamed from: a */
    public final Iterable<AbstractC1261i> f6248a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6249b;

    /* JADX INFO: renamed from: c8.a$b */
    public static final class b extends AbstractC1560f.a {

        /* JADX INFO: renamed from: a */
        public Iterable<AbstractC1261i> f6250a;

        /* JADX INFO: renamed from: b */
        public byte[] f6251b;

        @Override // p044c8.AbstractC1560f.a
        /* JADX INFO: renamed from: a */
        public AbstractC1560f mo8150a() {
            String str = "";
            if (this.f6250a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C1555a(this.f6250a, this.f6251b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p044c8.AbstractC1560f.a
        /* JADX INFO: renamed from: b */
        public AbstractC1560f.a mo8151b(Iterable<AbstractC1261i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f6250a = iterable;
            return this;
        }

        @Override // p044c8.AbstractC1560f.a
        /* JADX INFO: renamed from: c */
        public AbstractC1560f.a mo8152c(byte[] bArr) {
            this.f6251b = bArr;
            return this;
        }
    }

    @Override // p044c8.AbstractC1560f
    /* JADX INFO: renamed from: b */
    public Iterable<AbstractC1261i> mo8148b() {
        return this.f6248a;
    }

    @Override // p044c8.AbstractC1560f
    /* JADX INFO: renamed from: c */
    public byte[] mo8149c() {
        return this.f6249b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1560f) {
            AbstractC1560f abstractC1560f = (AbstractC1560f) obj;
            if (this.f6248a.equals(abstractC1560f.mo8148b())) {
                if (Arrays.equals(this.f6249b, abstractC1560f instanceof C1555a ? ((C1555a) abstractC1560f).f6249b : abstractC1560f.mo8149c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6248a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6249b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f6248a + ", extras=" + Arrays.toString(this.f6249b) + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1555a(Iterable<AbstractC1261i> iterable, byte[] bArr) {
        this.f6248a = iterable;
        this.f6249b = bArr;
    }
}

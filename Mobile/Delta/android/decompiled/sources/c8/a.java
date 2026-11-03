package c8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<b8.i> f4816a;
    public final byte[] b;

    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<b8.i> f4817a;
        public byte[] b;

        @Override // c8.f.a
        public f a() {
            String str = "";
            if (this.f4817a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f4817a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c8.f.a
        public f.a b(Iterable<b8.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f4817a = iterable;
            return this;
        }

        @Override // c8.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // c8.f
    public Iterable<b8.i> b() {
        return this.f4816a;
    }

    @Override // c8.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4816a.equals(fVar.b())) {
                if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4816a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f4816a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public a(Iterable<b8.i> iterable, byte[] bArr) {
        this.f4816a = iterable;
        this.b = bArr;
    }
}

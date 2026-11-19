package d8;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<c8.i> f11961a;
    public final byte[] b;

    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<c8.i> f11962a;
        public byte[] b;

        @Override // d8.f.a
        public f a() {
            Iterable<c8.i> iterable = this.f11962a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = BuildConfig.FLAVOR + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f11962a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d8.f.a
        public f.a b(Iterable<c8.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f11962a = iterable;
            return this;
        }

        @Override // d8.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // d8.f
    public Iterable<c8.i> b() {
        return this.f11961a;
    }

    @Override // d8.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f11961a.equals(fVar.b())) {
                if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11961a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f11961a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public a(Iterable<c8.i> iterable, byte[] bArr) {
        this.f11961a = iterable;
        this.b = bArr;
    }
}

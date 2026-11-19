package c8;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4904a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7.e f4905c;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4906a;
        public byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z7.e f4907c;

        @Override // c8.o.a
        public o a() {
            String str = this.f4906a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " backendName";
            }
            if (this.f4907c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.f4906a, this.b, this.f4907c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c8.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f4906a = str;
            return this;
        }

        @Override // c8.o.a
        public o.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // c8.o.a
        public o.a d(z7.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f4907c = eVar;
            return this;
        }
    }

    @Override // c8.o
    public String b() {
        return this.f4904a;
    }

    @Override // c8.o
    public byte[] c() {
        return this.b;
    }

    @Override // c8.o
    public z7.e d() {
        return this.f4905c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f4904a.equals(oVar.b())) {
                if (Arrays.equals(this.b, oVar instanceof d ? ((d) oVar).b : oVar.c()) && this.f4905c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4904a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.f4905c.hashCode();
    }

    public d(String str, byte[] bArr, z7.e eVar) {
        this.f4904a = str;
        this.b = bArr;
        this.f4905c = eVar;
    }
}

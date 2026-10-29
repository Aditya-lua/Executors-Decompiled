package b8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4021a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.e f4022c;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4023a;
        public byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y7.e f4024c;

        @Override // b8.o.a
        public o a() {
            String str = "";
            if (this.f4023a == null) {
                str = " backendName";
            }
            if (this.f4024c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f4023a, this.b, this.f4024c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f4023a = str;
            return this;
        }

        @Override // b8.o.a
        public o.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // b8.o.a
        public o.a d(y7.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f4024c = eVar;
            return this;
        }
    }

    @Override // b8.o
    public String b() {
        return this.f4021a;
    }

    @Override // b8.o
    public byte[] c() {
        return this.b;
    }

    @Override // b8.o
    public y7.e d() {
        return this.f4022c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f4021a.equals(oVar.b())) {
                if (Arrays.equals(this.b, oVar instanceof d ? ((d) oVar).b : oVar.c()) && this.f4022c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4021a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.f4022c.hashCode();
    }

    public d(String str, byte[] bArr, y7.e eVar) {
        this.f4021a = str;
        this.b = bArr;
        this.f4022c = eVar;
    }
}

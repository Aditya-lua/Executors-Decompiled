package n0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f24805a;
    public final List<u1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.k0 f24809f;

    public static final class b extends o3.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f24810a;
        public List<u1> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f24811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f24812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f24813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g0.k0 f24814f;

        @Override // n0.o3.f.a
        public o3.f a() {
            String str = "";
            if (this.f24810a == null) {
                str = " surface";
            }
            if (this.b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f24812d == null) {
                str = str + " mirrorMode";
            }
            if (this.f24813e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f24814f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new q(this.f24810a, this.b, this.f24811c, this.f24812d.intValue(), this.f24813e.intValue(), this.f24814f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.o3.f.a
        public o3.f.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f24814f = k0Var;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a c(int i10) {
            this.f24812d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a d(String str) {
            this.f24811c = str;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a e(List<u1> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.b = list;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a f(int i10) {
            this.f24813e = Integer.valueOf(i10);
            return this;
        }

        public o3.f.a g(u1 u1Var) {
            if (u1Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f24810a = u1Var;
            return this;
        }
    }

    @Override // n0.o3.f
    public g0.k0 b() {
        return this.f24809f;
    }

    @Override // n0.o3.f
    public int c() {
        return this.f24807d;
    }

    @Override // n0.o3.f
    public String d() {
        return this.f24806c;
    }

    @Override // n0.o3.f
    public List<u1> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3.f) {
            o3.f fVar = (o3.f) obj;
            if (this.f24805a.equals(fVar.f()) && this.b.equals(fVar.e()) && ((str = this.f24806c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f24807d == fVar.c() && this.f24808e == fVar.g() && this.f24809f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.o3.f
    public u1 f() {
        return this.f24805a;
    }

    @Override // n0.o3.f
    public int g() {
        return this.f24808e;
    }

    public int hashCode() {
        int iHashCode = (((this.f24805a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.f24806c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f24807d) * 1000003) ^ this.f24808e) * 1000003) ^ this.f24809f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f24805a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.f24806c + ", mirrorMode=" + this.f24807d + ", surfaceGroupId=" + this.f24808e + ", dynamicRange=" + this.f24809f + "}";
    }

    public q(u1 u1Var, List<u1> list, String str, int i10, int i11, g0.k0 k0Var) {
        this.f24805a = u1Var;
        this.b = list;
        this.f24806c = str;
        this.f24807d = i10;
        this.f24808e = i11;
        this.f24809f = k0Var;
    }
}

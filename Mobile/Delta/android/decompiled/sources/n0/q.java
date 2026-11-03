package n0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f25626a;
    public final List<u1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.k0 f25630f;

    public static final class b extends o3.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f25631a;
        public List<u1> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f25633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f25634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g0.k0 f25635f;

        @Override // n0.o3.f.a
        public o3.f a() {
            String str = "";
            if (this.f25631a == null) {
                str = " surface";
            }
            if (this.b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f25633d == null) {
                str = str + " mirrorMode";
            }
            if (this.f25634e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f25635f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new q(this.f25631a, this.b, this.f25632c, this.f25633d.intValue(), this.f25634e.intValue(), this.f25635f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.o3.f.a
        public o3.f.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25635f = k0Var;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a c(int i10) {
            this.f25633d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a d(String str) {
            this.f25632c = str;
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
            this.f25634e = Integer.valueOf(i10);
            return this;
        }

        public o3.f.a g(u1 u1Var) {
            if (u1Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f25631a = u1Var;
            return this;
        }
    }

    @Override // n0.o3.f
    public g0.k0 b() {
        return this.f25630f;
    }

    @Override // n0.o3.f
    public int c() {
        return this.f25628d;
    }

    @Override // n0.o3.f
    public String d() {
        return this.f25627c;
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
            if (this.f25626a.equals(fVar.f()) && this.b.equals(fVar.e()) && ((str = this.f25627c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f25628d == fVar.c() && this.f25629e == fVar.g() && this.f25630f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.o3.f
    public u1 f() {
        return this.f25626a;
    }

    @Override // n0.o3.f
    public int g() {
        return this.f25629e;
    }

    public int hashCode() {
        int iHashCode = (((this.f25626a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.f25627c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f25628d) * 1000003) ^ this.f25629e) * 1000003) ^ this.f25630f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f25626a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.f25627c + ", mirrorMode=" + this.f25628d + ", surfaceGroupId=" + this.f25629e + ", dynamicRange=" + this.f25630f + "}";
    }

    public q(u1 u1Var, List<u1> list, String str, int i10, int i11, g0.k0 k0Var) {
        this.f25626a = u1Var;
        this.b = list;
        this.f25627c = str;
        this.f25628d = i10;
        this.f25629e = i11;
        this.f25630f = k0Var;
    }
}

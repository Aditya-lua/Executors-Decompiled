package n0;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f25103a;
    public final List<u1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.k0 f25107f;

    public static final class b extends o3.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f25108a;
        public List<u1> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f25110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f25111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g0.k0 f25112f;

        @Override // n0.o3.f.a
        public o3.f a() {
            u1 u1Var = this.f25108a;
            String str = BuildConfig.FLAVOR;
            if (u1Var == null) {
                str = BuildConfig.FLAVOR + " surface";
            }
            if (this.b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f25110d == null) {
                str = str + " mirrorMode";
            }
            if (this.f25111e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f25112f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new q(this.f25108a, this.b, this.f25109c, this.f25110d.intValue(), this.f25111e.intValue(), this.f25112f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.o3.f.a
        public o3.f.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25112f = k0Var;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a c(int i10) {
            this.f25110d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a d(String str) {
            this.f25109c = str;
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
            this.f25111e = Integer.valueOf(i10);
            return this;
        }

        public o3.f.a g(u1 u1Var) {
            if (u1Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f25108a = u1Var;
            return this;
        }
    }

    @Override // n0.o3.f
    public g0.k0 b() {
        return this.f25107f;
    }

    @Override // n0.o3.f
    public int c() {
        return this.f25105d;
    }

    @Override // n0.o3.f
    public String d() {
        return this.f25104c;
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
            if (this.f25103a.equals(fVar.f()) && this.b.equals(fVar.e()) && ((str = this.f25104c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f25105d == fVar.c() && this.f25106e == fVar.g() && this.f25107f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.o3.f
    public u1 f() {
        return this.f25103a;
    }

    @Override // n0.o3.f
    public int g() {
        return this.f25106e;
    }

    public int hashCode() {
        int iHashCode = (((this.f25103a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.f25104c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f25105d) * 1000003) ^ this.f25106e) * 1000003) ^ this.f25107f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f25103a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.f25104c + ", mirrorMode=" + this.f25105d + ", surfaceGroupId=" + this.f25106e + ", dynamicRange=" + this.f25107f + "}";
    }

    public q(u1 u1Var, List<u1> list, String str, int i10, int i11, g0.k0 k0Var) {
        this.f25103a = u1Var;
        this.b = list;
        this.f25104c = str;
        this.f25105d = i10;
        this.f25106e = i11;
        this.f25107f = k0Var;
    }
}

package p296n0;

import java.util.List;
import p140g0.C5902k0;

/* JADX INFO: renamed from: n0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8808q extends C8802o3.f {

    /* JADX INFO: renamed from: a */
    public final AbstractC8830u1 f32035a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC8830u1> f32036b;

    /* JADX INFO: renamed from: c */
    public final String f32037c;

    /* JADX INFO: renamed from: d */
    public final int f32038d;

    /* JADX INFO: renamed from: e */
    public final int f32039e;

    /* JADX INFO: renamed from: f */
    public final C5902k0 f32040f;

    /* JADX INFO: renamed from: n0.q$b */
    public static final class b extends C8802o3.f.a {

        /* JADX INFO: renamed from: a */
        public AbstractC8830u1 f32041a;

        /* JADX INFO: renamed from: b */
        public List<AbstractC8830u1> f32042b;

        /* JADX INFO: renamed from: c */
        public String f32043c;

        /* JADX INFO: renamed from: d */
        public Integer f32044d;

        /* JADX INFO: renamed from: e */
        public Integer f32045e;

        /* JADX INFO: renamed from: f */
        public C5902k0 f32046f;

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: a */
        public C8802o3.f mo35350a() {
            String str = "";
            if (this.f32041a == null) {
                str = " surface";
            }
            if (this.f32042b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f32044d == null) {
                str = str + " mirrorMode";
            }
            if (this.f32045e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f32046f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C8808q(this.f32041a, this.f32042b, this.f32043c, this.f32044d.intValue(), this.f32045e.intValue(), this.f32046f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: b */
        public C8802o3.f.a mo35351b(C5902k0 c5902k0) {
            if (c5902k0 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f32046f = c5902k0;
            return this;
        }

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: c */
        public C8802o3.f.a mo35352c(int i10) {
            this.f32044d = Integer.valueOf(i10);
            return this;
        }

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: d */
        public C8802o3.f.a mo35353d(String str) {
            this.f32043c = str;
            return this;
        }

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: e */
        public C8802o3.f.a mo35354e(List<AbstractC8830u1> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f32042b = list;
            return this;
        }

        @Override // p296n0.C8802o3.f.a
        /* JADX INFO: renamed from: f */
        public C8802o3.f.a mo35355f(int i10) {
            this.f32045e = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C8802o3.f.a m35372g(AbstractC8830u1 abstractC8830u1) {
            if (abstractC8830u1 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f32041a = abstractC8830u1;
            return this;
        }
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: b */
    public C5902k0 mo35344b() {
        return this.f32040f;
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: c */
    public int mo35345c() {
        return this.f32038d;
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: d */
    public String mo35346d() {
        return this.f32037c;
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: e */
    public List<AbstractC8830u1> mo35347e() {
        return this.f32036b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8802o3.f) {
            C8802o3.f fVar = (C8802o3.f) obj;
            if (this.f32035a.equals(fVar.mo35348f()) && this.f32036b.equals(fVar.mo35347e()) && ((str = this.f32037c) != null ? str.equals(fVar.mo35346d()) : fVar.mo35346d() == null) && this.f32038d == fVar.mo35345c() && this.f32039e == fVar.mo35349g() && this.f32040f.equals(fVar.mo35344b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: f */
    public AbstractC8830u1 mo35348f() {
        return this.f32035a;
    }

    @Override // p296n0.C8802o3.f
    /* JADX INFO: renamed from: g */
    public int mo35349g() {
        return this.f32039e;
    }

    public int hashCode() {
        int iHashCode = (((this.f32035a.hashCode() ^ 1000003) * 1000003) ^ this.f32036b.hashCode()) * 1000003;
        String str = this.f32037c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f32038d) * 1000003) ^ this.f32039e) * 1000003) ^ this.f32040f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f32035a + ", sharedSurfaces=" + this.f32036b + ", physicalCameraId=" + this.f32037c + ", mirrorMode=" + this.f32038d + ", surfaceGroupId=" + this.f32039e + ", dynamicRange=" + this.f32040f + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8808q(AbstractC8830u1 abstractC8830u1, List<AbstractC8830u1> list, String str, int i10, int i11, C5902k0 c5902k0) {
        this.f32035a = abstractC8830u1;
        this.f32036b = list;
        this.f32037c = str;
        this.f32038d = i10;
        this.f32039e = i11;
        this.f32040f = c5902k0;
    }
}

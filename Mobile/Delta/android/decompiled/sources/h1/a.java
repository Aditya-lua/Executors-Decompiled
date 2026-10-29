package h1;

import java.util.List;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18491a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a2.a> f18492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a2.c> f18493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.a f18494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.c f18495f;

    public a(int i10, int i11, List<a2.a> list, List<a2.c> list2, a2.a aVar, a2.c cVar) {
        this.f18491a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f18492c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f18493d = list2;
        this.f18494e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f18495f = cVar;
    }

    @Override // n0.a2
    public int a() {
        return this.f18491a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f18493d;
    }

    @Override // n0.a2
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f18491a == iVar.a() && this.b == iVar.e() && this.f18492c.equals(iVar.f()) && this.f18493d.equals(iVar.b()) && ((aVar = this.f18494e) != null ? aVar.equals(iVar.j()) : iVar.j() == null) && this.f18495f.equals(iVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f18492c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f18491a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f18492c.hashCode()) * 1000003) ^ this.f18493d.hashCode()) * 1000003;
        a2.a aVar = this.f18494e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f18495f.hashCode();
    }

    @Override // h1.i
    public a2.a j() {
        return this.f18494e;
    }

    @Override // h1.i
    public a2.c k() {
        return this.f18495f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f18491a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f18492c + ", videoProfiles=" + this.f18493d + ", defaultAudioProfile=" + this.f18494e + ", defaultVideoProfile=" + this.f18495f + "}";
    }
}

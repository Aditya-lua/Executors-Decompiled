package h1;

import java.util.List;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18978a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a2.a> f18979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a2.c> f18980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.a f18981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.c f18982f;

    public a(int i10, int i11, List<a2.a> list, List<a2.c> list2, a2.a aVar, a2.c cVar) {
        this.f18978a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f18979c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f18980d = list2;
        this.f18981e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f18982f = cVar;
    }

    @Override // n0.a2
    public int a() {
        return this.f18978a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f18980d;
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
            if (this.f18978a == iVar.a() && this.b == iVar.e() && this.f18979c.equals(iVar.f()) && this.f18980d.equals(iVar.b()) && ((aVar = this.f18981e) != null ? aVar.equals(iVar.j()) : iVar.j() == null) && this.f18982f.equals(iVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f18979c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f18978a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f18979c.hashCode()) * 1000003) ^ this.f18980d.hashCode()) * 1000003;
        a2.a aVar = this.f18981e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f18982f.hashCode();
    }

    @Override // h1.i
    public a2.a j() {
        return this.f18981e;
    }

    @Override // h1.i
    public a2.c k() {
        return this.f18982f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f18978a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f18979c + ", videoProfiles=" + this.f18980d + ", defaultAudioProfile=" + this.f18981e + ", defaultVideoProfile=" + this.f18982f + "}";
    }
}

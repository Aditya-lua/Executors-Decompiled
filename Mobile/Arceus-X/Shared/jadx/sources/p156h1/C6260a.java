package p156h1;

import java.util.List;
import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6260a extends AbstractC6268i {

    /* JADX INFO: renamed from: a */
    public final int f23778a;

    /* JADX INFO: renamed from: b */
    public final int f23779b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC8721a2.a> f23780c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC8721a2.c> f23781d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8721a2.a f23782e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8721a2.c f23783f;

    public C6260a(int i10, int i11, List<InterfaceC8721a2.a> list, List<InterfaceC8721a2.c> list2, InterfaceC8721a2.a aVar, InterfaceC8721a2.c cVar) {
        this.f23778a = i10;
        this.f23779b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f23780c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f23781d = list2;
        this.f23782e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f23783f = cVar;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: a */
    public int mo27489a() {
        return this.f23778a;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: b */
    public List<InterfaceC8721a2.c> mo27490b() {
        return this.f23781d;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: e */
    public int mo27491e() {
        return this.f23779b;
    }

    public boolean equals(Object obj) {
        InterfaceC8721a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6268i) {
            AbstractC6268i abstractC6268i = (AbstractC6268i) obj;
            if (this.f23778a == abstractC6268i.mo27489a() && this.f23779b == abstractC6268i.mo27491e() && this.f23780c.equals(abstractC6268i.mo27492f()) && this.f23781d.equals(abstractC6268i.mo27490b()) && ((aVar = this.f23782e) != null ? aVar.equals(abstractC6268i.mo27493j()) : abstractC6268i.mo27493j() == null) && this.f23783f.equals(abstractC6268i.mo27494k())) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: f */
    public List<InterfaceC8721a2.a> mo27492f() {
        return this.f23780c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f23778a ^ 1000003) * 1000003) ^ this.f23779b) * 1000003) ^ this.f23780c.hashCode()) * 1000003) ^ this.f23781d.hashCode()) * 1000003;
        InterfaceC8721a2.a aVar = this.f23782e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f23783f.hashCode();
    }

    @Override // p156h1.AbstractC6268i
    /* JADX INFO: renamed from: j */
    public InterfaceC8721a2.a mo27493j() {
        return this.f23782e;
    }

    @Override // p156h1.AbstractC6268i
    /* JADX INFO: renamed from: k */
    public InterfaceC8721a2.c mo27494k() {
        return this.f23783f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f23778a + ", recommendedFileFormat=" + this.f23779b + ", audioProfiles=" + this.f23780c + ", videoProfiles=" + this.f23781d + ", defaultAudioProfile=" + this.f23782e + ", defaultVideoProfile=" + this.f23783f + "}";
    }
}

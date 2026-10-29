package p296n0;

import java.util.List;

/* JADX INFO: renamed from: n0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8783l extends InterfaceC8721a2.b {

    /* JADX INFO: renamed from: a */
    public final int f31936a;

    /* JADX INFO: renamed from: b */
    public final int f31937b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC8721a2.a> f31938c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC8721a2.c> f31939d;

    public C8783l(int i10, int i11, List<InterfaceC8721a2.a> list, List<InterfaceC8721a2.c> list2) {
        this.f31936a = i10;
        this.f31937b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f31938c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f31939d = list2;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: a */
    public int mo27489a() {
        return this.f31936a;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: b */
    public List<InterfaceC8721a2.c> mo27490b() {
        return this.f31939d;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: e */
    public int mo27491e() {
        return this.f31937b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8721a2.b) {
            InterfaceC8721a2.b bVar = (InterfaceC8721a2.b) obj;
            if (this.f31936a == bVar.mo27489a() && this.f31937b == bVar.mo27491e() && this.f31938c.equals(bVar.mo27492f()) && this.f31939d.equals(bVar.mo27490b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.InterfaceC8721a2
    /* JADX INFO: renamed from: f */
    public List<InterfaceC8721a2.a> mo27492f() {
        return this.f31938c;
    }

    public int hashCode() {
        return ((((((this.f31936a ^ 1000003) * 1000003) ^ this.f31937b) * 1000003) ^ this.f31938c.hashCode()) * 1000003) ^ this.f31939d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f31936a + ", recommendedFileFormat=" + this.f31937b + ", audioProfiles=" + this.f31938c + ", videoProfiles=" + this.f31939d + "}";
    }
}

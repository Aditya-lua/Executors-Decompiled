package n0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25020a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a2.a> f25021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a2.c> f25022d;

    public l(int i10, int i11, List<a2.a> list, List<a2.c> list2) {
        this.f25020a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f25021c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f25022d = list2;
    }

    @Override // n0.a2
    public int a() {
        return this.f25020a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f25022d;
    }

    @Override // n0.a2
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.b) {
            a2.b bVar = (a2.b) obj;
            if (this.f25020a == bVar.a() && this.b == bVar.e() && this.f25021c.equals(bVar.f()) && this.f25022d.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f25021c;
    }

    public int hashCode() {
        return ((((((this.f25020a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f25021c.hashCode()) * 1000003) ^ this.f25022d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f25020a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f25021c + ", videoProfiles=" + this.f25022d + "}";
    }
}

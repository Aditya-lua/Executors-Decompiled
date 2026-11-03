package n0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25543a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a2.a> f25544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a2.c> f25545d;

    public l(int i10, int i11, List<a2.a> list, List<a2.c> list2) {
        this.f25543a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f25544c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f25545d = list2;
    }

    @Override // n0.a2
    public int a() {
        return this.f25543a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f25545d;
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
            if (this.f25543a == bVar.a() && this.b == bVar.e() && this.f25544c.equals(bVar.f()) && this.f25545d.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f25544c;
    }

    public int hashCode() {
        return ((((((this.f25543a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f25544c.hashCode()) * 1000003) ^ this.f25545d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f25543a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f25544c + ", videoProfiles=" + this.f25545d + "}";
    }
}

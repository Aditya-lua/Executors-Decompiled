package j8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8.a f20149a;
    public final Map<z7.e, f.b> b;

    public b(m8.a aVar, Map<z7.e, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f20149a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // j8.f
    public m8.a e() {
        return this.f20149a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f20149a.equals(fVar.e()) && this.b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // j8.f
    public Map<z7.e, f.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.f20149a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f20149a + ", values=" + this.b + "}";
    }
}

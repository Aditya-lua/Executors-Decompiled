package i8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8.a f20347a;
    public final Map<y7.e, f.b> b;

    public b(l8.a aVar, Map<y7.e, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f20347a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // i8.f
    public l8.a e() {
        return this.f20347a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f20347a.equals(fVar.e()) && this.b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // i8.f
    public Map<y7.e, f.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.f20347a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f20347a + ", values=" + this.b + "}";
    }
}

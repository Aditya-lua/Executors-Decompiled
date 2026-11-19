package z7;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39154a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f39155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f39156d;

    public a(Integer num, T t8, e eVar, f fVar) {
        this.f39154a = num;
        if (t8 == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = t8;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f39155c = eVar;
        this.f39156d = fVar;
    }

    @Override // z7.d
    public Integer a() {
        return this.f39154a;
    }

    @Override // z7.d
    public T b() {
        return this.b;
    }

    @Override // z7.d
    public e c() {
        return this.f39155c;
    }

    @Override // z7.d
    public f d() {
        return this.f39156d;
    }

    public boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f39154a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.b.equals(dVar.b()) && this.f39155c.equals(dVar.c()) && ((fVar = this.f39156d) != null ? fVar.equals(dVar.d()) : dVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f39154a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f39155c.hashCode()) * 1000003;
        f fVar = this.f39156d;
        return iHashCode ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f39154a + ", payload=" + this.b + ", priority=" + this.f39155c + ", productData=" + this.f39156d + "}";
    }
}

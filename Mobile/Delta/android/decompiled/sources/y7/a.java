package y7;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36612a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f36613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f36614d;

    public a(Integer num, T t8, e eVar, f fVar) {
        this.f36612a = num;
        if (t8 == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = t8;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f36613c = eVar;
        this.f36614d = fVar;
    }

    @Override // y7.d
    public Integer a() {
        return this.f36612a;
    }

    @Override // y7.d
    public T b() {
        return this.b;
    }

    @Override // y7.d
    public e c() {
        return this.f36613c;
    }

    @Override // y7.d
    public f d() {
        return this.f36614d;
    }

    public boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f36612a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.b.equals(dVar.b()) && this.f36613c.equals(dVar.c()) && ((fVar = this.f36614d) != null ? fVar.equals(dVar.d()) : dVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f36612a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f36613c.hashCode()) * 1000003;
        f fVar = this.f36614d;
        return iHashCode ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f36612a + ", payload=" + this.b + ", priority=" + this.f36613c + ", productData=" + this.f36614d + "}";
    }
}

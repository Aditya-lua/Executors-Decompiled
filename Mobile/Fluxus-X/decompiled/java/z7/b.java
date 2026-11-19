package z7;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39157a;

    public b(Integer num) {
        this.f39157a = num;
    }

    @Override // z7.f
    public Integer a() {
        return this.f39157a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f39157a;
        Integer numA = ((f) obj).a();
        if (num == null) {
            return numA == null;
        }
        return num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f39157a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f39157a + "}";
    }
}

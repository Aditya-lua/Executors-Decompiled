package p569y7;

/* JADX INFO: renamed from: y7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13115b extends AbstractC13119f {

    /* JADX INFO: renamed from: a */
    public final Integer f46362a;

    public C13115b(Integer num) {
        this.f46362a = num;
    }

    @Override // p569y7.AbstractC13119f
    /* JADX INFO: renamed from: a */
    public Integer mo48728a() {
        return this.f46362a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13119f)) {
            return false;
        }
        Integer num = this.f46362a;
        Integer numMo48728a = ((AbstractC13119f) obj).mo48728a();
        if (num == null) {
            return numMo48728a == null;
        }
        return num.equals(numMo48728a);
    }

    public int hashCode() {
        Integer num = this.f46362a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f46362a + "}";
    }
}

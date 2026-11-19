package je;

/* JADX INFO: loaded from: classes2.dex */
public final class o<T> extends k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f20725a;

    public o(T t8) {
        this.f20725a = t8;
    }

    @Override // je.k
    public T b() {
        return this.f20725a;
    }

    @Override // je.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f20725a.equals(((o) obj).f20725a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20725a.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f20725a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}

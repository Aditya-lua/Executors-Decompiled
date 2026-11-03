package he;

/* JADX INFO: loaded from: classes2.dex */
public final class o<T> extends k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f19410a;

    public o(T t8) {
        this.f19410a = t8;
    }

    @Override // he.k
    public T b() {
        return this.f19410a;
    }

    @Override // he.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f19410a.equals(((o) obj).f19410a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19410a.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f19410a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}

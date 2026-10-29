package p169he;

/* JADX INFO: renamed from: he.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C6385o<T> extends AbstractC6381k<T> {

    /* JADX INFO: renamed from: a */
    public final T f24267a;

    public C6385o(T t8) {
        this.f24267a = t8;
    }

    @Override // p169he.AbstractC6381k
    /* JADX INFO: renamed from: b */
    public T mo27883b() {
        return this.f24267a;
    }

    @Override // p169he.AbstractC6381k
    /* JADX INFO: renamed from: c */
    public boolean mo27884c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6385o) {
            return this.f24267a.equals(((C6385o) obj).f24267a);
        }
        return false;
    }

    public int hashCode() {
        return this.f24267a.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f24267a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}

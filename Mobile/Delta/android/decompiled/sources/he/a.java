package he;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<Object> f19393a = new a<>();

    public static <T> k<T> e() {
        return f19393a;
    }

    @Override // he.k
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // he.k
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}

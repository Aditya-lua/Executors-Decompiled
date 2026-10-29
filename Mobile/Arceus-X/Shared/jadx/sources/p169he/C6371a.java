package p169he;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6371a<T> extends AbstractC6381k<T> {

    /* JADX INFO: renamed from: a */
    public static final C6371a<Object> f24244a = new C6371a<>();

    /* JADX INFO: renamed from: e */
    public static <T> AbstractC6381k<T> m27882e() {
        return f24244a;
    }

    @Override // p169he.AbstractC6381k
    /* JADX INFO: renamed from: b */
    public T mo27883b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p169he.AbstractC6381k
    /* JADX INFO: renamed from: c */
    public boolean mo27884c() {
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

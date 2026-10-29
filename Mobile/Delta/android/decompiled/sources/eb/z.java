package eb;

/* JADX INFO: loaded from: classes.dex */
public final class z extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f15427a = new z();

    @Override // eb.m0
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // eb.m0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

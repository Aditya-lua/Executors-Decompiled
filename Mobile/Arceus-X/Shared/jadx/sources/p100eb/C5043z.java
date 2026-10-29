package p100eb;

/* JADX INFO: renamed from: eb.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5043z extends AbstractC4967m0 {

    /* JADX INFO: renamed from: a */
    public static final C5043z f19843a = new C5043z();

    @Override // p100eb.AbstractC4967m0
    /* JADX INFO: renamed from: a */
    public final Object mo23662a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p100eb.AbstractC4967m0
    /* JADX INFO: renamed from: b */
    public final boolean mo23663b() {
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

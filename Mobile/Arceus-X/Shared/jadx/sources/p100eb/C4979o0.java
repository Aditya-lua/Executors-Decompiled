package p100eb;

/* JADX INFO: renamed from: eb.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4979o0 extends AbstractC4967m0 {

    /* JADX INFO: renamed from: a */
    public final Object f19708a;

    public C4979o0(Object obj) {
        this.f19708a = obj;
    }

    @Override // p100eb.AbstractC4967m0
    /* JADX INFO: renamed from: a */
    public final Object mo23662a() {
        return this.f19708a;
    }

    @Override // p100eb.AbstractC4967m0
    /* JADX INFO: renamed from: b */
    public final boolean mo23663b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4979o0) {
            return this.f19708a.equals(((C4979o0) obj).f19708a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19708a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f19708a.toString() + ")";
    }
}

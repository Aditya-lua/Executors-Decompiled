package eb;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15312a;

    public o0(Object obj) {
        this.f15312a = obj;
    }

    @Override // eb.m0
    public final Object a() {
        return this.f15312a;
    }

    @Override // eb.m0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.f15312a.equals(((o0) obj).f15312a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15312a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f15312a.toString() + ")";
    }
}

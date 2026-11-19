package fb;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15782a;

    public o0(Object obj) {
        this.f15782a = obj;
    }

    @Override // fb.m0
    public final Object a() {
        return this.f15782a;
    }

    @Override // fb.m0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.f15782a.equals(((o0) obj).f15782a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15782a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f15782a.toString() + ")";
    }
}

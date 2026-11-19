package m9;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23033a;
    public final k9.d b;

    public /* synthetic */ l0(b bVar, k9.d dVar, k0 k0Var) {
        this.f23033a = bVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l0)) {
            l0 l0Var = (l0) obj;
            if (o9.q.b(this.f23033a, l0Var.f23033a) && o9.q.b(this.b, l0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o9.q.c(this.f23033a, this.b);
    }

    public final String toString() {
        return o9.q.d(this).a("key", this.f23033a).a("feature", this.b).toString();
    }
}

package b0;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class n implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3521a;

    public n(Object obj) {
        this.f3521a = obj;
    }

    @Override // b0.i.a
    public void a(long j10) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f3521a, ((n) obj).f3521a);
        }
        return false;
    }

    @Override // b0.i.a
    public void g(int i10) {
    }

    public int hashCode() {
        return this.f3521a.hashCode();
    }
}

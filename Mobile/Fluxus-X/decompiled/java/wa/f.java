package wa;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35701a;
    public final r b;

    public f(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f35701a = context;
        this.b = rVar;
    }

    @Override // wa.j
    public final Context a() {
        return this.f35701a;
    }

    @Override // wa.j
    public final r b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f35701a.equals(jVar.a()) && this.b.equals(jVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35701a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f35701a.toString() + ", hermeticFileOverrides=" + this.b.toString() + "}";
    }
}

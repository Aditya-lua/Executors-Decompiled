package va;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32884a;
    public final r b;

    public f(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f32884a = context;
        this.b = rVar;
    }

    @Override // va.j
    public final Context a() {
        return this.f32884a;
    }

    @Override // va.j
    public final r b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f32884a.equals(jVar.a()) && this.b.equals(jVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32884a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f32884a.toString() + ", hermeticFileOverrides=" + this.b.toString() + "}";
    }
}

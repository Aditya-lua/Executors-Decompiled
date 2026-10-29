package l9;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23048a;
    public final Feature b;

    public /* synthetic */ l0(b bVar, Feature feature, k0 k0Var) {
        this.f23048a = bVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l0)) {
            l0 l0Var = (l0) obj;
            if (n9.k.b(this.f23048a, l0Var.f23048a) && n9.k.b(this.b, l0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return n9.k.c(this.f23048a, this.b);
    }

    public final String toString() {
        return n9.k.d(this).a("key", this.f23048a).a("feature", this.b).toString();
    }
}

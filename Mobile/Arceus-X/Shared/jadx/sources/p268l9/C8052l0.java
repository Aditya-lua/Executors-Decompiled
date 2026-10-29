package p268l9;

import com.google.android.gms.common.Feature;
import p305n9.C8947k;

/* JADX INFO: renamed from: l9.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8052l0 {

    /* JADX INFO: renamed from: a */
    public final C8021b f30045a;

    /* JADX INFO: renamed from: b */
    public final Feature f30046b;

    public /* synthetic */ C8052l0(C8021b c8021b, Feature feature, C8049k0 c8049k0) {
        this.f30045a = c8021b;
        this.f30046b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8052l0)) {
            C8052l0 c8052l0 = (C8052l0) obj;
            if (C8947k.m36026b(this.f30045a, c8052l0.f30045a) && C8947k.m36026b(this.f30046b, c8052l0.f30046b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f30045a, this.f30046b);
    }

    public final String toString() {
        return C8947k.m36028d(this).m36029a("key", this.f30045a).m36029a("feature", this.f30046b).toString();
    }
}

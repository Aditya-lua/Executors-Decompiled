package p268l9;

import androidx.annotation.NonNull;
import p242k9.C7491a;
import p242k9.C7491a.d;
import p305n9.C8947k;

/* JADX INFO: renamed from: l9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8021b<O extends C7491a.d> {

    /* JADX INFO: renamed from: a */
    public final int f29973a;

    /* JADX INFO: renamed from: b */
    public final C7491a f29974b;

    /* JADX INFO: renamed from: c */
    public final C7491a.d f29975c;

    /* JADX INFO: renamed from: d */
    public final String f29976d;

    public C8021b(C7491a c7491a, C7491a.d dVar, String str) {
        this.f29974b = c7491a;
        this.f29975c = dVar;
        this.f29976d = str;
        this.f29973a = C8947k.m36027c(c7491a, dVar, str);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <O extends C7491a.d> C8021b<O> m33115a(@NonNull C7491a<O> c7491a, O o8, String str) {
        return new C8021b<>(c7491a, o8, str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final String m33116b() {
        return this.f29974b.m31127c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8021b)) {
            return false;
        }
        C8021b c8021b = (C8021b) obj;
        return C8947k.m36026b(this.f29974b, c8021b.f29974b) && C8947k.m36026b(this.f29975c, c8021b.f29975c) && C8947k.m36026b(this.f29976d, c8021b.f29976d);
    }

    public final int hashCode() {
        return this.f29973a;
    }
}

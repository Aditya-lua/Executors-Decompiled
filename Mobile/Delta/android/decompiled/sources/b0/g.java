package b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import g0.k0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3763a = new e(new g());
    public static final Set<k0> b = Collections.singleton(k0.f17470d);

    @Override // b0.e.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // b0.e.a
    public Set<k0> c() {
        return b;
    }

    @Override // b0.e.a
    public Set<k0> d(k0 k0Var) {
        x2.g.b(k0.f17470d.equals(k0Var), "DynamicRange is not supported: " + k0Var);
        return b;
    }
}

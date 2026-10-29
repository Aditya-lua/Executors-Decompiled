package p020b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import p140g0.C5902k0;
import p533x2.C12637g;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1181g implements C1179e.a {

    /* JADX INFO: renamed from: a */
    public static final C1179e f4924a = new C1179e(new C1181g());

    /* JADX INFO: renamed from: b */
    public static final Set<C5902k0> f4925b = Collections.singleton(C5902k0.f22550d);

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: a */
    public DynamicRangeProfiles mo6547a() {
        return null;
    }

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: c */
    public Set<C5902k0> mo6548c() {
        return f4925b;
    }

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: d */
    public Set<C5902k0> mo6549d(C5902k0 c5902k0) {
        C12637g.m47070b(C5902k0.f22550d.equals(c5902k0), "DynamicRange is not supported: " + c5902k0);
        return f4925b;
    }
}

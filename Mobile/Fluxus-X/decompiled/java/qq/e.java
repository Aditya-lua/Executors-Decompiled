package qq;

import java.util.List;
import mq.b0;
import mq.z0;
import org.jetbrains.annotations.Nullable;
import sn.v;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30221a;

    public e(d dVar) {
        this.f30221a = dVar;
    }

    public static i<c.a> b(d dVar) {
        return wt.e.a(new e(dVar));
    }

    @Override // qq.c.a
    public c a(String str, String str2, String str3, String str4, z0 z0Var, String str5, List<? extends b0> list, @Nullable String str6, v vVar, long j10, @Nullable String str7, rq.b bVar) {
        return this.f30221a.b(str, str2, z0Var, list, str4, str3, str5, str6, vVar, j10, str7, bVar);
    }
}

package dp;

import org.jetbrains.annotations.Nullable;
import sn.v;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12617a;

    public h(g gVar) {
        this.f12617a = gVar;
    }

    public static i<f.a> b(g gVar) {
        return wt.e.a(new h(gVar));
    }

    @Override // dp.f.a
    public f a(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, v vVar) {
        return this.f12617a.b(str, str2, str4, str3, governmentIdRequestArguments, str5, vVar);
    }
}

package to;

import android.content.Context;
import androidx.p000lifecycle.l0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Set<d>> f32616a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<l0> f32617c;

    public f(wt.i<Set<d>> iVar, wt.i<Context> iVar2, wt.i<l0> iVar3) {
        this.f32616a = iVar;
        this.b = iVar2;
        this.f32617c = iVar3;
    }

    public static f a(wt.i<Set<d>> iVar, wt.i<Context> iVar2, wt.i<l0> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static e c(Set<d> set, Context context, l0 l0Var) {
        return new e(set, context, l0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f32616a.get(), this.b.get(), this.f32617c.get());
    }
}

package go;

import android.content.Context;
import androidx.p000lifecycle.l0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Set<d>> f18298a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<l0> f18299c;

    public f(ft.i<Set<d>> iVar, ft.i<Context> iVar2, ft.i<l0> iVar3) {
        this.f18298a = iVar;
        this.b = iVar2;
        this.f18299c = iVar3;
    }

    public static f a(ft.i<Set<d>> iVar, ft.i<Context> iVar2, ft.i<l0> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static e c(Set<d> set, Context context, l0 l0Var) {
        return new e(set, context, l0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f18298a.get(), this.b.get(), this.f18299c.get());
    }
}

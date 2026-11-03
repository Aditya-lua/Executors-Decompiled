package eo;

import android.content.Context;
import androidx.p000lifecycle.l0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Set<d>> f16196a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<l0> f16197c;

    public f(dt.i<Set<d>> iVar, dt.i<Context> iVar2, dt.i<l0> iVar3) {
        this.f16196a = iVar;
        this.b = iVar2;
        this.f16197c = iVar3;
    }

    public static f a(dt.i<Set<d>> iVar, dt.i<Context> iVar2, dt.i<l0> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static e c(Set<d> set, Context context, l0 l0Var) {
        return new e(set, context, l0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f16196a.get(), this.b.get(), this.f16197c.get());
    }
}

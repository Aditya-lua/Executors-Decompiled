package rq;

import androidx.p000lifecycle.l0;
import av.p0;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f30917a;
    public final i<qq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f30918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<av.l0> f30919d;

    public c(i<l0> iVar, i<qq.a> iVar2, i<p0> iVar3, i<av.l0> iVar4) {
        this.f30917a = iVar;
        this.b = iVar2;
        this.f30918c = iVar3;
        this.f30919d = iVar4;
    }

    public static c a(i<l0> iVar, i<qq.a> iVar2, i<p0> iVar3, i<av.l0> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static b c(l0 l0Var, qq.a aVar, p0 p0Var, av.l0 l0Var2, String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return new b(l0Var, aVar, p0Var, l0Var2, str, str2, str3, list, l10);
    }

    public b b(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return c(this.f30917a.get(), this.b.get(), this.f30918c.get(), this.f30919d.get(), str, str2, str3, list, l10);
    }
}

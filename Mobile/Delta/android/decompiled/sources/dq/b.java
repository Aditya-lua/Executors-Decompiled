package dq;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import ft.i;
import java.util.List;
import ku.p0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f14842a;
    public final i<cq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f14843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<ku.l0> f14844d;

    public b(i<l0> iVar, i<cq.a> iVar2, i<p0> iVar3, i<ku.l0> iVar4) {
        this.f14842a = iVar;
        this.b = iVar2;
        this.f14843c = iVar3;
        this.f14844d = iVar4;
    }

    public static b a(i<l0> iVar, i<cq.a> iVar2, i<p0> iVar3, i<ku.l0> iVar4) {
        return new b(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(l0 l0Var, cq.a aVar, p0 p0Var, ku.l0 l0Var2, String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return new a(l0Var, aVar, p0Var, l0Var2, str, str2, str3, list, l10);
    }

    public a b(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return c(this.f14842a.get(), this.b.get(), this.f14843c.get(), this.f14844d.get(), str, str2, str3, list, l10);
    }
}

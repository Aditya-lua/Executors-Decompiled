package bq;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dt.i;
import iu.p0;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f4436a;
    public final i<aq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f4437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<iu.l0> f4438d;

    public b(i<l0> iVar, i<aq.a> iVar2, i<p0> iVar3, i<iu.l0> iVar4) {
        this.f4436a = iVar;
        this.b = iVar2;
        this.f4437c = iVar3;
        this.f4438d = iVar4;
    }

    public static b a(i<l0> iVar, i<aq.a> iVar2, i<p0> iVar3, i<iu.l0> iVar4) {
        return new b(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(l0 l0Var, aq.a aVar, p0 p0Var, iu.l0 l0Var2, String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return new a(l0Var, aVar, p0Var, l0Var2, str, str2, str3, list, l10);
    }

    public a b(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return c(this.f4436a.get(), this.b.get(), this.f4437c.get(), this.f4438d.get(), str, str2, str3, list, l10);
    }
}

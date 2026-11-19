package qq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.List;
import mq.b0;
import mq.z0;
import org.jetbrains.annotations.Nullable;
import sn.v;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f30214a;
    public final i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<ar.a> f30215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<so.a> f30216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<fr.a> f30217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<yn.a> f30218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f30219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i<pq.a> f30220h;

    public d(i<Context> iVar, i<a> iVar2, i<ar.a> iVar3, i<so.a> iVar4, i<fr.a> iVar5, i<yn.a> iVar6, i<TrackingEventsLogger> iVar7, i<pq.a> iVar8) {
        this.f30214a = iVar;
        this.b = iVar2;
        this.f30215c = iVar3;
        this.f30216d = iVar4;
        this.f30217e = iVar5;
        this.f30218f = iVar6;
        this.f30219g = iVar7;
        this.f30220h = iVar8;
    }

    public static d a(i<Context> iVar, i<a> iVar2, i<ar.a> iVar3, i<so.a> iVar4, i<fr.a> iVar5, i<yn.a> iVar6, i<TrackingEventsLogger> iVar7, i<pq.a> iVar8) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static c c(Context context, String str, String str2, z0 z0Var, List<? extends b0> list, a aVar, String str3, String str4, String str5, ar.a aVar2, so.a aVar3, fr.a aVar4, @Nullable String str6, v vVar, yn.a aVar5, long j10, TrackingEventsLogger trackingEventsLogger, @Nullable String str7, pq.a aVar6, rq.b bVar) {
        return new c(context, str, str2, z0Var, list, aVar, str3, str4, str5, aVar2, aVar3, aVar4, str6, vVar, aVar5, j10, trackingEventsLogger, str7, aVar6, bVar);
    }

    public c b(String str, String str2, z0 z0Var, List<? extends b0> list, String str3, String str4, String str5, @Nullable String str6, v vVar, long j10, @Nullable String str7, rq.b bVar) {
        return c(this.f30214a.get(), str, str2, z0Var, list, this.b.get(), str3, str4, str5, this.f30215c.get(), this.f30216d.get(), this.f30217e.get(), str6, vVar, this.f30218f.get(), j10, this.f30219g.get(), str7, this.f30220h.get(), bVar);
    }
}

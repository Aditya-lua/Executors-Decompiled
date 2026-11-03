package no;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f27394a;
    public final i<com.withpersona.sdk2.inquiry.governmentid.network.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<kq.a> f27395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<co.a> f27396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<pq.a> f27397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<jn.a> f27398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f27399g;

    public d(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<kq.a> iVar3, i<co.a> iVar4, i<pq.a> iVar5, i<jn.a> iVar6, i<TrackingEventsLogger> iVar7) {
        this.f27394a = iVar;
        this.b = iVar2;
        this.f27395c = iVar3;
        this.f27396d = iVar4;
        this.f27397e = iVar5;
        this.f27398f = iVar6;
        this.f27399g = iVar7;
    }

    public static d a(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<kq.a> iVar3, i<co.a> iVar4, i<pq.a> iVar5, i<jn.a> iVar6, i<TrackingEventsLogger> iVar7) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static c c(Context context, String str, String str2, String str3, String str4, com.withpersona.sdk2.inquiry.governmentid.network.b bVar, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, kq.a aVar, co.a aVar2, pq.a aVar3, @Nullable String str5, CameraProperties cameraProperties, jn.a aVar4, TrackingEventsLogger trackingEventsLogger) {
        return new c(context, str, str2, str3, str4, bVar, governmentIdRequestArguments, aVar, aVar2, aVar3, str5, cameraProperties, aVar4, trackingEventsLogger);
    }

    public c b(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return c(this.f27394a.get(), str, str2, str3, str4, this.b.get(), governmentIdRequestArguments, this.f27395c.get(), this.f27396d.get(), this.f27397e.get(), str5, cameraProperties, this.f27398f.get(), this.f27399g.get());
    }
}

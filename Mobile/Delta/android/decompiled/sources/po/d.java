package po;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ft.i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f28800a;
    public final i<com.withpersona.sdk2.inquiry.governmentid.network.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<mq.a> f28801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<fo.a> f28802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<rq.a> f28803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<ln.a> f28804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f28805g;

    public d(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<mq.a> iVar3, i<fo.a> iVar4, i<rq.a> iVar5, i<ln.a> iVar6, i<TrackingEventsLogger> iVar7) {
        this.f28800a = iVar;
        this.b = iVar2;
        this.f28801c = iVar3;
        this.f28802d = iVar4;
        this.f28803e = iVar5;
        this.f28804f = iVar6;
        this.f28805g = iVar7;
    }

    public static d a(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<mq.a> iVar3, i<fo.a> iVar4, i<rq.a> iVar5, i<ln.a> iVar6, i<TrackingEventsLogger> iVar7) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static c c(Context context, String str, String str2, String str3, String str4, com.withpersona.sdk2.inquiry.governmentid.network.b bVar, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, mq.a aVar, fo.a aVar2, rq.a aVar3, @Nullable String str5, CameraProperties cameraProperties, ln.a aVar4, TrackingEventsLogger trackingEventsLogger) {
        return new c(context, str, str2, str3, str4, bVar, governmentIdRequestArguments, aVar, aVar2, aVar3, str5, cameraProperties, aVar4, trackingEventsLogger);
    }

    public c b(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return c(this.f28800a.get(), str, str2, str3, str4, this.b.get(), governmentIdRequestArguments, this.f28801c.get(), this.f28802d.get(), this.f28803e.get(), str5, cameraProperties, this.f28804f.get(), this.f28805g.get());
    }
}

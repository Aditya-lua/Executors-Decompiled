package aq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f3499a;
    public final i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<kq.a> f3500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<co.a> f3501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<pq.a> f3502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<jn.a> f3503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f3504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i<DirectFileUploader> f3505h;

    public c(i<Context> iVar, i<a> iVar2, i<kq.a> iVar3, i<co.a> iVar4, i<pq.a> iVar5, i<jn.a> iVar6, i<TrackingEventsLogger> iVar7, i<DirectFileUploader> iVar8) {
        this.f3499a = iVar;
        this.b = iVar2;
        this.f3500c = iVar3;
        this.f3501d = iVar4;
        this.f3502e = iVar5;
        this.f3503f = iVar6;
        this.f3504g = iVar7;
        this.f3505h = iVar8;
    }

    public static c a(i<Context> iVar, i<a> iVar2, i<kq.a> iVar3, i<co.a> iVar4, i<pq.a> iVar5, i<jn.a> iVar6, i<TrackingEventsLogger> iVar7, i<DirectFileUploader> iVar8) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static b c(Context context, String str, String str2, SelfieType selfieType, List<? extends Selfie> list, a aVar, String str3, String str4, String str5, kq.a aVar2, co.a aVar3, pq.a aVar4, @Nullable String str6, CameraProperties cameraProperties, jn.a aVar5, long j10, TrackingEventsLogger trackingEventsLogger, @Nullable String str7, DirectFileUploader directFileUploader, bq.a aVar6) {
        return new b(context, str, str2, selfieType, list, aVar, str3, str4, str5, aVar2, aVar3, aVar4, str6, cameraProperties, aVar5, j10, trackingEventsLogger, str7, directFileUploader, aVar6);
    }

    public b b(String str, String str2, SelfieType selfieType, List<? extends Selfie> list, String str3, String str4, String str5, @Nullable String str6, CameraProperties cameraProperties, long j10, @Nullable String str7, bq.a aVar) {
        return c(this.f3499a.get(), str, str2, selfieType, list, this.b.get(), str3, str4, str5, this.f3500c.get(), this.f3501d.get(), this.f3502e.get(), str6, cameraProperties, this.f3503f.get(), j10, this.f3504g.get(), str7, this.f3505h.get(), aVar);
    }
}

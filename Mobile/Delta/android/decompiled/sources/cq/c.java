package cq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ft.i;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f14085a;
    public final i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<mq.a> f14086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<fo.a> f14087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<rq.a> f14088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<ln.a> f14089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f14090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i<DirectFileUploader> f14091h;

    public c(i<Context> iVar, i<a> iVar2, i<mq.a> iVar3, i<fo.a> iVar4, i<rq.a> iVar5, i<ln.a> iVar6, i<TrackingEventsLogger> iVar7, i<DirectFileUploader> iVar8) {
        this.f14085a = iVar;
        this.b = iVar2;
        this.f14086c = iVar3;
        this.f14087d = iVar4;
        this.f14088e = iVar5;
        this.f14089f = iVar6;
        this.f14090g = iVar7;
        this.f14091h = iVar8;
    }

    public static c a(i<Context> iVar, i<a> iVar2, i<mq.a> iVar3, i<fo.a> iVar4, i<rq.a> iVar5, i<ln.a> iVar6, i<TrackingEventsLogger> iVar7, i<DirectFileUploader> iVar8) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static b c(Context context, String str, String str2, SelfieType selfieType, List<? extends Selfie> list, a aVar, String str3, String str4, String str5, mq.a aVar2, fo.a aVar3, rq.a aVar4, @Nullable String str6, CameraProperties cameraProperties, ln.a aVar5, long j10, TrackingEventsLogger trackingEventsLogger, @Nullable String str7, DirectFileUploader directFileUploader, dq.a aVar6) {
        return new b(context, str, str2, selfieType, list, aVar, str3, str4, str5, aVar2, aVar3, aVar4, str6, cameraProperties, aVar5, j10, trackingEventsLogger, str7, directFileUploader, aVar6);
    }

    public b b(String str, String str2, SelfieType selfieType, List<? extends Selfie> list, String str3, String str4, String str5, @Nullable String str6, CameraProperties cameraProperties, long j10, @Nullable String str7, dq.a aVar) {
        return c(this.f14085a.get(), str, str2, selfieType, list, this.b.get(), str3, str4, str5, this.f14086c.get(), this.f14087d.get(), this.f14088e.get(), str6, cameraProperties, this.f14089f.get(), j10, this.f14090g.get(), str7, this.f14091h.get(), aVar);
    }
}

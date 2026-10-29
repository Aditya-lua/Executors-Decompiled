package p059cq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fo.InterfaceC5720a;
import java.util.List;
import mq.InterfaceC8644a;
import org.jetbrains.annotations.Nullable;
import p083dq.C4658a;
import p136ft.InterfaceC5835i;
import p276ln.InterfaceC8169a;
import p420rq.InterfaceC11067a;

/* JADX INFO: renamed from: cq.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4198c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f17980a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC4196a> f17981b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC8644a> f17982c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<InterfaceC5720a> f17983d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<InterfaceC11067a> f17984e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<InterfaceC8169a> f17985f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<TrackingEventsLogger> f17986g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<DirectFileUploader> f17987h;

    public C4198c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC4196a> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3, InterfaceC5835i<InterfaceC5720a> interfaceC5835i4, InterfaceC5835i<InterfaceC11067a> interfaceC5835i5, InterfaceC5835i<InterfaceC8169a> interfaceC5835i6, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i7, InterfaceC5835i<DirectFileUploader> interfaceC5835i8) {
        this.f17980a = interfaceC5835i;
        this.f17981b = interfaceC5835i2;
        this.f17982c = interfaceC5835i3;
        this.f17983d = interfaceC5835i4;
        this.f17984e = interfaceC5835i5;
        this.f17985f = interfaceC5835i6;
        this.f17986g = interfaceC5835i7;
        this.f17987h = interfaceC5835i8;
    }

    /* JADX INFO: renamed from: a */
    public static C4198c m21724a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC4196a> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3, InterfaceC5835i<InterfaceC5720a> interfaceC5835i4, InterfaceC5835i<InterfaceC11067a> interfaceC5835i5, InterfaceC5835i<InterfaceC8169a> interfaceC5835i6, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i7, InterfaceC5835i<DirectFileUploader> interfaceC5835i8) {
        return new C4198c(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8);
    }

    /* JADX INFO: renamed from: c */
    public static C4197b m21725c(Context context, String str, String str2, SelfieType selfieType, List<? extends Selfie> list, InterfaceC4196a interfaceC4196a, String str3, String str4, String str5, InterfaceC8644a interfaceC8644a, InterfaceC5720a interfaceC5720a, InterfaceC11067a interfaceC11067a, @Nullable String str6, CameraProperties cameraProperties, InterfaceC8169a interfaceC8169a, long j10, TrackingEventsLogger trackingEventsLogger, @Nullable String str7, DirectFileUploader directFileUploader, C4658a c4658a) {
        return new C4197b(context, str, str2, selfieType, list, interfaceC4196a, str3, str4, str5, interfaceC8644a, interfaceC5720a, interfaceC11067a, str6, cameraProperties, interfaceC8169a, j10, trackingEventsLogger, str7, directFileUploader, c4658a);
    }

    /* JADX INFO: renamed from: b */
    public C4197b m21726b(String str, String str2, SelfieType selfieType, List<? extends Selfie> list, String str3, String str4, String str5, @Nullable String str6, CameraProperties cameraProperties, long j10, @Nullable String str7, C4658a c4658a) {
        return m21725c(this.f17980a.get(), str, str2, selfieType, list, this.f17981b.get(), str3, str4, str5, this.f17982c.get(), this.f17983d.get(), this.f17984e.get(), str6, cameraProperties, this.f17985f.get(), j10, this.f17986g.get(), str7, this.f17987h.get(), c4658a);
    }
}

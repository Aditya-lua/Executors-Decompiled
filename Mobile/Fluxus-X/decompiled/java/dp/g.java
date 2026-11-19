package dp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;
import sn.v;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f12611a;
    public final i<com.withpersona.sdk2.inquiry.governmentid.network.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<ar.a> f12612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<so.a> f12613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<fr.a> f12614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<yn.a> f12615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<TrackingEventsLogger> f12616g;

    public g(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<ar.a> iVar3, i<so.a> iVar4, i<fr.a> iVar5, i<yn.a> iVar6, i<TrackingEventsLogger> iVar7) {
        this.f12611a = iVar;
        this.b = iVar2;
        this.f12612c = iVar3;
        this.f12613d = iVar4;
        this.f12614e = iVar5;
        this.f12615f = iVar6;
        this.f12616g = iVar7;
    }

    public static g a(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.b> iVar2, i<ar.a> iVar3, i<so.a> iVar4, i<fr.a> iVar5, i<yn.a> iVar6, i<TrackingEventsLogger> iVar7) {
        return new g(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static f c(Context context, String str, String str2, String str3, String str4, com.withpersona.sdk2.inquiry.governmentid.network.b bVar, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, ar.a aVar, so.a aVar2, fr.a aVar3, @Nullable String str5, v vVar, yn.a aVar4, TrackingEventsLogger trackingEventsLogger) {
        return new f(context, str, str2, str3, str4, bVar, governmentIdRequestArguments, aVar, aVar2, aVar3, str5, vVar, aVar4, trackingEventsLogger);
    }

    public f b(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, v vVar) {
        return c(this.f12611a.get(), str, str2, str3, str4, this.b.get(), governmentIdRequestArguments, this.f12612c.get(), this.f12613d.get(), this.f12614e.get(), str5, vVar, this.f12615f.get(), this.f12616g.get());
    }
}

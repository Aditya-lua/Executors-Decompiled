package vo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f33588a;
    public final dt.i<g.c<kp.b>> b;

    public c(dt.i<Context> iVar, dt.i<g.c<kp.b>> iVar2) {
        this.f33588a = iVar;
        this.b = iVar2;
    }

    public static c a(dt.i<Context> iVar, dt.i<g.c<kp.b>> iVar2) {
        return new c(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.integration.a c(Context context, g.c<kp.b> cVar, String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return new com.withpersona.sdk2.inquiry.integration.a(context, cVar, str, str2, browserSelection, integrationStepBrowserType);
    }

    public com.withpersona.sdk2.inquiry.integration.a b(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return c(this.f33588a.get(), this.b.get(), str, str2, browserSelection, integrationStepBrowserType);
    }
}

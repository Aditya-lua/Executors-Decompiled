package lp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f22398a;
    public final wt.i<g.d<aq.b>> b;

    public d(wt.i<Context> iVar, wt.i<g.d<aq.b>> iVar2) {
        this.f22398a = iVar;
        this.b = iVar2;
    }

    public static d a(wt.i<Context> iVar, wt.i<g.d<aq.b>> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(Context context, g.d<aq.b> dVar, String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return new c(context, dVar, str, str2, browserSelection, integrationStepBrowserType);
    }

    public c b(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return c(this.f22398a.get(), this.b.get(), str, str2, browserSelection, integrationStepBrowserType);
    }
}

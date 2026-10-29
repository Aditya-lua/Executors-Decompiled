package xo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f35266a;
    public final ft.i<g.c<mp.b>> b;

    public c(ft.i<Context> iVar, ft.i<g.c<mp.b>> iVar2) {
        this.f35266a = iVar;
        this.b = iVar2;
    }

    public static c a(ft.i<Context> iVar, ft.i<g.c<mp.b>> iVar2) {
        return new c(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.integration.a c(Context context, g.c<mp.b> cVar, String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return new com.withpersona.sdk2.inquiry.integration.a(context, cVar, str, str2, browserSelection, integrationStepBrowserType);
    }

    public com.withpersona.sdk2.inquiry.integration.a b(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return c(this.f35266a.get(), this.b.get(), str, str2, browserSelection, integrationStepBrowserType);
    }
}

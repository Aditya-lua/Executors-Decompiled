package lp;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22399a;

    public e(d dVar) {
        this.f22399a = dVar;
    }

    public static wt.i<c.a> b(d dVar) {
        return wt.e.a(new e(dVar));
    }

    @Override // lp.c.a
    public c a(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return this.f22399a.b(str, str2, browserSelection, integrationStepBrowserType);
    }
}

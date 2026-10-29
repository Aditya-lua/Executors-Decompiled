package com.withpersona.sdk2.inquiry.integration;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import ft.e;
import ft.i;
import xo.BrowserSelection;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0204a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo.c f11148a;

    public b(xo.c cVar) {
        this.f11148a = cVar;
    }

    public static i<a.InterfaceC0204a> b(xo.c cVar) {
        return e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a
    public a a(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return this.f11148a.b(str, str2, browserSelection, integrationStepBrowserType);
    }
}

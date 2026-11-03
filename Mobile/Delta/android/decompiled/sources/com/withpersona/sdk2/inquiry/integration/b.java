package com.withpersona.sdk2.inquiry.integration;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import dt.e;
import dt.i;
import vo.BrowserSelection;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0207a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo.c f11229a;

    public b(vo.c cVar) {
        this.f11229a = cVar;
    }

    public static i<a.InterfaceC0207a> b(vo.c cVar) {
        return e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a
    public a a(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return this.f11229a.b(str, str2, browserSelection, integrationStepBrowserType);
    }
}

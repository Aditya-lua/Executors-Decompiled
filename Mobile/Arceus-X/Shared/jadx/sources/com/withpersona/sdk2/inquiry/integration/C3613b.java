package com.withpersona.sdk2.inquiry.integration;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p554xo.BrowserSelection;
import p554xo.C12871c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3613b implements C3612a.a {

    /* JADX INFO: renamed from: a */
    public final C12871c f14368a;

    public C3613b(C12871c c12871c) {
        this.f14368a = c12871c;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3612a.a> m18008b(C12871c c12871c) {
        return C5831e.m26182a(new C3613b(c12871c));
    }

    @Override // com.withpersona.sdk2.inquiry.integration.C3612a.a
    /* JADX INFO: renamed from: a */
    public C3612a mo18005a(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return this.f14368a.m47904b(str, str2, browserSelection, integrationStepBrowserType);
    }
}

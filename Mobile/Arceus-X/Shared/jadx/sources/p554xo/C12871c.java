package p554xo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.integration.C3612a;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import mp.InterfaceC8611b;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: xo.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12871c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f45726a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> f45727b;

    public C12871c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i2) {
        this.f45726a = interfaceC5835i;
        this.f45727b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C12871c m47902a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i2) {
        return new C12871c(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3612a m47903c(Context context, AbstractC5854c<InterfaceC8611b> abstractC5854c, String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return new C3612a(context, abstractC5854c, str, str2, browserSelection, integrationStepBrowserType);
    }

    /* JADX INFO: renamed from: b */
    public C3612a m47904b(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return m47903c(this.f45726a.get(), this.f45727b.get(), str, str2, browserSelection, integrationStepBrowserType);
    }
}

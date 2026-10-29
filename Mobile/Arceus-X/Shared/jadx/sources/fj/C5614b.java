package fj;

import android.app.Activity;
import com.android.billingclient.api.AbstractC1745a;
import com.android.billingclient.api.C1747c;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1750f;
import java.util.List;
import p151gk.C6124q;
import p486v7.C12018b;
import p486v7.C12030e;
import p486v7.C12052k;
import p486v7.C12064o;
import p486v7.InterfaceC12022c;
import p486v7.InterfaceC12026d;
import p486v7.InterfaceC12034f;
import p486v7.InterfaceC12049j;
import p486v7.InterfaceC12055l;

/* JADX INFO: renamed from: fj.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5614b implements InterfaceC5627h0 {

    /* JADX INFO: renamed from: a */
    public AbstractC1745a f21521a;

    /* JADX INFO: renamed from: i */
    public static Long m25426i(C12052k c12052k) {
        if (c12052k.m44880a() != null && c12052k.m44880a().m44841b() != null) {
            try {
                return Long.valueOf(Long.parseLong(c12052k.m44880a().m44841b()));
            } catch (NumberFormatException e10) {
                C6124q.m27066k("rbx.purchaseflow", "parsing obfuscatedProfileId failed: " + e10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static String m25427j(C12052k c12052k) {
        List<String> listM44884e = c12052k.m44884e();
        if (listM44884e.size() > 0) {
            return listM44884e.get(0);
        }
        return null;
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: a */
    public void mo25428a(C1750f c1750f, InterfaceC12049j interfaceC12049j) {
        this.f21521a.mo8466g(c1750f, interfaceC12049j);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: b */
    public void mo25429b(InterfaceC12026d interfaceC12026d) {
        this.f21521a.mo8468i(interfaceC12026d);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: c */
    public void mo25430c(C12030e c12030e, InterfaceC12034f interfaceC12034f) {
        this.f21521a.mo8462b(c12030e, interfaceC12034f);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: d */
    public void mo25431d(C12018b c12018b, InterfaceC12022c interfaceC12022c) {
        this.f21521a.mo8461a(c12018b, interfaceC12022c);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: e */
    public C1748d mo25432e(String str) {
        return this.f21521a.mo8463c(str);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: f */
    public void mo25433f(AbstractC1745a abstractC1745a) {
        this.f21521a = abstractC1745a;
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: g */
    public void mo25434g(C12064o c12064o, InterfaceC12055l interfaceC12055l) {
        this.f21521a.mo8467h(c12064o, interfaceC12055l);
    }

    @Override // fj.InterfaceC5627h0
    /* JADX INFO: renamed from: h */
    public C1748d mo25435h(Activity activity, C1747c c1747c) {
        return this.f21521a.mo8465e(activity, c1747c);
    }

    @Override // fj.InterfaceC5627h0
    public boolean isReady() {
        return this.f21521a.mo8464d();
    }
}

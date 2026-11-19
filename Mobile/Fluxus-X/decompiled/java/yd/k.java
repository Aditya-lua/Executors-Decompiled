package yd;

import android.os.Bundle;
import zd.t;

/* JADX INFO: loaded from: classes2.dex */
public class k extends zd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd.i f37723a;
    public final tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f37724c;

    public k(m mVar, zd.i iVar, tb.k kVar) {
        this.f37724c = mVar;
        this.f37723a = iVar;
        this.b = kVar;
    }

    @Override // zd.h
    public void l(Bundle bundle) {
        t tVar = this.f37724c.f37726a;
        if (tVar != null) {
            tVar.u(this.b);
        }
        this.f37723a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}

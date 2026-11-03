package wd;

import android.os.Bundle;
import sb.k;
import xd.i;
import xd.t;

/* JADX INFO: loaded from: classes2.dex */
public class f extends xd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f34366a;
    public final k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f34367c;

    public f(g gVar, i iVar, k kVar) {
        this.f34367c = gVar;
        this.f34366a = iVar;
        this.b = kVar;
    }

    public void l(Bundle bundle) {
        t tVar = this.f34367c.f34369a;
        if (tVar != null) {
            tVar.u(this.b);
        }
        this.f34366a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}

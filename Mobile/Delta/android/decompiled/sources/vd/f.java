package vd;

import android.os.Bundle;
import sb.k;
import wd.i;
import wd.t;

/* JADX INFO: loaded from: classes2.dex */
public class f extends wd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f32912a;
    public final k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f32913c;

    public f(g gVar, i iVar, k kVar) {
        this.f32913c = gVar;
        this.f32912a = iVar;
        this.b = kVar;
    }

    public void l(Bundle bundle) {
        t tVar = this.f32913c.f32915a;
        if (tVar != null) {
            tVar.u(this.b);
        }
        this.f32912a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}

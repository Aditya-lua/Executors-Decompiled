package p514wd;

import android.os.Bundle;
import p543xd.AbstractBinderC12786g;
import p543xd.C12788i;
import p543xd.C12799t;
import sb.C11264k;

/* JADX INFO: renamed from: wd.f */
/* JADX INFO: loaded from: classes2.dex */
public class BinderC12354f extends AbstractBinderC12786g {

    /* JADX INFO: renamed from: a */
    public final C12788i f44208a;

    /* JADX INFO: renamed from: b */
    public final C11264k f44209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C12355g f44210c;

    public BinderC12354f(C12355g c12355g, C12788i c12788i, C11264k c11264k) {
        this.f44210c = c12355g;
        this.f44208a = c12788i;
        this.f44209b = c11264k;
    }

    /* JADX INFO: renamed from: l */
    public void mo13352l(Bundle bundle) {
        C12799t c12799t = this.f44210c.f44212a;
        if (c12799t != null) {
            c12799t.m47676u(this.f44209b);
        }
        this.f44208a.m47652c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}

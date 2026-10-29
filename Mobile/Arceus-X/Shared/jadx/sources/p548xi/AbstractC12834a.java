package p548xi;

import android.R;
import android.view.View;
import com.roblox.client.AbstractActivityC3152a;
import p093e4.ActivityC4831q;
import p310nk.C9491b;

/* JADX INFO: renamed from: xi.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12834a {

    /* JADX INFO: renamed from: a */
    public ActivityC4831q f45633a;

    public AbstractC12834a(ActivityC4831q activityC4831q) {
        this.f45633a = activityC4831q;
    }

    /* JADX INFO: renamed from: a */
    public boolean m47772a() {
        ActivityC4831q activityC4831q = this.f45633a;
        if (activityC4831q == null) {
            return false;
        }
        return ((activityC4831q instanceof AbstractActivityC3152a) && ((AbstractActivityC3152a) activityC4831q).m14844N1()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public int m47773b() {
        View viewFindViewById = this.f45633a.findViewById(R.id.content);
        C9491b c9491bM37386a = C9491b.m37386a(viewFindViewById.getRootView(), this.f45633a.getWindowManager(), viewFindViewById, ((AbstractActivityC3152a) this.f45633a).m14962G1().m34391c());
        return (c9491bM37386a.f34102b - c9491bM37386a.f34107g) - c9491bM37386a.f34103c;
    }
}

package vi;

import android.R;
import android.view.View;
import e4.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f33516a;

    public a(q qVar) {
        this.f33516a = qVar;
    }

    public boolean a() {
        q qVar = this.f33516a;
        if (qVar == null) {
            return false;
        }
        return ((qVar instanceof com.roblox.client.a) && ((com.roblox.client.a) qVar).N1()) ? false : true;
    }

    public int b() {
        View viewFindViewById = this.f33516a.findViewById(R.id.content);
        lk.b bVarA = lk.b.a(viewFindViewById.getRootView(), this.f33516a.getWindowManager(), viewFindViewById, ((com.roblox.client.a) this.f33516a).G1().c());
        return (bVarA.b - bVarA.f23586g) - bVarA.f23582c;
    }
}

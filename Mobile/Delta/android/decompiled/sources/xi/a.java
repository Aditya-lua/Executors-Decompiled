package xi;

import android.R;
import android.view.View;
import e4.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f35194a;

    public a(q qVar) {
        this.f35194a = qVar;
    }

    public boolean a() {
        q qVar = this.f35194a;
        if (qVar == null) {
            return false;
        }
        return ((qVar instanceof com.roblox.client.a) && ((com.roblox.client.a) qVar).N1()) ? false : true;
    }

    public int b() {
        View viewFindViewById = this.f35194a.findViewById(R.id.content);
        nk.b bVarA = nk.b.a(viewFindViewById.getRootView(), this.f35194a.getWindowManager(), viewFindViewById, ((com.roblox.client.a) this.f35194a).G1().c());
        return (bVarA.b - bVarA.f26297g) - bVarA.f26293c;
    }
}

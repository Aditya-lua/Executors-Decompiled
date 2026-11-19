package fj;

import android.R;
import android.view.View;
import f4.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f16122a;

    public a(v vVar) {
        this.f16122a = vVar;
    }

    public boolean a() {
        v vVar = this.f16122a;
        if (vVar == null) {
            return false;
        }
        return ((vVar instanceof com.roblox.client.a) && ((com.roblox.client.a) vVar).N1()) ? false : true;
    }

    public int b() {
        View viewFindViewById = this.f16122a.findViewById(R.id.content);
        vk.b bVarB = vk.b.b(viewFindViewById.getRootView(), this.f16122a.getWindowManager(), viewFindViewById, ((com.roblox.client.a) this.f16122a).G1().d());
        return (bVarB.b - bVarB.f34413g) - bVarB.f34409c;
    }
}

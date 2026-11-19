package cp;

import vo.IdConfig;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements GovernmentIdHintWorker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11506a;

    public c(b bVar) {
        this.f11506a = bVar;
    }

    public static i<GovernmentIdHintWorker.b> b(b bVar) {
        return wt.e.a(new c(bVar));
    }

    @Override // cp.GovernmentIdHintWorker.b
    public GovernmentIdHintWorker a(IdConfig.e eVar) {
        return this.f11506a.b(eVar);
    }
}

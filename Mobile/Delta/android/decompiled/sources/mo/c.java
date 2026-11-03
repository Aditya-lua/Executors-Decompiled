package mo;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dt.e;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements GovernmentIdHintWorker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24956a;

    public c(b bVar) {
        this.f24956a = bVar;
    }

    public static i<GovernmentIdHintWorker.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override // mo.GovernmentIdHintWorker.b
    public GovernmentIdHintWorker a(IdConfig.b bVar) {
        return this.f24956a.b(bVar);
    }
}

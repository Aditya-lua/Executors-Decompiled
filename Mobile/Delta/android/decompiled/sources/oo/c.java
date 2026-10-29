package oo;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import ft.e;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements GovernmentIdHintWorker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f27567a;

    public c(b bVar) {
        this.f27567a = bVar;
    }

    public static i<GovernmentIdHintWorker.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override // oo.GovernmentIdHintWorker.b
    public GovernmentIdHintWorker a(IdConfig.b bVar) {
        return this.f27567a.b(bVar);
    }
}

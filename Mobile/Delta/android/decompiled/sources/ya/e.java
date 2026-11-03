package ya;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k9.e implements z8.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a.g f36641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a.AbstractC0391a f36642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k9.a f36643n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36644k;

    static {
        k9.a.g gVar = new k9.a.g();
        f36641l = gVar;
        c cVar = new c();
        f36642m = cVar;
        f36643n = new k9.a("Auth.Api.Identity.CredentialSaving.API", cVar, gVar);
    }

    public e(@NonNull Context context, @NonNull z8.e eVar) {
        super(context, (k9.a<z8.e>) f36643n, eVar, k9.e.a.f22504c);
        this.f36644k = r.a();
    }

    @Override // z8.a
    public final Task<SavePasswordResult> m(@NonNull SavePasswordRequest savePasswordRequest) {
        n9.m.l(savePasswordRequest);
        SavePasswordRequest.a aVarX3 = SavePasswordRequest.x3(savePasswordRequest);
        aVarX3.c(this.f36644k);
        final SavePasswordRequest savePasswordRequestA = aVarX3.a();
        return z(l9.u.c().d(q.f36661e).b(new l9.q() { // from class: ya.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((a0) ((x) obj).getService()).t2(new d(this.f36639a, (sb.k) obj2), (SavePasswordRequest) n9.m.l(savePasswordRequestA));
            }
        }).c(false).e(1536).a());
    }
}

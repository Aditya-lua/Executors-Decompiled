package p572ya;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import p305n9.C8953m;
import p598z8.C13741e;
import p598z8.InterfaceC13737a;
import sb.C11264k;

/* JADX INFO: renamed from: ya.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13144e extends AbstractC7495e implements InterfaceC13737a {

    /* JADX INFO: renamed from: l */
    public static final C7491a.g f46396l;

    /* JADX INFO: renamed from: m */
    public static final C7491a.a f46397m;

    /* JADX INFO: renamed from: n */
    public static final C7491a f46398n;

    /* JADX INFO: renamed from: k */
    public final String f46399k;

    static {
        C7491a.g gVar = new C7491a.g();
        f46396l = gVar;
        C13140c c13140c = new C13140c();
        f46397m = c13140c;
        f46398n = new C7491a("Auth.Api.Identity.CredentialSaving.API", c13140c, gVar);
    }

    public C13144e(@NonNull Context context, @NonNull C13741e c13741e) {
        super(context, (C7491a<C13741e>) f46398n, c13741e, AbstractC7495e.a.f28860c);
        this.f46399k = C13161r.m48764a();
    }

    @Override // p598z8.InterfaceC13737a
    /* JADX INFO: renamed from: m */
    public final Task<SavePasswordResult> mo48749m(@NonNull SavePasswordRequest savePasswordRequest) {
        C8953m.m36047l(savePasswordRequest);
        SavePasswordRequest.C1879a c1879aM9045x3 = SavePasswordRequest.m9045x3(savePasswordRequest);
        c1879aM9045x3.m9049c(this.f46399k);
        final SavePasswordRequest savePasswordRequestM9047a = c1879aM9045x3.m9047a();
        return m31151z(AbstractC8078u.m33280c().m33288d(C13160q.f46420e).m33286b(new InterfaceC8066q() { // from class: ya.b
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C13137a0) ((C13167x) obj).getService()).m48746t2(new BinderC13142d(this.f46393a, (C11264k) obj2), (SavePasswordRequest) C8953m.m36047l(savePasswordRequestM9047a));
            }
        }).m33287c(false).m33289e(1536).m33285a());
    }
}

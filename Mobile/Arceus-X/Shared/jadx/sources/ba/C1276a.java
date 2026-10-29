package ba;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import p100eb.C5007s4;
import p100eb.C5013t4;
import p100eb.C5031w4;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.C8017a;
import p268l9.InterfaceC8066q;
import sb.C11264k;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: loaded from: classes.dex */
public class C1276a extends AbstractC7495e<C7491a.d.c> {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f5301k;

    /* JADX INFO: renamed from: l */
    public static final C7491a f5302l;

    static {
        C7491a.g gVar = new C7491a.g();
        f5301k = gVar;
        f5302l = new C7491a("Fido.FIDO2_API", new C5007s4(), gVar);
    }

    @Deprecated
    public C1276a(@NonNull Context context) {
        super(context, (C7491a<C7491a.d.c>) f5302l, C7491a.d.f28847Jo, new C8017a());
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, com.google.android.gms.tasks.Task<android.app.PendingIntent> */
    @NonNull
    /* JADX INFO: renamed from: P */
    public Task<PendingIntent> m7058P(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return m31151z(AbstractC8078u.m33280c().m33286b(new InterfaceC8066q() { // from class: ba.b
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C5031w4) ((C5013t4) obj).getService()).m23716t2(new BinderC1278c(this.f5303a, (C11264k) obj2), publicKeyCredentialCreationOptions);
            }
        }).m33289e(5407).m33285a());
    }
}

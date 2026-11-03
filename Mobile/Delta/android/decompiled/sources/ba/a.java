package ba;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import eb.s4;
import eb.t4;
import eb.w4;
import k9.e;
import l9.q;
import l9.u;
import sb.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends e<k9.a.d.c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.a.g f3955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a f3956l;

    static {
        k9.a.g gVar = new k9.a.g();
        f3955k = gVar;
        f3956l = new k9.a("Fido.FIDO2_API", new s4(), gVar);
    }

    @Deprecated
    public a(@NonNull Context context) {
        super(context, (k9.a<k9.a.d.c>) f3956l, k9.a.d.Ko, new l9.a());
    }

    @NonNull
    public Task<PendingIntent> P(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return z(u.c().b(new q() { // from class: ba.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((w4) ((t4) obj).getService()).t2(new c(this.f3957a, (k) obj2), publicKeyCredentialCreationOptions);
            }
        }).e(5407).a());
    }
}

package ca;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import da.r;
import fb.s4;
import fb.t4;
import fb.w4;
import l9.g;
import m9.q;
import m9.u;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends g<l9.a.d.c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f4940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a f4941l;

    static {
        l9.a.g gVar = new l9.a.g();
        f4940k = gVar;
        f4941l = new l9.a("Fido.FIDO2_API", new s4(), gVar);
    }

    @Deprecated
    public a(@NonNull Context context) {
        super(context, (l9.a<l9.a.d.c>) f4941l, l9.a.d.Oo, new m9.a());
    }

    @NonNull
    public Task<PendingIntent> P(@NonNull final r rVar) {
        return z(u.c().b(new q() { // from class: ca.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((w4) ((t4) obj).getService()).t2(new c(this.f4942a, (k) obj2), rVar);
            }
        }).e(5407).a());
    }
}

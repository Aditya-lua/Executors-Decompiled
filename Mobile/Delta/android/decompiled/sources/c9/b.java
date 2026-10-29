package c9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import d9.n;
import n9.l;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends k9.e<GoogleSignInOptions> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f4668k = new j(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f4669l = 1;

    public b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, y8.a.b, googleSignInOptions, new k9.e.a.C0394a().b(new l9.a()).a());
    }

    @NonNull
    public Task<Void> P() {
        return l.b(n.a(w(), G(), Q() == 3));
    }

    public final synchronized int Q() {
        int i10;
        try {
            i10 = f4669l;
            if (i10 == 1) {
                Context contextG = G();
                j9.c cVarO = j9.c.o();
                int iH = cVarO.h(contextG, 12451000);
                if (iH == 0) {
                    i10 = 4;
                    f4669l = 4;
                } else if (cVarO.b(contextG, iH, null) != null || DynamiteModule.a(contextG, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f4669l = 2;
                } else {
                    i10 = 3;
                    f4669l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    @NonNull
    public Task<Void> r() {
        return l.b(n.b(w(), G(), Q() == 3));
    }
}

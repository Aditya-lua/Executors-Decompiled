package d9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import e9.o;
import o9.r;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends l9.g<GoogleSignInOptions> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f11979k = new j(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f11980l = 1;

    public b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, z8.a.b, googleSignInOptions, new l9.g.a.C0423a().b(new m9.a()).a());
    }

    @NonNull
    public Task<Void> P() {
        return r.b(o.a(w(), G(), Q() == 3));
    }

    public final synchronized int Q() {
        int i10;
        try {
            i10 = f11980l;
            if (i10 == 1) {
                Context contextG = G();
                k9.e eVarO = k9.e.o();
                int iH = eVarO.h(contextG, 12451000);
                if (iH == 0) {
                    i10 = 4;
                    f11980l = 4;
                } else if (eVarO.b(contextG, iH, null) != null || DynamiteModule.a(contextG, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f11980l = 2;
                } else {
                    i10 = 3;
                    f11980l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    @NonNull
    public Task<Void> s() {
        return r.b(o.b(w(), G(), Q() == 3));
    }
}

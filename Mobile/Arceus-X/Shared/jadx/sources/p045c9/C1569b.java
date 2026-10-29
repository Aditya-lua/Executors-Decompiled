package p045c9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p072d9.C4486n;
import p213j9.C7089c;
import p242k9.AbstractC7495e;
import p268l9.C8017a;
import p305n9.C8950l;
import p570y8.C13124a;

/* JADX INFO: renamed from: c9.b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1569b extends AbstractC7495e<GoogleSignInOptions> {

    /* JADX INFO: renamed from: k */
    public static final C1577j f6276k = new C1577j(null);

    /* JADX INFO: renamed from: l */
    public static int f6277l = 1;

    public C1569b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C13124a.f46369b, googleSignInOptions, new AbstractC7495e.a.C14196a().m31153b(new C8017a()).m31152a());
    }

    @NonNull
    /* JADX INFO: renamed from: P */
    public Task<Void> m8179P() {
        return C8950l.m36031b(C4486n.m22439a(m31149w(), m31139G(), m8180Q() == 3));
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized int m8180Q() {
        int i10;
        try {
            i10 = f6277l;
            if (i10 == 1) {
                Context contextM31139G = m31139G();
                C7089c c7089cM29849o = C7089c.m29849o();
                int iMo29855h = c7089cM29849o.mo29855h(contextM31139G, 12451000);
                if (iMo29855h == 0) {
                    i10 = 4;
                    f6277l = 4;
                } else if (c7089cM29849o.mo29851b(contextM31139G, iMo29855h, null) != null || DynamiteModule.m9233a(contextM31139G, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f6277l = 2;
                } else {
                    i10 = 3;
                    f6277l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Task<Void> m8181r() {
        return C8950l.m36031b(C4486n.m22440b(m31149w(), m31139G(), m8180Q() == 3));
    }
}

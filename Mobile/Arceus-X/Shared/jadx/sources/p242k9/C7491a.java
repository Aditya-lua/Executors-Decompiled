package p242k9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1903b;
import java.util.Set;
import p242k9.C7491a.d;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8923c;
import p305n9.C8926d;
import p305n9.C8953m;

/* JADX INFO: renamed from: k9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7491a<O extends d> {

    /* JADX INFO: renamed from: a */
    public final a f28844a;

    /* JADX INFO: renamed from: b */
    public final g f28845b;

    /* JADX INFO: renamed from: c */
    public final String f28846c;

    /* JADX INFO: renamed from: k9.a$a */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: a */
        public T mo23559a(@NonNull Context context, @NonNull Looper looper, @NonNull C8926d c8926d, @NonNull O o8, @NonNull AbstractC7496f.a aVar, @NonNull AbstractC7496f.b bVar) {
            return (T) mo299b(context, looper, c8926d, o8, aVar, bVar);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public T mo299b(@NonNull Context context, @NonNull Looper looper, @NonNull C8926d c8926d, @NonNull O o8, @NonNull InterfaceC8030e interfaceC8030e, @NonNull InterfaceC8057n interfaceC8057n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: k9.a$b */
    public interface b {
    }

    /* JADX INFO: renamed from: k9.a$c */
    public static class c<C extends b> {
    }

    /* JADX INFO: renamed from: k9.a$d */
    public interface d {

        /* JADX INFO: renamed from: Jo */
        @NonNull
        public static final c f28847Jo = new c(null);

        /* JADX INFO: renamed from: k9.a$d$a */
        public interface a extends d {
            @NonNull
            /* JADX INFO: renamed from: G2 */
            Account m31128G2();
        }

        /* JADX INFO: renamed from: k9.a$d$b */
        public interface b extends d {
            /* JADX INFO: renamed from: w2 */
            GoogleSignInAccount m31129w2();
        }

        /* JADX INFO: renamed from: k9.a$d$c */
        public static final class c implements d {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public c() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public /* synthetic */ c(C7507q c7507q) {
            }
        }
    }

    /* JADX INFO: renamed from: k9.a$e */
    public static abstract class e<T extends b, O> {
    }

    /* JADX INFO: renamed from: k9.a$f */
    public interface f extends b {
        @NonNull
        /* JADX INFO: renamed from: b */
        Set<Scope> mo26901b();

        void connect(@NonNull AbstractC8923c.c cVar);

        void disconnect();

        void disconnect(@NonNull String str);

        @NonNull
        Feature[] getAvailableFeatures();

        @NonNull
        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC1903b interfaceC1903b, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@NonNull AbstractC8923c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: renamed from: k9.a$g */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> C7491a(@NonNull String str, @NonNull a<C, O> aVar, @NonNull g<C> gVar) {
        C8953m.m36048m(aVar, "Cannot construct an Api with a null ClientBuilder");
        C8953m.m36048m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f28846c = str;
        this.f28844a = aVar;
        this.f28845b = gVar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final a m31125a() {
        return this.f28844a;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final c m31126b() {
        return this.f28845b;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final String m31127c() {
        return this.f28846c;
    }
}

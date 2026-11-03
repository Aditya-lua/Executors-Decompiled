package k9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import k9.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0391a f22491a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22492c;

    /* JADX INFO: renamed from: k9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0391a<T extends f, O> extends e<T, O> {
        @NonNull
        @Deprecated
        public T a(@NonNull Context context, @NonNull Looper looper, @NonNull n9.d dVar, @NonNull O o8, @NonNull k9.f.a aVar, @NonNull k9.f.b bVar) {
            return (T) b(context, looper, dVar, o8, aVar, bVar);
        }

        @NonNull
        public T b(@NonNull Context context, @NonNull Looper looper, @NonNull n9.d dVar, @NonNull O o8, @NonNull l9.e eVar, @NonNull l9.n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        @NonNull
        public static final c Ko = new c(null);

        /* JADX INFO: renamed from: k9.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0392a extends d {
            @NonNull
            Account H2();
        }

        public interface b extends d {
            GoogleSignInAccount x2();
        }

        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(q qVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        @NonNull
        Set<Scope> b();

        void connect(@NonNull n9.c.InterfaceC0461c interfaceC0461c);

        void disconnect();

        void disconnect(@NonNull String str);

        @NonNull
        Feature[] getAvailableFeatures();

        @NonNull
        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@NonNull n9.c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@NonNull String str, @NonNull AbstractC0391a<C, O> abstractC0391a, @NonNull g<C> gVar) {
        n9.m.m(abstractC0391a, "Cannot construct an Api with a null ClientBuilder");
        n9.m.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f22492c = str;
        this.f22491a = abstractC0391a;
        this.b = gVar;
    }

    @NonNull
    public final AbstractC0391a a() {
        return this.f22491a;
    }

    @NonNull
    public final c b() {
        return this.b;
    }

    @NonNull
    public final String c() {
        return this.f22492c;
    }
}

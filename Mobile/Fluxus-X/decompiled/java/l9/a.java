package l9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import l9.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0421a f21984a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21985c;

    /* JADX INFO: renamed from: l9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0421a<T extends f, O> extends e<T, O> {
        @NonNull
        @Deprecated
        public T a(@NonNull Context context, @NonNull Looper looper, @NonNull o9.f fVar, @NonNull O o10, @NonNull h.a aVar, @NonNull h.b bVar) {
            return (T) b(context, looper, fVar, o10, aVar, bVar);
        }

        @NonNull
        public T b(@NonNull Context context, @NonNull Looper looper, @NonNull o9.f fVar, @NonNull O o10, @NonNull m9.e eVar, @NonNull m9.n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        @NonNull
        public static final c Oo = new c(null);

        /* JADX INFO: renamed from: l9.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0422a extends d {
            @NonNull
            Account K2();
        }

        public interface b extends d {
            GoogleSignInAccount z2();
        }

        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(s sVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        @NonNull
        Set<Scope> c();

        void connect(@NonNull o9.d.c cVar);

        void disconnect();

        void disconnect(@NonNull String str);

        @NonNull
        k9.d[] getAvailableFeatures();

        @NonNull
        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(o9.l lVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@NonNull o9.d.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@NonNull String str, @NonNull AbstractC0421a<C, O> abstractC0421a, @NonNull g<C> gVar) {
        o9.s.m(abstractC0421a, "Cannot construct an Api with a null ClientBuilder");
        o9.s.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f21985c = str;
        this.f21984a = abstractC0421a;
        this.b = gVar;
    }

    @NonNull
    public final AbstractC0421a a() {
        return this.f21984a;
    }

    @NonNull
    public final c b() {
        return this.b;
    }

    @NonNull
    public final String c() {
        return this.f21985c;
    }
}

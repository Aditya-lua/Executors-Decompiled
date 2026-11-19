package h9;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import g9.j;
import m9.n;
import m9.q;
import m9.u;
import m9.v;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lh9/f;", "Ll9/g;", "Ll9/a$d$c;", "Lg9/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lg9/a;", "request", "Lcom/google/android/gms/tasks/Task;", "Lg9/c;", "m", "(Lg9/a;)Lcom/google/android/gms/tasks/Task;", "Lg9/e;", "Lg9/g;", "c", "(Lg9/e;)Lcom/google/android/gms/tasks/Task;", "k", "b", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends l9.g<l9.a.d.c> implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final l9.a.g<g> f18121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f18122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final l9.a<l9.a.d.c> f18123n;

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"h9/f$a", "Ll9/a$a;", "Lh9/g;", "Ll9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Lo9/f;", "commonSettings", "apiOptions", "Lm9/e;", "connectedListener", "Lm9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ll9/a$d$c;Lm9/e;Lm9/n;)Lh9/g;", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends l9.a.AbstractC0421a<g, l9.a.d.c> {
        @Override // l9.a.AbstractC0421a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(@NonNull Context context, @NonNull Looper looper, @NonNull o9.f commonSettings, @NonNull l9.a.d.c apiOptions, @NonNull m9.e connectedListener, @NonNull n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new g(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h9/f$c", "Lh9/a$a;", "Lcom/google/android/gms/common/api/Status;", "status", "Lg9/c;", Payload.RESPONSE, BuildConfig.FLAVOR, "N0", "(Lcom/google/android/gms/common/api/Status;Lg9/c;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends h9.a.AbstractBinderC0344a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<g9.c> f18124a;

        public c(k<g9.c> kVar) {
            this.f18124a = kVar;
        }

        @Override // h9.a
        public void N0(@NonNull Status status, @NonNull g9.c response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            v.a(status, response, this.f18124a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h9/f$d", "Lh9/b$a;", "Lcom/google/android/gms/common/api/Status;", "status", "Lg9/g;", Payload.RESPONSE, BuildConfig.FLAVOR, "y0", "(Lcom/google/android/gms/common/api/Status;Lg9/g;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<g9.g> f18125a;

        public d(k<g9.g> kVar) {
            this.f18125a = kVar;
        }

        @Override // h9.b
        public void y0(@NonNull Status status, @NonNull g9.g response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            v.a(status, response, this.f18125a);
        }
    }

    static {
        l9.a.g<g> gVar = new l9.a.g<>();
        f18121l = gVar;
        a aVar = new a();
        f18122m = aVar;
        f18123n = new l9.a<>("RestoreCredential.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NonNull Context context) {
        super(context, f18123n, l9.a.d.Oo, l9.g.a.f22012c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void R(g9.a request, g gVar, k kVar) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((h9.c) gVar.getService()).h0(request, new c(kVar));
    }

    public static final void S(g9.e request, g gVar, k kVar) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((h9.c) gVar.getService()).r(request, new d(kVar));
    }

    @Override // g9.j
    @NotNull
    public Task<g9.g> c(@NonNull final g9.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskZ = z(u.c().d(bb.c.f3859k).b(new q() { // from class: h9.e
            @Override // m9.q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                f.S(request, (g) obj, (k) obj2);
            }
        }).e(1695).a());
        Intrinsics.checkNotNullExpressionValue(taskZ, "doRead(...)");
        return taskZ;
    }

    @Override // g9.j
    @NotNull
    public Task<g9.c> m(@NonNull final g9.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskZ = z(u.c().d(bb.c.f3858j).b(new q() { // from class: h9.d
            @Override // m9.q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                f.R(request, (g) obj, (k) obj2);
            }
        }).e(1693).a());
        Intrinsics.checkNotNullExpressionValue(taskZ, "doRead(...)");
        return taskZ;
    }
}

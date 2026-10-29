package g9;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.n;
import l9.q;
import l9.u;
import l9.v;
import org.jetbrains.annotations.NotNull;
import sb.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lg9/f;", "Lk9/e;", "Lk9/a$d$c;", "Lf9/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "v", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "g", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "k", "b", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends k9.e<k9.a.d.c> implements f9.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final k9.a.g<g> f17945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f17946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final k9.a<k9.a.d.c> f17947n;

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"g9/f$a", "Lk9/a$a;", "Lg9/g;", "Lk9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "commonSettings", "apiOptions", "Ll9/e;", "connectedListener", "Ll9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lk9/a$d$c;Ll9/e;Ll9/n;)Lg9/g;", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends k9.a.AbstractC0392a<g, k9.a.d.c> {
        @Override // k9.a.AbstractC0392a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(@NonNull Context context, @NonNull Looper looper, @NonNull n9.d commonSettings, @NonNull k9.a.d.c apiOptions, @NonNull l9.e connectedListener, @NonNull n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new g(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"g9/f$c", "Lg9/a$a;", "Lcom/google/android/gms/common/api/Status;", "status", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", Payload.RESPONSE, "", "P0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends g9.a.AbstractBinderC0321a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<CreateRestoreCredentialResponse> f17948a;

        public c(k<CreateRestoreCredentialResponse> kVar) {
            this.f17948a = kVar;
        }

        @Override // g9.a
        public void P0(@NonNull Status status, @NonNull CreateRestoreCredentialResponse response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            v.a(status, response, this.f17948a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"g9/f$d", "Lg9/b$a;", "Lcom/google/android/gms/common/api/Status;", "status", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", Payload.RESPONSE, "", "S", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<GetRestoreCredentialResponse> f17949a;

        public d(k<GetRestoreCredentialResponse> kVar) {
            this.f17949a = kVar;
        }

        @Override // g9.b
        public void S(@NonNull Status status, @NonNull GetRestoreCredentialResponse response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            v.a(status, response, this.f17949a);
        }
    }

    static {
        k9.a.g<g> gVar = new k9.a.g<>();
        f17945l = gVar;
        a aVar = new a();
        f17946m = aVar;
        f17947n = new k9.a<>("RestoreCredential.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NonNull Context context) {
        super(context, f17947n, k9.a.d.Jo, k9.e.a.f22280c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void R(CreateRestoreCredentialRequest request, g gVar, k kVar) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((g9.c) gVar.getService()).y(request, new c(kVar));
    }

    public static final void S(GetRestoreCredentialRequest request, g gVar, k kVar) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((g9.c) gVar.getService()).M0(request, new d(kVar));
    }

    @Override // f9.f
    @NotNull
    public Task<GetRestoreCredentialResponse> g(@NonNull final GetRestoreCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskZ = z(u.c().d(ab.c.f302k).b(new q() { // from class: g9.e
            @Override // l9.q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                f.S(request, (g) obj, (k) obj2);
            }
        }).e(1695).a());
        Intrinsics.checkNotNullExpressionValue(taskZ, "doRead(...)");
        return taskZ;
    }

    @Override // f9.f
    @NotNull
    public Task<CreateRestoreCredentialResponse> v(@NonNull final CreateRestoreCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskZ = z(u.c().d(ab.c.f301j).b(new q() { // from class: g9.d
            @Override // l9.q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                f.R(request, (g) obj, (k) obj2);
            }
        }).e(1693).a());
        Intrinsics.checkNotNullExpressionValue(taskZ, "doRead(...)");
        return taskZ;
    }
}

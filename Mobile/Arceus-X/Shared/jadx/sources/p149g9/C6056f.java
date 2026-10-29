package p149g9;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p012ab.C0106c;
import p123f9.InterfaceC5494f;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.C8081v;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p268l9.InterfaceC8066q;
import p305n9.C8926d;
import sb.C11264k;

/* JADX INFO: renamed from: g9.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m31665d2 = {"Lg9/f;", "Lk9/e;", "Lk9/a$d$c;", "Lf9/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "v", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "g", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "k", "b", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C6056f extends AbstractC7495e<C7491a.d.c> implements InterfaceC5494f {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final C7491a.g<C6057g> f23338l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final a f23339m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final C7491a<C7491a.d.c> f23340n;

    /* JADX INFO: renamed from: g9.f$a */
    @Metadata(m31664d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"g9/f$a", "Lk9/a$a;", "Lg9/g;", "Lk9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "commonSettings", "apiOptions", "Ll9/e;", "connectedListener", "Ll9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lk9/a$d$c;Ll9/e;Ll9/n;)Lg9/g;", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a extends C7491a.a<C6057g, C7491a.d.c> {
        /* JADX DEBUG: Method merged with bridge method: b(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Ll9/e;Ll9/n;)Lk9/a$f; */
        @Override // p242k9.C7491a.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6057g mo299b(@NonNull Context context, @NonNull Looper looper, @NonNull C8926d commonSettings, @NonNull C7491a.d.c apiOptions, @NonNull InterfaceC8030e connectedListener, @NonNull InterfaceC8057n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new C6057g(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    /* JADX INFO: renamed from: g9.f$c */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"g9/f$c", "Lg9/a$a;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", Payload.RESPONSE, "", "M0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c extends InterfaceC6051a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11264k<CreateRestoreCredentialResponse> f23341a;

        public c(C11264k<CreateRestoreCredentialResponse> c11264k) {
            this.f23341a = c11264k;
        }

        @Override // p149g9.InterfaceC6051a
        /* JADX INFO: renamed from: M0 */
        public void mo26870M0(@NonNull Status status, @NonNull CreateRestoreCredentialResponse response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            C8081v.m33290a(status, response, this.f23341a);
        }
    }

    /* JADX INFO: renamed from: g9.f$d */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"g9/f$d", "Lg9/b$a;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", Payload.RESPONSE, "", "Q", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d extends InterfaceC6052b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11264k<GetRestoreCredentialResponse> f23342a;

        public d(C11264k<GetRestoreCredentialResponse> c11264k) {
            this.f23342a = c11264k;
        }

        @Override // p149g9.InterfaceC6052b
        /* JADX INFO: renamed from: Q */
        public void mo26871Q(@NonNull Status status, @NonNull GetRestoreCredentialResponse response) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response, "response");
            C8081v.m33290a(status, response, this.f23342a);
        }
    }

    static {
        C7491a.g<C6057g> gVar = new C7491a.g<>();
        f23338l = gVar;
        a aVar = new a();
        f23339m = aVar;
        f23340n = new C7491a<>("RestoreCredential.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6056f(@NonNull Context context) {
        super(context, f23340n, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: R */
    public static final void m26877R(CreateRestoreCredentialRequest request, C6057g c6057g, C11264k c11264k) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((InterfaceC6053c) c6057g.getService()).mo26873y(request, new c(c11264k));
    }

    /* JADX INFO: renamed from: S */
    public static final void m26878S(GetRestoreCredentialRequest request, C6057g c6057g, C11264k c11264k) {
        Intrinsics.checkNotNullParameter(request, "$request");
        ((InterfaceC6053c) c6057g.getService()).mo26872H0(request, new d(c11264k));
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, java.lang.Object, com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse> */
    @Override // p123f9.InterfaceC5494f
    @NotNull
    /* JADX INFO: renamed from: g */
    public Task<GetRestoreCredentialResponse> mo25147g(@NonNull final GetRestoreCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskM31151z = m31151z(AbstractC8078u.m33280c().m33288d(C0106c.f374k).m33286b(new InterfaceC8066q() { // from class: g9.e
            @Override // p268l9.InterfaceC8066q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                C6056f.m26878S(request, (C6057g) obj, (C11264k) obj2);
            }
        }).m33289e(1695).m33285a());
        Intrinsics.checkNotNullExpressionValue(taskM31151z, "doRead(...)");
        return taskM31151z;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, java.lang.Object, com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse> */
    @Override // p123f9.InterfaceC5494f
    @NotNull
    /* JADX INFO: renamed from: v */
    public Task<CreateRestoreCredentialResponse> mo25148v(@NonNull final CreateRestoreCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskM31151z = m31151z(AbstractC8078u.m33280c().m33288d(C0106c.f373j).m33286b(new InterfaceC8066q() { // from class: g9.d
            @Override // p268l9.InterfaceC8066q
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                C6056f.m26877R(request, (C6057g) obj, (C11264k) obj2);
            }
        }).m33289e(1693).m33285a());
        Intrinsics.checkNotNullExpressionValue(taskM31151z, "doRead(...)");
        return taskM31151z;
    }
}

package p446ta;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.tasks.Task;
import gb.C6084d;
import gb.C6087g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.C8081v;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p268l9.InterfaceC8066q;
import p305n9.C8926d;
import sa.InterfaceC11234o;
import sb.C11264k;

/* JADX INFO: renamed from: ta.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001d¨\u0006%"}, m31665d2 = {"Lta/e;", "Lk9/e;", "Lk9/a$d$c;", "Lsa/o;", "Landroid/content/Context;", "context", "Lk9/a$a;", "Lta/d;", "clientBuilder", "<init>", "(Landroid/content/Context;Lk9/a$a;)V", "(Landroid/content/Context;)V", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "k", "(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "l", "(Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "s", "(Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;)Lcom/google/android/gms/tasks/Task;", "", "Lcom/google/android/gms/identitycredentials/ClearExportResponse;", "clearExport", "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "exportCredentialsToDeviceSetup", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;", "importCredentialsForDeviceSetup", "Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "getCredentialTransferCapabilities", "b", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11560e extends AbstractC7495e<C7491a.d.c> implements InterfaceC11234o {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final C7491a.g<C11559d> f40921l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final a f40922m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final C7491a<C7491a.d.c> f40923n;

    /* JADX INFO: renamed from: ta.e$a */
    @Metadata(m31664d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"ta/e$a", "Lk9/a$a;", "Lta/d;", "Lk9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "commonSettings", "apiOptions", "Ll9/e;", "connectedListener", "Ll9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lk9/a$d$c;Ll9/e;Ll9/n;)Lta/d;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends C7491a.a<C11559d, C7491a.d.c> {
        /* JADX DEBUG: Method merged with bridge method: b(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Ll9/e;Ll9/n;)Lk9/a$f; */
        @Override // p242k9.C7491a.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C11559d mo299b(Context context, Looper looper, C8926d commonSettings, C7491a.d.c apiOptions, InterfaceC8030e connectedListener, InterfaceC8057n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new C11559d(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    /* JADX INFO: renamed from: ta.e$c */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ta/e$c", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "result", "", "S0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c extends AbstractBinderC11558c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11264k<CreateCredentialHandle> f40924a;

        public c(C11264k<CreateCredentialHandle> c11264k) {
            this.f40924a = c11264k;
        }

        @Override // p446ta.AbstractBinderC11558c, p446ta.InterfaceC11556a
        /* JADX INFO: renamed from: S0 */
        public void mo43213S0(Status status, CreateCredentialHandle result) {
            Intrinsics.checkNotNullParameter(status, "status");
            C8081v.m33290a(status, result, this.f40924a);
        }
    }

    /* JADX INFO: renamed from: ta.e$d */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ta/e$d", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "result", "", "G1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d extends AbstractBinderC11558c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11264k<PendingGetCredentialHandle> f40925a;

        public d(C11264k<PendingGetCredentialHandle> c11264k) {
            this.f40925a = c11264k;
        }

        @Override // p446ta.AbstractBinderC11558c, p446ta.InterfaceC11556a
        /* JADX INFO: renamed from: G1 */
        public void mo43211G1(Status status, PendingGetCredentialHandle result) {
            Intrinsics.checkNotNullParameter(status, "status");
            C8081v.m33290a(status, result, this.f40925a);
        }
    }

    /* JADX INFO: renamed from: ta.e$e */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ta/e$e", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "result", "", "b1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class e extends AbstractBinderC11558c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11264k<SignalCredentialStateResponse> f40926a;

        public e(C11264k<SignalCredentialStateResponse> c11264k) {
            this.f40926a = c11264k;
        }

        @Override // p446ta.AbstractBinderC11558c, p446ta.InterfaceC11556a
        /* JADX INFO: renamed from: b1 */
        public void mo43215b1(Status status, SignalCredentialStateResponse result) {
            Intrinsics.checkNotNullParameter(status, "status");
            C8081v.m33290a(status, result, this.f40926a);
        }
    }

    static {
        C7491a.g<C11559d> gVar = new C7491a.g<>();
        f40921l = gVar;
        a aVar = new a();
        f40922m = aVar;
        f40923n = new C7491a<>("IdentityCredentials.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11560e(@NonNull Context context) {
        super(context, f40923n, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: P */
    public static final void m43229P(CreateCredentialRequest createCredentialRequest, C11559d c11559d, C11264k c11264k) {
        ((InterfaceC11557b) c11559d.getService()).mo43226x(new c(c11264k), createCredentialRequest, C6087g.m26953a(c11559d.getContext()));
    }

    /* JADX INFO: renamed from: Q */
    public static final void m43230Q(GetCredentialRequest getCredentialRequest, C11559d c11559d, C11264k c11264k) {
        ((InterfaceC11557b) c11559d.getService()).mo43224Z1(new d(c11264k), getCredentialRequest, C6087g.m26953a(c11559d.getContext()));
    }

    /* JADX INFO: renamed from: R */
    public static final void m43231R(SignalCredentialStateRequest signalCredentialStateRequest, C11559d c11559d, C11264k c11264k) {
        ((InterfaceC11557b) c11559d.getService()).mo43225m2(new e(c11264k), signalCredentialStateRequest, C6087g.m26953a(c11559d.getContext()));
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, java.lang.Object, com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.PendingGetCredentialHandle> */
    @Override // sa.InterfaceC11234o
    @NotNull
    /* JADX INFO: renamed from: k */
    public Task<PendingGetCredentialHandle> mo42280k(@NonNull final GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskM31151z = m31151z(AbstractC8078u.m33280c().m33288d(C6084d.f23384a).m33286b(new InterfaceC8066q() { // from class: ta.h
            @Override // p268l9.InterfaceC8066q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C11560e.m43230Q(request, (C11559d) obj, (C11264k) obj2);
            }
        }).m33289e(32701).m33285a());
        Intrinsics.checkNotNullExpressionValue(taskM31151z, "doRead(...)");
        return taskM31151z;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, java.lang.Object, com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.CreateCredentialHandle> */
    @Override // sa.InterfaceC11234o
    @NotNull
    /* JADX INFO: renamed from: l */
    public Task<CreateCredentialHandle> mo42281l(@NonNull final CreateCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskM31136D = m31136D(AbstractC8078u.m33280c().m33288d(C6084d.f23389f).m33286b(new InterfaceC8066q() { // from class: ta.f
            @Override // p268l9.InterfaceC8066q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C11560e.m43229P(request, (C11559d) obj, (C11264k) obj2);
            }
        }).m33289e(32704).m33285a());
        Intrinsics.checkNotNullExpressionValue(taskM31136D, "doWrite(...)");
        return taskM31136D;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, java.lang.Object, com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.SignalCredentialStateResponse> */
    @Override // sa.InterfaceC11234o
    @NotNull
    /* JADX INFO: renamed from: s */
    public Task<SignalCredentialStateResponse> mo42282s(@NonNull final SignalCredentialStateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskM31136D = m31136D(AbstractC8078u.m33280c().m33288d(C6084d.f23393j).m33286b(new InterfaceC8066q() { // from class: ta.g
            @Override // p268l9.InterfaceC8066q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C11560e.m43231R(request, (C11559d) obj, (C11264k) obj2);
            }
        }).m33289e(32709).m33285a());
        Intrinsics.checkNotNullExpressionValue(taskM31136D, "doWrite(...)");
        return taskM31136D;
    }
}

package ua;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import m9.n;
import m9.q;
import m9.u;
import m9.v;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import ta.a0;
import ta.e0;
import ta.i;
import ta.o0;
import ta.q0;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001d¨\u0006%"}, d2 = {"Lua/e;", "Ll9/g;", "Ll9/a$d$c;", "Lta/a0;", "Landroid/content/Context;", "context", "Ll9/a$a;", "Lua/d;", "clientBuilder", "<init>", "(Landroid/content/Context;Ll9/a$a;)V", "(Landroid/content/Context;)V", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lta/e0;", "k", "(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lta/k;", "Lta/i;", "i", "(Lta/k;)Lcom/google/android/gms/tasks/Task;", "Lta/o0;", "Lta/q0;", "f", "(Lta/o0;)Lcom/google/android/gms/tasks/Task;", BuildConfig.FLAVOR, "Lta/e;", "clearExport", "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;", "Lta/u;", "exportCredentialsToDeviceSetup", "Lta/c0;", "importCredentialsForDeviceSetup", "Lta/s;", "getCredentialTransferCapabilities", "b", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends l9.g<l9.a.d.c> implements a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final l9.a.g<ua.d> f33264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f33265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final l9.a<l9.a.d.c> f33266n;

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ua/e$a", "Ll9/a$a;", "Lua/d;", "Ll9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Lo9/f;", "commonSettings", "apiOptions", "Lm9/e;", "connectedListener", "Lm9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ll9/a$d$c;Lm9/e;Lm9/n;)Lua/d;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l9.a.AbstractC0421a<ua.d, l9.a.d.c> {
        @Override // l9.a.AbstractC0421a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ua.d b(Context context, Looper looper, o9.f commonSettings, l9.a.d.c apiOptions, m9.e connectedListener, n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new ua.d(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ua/e$c", "Lua/c;", "Lcom/google/android/gms/common/api/Status;", "status", "Lta/i;", "result", BuildConfig.FLAVOR, "I1", "(Lcom/google/android/gms/common/api/Status;Lta/i;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends ua.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<i> f33267a;

        public c(k<i> kVar) {
            this.f33267a = kVar;
        }

        @Override // ua.c, ua.a
        public void I1(Status status, i result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f33267a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ua/e$d", "Lua/c;", "Lcom/google/android/gms/common/api/Status;", "status", "Lta/e0;", "result", BuildConfig.FLAVOR, "K0", "(Lcom/google/android/gms/common/api/Status;Lta/e0;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends ua.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<e0> f33268a;

        public d(k<e0> kVar) {
            this.f33268a = kVar;
        }

        @Override // ua.c, ua.a
        public void K0(Status status, e0 result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f33268a);
        }
    }

    /* JADX INFO: renamed from: ua.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ua/e$e", "Lua/c;", "Lcom/google/android/gms/common/api/Status;", "status", "Lta/q0;", "result", BuildConfig.FLAVOR, "e0", "(Lcom/google/android/gms/common/api/Status;Lta/q0;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BinderC0673e extends ua.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<q0> f33269a;

        public BinderC0673e(k<q0> kVar) {
            this.f33269a = kVar;
        }

        @Override // ua.c, ua.a
        public void e0(Status status, q0 result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f33269a);
        }
    }

    static {
        l9.a.g<ua.d> gVar = new l9.a.g<>();
        f33264l = gVar;
        a aVar = new a();
        f33265m = aVar;
        f33266n = new l9.a<>("IdentityCredentials.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NonNull Context context) {
        super(context, f33266n, l9.a.d.Oo, l9.g.a.f22012c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void P(ta.k kVar, ua.d dVar, k kVar2) {
        ((b) dVar.getService()).q1(new c(kVar2), kVar, hb.g.a(dVar.getContext()));
    }

    public static final void Q(GetCredentialRequest getCredentialRequest, ua.d dVar, k kVar) {
        ((b) dVar.getService()).v0(new d(kVar), getCredentialRequest, hb.g.a(dVar.getContext()));
    }

    public static final void R(o0 o0Var, ua.d dVar, k kVar) {
        ((b) dVar.getService()).I(new BinderC0673e(kVar), o0Var, hb.g.a(dVar.getContext()));
    }

    @Override // ta.a0
    @NotNull
    public Task<q0> f(@NonNull final o0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskD = D(u.c().d(hb.d.f18167j).b(new q() { // from class: ua.g
            @Override // m9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.R(request, (d) obj, (k) obj2);
            }
        }).e(32709).a());
        Intrinsics.checkNotNullExpressionValue(taskD, "doWrite(...)");
        return taskD;
    }

    @Override // ta.a0
    @NotNull
    public Task<i> i(@NonNull final ta.k request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskD = D(u.c().d(hb.d.f18163f).b(new q() { // from class: ua.f
            @Override // m9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.P(request, (d) obj, (k) obj2);
            }
        }).e(32704).a());
        Intrinsics.checkNotNullExpressionValue(taskD, "doWrite(...)");
        return taskD;
    }

    @Override // ta.a0
    @NotNull
    public Task<e0> k(@NonNull final GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task taskZ = z(u.c().d(hb.d.f18159a).b(new q() { // from class: ua.h
            @Override // m9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.Q(request, (d) obj, (k) obj2);
            }
        }).e(32701).a());
        Intrinsics.checkNotNullExpressionValue(taskZ, "doRead(...)");
        return taskZ;
    }
}

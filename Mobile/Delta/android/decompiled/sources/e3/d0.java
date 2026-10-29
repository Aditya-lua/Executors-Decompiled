package e3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u000204H\u0003¢\u0006\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Le3/d0;", "Le3/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le3/k0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Le3/l0;", "Lf3/n;", "callback", "", "onGetCredential", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "onCreateCredential", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Landroid/credentials/GetCredentialException;", "error", "g", "(Landroid/credentials/GetCredentialException;)Lf3/n;", "Landroid/credentials/CreateCredentialException;", "f", "(Landroid/credentials/CreateCredentialException;)Lf3/f;", "Landroid/credentials/GetCredentialResponse;", Payload.RESPONSE, "e", "(Landroid/credentials/GetCredentialResponse;)Le3/l0;", "", "isAvailableOnDevice", "()Z", "Lkotlin/Function0;", "handleNullCredMan", "h", "(Lkotlin/jvm/functions/Function0;)Z", "Landroid/credentials/CreateCredentialRequest;", "c", "(Le3/b;Landroid/content/Context;)Landroid/credentials/CreateCredentialRequest;", "Landroid/credentials/CreateCredentialRequest$Builder;", "builder", "k", "(Le3/b;Landroid/credentials/CreateCredentialRequest$Builder;)V", "Landroid/credentials/GetCredentialRequest;", "d", "(Le3/k0;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "l", "(Le3/k0;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/credentials/CredentialManager;", "a", "Landroid/credentials/CredentialManager;", "credentialManager", "b", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CredentialManager credentialManager;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e3/d0$b", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", Payload.RESPONSE, "", "b", "(Landroid/credentials/CreateCredentialResponse;)V", "error", "a", "(Landroid/credentials/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<e3.c, f3.f> f15006a;
        public final /* synthetic */ e3.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f15007c;

        public b(p<e3.c, f3.f> pVar, e3.b bVar, d0 d0Var) {
            this.f15006a = pVar;
            this.b = bVar;
            this.f15007c = d0Var;
        }

        public void a(CreateCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
            this.f15006a.a(this.f15007c.f(error));
        }

        public void b(CreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "Create Result returned from framework: ");
            p<e3.c, f3.f> pVar = this.f15006a;
            e3.c.Companion companion = e3.c.INSTANCE;
            String str = this.b.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String();
            Bundle data = response.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            pVar.onResult(companion.a(str, data));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th2) {
            a(e0.a(th2));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(f0.a(obj));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e3/d0$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", Payload.RESPONSE, "", "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<l0, f3.n> f15008a;
        public final /* synthetic */ d0 b;

        public c(p<l0, f3.n> pVar, d0 d0Var) {
            this.f15008a = pVar;
            this.b = d0Var;
        }

        public void a(GetCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            this.f15008a.a(this.b.g(error));
        }

        public void b(GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            this.f15008a.onResult(this.b.e(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th2) {
            a(g0.a(th2));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(h0.a(obj));
        }
    }

    public d0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = a0.a(context.getSystemService("credential"));
    }

    public static final Unit i(p pVar) {
        pVar.a(new f3.k("Your device doesn't support credential manager"));
        return Unit.f22483a;
    }

    public static final Unit j(p pVar) {
        pVar.a(new f3.r("Your device doesn't support credential manager"));
        return Unit.f22483a;
    }

    public final CreateCredentialRequest c(e3.b request, Context context) {
        z.a();
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = y.a(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), j3.a.a(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        k(request, alwaysSendAppInfoToProvider);
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(createCredentialRequestBuild, "build(...)");
        return createCredentialRequestBuild;
    }

    public final GetCredentialRequest d(k0 request) {
        w.a();
        GetCredentialRequest.Builder builderA = u.a(k0.INSTANCE.a(request));
        for (r rVar : request.a()) {
            x.a();
            builderA.addCredentialOption(v.a(rVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), rVar.getRequestData(), rVar.getCandidateQueryData()).setIsSystemProviderRequired(rVar.getIsSystemProviderRequired()).setAllowedProviders(rVar.a()).build());
        }
        l(request, builderA);
        GetCredentialRequest getCredentialRequestBuild = builderA.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "build(...)");
        return getCredentialRequestBuild;
    }

    @NotNull
    public final l0 e(@NotNull GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Credential credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        m.Companion companion = m.INSTANCE;
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return new l0(companion.b(type, data));
    }

    @NotNull
    public final f3.f f(@NotNull CreateCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return j3.a.b(type, error.getMessage());
    }

    @NotNull
    public final f3.n g(@NotNull GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return j3.a.c(type, error.getMessage());
    }

    public final boolean h(Function0<Unit> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    @Override // e3.s
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @SuppressLint({"MissingPermission"})
    public final void k(e3.b request, CreateCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void l(k0 request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @Override // e3.s
    public void onCreateCredential(@NotNull Context context, @NotNull e3.b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final p<e3.c, f3.f> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (h(new Function0() { // from class: e3.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.i(callback);
            }
        })) {
            return;
        }
        b bVar = new b(callback, request, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.createCredential(context, c(request, context), cancellationSignal, executor, bVar);
    }

    @Override // e3.s
    public void onGetCredential(@NotNull Context context, @NotNull k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final p<l0, f3.n> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (h(new Function0() { // from class: e3.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.j(callback);
            }
        })) {
            return;
        }
        c cVar = new c(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.getCredential(context, d(request), cancellationSignal, executor, cVar);
    }
}

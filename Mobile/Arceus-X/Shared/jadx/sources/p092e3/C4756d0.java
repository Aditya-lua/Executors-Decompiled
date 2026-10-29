package p092e3;

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
import android.p017os.OutcomeReceiver;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p117f3.C5337k;
import p117f3.C5344r;
import p207j3.C7026a;

/* JADX INFO: renamed from: e3.d0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u000204H\u0003¢\u0006\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, m31665d2 = {"Le3/d0;", "Le3/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le3/k0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Le3/l0;", "Lf3/n;", "callback", "", "onGetCredential", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "onCreateCredential", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Landroid/credentials/GetCredentialException;", "error", "g", "(Landroid/credentials/GetCredentialException;)Lf3/n;", "Landroid/credentials/CreateCredentialException;", "f", "(Landroid/credentials/CreateCredentialException;)Lf3/f;", "Landroid/credentials/GetCredentialResponse;", Payload.RESPONSE, "e", "(Landroid/credentials/GetCredentialResponse;)Le3/l0;", "", "isAvailableOnDevice", "()Z", "Lkotlin/Function0;", "handleNullCredMan", "h", "(Lkotlin/jvm/functions/Function0;)Z", "Landroid/credentials/CreateCredentialRequest;", "c", "(Le3/b;Landroid/content/Context;)Landroid/credentials/CreateCredentialRequest;", "Landroid/credentials/CreateCredentialRequest$Builder;", "builder", "k", "(Le3/b;Landroid/credentials/CreateCredentialRequest$Builder;)V", "Landroid/credentials/GetCredentialRequest;", "d", "(Le3/k0;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "l", "(Le3/k0;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/credentials/CredentialManager;", "a", "Landroid/credentials/CredentialManager;", "credentialManager", "b", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4756d0 implements InterfaceC4785s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final CredentialManager credentialManager;

    /* JADX INFO: renamed from: e3.d0$b */
    @Metadata(m31664d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"e3/d0$b", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", Payload.RESPONSE, "", "b", "(Landroid/credentials/CreateCredentialResponse;)V", "error", "a", "(Landroid/credentials/CreateCredentialException;)V", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4779p<AbstractC4753c, AbstractC5332f> f19323a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC4751b f19324b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4756d0 f19325c;

        public b(InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p, AbstractC4751b abstractC4751b, C4756d0 c4756d0) {
            this.f19323a = interfaceC4779p;
            this.f19324b = abstractC4751b;
            this.f19325c = c4756d0;
        }

        /* JADX INFO: renamed from: a */
        public void m23161a(CreateCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
            this.f19323a.mo7535a(this.f19325c.m23156f(error));
        }

        /* JADX INFO: renamed from: b */
        public void m23162b(CreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "Create Result returned from framework: ");
            InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = this.f19323a;
            AbstractC4753c.Companion companion = AbstractC4753c.INSTANCE;
            String str = this.f19324b.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String();
            Bundle data = response.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            interfaceC4779p.onResult(companion.m23147a(str, data));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th2) {
            m23161a(C4758e0.m23166a(th2));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            m23162b(C4760f0.m23169a(obj));
        }
    }

    /* JADX INFO: renamed from: e3.d0$c */
    @Metadata(m31664d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"e3/d0$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", Payload.RESPONSE, "", "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4779p<C4772l0, AbstractC5340n> f19326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4756d0 f19327b;

        public c(InterfaceC4779p<C4772l0, AbstractC5340n> interfaceC4779p, C4756d0 c4756d0) {
            this.f19326a = interfaceC4779p;
            this.f19327b = c4756d0;
        }

        /* JADX INFO: renamed from: a */
        public void m23163a(GetCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            this.f19326a.mo7535a(this.f19327b.m23157g(error));
        }

        /* JADX INFO: renamed from: b */
        public void m23164b(GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            this.f19326a.onResult(this.f19327b.m23155e(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th2) {
            m23163a(C4762g0.m23174a(th2));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            m23164b(C4764h0.m23176a(obj));
        }
    }

    public C4756d0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = C4750a0.m23139a(context.getSystemService("credential"));
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m23151i(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5337k("Your device doesn't support credential manager"));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m23152j(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5344r("Your device doesn't support credential manager"));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public final CreateCredentialRequest m23153c(AbstractC4751b request, Context context) {
        C4798z.m23246a();
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = C4797y.m23245a(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), C7026a.m29704a(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        m23159k(request, alwaysSendAppInfoToProvider);
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(createCredentialRequestBuild, "build(...)");
        return createCredentialRequestBuild;
    }

    /* JADX INFO: renamed from: d */
    public final GetCredentialRequest m23154d(C4770k0 request) {
        C4793w.m23240a();
        GetCredentialRequest.Builder builderM23237a = C4789u.m23237a(C4770k0.INSTANCE.m23196a(request));
        for (AbstractC4783r abstractC4783r : request.m23188a()) {
            C4795x.m23244a();
            builderM23237a.addCredentialOption(C4791v.m23238a(abstractC4783r.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), abstractC4783r.getRequestData(), abstractC4783r.getCandidateQueryData()).setIsSystemProviderRequired(abstractC4783r.getIsSystemProviderRequired()).setAllowedProviders(abstractC4783r.m23217a()).build());
        }
        m23160l(request, builderM23237a);
        GetCredentialRequest getCredentialRequestBuild = builderM23237a.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "build(...)");
        return getCredentialRequestBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C4772l0 m23155e(@NotNull GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Credential credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        AbstractC4773m.Companion companion = AbstractC4773m.INSTANCE;
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return new C4772l0(companion.m23203b(type, data));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final AbstractC5332f m23156f(@NotNull CreateCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return C7026a.m29705b(type, error.getMessage());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final AbstractC5340n m23157g(@NotNull GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return C7026a.m29706c(type, error.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public final boolean m23158h(Function0<Unit> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    @Override // p092e3.InterfaceC4785s
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public final void m23159k(AbstractC4751b request, CreateCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public final void m23160l(C4770k0 request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @Override // p092e3.InterfaceC4785s
    public void onCreateCredential(@NotNull Context context, @NotNull AbstractC4751b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m23158h(new Function0() { // from class: e3.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4756d0.m23151i(callback);
            }
        })) {
            return;
        }
        b bVar = new b(callback, request, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.createCredential(context, m23153c(request, context), cancellationSignal, executor, bVar);
    }

    @Override // p092e3.InterfaceC4785s
    public void onGetCredential(@NotNull Context context, @NotNull C4770k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final InterfaceC4779p<C4772l0, AbstractC5340n> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m23158h(new Function0() { // from class: e3.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4756d0.m23152j(callback);
            }
        })) {
            return;
        }
        c cVar = new c(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.getCredential(context, m23154d(request), cancellationSignal, executor, cVar);
    }
}

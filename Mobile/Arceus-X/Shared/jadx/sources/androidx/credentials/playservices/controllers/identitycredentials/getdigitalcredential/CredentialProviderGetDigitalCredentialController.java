package androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4773m;
import p092e3.AbstractC4783r;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4776n0;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5340n;
import p117f3.C5338l;
import p117f3.C5341o;
import p117f3.C5343q;
import p207j3.C7026a;
import p242k9.C7492b;
import p456u2.C11774c;
import sa.C11231l;
import sa.C11235p;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\b\u0006*\u0001.\b\u0001\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0013\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010,\u0012\u0004\b-\u0010%R\u001a\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010%¨\u00063"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/k0;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Le3/l0;", "Lf3/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Lf3/n;", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/k0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/k0;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/GetCredentialResponse;)Le3/l0;", "Landroid/content/Context;", "Le3/p;", "getCallback", "()Le3/p;", "setCallback", "(Le3/p;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;", "getResultReceiver$annotations", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<C4770k0, GetCredentialRequest, GetCredentialResponse, C4772l0, AbstractC5340n> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "DigitalCredentialClient";
    public InterfaceC4779p<C4772l0, AbstractC5340n> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final ResultReceiverC0796xc7d06e80 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$Companion;", "", "<init>", "()V", "TAG", "", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0797x4ee2686a(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                ResponseUtils.INSTANCE.handleGetCredentialResponse(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) C11774c.m44055a(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal);
            }
        };
    }

    private final AbstractC5340n fromGmsException(Throwable e10) {
        if (e10 instanceof C11231l) {
            return C7026a.m29706c(((C11231l) e10).m42273a(), e10.getMessage());
        }
        if (!(e10 instanceof C7492b)) {
            return new C5343q("Get digital credential failed, failure: " + e10);
        }
        int iM31131b = ((C7492b) e10).m31131b();
        if (iM31131b == 16) {
            return new C5338l(e10.getMessage());
        }
        if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(iM31131b))) {
            return new C5341o(e10.getMessage());
        }
        return new C5343q("Get digital credential failed, failure: " + e10);
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, PendingGetCredentialHandle pendingGetCredentialHandle) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(credentialProviderGetDigitalCredentialController.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingGetCredentialHandle.getPendingIntent());
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.GET_UNKNOWN);
        credentialProviderGetDigitalCredentialController.context.startActivity(intent);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final AbstractC5340n abstractC5340nFromGmsException = credentialProviderGetDigitalCredentialController.fromGmsException(e10);
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$4$lambda$3(executor, interfaceC4779p, abstractC5340nFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, final InterfaceC4779p interfaceC4779p, final AbstractC5340n abstractC5340n) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.e
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.mo7535a(abstractC5340n);
            }
        });
        return Unit.f29331a;
    }

    @NotNull
    public final InterfaceC4779p<C4772l0, AbstractC5340n> getCallback() {
        InterfaceC4779p<C4772l0, AbstractC5340n> interfaceC4779p = this.callback;
        if (interfaceC4779p != null) {
            return interfaceC4779p;
        }
        Intrinsics.m31998u("callback");
        return null;
    }

    @NotNull
    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.m31998u("executor");
        return null;
    }

    public final void setCallback(@NotNull InterfaceC4779p<C4772l0, AbstractC5340n> interfaceC4779p) {
        Intrinsics.checkNotNullParameter(interfaceC4779p, "<set-?>");
        this.callback = interfaceC4779p;
    }

    public final void setExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.executor = executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetCredentialRequest convertRequestToPlayServices(@NotNull C4770k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        for (AbstractC4783r abstractC4783r : request.m23188a()) {
            if (abstractC4783r instanceof C4776n0) {
                arrayList.add(new CredentialOption(abstractC4783r.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), abstractC4783r.getRequestData(), abstractC4783r.getCandidateQueryData(), ((C4776n0) abstractC4783r).getRequestJson(), "", ""));
            }
        }
        return new GetCredentialRequest(arrayList, C4770k0.INSTANCE.m23196a(request), request.getOrigin(), new ResultReceiver(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public C4772l0 convertResponseToCredentialManager(@NotNull GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new C4772l0(AbstractC4773m.INSTANCE.m23203b("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", response.getCredential().getData()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4770k0 request, @NotNull final InterfaceC4779p<C4772l0, AbstractC5340n> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<PendingGetCredentialHandle> taskMo42280k = C11235p.INSTANCE.m42283a(this.context).mo42280k(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, (PendingGetCredentialHandle) obj);
            }
        };
        taskMo42280k.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.b
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.c
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$4(this.f2768a, cancellationSignal, executor, callback, exc);
            }
        });
    }
}

package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p011aa.C0102a;
import p092e3.AbstractC4753c;
import p092e3.C4765i;
import p092e3.C4767j;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.C5336j;
import p143g3.C5975b0;
import p143g3.C5981f;
import p158h3.C6272a;
import p242k9.C7492b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0005*\u00013\b\u0000\u0018\u0000 62 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0004H\u0017¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R(\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00158\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0016\u0010,\u0012\u0004\b-\u0010.R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0018\u0010/\u0012\u0004\b0\u0010.R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001a\u00101\u0012\u0004\b2\u0010.R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/i;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromIntentRequestException", "(Ljava/lang/Throwable;)Lf3/f;", "Lorg/json/JSONException;", "exception", "Lh3/a;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)Lh3/a;", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/i;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Le3/i;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Le3/c;", "Landroid/content/Context;", "Le3/p;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C4765i, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC4753c, AbstractC5332f> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CreatePublicKey";
    private InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    private Executor executor;

    @NotNull
    private final ResultReceiverC0692x1c337a18 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                InterfaceC4779p interfaceC4779p;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                C0693xdfe2be02 c0693xdfe2be02 = new C0693xdfe2be02(CredentialProviderBaseController.INSTANCE);
                Executor executor2 = this.this$0.executor;
                if (executor2 == null) {
                    Intrinsics.m31998u("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                InterfaceC4779p interfaceC4779p2 = this.this$0.callback;
                if (interfaceC4779p2 == null) {
                    Intrinsics.m31998u("callback");
                    interfaceC4779p = null;
                } else {
                    interfaceC4779p = interfaceC4779p2;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c0693xdfe2be02, executor, interfaceC4779p, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final C6272a JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new C6272a(new C5981f(), "Unknown error") : new C6272a(new C5981f(), message);
    }

    private final AbstractC5332f fromIntentRequestException(Throwable e10) {
        String str = ((e10 instanceof C7492b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C7492b) e10).m31131b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.INSTANCE.m3294x5e74af(str, "During create public key credential, fido registration failure: " + e10.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    @NotNull
    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final AbstractC5332f e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13$lambda$12(this.f2608a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$13$lambda$12(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$14(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C6272a(new C5975b0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$16(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final AbstractC5332f abstractC5332f) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.i
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$16$lambda$15(this.f2606a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$16$lambda$15(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$18(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final AbstractC4753c abstractC4753c) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$18$lambda$17(this.f2591a, abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$18$lambda$17(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC4753c abstractC4753c) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.onResult(abstractC4753c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$20(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$20$lambda$19(this.f2610a, jSONException);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$20$lambda$19(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C6272a(new C5981f(), jSONException.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$22(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final Throwable th2) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$22$lambda$21(this.f2615a, th2);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$22$lambda$21(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C6272a(new C5975b0(), th2.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$1(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1$lambda$0(this.f2604a, jSONException);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$10(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CancellationSignal cancellationSignal, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final AbstractC5332f abstractC5332fFromIntentRequestException = credentialProviderCreatePublicKeyCredentialController.fromIntentRequestException(e10);
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10$lambda$9(this.f2613a, abstractC5332fFromIntentRequestException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$10$lambda$9(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final AbstractC5332f abstractC5332f) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.g
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10$lambda$9$lambda$8(this.f2602a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$10$lambda$9$lambda$8(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$3(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final Throwable th2) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.f
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$3$lambda$2(this.f2600a, th2);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3$lambda$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j(th2.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6(CancellationSignal cancellationSignal, final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, PendingIntent result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(credentialProviderCreatePublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePublicKeyCredentialController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, result);
        try {
            credentialProviderCreatePublicKeyCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5(this.f2617a);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6$lambda$5(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2612a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.m3295xa2b31783()) {
            Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$11((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13(this.f2618a, (AbstractC5332f) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                Intrinsics.m31998u("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.r
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$14(this.f2619a);
                }
            });
            return;
        }
        PublicKeyCredential publicKeyCredentialM9301a = PublicKeyCredential.m9301a(byteArrayExtra);
        Intrinsics.checkNotNullExpressionValue(publicKeyCredentialM9301a, "deserializeFromBytes(...)");
        final AbstractC5332f abstractC5332fPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(publicKeyCredentialM9301a);
        if (abstractC5332fPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$16(this.f2620a, abstractC5332fPublicKeyCredentialResponseContainsError);
                }
            });
            return;
        }
        try {
            final AbstractC4753c abstractC4753cConvertResponseToCredentialManager = convertResponseToCredentialManager(publicKeyCredentialM9301a);
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$18(this.f2622a, abstractC4753cConvertResponseToCredentialManager);
                }
            });
        } catch (JSONException e10) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$20(this.f2624a, e10);
                }
            });
        } catch (Throwable th2) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$22(this.f2626a, th2);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(@NotNull C4765i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return PublicKeyCredentialControllerUtility.INSTANCE.convert(request, this.context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public AbstractC4753c convertResponseToCredentialManager(@NotNull PublicKeyCredential response) throws C5336j {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM9303B3 = response.m9303B3();
            Intrinsics.checkNotNullExpressionValue(strM9303B3, "toJson(...)");
            return new C4767j(strM9303B3);
        } catch (Throwable th2) {
            throw new C5336j("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4765i request, @NotNull InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Task<PendingIntent> taskM7058P = C0102a.m300a(this.context).m7058P(publicKeyCredentialCreationOptionsConvertRequestToPlayServices);
            final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6(cancellationSignal, this, (PendingIntent) obj);
                }
            };
            taskM7058P.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.d
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.e
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10(this.f2598a, cancellationSignal, exc);
                }
            });
        } catch (JSONException e10) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1(this.f2628a, e10);
                }
            });
        } catch (Throwable th2) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$3(this.f2593a, th2);
                }
            });
        }
    }
}

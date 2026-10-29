package androidx.credentials.playservices.controllers.identityauth.createpassword;

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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInPassword;
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
import p092e3.AbstractC4753c;
import p092e3.C4761g;
import p092e3.C4763h;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.C5336j;
import p242k9.C7492b;
import p598z8.C13738b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\b\u0005*\u0001*\b\u0000\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001-B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0011\u0010$\u0012\u0004\b%\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010(\u0012\u0004\b)\u0010&R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/g;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Lf3/f;", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Le3/g;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "handleResponse$credentials_play_services_auth_release", "(II)V", "handleResponse", "convertRequestToPlayServices", "(Le3/g;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lkotlin/Unit;)Le3/c;", "Landroid/content/Context;", "Le3/p;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<C4761g, SavePasswordRequest, Unit, AbstractC4753c, AbstractC5332f> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CreatePassword";
    private InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    private Executor executor;

    @NotNull
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CredentialProviderCreatePasswordController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                InterfaceC4779p interfaceC4779p;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                C0679x4c19f34c c0679x4c19f34c = new C0679x4c19f34c(CredentialProviderBaseController.INSTANCE);
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
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, c0679x4c19f34c, executor, interfaceC4779p, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode);
            }
        };
    }

    private final AbstractC5332f fromGmsException(Throwable e10) {
        String str = ((e10 instanceof C7492b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C7492b) e10).m31131b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.INSTANCE.m3294x5e74af(str, "During save password, found password failure response from one tap " + e10.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    @NotNull
    public static final CredentialProviderCreatePasswordController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final AbstractC4753c abstractC4753c) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.f
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.handleResponse$lambda$11$lambda$10(this.f2581a, abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$11$lambda$10(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC4753c abstractC4753c) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePasswordController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.onResult(abstractC4753c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$7(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$9(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final AbstractC5332f e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.e
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.handleResponse$lambda$9$lambda$8(this.f2579a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$9$lambda$8(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePasswordController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, SavePasswordResult savePasswordResult) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(credentialProviderCreatePasswordController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, savePasswordResult.m9051v3());
        try {
            credentialProviderCreatePasswordController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$lambda$1(this.f2578a);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2$lambda$1(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.c
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$lambda$1$lambda$0(this.f2577a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$1$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePasswordController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CancellationSignal cancellationSignal, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final AbstractC5332f abstractC5332fFromGmsException = credentialProviderCreatePasswordController.fromGmsException(e10);
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$6$lambda$5(this.f2583a, abstractC5332fFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6$lambda$5(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final AbstractC5332f abstractC5332f) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2573a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = credentialProviderCreatePasswordController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode == companion.m3295xa2b31783()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$7((CancellationSignal) obj, (Function0) obj2);
                }
            }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$9(this.f2590a, (AbstractC5332f) obj);
                }
            }, this.cancellationSignal)) {
                return;
            }
            final AbstractC4753c abstractC4753cConvertResponseToCredentialManager = convertResponseToCredentialManager(Unit.f29331a);
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$11(this.f2575a, abstractC4753cConvertResponseToCredentialManager);
                }
            });
            return;
        }
        Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " which does not match what was given " + uniqueRequestCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public SavePasswordRequest convertRequestToPlayServices(@NotNull C4761g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        SavePasswordRequest savePasswordRequestM9047a = SavePasswordRequest.m9044v3().m9048b(new SignInPassword(request.getId(), request.getPassword())).m9047a();
        Intrinsics.checkNotNullExpressionValue(savePasswordRequestM9047a, "build(...)");
        return savePasswordRequestM9047a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public AbstractC4753c convertResponseToCredentialManager(@NotNull Unit response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new C4763h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4761g request, @NotNull InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<SavePasswordResult> taskMo48749m = C13738b.m50156a(this.context).mo48749m(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2(cancellationSignal, this, (SavePasswordResult) obj);
            }
        };
        taskMo48749m.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.i
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.j
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$6(this.f2588a, cancellationSignal, exc);
            }
        });
    }
}

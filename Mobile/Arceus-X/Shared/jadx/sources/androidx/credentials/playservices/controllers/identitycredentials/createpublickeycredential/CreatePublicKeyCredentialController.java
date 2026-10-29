package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

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
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
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
import p092e3.C4765i;
import p092e3.C4767j;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.C5330d;
import p117f3.C5333g;
import p117f3.C5334h;
import p117f3.C5336j;
import p117f3.C5337k;
import p242k9.C7492b;
import p242k9.C7506p;
import p320o3.C9632a;
import p456u2.C11774c;
import sa.C11235p;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\b\u0005*\u0001.\b\u0001\u0018\u0000 12 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00011B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010'\u0012\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u000f\u0010*\u0012\u0004\b+\u0010)R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010,\u0012\u0004\b-\u0010)R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/i;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/i;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Lf3/f;", "convertRequestToPlayServices", "(Le3/i;)Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)Le3/c;", "Landroid/content/Context;", "Le3/p;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CreatePublicKeyCredentialController extends CredentialProviderController<C4765i, CreateCredentialRequest, CreateCredentialResponse, AbstractC4753c, AbstractC5332f> {

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
    private final CreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "TAG", "", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreatePublicKeyCredentialController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CreatePublicKeyCredentialController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                InterfaceC4779p interfaceC4779p;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CreatePublicKeyCredentialController createPublicKeyCredentialController = this.this$0;
                C0768x10b4fc7a c0768x10b4fc7a = new C0768x10b4fc7a(CredentialProviderBaseController.INSTANCE);
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
                if (createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c0768x10b4fc7a, executor, interfaceC4779p, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) C11774c.m44055a(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class));
            }
        };
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    @NotNull
    public static final CreatePublicKeyCredentialController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$15(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final AbstractC5332f e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.d
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$15$lambda$14(this.f2718a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$15$lambda$14(CreatePublicKeyCredentialController createPublicKeyCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$17(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.f
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$17$lambda$16(this.f2722a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$17$lambda$16(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$19(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final AbstractC4753c abstractC4753c) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.e
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$19$lambda$18(this.f2720a, abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$19$lambda$18(CreatePublicKeyCredentialController createPublicKeyCredentialController, AbstractC4753c abstractC4753c) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.onResult(abstractC4753c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$21(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final AbstractC5332f abstractC5332f) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$21$lambda$20(this.f2736a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$21$lambda$20(CreatePublicKeyCredentialController createPublicKeyCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        if (abstractC5332f == null) {
            abstractC5332f = new C5336j("No provider data returned");
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$12(CancellationSignal cancellationSignal, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Executor executor, final InterfaceC4779p interfaceC4779p, final Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$12$lambda$11(this.f2723a, e10, executor, interfaceC4779p);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$12$lambda$11(CreatePublicKeyCredentialController createPublicKeyCredentialController, Exception exc, Executor executor, final InterfaceC4779p interfaceC4779p) {
        Intrinsics.checkNotNull(exc);
        final AbstractC5332f abstractC5332fFromGmsException = createPublicKeyCredentialController.fromGmsException(exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.a
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.mo7535a(abstractC5332fFromGmsException);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8(CancellationSignal cancellationSignal, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Executor executor, final InterfaceC4779p interfaceC4779p, CreateCredentialHandle createCredentialHandle) {
        PendingIntent pendingIntent = createCredentialHandle.getPendingIntent();
        CreateCredentialResponse createCredentialResponse = createCredentialHandle.getCreateCredentialResponse();
        if (pendingIntent == null && createCredentialResponse == null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1(executor, interfaceC4779p);
                }
            });
            return Unit.f29331a;
        }
        if (pendingIntent != null) {
            Intent intent = new Intent(createPublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
            try {
                createPublicKeyCredentialController.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3(this.f2751a);
                    }
                });
            }
        }
        if (createCredentialResponse != null) {
            final AbstractC4753c abstractC4753cConvertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(createCredentialResponse);
            if (abstractC4753cConvertResponseToCredentialManager instanceof C4767j) {
                CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$5(executor, interfaceC4779p, abstractC4753cConvertResponseToCredentialManager);
                    }
                });
                return Unit.f29331a;
            }
        }
        if (pendingIntent == null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7(executor, interfaceC4779p);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$1(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.t
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1$lambda$0(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$1$lambda$0(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5336j(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$3(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.m
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3$lambda$2(this.f2738a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$3$lambda$2(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPublicKeyCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$5(Executor executor, final InterfaceC4779p interfaceC4779p, final AbstractC4753c abstractC4753c) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.n
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.s
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5336j(null, 1, null));
    }

    @NotNull
    public final AbstractC5332f fromGmsException(@NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!(e10 instanceof C7492b)) {
            if (e10 instanceof C7506p) {
                return new C5337k("API is unsupported");
            }
            return new C5336j("Conditional create failed, failure: " + e10);
        }
        int iM31131b = ((C7492b) e10).m31131b();
        if (iM31131b == 16) {
            return new C5330d(e10.getMessage());
        }
        if (iM31131b == 17) {
            return new C5337k("API is not supported: " + e10.getMessage());
        }
        if (iM31131b == 8) {
            return new C5334h(e10.getMessage());
        }
        if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(iM31131b))) {
            return new C5333g(e10.getMessage());
        }
        return new C5336j("Conditional create failed, failure: " + e10.getMessage());
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.m3295xa2b31783()) {
            Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreatePublicKeyCredentialController.handleResponse$lambda$13((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreatePublicKeyCredentialController.handleResponse$lambda$15(this.f2741a, (AbstractC5332f) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$17(this.f2742a);
                }
            });
            return;
        }
        C9632a.Companion companion2 = C9632a.INSTANCE;
        final AbstractC4753c abstractC4753cM38012b = companion2.m38012b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data);
        if (abstractC4753cM38012b != null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$19(this.f2743a, abstractC4753cM38012b);
                }
            });
        } else {
            final AbstractC5332f abstractC5332fM38011a = companion2.m38011a(data);
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$21(this.f2745a, abstractC5332fM38011a);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public CreateCredentialRequest convertRequestToPlayServices(@NotNull C4765i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateCredentialRequest(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), request.getRequestJson(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public AbstractC4753c convertResponseToCredentialManager(@NotNull CreateCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return AbstractC4753c.INSTANCE.m23147a(response.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), response.getData());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4765i request, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<CreateCredentialHandle> taskMo42281l = C11235p.INSTANCE.m42283a(this.context).mo42281l(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$8(cancellationSignal, this, executor, callback, (CreateCredentialHandle) obj);
            }
        };
        taskMo42281l.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.i
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.j
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$12(cancellationSignal, this, executor, callback, exc);
            }
        });
    }
}

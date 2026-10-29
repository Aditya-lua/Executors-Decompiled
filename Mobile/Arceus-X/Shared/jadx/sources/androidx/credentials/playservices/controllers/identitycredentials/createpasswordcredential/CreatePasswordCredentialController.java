package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

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
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
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
import p320o3.C9632a;
import p456u2.C11774c;
import sa.C11235p;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0005*\u0001*\b\u0001\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001-B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010$\u0012\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010(\u0012\u0004\b)\u0010&R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/g;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Le3/g;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/g;)Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lkotlin/Unit;)Le3/c;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Le3/p;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CreatePasswordCredentialController extends CredentialProviderController<C4761g, CreateCredentialRequest, Unit, AbstractC4753c, AbstractC5332f> {

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
    private final CreatePasswordCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$Companion;", "", "<init>", "()V", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "context", "Landroid/content/Context;", "TAG", "", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreatePasswordCredentialController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CreatePasswordCredentialController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1] */
    public CreatePasswordCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                InterfaceC4779p interfaceC4779p;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CreatePasswordCredentialController createPasswordCredentialController = this.this$0;
                C0753xc740097d c0753xc740097d = new C0753xc740097d(CredentialProviderBaseController.INSTANCE);
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
                if (createPasswordCredentialController.maybeReportErrorFromResultReceiver(resultData, c0753xc740097d, executor, interfaceC4779p, this.this$0.cancellationSignal)) {
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

    @NotNull
    public static final CreatePasswordCredentialController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(final CreatePasswordCredentialController createPasswordCredentialController, final AbstractC4753c abstractC4753c) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.m
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$11$lambda$10(this.f2709a, abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$11$lambda$10(CreatePasswordCredentialController createPasswordCredentialController, AbstractC4753c abstractC4753c) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPasswordCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.onResult(abstractC4753c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CreatePasswordCredentialController createPasswordCredentialController, final AbstractC5332f abstractC5332f) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.j
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$13$lambda$12(this.f2705a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$13$lambda$12(CreatePasswordCredentialController createPasswordCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPasswordCredentialController.callback;
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
    public static final Unit handleResponse$lambda$5(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$7(final CreatePasswordCredentialController createPasswordCredentialController, final AbstractC5332f e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.h
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$7$lambda$6(this.f2702a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$7$lambda$6(CreatePasswordCredentialController createPasswordCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPasswordCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$9(final CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$9$lambda$8(this.f2707a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$9$lambda$8(CreatePasswordCredentialController createPasswordCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPasswordCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialHandle createCredentialHandle) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(createPasswordCredentialController.context, (Class<?>) HiddenActivity.class);
        createPasswordCredentialController.generateHiddenActivityIntent(createPasswordCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, createCredentialHandle.getPendingIntent());
        try {
            createPasswordCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePasswordCredentialController.invokePlayServices$lambda$2$lambda$1(this.f2708a);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2$lambda$1(final CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            Intrinsics.m31998u("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.i
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.invokePlayServices$lambda$2$lambda$1$lambda$0(this.f2704a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$1$lambda$0(CreatePasswordCredentialController createPasswordCredentialController) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = createPasswordCredentialController.callback;
        if (interfaceC4779p == null) {
            Intrinsics.m31998u("callback");
            interfaceC4779p = null;
        }
        interfaceC4779p.mo7535a(new C5336j(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4(CreatePasswordCredentialController createPasswordCredentialController, C4761g c4761g, InterfaceC4779p interfaceC4779p, Executor executor, CancellationSignal cancellationSignal, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.w(TAG, "Pre-u credman create flow failed " + e10 + "; retrying with gis flow");
        new CredentialProviderCreatePasswordController(createPasswordCredentialController.context).invokePlayServices(c4761g, (InterfaceC4779p<AbstractC4753c, AbstractC5332f>) interfaceC4779p, executor, cancellationSignal);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.m3295xa2b31783()) {
            Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " which does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreatePasswordCredentialController.handleResponse$lambda$5((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreatePasswordCredentialController.handleResponse$lambda$7(this.f2690a, (AbstractC5332f) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$9(this.f2691a);
                }
            });
            return;
        }
        C9632a.Companion companion2 = C9632a.INSTANCE;
        final AbstractC4753c abstractC4753cM38012b = companion2.m38012b("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
        if (abstractC4753cM38012b != null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$11(this.f2692a, abstractC4753cM38012b);
                }
            });
        } else {
            final AbstractC5332f abstractC5332fM38011a = companion2.m38011a(data);
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$13(this.f2694a, abstractC5332fM38011a);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public CreateCredentialRequest convertRequestToPlayServices(@NotNull C4761g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateCredentialRequest(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), null, null);
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
    public void invokePlayServices(@NotNull final C4761g request, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
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
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreatePasswordCredentialController.invokePlayServices$lambda$2(cancellationSignal, this, (CreateCredentialHandle) obj);
            }
        };
        taskMo42281l.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.f
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.g
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CreatePasswordCredentialController.invokePlayServices$lambda$4(this.f2697a, request, callback, executor, cancellationSignal, exc);
            }
        });
    }
}

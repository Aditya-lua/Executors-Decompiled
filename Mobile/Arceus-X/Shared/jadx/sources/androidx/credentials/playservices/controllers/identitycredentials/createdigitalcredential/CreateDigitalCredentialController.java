package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

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
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
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
import p092e3.C4757e;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.C5336j;
import p320o3.C9632a;
import sa.C11235p;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0006*\u00012\b\u0001\u0018\u0000 62 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0016\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0018\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001a\u00100\u0012\u0004\b1\u0010)R\u001a\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010)¨\u00067"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/e;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Le3/e;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/e;)Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)Le3/c;", "Landroid/content/Context;", "Le3/p;", "getCallback", "()Le3/p;", "setCallback", "(Le3/p;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$resultReceiver$1;", "getResultReceiver$annotations", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CreateDigitalCredentialController extends CredentialProviderController<C4757e, CreateCredentialRequest, CreateCredentialResponse, AbstractC4753c, AbstractC5332f> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "DigitalCredentialClient";
    public InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final CreateDigitalCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$Companion;", "", "<init>", "()V", "TAG", "", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1] */
    public CreateDigitalCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0738x5b3c8658(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
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
    public static final Unit handleResponse$lambda$0(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$2(final CreateDigitalCredentialController createDigitalCredentialController, final AbstractC5332f e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.j
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$2$lambda$1(this.f2680a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$lambda$1(CreateDigitalCredentialController createDigitalCredentialController, AbstractC5332f abstractC5332f) {
        createDigitalCredentialController.getCallback().mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$4(final CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.l
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$4$lambda$3(this.f2684a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$lambda$3(CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getCallback().mo7535a(new C5336j("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$6(final CreateDigitalCredentialController createDigitalCredentialController, final AbstractC5332f abstractC5332f) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$6$lambda$5(this.f2682a, abstractC5332f);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$6$lambda$5(CreateDigitalCredentialController createDigitalCredentialController, AbstractC5332f abstractC5332f) {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback = createDigitalCredentialController.getCallback();
        if (abstractC5332f == null) {
            abstractC5332f = new C5336j("Unexpected configuration error");
        }
        callback.mo7535a(abstractC5332f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$8(final CreateDigitalCredentialController createDigitalCredentialController, final AbstractC4753c abstractC4753c) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$8$lambda$7(this.f2676a, abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$8$lambda$7(CreateDigitalCredentialController createDigitalCredentialController, AbstractC4753c abstractC4753c) {
        createDigitalCredentialController.getCallback().onResult(abstractC4753c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$13(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, final Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateDigitalCredentialController.invokePlayServices$lambda$13$lambda$12(executor, interfaceC4779p, e10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$13$lambda$12(Executor executor, final InterfaceC4779p interfaceC4779p, final Exception exc) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.i
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.invokePlayServices$lambda$13$lambda$12$lambda$11(interfaceC4779p, exc);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$13$lambda$12$lambda$11(InterfaceC4779p interfaceC4779p, Exception exc) {
        interfaceC4779p.mo7535a(new C5336j(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$9(CancellationSignal cancellationSignal, CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialHandle createCredentialHandle) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(createDigitalCredentialController.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, createDigitalCredentialController.toIpcFriendlyResultReceiver(createDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, createCredentialHandle.getPendingIntent());
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.CREATE_UNKNOWN);
        createDigitalCredentialController.context.startActivity(intent);
        return Unit.f29331a;
    }

    @NotNull
    public final InterfaceC4779p<AbstractC4753c, AbstractC5332f> getCallback() {
        InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p = this.callback;
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

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.m3295xa2b31783()) {
            Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreateDigitalCredentialController.handleResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateDigitalCredentialController.handleResponse$lambda$2(this.f2666a, (AbstractC5332f) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$4(this.f2667a);
                }
            });
            return;
        }
        C9632a.Companion companion2 = C9632a.INSTANCE;
        final AbstractC4753c abstractC4753cM38012b = companion2.m38012b("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", data);
        if (abstractC4753cM38012b != null) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$8(this.f2670a, abstractC4753cM38012b);
                }
            });
        } else {
            final AbstractC5332f abstractC5332fM38011a = companion2.m38011a(data);
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$6(this.f2668a, abstractC5332fM38011a);
                }
            });
        }
    }

    public final void setCallback(@NotNull InterfaceC4779p<AbstractC4753c, AbstractC5332f> interfaceC4779p) {
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
    public CreateCredentialRequest convertRequestToPlayServices(@NotNull C4757e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateCredentialRequest(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), request.getRequestJson(), this.resultReceiver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public AbstractC4753c convertResponseToCredentialManager(@NotNull CreateCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return AbstractC4753c.INSTANCE.m23147a("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", response.getData());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4757e request, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<CreateCredentialHandle> taskMo42281l = C11235p.INSTANCE.m42283a(this.context).mo42281l(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateDigitalCredentialController.invokePlayServices$lambda$9(cancellationSignal, this, (CreateCredentialHandle) obj);
            }
        };
        taskMo42281l.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.f
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.g
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CreateDigitalCredentialController.invokePlayServices$lambda$13(cancellationSignal, executor, callback, exc);
            }
        });
    }
}

package androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4794w0;
import p092e3.C4796x0;
import p092e3.InterfaceC4779p;
import p158h3.AbstractC6277f;
import sa.C11235p;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/w0;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "Le3/x0;", "Lh3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/w0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/w0;)Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)Le3/x0;", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class SignalCredentialStateController extends CredentialProviderController<AbstractC4794w0, SignalCredentialStateRequest, SignalCredentialStateResponse, C4796x0, AbstractC6277f> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";

    @NotNull
    private final Context context;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController$Companion;", "", "<init>", "()V", "SIGNAL_REQUEST_JSON_KEY", "", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SignalCredentialStateController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SignalCredentialStateController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public static final SignalCredentialStateController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2(Executor executor, SignalCredentialStateController signalCredentialStateController, final InterfaceC4779p interfaceC4779p, SignalCredentialStateResponse signalCredentialStateResponse) {
        if (signalCredentialStateResponse == null) {
            executor.execute(new Runnable() { // from class: n3.e
                @Override // java.lang.Runnable
                public final void run() {
                    SignalCredentialStateController.invokePlayServices$lambda$2$lambda$0(interfaceC4779p);
                }
            });
            return Unit.f29331a;
        }
        final C4796x0 c4796x0ConvertResponseToCredentialManager = signalCredentialStateController.convertResponseToCredentialManager(signalCredentialStateResponse);
        executor.execute(new Runnable() { // from class: n3.f
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(c4796x0ConvertResponseToCredentialManager);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$0(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(AbstractC6277f.INSTANCE.m27536a("No SignalCredentialStateResponse received"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$5(Executor executor, final InterfaceC4779p interfaceC4779p, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final AbstractC6277f abstractC6277fM27536a = AbstractC6277f.INSTANCE.m27536a(e10.getMessage());
        executor.execute(new Runnable() { // from class: n3.d
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.mo7535a(abstractC6277fM27536a);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public SignalCredentialStateRequest convertRequestToPlayServices(@NotNull AbstractC4794w0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new SignalCredentialStateRequest(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), request.getOrigin(), request.getRequestData());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public C4796x0 convertResponseToCredentialManager(@NotNull SignalCredentialStateResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new C4796x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull AbstractC4794w0 request, @NotNull final InterfaceC4779p<C4796x0, AbstractC6277f> callback, @NotNull final Executor executor, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Task<SignalCredentialStateResponse> taskMo42282s = C11235p.INSTANCE.m42283a(this.context).mo42282s(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: n3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignalCredentialStateController.invokePlayServices$lambda$2(executor, this, callback, (SignalCredentialStateResponse) obj);
            }
        };
        taskMo42282s.mo11893g(new InterfaceC11256g() { // from class: n3.b
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: n3.c
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                SignalCredentialStateController.invokePlayServices$lambda$5(executor, callback, exc);
            }
        });
    }
}

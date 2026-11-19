package androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import e3.p;
import e3.w0;
import e3.x0;
import h3.f;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import ta.b0;
import ta.o0;
import ta.q0;
import tb.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/w0;", "Lta/o0;", "Lta/q0;", "Le3/x0;", "Lh3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", BuildConfig.FLAVOR, "invokePlayServices", "(Le3/w0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/w0;)Lta/o0;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lta/q0;)Le3/x0;", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignalCredentialStateController extends CredentialProviderController<w0, o0, q0, x0, f> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "SIGNAL_REQUEST_JSON_KEY", BuildConfig.FLAVOR, "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SignalCredentialStateController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SignalCredentialStateController(context);
        }

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
    public static final Unit invokePlayServices$lambda$2(Executor executor, SignalCredentialStateController signalCredentialStateController, final p pVar, q0 q0Var) {
        if (q0Var == null) {
            executor.execute(new Runnable() { // from class: n3.e
                @Override // java.lang.Runnable
                public final void run() {
                    SignalCredentialStateController.invokePlayServices$lambda$2$lambda$0(pVar);
                }
            });
            return Unit.f21506a;
        }
        final x0 x0VarConvertResponseToCredentialManager = signalCredentialStateController.convertResponseToCredentialManager(q0Var);
        executor.execute(new Runnable() { // from class: n3.f
            @Override // java.lang.Runnable
            public final void run() {
                pVar.onResult(x0VarConvertResponseToCredentialManager);
            }
        });
        return Unit.f21506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$0(p pVar) {
        pVar.a(f.INSTANCE.a("No SignalCredentialStateResponse received"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$5(Executor executor, final p pVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final f fVarA = f.INSTANCE.a(e10.getMessage());
        executor.execute(new Runnable() { // from class: n3.d
            @Override // java.lang.Runnable
            public final void run() {
                pVar.a(fVarA);
            }
        });
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public o0 convertRequestToPlayServices(@NotNull w0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new o0(request.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), request.getOrigin(), request.getRequestData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public x0 convertResponseToCredentialManager(@NotNull q0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new x0();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull w0 request, @NotNull final p<x0, f> callback, @NotNull final Executor executor, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Task<q0> taskF = b0.INSTANCE.a(this.context).f(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: n3.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignalCredentialStateController.invokePlayServices$lambda$2(executor, this, callback, (q0) obj);
            }
        };
        taskF.g(new g() { // from class: n3.b
            @Override // tb.g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).e(new tb.f() { // from class: n3.c
            @Override // tb.f
            public final void onFailure(Exception exc) {
                SignalCredentialStateController.invokePlayServices$lambda$5(executor, callback, exc);
            }
        });
    }
}

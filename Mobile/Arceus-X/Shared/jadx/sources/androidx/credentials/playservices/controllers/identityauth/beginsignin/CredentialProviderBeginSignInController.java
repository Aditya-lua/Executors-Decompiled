package androidx.credentials.playservices.controllers.identityauth.beginsignin;

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
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4773m;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4784r0;
import p092e3.C4788t0;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5340n;
import p117f3.C5338l;
import p117f3.C5341o;
import p117f3.C5343q;
import p167hc.C6355d;
import p242k9.C7492b;
import p598z8.C13738b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0005*\u00019\b\u0000\u0018\u0000 <2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001<B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010$\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00148\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0015\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0017\u00101\u0012\u0004\b6\u00100\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u00107\u0012\u0004\b8\u00100R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/k0;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Le3/l0;", "Lf3/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Lf3/n;", Payload.RESPONSE, "Lhc/d;", "createGoogleIdCredential", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lhc/d;", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/k0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Le3/k0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Le3/l0;", "Landroid/content/Context;", "Le3/p;", "getCallback", "()Le3/p;", "setCallback", "(Le3/p;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C4770k0, BeginSignInRequest, SignInCredential, C4772l0, AbstractC5340n> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BeginSignIn";
    public InterfaceC4779p<C4772l0, AbstractC5340n> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CredentialProviderBeginSignInController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0660x4b514208(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final C6355d createGoogleIdCredential(SignInCredential response) {
        C6355d.a aVar = new C6355d.a();
        String strM9059y3 = response.m9059y3();
        Intrinsics.checkNotNullExpressionValue(strM9059y3, "getId(...)");
        C6355d.a aVarM27676e = aVar.m27676e(strM9059y3);
        String strM9058x3 = response.m9058x3();
        Intrinsics.checkNotNull(strM9058x3);
        C6355d.a aVarM27677f = aVarM27676e.m27677f(strM9058x3);
        if (response.m9055l() != null) {
            aVarM27677f.m27673b(response.m9055l());
        }
        if (response.m9057w3() != null) {
            aVarM27677f.m27675d(response.m9057w3());
        }
        if (response.m9056v3() != null) {
            aVarM27677f.m27674c(response.m9056v3());
        }
        if (response.m9052A3() != null) {
            aVarM27677f.m27678g(response.m9052A3());
        }
        if (response.m9053B3() != null) {
            aVarM27677f.m27679h(response.m9053B3());
        }
        return aVarM27677f.m27672a();
    }

    private final AbstractC5340n fromGmsException(Throwable e10) {
        String str = ((e10 instanceof C7492b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C7492b) e10).m31131b()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        return CredentialProviderBaseController.INSTANCE.m3296xd975db95(str, "During begin sign in, failure response from one tap: " + e10.getMessage());
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    @NotNull
    public static final CredentialProviderBeginSignInController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final C4772l0 c4772l0) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.r
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$11$lambda$10(this.f2571a, c4772l0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$11$lambda$10(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C4772l0 c4772l0) {
        credentialProviderBeginSignInController.getCallback().onResult(c4772l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final C7729c0 c7729c0) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$13$lambda$12(this.f2554a, c7729c0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleResponse$lambda$13$lambda$12(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C7729c0 c7729c0) {
        credentialProviderBeginSignInController.getCallback().mo7535a(c7729c0.f29425a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$15(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final AbstractC5340n abstractC5340n) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$15$lambda$14(this.f2563a, abstractC5340n);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$15$lambda$14(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC5340n abstractC5340n) {
        credentialProviderBeginSignInController.getCallback().mo7535a(abstractC5340n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$17(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final C5343q c5343q) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.p
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$17$lambda$16(this.f2567a, c5343q);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$17$lambda$16(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C5343q c5343q) {
        credentialProviderBeginSignInController.getCallback().mo7535a(c5343q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$7(CancellationSignal cancellationSignal, Function0 f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$9(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final AbstractC5340n e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.o
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$9$lambda$8(this.f2565a, e10);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$9$lambda$8(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC5340n abstractC5340n) {
        credentialProviderBeginSignInController.getCallback().mo7535a(abstractC5340n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final CredentialProviderBeginSignInController credentialProviderBeginSignInController, BeginSignInResult beginSignInResult) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.f29331a;
        }
        Intent intent = new Intent(credentialProviderBeginSignInController.context, (Class<?>) HiddenActivity.class);
        credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, beginSignInResult.m9028v3());
        try {
            credentialProviderBeginSignInController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1(this.f2556a);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2$lambda$1(final CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1$lambda$0(this.f2560a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$1$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getCallback().mo7535a(new C5343q(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, CancellationSignal cancellationSignal, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final AbstractC5340n abstractC5340nFromGmsException = credentialProviderBeginSignInController.fromGmsException(e10);
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5(this.f2561a, abstractC5340nFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6$lambda$5(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final AbstractC5340n abstractC5340n) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.q
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2569a, abstractC5340n);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC5340n abstractC5340n) {
        credentialProviderBeginSignInController.getCallback().mo7535a(abstractC5340n);
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

    /* JADX WARN: Type inference failed for: r6v2, types: [T, f3.q] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, f3.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, f3.l] */
    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.m3295xa2b31783()) {
            Log.w(TAG, "Returned request code " + companion.m3295xa2b31783() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
        if (companion2.m3302x7474352d(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CredentialProviderBeginSignInController.handleResponse$lambda$7((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.handleResponse$lambda$9(this.f2545a, (AbstractC5340n) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialMo48759d = C13738b.m50157b(this.context).mo48759d(data);
            Intrinsics.checkNotNullExpressionValue(signInCredentialMo48759d, "getSignInCredentialFromIntent(...)");
            final C4772l0 c4772l0ConvertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialMo48759d);
            companion2.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$11(this.f2546a, c4772l0ConvertResponseToCredentialManager);
                }
            });
        } catch (AbstractC5340n e10) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$15(this.f2550a, e10);
                }
            });
        } catch (C7492b e11) {
            final C7729c0 c7729c0 = new C7729c0();
            c7729c0.f29425a = new C5343q(e11.getMessage());
            if (e11.m31131b() == 16) {
                c7729c0.f29425a = new C5338l(e11.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e11.m31131b()))) {
                c7729c0.f29425a = new C5341o(e11.getMessage());
            }
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$13(this.f2548a, c7729c0);
                }
            });
        } catch (Throwable th2) {
            final C5343q c5343q = new C5343q(th2.getMessage());
            CredentialProviderController.INSTANCE.m3299xd7d57380(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$17(this.f2552a, c5343q);
                }
            });
        }
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
    public BeginSignInRequest convertRequestToPlayServices(@NotNull C4770k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return BeginSignInControllerUtility.INSTANCE.m3303x545fe152(request, this.context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public C4772l0 convertResponseToCredentialManager(@NotNull SignInCredential response) throws C5343q {
        AbstractC4773m c4788t0;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.m9060z3() != null) {
            String strM9059y3 = response.m9059y3();
            Intrinsics.checkNotNullExpressionValue(strM9059y3, "getId(...)");
            String strM9060z3 = response.m9060z3();
            Intrinsics.checkNotNull(strM9060z3);
            c4788t0 = new C4784r0(strM9059y3, strM9060z3);
        } else if (response.m9058x3() != null) {
            c4788t0 = createGoogleIdCredential(response);
        } else if (response.m9054C3() != null) {
            c4788t0 = new C4788t0(PublicKeyCredentialControllerUtility.INSTANCE.toAssertPasskeyResponse(response));
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            c4788t0 = null;
        }
        if (c4788t0 != null) {
            return new C4772l0(c4788t0);
        }
        throw new C5343q("When attempting to convert get response, null credential found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4770k0 request, @NotNull InterfaceC4779p<C4772l0, AbstractC5340n> callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<BeginSignInResult> taskMo48763t = C13738b.m50157b(this.context).mo48763t(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$2(cancellationSignal, this, (BeginSignInResult) obj);
            }
        };
        taskMo48763t.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.j
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.k
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6(this.f2558a, cancellationSignal, exc);
            }
        });
    }
}

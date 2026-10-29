package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.tasks.Task;
import e3.k0;
import e3.l0;
import e3.n0;
import e3.q0;
import e3.s0;
import e3.w0;
import e3.x0;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0010H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010$J?\u0010%\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b%\u0010\u0016J3\u0010)\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0010H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Le3/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Le3/a;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Ljava/lang/Void;", "Lf3/a;", "callback", "", "runFallbackClearCredFlow", "(Le3/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/k0;", "Le3/l0;", "Lf3/n;", "onGetCredential", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "onCreateCredential", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "onClearCredential", "Le3/w0;", "Le3/x0;", "Lh3/f;", "onSignalCredentialState", "(Le3/w0;Ljava/util/concurrent/Executor;Le3/p;)V", "Landroid/content/Context;", "Lj9/c;", "googleApiAvailability", "Lj9/c;", "getGoogleApiAvailability", "()Lj9/c;", "setGoogleApiAvailability", "(Lj9/c;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements e3.s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private j9.c googleApiAvailability;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Le3/k0;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Le3/k0;)Z", "isGetSignInIntentRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth_release", "isGetRestoreCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth_release", "isDigitalCredentialRequest", "", "TAG", "Ljava/lang/String;", "", "MIN_GMS_APK_VERSION", "I", "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(@Nullable CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(@Nullable CancellationSignal cancellationSignal, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(@NotNull k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<e3.r> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof n0) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(@NotNull k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<e3.r> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof q0) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(@NotNull k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<e3.r> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof gc.c) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        j9.c cVarO = j9.c.o();
        Intrinsics.checkNotNullExpressionValue(cVarO, "getInstance(...)");
        this.googleApiAvailability = cVarO;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.h(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10(CancellationSignal cancellationSignal, final Executor executor, final e3.p pVar, Boolean bool) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$10$lambda$9(executor, pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10$lambda$9(Executor executor, final e3.p pVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.n
            @Override // java.lang.Runnable
            public final void run() {
                pVar.onResult(null);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, f3.c] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, f3.c] */
    public static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, final Executor executor, final e3.p pVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        final c0 c0Var = new c0();
        c0Var.f22552a = new f3.c("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof k9.b) && ((k9.b) e10).b() == 40201) {
            c0Var.f22552a = new f3.c("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13(executor, pVar, c0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$14$lambda$13(Executor executor, final e3.p pVar, final c0 c0Var) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.g
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12(pVar, c0Var);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(e3.p pVar, c0 c0Var) {
        pVar.a(c0Var.f22552a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17(CancellationSignal cancellationSignal, final Executor executor, final e3.p pVar, ClearCredentialStateResponse clearCredentialStateResponse) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$17$lambda$16(executor, pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17$lambda$16(Executor executor, final e3.p pVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.b
            @Override // java.lang.Runnable
            public final void run() {
                pVar.onResult(null);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, e3.a aVar, CancellationSignal cancellationSignal, Executor executor, e3.p pVar, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$7(Executor executor, final e3.p pVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(e3.p pVar) {
        pVar.a(new f3.b("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$5(Executor executor, final e3.p pVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.o
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(e3.p pVar) {
        pVar.a(new f3.i("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(Executor executor, final e3.p pVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.t
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(e3.p pVar) {
        pVar.a(new f3.p("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$3(Executor executor, final e3.p pVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.r
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(e3.p pVar) {
        pVar.a(new f3.p("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(e3.a request, final CancellationSignal cancellationSignal, final Executor executor, final e3.p<Void, f3.a> callback) {
        Task<Void> taskR = z8.b.b(this.context).r();
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, callback, (Void) obj);
            }
        };
        taskR.g(new sb.g() { // from class: androidx.credentials.playservices.i
            @Override // sb.g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).e(new sb.f() { // from class: androidx.credentials.playservices.j
            @Override // sb.f
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27(this.f2114a, cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, final Executor executor, final e3.p pVar, Void r8) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22$lambda$21(executor, pVar);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, final e3.p pVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.e
            @Override // java.lang.Runnable
            public final void run() {
                pVar.onResult(null);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final e3.p pVar, final Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e10, executor, pVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(final Exception exc, Executor executor, final e3.p pVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.q
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(pVar, exc);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(e3.p pVar, Exception exc) {
        pVar.a(new f3.c(exc.getMessage()));
    }

    @NotNull
    public final j9.c getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // e3.s
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(@NotNull e3.a request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull e3.p<Void, f3.a> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            throw null;
        }
    }

    @Override // e3.s
    public void onCreateCredential(@NotNull Context context, @NotNull e3.b request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final e3.p<e3.c, f3.f> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof e3.g) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePasswordCredentialController.INSTANCE.getInstance(context).invokePlayServices((e3.g) request, callback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((e3.g) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof e3.i) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                e3.i iVar = (e3.i) request;
                if (!iVar.getIsConditional()) {
                    CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices(iVar, callback, executor, cancellationSignal);
                    return;
                }
            }
            CreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((e3.i) request, callback, executor, cancellationSignal);
            return;
        }
        if (!(request instanceof e3.k)) {
            if (!(request instanceof e3.e)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            new CreateDigitalCredentialController(context).invokePlayServices((e3.e) request, callback, executor, cancellationSignal);
        } else if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((e3.k) request, callback, executor, cancellationSignal);
        } else {
            companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5(executor, callback);
                }
            });
        }
    }

    @Override // e3.s
    public /* bridge */ /* synthetic */ void onGetCredential(@NotNull Context context, @NotNull s0 s0Var, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull e3.p pVar) {
        super.onGetCredential(context, s0Var, cancellationSignal, executor, (e3.p<l0, f3.n>) pVar);
    }

    @Override // e3.s
    public /* bridge */ /* synthetic */ void onPrepareCredential(@NotNull k0 k0Var, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull e3.p pVar) {
        super.onPrepareCredential(k0Var, cancellationSignal, executor, pVar);
    }

    public void onSignalCredentialState(@NotNull w0 request, @NotNull Executor executor, @NotNull e3.p<x0, h3.f> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.INSTANCE.getInstance(this.context), request, callback, executor, null, 8, null);
    }

    public final void setGoogleApiAvailability(@NotNull j9.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.googleApiAvailability = cVar;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z10 = iIsGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z10;
    }

    @Override // e3.s
    public void onGetCredential(@NotNull Context context, @NotNull k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final e3.p<l0, f3.n> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, callback);
                    }
                });
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$3(executor, callback);
                    }
                });
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}

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
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4751b;
import p092e3.AbstractC4753c;
import p092e3.AbstractC4783r;
import p092e3.AbstractC4794w0;
import p092e3.C4749a;
import p092e3.C4757e;
import p092e3.C4761g;
import p092e3.C4765i;
import p092e3.C4769k;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4776n0;
import p092e3.C4782q0;
import p092e3.C4786s0;
import p092e3.C4796x0;
import p092e3.InterfaceC4779p;
import p092e3.InterfaceC4785s;
import p117f3.AbstractC5327a;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p117f3.C5328b;
import p117f3.C5329c;
import p117f3.C5335i;
import p117f3.C5342p;
import p158h3.AbstractC6277f;
import p167hc.C6354c;
import p213j9.C7089c;
import p242k9.C7492b;
import p598z8.C13738b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0010H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010$J?\u0010%\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b%\u0010\u0016J3\u0010)\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0010H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, m31665d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Le3/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Le3/a;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Ljava/lang/Void;", "Lf3/a;", "callback", "", "runFallbackClearCredFlow", "(Le3/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/k0;", "Le3/l0;", "Lf3/n;", "onGetCredential", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "onCreateCredential", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "onClearCredential", "Le3/w0;", "Le3/x0;", "Lh3/f;", "onSignalCredentialState", "(Le3/w0;Ljava/util/concurrent/Executor;Le3/p;)V", "Landroid/content/Context;", "Lj9/c;", "googleApiAvailability", "Lj9/c;", "getGoogleApiAvailability", "()Lj9/c;", "setGoogleApiAvailability", "(Lj9/c;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderPlayServicesImpl implements InterfaceC4785s {

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
    private C7089c googleApiAvailability;

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, m31665d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Le3/k0;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Le3/k0;)Z", "isGetSignInIntentRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth_release", "isGetRestoreCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth_release", "isDigitalCredentialRequest", "", "TAG", "Ljava/lang/String;", "", "MIN_GMS_APK_VERSION", "I", "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.CredentialProviderPlayServicesImpl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

        /* JADX INFO: renamed from: cancellationReviewerWithCallback$credentials_play_services_auth_release */
        public final void m3289xee23955a(@Nullable CancellationSignal cancellationSignal, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        /* JADX INFO: renamed from: isDigitalCredentialRequest$credentials_play_services_auth_release */
        public final boolean m3290x5c80d6a3(@NotNull C4770k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<AbstractC4783r> it = request.m23188a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C4776n0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: isGetRestoreCredentialRequest$credentials_play_services_auth_release */
        public final boolean m3291xf9cbe037(@NotNull C4770k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<AbstractC4783r> it = request.m23188a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C4782q0) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(@NotNull C4770k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<AbstractC4783r> it = request.m23188a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C6354c) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        C7089c c7089cM29849o = C7089c.m29849o();
        Intrinsics.checkNotNullExpressionValue(c7089cM29849o, "getInstance(...)");
        this.googleApiAvailability = c7089cM29849o;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.mo29855h(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Boolean bool) {
        INSTANCE.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$10$lambda$9(executor, interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10$lambda$9(Executor executor, final InterfaceC4779p interfaceC4779p) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.n
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(null);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, f3.c] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, f3.c] */
    public static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = new C5329c("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof C7492b) && ((C7492b) e10).m31131b() == 40201) {
            c7729c0.f29425a = new C5329c("The restore credential internal service had a failure.");
        }
        INSTANCE.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13(executor, interfaceC4779p, c7729c0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$14$lambda$13(Executor executor, final InterfaceC4779p interfaceC4779p, final C7729c0 c7729c0) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.g
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12(interfaceC4779p, c7729c0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(InterfaceC4779p interfaceC4779p, C7729c0 c7729c0) {
        interfaceC4779p.mo7535a(c7729c0.f29425a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, ClearCredentialStateResponse clearCredentialStateResponse) {
        INSTANCE.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$17$lambda$16(executor, interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17$lambda$16(Executor executor, final InterfaceC4779p interfaceC4779p) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.b
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(null);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, C4749a c4749a, CancellationSignal cancellationSignal, Executor executor, InterfaceC4779p interfaceC4779p, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(c4749a, cancellationSignal, executor, interfaceC4779p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$7(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5328b("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$5(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.o
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5335i("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.t
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5342p("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$3(Executor executor, final InterfaceC4779p interfaceC4779p) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.r
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(InterfaceC4779p interfaceC4779p) {
        interfaceC4779p.mo7535a(new C5342p("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(C4749a request, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p<Void, AbstractC5327a> callback) {
        Task<Void> taskMo48762r = C13738b.m50157b(this.context).mo48762r();
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, callback, (Void) obj);
            }
        };
        taskMo48762r.mo11893g(new InterfaceC11256g() { // from class: androidx.credentials.playservices.i
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: androidx.credentials.playservices.j
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27(this.f2788a, cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Void r8) {
        INSTANCE.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22$lambda$21(executor, interfaceC4779p);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, final InterfaceC4779p interfaceC4779p) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.e
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(null);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, final Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        INSTANCE.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e10, executor, interfaceC4779p);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(final Exception exc, Executor executor, final InterfaceC4779p interfaceC4779p) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.q
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(interfaceC4779p, exc);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(InterfaceC4779p interfaceC4779p, Exception exc) {
        interfaceC4779p.mo7535a(new C5329c(exc.getMessage()));
    }

    @NotNull
    public final C7089c getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p092e3.InterfaceC4785s
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(@NotNull C4749a request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p<Void, AbstractC5327a> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            throw null;
        }
    }

    @Override // p092e3.InterfaceC4785s
    public void onCreateCredential(@NotNull Context context, @NotNull AbstractC4751b request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C4761g) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePasswordCredentialController.INSTANCE.getInstance(context).invokePlayServices((C4761g) request, callback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((C4761g) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof C4765i) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                C4765i c4765i = (C4765i) request;
                if (!c4765i.getIsConditional()) {
                    CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices(c4765i, callback, executor, cancellationSignal);
                    return;
                }
            }
            CreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((C4765i) request, callback, executor, cancellationSignal);
            return;
        }
        if (!(request instanceof C4769k)) {
            if (!(request instanceof C4757e)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            new CreateDigitalCredentialController(context).invokePlayServices((C4757e) request, callback, executor, cancellationSignal);
        } else if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((C4769k) request, callback, executor, cancellationSignal);
        } else {
            companion.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5(executor, callback);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p092e3.InterfaceC4785s
    public /* bridge */ /* synthetic */ void onGetCredential(@NotNull Context context, @NotNull C4786s0 c4786s0, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p interfaceC4779p) {
        super.onGetCredential(context, c4786s0, cancellationSignal, executor, (InterfaceC4779p<C4772l0, AbstractC5340n>) interfaceC4779p);
    }

    @Override // p092e3.InterfaceC4785s
    public /* bridge */ /* synthetic */ void onPrepareCredential(@NotNull C4770k0 c4770k0, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p interfaceC4779p) {
        super.onPrepareCredential(c4770k0, cancellationSignal, executor, interfaceC4779p);
    }

    public void onSignalCredentialState(@NotNull AbstractC4794w0 request, @NotNull Executor executor, @NotNull InterfaceC4779p<C4796x0, AbstractC6277f> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.INSTANCE.getInstance(this.context), request, callback, executor, null, 8, null);
    }

    public final void setGoogleApiAvailability(@NotNull C7089c c7089c) {
        Intrinsics.checkNotNullParameter(c7089c, "<set-?>");
        this.googleApiAvailability = c7089c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z10 = iIsGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p092e3.InterfaceC4785s
    public void onGetCredential(@NotNull Context context, @NotNull C4770k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final InterfaceC4779p<C4772l0, AbstractC5340n> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.m3290x5c80d6a3(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, callback);
                    }
                });
                return;
            }
        }
        if (companion.m3291xf9cbe037(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.m3289xee23955a(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.l
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

package androidx.credentials.playservices.controllers.blockstore.getrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4773m;
import p092e3.AbstractC4783r;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4782q0;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5340n;
import p117f3.C5343q;
import p117f3.C5345s;
import p123f9.C5493e;
import p242k9.C7492b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/k0;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Le3/l0;", "Lf3/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/k0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/k0;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Le3/l0;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<C4770k0, GetRestoreCredentialRequest, GetRestoreCredentialResponse, C4772l0, AbstractC5340n> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, GetRestoreCredentialResponse getRestoreCredentialResponse) {
        try {
            Intrinsics.checkNotNull(getRestoreCredentialResponse);
            final C4772l0 c4772l0ConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(getRestoreCredentialResponse);
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: m3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$1(executor, interfaceC4779p, c4772l0ConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e10) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: m3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3(executor, interfaceC4779p, e10);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$1(Executor executor, final InterfaceC4779p interfaceC4779p, final C4772l0 c4772l0) {
        executor.execute(new Runnable() { // from class: m3.e
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(c4772l0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, final InterfaceC4779p interfaceC4779p, final Exception exc) {
        executor.execute(new Runnable() { // from class: m3.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3$lambda$2(interfaceC4779p, exc);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(InterfaceC4779p interfaceC4779p, Exception exc) {
        interfaceC4779p.mo7535a(exc instanceof C5345s ? (AbstractC5340n) exc : new C5343q(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, f3.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, f3.q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, f3.q] */
    public static final void invokePlayServices$lambda$8(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = new C5343q("Get restore credential failed for unknown reason, failure: " + e10.getMessage());
        if (e10 instanceof C7492b) {
            C7492b c7492b = (C7492b) e10;
            if (c7492b.m31131b() == 40201) {
                c7729c0.f29425a = new C5343q("The restore credential internal service had a failure, failure: " + e10.getMessage());
            } else {
                c7729c0.f29425a = new C5343q("The restore credential service failed with unsupported status code, failure: " + e10.getMessage() + ", status code: " + c7492b.m31131b());
            }
        }
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: m3.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7(executor, interfaceC4779p, c7729c0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, final InterfaceC4779p interfaceC4779p, final C7729c0 c7729c0) {
        executor.execute(new Runnable() { // from class: m3.g
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(interfaceC4779p, c7729c0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(InterfaceC4779p interfaceC4779p, C7729c0 c7729c0) {
        interfaceC4779p.mo7535a(c7729c0.f29425a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetRestoreCredentialRequest convertRequestToPlayServices(@NotNull C4770k0 request) {
        AbstractC4783r abstractC4783r;
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<AbstractC4783r> it = request.m23188a().iterator();
        do {
            abstractC4783r = null;
            if (!it.hasNext()) {
                break;
            }
        } while (!(it.next() instanceof C4782q0));
        Intrinsics.m31998u("credentialOption");
        return new GetRestoreCredentialRequest(abstractC4783r.getRequestData());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public C4772l0 convertResponseToCredentialManager(@NotNull GetRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new C4772l0(AbstractC4773m.INSTANCE.m23203b("androidx.credentials.TYPE_RESTORE_CREDENTIAL", response.getResponseBundle()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4770k0 request, @NotNull final InterfaceC4779p<C4772l0, AbstractC5340n> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<GetRestoreCredentialResponse> taskMo25147g = C5493e.m25146a(this.context).mo25147g(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: m3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4(this.f31004a, cancellationSignal, executor, callback, (GetRestoreCredentialResponse) obj);
            }
        };
        taskMo25147g.mo11893g(new InterfaceC11256g() { // from class: m3.b
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: m3.c
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8(cancellationSignal, executor, callback, exc);
            }
        });
    }
}

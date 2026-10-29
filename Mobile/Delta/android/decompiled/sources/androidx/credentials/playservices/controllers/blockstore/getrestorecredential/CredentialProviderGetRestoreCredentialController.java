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
import e3.k0;
import e3.l0;
import e3.m;
import e3.p;
import e3.q0;
import e3.r;
import f3.n;
import f3.q;
import f3.s;
import f9.e;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k9.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.f;
import sb.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/k0;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Le3/l0;", "Lf3/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/k0;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/k0;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Le3/l0;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<k0, GetRestoreCredentialRequest, GetRestoreCredentialResponse, l0, n> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final p pVar, GetRestoreCredentialResponse getRestoreCredentialResponse) {
        try {
            Intrinsics.checkNotNull(getRestoreCredentialResponse);
            final l0 l0VarConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(getRestoreCredentialResponse);
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: m3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$1(executor, pVar, l0VarConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e10) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: m3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3(executor, pVar, e10);
                }
            });
        }
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$1(Executor executor, final p pVar, final l0 l0Var) {
        executor.execute(new Runnable() { // from class: m3.e
            @Override // java.lang.Runnable
            public final void run() {
                pVar.onResult(l0Var);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, final p pVar, final Exception exc) {
        executor.execute(new Runnable() { // from class: m3.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3$lambda$2(pVar, exc);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(p pVar, Exception exc) {
        pVar.a(exc instanceof s ? (n) exc : new q(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, f3.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, f3.q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, f3.q] */
    public static final void invokePlayServices$lambda$8(CancellationSignal cancellationSignal, final Executor executor, final p pVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final c0 c0Var = new c0();
        c0Var.f22552a = new q("Get restore credential failed for unknown reason, failure: " + e10.getMessage());
        if (e10 instanceof b) {
            b bVar = (b) e10;
            if (bVar.b() == 40201) {
                c0Var.f22552a = new q("The restore credential internal service had a failure, failure: " + e10.getMessage());
            } else {
                c0Var.f22552a = new q("The restore credential service failed with unsupported status code, failure: " + e10.getMessage() + ", status code: " + bVar.b());
            }
        }
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: m3.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7(executor, pVar, c0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, final p pVar, final c0 c0Var) {
        executor.execute(new Runnable() { // from class: m3.g
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(pVar, c0Var);
            }
        });
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(p pVar, c0 c0Var) {
        pVar.a(c0Var.f22552a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetRestoreCredentialRequest convertRequestToPlayServices(@NotNull k0 request) {
        r rVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<r> it = request.a().iterator();
        do {
            rVar = null;
            if (!it.hasNext()) {
                break;
            }
        } while (!(it.next() instanceof q0));
        Intrinsics.u("credentialOption");
        return new GetRestoreCredentialRequest(rVar.getRequestData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public l0 convertResponseToCredentialManager(@NotNull GetRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new l0(m.INSTANCE.b("androidx.credentials.TYPE_RESTORE_CREDENTIAL", response.getResponseBundle()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull k0 request, @NotNull final p<l0, n> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<GetRestoreCredentialResponse> taskG = e.a(this.context).g(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: m3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4(this.f23900a, cancellationSignal, executor, callback, (GetRestoreCredentialResponse) obj);
            }
        };
        taskG.g(new g() { // from class: m3.b
            @Override // sb.g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).e(new f() { // from class: m3.c
            @Override // sb.f
            public final void onFailure(Exception exc) {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8(cancellationSignal, executor, callback, exc);
            }
        });
    }
}

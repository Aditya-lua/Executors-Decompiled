package androidx.credentials.playservices.controllers.blockstore.createrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4753c;
import p092e3.C4769k;
import p092e3.C4771l;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.C5336j;
import p123f9.C5493e;
import p143g3.C5978d;
import p185i3.C6634a;
import p185i3.C6635b;
import p242k9.C7492b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Le3/k;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Le3/c;", "Lf3/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Le3/p;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Le3/k;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Le3/k;)Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", Payload.RESPONSE, "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Le3/c;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<C4769k, CreateRestoreCredentialRequest, CreateRestoreCredentialResponse, AbstractC4753c, AbstractC5332f> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, CreateRestoreCredentialResponse createRestoreCredentialResponse) {
        try {
            Intrinsics.checkNotNull(createRestoreCredentialResponse);
            final AbstractC4753c abstractC4753cConvertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(createRestoreCredentialResponse);
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: l3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$1(executor, interfaceC4779p, abstractC4753cConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e10) {
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: l3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$3(executor, interfaceC4779p, e10);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$1(Executor executor, final InterfaceC4779p interfaceC4779p, final AbstractC4753c abstractC4753c) {
        executor.execute(new Runnable() { // from class: l3.a
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4779p.onResult(abstractC4753c);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, final InterfaceC4779p interfaceC4779p, final Exception exc) {
        executor.execute(new Runnable() { // from class: l3.e
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$3$lambda$2(interfaceC4779p, exc);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(InterfaceC4779p interfaceC4779p, Exception exc) {
        interfaceC4779p.mo7535a(new C5336j(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, f3.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, f3.j] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, i3.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, f3.j] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, i3.b] */
    public static final void invokePlayServices$lambda$8(CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4779p interfaceC4779p, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = new C5336j("Create restore credential failed for unknown reason, failure: " + e10.getMessage());
        if (e10 instanceof C7492b) {
            C7492b c7492b = (C7492b) e10;
            switch (c7492b.m31131b()) {
                case 40201:
                    c7729c0.f29425a = new C5336j("The restore credential internal service had a failure, failure: " + e10.getMessage());
                    break;
                case 40202:
                    c7729c0.f29425a = new C6634a(new C5978d(), "The request did not match the fido spec, failure: " + e10.getMessage());
                    break;
                case 40203:
                    c7729c0.f29425a = new C6635b("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    c7729c0.f29425a = new C5336j("The restore credential service failed with unsupported status code, failure: " + e10.getMessage() + ", status code: " + c7492b.m31131b());
                    break;
            }
        }
        CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, new Function0() { // from class: l3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$8$lambda$7(executor, interfaceC4779p, c7729c0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, final InterfaceC4779p interfaceC4779p, final C7729c0 c7729c0) {
        executor.execute(new Runnable() { // from class: l3.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(interfaceC4779p, c7729c0);
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
    public CreateRestoreCredentialRequest convertRequestToPlayServices(@NotNull C4769k request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateRestoreCredentialRequest(request.getCredentialData());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public AbstractC4753c convertResponseToCredentialManager(@NotNull CreateRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return C4771l.INSTANCE.m23197a(response.getResponseBundle());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invokePlayServices(Ljava/lang/Object;Le3/p;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull C4769k request, @NotNull final InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<CreateRestoreCredentialResponse> taskMo25148v = C5493e.m25146a(this.context).mo25148v(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: l3.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4(this.f29900a, cancellationSignal, executor, callback, (CreateRestoreCredentialResponse) obj);
            }
        };
        taskMo25148v.mo11893g(new InterfaceC11256g() { // from class: l3.g
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: l3.h
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$8(cancellationSignal, executor, callback, exc);
            }
        });
    }
}

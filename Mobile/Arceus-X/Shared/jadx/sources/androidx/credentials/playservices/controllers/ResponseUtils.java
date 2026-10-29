package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.ResponseUtils;
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
import p092e3.C4772l0;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5340n;
import p117f3.C5343q;
import p320o3.C9632a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils;", "", "<init>", "()V", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class ResponseUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GetCredentialController";

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;", "", "<init>", "()V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Le3/l0;", "Lf3/n;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "handleGetCredentialResponse", "(IILandroid/content/Intent;Ljava/util/concurrent/Executor;Le3/p;Landroid/os/CancellationSignal;)V", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.ResponseUtils.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, Function0 f10) {
            Intrinsics.checkNotNullParameter(f10, "f");
            CredentialProviderController.INSTANCE.m3299xd7d57380(cancellationSignal, f10);
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$2(Executor executor, final InterfaceC4779p interfaceC4779p, final AbstractC5340n e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            executor.execute(new Runnable() { // from class: k3.m
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4779p.mo7535a(e10);
                }
            });
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$4(Executor executor, final InterfaceC4779p interfaceC4779p) {
            executor.execute(new Runnable() { // from class: k3.e
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$lambda$3(interfaceC4779p);
                }
            });
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$lambda$3(InterfaceC4779p interfaceC4779p) {
            interfaceC4779p.mo7535a(new C5343q("No provider data returned."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$6(Executor executor, final InterfaceC4779p interfaceC4779p, final C4772l0 c4772l0) {
            executor.execute(new Runnable() { // from class: k3.g
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4779p.onResult(c4772l0);
                }
            });
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$8(Executor executor, final InterfaceC4779p interfaceC4779p, final AbstractC5340n abstractC5340n) {
            executor.execute(new Runnable() { // from class: k3.f
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$8$lambda$7(interfaceC4779p, abstractC5340n);
                }
            });
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$8$lambda$7(InterfaceC4779p interfaceC4779p, AbstractC5340n abstractC5340n) {
            if (abstractC5340n == null) {
                abstractC5340n = new C5343q("No provider data returned");
            }
            interfaceC4779p.mo7535a(abstractC5340n);
        }

        public final void handleGetCredentialResponse(int uniqueRequestCode, int resultCode, @Nullable Intent data, @NotNull final Executor executor, @NotNull final InterfaceC4779p<C4772l0, AbstractC5340n> callback, @Nullable CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
            if (uniqueRequestCode != companion.m3295xa2b31783()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + companion.m3295xa2b31783() + " which  does not match what was given " + uniqueRequestCode);
                return;
            }
            CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
            if (companion2.m3302x7474352d(resultCode, new Function2() { // from class: k3.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
                }
            }, new Function1() { // from class: k3.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, callback, (AbstractC5340n) obj);
                }
            }, cancellationSignal)) {
                return;
            }
            if (data == null) {
                companion2.m3299xd7d57380(cancellationSignal, new Function0() { // from class: k3.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, callback);
                    }
                });
                return;
            }
            C9632a.Companion companion3 = C9632a.INSTANCE;
            final C4772l0 c4772l0M38014d = companion3.m38014d(data);
            if (c4772l0M38014d != null) {
                companion2.m3299xd7d57380(cancellationSignal, new Function0() { // from class: k3.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$6(executor, callback, c4772l0M38014d);
                    }
                });
            } else {
                final AbstractC5340n abstractC5340nM38013c = companion3.m38013c(data);
                companion2.m3299xd7d57380(cancellationSignal, new Function0() { // from class: k3.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$8(executor, callback, abstractC5340nM38013c);
                    }
                });
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final void handleGetCredentialResponse(int i10, int i11, @Nullable Intent intent, @NotNull Executor executor, @NotNull InterfaceC4779p<C4772l0, AbstractC5340n> interfaceC4779p, @Nullable CancellationSignal cancellationSignal) {
        INSTANCE.handleGetCredentialResponse(i10, i11, intent, executor, interfaceC4779p, cancellationSignal);
    }
}

package com.roblox.protocols.externalidentity;

import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityCapabilities;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityProofType;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityProvider;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityRequest;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityResult;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityStatus;
import com.roblox.protocols.externalidentityplatforminterface.generated.IExternalIdentityCoreListener;
import com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import fm.d;
import fm.g;
import gk.k;
import java.lang.ref.WeakReference;
import jt.l;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import ku.p0;
import ku.q0;
import ku.z2;
import nu.h;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001dJS\u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0004J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104J\u0017\u00107\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b7\u00104J\u0017\u00108\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0015J\u001f\u0010;\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010\u0015R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR(\u0010S\u001a\u00020R8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010\u0004\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;", "<init>", "()V", "", "url", "", "onAppleRedirectReceived", "(Ljava/lang/String;)Z", "Lj/b;", "foregroundActivity", "", "bringHostToFront", "(Lj/b;)V", "", "operationId", "idToken", "onGoogleProofSuccess", "(JLjava/lang/String;)V", "onAppleDismissedWithoutRedirect", "(J)V", "errorClassName", "onAppleLaunchFailed", "onGoogleProofCancelled", "onGoogleProofError", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "provider", "beginInFlight", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;", "status", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;", "proofType", "errorClass", "completeInFlight", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V", "cancelInFlight", "durationMs", "emitProofResult", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V", "inFlightDurationMs", "()J", "clearInFlightTrackers", "abortInFlightProof", "reportUnavailable", "isGoogleSignInAvailable", "()Z", "isAppleSignInAvailable", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onPause", "onDestroy", "getCapabilities", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;", "request", "acquireProof", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V", "cancel", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;", "core", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;", "Ljava/lang/ref/WeakReference;", "activityWeakRef", "Ljava/lang/ref/WeakReference;", "Lku/p0;", "scope", "Lku/p0;", "Lku/d2;", "runningJob", "Lku/d2;", "Lfm/d;", "appleSession", "Lfm/d;", "inFlightProofProvider", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "inFlightOperationId", "Ljava/lang/Long;", "inFlightStartedAtElapsedMs", "Lkl/a;", "eventReporter", "Lkl/a;", "getEventReporter$universalapp_googleProdRelease", "()Lkl/a;", "setEventReporter$universalapp_googleProdRelease", "(Lkl/a;)V", "getEventReporter$universalapp_googleProdRelease$annotations", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalIdentityHandler extends IPlatformExternalIdentity implements f {

    @Nullable
    private static WeakReference<j.b> activityWeakRef;

    @Nullable
    private static d appleSession;

    @Nullable
    private static IExternalIdentityCoreListener core;

    @Nullable
    private static Long inFlightOperationId;

    @Nullable
    private static ExternalIdentityProvider inFlightProofProvider;

    @Nullable
    private static Long inFlightStartedAtElapsedMs;

    @Nullable
    private static d2 runningJob;

    @NotNull
    public static final ExternalIdentityHandler INSTANCE = new ExternalIdentityHandler();

    @NotNull
    private static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.c().getImmediate()));

    @NotNull
    private static kl.a eventReporter = kl.f.f22321a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9696a;

        static {
            int[] iArr = new int[ExternalIdentityProvider.values().length];
            try {
                iArr[ExternalIdentityProvider.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalIdentityProvider.APPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9696a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.protocols.externalidentity.ExternalIdentityHandler$acquireProof$1", f = "ExternalIdentityHandler.kt", l = {103}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9697t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9698u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ExternalIdentityRequest f9699v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f9700w;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f9701a;

            public a(long j10) {
                this.f9701a = j10;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(g gVar, nt.b<? super Unit> bVar) {
                if (!Intrinsics.c(gVar, g.c.f16844a)) {
                    if (Intrinsics.c(gVar, g.a.f16842a)) {
                        ExternalIdentityHandler.INSTANCE.onGoogleProofCancelled(this.f9701a);
                    } else if (gVar instanceof g.Error) {
                        ExternalIdentityHandler.INSTANCE.onGoogleProofError(this.f9701a, ((g.Error) gVar).getErrorName());
                    } else {
                        if (!(gVar instanceof g.Success)) {
                            throw new l();
                        }
                        ExternalIdentityHandler.INSTANCE.onGoogleProofSuccess(this.f9701a, ((g.Success) gVar).getIdToken());
                    }
                }
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.b bVar, ExternalIdentityRequest externalIdentityRequest, long j10, nt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f9698u = bVar;
            this.f9699v = externalIdentityRequest;
            this.f9700w = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f9698u, this.f9699v, this.f9700w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f9697t;
            if (i10 == 0) {
                o.b(obj);
                fm.f fVar = new fm.f(this.f9698u);
                String nonce = this.f9699v.getNonce();
                Intrinsics.checkNotNullExpressionValue(nonce, "getNonce(...)");
                h<g> hVarC = fVar.c(nonce);
                a aVar = new a(this.f9700w);
                this.f9697t = 1;
                if (hVarC.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    private ExternalIdentityHandler() {
    }

    private final void abortInFlightProof() {
        Long l10 = inFlightOperationId;
        ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
        if (l10 != null && externalIdentityProvider != null) {
            cancelInFlight(l10.longValue(), externalIdentityProvider);
            return;
        }
        d2 d2Var = runningJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        runningJob = null;
        clearInFlightTrackers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acquireProof$lambda$1(long j10) {
        INSTANCE.onAppleDismissedWithoutRedirect(j10);
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acquireProof$lambda$2(long j10, String errorClassName) {
        Intrinsics.checkNotNullParameter(errorClassName, "errorClassName");
        INSTANCE.onAppleLaunchFailed(j10, errorClassName);
        return Unit.f22483a;
    }

    private final void beginInFlight(long operationId, ExternalIdentityProvider provider) {
        inFlightOperationId = Long.valueOf(operationId);
        inFlightProofProvider = provider;
        inFlightStartedAtElapsedMs = Long.valueOf(SystemClock.elapsedRealtime());
        eventReporter.b(provider);
    }

    public static final void bringHostToFront(@NotNull j.b foregroundActivity) {
        j.b bVar;
        Intrinsics.checkNotNullParameter(foregroundActivity, "foregroundActivity");
        WeakReference<j.b> weakReference = activityWeakRef;
        if (weakReference == null || (bVar = weakReference.get()) == null || bVar.isFinishing() || bVar.isDestroyed()) {
            return;
        }
        Intent intentAddFlags = new Intent(foregroundActivity, bVar.getClass()).addFlags(603979776);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        foregroundActivity.startActivity(intentAddFlags);
    }

    private final void cancelInFlight(long operationId, ExternalIdentityProvider provider) {
        emitProofResult$default(this, operationId, provider, ExternalIdentityStatus.CANCELLED, inFlightDurationMs(), null, null, null, 112, null);
        d2 d2Var = runningJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        runningJob = null;
        clearInFlightTrackers();
    }

    private final void clearInFlightTrackers() {
        d dVar = appleSession;
        if (dVar != null) {
            dVar.e();
        }
        appleSession = null;
        inFlightProofProvider = null;
        inFlightOperationId = null;
        inFlightStartedAtElapsedMs = null;
    }

    private final void completeInFlight(long operationId, ExternalIdentityProvider provider, ExternalIdentityStatus status, ExternalIdentityProofType proofType, String errorClass, String idToken) {
        emitProofResult(operationId, provider, status, inFlightDurationMs(), proofType, errorClass, idToken);
        runningJob = null;
        clearInFlightTrackers();
    }

    public static /* synthetic */ void completeInFlight$default(ExternalIdentityHandler externalIdentityHandler, long j10, ExternalIdentityProvider externalIdentityProvider, ExternalIdentityStatus externalIdentityStatus, ExternalIdentityProofType externalIdentityProofType, String str, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            externalIdentityProofType = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        externalIdentityHandler.completeInFlight(j10, externalIdentityProvider, externalIdentityStatus, externalIdentityProofType, str, str2);
    }

    private final void emitProofResult(long operationId, ExternalIdentityProvider provider, ExternalIdentityStatus status, long durationMs, ExternalIdentityProofType proofType, String errorClass, String idToken) {
        eventReporter.a(provider, kl.f.f22321a.j(status), errorClass, durationMs);
        IExternalIdentityCoreListener iExternalIdentityCoreListener = core;
        if (iExternalIdentityCoreListener != null) {
            iExternalIdentityCoreListener.onProofResult(operationId, new ExternalIdentityResult(provider, status, proofType, errorClass), idToken);
        }
    }

    public static /* synthetic */ void emitProofResult$default(ExternalIdentityHandler externalIdentityHandler, long j10, ExternalIdentityProvider externalIdentityProvider, ExternalIdentityStatus externalIdentityStatus, long j11, ExternalIdentityProofType externalIdentityProofType, String str, String str2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            externalIdentityProofType = null;
        }
        if ((i10 & 32) != 0) {
            str = null;
        }
        if ((i10 & 64) != 0) {
            str2 = null;
        }
        externalIdentityHandler.emitProofResult(j10, externalIdentityProvider, externalIdentityStatus, j11, externalIdentityProofType, str, str2);
    }

    public static /* synthetic */ void getEventReporter$universalapp_googleProdRelease$annotations() {
    }

    private final long inFlightDurationMs() {
        Long l10 = inFlightStartedAtElapsedMs;
        if (l10 == null) {
            return 0L;
        }
        return kotlin.ranges.d.d(SystemClock.elapsedRealtime() - l10.longValue(), 0L);
    }

    private final boolean isAppleSignInAvailable() {
        return th.h.a().I1();
    }

    private final boolean isGoogleSignInAvailable() {
        j.b bVar;
        WeakReference<j.b> weakReference = activityWeakRef;
        return ((weakReference == null || (bVar = weakReference.get()) == null) ? false : k.a(bVar)) && th.h.a().s5();
    }

    private final void onAppleDismissedWithoutRedirect(long operationId) {
        Long l10 = inFlightOperationId;
        if (l10 != null && l10.longValue() == operationId && inFlightProofProvider == ExternalIdentityProvider.APPLE) {
            cancel(operationId);
        }
    }

    private final void onAppleLaunchFailed(long operationId, String errorClassName) {
        Long l10 = inFlightOperationId;
        if (l10 != null && l10.longValue() == operationId) {
            ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
            ExternalIdentityProvider externalIdentityProvider2 = ExternalIdentityProvider.APPLE;
            if (externalIdentityProvider != externalIdentityProvider2) {
                return;
            }
            completeInFlight$default(this, operationId, externalIdentityProvider2, ExternalIdentityStatus.FAILED, null, errorClassName, null, 40, null);
        }
    }

    public static final boolean onAppleRedirectReceived(@Nullable String url) {
        Long l10 = inFlightOperationId;
        ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
        if (l10 == null || externalIdentityProvider != ExternalIdentityProvider.APPLE) {
            return false;
        }
        if (url == null || url.length() == 0 || !JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(url)) {
            completeInFlight$default(INSTANCE, l10.longValue(), externalIdentityProvider, ExternalIdentityStatus.FAILED, null, "Apple sign in failed or missing ticket", null, 40, null);
            return true;
        }
        km.f.v().e(url);
        completeInFlight$default(INSTANCE, l10.longValue(), externalIdentityProvider, ExternalIdentityStatus.SUCCESS, ExternalIdentityProofType.SESSIONESTABLISHED, null, null, 48, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGoogleProofCancelled(long operationId) {
        Long l10 = inFlightOperationId;
        if (l10 != null && l10.longValue() == operationId) {
            completeInFlight$default(this, operationId, ExternalIdentityProvider.GOOGLE, ExternalIdentityStatus.CANCELLED, null, null, null, 56, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGoogleProofError(long operationId, String errorClassName) {
        Long l10 = inFlightOperationId;
        if (l10 != null && l10.longValue() == operationId) {
            completeInFlight$default(this, operationId, ExternalIdentityProvider.GOOGLE, ExternalIdentityStatus.FAILED, null, errorClassName, null, 40, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGoogleProofSuccess(long operationId, String idToken) {
        Long l10 = inFlightOperationId;
        if (l10 != null && l10.longValue() == operationId) {
            completeInFlight$default(this, operationId, ExternalIdentityProvider.GOOGLE, ExternalIdentityStatus.SUCCESS, ExternalIdentityProofType.IDTOKEN, null, idToken, 16, null);
        }
    }

    private final void reportUnavailable(long operationId, ExternalIdentityProvider provider) {
        emitProofResult$default(this, operationId, provider, ExternalIdentityStatus.UNAVAILABLE, 0L, null, null, null, 112, null);
    }

    @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
    public void acquireProof(long operationId, @NotNull ExternalIdentityRequest request) {
        j.b bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        WeakReference<j.b> weakReference = activityWeakRef;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            ExternalIdentityProvider provider = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider, "getProvider(...)");
            reportUnavailable(operationId, provider);
            return;
        }
        abortInFlightProof();
        ExternalIdentityProvider provider2 = request.getProvider();
        int i10 = provider2 == null ? -1 : a.f9696a[provider2.ordinal()];
        if (i10 == 1) {
            if (!isGoogleSignInAvailable()) {
                ExternalIdentityProvider provider3 = request.getProvider();
                Intrinsics.checkNotNullExpressionValue(provider3, "getProvider(...)");
                reportUnavailable(operationId, provider3);
                return;
            } else {
                ExternalIdentityProvider provider4 = request.getProvider();
                Intrinsics.checkNotNullExpressionValue(provider4, "getProvider(...)");
                beginInFlight(operationId, provider4);
                runningJob = ku.k.d(scope, null, null, new b(bVar, request, operationId, null), 3, null);
                return;
            }
        }
        if (i10 != 2) {
            throw new l();
        }
        if (!isAppleSignInAvailable()) {
            ExternalIdentityProvider provider5 = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider5, "getProvider(...)");
            reportUnavailable(operationId, provider5);
        } else {
            ExternalIdentityProvider provider6 = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider6, "getProvider(...)");
            beginInFlight(operationId, provider6);
            d dVar = new d(operationId, new fm.a(bVar), scope, new Function1() { // from class: kl.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExternalIdentityHandler.acquireProof$lambda$1(((Long) obj).longValue());
                }
            }, new Function2() { // from class: kl.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExternalIdentityHandler.acquireProof$lambda$2(((Long) obj).longValue(), (String) obj2);
                }
            });
            appleSession = dVar;
            dVar.k(request.getBrowserStartUrl());
        }
    }

    @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
    public void cancel(long operationId) {
        ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
        Long l10 = inFlightOperationId;
        if (l10 == null || l10.longValue() != operationId || externalIdentityProvider == null) {
            return;
        }
        cancelInFlight(operationId, externalIdentityProvider);
    }

    @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
    public void getCapabilities(long operationId) {
        ExternalIdentityCapabilities externalIdentityCapabilities = new ExternalIdentityCapabilities(isGoogleSignInAvailable(), isAppleSignInAvailable());
        IExternalIdentityCoreListener iExternalIdentityCoreListener = core;
        if (iExternalIdentityCoreListener != null) {
            iExternalIdentityCoreListener.onCapabilitiesResult(operationId, externalIdentityCapabilities);
        }
    }

    @NotNull
    public final kl.a getEventReporter$universalapp_googleProdRelease() {
        return eventReporter;
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        core = IExternalIdentityCoreListener.setPlatformImpl(this);
        j.b bVar = owner instanceof j.b ? (j.b) owner : null;
        if (bVar != null) {
            activityWeakRef = new WeakReference<>(bVar);
        }
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Long l10 = inFlightOperationId;
        ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
        if (l10 == null || externalIdentityProvider == null) {
            d2 d2Var = runningJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            runningJob = null;
        } else {
            cancelInFlight(l10.longValue(), externalIdentityProvider);
        }
        core = null;
        WeakReference<j.b> weakReference = activityWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityWeakRef = null;
        clearInFlightTrackers();
    }

    @Override // androidx.p000lifecycle.f
    public void onPause(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d dVar = appleSession;
        if (dVar != null) {
            dVar.h();
        }
    }

    @Override // androidx.p000lifecycle.f
    public void onResume(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d dVar = appleSession;
        if (dVar != null) {
            dVar.i();
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    public final void setEventReporter$universalapp_googleProdRelease(@NotNull kl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        eventReporter = aVar;
    }
}

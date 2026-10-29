package com.roblox.protocols.externalidentity;

import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
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
import fm.AbstractC5670g;
import fm.C5664a;
import fm.C5667d;
import fm.C5669f;
import java.lang.ref.WeakReference;
import km.C7635f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6119l;
import p203j.ActivityC6992b;
import p229jt.C7345l;
import p229jt.C7348o;
import p250kl.C7629f;
import p250kl.InterfaceC7624a;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001dJS\u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0004J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104J\u0017\u00107\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b7\u00104J\u0017\u00108\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0015J\u001f\u0010;\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010\u0015R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR(\u0010S\u001a\u00020R8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010\u0004\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006Z"}, m31665d2 = {"Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;", "<init>", "()V", "", "url", "", "onAppleRedirectReceived", "(Ljava/lang/String;)Z", "Lj/b;", "foregroundActivity", "", "bringHostToFront", "(Lj/b;)V", "", "operationId", "idToken", "onGoogleProofSuccess", "(JLjava/lang/String;)V", "onAppleDismissedWithoutRedirect", "(J)V", "errorClassName", "onAppleLaunchFailed", "onGoogleProofCancelled", "onGoogleProofError", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "provider", "beginInFlight", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;", NotificationCompat.CATEGORY_STATUS, "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;", "proofType", "errorClass", "completeInFlight", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V", "cancelInFlight", "durationMs", "emitProofResult", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V", "inFlightDurationMs", "()J", "clearInFlightTrackers", "abortInFlightProof", "reportUnavailable", "isGoogleSignInAvailable", "()Z", "isAppleSignInAvailable", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onPause", "onDestroy", "getCapabilities", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;", "request", "acquireProof", "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V", "cancel", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;", "core", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;", "Ljava/lang/ref/WeakReference;", "activityWeakRef", "Ljava/lang/ref/WeakReference;", "Lku/p0;", "scope", "Lku/p0;", "Lku/d2;", "runningJob", "Lku/d2;", "Lfm/d;", "appleSession", "Lfm/d;", "inFlightProofProvider", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "inFlightOperationId", "Ljava/lang/Long;", "inFlightStartedAtElapsedMs", "Lkl/a;", "eventReporter", "Lkl/a;", "getEventReporter$universalapp_googleProdRelease", "()Lkl/a;", "setEventReporter$universalapp_googleProdRelease", "(Lkl/a;)V", "getEventReporter$universalapp_googleProdRelease$annotations", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ExternalIdentityHandler extends IPlatformExternalIdentity implements InterfaceC0954f {

    @Nullable
    private static WeakReference<ActivityC6992b> activityWeakRef;

    @Nullable
    private static C5667d appleSession;

    @Nullable
    private static IExternalIdentityCoreListener core;

    @Nullable
    private static Long inFlightOperationId;

    @Nullable
    private static ExternalIdentityProvider inFlightProofProvider;

    @Nullable
    private static Long inFlightStartedAtElapsedMs;

    @Nullable
    private static InterfaceC7850d2 runningJob;

    @NotNull
    public static final ExternalIdentityHandler INSTANCE = new ExternalIdentityHandler();

    @NotNull
    private static final InterfaceC7906p0 scope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32645c().getImmediate()));

    @NotNull
    private static InterfaceC7624a eventReporter = C7629f.f29139a;

    /* JADX INFO: renamed from: com.roblox.protocols.externalidentity.ExternalIdentityHandler$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3324a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12641a;

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
            f12641a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.externalidentity.ExternalIdentityHandler$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.externalidentity.ExternalIdentityHandler$acquireProof$1", m39664f = "ExternalIdentityHandler.kt", m39665l = {103}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3325b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12642t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC6992b f12643u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ExternalIdentityRequest f12644v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ long f12645w;

        /* JADX INFO: renamed from: com.roblox.protocols.externalidentity.ExternalIdentityHandler$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f12646a;

            public a(long j10) {
                this.f12646a = j10;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC5670g abstractC5670g, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (!Intrinsics.m31980c(abstractC5670g, AbstractC5670g.c.f21766a)) {
                    if (Intrinsics.m31980c(abstractC5670g, AbstractC5670g.a.f21764a)) {
                        ExternalIdentityHandler.INSTANCE.onGoogleProofCancelled(this.f12646a);
                    } else if (abstractC5670g instanceof AbstractC5670g.Error) {
                        ExternalIdentityHandler.INSTANCE.onGoogleProofError(this.f12646a, ((AbstractC5670g.Error) abstractC5670g).getErrorName());
                    } else {
                        if (!(abstractC5670g instanceof AbstractC5670g.Success)) {
                            throw new C7345l();
                        }
                        ExternalIdentityHandler.INSTANCE.onGoogleProofSuccess(this.f12646a, ((AbstractC5670g.Success) abstractC5670g).getIdToken());
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3325b(ActivityC6992b activityC6992b, ExternalIdentityRequest externalIdentityRequest, long j10, InterfaceC9557b<? super C3325b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12643u = activityC6992b;
            this.f12644v = externalIdentityRequest;
            this.f12645w = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3325b(this.f12643u, this.f12644v, this.f12645w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12642t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5669f c5669f = new C5669f(this.f12643u);
                String nonce = this.f12644v.getNonce();
                Intrinsics.checkNotNullExpressionValue(nonce, "getNonce(...)");
                InterfaceC9575h<AbstractC5670g> interfaceC9575hM25735c = c5669f.m25735c(nonce);
                a aVar = new a(this.f12645w);
                this.f12642t = 1;
                if (interfaceC9575hM25735c.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3325b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
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
        InterfaceC7850d2 interfaceC7850d2 = runningJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        runningJob = null;
        clearInFlightTrackers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acquireProof$lambda$1(long j10) {
        INSTANCE.onAppleDismissedWithoutRedirect(j10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acquireProof$lambda$2(long j10, String errorClassName) {
        Intrinsics.checkNotNullParameter(errorClassName, "errorClassName");
        INSTANCE.onAppleLaunchFailed(j10, errorClassName);
        return Unit.f29331a;
    }

    private final void beginInFlight(long operationId, ExternalIdentityProvider provider) {
        inFlightOperationId = Long.valueOf(operationId);
        inFlightProofProvider = provider;
        inFlightStartedAtElapsedMs = Long.valueOf(SystemClock.elapsedRealtime());
        eventReporter.mo31505b(provider);
    }

    public static final void bringHostToFront(@NotNull ActivityC6992b foregroundActivity) {
        ActivityC6992b activityC6992b;
        Intrinsics.checkNotNullParameter(foregroundActivity, "foregroundActivity");
        WeakReference<ActivityC6992b> weakReference = activityWeakRef;
        if (weakReference == null || (activityC6992b = weakReference.get()) == null || activityC6992b.isFinishing() || activityC6992b.isDestroyed()) {
            return;
        }
        Intent intentAddFlags = new Intent(foregroundActivity, activityC6992b.getClass()).addFlags(603979776);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        foregroundActivity.startActivity(intentAddFlags);
    }

    private final void cancelInFlight(long operationId, ExternalIdentityProvider provider) {
        emitProofResult$default(this, operationId, provider, ExternalIdentityStatus.CANCELLED, inFlightDurationMs(), null, null, null, 112, null);
        InterfaceC7850d2 interfaceC7850d2 = runningJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        runningJob = null;
        clearInFlightTrackers();
    }

    private final void clearInFlightTrackers() {
        C5667d c5667d = appleSession;
        if (c5667d != null) {
            c5667d.m25724e();
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
        eventReporter.mo31504a(provider, C7629f.f29139a.m31513j(status), errorClass, durationMs);
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
        return C7764d.m32079d(SystemClock.elapsedRealtime() - l10.longValue(), 0L);
    }

    private final boolean isAppleSignInAvailable() {
        return C11659h.m43403a().mo43503O1();
    }

    private final boolean isGoogleSignInAvailable() {
        ActivityC6992b activityC6992b;
        WeakReference<ActivityC6992b> weakReference = activityWeakRef;
        return ((weakReference == null || (activityC6992b = weakReference.get()) == null) ? false : C6119l.m27042a(activityC6992b)) && C11659h.m43403a().mo43763y5();
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
        C7635f.m31524D().m31543k(url);
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
        ActivityC6992b activityC6992b;
        Intrinsics.checkNotNullParameter(request, "request");
        WeakReference<ActivityC6992b> weakReference = activityWeakRef;
        if (weakReference == null || (activityC6992b = weakReference.get()) == null) {
            ExternalIdentityProvider provider = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider, "getProvider(...)");
            reportUnavailable(operationId, provider);
            return;
        }
        abortInFlightProof();
        ExternalIdentityProvider provider2 = request.getProvider();
        int i10 = provider2 == null ? -1 : C3324a.f12641a[provider2.ordinal()];
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
                runningJob = C7882k.m32780d(scope, null, null, new C3325b(activityC6992b, request, operationId, null), 3, null);
                return;
            }
        }
        if (i10 != 2) {
            throw new C7345l();
        }
        if (!isAppleSignInAvailable()) {
            ExternalIdentityProvider provider5 = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider5, "getProvider(...)");
            reportUnavailable(operationId, provider5);
        } else {
            ExternalIdentityProvider provider6 = request.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider6, "getProvider(...)");
            beginInFlight(operationId, provider6);
            C5667d c5667d = new C5667d(operationId, new C5664a(activityC6992b), scope, new Function1() { // from class: kl.b
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
            appleSession = c5667d;
            c5667d.m25730k(request.getBrowserStartUrl());
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
    public final InterfaceC7624a getEventReporter$universalapp_googleProdRelease() {
        return eventReporter;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        core = IExternalIdentityCoreListener.setPlatformImpl(this);
        ActivityC6992b activityC6992b = owner instanceof ActivityC6992b ? (ActivityC6992b) owner : null;
        if (activityC6992b != null) {
            activityWeakRef = new WeakReference<>(activityC6992b);
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Long l10 = inFlightOperationId;
        ExternalIdentityProvider externalIdentityProvider = inFlightProofProvider;
        if (l10 == null || externalIdentityProvider == null) {
            InterfaceC7850d2 interfaceC7850d2 = runningJob;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            runningJob = null;
        } else {
            cancelInFlight(l10.longValue(), externalIdentityProvider);
        }
        core = null;
        WeakReference<ActivityC6992b> weakReference = activityWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityWeakRef = null;
        clearInFlightTrackers();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onPause(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C5667d c5667d = appleSession;
        if (c5667d != null) {
            c5667d.m25727h();
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onResume(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C5667d c5667d = appleSession;
        if (c5667d != null) {
            c5667d.m25728i();
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }

    public final void setEventReporter$universalapp_googleProdRelease(@NotNull InterfaceC7624a interfaceC7624a) {
        Intrinsics.checkNotNullParameter(interfaceC7624a, "<set-?>");
        eventReporter = interfaceC7624a;
    }
}

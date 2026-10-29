package com.roblox.universalapp.facialageestimation;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import j.b;
import java.lang.reflect.InvocationTargetException;
import jt.h;
import jt.i;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.c;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\tJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;", "Landroidx/lifecycle/f;", "Lcom/roblox/universalapp/facialageestimation/a$a;", "<init>", "()V", "", "stateName", "", "logFAECounter", "(Ljava/lang/String;)V", "", "nativeListenerPtr", "setListener", "(J)V", "", "isAvailable", "()Z", "isInInquiryFlow", "inquiryId", "sessionToken", "startInquiry", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "onComplete", "onCancel", "debugMessage", "onError", "TAG", "Ljava/lang/String;", "Ljava/lang/Long;", "Lcom/roblox/universalapp/facialageestimation/a;", "personaSdk", "Lcom/roblox/universalapp/facialageestimation/a;", "Z", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "faeCounter$delegate", "Ljt/h;", "getFaeCounter", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "faeCounter", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FacialAgeEstimationProtocol implements f, a.InterfaceC0155a {

    @NotNull
    private static final String TAG = "FacialAgeEstimationProtocol";
    private static boolean isInInquiryFlow;

    @Nullable
    private static Long nativeListenerPtr;

    @Nullable
    private static a personaSdk;

    @NotNull
    public static final FacialAgeEstimationProtocol INSTANCE = new FacialAgeEstimationProtocol();

    /* JADX INFO: renamed from: faeCounter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h faeCounter = i.b(new Function0() { // from class: gm.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FacialAgeEstimationProtocol.faeCounter_delegate$lambda$0();
        }
    });

    private FacialAgeEstimationProtocol() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TelemetryConfig faeCounter_delegate$lambda$0() {
        c cVar = c.f31236a;
        c.a aVar = new c.a("fae_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2025, 10, 23);
        aVar.a("Facial age estimation related counters");
        return aVar.d();
    }

    private final TelemetryConfig getFaeCounter() {
        return (TelemetryConfig) faeCounter.getValue();
    }

    private final void logFAECounter(String stateName) {
        TelemetryConfig faeCounter2 = getFaeCounter();
        c cVar = c.f31236a;
        c.b bVar = new c.b();
        bVar.c("state", stateName);
        c.g(faeCounter2, bVar.l(), 0.0d, 4, null);
    }

    @Keep
    public final boolean isAvailable() {
        return personaSdk != null;
    }

    public final boolean isInInquiryFlow() {
        return isInInquiryFlow;
    }

    @Override // com.roblox.universalapp.facialageestimation.a.InterfaceC0155a
    public void onCancel(@NotNull String inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Log.i(TAG, "Inquiry canceled: " + inquiryId);
        isInInquiryFlow = false;
        Long l10 = nativeListenerPtr;
        if (l10 != null) {
            JNIInquiryResultListener.onCancel(l10.longValue(), inquiryId);
            INSTANCE.logFAECounter("fae_inquiry_canceled");
        } else {
            logFAECounter("fae_null_native_listener");
            Log.e(TAG, "Native listener pointer is null");
        }
    }

    @Override // com.roblox.universalapp.facialageestimation.a.InterfaceC0155a
    public void onComplete(@NotNull String inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Log.i(TAG, "Inquiry completed: " + inquiryId);
        isInInquiryFlow = false;
        Long l10 = nativeListenerPtr;
        if (l10 != null) {
            JNIInquiryResultListener.onComplete(l10.longValue(), inquiryId);
            INSTANCE.logFAECounter("fae_inquiry_completed");
        } else {
            Log.e(TAG, "Native listener pointer is null");
            logFAECounter("fae_null_native_listener");
        }
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b bVar = owner instanceof b ? (b) owner : null;
        if (bVar == null) {
            return;
        }
        try {
            Object objNewInstance = Class.forName("com.roblox.client.personasdk.PersonaActivityResultLauncher").getConstructor(null).newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.roblox.universalapp.facialageestimation.PersonaSdk");
            a aVar = (a) objNewInstance;
            aVar.onActivityCreated(bVar);
            personaSdk = aVar;
        } catch (Exception e10) {
            if (e10 instanceof ClassNotFoundException) {
                Log.e(TAG, "Class not found: " + e10.getMessage());
                return;
            }
            if (e10 instanceof NoSuchMethodException) {
                Log.e(TAG, "No such method: " + e10.getMessage());
                return;
            }
            if ((e10 instanceof IllegalAccessException) || (e10 instanceof InvocationTargetException) || (e10 instanceof InstantiationException)) {
                Log.e(TAG, "Failed to create PersonaActivityResultLauncher instance: " + e10.getMessage());
                return;
            }
            Log.e(TAG, "Unknown error: " + e10.getMessage());
        }
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        personaSdk = null;
        isInInquiryFlow = false;
    }

    @Override // com.roblox.universalapp.facialageestimation.a.InterfaceC0155a
    public void onError(@NotNull String inquiryId, @NotNull String debugMessage) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        Log.e(TAG, "Inquiry error: " + inquiryId + ", debug message: " + debugMessage);
        isInInquiryFlow = false;
        Long l10 = nativeListenerPtr;
        if (l10 == null) {
            logFAECounter("fae_null_native_listener");
        } else {
            JNIInquiryResultListener.onError(l10.longValue(), inquiryId, debugMessage);
            INSTANCE.logFAECounter("fae_inquiry_error");
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    @Keep
    public final void setListener(long nativeListenerPtr2) {
        nativeListenerPtr = Long.valueOf(nativeListenerPtr2);
    }

    @Keep
    public final void startInquiry(@NotNull String inquiryId, @NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        a aVar = personaSdk;
        if (aVar != null) {
            isInInquiryFlow = true;
            FacialAgeEstimationProtocol facialAgeEstimationProtocol = INSTANCE;
            aVar.launchInquiry(inquiryId, sessionToken, facialAgeEstimationProtocol);
            facialAgeEstimationProtocol.logFAECounter("fae_launch_inquiry");
            return;
        }
        Log.e(TAG, "PersonaSdk is not initialized");
        Long l10 = nativeListenerPtr;
        if (l10 != null) {
            JNIInquiryResultListener.onError(l10.longValue(), inquiryId, "PersonaSdk is not initialized");
        } else {
            logFAECounter("fae_null_native_listener");
            Log.e(TAG, "Native listener pointer is null");
        }
        logFAECounter("fae_sdk_not_initialized");
    }
}

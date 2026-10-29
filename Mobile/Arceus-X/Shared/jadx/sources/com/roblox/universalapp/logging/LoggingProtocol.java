package com.roblox.universalapp.logging;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.C8675j;
import mu.InterfaceC8672g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004.\u0018\u0016\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006R(\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010)\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,¨\u0006/"}, m31665d2 = {"Lcom/roblox/universalapp/logging/LoggingProtocol;", "", "<init>", "()V", "", "getProcessTimestamp", "()J", "", "eventName", "systemClockTime", "", "l", "(Ljava/lang/String;Ljava/lang/Long;)V", "timestamp", "h", "(Ljava/lang/String;J)V", "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", NotificationCompat.CATEGORY_EVENT, "j", "(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V", "d", "f", "c", "(Lnt/b;)Ljava/lang/Object;", "b", "Ljt/h;", "e", "processStartTime", "Lku/p0;", "Lku/p0;", "getScope$universalapp_googleProdRelease", "()Lku/p0;", "setScope$universalapp_googleProdRelease", "(Lku/p0;)V", "getScope$universalapp_googleProdRelease$annotations", "scope", "Lkotlin/concurrent/atomics/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getConsumerStarted$universalapp_googleProdRelease", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getConsumerStarted$universalapp_googleProdRelease$annotations", "consumerStarted", "Lmu/g;", "Lcom/roblox/universalapp/logging/LoggingProtocol$a;", "Lmu/g;", "channel", "a", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class LoggingProtocol {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LoggingProtocol f12748a = new LoggingProtocol();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h processStartTime = C7342i.m30456b(new Function0() { // from class: lm.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(LoggingProtocol.m16001n());
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC7906p0 scope = C7910q0.m32885a(C7864g1.m32643a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean consumerStarted = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC8672g<InterfaceC3355a> channel = C8675j.m34927b(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m31665d2 = {"Lcom/roblox/universalapp/logging/LoggingProtocol$a;", "", "Lcom/roblox/universalapp/logging/LoggingProtocol$b;", "Lcom/roblox/universalapp/logging/LoggingProtocol$c;", "Lcom/roblox/universalapp/logging/LoggingProtocol$d;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3355a {
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/roblox/universalapp/logging/LoggingProtocol$b;", "Lcom/roblox/universalapp/logging/LoggingProtocol$a;", "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", "eventData", "<init>", "(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", "()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class PendingRobloxTelemetryEvent implements InterfaceC3355a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final RobloxTelemetryEvent eventData;

        public PendingRobloxTelemetryEvent(@NotNull RobloxTelemetryEvent eventData) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.eventData = eventData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RobloxTelemetryEvent getEventData() {
            return this.eventData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingRobloxTelemetryEvent) && Intrinsics.m31980c(this.eventData, ((PendingRobloxTelemetryEvent) other).eventData);
        }

        public int hashCode() {
            return this.eventData.hashCode();
        }

        @NotNull
        public String toString() {
            return "PendingRobloxTelemetryEvent(eventData=" + this.eventData + ")";
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/roblox/universalapp/logging/LoggingProtocol$c;", "Lcom/roblox/universalapp/logging/LoggingProtocol$a;", "", "eventName", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class PendingTimestampEvent implements InterfaceC3355a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long timestamp;

        public PendingTimestampEvent(@NotNull String eventName, long j10) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.eventName = eventName;
            this.timestamp = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingTimestampEvent)) {
                return false;
            }
            PendingTimestampEvent pendingTimestampEvent = (PendingTimestampEvent) other;
            return Intrinsics.m31980c(this.eventName, pendingTimestampEvent.eventName) && this.timestamp == pendingTimestampEvent.timestamp;
        }

        public int hashCode() {
            return (this.eventName.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "PendingTimestampEvent(eventName=" + this.eventName + ", timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$d, reason: from toString */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/roblox/universalapp/logging/LoggingProtocol$d;", "Lcom/roblox/universalapp/logging/LoggingProtocol$a;", "", "eventName", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class RawTimestampEvent implements InterfaceC3355a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long timestamp;

        public RawTimestampEvent(@NotNull String eventName, long j10) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.eventName = eventName;
            this.timestamp = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawTimestampEvent)) {
                return false;
            }
            RawTimestampEvent rawTimestampEvent = (RawTimestampEvent) other;
            return Intrinsics.m31980c(this.eventName, rawTimestampEvent.eventName) && this.timestamp == rawTimestampEvent.timestamp;
        }

        public int hashCode() {
            return (this.eventName.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "RawTimestampEvent(eventName=" + this.eventName + ", timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$e */
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.logging.LoggingProtocol", m39664f = "LoggingProtocol.kt", m39665l = {115}, m39666m = "consumeEvents", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3359e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f12758t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12759u;

        /* JADX INFO: renamed from: w */
        public int f12761w;

        public C3359e(InterfaceC9557b<? super C3359e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12759u = obj;
            this.f12761w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return LoggingProtocol.this.m16002c(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.logging.LoggingProtocol$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.logging.LoggingProtocol$flushPendingEvents$1", m39664f = "LoggingProtocol.kt", m39665l = {109}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3360f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12762t;

        public C3360f(InterfaceC9557b<? super C3360f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3360f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12762t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                LoggingProtocol loggingProtocol = LoggingProtocol.f12748a;
                this.f12762t = 1;
                if (loggingProtocol.m16002c(this) == objM38805e) {
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
            return ((C3360f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m15993d() {
        if (consumerStarted.compareAndSet(false, true)) {
            C7882k.m32780d(scope, null, null, new C3360f(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m15994g(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        m15996i(eventName, 0L, 2, null);
    }

    @Keep
    public static final long getProcessTimestamp() {
        return SystemClock.elapsedRealtime() - f12748a.m16003e();
    }

    /* JADX INFO: renamed from: h */
    public static final void m15995h(@NotNull String eventName, long timestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        channel.mo34870w(new RawTimestampEvent(eventName, timestamp));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15996i(String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        m15995h(str, j10);
    }

    /* JADX INFO: renamed from: j */
    public static final void m15997j(@NotNull RobloxTelemetryEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        channel.mo34870w(new PendingRobloxTelemetryEvent(event));
    }

    /* JADX INFO: renamed from: k */
    public static final void m15998k(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        m16000m(eventName, null, 2, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m15999l(@NotNull String eventName, @Nullable Long systemClockTime) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        channel.mo34870w(new PendingTimestampEvent(eventName, systemClockTime != null ? systemClockTime.longValue() : SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16000m(String str, Long l10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        m15999l(str, l10);
    }

    /* JADX INFO: renamed from: n */
    public static final long m16001n() {
        return Process.getStartElapsedRealtime();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0099
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m16002c(p315nt.InterfaceC9557b<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.roblox.universalapp.logging.LoggingProtocol.C3359e
            if (r0 == 0) goto L13
            r0 = r11
            com.roblox.universalapp.logging.LoggingProtocol$e r0 = (com.roblox.universalapp.logging.LoggingProtocol.C3359e) r0
            int r1 = r0.f12761w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12761w = r1
            goto L18
        L13:
            com.roblox.universalapp.logging.LoggingProtocol$e r0 = new com.roblox.universalapp.logging.LoggingProtocol$e
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f12759u
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f12761w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f12758t
            mu.i r2 = (mu.InterfaceC8674i) r2
            p229jt.C7348o.m30470b(r11)
            goto L4a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            p229jt.C7348o.m30470b(r11)
            mu.g<com.roblox.universalapp.logging.LoggingProtocol$a> r11 = com.roblox.universalapp.logging.LoggingProtocol.channel
            mu.i r11 = r11.iterator()
            r2 = r11
        L3f:
            r0.f12758t = r2
            r0.f12761w = r3
            java.lang.Object r11 = r2.mo34879a(r0)
            if (r11 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9f
            java.lang.Object r11 = r2.next()
            com.roblox.universalapp.logging.LoggingProtocol$a r11 = (com.roblox.universalapp.logging.LoggingProtocol.InterfaceC3355a) r11
            boolean r4 = r11 instanceof com.roblox.universalapp.logging.LoggingProtocol.PendingRobloxTelemetryEvent
            if (r4 == 0) goto L66
            com.roblox.universalapp.logging.LoggingProtocol$b r11 = (com.roblox.universalapp.logging.LoggingProtocol.PendingRobloxTelemetryEvent) r11
            com.roblox.engine.jni.autovalue.RobloxTelemetryEvent r11 = r11.getEventData()
            com.roblox.universalapp.logging.JNILoggingProtocol.nativeLogRobloxTelemetryEvent(r11)
            goto L3f
        L66:
            boolean r4 = r11 instanceof com.roblox.universalapp.logging.LoggingProtocol.PendingTimestampEvent
            r5 = 0
            if (r4 == 0) goto L85
            com.roblox.universalapp.logging.LoggingProtocol$c r11 = (com.roblox.universalapp.logging.LoggingProtocol.PendingTimestampEvent) r11
            java.lang.String r4 = r11.getEventName()
            long r6 = r11.getTimestamp()
            long r8 = r10.m16004f()
            long r6 = r6 + r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r8
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.roblox.universalapp.logging.JNILoggingProtocol.m15990a(r4, r6, r11)
            goto L3f
        L85:
            boolean r4 = r11 instanceof com.roblox.universalapp.logging.LoggingProtocol.RawTimestampEvent
            if (r4 == 0) goto L99
            com.roblox.universalapp.logging.LoggingProtocol$d r11 = (com.roblox.universalapp.logging.LoggingProtocol.RawTimestampEvent) r11
            java.lang.String r4 = r11.getEventName()
            long r6 = r11.getTimestamp()
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.roblox.universalapp.logging.JNILoggingProtocol.m15990a(r4, r6, r11)
            goto L3f
        L99:
            jt.l r11 = new jt.l
            r11.<init>()
            throw r11
        L9f:
            kotlin.Unit r11 = kotlin.Unit.f29331a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.universalapp.logging.LoggingProtocol.m16002c(nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final long m16003e() {
        return ((Number) processStartTime.getValue()).longValue();
    }

    /* JADX INFO: renamed from: f */
    public final long m16004f() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(Long.valueOf(JNILoggingProtocol.nativeGetTimestamp()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) != null) {
            Log.e("LoggingProtocol", "Calling into the game engine before linking to the library.");
            objM30460b = 0L;
        }
        return ((Number) objM30460b).longValue();
    }
}

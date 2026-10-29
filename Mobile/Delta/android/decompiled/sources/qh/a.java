package qh;

import android.util.Pair;
import backtraceio.library.services.BacktraceMetrics;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqh/a;", "", "<init>", "()V", "", "callSite", "", "initNeeded", "", "initDurationMs", "", "a", "(Ljava/lang/String;ZJ)V", "latencyMs", "authorizeForUser", "c", "(JZ)V", "eventName", "", "Landroid/util/Pair;", "fields", "b", "(Ljava/lang/String;Ljava/util/List;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29395a = new a();

    public static final void a(@NotNull String callSite, boolean initNeeded, long initDurationMs) {
        Intrinsics.checkNotNullParameter(callSite, "callSite");
        f29395a.b("firebase_deferred_init", p.n(Pair.create("call_site", callSite), Pair.create("init_needed", String.valueOf(initNeeded)), Pair.create("init_ms", String.valueOf(initDurationMs))));
    }

    public static final void c(long latencyMs, boolean authorizeForUser) {
        f29395a.b("fcm_token_registration", p.n(Pair.create("latency_ms", String.valueOf(latencyMs)), Pair.create("authorize_for_user", String.valueOf(authorizeForUser))));
    }

    public final void b(String eventName, List<? extends Pair<String, String>> fields) {
        if (h.a().P5()) {
            RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(BacktraceMetrics.defaultTimeBetweenRetriesMs).setEventName(eventName).build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(fields).build()).build();
            Intrinsics.checkNotNullExpressionValue(robloxTelemetryEventBuild, "build(...)");
            LoggingProtocol.j(robloxTelemetryEventBuild);
        }
    }
}

package sg;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lsg/b;", "phase", "", "result", "", "e", "(Lsg/b;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Lgt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final gt.h f31323a = gt.i.b(new Function0() { // from class: sg.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.d();
        }
    });

    public static final TelemetryConfig c() {
        return (TelemetryConfig) f31323a.getValue();
    }

    public static final TelemetryConfig d() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("RewardedVideoGetQueryInfoResult", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(rh.h.a().c6()));
        aVar.b(2026, 8, 11);
        aVar.a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.d();
    }

    public static final void e(b bVar, String str) {
        TelemetryConfig telemetryConfigC = c();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar2 = new qm.c.b();
        bVar2.a(p.n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar2.c("phase", bVar.getValue());
        if (str != null) {
            bVar2.c("result", str);
        }
        qm.c.h(telemetryConfigC, bVar2.l());
    }

    public static /* synthetic */ void f(b bVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        e(bVar, str);
    }
}

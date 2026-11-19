package ch;

import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.collections.p0;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lch/b;", "phase", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "e", "(Lch/b;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Lzt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zt.h f5265a = zt.i.a(new Function0() { // from class: ch.k
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.d();
        }
    });

    public static final TelemetryConfig c() {
        return (TelemetryConfig) f5265a.getValue();
    }

    public static final TelemetryConfig d() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("RewardedVideoGetQueryInfoResult", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(bi.h.a().b6()));
        aVar.b(2026, 8, 11);
        aVar.a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.d();
    }

    public static final void e(b bVar, String str) {
        TelemetryConfig telemetryConfigC = c();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar2 = new fn.c.b();
        bVar2.a(p.n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar2.c("phase", bVar.getValue());
        if (str != null) {
            bVar2.c("result", str);
        }
        fn.c.h(telemetryConfigC, bVar2.l());
    }

    public static /* synthetic */ void f(b bVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        e(bVar, str);
    }
}

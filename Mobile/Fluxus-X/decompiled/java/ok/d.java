package ok;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import ob.ze;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static void a(String str) {
        fn.c.h(new fn.c.a("JavaAssetReadEvent", ze.a(new Object[]{TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS})).j(2025, 10, 23).i("New JavaAssetReadEvent").k(bi.h.a().a0()).d(), new fn.c.b().b("assetPathRaw", str).h(TelemetryStandardizedField.ADD_OS_INFO).l());
    }
}

package ek;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import nb.qe;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static void a(String str) {
        qm.c.h(new qm.c.a("JavaAssetReadEvent", qe.a(new Object[]{TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS})).j(2025, 10, 23).i("New JavaAssetReadEvent").k(rh.h.a().Y()).d(), new qm.c.b().b("assetPathRaw", str).h(TelemetryStandardizedField.ADD_OS_INFO).l());
    }
}

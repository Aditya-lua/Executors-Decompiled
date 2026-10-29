package p151gk;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import p306nb.C9261qe;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: gk.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6109d {
    /* JADX INFO: renamed from: a */
    public static void m27018a(String str) {
        C11416c.m42772h(new C11416c.a("JavaAssetReadEvent", C9261qe.m36724a(new Object[]{TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS})).m42780j(2025, 10, 23).m42779i("New JavaAssetReadEvent").m42781k(C11659h.m43403a().mo43577Z()).m42774d(), new C11416c.b().mo42758b("assetPathRaw", str).mo42764h(TelemetryStandardizedField.ADD_OS_INFO).m42785l());
    }
}

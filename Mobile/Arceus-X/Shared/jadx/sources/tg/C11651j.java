package tg;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: tg.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Ltg/b;", "phase", "", "result", "", "e", "(Ltg/b;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11651j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC7341h f41210a = C7342i.m30456b(new Function0() { // from class: tg.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11651j.m43381d();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final TelemetryConfig m43380c() {
        return (TelemetryConfig) f41210a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final TelemetryConfig m43381d() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("RewardedVideoGetQueryInfoResult", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43583Z5()));
        aVar.mo42755b(2026, 8, 11);
        aVar.mo42754a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: e */
    public static final void m43382e(EnumC11643b enumC11643b, String str) {
        TelemetryConfig telemetryConfigM43380c = m43380c();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42757a(C7699p.m31895n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar.mo42759c("phase", enumC11643b.getValue());
        if (str != null) {
            bVar.mo42759c("result", str);
        }
        C11416c.m42772h(telemetryConfigM43380c, bVar.m42785l());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m43383f(EnumC11643b enumC11643b, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        m43382e(enumC11643b, str);
    }
}

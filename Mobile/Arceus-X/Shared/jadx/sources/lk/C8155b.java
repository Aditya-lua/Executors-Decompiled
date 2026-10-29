package lk;

import com.roblox.client.datastructures.NameValuePair;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sm.C11416c;
import vg.C12183m;

/* JADX INFO: renamed from: lk.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a9\u0010\f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\"\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"", "d", "()V", "Lvg/m;", "", "widgetType", "Llk/f;", "widgetAction", "widgetSize", "Llk/g;", "widgetLocation", "widgetId", "b", "(Lvg/m;Ljava/lang/String;Llk/f;Ljava/lang/String;Llk/g;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "recentlyPlayedActiveWidgetCounter", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8155b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC7341h f30305a = C7342i.m30456b(new Function0() { // from class: lk.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C8155b.m33432e();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final void m33429b(@NotNull C12183m c12183m, @NotNull String widgetType, @NotNull EnumC8159f widgetAction, @NotNull String widgetSize, @NotNull EnumC8160g widgetLocation, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(c12183m, "<this>");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetAction, "widgetAction");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        Intrinsics.checkNotNullParameter(widgetLocation, "widgetLocation");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        C12183m.m45108c("androidMobileWidgetAction", "widgetAction", C7699p.m31895n(new NameValuePair("widgetType", widgetType), new NameValuePair("widgetAction", widgetAction.name()), new NameValuePair("widgetSize", widgetSize), new NameValuePair("widgetLocation", widgetLocation.name()), new NameValuePair("widgetId", widgetId)), false);
    }

    /* JADX INFO: renamed from: c */
    public static final TelemetryConfig m33430c() {
        return (TelemetryConfig) f30305a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final void m33431d() {
        C11416c.m42770f(m33430c(), 0.0d, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final TelemetryConfig m33432e() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("recently_played_active_widget_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 4, 15);
        aVar.mo42754a("Counts when device has at least one Recently Played Widget");
        return aVar.m42774d();
    }
}

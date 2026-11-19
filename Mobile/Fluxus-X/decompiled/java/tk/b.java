package tk;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import eh.o;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.collections.p0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import zt.h;
import zt.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a9\u0010\f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\"\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {BuildConfig.FLAVOR, "d", "()V", "Leh/o;", BuildConfig.FLAVOR, "widgetType", "Ltk/f;", "widgetAction", "widgetSize", "Ltk/g;", "widgetLocation", "widgetId", "b", "(Leh/o;Ljava/lang/String;Ltk/f;Ljava/lang/String;Ltk/g;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Lzt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "recentlyPlayedActiveWidgetCounter", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f32502a = i.a(new Function0() { // from class: tk.a
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.e();
        }
    });

    public static final void b(@NotNull o oVar, @NotNull String widgetType, @NotNull f widgetAction, @NotNull String widgetSize, @NotNull g widgetLocation, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetAction, "widgetAction");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        Intrinsics.checkNotNullParameter(widgetLocation, "widgetLocation");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        o.c("androidMobileWidgetAction", "widgetAction", p.n(new NameValuePair("widgetType", widgetType), new NameValuePair("widgetAction", widgetAction.name()), new NameValuePair("widgetSize", widgetSize), new NameValuePair("widgetLocation", widgetLocation.name()), new NameValuePair("widgetId", widgetId)), false);
    }

    public static final TelemetryConfig c() {
        return (TelemetryConfig) f32502a.getValue();
    }

    public static final void d() {
        fn.c.f(c(), 0.0d, 2, null);
    }

    public static final TelemetryConfig e() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("recently_played_active_widget_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("Counts when device has at least one Recently Played Widget");
        return aVar.d();
    }
}

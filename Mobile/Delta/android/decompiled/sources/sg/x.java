package sg;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsg/x;", "Ltk/d$b;", "<init>", "()V", "", "moduleID", "functionName", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "nativeAndroidHybridModuleCommandCounter", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements tk.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h nativeAndroidHybridModuleCommandCounter = jt.i.b(new Function0() { // from class: sg.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x.d();
        }
    });

    public static final TelemetryConfig d() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("NativeAndroidHybridModuleCommandCounter", kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2025, 10, 22);
        aVar.a("Counter for commands handle by Hybrid Modules on Android");
        return aVar.d();
    }

    @Override // tk.d.b
    public void a(@Nullable String moduleID, @Nullable String functionName) {
        if (moduleID == null && functionName == null) {
            return;
        }
        TelemetryConfig telemetryConfigC = c();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        if (moduleID != null) {
            bVar.c("moduleId", moduleID);
        }
        if (functionName != null) {
            bVar.c("functionName", functionName);
        }
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        sm.c.g(telemetryConfigC, bVar.l(), 0.0d, 4, null);
    }

    public final TelemetryConfig c() {
        return (TelemetryConfig) this.nativeAndroidHybridModuleCommandCounter.getValue();
    }
}

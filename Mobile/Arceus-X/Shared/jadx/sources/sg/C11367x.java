package sg;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sm.C11416c;
import tk.C11669d;

/* JADX INFO: renamed from: sg.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lsg/x;", "Ltk/d$b;", "<init>", "()V", "", "moduleID", "functionName", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "nativeAndroidHybridModuleCommandCounter", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11367x implements C11669d.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h nativeAndroidHybridModuleCommandCounter = C7342i.m30456b(new Function0() { // from class: sg.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11367x.m42574d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final TelemetryConfig m42574d() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("NativeAndroidHybridModuleCommandCounter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2025, 10, 22);
        aVar.mo42754a("Counter for commands handle by Hybrid Modules on Android");
        return aVar.m42774d();
    }

    @Override // tk.C11669d.b
    /* JADX INFO: renamed from: a */
    public void mo42575a(@Nullable String moduleID, @Nullable String functionName) {
        if (moduleID == null && functionName == null) {
            return;
        }
        TelemetryConfig telemetryConfigM42576c = m42576c();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        if (moduleID != null) {
            bVar.mo42759c("moduleId", moduleID);
        }
        if (functionName != null) {
            bVar.mo42759c("functionName", functionName);
        }
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42771g(telemetryConfigM42576c, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final TelemetryConfig m42576c() {
        return (TelemetryConfig) this.nativeAndroidHybridModuleCommandCounter.getValue();
    }
}

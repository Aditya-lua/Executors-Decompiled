package sm;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sm.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH¦\u0004¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH¦\u0004¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 À\u0006\u0003"}, m31665d2 = {"Lsm/b;", "", "", "", "value", "", "e", "(Ljava/lang/String;Z)V", "", "f", "(Ljava/lang/String;I)V", "", "g", "(Ljava/lang/String;J)V", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;", "field", "h", "(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;)Lsm/b;", "", "fields", "a", "(Ljava/lang/Iterable;)Lsm/b;", "key", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lsm/b;", "getEventContext", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "eventContext", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11415b {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC11415b mo42757a(@NotNull Iterable<? extends TelemetryStandardizedField> fields);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC11415b mo42758b(@NotNull String key, @NotNull Object value);

    /* JADX INFO: renamed from: c */
    void mo42759c(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: d */
    void mo42760d(@Nullable String str);

    /* JADX INFO: renamed from: e */
    void mo42761e(@NotNull String str, boolean z10);

    /* JADX INFO: renamed from: f */
    void mo42762f(@NotNull String str, int i10);

    /* JADX INFO: renamed from: g */
    void mo42763g(@NotNull String str, long j10);

    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC11415b mo42764h(@NotNull TelemetryStandardizedField field);
}

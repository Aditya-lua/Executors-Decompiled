package p499vr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vr.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lvr/h;", "", "name", "Lvr/b;", "", "a", "(Lvr/h;Ljava/lang/String;)Lvr/b;", "workflows_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12256g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NamedWorkflowWorker<Object> m45423a(@NotNull InterfaceC12257h<?> interfaceC12257h, @NotNull String name) {
        Intrinsics.checkNotNullParameter(interfaceC12257h, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return new NamedWorkflowWorker<>(name, interfaceC12257h);
    }
}

package or;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lor/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lor/a;", "componentNameToComponentView", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, ComponentView> componentNameToComponentView;

    public k(@NotNull Map<String, ComponentView> componentNameToComponentView) {
        Intrinsics.checkNotNullParameter(componentNameToComponentView, "componentNameToComponentView");
        this.componentNameToComponentView = componentNameToComponentView;
    }

    @NotNull
    public final Map<String, ComponentView> a() {
        return this.componentNameToComponentView;
    }
}

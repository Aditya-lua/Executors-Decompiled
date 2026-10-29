package ar;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ar.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m31665d2 = {"Lar/a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "Landroid/view/View;", "view", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Landroid/view/View;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "c", "Landroid/view/View;", "d", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ComponentView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final UiComponent component;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final View view;

    public ComponentView(@NotNull UiComponent component, @NotNull View view) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(view, "view");
        this.component = component;
        this.view = view;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final UiComponent getComponent() {
        return this.component;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final UiComponent m6490c() {
        return this.component;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m6491d() {
        return this.view;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentView)) {
            return false;
        }
        ComponentView componentView = (ComponentView) other;
        return Intrinsics.m31980c(this.component, componentView.component) && Intrinsics.m31980c(this.view, componentView.view);
    }

    public int hashCode() {
        return (this.component.hashCode() * 31) + this.view.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComponentView(component=" + this.component + ", view=" + this.view + ")";
    }
}

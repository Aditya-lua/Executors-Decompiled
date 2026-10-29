package mr;

import android.content.Context;
import android.view.View;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import cr.InterfaceC4341x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mr.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lmr/b;", "Landroid/view/View;", "Lmr/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "", "componentParams", "", "triggeringComponentIsHidden", "uiStateValues", "", "a", "(Ljava/util/Map;ZLjava/util/Map;)V", "", "Ljava/lang/ref/WeakReference;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/List;", "getAssociatedComponents", "()Ljava/util/List;", "associatedComponents", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8650b extends View implements InterfaceC8649a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<WeakReference<UiComponent>> associatedComponents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8650b(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.associatedComponents = new ArrayList();
    }

    @Override // mr.InterfaceC8649a
    /* JADX INFO: renamed from: a */
    public void mo34727a(@NotNull Map<String, ? extends Object> componentParams, boolean triggeringComponentIsHidden, @NotNull Map<String, ? extends Object> uiStateValues) {
        boolean zBooleanValue;
        Boolean value;
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        Intrinsics.checkNotNullParameter(uiStateValues, "uiStateValues");
        if (triggeringComponentIsHidden) {
            setVisibility(8);
            return;
        }
        Iterator<T> it = this.associatedComponents.iterator();
        loop0: while (true) {
            zBooleanValue = false;
            while (it.hasNext()) {
                UiComponent uiComponent = (UiComponent) ((WeakReference) it.next()).get();
                InterfaceC4341x interfaceC4341x = uiComponent instanceof InterfaceC4341x ? (InterfaceC4341x) uiComponent : null;
                JsonLogicBoolean hidden = interfaceC4341x != null ? interfaceC4341x.getHidden() : null;
                if (hidden != null && (value = hidden.getValue(componentParams, uiComponent, uiStateValues)) != null) {
                    zBooleanValue = value.booleanValue();
                }
            }
            break loop0;
        }
        setVisibility(zBooleanValue ? 8 : 0);
    }

    @NotNull
    public final List<WeakReference<UiComponent>> getAssociatedComponents() {
        return this.associatedComponents;
    }
}

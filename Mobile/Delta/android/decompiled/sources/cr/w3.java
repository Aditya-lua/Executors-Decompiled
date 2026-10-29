package cr;

import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001d\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcr/w3;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "k", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ler/m;", "a", "()Ler/m;", "selectedOptionsController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w3<T extends UiComponent> {
    @NotNull
    er.m a();

    @NotNull
    T k(@NotNull List<Option> selectedOptions);
}

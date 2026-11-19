package qr;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lqr/y5;", "Lqr/x5;", BuildConfig.FLAVOR, "newChildren", "s1", "(Ljava/util/List;)Lqr/y5;", "getChildren", "()Ljava/util/List;", "children", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lqr/a0;", "Lqr/i0;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y5 extends x5 {
    @NotNull
    List<x5> getChildren();

    @NotNull
    y5 s1(@NotNull List<? extends x5> newChildren);
}

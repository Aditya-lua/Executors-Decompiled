package ts;

import com.github.luben.zstd.BuildConfig;
import ms.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lts/f;", "Lts/a;", BuildConfig.FLAVOR, "expression", "operationData", "Lms/l;", "evaluator", "Lkotlin/Function2;", "Lts/b;", "arrayOperation", "i", "(Ljava/lang/Object;Ljava/lang/Object;Lms/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends a {
    @Nullable
    default Object i(@Nullable Object expression, @Nullable Object operationData, @NotNull l evaluator, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> arrayOperation) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(arrayOperation, "arrayOperation");
        return arrayOperation.invoke(e(kt.a.c(expression), operationData, evaluator), evaluator);
    }
}

package ds;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lds/f;", "Lds/a;", "", "expression", "operationData", "Lwr/l;", "evaluator", "Lkotlin/Function2;", "Lds/b;", "arrayOperation", "h", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends a {
    @Nullable
    default Object h(@Nullable Object expression, @Nullable Object operationData, @NotNull l evaluator, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> arrayOperation) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(arrayOperation, "arrayOperation");
        return arrayOperation.invoke(l(ts.a.c(expression), operationData, evaluator), evaluator);
    }
}

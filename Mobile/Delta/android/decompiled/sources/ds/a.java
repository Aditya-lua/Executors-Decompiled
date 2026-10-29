package ds;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lds/a;", "Lss/a;", "", "", "expressionValues", "operationData", "Lwr/l;", "evaluator", "Lds/b;", "l", "(Ljava/util/List;Ljava/lang/Object;Lwr/l;)Lds/b;", "", "", "mappingOperation", "a", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends ss.a {
    @Nullable
    default Object a(@Nullable Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        if (mappingOperation == null) {
            return ts.c.b(expressionValues);
        }
        return null;
    }

    @NotNull
    default ArrayOperationInputData l(@NotNull List<? extends Object> expressionValues, @Nullable Object operationData, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<Object> listM = m(expressionValues, operationData, evaluator);
        Map<String, ? extends Object> mapA = ts.c.a(expressionValues);
        return new ArrayOperationInputData(listM, mapA, a(mapA, expressionValues));
    }
}

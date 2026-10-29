package p085ds;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11746c;
import p527wr.InterfaceC12555l;
import ss.InterfaceC11450a;

/* JADX INFO: renamed from: ds.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m31665d2 = {"Lds/a;", "Lss/a;", "", "", "expressionValues", "operationData", "Lwr/l;", "evaluator", "Lds/b;", "l", "(Ljava/util/List;Ljava/lang/Object;Lwr/l;)Lds/b;", "", "", "mappingOperation", "a", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4680a extends InterfaceC11450a {
    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo22971a(@Nullable Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        if (mappingOperation == null) {
            return C11746c.m43979b(expressionValues);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    default ArrayOperationInputData mo22972l(@NotNull List<? extends Object> expressionValues, @Nullable Object operationData, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<Object> listMo22979m = mo22979m(expressionValues, operationData, evaluator);
        Map<String, ? extends Object> mapM43978a = C11746c.m43978a(expressionValues);
        return new ArrayOperationInputData(listMo22979m, mapM43978a, mo22971a(mapM43978a, expressionValues));
    }
}

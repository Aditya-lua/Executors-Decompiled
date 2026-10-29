package p085ds;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: ds.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lds/f;", "Lds/a;", "", "expression", "operationData", "Lwr/l;", "evaluator", "Lkotlin/Function2;", "Lds/b;", "arrayOperation", "h", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4685f extends InterfaceC4680a {
    @Nullable
    /* JADX INFO: renamed from: h */
    default Object mo22978h(@Nullable Object expression, @Nullable Object operationData, @NotNull InterfaceC12555l evaluator, @NotNull Function2<? super ArrayOperationInputData, ? super InterfaceC12555l, ? extends Object> arrayOperation) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(arrayOperation, "arrayOperation");
        return arrayOperation.invoke(mo22972l(C11744a.m43971c(expression), operationData, evaluator), evaluator);
    }
}

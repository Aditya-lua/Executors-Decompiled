package ls;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: ls.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lls/d;", "", "expression", "Lkotlin/Function1;", "", "", "operation", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8248d {
    @Nullable
    /* JADX INFO: renamed from: c */
    default Double mo33626c(@Nullable Object expression, @NotNull Function1<? super List<Double>, Double> operation) {
        List listA0;
        Intrinsics.checkNotNullParameter(operation, "operation");
        List<Double> listM43970b = expression != null ? C11744a.m43970b(expression) : null;
        List listA1 = listM43970b != null ? CollectionsKt.m31703a0(listM43970b) : null;
        if (!Intrinsics.m31980c(listA1 != null ? Integer.valueOf(listA1.size()) : null, listM43970b != null ? Integer.valueOf(listM43970b.size()) : null) || listM43970b == null || (listA0 = CollectionsKt.m31703a0(listM43970b)) == null) {
            return null;
        }
        return operation.invoke(listA0);
    }
}

package cs;

import bs.ArrayOperationInputData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ur.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcs/b;", "Lzr/a;", "Lcs/e;", "<init>", "()V", "", "expression", "data", "Lur/l;", "evaluator", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lur/l;)Ljava/lang/Object;", "", "", "mappingOperation", "", "expressionValues", "", "a", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;", "Lcs/c;", "i", "(Lcs/c;Lur/l;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements zr.a, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f14216a = new b();

    @Override // cs.e, bs.a
    public /* bridge */ /* synthetic */ Object a(Map map, List list) {
        return a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }

    @Override // is.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // bs.f
    @Nullable
    public Object d(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> function2) {
        return super.d(obj, obj2, lVar, function2);
    }

    @Override // cs.e
    @Nullable
    public Object e(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar) {
        return super.e(obj, obj2, lVar);
    }

    @Override // bs.a
    @NotNull
    public ArrayOperationInputData g(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.g(list, obj, lVar);
    }

    @Override // qs.a
    @Nullable
    public List<Object> h(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.h(list, obj, lVar);
    }

    @Override // cs.e
    @Nullable
    public Object i(@NotNull OccurrenceCheckInputData data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.b().iterator();
        while (it.hasNext()) {
            if (f14216a.b(evaluator.a(data.a(), it.next()))) {
                return Boolean.FALSE;
            }
        }
        return data.getOperationDefault();
    }

    @Override // zr.a
    @Nullable
    public Object j(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return e(expression, data, evaluator);
    }

    @Override // cs.e, bs.a
    @NotNull
    public Boolean a(@Nullable Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        return Boolean.TRUE;
    }
}

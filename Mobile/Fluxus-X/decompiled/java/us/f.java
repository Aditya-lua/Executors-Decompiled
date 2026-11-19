package us;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ms.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import ts.ArrayOperationInputData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lus/f;", "Lrs/a;", "Lus/e;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "Lms/l;", "evaluator", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lms/l;)Ljava/lang/Object;", "Lus/c;", "f", "(Lus/c;Lms/l;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements rs.a, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f33948a = new f();

    @Override // us.e, ts.a
    @NotNull
    public Boolean a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.a(map, list);
    }

    @Override // at.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // us.e
    @Nullable
    public Object c(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar) {
        return super.c(obj, obj2, lVar);
    }

    @Override // ts.a
    @NotNull
    public ArrayOperationInputData e(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.e(list, obj, lVar);
    }

    @Override // us.e
    @Nullable
    public Object f(@NotNull OccurrenceCheckInputData data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.b().iterator();
        while (it.hasNext()) {
            if (f33948a.b(evaluator.a(data.a(), it.next()))) {
                return Boolean.TRUE;
            }
        }
        return data.getOperationDefault();
    }

    @Override // ts.f
    @Nullable
    public Object i(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> function2) {
        return super.i(obj, obj2, lVar, function2);
    }

    @Override // rs.a
    @Nullable
    public Object j(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return c(expression, data, evaluator);
    }

    @Override // jt.a
    @Nullable
    public List<Object> l(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.l(list, obj, lVar);
    }

    @Override // us.e, ts.a
    public /* bridge */ /* synthetic */ Object a(Map map, List list) {
        return a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }
}

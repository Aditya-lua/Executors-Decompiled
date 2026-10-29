package ds;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.collections.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lds/e;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "(Ljava/util/List;)Ljava/util/List;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements bs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f14879a = new e();

    public final List<Object> a(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            u.z(arrayList, obj instanceof List ? (List) obj : o.d(obj));
        }
        return arrayList;
    }

    @Override // bs.b
    @NotNull
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return a(ts.a.c(expression));
    }
}

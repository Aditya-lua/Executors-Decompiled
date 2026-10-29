package hs;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhs/e;", "Lbs/b;", "Lks/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements bs.b, ks.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f19804a = new e();

    @Override // ks.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listC = ts.a.c(expression);
        List<Object> list = listC;
        Object obj = null;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    for (Object obj2 : list) {
                        if (f19804a.b(obj2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    return obj == null ? CollectionsKt.o0(listC) : obj;
                }
            }
        }
        for (Object obj3 : list) {
            if (f19804a.b(obj3)) {
                obj = obj3;
                break;
            }
        }
        return Boolean.valueOf(obj != null);
    }
}

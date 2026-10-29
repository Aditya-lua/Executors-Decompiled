package hs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhs/c;", "Lbs/b;", "Lks/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/util/List;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.b, ks.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f19802a = new c();

    @Override // ks.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    public final Object c(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull(list);
        }
        if (size != 2) {
            if (size != 3) {
                return b(CollectionsKt.firstOrNull(list)) ? ts.c.b(list) : c(list.subList(2, list.size()));
            }
            return b(CollectionsKt.firstOrNull(list)) ? ts.c.b(list) : ts.c.c(list);
        }
        if (b(CollectionsKt.firstOrNull(list))) {
            return ts.c.b(list);
        }
        return null;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return c(ts.a.c(expression));
    }
}

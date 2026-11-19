package xs;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxs/c;", "Lrs/b;", "Lat/d;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "e", "(Ljava/util/List;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements rs.b, at.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f37095a = new c();

    @Override // at.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    public final Object e(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull(list);
        }
        if (size != 2) {
            if (size != 3) {
                return b(CollectionsKt.firstOrNull(list)) ? kt.c.b(list) : e(list.subList(2, list.size()));
            }
            return b(CollectionsKt.firstOrNull(list)) ? kt.c.b(list) : kt.c.c(list);
        }
        if (b(CollectionsKt.firstOrNull(list))) {
            return kt.c.b(list);
        }
        return null;
    }

    @Override // rs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return e(kt.a.c(expression));
    }
}

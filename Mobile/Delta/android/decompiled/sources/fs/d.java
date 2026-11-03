package fs;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfs/d;", "Lzr/b;", "Lis/d;", "<init>", "()V", "", "expression", "data", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements zr.b, is.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f17778a = new d();

    @Override // is.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // zr.b
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean l(@Nullable Object expression, @Nullable Object data) {
        return Boolean.valueOf(!b(CollectionsKt.firstOrNull(rs.a.c(expression))));
    }
}

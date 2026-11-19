package xs;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxs/b;", "Lrs/b;", "Lat/d;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rs.b, at.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f37094a = new b();

    @Override // at.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // rs.b
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean l(@Nullable Object expression, @Nullable Object data) {
        return Boolean.valueOf(b(CollectionsKt.firstOrNull(kt.a.c(expression))));
    }
}

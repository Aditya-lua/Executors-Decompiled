package ft;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lft/p;", "Lrs/b;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements rs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f16611a = new p();

    @Override // rs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List listSplit$default;
        List listY;
        Object objFirstOrNull = CollectionsKt.firstOrNull(kt.a.c(expression));
        String str = objFirstOrNull instanceof String ? (String) objFirstOrNull : null;
        if (str == null || (listSplit$default = StringsKt.split$default(str, new String[]{BuildConfig.FLAVOR}, false, 0, 6, null)) == null || (listY = CollectionsKt.Y(listSplit$default, 1)) == null) {
            return null;
        }
        return CollectionsKt.Z(listY, 1);
    }
}

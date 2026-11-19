package ss;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lss/d;", "Lrs/b;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements rs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f31906a = new d();

    @Override // rs.b
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean l(@Nullable Object expression, @Nullable Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(kt.a.c(expression));
        Object objB = kt.c.b(kt.a.c(expression));
        if (objB instanceof String) {
            return Boolean.valueOf(StringsKt.a0((CharSequence) objB, String.valueOf(objFirstOrNull), false, 2, null));
        }
        return objB instanceof List ? Boolean.valueOf(((List) objB).contains(objFirstOrNull)) : Boolean.FALSE;
    }
}

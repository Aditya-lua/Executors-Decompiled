package k6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import x6.ImageRequest;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lk6/l;", "Lk6/l$c;", "key", "c", "(Lk6/l;Lk6/l$c;)Ljava/lang/Object;", "Lx6/g;", "a", "(Lx6/g;Lk6/l$c;)Ljava/lang/Object;", "Lx6/p;", "b", "(Lx6/p;Lk6/l$c;)Ljava/lang/Object;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final <T> T a(@NotNull ImageRequest imageRequest, @NotNull Extras.c<T> cVar) {
        T t8 = (T) imageRequest.getExtras().c(cVar);
        if (t8 != null) {
            return t8;
        }
        T t10 = (T) imageRequest.getDefaults().getExtras().c(cVar);
        return t10 == null ? cVar.a() : t10;
    }

    public static final <T> T b(@NotNull Options options, @NotNull Extras.c<T> cVar) {
        T t8 = (T) options.getExtras().c(cVar);
        return t8 == null ? cVar.a() : t8;
    }

    public static final <T> T c(@NotNull Extras extras, @NotNull Extras.c<T> cVar) {
        T t8 = (T) extras.c(cVar);
        return t8 == null ? cVar.a() : t8;
    }
}

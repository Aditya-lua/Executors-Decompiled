package p239k6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p537x6.ImageRequest;
import p537x6.Options;

/* JADX INFO: renamed from: k6.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"T", "Lk6/l;", "Lk6/l$c;", "key", "c", "(Lk6/l;Lk6/l$c;)Ljava/lang/Object;", "Lx6/g;", "a", "(Lx6/g;Lk6/l$c;)Ljava/lang/Object;", "Lx6/p;", "b", "(Lx6/p;Lk6/l$c;)Ljava/lang/Object;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7473m {
    /* JADX INFO: renamed from: a */
    public static final <T> T m31062a(@NotNull ImageRequest imageRequest, @NotNull Extras.c<T> cVar) {
        T t8 = (T) imageRequest.getExtras().m31057c(cVar);
        if (t8 != null) {
            return t8;
        }
        T t10 = (T) imageRequest.getDefaults().getExtras().m31057c(cVar);
        return t10 == null ? cVar.m31061a() : t10;
    }

    /* JADX INFO: renamed from: b */
    public static final <T> T m31063b(@NotNull Options options, @NotNull Extras.c<T> cVar) {
        T t8 = (T) options.getExtras().m31057c(cVar);
        return t8 == null ? cVar.m31061a() : t8;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> T m31064c(@NotNull Extras extras, @NotNull Extras.c<T> cVar) {
        T t8 = (T) extras.m31057c(cVar);
        return t8 == null ? cVar.m31061a() : t8;
    }
}

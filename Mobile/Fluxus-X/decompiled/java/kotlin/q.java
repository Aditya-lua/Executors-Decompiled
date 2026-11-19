package kotlin;

import com.github.luben.zstd.BuildConfig;
import dv.h;
import org.jetbrains.annotations.NotNull;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.coroutines.e;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lev/q;", "T", "Ldv/h;", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "capacity", "Lcv/a;", "onBufferOverflow", "g", "(Lkotlin/coroutines/CoroutineContext;ILcv/a;)Ldv/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q<T> extends h<T> {

    @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ h a(q qVar, CoroutineContext coroutineContext, int i10, cv.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = e.f21548a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = cv.a.SUSPEND;
            }
            return qVar.g(coroutineContext, i10, aVar);
        }
    }

    @NotNull
    h<T> g(@NotNull CoroutineContext context, int capacity, @NotNull cv.a onBufferOverflow);
}

package cv;

import com.github.luben.zstd.BuildConfig;
import gv.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcv/y;", "E", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "m", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "Lcv/k;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "q", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "H", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y<E> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(y yVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return yVar.G(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <E> boolean b(@NotNull y<? super E> yVar, E e10) throws Throwable {
            Object objV = yVar.v(e10);
            if (k.i(objV)) {
                return true;
            }
            Throwable thE = k.e(objV);
            if (thE == null) {
                return false;
            }
            throw d0.a(thE);
        }
    }

    boolean G(@Nullable Throwable cause);

    boolean H();

    @Nullable
    Object m(E e10, @NotNull eu.b<? super Unit> bVar);

    boolean offer(E element);

    void q(@NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    Object v(E element);
}

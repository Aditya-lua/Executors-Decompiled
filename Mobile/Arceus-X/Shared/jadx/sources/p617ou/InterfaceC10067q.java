package p617ou;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import mu.EnumC8666a;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ou.q */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lou/q;", "T", "Lnu/h;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC10067q<T> extends InterfaceC9575h<T> {

    /* JADX INFO: renamed from: ou.q$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC9575h m38835a(InterfaceC10067q interfaceC10067q, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = C7721e.f29393a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                enumC8666a = EnumC8666a.SUSPEND;
            }
            return interfaceC10067q.mo37711e(coroutineContext, i10, enumC8666a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC9575h<T> mo37711e(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow);
}

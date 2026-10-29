package tu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ku.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"R", "Ltu/d;", "", "timeMillis", "Lkotlin/Function1;", "Lnt/b;", "", "block", "", "a", "(Ltu/d;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "b", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void a(@NotNull d<? super R> dVar, long j10, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1) {
        dVar.d(new b(j10).c(), function1);
    }

    public static final <R> void b(@NotNull d<? super R> dVar, long j10, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1) {
        a(dVar, z0.e(j10), function1);
    }
}

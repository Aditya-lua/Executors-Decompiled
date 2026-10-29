package p395qu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p256ku.C7898n0;

/* JADX INFO: renamed from: qu.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, m31665d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lqu/s0;", "undeliveredElementException", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lqu/s0;)Lqu/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "a", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10752x {
    /* JADX INFO: renamed from: a */
    public static final <E> void m40955a(@NotNull Function1<? super E, Unit> function1, E e10, @NotNull CoroutineContext coroutineContext) {
        C10747s0 c10747s0M40956b = m40956b(function1, e10, null);
        if (c10747s0M40956b != null) {
            C7898n0.m32820a(coroutineContext, c10747s0M40956b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <E> C10747s0 m40956b(@NotNull Function1<? super E, Unit> function1, E e10, @Nullable C10747s0 c10747s0) {
        try {
            function1.invoke(e10);
            return c10747s0;
        } catch (Throwable th2) {
            if (c10747s0 != null && c10747s0.getCause() != th2) {
                C7328a.m30429a(c10747s0, th2);
                return c10747s0;
            }
            return new C10747s0("Exception in undelivered element handler for " + e10, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C10747s0 m40957c(Function1 function1, Object obj, C10747s0 c10747s0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            c10747s0 = null;
        }
        return m40956b(function1, obj, c10747s0);
    }
}

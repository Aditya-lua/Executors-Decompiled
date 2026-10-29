package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nu.l0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lnu/l0;", "T", "", "Lnu/h;", "upstream", "", "extraBufferCapacity", "Lmu/a;", "onBufferOverflow", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lnu/h;ILmu/a;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lnu/h;", "b", "I", "c", "Lmu/a;", "d", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9584l0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<T> upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int extraBufferCapacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final EnumC8666a onBufferOverflow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9584l0(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, int i10, @NotNull EnumC8666a enumC8666a, @NotNull CoroutineContext coroutineContext) {
        this.upstream = interfaceC9575h;
        this.extraBufferCapacity = i10;
        this.onBufferOverflow = enumC8666a;
        this.context = coroutineContext;
    }
}

package p478uu;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.AbstractC10713b0;

/* JADX INFO: renamed from: uu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¨\u0006\u001a"}, m31665d2 = {"Luu/m;", "Lqu/b0;", "", "id", "prev", "", "pointers", "<init>", "(JLuu/m;I)V", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11982m extends AbstractC10713b0<C11982m> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f42449e;

    public C11982m(long j10, @Nullable C11982m c11982m, int i10) {
        super(j10, c11982m, i10);
        this.f42449e = new AtomicReferenceArray(C11981l.f42448f);
    }

    @Override // p395qu.AbstractC10713b0
    /* JADX INFO: renamed from: r */
    public int mo34950r() {
        return C11981l.f42448f;
    }

    @Override // p395qu.AbstractC10713b0
    /* JADX INFO: renamed from: s */
    public void mo34951s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        getF42449e().set(index, C11981l.f42447e);
        m40817t();
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF42449e() {
        return this.f42449e;
    }
}

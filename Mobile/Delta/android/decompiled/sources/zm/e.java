package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zm.e.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0005R$\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lzm/e;", "Lzm/e$a;", "T", "", "<init>", "()V", "node", "", "d", "(Lzm/e$a;)V", "a", "Lzm/e$a;", "b", "()Lzm/e$a;", "e", "head", "c", "f", "tail", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e<T extends a<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public T tail;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0002R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u00018&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzm/e$a;", "T", "", "a", "()Lzm/e$a;", "b", "(Lzm/e$a;)V", "nextListNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface a<T extends a<T>> {
        @Nullable
        T a();

        void b(@Nullable T t8);
    }

    public final void a() {
        this.head = null;
        this.tail = null;
    }

    @Nullable
    public final T b() {
        return this.head;
    }

    @Nullable
    public final T c() {
        return this.tail;
    }

    public final void d(@NotNull T node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.a() != null) {
            throw new IllegalArgumentException("Expected node to not be linked.");
        }
        T t8 = this.tail;
        if (t8 != null) {
            f(node);
            t8.b(node);
        } else {
            if (this.head != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.head = node;
            this.tail = node;
        }
    }

    public final void e(@Nullable T t8) {
        this.head = t8;
    }

    public final void f(@Nullable T t8) {
        this.tail = t8;
    }
}

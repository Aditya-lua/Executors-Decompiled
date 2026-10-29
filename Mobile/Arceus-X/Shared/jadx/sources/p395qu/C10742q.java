package p395qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p563y1.C12996b;

/* JADX INFO: renamed from: qu.q */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, m31665d2 = {"Lqu/q;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lqu/r;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C10742q<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38309a = AtomicReferenceFieldUpdater.newUpdater(C10742q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C10742q(boolean z10) {
        this._cur$volatile = new C10744r(8, z10);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40925a(@NotNull E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38309a;
        while (true) {
            C10744r c10744r = (C10744r) atomicReferenceFieldUpdater.get(this);
            int iM40931a = c10744r.m40931a(element);
            if (iM40931a == 0) {
                return true;
            }
            if (iM40931a == 1) {
                C12996b.m48310a(f38309a, this, c10744r, c10744r.m40940l());
            } else if (iM40931a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40926b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38309a;
        while (true) {
            C10744r c10744r = (C10744r) atomicReferenceFieldUpdater.get(this);
            if (c10744r.m40934d()) {
                return;
            } else {
                C12996b.m48310a(f38309a, this, c10744r, c10744r.m40940l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m40927c() {
        return ((C10744r) f38309a.get(this)).m40937g();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final E m40928e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38309a;
        while (true) {
            C10744r c10744r = (C10744r) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c10744r.m40941m();
            if (e10 != C10744r.f38313h) {
                return e10;
            }
            C12996b.m48310a(f38309a, this, c10744r, c10744r.m40940l());
        }
    }
}

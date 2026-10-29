package p201iu;

import au.InterfaceC1170a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: iu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m31665d2 = {"Liu/g;", "T", "Liu/h;", "", "Lnt/b;", "", "<init>", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "value", "a", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "iterator", "e", "(Ljava/util/Iterator;Lnt/b;)Ljava/lang/Object;", "Ljt/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "j", "", "i", "()Ljava/lang/Throwable;", "", "Lkotlin/sequences/State;", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "c", "Ljava/util/Iterator;", "nextIterator", "d", "Lnt/b;", "getNextStep", "()Lnt/b;", "l", "(Lnt/b;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6979g<T> extends AbstractC6980h<T> implements Iterator<T>, InterfaceC9557b<Unit>, InterfaceC1170a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public T nextValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Iterator<? extends T> nextIterator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public InterfaceC9557b<? super Unit> nextStep;

    @Override // p201iu.AbstractC6980h
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo29366a(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        this.nextValue = t8;
        this.state = 3;
        this.nextStep = interfaceC9557b;
        Object objM38805e = C10047c.m38805e();
        if (objM38805e == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM38805e == C10047c.m38805e() ? objM38805e : Unit.f29331a;
    }

    @Override // p201iu.AbstractC6980h
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo29367e(@NotNull Iterator<? extends T> it, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (!it.hasNext()) {
            return Unit.f29331a;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = interfaceC9557b;
        Object objM38805e = C10047c.m38805e();
        if (objM38805e == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM38805e == C10047c.m38805e() ? objM38805e : Unit.f29331a;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return C7721e.f29393a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m29368i();
                }
                Iterator<? extends T> it = this.nextIterator;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            InterfaceC9557b<? super Unit> interfaceC9557b = this.nextStep;
            Intrinsics.checkNotNull(interfaceC9557b);
            this.nextStep = null;
            interfaceC9557b.resumeWith(C7347n.m30460b(Unit.f29331a));
        }
    }

    /* JADX INFO: renamed from: i */
    public final Throwable m29368i() {
        int i10 = this.state;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    /* JADX INFO: renamed from: j */
    public final T m29369j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: l */
    public final void m29370l(@Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
        this.nextStep = interfaceC9557b;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.state;
        if (i10 == 0 || i10 == 1) {
            return m29369j();
        }
        if (i10 == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m29368i();
        }
        this.state = 0;
        T t8 = this.nextValue;
        this.nextValue = null;
        return t8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p315nt.InterfaceC9557b
    public void resumeWith(@NotNull Object result) {
        C7348o.m30470b(result);
        this.state = 4;
    }
}

package nt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jt.n;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lnt/e;", "T", "Lnt/b;", "Lpt/e;", "delegate", "", "initialResult", "<init>", "(Lnt/b;Ljava/lang/Object;)V", "(Lnt/b;)V", "Ljt/n;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lnt/b;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lpt/e;", "callerFrame", "b", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e<T> implements b<T>, pt.e {

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<e<?>, Object> f26660c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b<T> delegate;

    @Nullable
    private volatile Object result;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnt/e$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull b<? super T> delegate, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.result = obj;
    }

    @Nullable
    public final Object a() throws Throwable {
        Object obj = this.result;
        ot.a aVar = ot.a.UNDECIDED;
        if (obj == aVar) {
            if (y1.b.a(f26660c, this, aVar, ot.c.e())) {
                return ot.c.e();
            }
            obj = this.result;
        }
        if (obj == ot.a.RESUMED) {
            return ot.c.e();
        }
        if (obj instanceof n.Failure) {
            throw ((n.Failure) obj).exception;
        }
        return obj;
    }

    @Override // pt.e
    @Nullable
    public pt.e getCallerFrame() {
        b<T> bVar = this.delegate;
        if (bVar instanceof pt.e) {
            return (pt.e) bVar;
        }
        return null;
    }

    @Override // nt.b
    @NotNull
    public CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    @Override // nt.b
    public void resumeWith(@NotNull Object result) {
        while (true) {
            Object obj = this.result;
            ot.a aVar = ot.a.UNDECIDED;
            if (obj == aVar) {
                if (y1.b.a(f26660c, this, aVar, result)) {
                    return;
                }
            } else {
                if (obj != ot.c.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (y1.b.a(f26660c, this, ot.c.e(), ot.a.RESUMED)) {
                    this.delegate.resumeWith(result);
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull b<? super T> delegate) {
        this(delegate, ot.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}

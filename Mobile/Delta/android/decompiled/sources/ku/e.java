package ku;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lku/e;", "T", "", "", "Lku/w0;", "deferreds", "<init>", "([Lku/w0;)V", "", "c", "(Lnt/b;)Ljava/lang/Object;", "a", "[Lku/w0;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w0<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lku/e$a;", "Lku/i2;", "Lku/n;", "", "continuation", "<init>", "(Lku/e;Lku/n;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/n;", "Lku/i1;", "f", "Lku/i1;", "A", "()Lku/i1;", "D", "(Lku/i1;)V", "handle", "Lku/e$b;", "Lku/e;", "value", "z", "()Lku/e$b;", "C", "(Lku/e$b;)V", "disposer", "", "w", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends i2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22778h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final n<List<? extends T>> continuation;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public i1 handle;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super List<? extends T>> nVar) {
            this.continuation = nVar;
        }

        @NotNull
        public final i1 A() {
            i1 i1Var = this.handle;
            if (i1Var != null) {
                return i1Var;
            }
            Intrinsics.u("handle");
            return null;
        }

        public final void C(@Nullable e<T>.b bVar) {
            f22778h.set(this, bVar);
        }

        public final void D(@NotNull i1 i1Var) {
            this.handle = i1Var;
        }

        @Override // ku.i2
        public boolean w() {
            return false;
        }

        @Override // ku.i2
        public void x(@Nullable Throwable cause) {
            if (cause != null) {
                Object objO = this.continuation.o(cause);
                if (objO != null) {
                    this.continuation.J(objO);
                    e<T>.b bVarZ = z();
                    if (bVarZ != null) {
                        bVarZ.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.d().decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.continuation;
                w0[] w0VarArr = e.this.deferreds;
                ArrayList arrayList = new ArrayList(w0VarArr.length);
                for (w0 w0Var : w0VarArr) {
                    arrayList.add(w0Var.g());
                }
                nVar.resumeWith(jt.n.b(arrayList));
            }
        }

        @Nullable
        public final e<T>.b z() {
            return (b) f22778h.get(this);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lku/e$b;", "Lku/m;", "", "Lku/e$a;", "Lku/e;", "nodes", "<init>", "(Lku/e;[Lku/e$a;)V", "", "b", "()V", "", "cause", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Lku/e$a;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e<T>.a[] nodes;

        public b(e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        @Override // ku.m
        public void a(@Nullable Throwable cause) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.nodes) {
                aVar.A().a();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull w0<? extends T>[] w0VarArr) {
        this.deferreds = w0VarArr;
        this.notCompletedCount$volatile = w0VarArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return b;
    }

    @Nullable
    public final Object c(@NotNull nt.b<? super List<? extends T>> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            w0 w0Var = this.deferreds[i10];
            w0Var.start();
            a aVar = new a(pVar);
            aVar.D(h2.j(w0Var, false, aVar, 1, null));
            Unit unit = Unit.f22483a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar2 = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].C(bVar2);
        }
        if (pVar.d()) {
            bVar2.b();
        } else {
            r.c(pVar, bVar2);
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }
}

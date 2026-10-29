package p256ku;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: ku.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, m31665d2 = {"Lku/e;", "T", "", "", "Lku/w0;", "deferreds", "<init>", "([Lku/w0;)V", "", "c", "(Lnt/b;)Ljava/lang/Object;", "a", "[Lku/w0;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7852e<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29705b = AtomicIntegerFieldUpdater.newUpdater(C7852e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7934w0<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: ku.e$a */
    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, m31665d2 = {"Lku/e$a;", "Lku/i2;", "Lku/n;", "", "continuation", "<init>", "(Lku/e;Lku/n;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/n;", "Lku/i1;", "f", "Lku/i1;", "A", "()Lku/i1;", "D", "(Lku/i1;)V", "handle", "Lku/e$b;", "Lku/e;", "value", "z", "()Lku/e$b;", "C", "(Lku/e$b;)V", "disposer", "", "w", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a extends AbstractC7875i2 {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f29707h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7897n<List<? extends T>> continuation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public InterfaceC7874i1 handle;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super java.util.List<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC7897n<? super List<? extends T>> interfaceC7897n) {
            this.continuation = interfaceC7897n;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public final InterfaceC7874i1 m32617A() {
            InterfaceC7874i1 interfaceC7874i1 = this.handle;
            if (interfaceC7874i1 != null) {
                return interfaceC7874i1;
            }
            Intrinsics.m31998u("handle");
            return null;
        }

        /* JADX INFO: renamed from: C */
        public final void m32618C(@Nullable C7852e<T>.b bVar) {
            f29707h.set(this, bVar);
        }

        /* JADX INFO: renamed from: D */
        public final void m32619D(@NotNull InterfaceC7874i1 interfaceC7874i1) {
            this.handle = interfaceC7874i1;
        }

        @Override // p256ku.AbstractC7875i2
        /* JADX INFO: renamed from: w */
        public boolean mo32574w() {
            return false;
        }

        @Override // p256ku.AbstractC7875i2
        /* JADX INFO: renamed from: x */
        public void mo32575x(@Nullable Throwable cause) {
            if (cause != null) {
                Object objMo32816o = this.continuation.mo32816o(cause);
                if (objMo32816o != null) {
                    this.continuation.mo32810J(objMo32816o);
                    C7852e<T>.b bVarM32620z = m32620z();
                    if (bVarM32620z != null) {
                        bVarM32620z.m32622b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C7852e.m32614d().decrementAndGet(C7852e.this) == 0) {
                InterfaceC7897n<List<? extends T>> interfaceC7897n = this.continuation;
                InterfaceC7934w0[] interfaceC7934w0Arr = C7852e.this.deferreds;
                ArrayList arrayList = new ArrayList(interfaceC7934w0Arr.length);
                for (InterfaceC7934w0 interfaceC7934w0 : interfaceC7934w0Arr) {
                    arrayList.add(interfaceC7934w0.mo32928g());
                }
                interfaceC7897n.resumeWith(C7347n.m30460b(arrayList));
            }
        }

        @Nullable
        /* JADX INFO: renamed from: z */
        public final C7852e<T>.b m32620z() {
            return (b) f29707h.get(this);
        }
    }

    /* JADX INFO: renamed from: ku.e$b */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lku/e$b;", "Lku/m;", "", "Lku/e$a;", "Lku/e;", "nodes", "<init>", "(Lku/e;[Lku/e$a;)V", "", "b", "()V", "", "cause", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Lku/e$a;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class b implements InterfaceC7892m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7852e<T>.a[] nodes;

        public b(C7852e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        @Override // p256ku.InterfaceC7892m
        /* JADX INFO: renamed from: a */
        public void mo32621a(@Nullable Throwable cause) {
            m32622b();
        }

        /* JADX INFO: renamed from: b */
        public final void m32622b() {
            for (C7852e<T>.a aVar : this.nodes) {
                aVar.m32617A().mo32664a();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.w0<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C7852e(@NotNull InterfaceC7934w0<? extends T>[] interfaceC7934w0Arr) {
        this.deferreds = interfaceC7934w0Arr;
        this.notCompletedCount$volatile = interfaceC7934w0Arr.length;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ku.e.a.x(java.lang.Throwable):void] */
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m32614d() {
        return f29705b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m32615c(@NotNull InterfaceC9557b<? super List<? extends T>> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC7934w0 interfaceC7934w0 = this.deferreds[i10];
            interfaceC7934w0.start();
            a aVar = new a(c7905p);
            aVar.m32619D(C7870h2.m32674j(interfaceC7934w0, false, aVar, 1, null));
            Unit unit = Unit.f29331a;
            aVarArr[i10] = aVar;
        }
        C7852e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].m32618C(bVar);
        }
        if (c7905p.mo32812d()) {
            bVar.m32622b();
        } else {
            C7913r.m32901c(c7905p, bVar);
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }
}

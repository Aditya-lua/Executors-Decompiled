package p567y5;

import androidx.work.AbstractC1117c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7905p;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p536x5.AbstractC12732w;
import p536x5.EnumC12702h;
import pt.C10346h;

/* JADX INFO: renamed from: y5.s1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"T", "Lne/x;", "Landroidx/work/c;", "worker", "d", "(Lne/x;Landroidx/work/c;Lnt/b;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13087s1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f46308a;

    /* JADX INFO: renamed from: y5.s1$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1117c f46309a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceFutureC9440x<T> f46310b;

        public a(AbstractC1117c abstractC1117c, InterfaceFutureC9440x<T> interfaceFutureC9440x) {
            this.f46309a = abstractC1117c;
            this.f46310b = interfaceFutureC9440x;
        }

        /* JADX INFO: renamed from: a */
        public final void m48683a(Throwable th2) {
            if (th2 instanceof C13054h1) {
                this.f46309a.stop(((C13054h1) th2).getReason());
            }
            this.f46310b.cancel(false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m48683a(th2);
            return Unit.f29331a;
        }
    }

    static {
        String strM47443i = AbstractC12732w.m47443i("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f46308a = strM47443i;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m48680d(@NotNull InterfaceFutureC9440x<T> interfaceFutureC9440x, @NotNull AbstractC1117c abstractC1117c, @NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
        try {
            if (interfaceFutureC9440x.isDone()) {
                return m48681e(interfaceFutureC9440x);
            }
            C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
            c7905p.m32860H();
            interfaceFutureC9440x.mo37173a(new RunnableC13038c0(interfaceFutureC9440x, c7905p), EnumC12702h.INSTANCE);
            c7905p.mo32815n(new a(abstractC1117c, interfaceFutureC9440x));
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A;
        } catch (ExecutionException e10) {
            throw m48682f(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final <V> V m48681e(Future<V> future) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }

    /* JADX INFO: renamed from: f */
    public static final Throwable m48682f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}

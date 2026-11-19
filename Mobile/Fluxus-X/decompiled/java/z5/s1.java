package z5;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lpe/x;", "Landroidx/work/c;", "worker", "d", "(Lpe/x;Landroidx/work/c;Leu/b;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", BuildConfig.FLAVOR, "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f39113a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f39114a;
        public final /* synthetic */ pe.x<T> b;

        public a(androidx.work.c cVar, pe.x<T> xVar) {
            this.f39114a = cVar;
            this.b = xVar;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof h1) {
                this.f39114a.stop(((h1) th2).getReason());
            }
            this.b.cancel(false);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    static {
        String strI = y5.w.i("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f39113a = strI;
    }

    @Nullable
    public static final <T> Object d(@NotNull pe.x<T> xVar, @NotNull androidx.work.c cVar, @NotNull eu.b<? super T> bVar) throws Throwable {
        try {
            if (xVar.isDone()) {
                return e(xVar);
            }
            av.p pVar = new av.p(fu.b.c(bVar), 1);
            pVar.G();
            xVar.a(new c0(xVar, pVar), y5.h.INSTANCE);
            pVar.j(new a(cVar, xVar));
            Object objY = pVar.y();
            if (objY == fu.c.e()) {
                gu.h.c(bVar);
            }
            return objY;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    public static final <V> V e(Future<V> future) {
        V v8;
        boolean z10 = false;
        while (true) {
            try {
                v8 = future.get();
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
        return v8;
    }

    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}

package e3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\rH&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Le3/o;", "", "Landroid/content/Context;", "context", "Le3/k0;", "request", "Le3/l0;", "b", "(Landroid/content/Context;Le3/k0;Lnt/b;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Lf3/n;", "callback", "", "d", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "a", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f15043a;

    /* JADX INFO: renamed from: e3.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le3/o$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Le3/o;", "a", "(Landroid/content/Context;)Le3/o;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f15043a = new Companion();

        @NotNull
        public final o a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f15044a;

        public b(CancellationSignal cancellationSignal) {
            this.f15044a = cancellationSignal;
        }

        public final void a(Throwable th2) {
            this.f15044a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e3/o$c", "Le3/p;", "Le3/l0;", "Lf3/n;", "result", "", "c", "(Le3/l0;)V", "e", "b", "(Lf3/n;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p<l0, f3.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<l0> f15045a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(ku.n<? super l0> nVar) {
            this.f15045a = nVar;
        }

        @Override // e3.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f3.n e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f15045a.b()) {
                ku.n<l0> nVar = this.f15045a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(jt.o.a(e10)));
            }
        }

        @Override // e3.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(l0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f15045a.b()) {
                this.f15045a.resumeWith(jt.n.b(result));
            }
        }
    }

    static /* synthetic */ Object c(o oVar, Context context, k0 k0Var, nt.b<? super l0> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        CancellationSignal cancellationSignal = new CancellationSignal();
        pVar.n(new b(cancellationSignal));
        oVar.d(context, k0Var, cancellationSignal, new n(), new c(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @NotNull
    static o create(@NotNull Context context) {
        return INSTANCE.a(context);
    }

    void a(@NotNull Context context, @NotNull e3.b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull p<e3.c, f3.f> callback);

    @Nullable
    default Object b(@NotNull Context context, @NotNull k0 k0Var, @NotNull nt.b<? super l0> bVar) {
        return c(this, context, k0Var, bVar);
    }

    void d(@NotNull Context context, @NotNull k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull p<l0, f3.n> callback);
}

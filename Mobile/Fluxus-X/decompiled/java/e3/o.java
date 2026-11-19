package e3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\rH&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Le3/o;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Le3/k0;", "request", "Le3/l0;", "c", "(Landroid/content/Context;Le3/k0;Leu/b;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Lf3/n;", "callback", BuildConfig.FLAVOR, "d", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "b", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f13140a;

    /* JADX INFO: renamed from: e3.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le3/o$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Le3/o;", "a", "(Landroid/content/Context;)Le3/o;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f13140a = new Companion();

        @NotNull
        public final o a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f13141a;

        public b(CancellationSignal cancellationSignal) {
            this.f13141a = cancellationSignal;
        }

        public final void a(Throwable th2) {
            this.f13141a.cancel();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e3/o$c", "Le3/p;", "Le3/l0;", "Lf3/n;", "result", BuildConfig.FLAVOR, "c", "(Le3/l0;)V", "e", "b", "(Lf3/n;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p<l0, f3.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<l0> f13142a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(av.n<? super l0> nVar) {
            this.f13142a = nVar;
        }

        @Override // e3.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f3.n e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f13142a.b()) {
                av.n<l0> nVar = this.f13142a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(zt.o.a(e10)));
            }
        }

        @Override // e3.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(l0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f13142a.b()) {
                this.f13142a.resumeWith(zt.n.b(result));
            }
        }
    }

    static /* synthetic */ Object a(o oVar, Context context, k0 k0Var, eu.b<? super l0> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        CancellationSignal cancellationSignal = new CancellationSignal();
        pVar.j(new b(cancellationSignal));
        oVar.d(context, k0Var, cancellationSignal, new n(), new c(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    @NotNull
    static o create(@NotNull Context context) {
        return INSTANCE.a(context);
    }

    void b(@NotNull Context context, @NotNull e3.b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull p<e3.c, f3.f> callback);

    @Nullable
    default Object c(@NotNull Context context, @NotNull k0 k0Var, @NotNull eu.b<? super l0> bVar) {
        return a(this, context, k0Var, bVar);
    }

    void d(@NotNull Context context, @NotNull k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull p<l0, f3.n> callback);
}

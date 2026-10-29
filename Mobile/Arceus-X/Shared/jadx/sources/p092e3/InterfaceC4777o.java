package p092e3;

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
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: e3.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\rH&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m31665d2 = {"Le3/o;", "", "Landroid/content/Context;", "context", "Le3/k0;", "request", "Le3/l0;", "b", "(Landroid/content/Context;Le3/k0;Lnt/b;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Lf3/n;", "callback", "", "d", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "a", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public interface InterfaceC4777o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f19366a;

    /* JADX INFO: renamed from: e3.o$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Le3/o$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Le3/o;", "a", "(Landroid/content/Context;)Le3/o;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19366a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC4777o m23210a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C4781q(context);
        }
    }

    /* JADX INFO: renamed from: e3.o$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f19367a;

        public b(CancellationSignal cancellationSignal) {
            this.f19367a = cancellationSignal;
        }

        /* JADX INFO: renamed from: a */
        public final void m23211a(Throwable th2) {
            this.f19367a.cancel();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m23211a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: e3.o$c */
    @Metadata(m31664d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"e3/o$c", "Le3/p;", "Le3/l0;", "Lf3/n;", "result", "", "c", "(Le3/l0;)V", "e", "b", "(Lf3/n;)V", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c implements InterfaceC4779p<C4772l0, AbstractC5340n> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<C4772l0> f19368a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super e3.l0> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC7897n<? super C4772l0> interfaceC7897n) {
            this.f19368a = interfaceC7897n;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7535a(AbstractC5340n e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f19368a.mo32811b()) {
                InterfaceC7897n<C4772l0> interfaceC7897n = this.f19368a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(e10)));
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(C4772l0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f19368a.mo32811b()) {
                this.f19368a.resumeWith(C7347n.m30460b(result));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m23206c(InterfaceC4777o interfaceC4777o, Context context, C4770k0 c4770k0, InterfaceC9557b<? super C4772l0> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c7905p.mo32815n(new b(cancellationSignal));
        interfaceC4777o.mo23209d(context, c4770k0, cancellationSignal, new ExecutorC4775n(), new c(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @NotNull
    static InterfaceC4777o create(@NotNull Context context) {
        return INSTANCE.m23210a(context);
    }

    /* JADX INFO: renamed from: a */
    void mo23207a(@NotNull Context context, @NotNull AbstractC4751b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback);

    @Nullable
    /* JADX INFO: renamed from: b */
    default Object m23208b(@NotNull Context context, @NotNull C4770k0 c4770k0, @NotNull InterfaceC9557b<? super C4772l0> interfaceC9557b) {
        return m23206c(this, context, c4770k0, interfaceC9557b);
    }

    /* JADX INFO: renamed from: d */
    void mo23209d(@NotNull Context context, @NotNull C4770k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p<C4772l0, AbstractC5340n> callback);
}

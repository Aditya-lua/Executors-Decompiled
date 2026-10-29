package vu;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;
import sb.C11246b;

/* JADX INFO: renamed from: vu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Lnt/b;)Ljava/lang/Object;", "Lsb/b;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Lsb/b;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12264b {

    /* JADX INFO: renamed from: vu.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<T> f43403a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC7897n<? super T> interfaceC7897n) {
            this.f43403a = interfaceC7897n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC9557b interfaceC9557b = this.f43403a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(exception)));
            } else {
                if (task.mo11898l()) {
                    InterfaceC7897n.a.m32819a(this.f43403a, null, 1, null);
                    return;
                }
                InterfaceC9557b interfaceC9557b2 = this.f43403a;
                C7347n.Companion companion2 = C7347n.INSTANCE;
                interfaceC9557b2.resumeWith(C7347n.m30460b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: vu.b$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11246b f43404a;

        public b(C11246b c11246b) {
            this.f43404a = c11246b;
        }

        /* JADX INFO: renamed from: a */
        public final void m45514a(Throwable th2) {
            this.f43404a.m42313a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m45514a(th2);
            return Unit.f29331a;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m45512a(@NotNull Task<T> task, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return m45513b(task, null, interfaceC9557b);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Object m45513b(Task<T> task, C11246b c11246b, InterfaceC9557b<? super T> interfaceC9557b) throws Exception {
        if (!task.mo11899m()) {
            C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
            c7905p.m32860H();
            task.mo11889c(ExecutorC12263a.f43402a, new a(c7905p));
            if (c11246b != null) {
                c7905p.mo32815n(new b(c11246b));
            }
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.mo11898l()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}

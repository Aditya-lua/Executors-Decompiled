package vu;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ku.n;
import ku.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Lnt/b;)Ljava/lang/Object;", "Lsb/b;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Lsb/b;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n<T> f33525a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super T> nVar) {
            this.f33525a = nVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                nt.b bVar = this.f33525a;
                jt.n.Companion companion = jt.n.INSTANCE;
                bVar.resumeWith(jt.n.b(o.a(exception)));
            } else {
                if (task.l()) {
                    n.a.a(this.f33525a, null, 1, null);
                    return;
                }
                nt.b bVar2 = this.f33525a;
                jt.n.Companion companion2 = jt.n.INSTANCE;
                bVar2.resumeWith(jt.n.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: vu.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0608b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sb.b f33526a;

        public C0608b(sb.b bVar) {
            this.f33526a = bVar;
        }

        public final void a(Throwable th2) {
            this.f33526a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Task<T> task, @NotNull nt.b<? super T> bVar) {
        return b(task, null, bVar);
    }

    public static final <T> Object b(Task<T> task, sb.b bVar, nt.b<? super T> bVar2) throws Exception {
        if (!task.m()) {
            p pVar = new p(ot.b.c(bVar2), 1);
            pVar.H();
            task.c(vu.a.f33524a, new a(pVar));
            if (bVar != null) {
                pVar.n(new C0608b(bVar));
            }
            Object objA = pVar.A();
            if (objA == c.e()) {
                h.c(bVar2);
            }
            return objA;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.l()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}

package tu;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import gt.o;
import iu.n;
import iu.p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mt.c;
import nt.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Llt/b;)Ljava/lang/Object;", "Lsb/b;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Lsb/b;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n<T> f32661a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super T> nVar) {
            this.f32661a = nVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                lt.b bVar = this.f32661a;
                gt.n.Companion companion = gt.n.INSTANCE;
                bVar.resumeWith(gt.n.b(o.a(exception)));
            } else {
                if (task.l()) {
                    n.a.a(this.f32661a, null, 1, null);
                    return;
                }
                lt.b bVar2 = this.f32661a;
                gt.n.Companion companion2 = gt.n.INSTANCE;
                bVar2.resumeWith(gt.n.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: tu.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0587b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sb.b f32662a;

        public C0587b(sb.b bVar) {
            this.f32662a = bVar;
        }

        public final void a(Throwable th2) {
            this.f32662a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Task<T> task, @NotNull lt.b<? super T> bVar) {
        return b(task, null, bVar);
    }

    public static final <T> Object b(Task<T> task, sb.b bVar, lt.b<? super T> bVar2) throws Exception {
        if (!task.m()) {
            p pVar = new p(mt.b.c(bVar2), 1);
            pVar.H();
            task.c(tu.a.f32660a, new a(pVar));
            if (bVar != null) {
                pVar.o(new C0587b(bVar));
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

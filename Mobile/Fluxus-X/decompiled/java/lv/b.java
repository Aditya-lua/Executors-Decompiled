package lv;

import av.n;
import av.p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import fu.c;
import gu.h;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Leu/b;)Ljava/lang/Object;", "Ltb/b;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Ltb/b;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n<T> f22571a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super T> nVar) {
            this.f22571a = nVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                eu.b bVar = this.f22571a;
                zt.n.Companion companion = zt.n.INSTANCE;
                bVar.resumeWith(zt.n.b(o.a(exception)));
            } else {
                if (task.l()) {
                    n.a.a(this.f22571a, null, 1, null);
                    return;
                }
                eu.b bVar2 = this.f22571a;
                zt.n.Companion companion2 = zt.n.INSTANCE;
                bVar2.resumeWith(zt.n.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: lv.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0449b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tb.b f22572a;

        public C0449b(tb.b bVar) {
            this.f22572a = bVar;
        }

        public final void a(Throwable th2) {
            this.f22572a.a();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Task<T> task, @NotNull eu.b<? super T> bVar) {
        return b(task, null, bVar);
    }

    public static final <T> Object b(Task<T> task, tb.b bVar, eu.b<? super T> bVar2) throws Exception {
        if (!task.m()) {
            p pVar = new p(fu.b.c(bVar2), 1);
            pVar.G();
            task.c(lv.a.f22570a, new a(pVar));
            if (bVar != null) {
                pVar.j(new C0449b(bVar));
            }
            Object objY = pVar.y();
            if (objY == c.e()) {
                h.c(bVar2);
            }
            return objY;
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

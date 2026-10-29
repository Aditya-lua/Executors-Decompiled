package q4;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import ku.w0;
import me.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y1.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lku/w0;", "", "tag", "Lme/x;", "b", "(Lku/w0;Ljava/lang/Object;)Lme/x;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c.a<T> f29216i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ w0<T> f29217j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c.a<T> aVar, w0<? extends T> w0Var) {
            super(1);
            this.f29216i = aVar;
            this.f29217j = w0Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f29216i.c((T) this.f29217j.g());
            } else if (th2 instanceof CancellationException) {
                this.f29216i.d();
            } else {
                this.f29216i.f(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @NotNull
    public static final <T> x<T> b(@NotNull final w0<? extends T> w0Var, @Nullable final Object obj) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        x<T> xVarA = c.a(new c.InterfaceC0650c() { // from class: q4.a
            @Override // y1.c.InterfaceC0650c
            public final Object a(c.a aVar) {
                return b.d(w0Var, obj, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return xVarA;
    }

    public static /* synthetic */ x c(w0 w0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w0Var, obj);
    }

    public static final Object d(w0 this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.q(new a(completer, this_asListenableFuture));
        return obj;
    }
}

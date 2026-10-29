package p370q4;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7934w0;
import p563y1.C12997c;

/* JADX INFO: renamed from: q4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"T", "Lku/w0;", "", "tag", "Lne/x;", "b", "(Lku/w0;Ljava/lang/Object;)Lne/x;", "ads-adservices-java_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C10432b {

    /* JADX INFO: renamed from: q4.b$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C12997c.a<T> f37603i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7934w0<T> f37604j;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.w0<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C12997c.a<T> aVar, InterfaceC7934w0<? extends T> interfaceC7934w0) {
            super(1);
            this.f37603i = aVar;
            this.f37604j = interfaceC7934w0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: a */
        public final void m40145a(Throwable th2) {
            if (th2 == null) {
                this.f37603i.m48314c((T) this.f37604j.mo32928g());
            } else if (th2 instanceof CancellationException) {
                this.f37603i.m48315d();
            } else {
                this.f37603i.m48317f(th2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m40145a(th2);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceFutureC9440x<T> m40142b(@NotNull final InterfaceC7934w0<? extends T> interfaceC7934w0, @Nullable final Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC7934w0, "<this>");
        InterfaceFutureC9440x<T> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: q4.a
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10432b.m40144d(interfaceC7934w0, obj, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture { completer ->…      }\n        tag\n    }");
        return interfaceFutureC9440xM48311a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceFutureC9440x m40143c(InterfaceC7934w0 interfaceC7934w0, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m40142b(interfaceC7934w0, obj);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m40144d(InterfaceC7934w0 this_asListenableFuture, Object obj, C12997c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.mo32601q(new a(completer, this_asListenableFuture));
        return obj;
    }
}

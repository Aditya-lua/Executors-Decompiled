package p364pu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p256ku.C7915r1;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7934w0;

/* JADX INFO: renamed from: pu.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "Lku/w0;", "Ljava/util/concurrent/CompletableFuture;", "c", "(Lku/w0;)Ljava/util/concurrent/CompletableFuture;", "Lku/d2;", "future", "", "e", "(Lku/d2;Ljava/util/concurrent/CompletableFuture;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10354c {

    /* JADX INFO: renamed from: pu.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7850d2 f37206a;

        public a(InterfaceC7850d2 interfaceC7850d2) {
            this.f37206a = interfaceC7850d2;
        }

        /* JADX INFO: renamed from: a */
        public final void m39683a(Object obj, Throwable th2) {
            InterfaceC7850d2 interfaceC7850d2 = this.f37206a;
            CancellationException cancellationExceptionM32905a = null;
            if (th2 != null) {
                cancellationExceptionM32905a = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                if (cancellationExceptionM32905a == null) {
                    cancellationExceptionM32905a = C7915r1.m32905a("CompletableFuture was completed exceptionally", th2);
                }
            }
            interfaceC7850d2.mo32597c(cancellationExceptionM32905a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39683a(obj, (Throwable) obj2);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> CompletableFuture<T> m39679c(@NotNull final InterfaceC7934w0<? extends T> interfaceC7934w0) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        m39681e(interfaceC7934w0, completableFuture);
        interfaceC7934w0.mo32601q(new Function1() { // from class: pu.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10354c.m39680d(completableFuture, interfaceC7934w0, (Throwable) obj);
            }
        });
        return completableFuture;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m39680d(CompletableFuture completableFuture, InterfaceC7934w0 interfaceC7934w0, Throwable th2) {
        try {
            completableFuture.complete(interfaceC7934w0.mo32928g());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m39681e(InterfaceC7850d2 interfaceC7850d2, CompletableFuture<?> completableFuture) {
        final a aVar = new a(interfaceC7850d2);
        completableFuture.handle(new BiFunction() { // from class: pu.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C10354c.m39682f(aVar, obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m39682f(Function2 function2, Object obj, Throwable th2) {
        return (Unit) function2.invoke(obj, th2);
    }
}

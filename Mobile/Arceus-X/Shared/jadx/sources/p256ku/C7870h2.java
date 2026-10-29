package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7744k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.h2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0013*\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0001*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m31665d2 = {"Lku/d2;", "", "invokeImmediately", "Lku/i2;", "handler", "Lku/i1;", "i", "(Lku/d2;ZLku/i2;)Lku/i1;", "parent", "Lku/a0;", "a", "(Lku/d2;)Lku/a0;", "handle", "e", "(Lku/d2;Lku/i1;)Lku/i1;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "g", "(Lku/d2;)V", "f", "(Lkotlin/coroutines/CoroutineContext;)V", "k", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "h", "(Lkotlin/coroutines/CoroutineContext;)Lku/d2;", "job", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class C7870h2 {

    /* JADX INFO: renamed from: ku.h2$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a extends C7744k implements Function1<Throwable, Unit> {
        public a(Object obj) {
            super(1, obj, AbstractC7875i2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m32676d(Throwable th2) {
            ((AbstractC7875i2) this.receiver).mo32575x(th2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m32676d(th2);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7833a0 m32665a(@Nullable InterfaceC7850d2 interfaceC7850d2) {
        return new C7860f2(interfaceC7850d2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7833a0 m32666b(InterfaceC7850d2 interfaceC7850d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7850d2 = null;
        }
        return C7865g2.m32647a(interfaceC7850d2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m32667c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            interfaceC7850d2.mo32597c(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m32668d(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C7865g2.m32649c(coroutineContext, cancellationException);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC7874i1 m32669e(@NotNull InterfaceC7850d2 interfaceC7850d2, @NotNull InterfaceC7874i1 interfaceC7874i1) {
        return m32674j(interfaceC7850d2, false, new C7884k1(interfaceC7874i1), 1, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m32670f(@NotNull CoroutineContext coroutineContext) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            C7865g2.m32653g(interfaceC7850d2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m32671g(@NotNull InterfaceC7850d2 interfaceC7850d2) {
        if (!interfaceC7850d2.mo32556b()) {
            throw interfaceC7850d2.mo32600m();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final InterfaceC7850d2 m32672h(@NotNull CoroutineContext coroutineContext) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            return interfaceC7850d2;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final InterfaceC7874i1 m32673i(@NotNull InterfaceC7850d2 interfaceC7850d2, boolean z10, @NotNull AbstractC7875i2 abstractC7875i2) {
        return interfaceC7850d2 instanceof C7880j2 ? ((C7880j2) interfaceC7850d2).m32753r0(z10, abstractC7875i2) : interfaceC7850d2.mo32599l(abstractC7875i2.mo32574w(), z10, new a(abstractC7875i2));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC7874i1 m32674j(InterfaceC7850d2 interfaceC7850d2, boolean z10, AbstractC7875i2 abstractC7875i2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return C7865g2.m32655i(interfaceC7850d2, z10, abstractC7875i2);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m32675k(@NotNull CoroutineContext coroutineContext) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            return interfaceC7850d2.mo32556b();
        }
        return true;
    }
}

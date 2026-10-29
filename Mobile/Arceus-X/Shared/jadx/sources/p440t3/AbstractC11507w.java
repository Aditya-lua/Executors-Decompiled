package p440t3;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: t3.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m31665d2 = {"Lt3/w;", "T", "", "<init>", "()V", "a", "Lt3/w$a;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC11507w<T> {

    /* JADX INFO: renamed from: t3.w$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lt3/w$a;", "T", "Lt3/w;", "Lkotlin/Function2;", "Lnt/b;", "", "transform", "Lku/x;", "ack", "Lt3/d0;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lku/x;Lt3/d0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", "d", "()Lkotlin/jvm/functions/Function2;", "b", "Lku/x;", "()Lku/x;", "c", "Lt3/d0;", "()Lt3/d0;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a<T> extends AbstractC11507w<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function2<T, InterfaceC9557b<? super T>, Object> transform;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7937x<T> ack;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final AbstractC11481d0<T> lastState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final CoroutineContext callerContext;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> transform, @NotNull InterfaceC7937x<T> ack, @Nullable AbstractC11481d0<T> abstractC11481d0, @NotNull CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = abstractC11481d0;
            this.callerContext = callerContext;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC7937x<T> m43067a() {
            return this.ack;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public AbstractC11481d0<T> m43069c() {
            return this.lastState;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Function2<T, InterfaceC9557b<? super T>, Object> m43070d() {
            return this.transform;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: t3.w.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC11507w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC11507w() {
    }
}

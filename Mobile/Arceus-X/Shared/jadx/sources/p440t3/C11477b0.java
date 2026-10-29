package p440t3;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import mu.C8675j;
import mu.C8676k;
import mu.C8683r;
import mu.InterfaceC8672g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Lt3/b0;", "T", "", "Lku/p0;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lnt/b;", "consumeMessage", "<init>", "(Lku/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", NotificationCompat.CATEGORY_MESSAGE, "e", "(Ljava/lang/Object;)V", "a", "Lku/p0;", "b", "Lkotlin/jvm/functions/Function2;", "Lmu/g;", "c", "Lmu/g;", "messageQueue", "Lt3/b;", "d", "Lt3/b;", "remainingMessages", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11477b0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, InterfaceC9557b<? super Unit>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8672g<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C11476b remainingMessages;

    /* JADX INFO: renamed from: t3.b0$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "", "ex", "", "a", "(Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<Throwable, Unit> f40530i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C11477b0<T> f40531j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Function2<T, Throwable, Unit> f40532k;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1, C11477b0<T> c11477b0, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f40530i = function1;
            this.f40531j = c11477b0;
            this.f40532k = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m42965a(@Nullable Throwable th2) {
            Unit unit;
            this.f40530i.invoke(th2);
            this.f40531j.messageQueue.mo34802F(th2);
            do {
                Object objM34933f = C8676k.m34933f(this.f40531j.messageQueue.mo34796C());
                if (objM34933f != null) {
                    this.f40532k.invoke((T) objM34933f, th2);
                    unit = Unit.f29331a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m42965a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: t3.b0$b */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.SimpleActor$offer$2", m39664f = "SimpleActor.kt", m39665l = {121, 121}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40533t;

        /* JADX INFO: renamed from: u */
        public int f40534u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11477b0<T> f40535v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11477b0<T> c11477b0, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40535v = c11477b0;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f40535v, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Function2 function2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40534u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (this.f40535v.remainingMessages.m42957b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                C7910q0.m32892h(this.f40535v.scope);
                function2 = this.f40535v.consumeMessage;
                InterfaceC8672g interfaceC8672g = this.f40535v.messageQueue;
                this.f40533t = function2;
                this.f40534u = 1;
                obj = interfaceC8672g.mo34798D(this);
                if (obj != objM38805e) {
                    this.f40533t = null;
                    this.f40534u = 2;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                function2 = (Function2) this.f40533t;
                C7348o.m30470b(obj);
                this.f40533t = null;
                this.f40534u = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            if (this.f40535v.remainingMessages.m42956a() == 0) {
                return Unit.f29331a;
            }
            C7910q0.m32892h(this.f40535v.scope);
            function2 = this.f40535v.consumeMessage;
            InterfaceC8672g interfaceC8672g2 = this.f40535v.messageQueue;
            this.f40533t = function2;
            this.f40534u = 1;
            obj = interfaceC8672g2.mo34798D(this);
            if (obj != objM38805e) {
                this.f40533t = null;
                this.f40534u = 2;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11477b0(@NotNull InterfaceC7906p0 scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = C8675j.m34927b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new C11476b(0);
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) scope.getCoroutineContext().get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            interfaceC7850d2.mo32601q(new a(onComplete, this, onUndeliveredElement));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42964e(T msg) throws Throwable {
        Object objMo34870w = this.messageQueue.mo34870w(msg);
        if (objMo34870w instanceof C8676k.Closed) {
            Throwable thM34932e = C8676k.m34932e(objMo34870w);
            if (thM34932e != null) {
                throw thM34932e;
            }
            throw new C8683r("Channel was closed normally");
        }
        if (!C8676k.m34936i(objMo34870w)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.m42958c() == 0) {
            C7882k.m32780d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}

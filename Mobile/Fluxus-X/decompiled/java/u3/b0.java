package u3;

import av.d2;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lu3/b0;", "T", BuildConfig.FLAVOR, "Lav/p0;", "scope", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Leu/b;", "consumeMessage", "<init>", "(Lav/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Lav/p0;", "b", "Lkotlin/jvm/functions/Function2;", "Lcv/g;", "c", "Lcv/g;", "messageQueue", "Lu3/b;", "d", "Lu3/b;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, eu.b<? super Unit>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cv.g<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u3.b remainingMessages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", BuildConfig.FLAVOR, "ex", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Unit> f32916i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b0<T> f32917j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Throwable, Unit> f32918k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1, b0<T> b0Var, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f32916i = function1;
            this.f32917j = b0Var;
            this.f32918k = function2;
        }

        public final void a(@Nullable Throwable th2) {
            Unit unit;
            this.f32916i.invoke(th2);
            this.f32917j.messageQueue.G(th2);
            do {
                Object objF = cv.k.f(this.f32917j.messageQueue.F());
                if (objF != null) {
                    this.f32918k.invoke((T) objF, th2);
                    unit = Unit.f21506a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32919t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32920u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b0<T> f32921v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0<T> b0Var, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f32921v = b0Var;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new b(this.f32921v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Function2 function2;
            Object objE = fu.c.e();
            int i10 = this.f32920u;
            if (i10 == 0) {
                zt.o.b(obj);
                if (this.f32921v.remainingMessages.b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                q0.h(this.f32921v.scope);
                function2 = this.f32921v.consumeMessage;
                cv.g gVar = this.f32921v.messageQueue;
                this.f32919t = function2;
                this.f32920u = 1;
                obj = gVar.x(this);
                if (obj != objE) {
                    this.f32919t = null;
                    this.f32920u = 2;
                }
                return objE;
            }
            if (i10 == 1) {
                function2 = (Function2) this.f32919t;
                zt.o.b(obj);
                this.f32919t = null;
                this.f32920u = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            if (this.f32921v.remainingMessages.a() == 0) {
                return Unit.f21506a;
            }
            q0.h(this.f32921v.scope);
            function2 = this.f32921v.consumeMessage;
            cv.g gVar2 = this.f32921v.messageQueue;
            this.f32919t = function2;
            this.f32920u = 1;
            obj = gVar2.x(this);
            if (obj != objE) {
                this.f32919t = null;
                this.f32920u = 2;
            }
            return objE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull p0 scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super eu.b<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = cv.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new u3.b(0);
        d2 d2Var = (d2) scope.getCoroutineContext().get(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.o(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T msg) throws Throwable {
        Object objV = this.messageQueue.v(msg);
        if (objV instanceof cv.k.Closed) {
            Throwable thE = cv.k.e(objV);
            if (thE != null) {
                throw thE;
            }
            throw new cv.r("Channel was closed normally");
        }
        if (!cv.k.i(objV)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            av.k.d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}

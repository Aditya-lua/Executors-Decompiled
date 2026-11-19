package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldv/b;", "T", "Ldv/f;", "Lkotlin/Function2;", "Lcv/v;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "block", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "capacity", "Lcv/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILcv/a;)V", "scope", "d", "(Lcv/v;Leu/b;)Ljava/lang/Object;", "Lev/e;", "e", "(Lkotlin/coroutines/CoroutineContext;ILcv/a;)Lev/e;", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> extends f<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<cv.v<? super T>, eu.b<? super Unit>, Object> block;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12725t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12726u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f12727v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12728w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, eu.b<? super a> bVar2) {
            super(bVar2);
            this.f12727v = bVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12726u = obj;
            this.f12728w |= Integer.MIN_VALUE;
            return this.f12727v.d(null, this);
        }
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i10, cv.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? p001kotlin.coroutines.e.f21548a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? cv.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv.f, kotlin.e
    @Nullable
    public Object d(@NotNull cv.v<? super T> vVar, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f12728w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12728w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, bVar);
            }
        } else {
            aVar = new a(this, bVar);
        }
        Object obj = aVar.f12726u;
        Object objE = fu.c.e();
        int i11 = aVar.f12728w;
        if (i11 == 0) {
            zt.o.b(obj);
            aVar.f12725t = vVar;
            aVar.f12728w = 1;
            if (super.d(vVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (cv.v) aVar.f12725t;
            zt.o.b(obj);
        }
        if (vVar.H()) {
            return Unit.f21506a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // dv.f, kotlin.e
    @NotNull
    public kotlin.e<T> e(@NotNull CoroutineContext context, int capacity, @NotNull cv.a onBufferOverflow) {
        return new b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function2<? super cv.v<? super T>, ? super eu.b<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull cv.a aVar) {
        super(function2, coroutineContext, i10, aVar);
        this.block = function2;
    }
}

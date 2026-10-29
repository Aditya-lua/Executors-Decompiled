package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.AbstractC10055e;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lnu/b;", "T", "Lnu/f;", "Lkotlin/Function2;", "Lmu/v;", "Lnt/b;", "", "", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "e", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9563b<T> extends C9571f<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC8687v<? super T>, InterfaceC9557b<? super Unit>, Object> block;

    /* JADX INFO: renamed from: nu.b$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m39664f = "Builders.kt", m39665l = {330}, m39666m = "collectTo")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34554t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34555u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C9563b<T> f34556v;

        /* JADX INFO: renamed from: w */
        public int f34557w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9563b<T> c9563b, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f34556v = c9563b;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34555u = obj;
            this.f34557w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f34556v.mo37705d(null, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r1v0 kotlin.jvm.functions.Function2)
      (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r2v0 kotlin.coroutines.CoroutineContext))
      (wrap int:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x000f: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r4v0 mu.a))
     A[MD:(kotlin.jvm.functions.Function2<? super mu.v<? super T>, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: nu.b.<init>(kotlin.jvm.functions.Function2, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9563b(Function2 function2, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nu.C9571f, p617ou.AbstractC10055e
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f34557w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f34557w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(this, interfaceC9557b);
            }
        } else {
            aVar = new a(this, interfaceC9557b);
        }
        Object obj = aVar.f34555u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f34557w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            aVar.f34554t = interfaceC8687v;
            aVar.f34557w = 1;
            if (super.mo37705d(interfaceC8687v, aVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC8687v = (InterfaceC8687v) aVar.f34554t;
            C7348o.m30470b(obj);
        }
        if (interfaceC8687v.mo34806I()) {
            return Unit.f29331a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // nu.C9571f, p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C9563b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super mu.v<? super T>, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9563b(@NotNull Function2<? super InterfaceC8687v<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(function2, coroutineContext, i10, enumC8666a);
        this.block = function2;
    }
}

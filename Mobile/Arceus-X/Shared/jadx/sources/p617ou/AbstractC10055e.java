package p617ou;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.C8685t;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import mu.InterfaceC8689x;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7910q0;
import p256ku.C7922t0;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m31665d2 = {"Lou/e;", "T", "Lou/q;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lnu/h;", "h", "()Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "Lmu/v;", "scope", "", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Lku/p0;", "Lmu/x;", "m", "(Lku/p0;)Lmu/x;", "Lnu/i;", "collector", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "", "b", "()Ljava/lang/String;", "toString", "a", "Lkotlin/coroutines/CoroutineContext;", "I", "c", "Lmu/a;", "Lkotlin/Function2;", "Lnt/b;", "", "k", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "l", "()I", "produceCapacity", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC10055e<T> implements InterfaceC10067q<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final EnumC8666a onBufferOverflow;

    /* JADX INFO: renamed from: ou.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m39664f = "ChannelFlow.kt", m39665l = {119}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36202t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36203u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9577i<T> f36204v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC10055e<T> f36205w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9577i<? super T> interfaceC9577i, AbstractC10055e<T> abstractC10055e, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36204v = interfaceC9577i;
            this.f36205w = abstractC10055e;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f36204v, this.f36205w, interfaceC9557b);
            aVar.f36203u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36202t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f36203u;
                InterfaceC9577i<T> interfaceC9577i = this.f36204v;
                InterfaceC8689x<T> interfaceC8689xMo37715m = this.f36205w.mo37715m(interfaceC7906p0);
                this.f36202t = 1;
                if (C9579j.m37799p(interfaceC9577i, interfaceC8689xMo37715m, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ou.e$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lmu/v;", "it", "", "<anonymous>", "(Lmu/v;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m39664f = "ChannelFlow.kt", m39665l = {56}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC8687v<? super T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36206t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36207u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC10055e<T> f36208v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC10055e<T> abstractC10055e, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36208v = abstractC10055e;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f36208v, interfaceC9557b);
            bVar.f36207u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36206t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8687v<? super T> interfaceC8687v = (InterfaceC8687v) this.f36207u;
                AbstractC10055e<T> abstractC10055e = this.f36208v;
                this.f36206t = 1;
                if (abstractC10055e.mo37705d(interfaceC8687v, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8687v<? super T> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC8687v, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public AbstractC10055e(@NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = enumC8666a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ <T> Object m38816c(AbstractC10055e<T> abstractC10055e, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32891g = C7910q0.m32891g(new a(interfaceC9577i, abstractC10055e, null), interfaceC9557b);
        return objM32891g == C10047c.m38805e() ? objM32891g : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo37713b() {
        return null;
    }

    @Override // nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m38816c(this, interfaceC9577i, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p617ou.InterfaceC10067q
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC9575h<T> mo37711e(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        CoroutineContext coroutineContextPlus = context.plus(this.context);
        if (onBufferOverflow == EnumC8666a.SUSPEND) {
            int i10 = this.capacity;
            if (i10 != -3) {
                if (capacity == -3) {
                    capacity = i10;
                } else if (i10 != -2) {
                    if (capacity == -2) {
                        capacity = i10;
                    } else {
                        capacity += i10;
                        if (capacity < 0) {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (Intrinsics.m31980c(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : mo37706f(coroutineContextPlus, capacity, onBufferOverflow);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow);

    @Nullable
    /* JADX INFO: renamed from: h */
    public InterfaceC9575h<T> mo37714h() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Function2<InterfaceC8687v<? super T>, InterfaceC9557b<? super Unit>, Object> m38817k() {
        return new b(this, null);
    }

    /* JADX INFO: renamed from: l */
    public final int m38818l() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC8689x<T> mo37715m(@NotNull InterfaceC7906p0 scope) {
        return C8685t.m34968e(scope, this.context, m38818l(), this.onBufferOverflow, EnumC7914r0.ATOMIC, null, m38817k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo37713b = mo37713b();
        if (strMo37713b != null) {
            arrayList.add(strMo37713b);
        }
        if (this.context != C7721e.f29393a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != EnumC8666a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return C7922t0.m32908a(this) + '[' + CollectionsKt.m31715m0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}

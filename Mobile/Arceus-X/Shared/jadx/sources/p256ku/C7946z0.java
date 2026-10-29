package p256ku;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ku.z0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"", "a", "(Lnt/b;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLnt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lku/y0;", "d", "(Lkotlin/coroutines/CoroutineContext;)Lku/y0;", "delay", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7946z0 {

    /* JADX INFO: renamed from: ku.z0$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.DelayKt", m39664f = "Delay.kt", m39665l = {160}, m39666m = "awaitCancellation")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f29816t;

        /* JADX INFO: renamed from: u */
        public int f29817u;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29816t = obj;
            this.f29817u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7946z0.m32937a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m32937a(@NotNull InterfaceC9557b<?> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f29817u;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f29817u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f29816t;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f29817u;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            aVar.f29817u = 1;
            C7905p c7905p = new C7905p(C10046b.m38803c(aVar), 1);
            c7905p.m32860H();
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(aVar);
            }
            if (objM32857A == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        throw new C7334d();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m32938b(long j10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (j10 <= 0) {
            return Unit.f29331a;
        }
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        if (j10 < Long.MAX_VALUE) {
            m32940d(c7905p.getContext()).mo32841o(j10, c7905p);
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m32939c(long j10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32938b = m32938b(m32941e(j10), interfaceC9557b);
        return objM32938b == C10047c.m38805e() ? objM32938b : Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC7942y0 m32940d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(InterfaceC7720d.INSTANCE);
        InterfaceC7942y0 interfaceC7942y0 = element instanceof InterfaceC7942y0 ? (InterfaceC7942y0) element : null;
        return interfaceC7942y0 == null ? C7930v0.m32922a() : interfaceC7942y0;
    }

    /* JADX INFO: renamed from: e */
    public static final long m32941e(long j10) {
        boolean zM32325K = C7800a.m32325K(j10);
        if (zM32325K) {
            return C7800a.m32348w(C7800a.m32327M(j10, C7801b.m32372q(999999L, EnumC7361b.NANOSECONDS)));
        }
        if (zM32325K) {
            throw new C7345l();
        }
        return 0L;
    }
}

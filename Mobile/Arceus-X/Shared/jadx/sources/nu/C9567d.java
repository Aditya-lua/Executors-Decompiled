package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7865g2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lnu/d;", "T", "Lnu/c;", "Lnu/h;", "flow", "<init>", "(Lnu/h;)V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9567d<T> implements InterfaceC9565c<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<T> flow;

    /* JADX INFO: renamed from: nu.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9577i<T> f34559a;

        /* JADX INFO: renamed from: nu.d$a$a, reason: collision with other inner class name */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m39664f = "Context.kt", m39665l = {278}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14205a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34560t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ a<T> f34561u;

            /* JADX INFO: renamed from: v */
            public int f34562v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.d$a<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14205a(a<? super T> aVar, InterfaceC9557b<? super C14205a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34561u = aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34560t = obj;
                this.f34562v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34561u.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9577i<? super T> interfaceC9577i) {
            this.f34559a = interfaceC9577i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9577i
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            C14205a c14205a;
            if (interfaceC9557b instanceof C14205a) {
                c14205a = (C14205a) interfaceC9557b;
                int i10 = c14205a.f34562v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c14205a.f34562v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c14205a = new C14205a(this, interfaceC9557b);
                }
            } else {
                c14205a = new C14205a(this, interfaceC9557b);
            }
            Object obj = c14205a.f34560t;
            Object objM38805e = C10047c.m38805e();
            int i11 = c14205a.f34562v;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                C7865g2.m32652f(c14205a.getContext());
                InterfaceC9577i<T> interfaceC9577i = this.f34559a;
                c14205a.f34562v = 1;
                if (interfaceC9577i.emit(t8, c14205a) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9567d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        this.flow = interfaceC9575h;
    }

    @Override // nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objCollect = this.flow.collect(new a(interfaceC9577i), interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }
}

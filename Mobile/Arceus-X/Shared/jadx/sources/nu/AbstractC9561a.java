package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.C10072v;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m31665d2 = {"Lnu/a;", "T", "Lnu/h;", "Lnu/c;", "<init>", "()V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC9561a<T> implements InterfaceC9575h<T>, InterfaceC9565c<T> {

    /* JADX INFO: renamed from: nu.a$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.AbstractFlow", m39664f = "Flow.kt", m39665l = {226}, m39666m = "collect")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34535t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34536u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC9561a<T> f34537v;

        /* JADX INFO: renamed from: w */
        public int f34538w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC9561a<T> abstractC9561a, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f34537v = abstractC9561a;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34536u = obj;
            this.f34538w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f34537v.collect(null, this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo37702b(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nu.InterfaceC9575h
    @Nullable
    public final Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        a aVar;
        Throwable th2;
        C10072v c10072v;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f34538w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f34538w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(this, interfaceC9557b);
            }
        } else {
            aVar = new a(this, interfaceC9557b);
        }
        Object obj = aVar.f34536u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f34538w;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10072v = (C10072v) aVar.f34535t;
            try {
                C7348o.m30470b(obj);
                c10072v.releaseIntercepted();
                return Unit.f29331a;
            } catch (Throwable th3) {
                th2 = th3;
                c10072v.releaseIntercepted();
                throw th2;
            }
        }
        C7348o.m30470b(obj);
        C10072v c10072v2 = new C10072v(interfaceC9577i, aVar.getContext());
        try {
            aVar.f34535t = c10072v2;
            aVar.f34538w = 1;
            if (mo37702b(c10072v2, aVar) == objM38805e) {
                return objM38805e;
            }
            c10072v = c10072v2;
            c10072v.releaseIntercepted();
            return Unit.f29331a;
        } catch (Throwable th4) {
            th2 = th4;
            c10072v = c10072v2;
            c10072v.releaseIntercepted();
            throw th2;
        }
    }
}

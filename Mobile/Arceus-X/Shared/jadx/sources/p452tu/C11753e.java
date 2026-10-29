package p452tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: tu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Ltu/e;", "R", "Ltu/k;", "Lnt/b;", "uCont", "<init>", "(Lnt/b;)V", "", "B", "()Ljava/lang/Object;", "", "e", "", "C", "(Ljava/lang/Throwable;)V", "Lku/p;", "g", "Lku/p;", "cont", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11753e<R> extends C11759k<R> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C7905p<R> cont;

    /* JADX INFO: renamed from: tu.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", m39664f = "SelectOld.kt", m39665l = {39}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41426t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C11753e<R> f41427u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11753e<R> c11753e, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41427u = c11753e;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f41427u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41426t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11753e<R> c11753e = this.f41427u;
                    this.f41426t = 1;
                    obj = c11753e.m44016o(this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                C11762n.m44042c(this.f41427u.cont, obj);
                return Unit.f29331a;
            } catch (Throwable th2) {
                C11762n.m44043d(this.f41427u.cont, th2);
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11753e(@NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        super(interfaceC9557b.getContext());
        this.cont = new C7905p<>(C10046b.m38803c(interfaceC9557b), 1);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m43996B() {
        if (this.cont.mo32812d()) {
            return this.cont.m32857A();
        }
        C7882k.m32780d(C7910q0.m32885a(getContext()), null, EnumC7914r0.UNDISPATCHED, new a(this, null), 1, null);
        return this.cont.m32857A();
    }

    /* JADX INFO: renamed from: C */
    public final void m43997C(@NotNull Throwable e10) {
        C7905p<R> c7905p = this.cont;
        C7347n.Companion companion = C7347n.INSTANCE;
        c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(e10)));
    }
}

package p096e7;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0978r;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: e7.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroidx/lifecycle/l;", "", "a", "(Landroidx/lifecycle/l;Lnt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/r;", "observer", "b", "(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4873s {

    /* JADX INFO: renamed from: e7.s$a */
    @InterfaceC10344f(m39663c = "coil3.util.LifecyclesKt", m39664f = "lifecycles.kt", m39665l = {42}, m39666m = "awaitStarted")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f19562t;

        /* JADX INFO: renamed from: u */
        public Object f19563u;

        /* JADX INFO: renamed from: v */
        public int f19564v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f19565w;

        /* JADX INFO: renamed from: x */
        public int f19566x;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19565w = obj;
            this.f19566x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4873s.m23482a(null, this);
        }
    }

    /* JADX INFO: renamed from: e7.s$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"e7/s$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0954f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<Unit> f19567a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC7897n<? super Unit> interfaceC7897n) {
            this.f19567a = interfaceC7897n;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s owner) {
            InterfaceC7897n<Unit> interfaceC7897n = this.f19567a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, e7.s$b, java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m23482a(@NotNull AbstractC0966l abstractC0966l, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        a aVar;
        AbstractC0966l abstractC0966l2;
        C7729c0 c7729c0;
        Throwable th2;
        InterfaceC0978r interfaceC0978r;
        InterfaceC0978r interfaceC0978r2;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f19566x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f19566x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f19565w;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f19566x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c0 = (C7729c0) aVar.f19563u;
            abstractC0966l2 = (AbstractC0966l) aVar.f19562t;
            try {
                C7348o.m30470b(obj);
                interfaceC0978r2 = (InterfaceC0978r) c7729c0.f29425a;
                if (interfaceC0978r2 != null) {
                    abstractC0966l2.mo4938d(interfaceC0978r2);
                }
                return Unit.f29331a;
            } catch (Throwable th3) {
                th2 = th3;
                interfaceC0978r = (InterfaceC0978r) c7729c0.f29425a;
                if (interfaceC0978r != null) {
                    abstractC0966l2.mo4938d(interfaceC0978r);
                }
                throw th2;
            }
        }
        C7348o.m30470b(obj);
        if (abstractC0966l.getState().m4945b(AbstractC0966l.b.STARTED)) {
            return Unit.f29331a;
        }
        C7729c0 c7729c1 = new C7729c0();
        try {
            aVar.f19562t = abstractC0966l;
            aVar.f19563u = c7729c1;
            aVar.f19564v = 0;
            aVar.f19566x = 1;
            C7905p c7905p = new C7905p(C10046b.m38803c(aVar), 1);
            c7905p.m32860H();
            ?? bVar = new b(c7905p);
            c7729c1.f29425a = bVar;
            Intrinsics.checkNotNull(bVar);
            abstractC0966l.mo4935a((InterfaceC0978r) bVar);
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(aVar);
            }
            if (objM32857A == objM38805e) {
                return objM38805e;
            }
            abstractC0966l2 = abstractC0966l;
            c7729c0 = c7729c1;
            interfaceC0978r2 = (InterfaceC0978r) c7729c0.f29425a;
            if (interfaceC0978r2 != null) {
                abstractC0966l2.mo4938d(interfaceC0978r2);
            }
            return Unit.f29331a;
        } catch (Throwable th4) {
            abstractC0966l2 = abstractC0966l;
            c7729c0 = c7729c1;
            th2 = th4;
            interfaceC0978r = (InterfaceC0978r) c7729c0.f29425a;
            if (interfaceC0978r != null) {
                abstractC0966l2.mo4938d(interfaceC0978r);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23483b(@NotNull AbstractC0966l abstractC0966l, @NotNull InterfaceC0978r interfaceC0978r) {
        abstractC0966l.mo4938d(interfaceC0978r);
        abstractC0966l.mo4935a(interfaceC0978r);
    }
}

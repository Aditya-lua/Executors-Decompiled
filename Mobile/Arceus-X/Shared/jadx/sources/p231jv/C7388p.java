package p231jv;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7336e;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: jv.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"", "T", "Ljv/d;", "a", "(Ljv/d;Lnt/b;)Ljava/lang/Object;", "b", "", "d", "Ljv/x;", "c", "", "", "e", "(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;", "retrofit"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7388p {

    /* JADX INFO: renamed from: jv.p$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7376d<T> f28331a;

        public a(InterfaceC7376d<T> interfaceC7376d) {
            this.f28331a = interfaceC7376d;
        }

        /* JADX INFO: renamed from: a */
        public final void m30601a(Throwable th2) {
            this.f28331a.cancel();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m30601a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jv.p$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"jv/p$b", "Ljv/f;", "Ljv/d;", NotificationCompat.CATEGORY_CALL, "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC7378f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<T> f28332a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC7897n<? super T> interfaceC7897n) {
            this.f28332a = interfaceC7897n;
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<T> call, C7396x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.m30657g()) {
                InterfaceC7897n<T> interfaceC7897n = this.f28332a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(new C7385m(response))));
                return;
            }
            T tM30653a = response.m30653a();
            if (tM30653a != null) {
                this.f28332a.resumeWith(C7347n.m30460b(tM30653a));
                return;
            }
            Object objTag = call.request().tag(C7387o.class);
            Intrinsics.checkNotNull(objTag);
            C7387o c7387o = (C7387o) objTag;
            C7336e c7336e = new C7336e("Response from " + c7387o.m30595b().getName() + '.' + c7387o.m30594a().getName() + " was null but response body type was declared as non-null");
            InterfaceC7897n<T> interfaceC7897n2 = this.f28332a;
            C7347n.Companion companion2 = C7347n.INSTANCE;
            interfaceC7897n2.resumeWith(C7347n.m30460b(C7348o.m30469a(c7336e)));
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            InterfaceC7897n<T> interfaceC7897n = this.f28332a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(t8)));
        }
    }

    /* JADX INFO: renamed from: jv.p$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7376d<T> f28333a;

        public c(InterfaceC7376d<T> interfaceC7376d) {
            this.f28333a = interfaceC7376d;
        }

        /* JADX INFO: renamed from: a */
        public final void m30602a(Throwable th2) {
            this.f28333a.cancel();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m30602a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jv.p$d */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"jv/p$d", "Ljv/f;", "Ljv/d;", NotificationCompat.CATEGORY_CALL, "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d<T> implements InterfaceC7378f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<T> f28334a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC7897n<? super T> interfaceC7897n) {
            this.f28334a = interfaceC7897n;
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<T> call, C7396x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m30657g()) {
                InterfaceC7897n<T> interfaceC7897n = this.f28334a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(response.m30653a()));
            } else {
                InterfaceC7897n<T> interfaceC7897n2 = this.f28334a;
                C7347n.Companion companion2 = C7347n.INSTANCE;
                interfaceC7897n2.resumeWith(C7347n.m30460b(C7348o.m30469a(new C7385m(response))));
            }
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            InterfaceC7897n<T> interfaceC7897n = this.f28334a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(t8)));
        }
    }

    /* JADX INFO: renamed from: jv.p$e */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class e implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7376d<T> f28335a;

        public e(InterfaceC7376d<T> interfaceC7376d) {
            this.f28335a = interfaceC7376d;
        }

        /* JADX INFO: renamed from: a */
        public final void m30603a(Throwable th2) {
            this.f28335a.cancel();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m30603a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jv.p$f */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"jv/p$f", "Ljv/f;", "Ljv/d;", NotificationCompat.CATEGORY_CALL, "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class f<T> implements InterfaceC7378f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<C7396x<T>> f28336a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super jv.x<T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC7897n<? super C7396x<T>> interfaceC7897n) {
            this.f28336a = interfaceC7897n;
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<T> call, C7396x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f28336a.resumeWith(C7347n.m30460b(response));
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            InterfaceC7897n<C7396x<T>> interfaceC7897n = this.f28336a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(t8)));
        }
    }

    /* JADX INFO: renamed from: jv.p$g */
    @InterfaceC10344f(m39663c = "retrofit2.KotlinExtensions", m39664f = "KotlinExtensions.kt", m39665l = {119}, m39666m = "suspendAndThrow")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f28337t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f28338u;

        /* JADX INFO: renamed from: v */
        public int f28339v;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28338u = obj;
            this.f28339v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7388p.m30600e(null, this);
        }
    }

    /* JADX INFO: renamed from: jv.p$h */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9557b<?> f28340a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f28341b;

        public h(InterfaceC9557b<?> interfaceC9557b, Throwable th2) {
            this.f28340a = interfaceC9557b;
            this.f28341b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC9557b interfaceC9557bM38803c = C10046b.m38803c(this.f28340a);
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC9557bM38803c.resumeWith(C7347n.m30460b(C7348o.m30469a(this.f28341b)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m30596a(@NotNull InterfaceC7376d<T> interfaceC7376d, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c7905p.mo32815n(new a(interfaceC7376d));
        interfaceC7376d.mo30571B(new b(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m30597b(@NotNull InterfaceC7376d<T> interfaceC7376d, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c7905p.mo32815n(new c(interfaceC7376d));
        interfaceC7376d.mo30571B(new d(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m30598c(@NotNull InterfaceC7376d<T> interfaceC7376d, @NotNull InterfaceC9557b<? super C7396x<T>> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c7905p.mo32815n(new e(interfaceC7376d));
        interfaceC7376d.mo30571B(new f(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Object m30599d(@NotNull InterfaceC7376d<Unit> interfaceC7376d, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Intrinsics.m31981d(interfaceC7376d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return m30597b(interfaceC7376d, interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m30600e(@NotNull Throwable th2, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        g gVar;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f28339v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f28339v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object obj = gVar.f28338u;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar.f28339v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            gVar.f28337t = th2;
            gVar.f28339v = 1;
            C7864g1.m32643a().mo6246w(gVar.getContext(), new h(gVar, th2));
            Object objM38805e2 = C10047c.m38805e();
            if (objM38805e2 == C10047c.m38805e()) {
                C10346h.m39673c(gVar);
            }
            if (objM38805e2 == objM38805e) {
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
}

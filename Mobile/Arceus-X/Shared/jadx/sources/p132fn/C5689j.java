package p132fn;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p064d1.C4406k;
import p140g0.C5891h1;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7835a2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fn.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lfn/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5689j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5689j f21847a = new C5689j();

    /* JADX INFO: renamed from: fn.j$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraHelper", m39664f = "CameraHelper.kt", m39665l = {13, 16, 20}, m39666m = "unbind")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f21848t;

        /* JADX INFO: renamed from: u */
        public Object f21849u;

        /* JADX INFO: renamed from: v */
        public Object f21850v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f21851w;

        /* JADX INFO: renamed from: y */
        public int f21853y;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21851w = obj;
            this.f21853y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C5689j.this.m25813b(null, this);
        }
    }

    /* JADX INFO: renamed from: fn.j$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", m39664f = "CameraHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21854t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C4406k f21855u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4406k c4406k, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21855u = c4406k;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f21855u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f21854t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                this.f21855u.m22142h();
            } catch (C5891h1 unused) {
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fn.j$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lne/x;", "Ld1/k;", "<anonymous>", "(Lku/p0;)Lne/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", m39664f = "CameraHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceFutureC9440x<C4406k>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21856t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f21857u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21857u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f21857u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f21856t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C4406k.INSTANCE.m22147c(this.f21857u);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceFutureC9440x<C4406k>> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C4406k m25812c(InterfaceFutureC9440x interfaceFutureC9440x) {
        return (C4406k) interfaceFutureC9440x.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (p256ku.C7872i.m32684g(r5, r6, r0) == r1) goto L27;
     */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m25813b(@NotNull Context context, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        Context context2;
        InterfaceFutureC9440x interfaceFutureC9440x;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f21853y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f21853y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM32684g = aVar.f21851w;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f21853y;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
            c cVar = new c(context, null);
            aVar.f21848t = C10350l.m39676a(context);
            aVar.f21853y = 1;
            objM32684g = C7872i.m32684g(abstractC7900n2M32645c, cVar, aVar);
            if (objM32684g != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            context = (Context) aVar.f21848t;
            C7348o.m30470b(objM32684g);
        } else if (i11 == 2) {
            interfaceFutureC9440x = (InterfaceFutureC9440x) aVar.f21849u;
            context2 = (Context) aVar.f21848t;
            C7348o.m30470b(objM32684g);
            C4406k c4406k = (C4406k) objM32684g;
            AbstractC7900n2 abstractC7900n2M32645c2 = C7864g1.m32645c();
            b bVar = new b(c4406k, null);
            aVar.f21848t = C10350l.m39676a(context2);
            aVar.f21849u = C10350l.m39676a(interfaceFutureC9440x);
            aVar.f21850v = C10350l.m39676a(c4406k);
            aVar.f21853y = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return Unit.f29331a;
        final InterfaceFutureC9440x interfaceFutureC9440x2 = (InterfaceFutureC9440x) objM32684g;
        AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
        Function0 function0 = new Function0() { // from class: fn.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5689j.m25812c(interfaceFutureC9440x2);
            }
        };
        aVar.f21848t = C10350l.m39676a(context);
        aVar.f21849u = C10350l.m39676a(interfaceFutureC9440x2);
        aVar.f21853y = 2;
        Object objM32562b = C7835a2.m32562b(abstractC7888l0M32644b, function0, aVar);
        if (objM32562b != objM38805e) {
            context2 = context;
            interfaceFutureC9440x = interfaceFutureC9440x2;
            objM32684g = objM32562b;
            C4406k c4406k2 = (C4406k) objM32684g;
            AbstractC7900n2 abstractC7900n2M32645c3 = C7864g1.m32645c();
            b bVar2 = new b(c4406k2, null);
            aVar.f21848t = C10350l.m39676a(context2);
            aVar.f21849u = C10350l.m39676a(interfaceFutureC9440x);
            aVar.f21850v = C10350l.m39676a(c4406k2);
            aVar.f21853y = 3;
        }
        return objM38805e;
    }
}

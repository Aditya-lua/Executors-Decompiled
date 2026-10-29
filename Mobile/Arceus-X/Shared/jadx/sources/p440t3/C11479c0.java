package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006\""}, m31665d2 = {"Lt3/c0;", "Lt3/t;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lnt/b;", "", "block", "b", "(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "d", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "c", "(Lnt/b;)Ljava/lang/Object;", "e", "a", "Ljava/lang/String;", "Luu/a;", "Luu/a;", "mutex", "Lt3/b;", "Lt3/b;", "version", "Lnu/h;", "", "Lnu/h;", "()Lnu/h;", "updateNotifications", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11479c0 implements InterfaceC11504t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C11476b version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<Unit> updateNotifications;

    /* JADX INFO: renamed from: t3.c0$a */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.SingleProcessCoordinator", m39664f = "SingleProcessCoordinator.kt", m39665l = {66, 41}, m39666m = "lock")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40540t;

        /* JADX INFO: renamed from: u */
        public Object f40541u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40542v;

        /* JADX INFO: renamed from: x */
        public int f40544x;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40542v = obj;
            this.f40544x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11479c0.this.mo42967b(null, this);
        }
    }

    /* JADX INFO: renamed from: t3.c0$b */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.SingleProcessCoordinator", m39664f = "SingleProcessCoordinator.kt", m39665l = {50}, m39666m = "tryLock")
    public static final class b<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40545t;

        /* JADX INFO: renamed from: u */
        public boolean f40546u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40547v;

        /* JADX INFO: renamed from: x */
        public int f40549x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40547v = obj;
            this.f40549x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11479c0.this.mo42969d(null, this);
        }
    }

    /* JADX INFO: renamed from: t3.c0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m39664f = "SingleProcessCoordinator.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super Unit>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40550t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f40550t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC9577i<? super Unit> interfaceC9577i, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11479c0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = C11976g.m44697b(false, 1, null);
        this.version = new C11476b(0);
        this.updateNotifications = C9579j.m37806w(new c(null));
    }

    @Override // p440t3.InterfaceC11504t
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC9575h<Unit> mo42966a() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p440t3.InterfaceC11504t
    @Nullable
    /* JADX INFO: renamed from: b */
    public <T> Object mo42967b(@NotNull Function1<? super InterfaceC9557b<? super T>, ? extends Object> function1, @NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
        a aVar;
        InterfaceC11970a interfaceC11970a;
        Throwable th2;
        InterfaceC11970a interfaceC11970a2;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40544x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40544x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f40542v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40544x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = this.mutex;
                aVar.f40540t = function1;
                aVar.f40541u = interfaceC11970a;
                aVar.f40544x = 1;
                if (interfaceC11970a.mo44674f(null, aVar) != objM38805e) {
                }
                return objM38805e;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11970a2 = (InterfaceC11970a) aVar.f40540t;
                try {
                    C7348o.m30470b(obj);
                    interfaceC11970a2.mo44673e(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC11970a2.mo44673e(null);
                    throw th2;
                }
            }
            InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) aVar.f40541u;
            Function1<? super InterfaceC9557b<? super T>, ? extends Object> function2 = (Function1) aVar.f40540t;
            C7348o.m30470b(obj);
            interfaceC11970a = interfaceC11970a3;
            function1 = function2;
            aVar.f40540t = interfaceC11970a;
            aVar.f40541u = null;
            aVar.f40544x = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objM38805e) {
                InterfaceC11970a interfaceC11970a4 = interfaceC11970a;
                obj = objInvoke;
                interfaceC11970a2 = interfaceC11970a4;
                interfaceC11970a2.mo44673e(null);
                return obj;
            }
            return objM38805e;
        } catch (Throwable th4) {
            InterfaceC11970a interfaceC11970a5 = interfaceC11970a;
            th2 = th4;
            interfaceC11970a2 = interfaceC11970a5;
            interfaceC11970a2.mo44673e(null);
            throw th2;
        }
    }

    @Override // p440t3.InterfaceC11504t
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo42968c(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        return C10340b.m39661d(this.version.m42957b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p440t3.InterfaceC11504t
    @Nullable
    /* JADX INFO: renamed from: d */
    public <T> Object mo42969d(@NotNull Function2<? super Boolean, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
        b bVar;
        InterfaceC11970a interfaceC11970a;
        Throwable th2;
        boolean z10;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f40549x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f40549x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f40547v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f40549x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f40546u;
            interfaceC11970a = (InterfaceC11970a) bVar.f40545t;
            try {
                C7348o.m30470b(obj);
                if (z10) {
                    interfaceC11970a.mo44673e(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    interfaceC11970a.mo44673e(null);
                }
                throw th2;
            }
        }
        C7348o.m30470b(obj);
        InterfaceC11970a interfaceC11970a2 = this.mutex;
        boolean zMo44672d = interfaceC11970a2.mo44672d(null);
        try {
            Boolean boolM39658a = C10340b.m39658a(zMo44672d);
            bVar.f40545t = interfaceC11970a2;
            bVar.f40546u = zMo44672d;
            bVar.f40549x = 1;
            Object objInvoke = function2.invoke(boolM39658a, bVar);
            if (objInvoke == objM38805e) {
                return objM38805e;
            }
            interfaceC11970a = interfaceC11970a2;
            obj = objInvoke;
            z10 = zMo44672d;
            if (z10) {
                interfaceC11970a.mo44673e(null);
            }
            return obj;
        } catch (Throwable th4) {
            interfaceC11970a = interfaceC11970a2;
            th2 = th4;
            z10 = zMo44672d;
            if (z10) {
                interfaceC11970a.mo44673e(null);
            }
            throw th2;
        }
    }

    @Override // p440t3.InterfaceC11504t
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo42970e(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        return C10340b.m39661d(this.version.m42959d());
    }
}

package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7758y;
import org.jetbrains.annotations.NotNull;
import p229jt.C7334d;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.o0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lnu/o0;", "Lnu/m0;", "<init>", "()V", "Lnu/p0;", "", "subscriptionCount", "Lnu/h;", "Lnu/k0;", "a", "(Lnu/p0;)Lnu/h;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9590o0 implements InterfaceC9586m0 {

    /* JADX INFO: renamed from: nu.o0$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lnu/k0;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.StartedLazily$command$1", m39664f = "SharingStarted.kt", m39665l = {151}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super EnumC9582k0>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34630t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34631u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9592p0<Integer> f34632v;

        /* JADX INFO: renamed from: nu.o0$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14207a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7758y f34633a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC9577i<EnumC9582k0> f34634b;

            /* JADX INFO: renamed from: nu.o0$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m39664f = "SharingStarted.kt", m39665l = {154}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14208a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f34635t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C14207a<T> f34636u;

                /* JADX INFO: renamed from: v */
                public int f34637v;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.o0$a$a<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C14208a(C14207a<? super T> c14207a, InterfaceC9557b<? super C14208a> interfaceC9557b) {
                    super(interfaceC9557b);
                    this.f34636u = c14207a;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f34635t = obj;
                    this.f34637v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f34636u.m37841b(0, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super nu.k0> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14207a(C7758y c7758y, InterfaceC9577i<? super EnumC9582k0> interfaceC9577i) {
                this.f34633a = c7758y;
                this.f34634b = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX INFO: renamed from: b */
            public final Object m37841b(int i10, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14208a c14208a;
                if (interfaceC9557b instanceof C14208a) {
                    c14208a = (C14208a) interfaceC9557b;
                    int i11 = c14208a.f34637v;
                    if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14208a.f34637v = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14208a = new C14208a(this, interfaceC9557b);
                    }
                } else {
                    c14208a = new C14208a(this, interfaceC9557b);
                }
                Object obj = c14208a.f34635t;
                Object objM38805e = C10047c.m38805e();
                int i12 = c14208a.f34637v;
                if (i12 == 0) {
                    C7348o.m30470b(obj);
                    if (i10 > 0) {
                        C7758y c7758y = this.f34633a;
                        if (!c7758y.f29445a) {
                            c7758y.f29445a = true;
                            InterfaceC9577i<EnumC9582k0> interfaceC9577i = this.f34634b;
                            EnumC9582k0 enumC9582k0 = EnumC9582k0.START;
                            c14208a.f34637v = 1;
                            if (interfaceC9577i.emit(enumC9582k0, c14208a) == objM38805e) {
                                return objM38805e;
                            }
                        }
                    }
                    return Unit.f29331a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return Unit.f29331a;
            }

            @Override // nu.InterfaceC9577i
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                return m37841b(((Number) obj).intValue(), interfaceC9557b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC9592p0<Integer> interfaceC9592p0, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34632v = interfaceC9592p0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f34632v, interfaceC9557b);
            aVar.f34631u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f34630t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f34631u;
                C7758y c7758y = new C7758y();
                InterfaceC9592p0<Integer> interfaceC9592p0 = this.f34632v;
                C14207a c14207a = new C14207a(c7758y, interfaceC9577i);
                this.f34630t = 1;
                if (interfaceC9592p0.collect(c14207a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super EnumC9582k0> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Override // nu.InterfaceC9586m0
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC9575h<EnumC9582k0> mo37828a(@NotNull InterfaceC9592p0<Integer> subscriptionCount) {
        return C9579j.m37806w(new a(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}

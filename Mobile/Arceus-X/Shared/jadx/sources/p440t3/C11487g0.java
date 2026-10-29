package p440t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.g0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"T", "Lt3/f0;", "a", "(Lt3/f0;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11487g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: t3.g0$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m31665d2 = {"T", "Lt3/y;", "", "it", "<anonymous>"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.StorageConnectionKt$readData$2", m39664f = "StorageConnection.kt", m39665l = {74}, m39666m = "invokeSuspend")
    public static final class a<T> extends AbstractC10351m implements InterfaceC14057n<InterfaceC11509y<T>, Boolean, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40554t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40555u;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(3, interfaceC9557b);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return m42984q((InterfaceC11509y) obj, bool.booleanValue(), (InterfaceC9557b) obj2);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40554t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC11509y interfaceC11509y = (InterfaceC11509y) this.f40555u;
            this.f40554t = 1;
            Object objMo43052a = interfaceC11509y.mo43052a(this);
            return objMo43052a == objM38805e ? objM38805e : objMo43052a;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final Object m42984q(@NotNull InterfaceC11509y<T> interfaceC11509y, boolean z10, @Nullable InterfaceC9557b<? super T> interfaceC9557b) {
            a aVar = new a(interfaceC9557b);
            aVar.f40555u = interfaceC11509y;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m42983a(@NotNull InterfaceC11485f0<T> interfaceC11485f0, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return interfaceC11485f0.mo42978d(new a(null), interfaceC9557b);
    }
}

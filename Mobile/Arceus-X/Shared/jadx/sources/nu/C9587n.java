package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"T", "Lnu/h;", "", "destination", "", "b", "(Lnu/h;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "", "C", "a", "(Lnu/h;Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9587n {

    /* JADX INFO: renamed from: nu.n$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m39664f = "Collection.kt", m39665l = {22}, m39666m = "toCollection")
    public static final class a<T, C extends Collection<? super T>> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34626t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34627u;

        /* JADX INFO: renamed from: v */
        public int f34628v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34627u = obj;
            this.f34628v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9579j.m37779P(null, null, this);
        }
    }

    /* JADX INFO: renamed from: nu.n$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC9577i {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f34629a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f34629a = collection;
        }

        @Override // nu.InterfaceC9577i
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            this.f34629a.add(t8);
            return Unit.f29331a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T, C extends Collection<? super T>> Object m37831a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull C c10, @NotNull InterfaceC9557b<? super C> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f34628v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f34628v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f34627u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f34628v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) aVar.f34626t;
            C7348o.m30470b(obj);
            return collection;
        }
        C7348o.m30470b(obj);
        InterfaceC9577i<? super Object> bVar = new b<>(c10);
        aVar.f34626t = c10;
        aVar.f34628v = 1;
        return interfaceC9575h.collect(bVar, aVar) == objM38805e ? objM38805e : c10;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m37832b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull List<T> list, @NotNull InterfaceC9557b<? super List<? extends T>> interfaceC9557b) {
        return C9579j.m37779P(interfaceC9575h, list, interfaceC9557b);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m37833c(InterfaceC9575h interfaceC9575h, List list, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return C9579j.m37780Q(interfaceC9575h, list, interfaceC9557b);
    }
}

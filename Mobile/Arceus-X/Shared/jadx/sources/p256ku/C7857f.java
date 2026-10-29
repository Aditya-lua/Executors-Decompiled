package p256ku;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ku.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0086@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, m31665d2 = {"T", "", "Lku/w0;", "", "a", "(Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;", "Lku/d2;", "", "b", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7857f {

    /* JADX INFO: renamed from: ku.f$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.AwaitKt", m39664f = "Await.kt", m39665l = {58}, m39666m = "joinAll")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f29715t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f29716u;

        /* JADX INFO: renamed from: v */
        public int f29717v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29716u = obj;
            this.f29717v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7857f.m32633b(null, this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m32632a(@NotNull Collection<? extends InterfaceC7934w0<? extends T>> collection, @NotNull InterfaceC9557b<? super List<? extends T>> interfaceC9557b) {
        return collection.isEmpty() ? C7699p.m31892k() : new C7852e((InterfaceC7934w0[]) collection.toArray(new InterfaceC7934w0[0])).m32615c(interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m32633b(@NotNull Collection<? extends InterfaceC7850d2> collection, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        Iterator it;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f29717v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f29717v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f29716u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f29717v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f29715t;
            C7348o.m30470b(obj);
        }
        while (it.hasNext()) {
            InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) it.next();
            aVar.f29715t = it;
            aVar.f29717v = 1;
            if (interfaceC7850d2.mo32596L(aVar) == objM38805e) {
                return objM38805e;
            }
        }
        return Unit.f29331a;
    }
}

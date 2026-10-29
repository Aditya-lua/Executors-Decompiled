package p256ku;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;
import ru.C11137b;

/* JADX INFO: renamed from: ku.g3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "c", "(JLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "timeout", "d", "e", "U", "Lku/f3;", "coroutine", "b", "(Lku/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lku/y0;", "delay", "Lku/d2;", "Lku/e3;", "a", "(JLku/y0;Lku/d2;)Lku/e3;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7866g3 {

    /* JADX INFO: renamed from: ku.g3$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.TimeoutKt", m39664f = "Timeout.kt", m39665l = {102}, m39666m = "withTimeoutOrNull")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public long f29726t;

        /* JADX INFO: renamed from: u */
        public Object f29727u;

        /* JADX INFO: renamed from: v */
        public Object f29728v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f29729w;

        /* JADX INFO: renamed from: x */
        public int f29730x;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29729w = obj;
            this.f29730x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7866g3.m32662e(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C7856e3 m32658a(long j10, @NotNull InterfaceC7942y0 interfaceC7942y0, @NotNull InterfaceC7850d2 interfaceC7850d2) {
        String strM32560n;
        InterfaceC7834a1 interfaceC7834a1 = interfaceC7942y0 instanceof InterfaceC7834a1 ? (InterfaceC7834a1) interfaceC7942y0 : null;
        if (interfaceC7834a1 != null) {
            C7800a.Companion companion = C7800a.INSTANCE;
            strM32560n = interfaceC7834a1.m32560n(C7801b.m32372q(j10, EnumC7361b.MILLISECONDS));
            if (strM32560n == null) {
                strM32560n = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strM32560n = "Timed out waiting for " + j10 + " ms";
        }
        return new C7856e3(strM32560n, interfaceC7850d2);
    }

    /* JADX INFO: renamed from: b */
    public static final <U, T extends U> Object m32659b(RunnableC7861f3<U, ? super T> runnableC7861f3, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        C7865g2.m32651e(runnableC7861f3, C7946z0.m32940d(runnableC7861f3.uCont.getContext()).mo32840f(runnableC7861f3.time, runnableC7861f3, runnableC7861f3.getContext()));
        return C11137b.m41915e(runnableC7861f3, runnableC7861f3, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m32660c(long j10, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        if (j10 <= 0) {
            throw new C7856e3("Timed out immediately");
        }
        Object objM32659b = m32659b(new RunnableC7861f3(j10, interfaceC9557b), function2);
        if (objM32659b == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32659b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m32661d(long j10, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return m32660c(C7946z0.m32941e(j10), function2, interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ku.f3] */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m32662e(long j10, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        a aVar;
        C7729c0 c7729c0;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f29730x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f29730x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f29729w;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f29730x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (j10 <= 0) {
                return null;
            }
            C7729c0 c7729c1 = new C7729c0();
            try {
                aVar.f29727u = function2;
                aVar.f29728v = c7729c1;
                aVar.f29726t = j10;
                aVar.f29730x = 1;
                ?? r8 = (T) new RunnableC7861f3(j10, aVar);
                c7729c1.f29425a = r8;
                Object objM32659b = m32659b(r8, function2);
                if (objM32659b == C10047c.m38805e()) {
                    C10346h.m39673c(aVar);
                }
                return objM32659b == objM38805e ? objM38805e : objM32659b;
            } catch (C7856e3 e10) {
                e = e10;
                c7729c0 = c7729c1;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c0 = (C7729c0) aVar.f29728v;
            try {
                C7348o.m30470b(obj);
                return obj;
            } catch (C7856e3 e11) {
                e = e11;
            }
        }
        if (e.coroutine == c7729c0.f29425a) {
            return null;
        }
        throw e;
    }
}

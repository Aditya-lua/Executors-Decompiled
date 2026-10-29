package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import mu.C8679n;
import mu.InterfaceC8674i;
import mu.InterfaceC8689x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.C10056f;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"T", "Lnu/i;", "Lmu/x;", "channel", "", "b", "(Lnu/i;Lmu/x;Lnt/b;)Ljava/lang/Object;", "", "consume", "c", "(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;", "Lnu/h;", "e", "(Lmu/x;)Lnu/h;", "Lku/p0;", "scope", "d", "(Lnu/h;Lku/p0;)Lmu/x;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9583l {

    /* JADX INFO: renamed from: nu.l$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m39664f = "Channels.kt", m39665l = {32, 33}, m39666m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34610t;

        /* JADX INFO: renamed from: u */
        public Object f34611u;

        /* JADX INFO: renamed from: v */
        public Object f34612v;

        /* JADX INFO: renamed from: w */
        public boolean f34613w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f34614x;

        /* JADX INFO: renamed from: y */
        public int f34615y;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34614x = obj;
            this.f34615y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9583l.m37821c(null, null, false, this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m37820b(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC8689x<? extends T> interfaceC8689x, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM37821c = m37821c(interfaceC9577i, interfaceC8689x, true, interfaceC9557b);
        return objM37821c == C10047c.m38805e() ? objM37821c : Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m37821c(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC8689x<? extends T> interfaceC8689x, boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        InterfaceC8674i<? extends T> it;
        InterfaceC8674i<? extends T> interfaceC8674i;
        InterfaceC9577i<? super T> interfaceC9577i2;
        Object objMo34879a;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f34615y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f34615y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f34614x;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f34615y;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                C9579j.m37801r(interfaceC9577i);
                it = interfaceC8689x.iterator();
                aVar.f34610t = interfaceC9577i;
                aVar.f34611u = interfaceC8689x;
                aVar.f34612v = it;
                aVar.f34613w = z10;
                aVar.f34615y = 1;
                objMo34879a = it.mo34879a(aVar);
                if (objMo34879a == objM38805e) {
                    interfaceC9577i2 = interfaceC9577i;
                    interfaceC8674i = it;
                    obj = objMo34879a;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z10) {
                            C8679n.m34957a(interfaceC8689x, null);
                        }
                        return Unit.f29331a;
                    }
                    T next = interfaceC8674i.next();
                    aVar.f34610t = interfaceC9577i2;
                    aVar.f34611u = interfaceC8689x;
                    aVar.f34612v = interfaceC8674i;
                    aVar.f34613w = z10;
                    aVar.f34615y = 2;
                }
                return objM38805e;
            }
            if (i11 == 1) {
                z10 = aVar.f34613w;
                interfaceC8674i = (InterfaceC8674i) aVar.f34612v;
                interfaceC8689x = (InterfaceC8689x) aVar.f34611u;
                interfaceC9577i2 = (InterfaceC9577i) aVar.f34610t;
                C7348o.m30470b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z10) {
                        C8679n.m34957a(interfaceC8689x, null);
                    }
                    return Unit.f29331a;
                }
                T next2 = interfaceC8674i.next();
                aVar.f34610t = interfaceC9577i2;
                aVar.f34611u = interfaceC8689x;
                aVar.f34612v = interfaceC8674i;
                aVar.f34613w = z10;
                aVar.f34615y = 2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = aVar.f34613w;
                interfaceC8674i = (InterfaceC8674i) aVar.f34612v;
                interfaceC8689x = (InterfaceC8689x) aVar.f34611u;
                interfaceC9577i2 = (InterfaceC9577i) aVar.f34610t;
                C7348o.m30470b(obj);
            }
            it = interfaceC8674i;
            interfaceC9577i = interfaceC9577i2;
            aVar.f34610t = interfaceC9577i;
            aVar.f34611u = interfaceC8689x;
            aVar.f34612v = it;
            aVar.f34613w = z10;
            aVar.f34615y = 1;
            objMo34879a = it.mo34879a(aVar);
            if (objMo34879a == objM38805e) {
                interfaceC9577i2 = interfaceC9577i;
                interfaceC8674i = it;
                obj = objMo34879a;
                if (!((Boolean) obj).booleanValue()) {
                    if (z10) {
                        C8679n.m34957a(interfaceC8689x, null);
                    }
                    return Unit.f29331a;
                }
                T next3 = interfaceC8674i.next();
                aVar.f34610t = interfaceC9577i2;
                aVar.f34611u = interfaceC8689x;
                aVar.f34612v = interfaceC8674i;
                aVar.f34613w = z10;
                aVar.f34615y = 2;
            }
            return objM38805e;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z10) {
                    C8679n.m34957a(interfaceC8689x, th2);
                }
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC8689x<T> m37822d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC7906p0 interfaceC7906p0) {
        return C10056f.m38821b(interfaceC9575h).mo37715m(interfaceC7906p0);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37823e(@NotNull InterfaceC8689x<? extends T> interfaceC8689x) {
        return new C9569e(interfaceC8689x, false, null, 0, null, 28, null);
    }
}

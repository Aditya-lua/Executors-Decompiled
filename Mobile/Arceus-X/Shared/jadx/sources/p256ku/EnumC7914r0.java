package p256ku;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p315nt.C9558c;
import p315nt.InterfaceC9557b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import ru.C11136a;
import ru.C11137b;

/* JADX INFO: renamed from: ku.r0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0015j\u0002\b\rj\u0002\b\u0010j\u0002\b\u0016¨\u0006\u0017"}, m31665d2 = {"Lku/r0;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "block", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)V", "", "c", "()Z", "isLazy$annotations", "()V", "isLazy", "a", "d", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public enum EnumC7914r0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC10707a f29799f = C10708b.m40805a(m32902a());

    /* JADX INFO: renamed from: ku.r0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29800a;

        static {
            int[] iArr = new int[EnumC7914r0.values().length];
            try {
                iArr[EnumC7914r0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7914r0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7914r0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7914r0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29800a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final <R, T> void m32903b(@NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> block, R receiver, @NotNull InterfaceC9557b<? super T> completion) {
        int i10 = a.f29800a[ordinal()];
        if (i10 == 1) {
            C11136a.m41909b(block, receiver, completion);
            return;
        }
        if (i10 == 2) {
            C9558c.m37700a(block, receiver, completion);
        } else if (i10 == 3) {
            C11137b.m41913c(block, receiver, completion);
        } else if (i10 != 4) {
            throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m32904c() {
        return this == LAZY;
    }
}

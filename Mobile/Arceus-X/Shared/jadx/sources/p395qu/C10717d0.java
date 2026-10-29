package p395qu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;
import p229jt.C7347n;
import p229jt.C7348o;
import pt.AbstractC10339a;

/* JADX INFO: renamed from: qu.d0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lpt/e;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10717d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StackTraceElement f38271a = new C0000a().m0a();

    /* JADX INFO: renamed from: b */
    public static final String f38272b;

    /* JADX INFO: renamed from: c */
    public static final String f38273c;

    static {
        Object objM30460b;
        Object objM30460b2;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(AbstractC10339a.class.getCanonicalName());
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) != null) {
            objM30460b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f38272b = (String) objM30460b;
        try {
            objM30460b2 = C7347n.m30460b(C10717d0.class.getCanonicalName());
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b2 = C7347n.m30460b(C7348o.m30469a(th3));
        }
        if (C7347n.m30463e(objM30460b2) != null) {
            objM30460b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f38273c = (String) objM30460b2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E extends Throwable> E m40837a(@NotNull E e10) {
        return e10;
    }
}

package lu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p256ku.AbstractC7900n2;
import p256ku.InterfaceC7874i1;
import p256ku.InterfaceC7942y0;

/* JADX INFO: renamed from: lu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Llu/g;", "Lku/n2;", "Lku/y0;", "<init>", "()V", "Llu/f;", "kotlinx-coroutines-android"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC8265g extends AbstractC7900n2 implements InterfaceC7942y0 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: lu.g.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC8265g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC7942y0.a.m32932a(this, j10, runnable, coroutineContext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8265g() {
    }
}

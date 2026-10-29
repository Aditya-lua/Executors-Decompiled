package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0007\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u000b"}, d2 = {"Lku/y0;", "b", "()Lku/y0;", "", "a", "Z", "defaultMainDelayOptIn", "Lku/y0;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f22867a = qu.f0.f("kotlinx.coroutines.main.delay", false);

    @NotNull
    public static final y0 b = b();

    @NotNull
    public static final y0 a() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final y0 b() {
        if (!f22867a) {
            return u0.f22862i;
        }
        n2 n2VarC = g1.c();
        return (qu.u.c(n2VarC) || !(n2VarC instanceof y0)) ? u0.f22862i : (y0) n2VarC;
    }
}

package l4;

import gt.m;
import iu.g1;
import iu.z2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ll4/b;", "a", "()Ll4/b;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    @NotNull
    public static final b a() {
        CoroutineContext coroutineContextW;
        try {
            coroutineContextW = g1.c().W();
        } catch (m unused) {
            coroutineContextW = kotlin.coroutines.e.f22980a;
        } catch (IllegalStateException unused2) {
            coroutineContextW = kotlin.coroutines.e.f22980a;
        }
        return new b(coroutineContextW.plus(z2.b(null, 1, null)));
    }
}

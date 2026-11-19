package m4;

import av.g1;
import av.z2;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;
import zt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lm4/b;", "a", "()Lm4/b;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    @NotNull
    public static final b a() {
        CoroutineContext coroutineContextY;
        try {
            coroutineContextY = g1.c().Y();
        } catch (IllegalStateException unused) {
            coroutineContextY = p001kotlin.coroutines.e.f21548a;
        } catch (m unused2) {
            coroutineContextY = p001kotlin.coroutines.e.f21548a;
        }
        return new b(coroutineContextY.plus(z2.b(null, 1, null)));
    }
}

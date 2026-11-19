package bv;

import av.i1;
import av.n2;
import av.y0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lbv/g;", "Lav/n2;", "Lav/y0;", "<init>", "()V", "Lbv/f;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g extends n2 implements y0 {
    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public i1 g(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return y0.a.a(this, j10, runnable, coroutineContext);
    }

    public g() {
    }
}

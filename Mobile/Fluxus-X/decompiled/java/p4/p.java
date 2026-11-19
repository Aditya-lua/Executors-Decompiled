package p4;

import android.window.OnBackInvokedDispatcher;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp4/p;", "Lp4/o;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "<init>", "(Landroid/window/OnBackInvokedDispatcher;)V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull OnBackInvokedDispatcher onBackInvokedDispatcher) {
        super(onBackInvokedDispatcher, 1000000, null);
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
    }
}

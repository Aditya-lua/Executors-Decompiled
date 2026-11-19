package g4;

import f4.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg4/f;", "Lg4/i;", "Lf4/q;", "fragment", "<init>", "(Lf4/q;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull q fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}

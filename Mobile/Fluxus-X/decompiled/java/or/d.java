package or;

import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lor/c;", "Lor/i;", "a", "(Lor/c;)Lor/i;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    @NotNull
    public static final UiComponentScreen a(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new UiComponentScreen(cVar.getComponents(), cVar.W0(), cVar.getStyles());
    }
}

package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ym.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u00020\u0007\"\u001a\b\u0000\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u0004*\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lym/q;", "W", "I", "O", "R", "", "key", "Lzm/k;", "a", "(Lym/q;Ljava/lang/String;)Lzm/k;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class l {
    @NotNull
    public static final <W extends q<? super I, ? extends O, ? extends R>, I, O, R> WorkflowNodeId a(@NotNull W w5, @NotNull String key) {
        Intrinsics.checkNotNullParameter(w5, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WorkflowNodeId(w5, key);
    }

    public static /* synthetic */ WorkflowNodeId b(q qVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return a(qVar, str);
    }
}

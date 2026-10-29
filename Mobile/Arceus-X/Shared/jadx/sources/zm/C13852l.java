package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p581ym.InterfaceC13224q;

/* JADX INFO: renamed from: zm.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u00020\u0007\"\u001a\b\u0000\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u0004*\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lym/q;", "W", "I", "O", "R", "", "key", "Lzm/k;", "a", "(Lym/q;Ljava/lang/String;)Lzm/k;", "wf1-workflow-runtime"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13852l {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <W extends InterfaceC13224q<? super I, ? extends O, ? extends R>, I, O, R> WorkflowNodeId m50415a(@NotNull W w5, @NotNull String key) {
        Intrinsics.checkNotNullParameter(w5, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WorkflowNodeId(w5, key);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WorkflowNodeId m50416b(InterfaceC13224q interfaceC13224q, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return m50415a(interfaceC13224q, str);
    }
}

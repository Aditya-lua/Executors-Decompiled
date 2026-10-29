package zm;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p581ym.C13212e;
import p581ym.InterfaceC13227t;

/* JADX INFO: renamed from: zm.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "Lym/t;", "a", "(Ljava/util/List;)Lym/t;", "wf1-workflow-runtime"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13843c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC13227t m50357a(@NotNull List<? extends InterfaceC13227t> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return C13212e.f46507a;
        }
        return list.size() == 1 ? (InterfaceC13227t) CollectionsKt.m31675A0(list) : new C13842b(list);
    }
}

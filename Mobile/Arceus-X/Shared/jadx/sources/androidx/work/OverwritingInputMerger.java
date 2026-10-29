package androidx.work;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p536x5.AbstractC12712m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroidx/work/OverwritingInputMerger;", "Lx5/m;", "<init>", "()V", "", "Landroidx/work/b;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class OverwritingInputMerger extends AbstractC12712m {
    @Override // p536x5.AbstractC12712m
    @NotNull
    /* JADX INFO: renamed from: a */
    public C1116b mo6247a(@NotNull List<C1116b> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        C1116b.a aVar = new C1116b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C1116b> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().m6316e());
        }
        aVar.m6325d(linkedHashMap);
        return aVar.m6322a();
    }
}

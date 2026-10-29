package p567y5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120f6.WorkGenerationalId;

/* JADX INFO: renamed from: y5.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Ly5/a0;", "Ly5/z;", "<init>", "()V", "Lf6/w;", "id", "Ly5/y;", "f", "(Lf6/w;)Ly5/y;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lf6/w;)Z", "", "b", "Ljava/util/Map;", "runs", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13032a0 implements InterfaceC13100z {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<WorkGenerationalId, C13098y> runs = new LinkedHashMap();

    @Override // p567y5.InterfaceC13100z
    @Nullable
    /* JADX INFO: renamed from: c */
    public C13098y mo48547c(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.runs.remove(id2);
    }

    @Override // p567y5.InterfaceC13100z
    /* JADX INFO: renamed from: e */
    public boolean mo48548e(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.runs.containsKey(id2);
    }

    @Override // p567y5.InterfaceC13100z
    @NotNull
    /* JADX INFO: renamed from: f */
    public C13098y mo48549f(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Map<WorkGenerationalId, C13098y> map = this.runs;
        C13098y c13098y = map.get(id2);
        if (c13098y == null) {
            c13098y = new C13098y(id2);
            map.put(id2, c13098y);
        }
        return c13098y;
    }

    @Override // p567y5.InterfaceC13100z
    @NotNull
    public List<C13098y> remove(@NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Map<WorkGenerationalId, C13098y> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, C13098y> entry : map.entrySet()) {
            if (Intrinsics.m31980c(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.m31687M0(linkedHashMap.values());
    }
}

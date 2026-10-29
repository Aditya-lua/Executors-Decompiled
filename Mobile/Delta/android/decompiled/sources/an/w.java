package an;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lan/w;", "Lan/c0;", "", "Lhu/c;", "Lan/a0;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([Lan/a0;)V", "", "RenderingT", "renderingType", "a", "(Lhu/c;)Lan/a0;", "b", "Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class w implements c0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<hu.c<?>, a0<?>> bindings;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Map<hu.c<?>, ? extends a0<?>> map) {
        this.bindings = map;
    }

    @Override // an.c0
    @Nullable
    public <RenderingT> a0<RenderingT> a(@NotNull hu.c<? extends RenderingT> renderingType) {
        Intrinsics.checkNotNullParameter(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof a0) {
            return (a0) obj;
        }
        return null;
    }

    public w(@NotNull a0<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        ArrayList arrayList = new ArrayList(bindings.length);
        int length = bindings.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            a0<?> a0Var = bindings[i11];
            i11++;
            arrayList.add(jt.s.a(a0Var.getType(), a0Var));
        }
        Map mapT = k0.t(arrayList);
        if (mapT.keySet().size() == bindings.length) {
            this((Map<hu.c<?>, ? extends a0<?>>) mapT);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(bindings.length);
        int length2 = bindings.length;
        while (i10 < length2) {
            a0<?> a0Var2 = bindings[i10];
            i10++;
            arrayList2.add(a0Var2.getType());
        }
        sb2.append(arrayList2);
        sb2.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb2.toString().toString());
    }
}

package p016an;

import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;

/* JADX INFO: renamed from: an.w */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lan/w;", "Lan/c0;", "", "Lhu/c;", "Lan/a0;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([Lan/a0;)V", "", "RenderingT", "renderingType", "a", "(Lhu/c;)Lan/a0;", "b", "Ljava/util/Map;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0394w implements InterfaceC0368c0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC6567c<?>, InterfaceC0364a0<?>> bindings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<hu.c<?>, ? extends an.a0<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0394w(Map<InterfaceC6567c<?>, ? extends InterfaceC0364a0<?>> map) {
        this.bindings = map;
    }

    @Override // p016an.InterfaceC0368c0
    @Nullable
    /* JADX INFO: renamed from: a */
    public <RenderingT> InterfaceC0364a0<RenderingT> mo1389a(@NotNull InterfaceC6567c<? extends RenderingT> renderingType) {
        Intrinsics.checkNotNullParameter(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof InterfaceC0364a0) {
            return (InterfaceC0364a0) obj;
        }
        return null;
    }

    public C0394w(@NotNull InterfaceC0364a0<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        ArrayList arrayList = new ArrayList(bindings.length);
        int length = bindings.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            InterfaceC0364a0<?> interfaceC0364a0 = bindings[i11];
            i11++;
            arrayList.add(C7352s.m30477a(interfaceC0364a0.getType(), interfaceC0364a0));
        }
        Map mapM31805t = C7690k0.m31805t(arrayList);
        if (mapM31805t.keySet().size() == bindings.length) {
            this((Map<InterfaceC6567c<?>, ? extends InterfaceC0364a0<?>>) mapM31805t);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(bindings.length);
        int length2 = bindings.length;
        while (i10 < length2) {
            InterfaceC0364a0<?> interfaceC0364a1 = bindings[i10];
            i10++;
            arrayList2.add(interfaceC0364a1.getType());
        }
        sb2.append(arrayList2);
        sb2.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb2.toString().toString());
    }
}

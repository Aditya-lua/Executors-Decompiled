package mu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p256ku.C7905p;
import p256ku.InterfaceC7886k3;
import p395qu.AbstractC10713b0;

/* JADX INFO: renamed from: mu.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lmu/w;", "E", "Lku/k3;", "Lku/p;", "Lmu/k;", "cont", "<init>", "(Lku/p;)V", "Lqu/b0;", "segment", "", "index", "", "e", "(Lqu/b0;I)V", "a", "Lku/p;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8688w<E> implements InterfaceC7886k3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7905p<C8676k<? extends E>> cont;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.p<? super mu.k<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8688w(@NotNull C7905p<? super C8676k<? extends E>> c7905p) {
        this.cont = c7905p;
    }

    @Override // p256ku.InterfaceC7886k3
    /* JADX INFO: renamed from: e */
    public void mo32790e(@NotNull AbstractC10713b0<?> segment, int index) {
        this.cont.mo32790e(segment, index);
    }
}

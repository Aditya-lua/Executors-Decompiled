package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import mu.InterfaceC8690y;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: ou.z */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lou/z;", "T", "Lnu/i;", "Lmu/y;", "channel", "<init>", "(Lmu/y;)V", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "a", "Lmu/y;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10076z<T> implements InterfaceC9577i<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8690y<T> channel;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: mu.y<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10076z(@NotNull InterfaceC8690y<? super T> interfaceC8690y) {
        this.channel = interfaceC8690y;
    }

    @Override // nu.InterfaceC9577i
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objMo34848i = this.channel.mo34848i(t8, interfaceC9557b);
        return objMo34848i == C10047c.m38805e() ? objMo34848i : Unit.f29331a;
    }
}

package p001ou;

import java.util.Arrays;
import jt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001ou.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lou/b;", "Lou/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Lou/d;", "", "size", "", "h", "(I)[Lou/d;", "d", "slot", "", "k", "(Lou/d;)V", "value", "a", "[Lou/d;", "m", "()[Lou/d;", "slots", "b", "I", "l", "()I", "nCollectors", "c", "nextIndex", "Lou/b0;", "Lou/b0;", "_subscriptionCount", "Lnu/p0;", "g", "()Lnu/p0;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<S extends d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public S[] slots;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int nCollectors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int nextIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b0 _subscriptionCount;

    @NotNull
    public final S d() {
        S s8;
        b0 b0Var;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) h(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((d[]) objArrCopyOf);
                    sArr = (S[]) ((d[]) objArrCopyOf);
                }
                int i10 = this.nextIndex;
                do {
                    s8 = sArr[i10];
                    if (s8 == null) {
                        s8 = (S) f();
                        sArr[i10] = s8;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.d(s8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s8.a(this));
                this.nextIndex = i10;
                this.nCollectors++;
                b0Var = this._subscriptionCount;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b0Var != null) {
            b0Var.Z(1);
        }
        return s8;
    }

    @NotNull
    public abstract S f();

    @NotNull
    public final p0<Integer> g() {
        b0 b0Var;
        synchronized (this) {
            b0Var = this._subscriptionCount;
            if (b0Var == null) {
                b0Var = new b0(this.nCollectors);
                this._subscriptionCount = b0Var;
            }
        }
        return b0Var;
    }

    @NotNull
    public abstract S[] h(int size);

    public final void k(@NotNull S slot) {
        b0 b0Var;
        int i10;
        nt.b<Unit>[] bVarArrB;
        synchronized (this) {
            try {
                int i11 = this.nCollectors - 1;
                this.nCollectors = i11;
                b0Var = this._subscriptionCount;
                if (i11 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.d(slot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                bVarArrB = slot.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (nt.b<Unit> bVar : bVarArrB) {
            if (bVar != null) {
                n.Companion companion = n.INSTANCE;
                bVar.resumeWith(n.b(Unit.f22483a));
            }
        }
        if (b0Var != null) {
            b0Var.Z(-1);
        }
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    @Nullable
    public final S[] m() {
        return this.slots;
    }
}

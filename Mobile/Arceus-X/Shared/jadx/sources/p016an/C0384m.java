package p016an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: an.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u001b"}, m31665d2 = {"Lan/m;", "", "W", "Lan/g;", "wrapped", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "c", "Ljava/lang/String;", "getName", "d", "compatibilityKey", "wf1-core-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final /* data */ class C0384m<W> implements InterfaceC0375g {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final W wrapped;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String compatibilityKey;

    public C0384m(@NotNull W wrapped, @NotNull String name) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(name, "name");
        this.wrapped = wrapped;
        this.name = name;
        if (StringsKt.m32182p0(name)) {
            throw new IllegalArgumentException("name must not be blank.");
        }
        this.compatibilityKey = InterfaceC0375g.INSTANCE.m1419a(wrapped, name);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final W m1444a() {
        return this.wrapped;
    }

    @Override // p016an.InterfaceC0375g
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0384m)) {
            return false;
        }
        C0384m c0384m = (C0384m) other;
        return Intrinsics.m31980c(this.wrapped, c0384m.wrapped) && Intrinsics.m31980c(this.name, c0384m.name);
    }

    public int hashCode() {
        return (this.wrapped.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return super.toString() + ": " + getCompatibilityKey();
    }
}

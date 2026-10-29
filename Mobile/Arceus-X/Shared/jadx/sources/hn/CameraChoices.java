package hn;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hn.k0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lhn/k0;", "", "Lhn/h0;", "primaryChoice", "", "backupChoices", "<init>", "(Lhn/h0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhn/h0;", "b", "()Lhn/h0;", "Ljava/util/List;", "getBackupChoices", "()Ljava/util/List;", "allChoices", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class CameraChoices {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final C6445h0 primaryChoice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<C6445h0> backupChoices;

    public CameraChoices(@NotNull C6445h0 primaryChoice, @NotNull List<C6445h0> backupChoices) {
        Intrinsics.checkNotNullParameter(primaryChoice, "primaryChoice");
        Intrinsics.checkNotNullParameter(backupChoices, "backupChoices");
        this.primaryChoice = primaryChoice;
        this.backupChoices = backupChoices;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<C6445h0> m28109a() {
        return CollectionsKt.m31725w0(C7697o.m31878d(this.primaryChoice), this.backupChoices);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C6445h0 getPrimaryChoice() {
        return this.primaryChoice;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoices)) {
            return false;
        }
        CameraChoices cameraChoices = (CameraChoices) other;
        return Intrinsics.m31980c(this.primaryChoice, cameraChoices.primaryChoice) && Intrinsics.m31980c(this.backupChoices, cameraChoices.backupChoices);
    }

    public int hashCode() {
        return (this.primaryChoice.hashCode() * 31) + this.backupChoices.hashCode();
    }

    @NotNull
    public String toString() {
        return "CameraChoices(primaryChoice=" + this.primaryChoice + ", backupChoices=" + this.backupChoices + ")";
    }
}

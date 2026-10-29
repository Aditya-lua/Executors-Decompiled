package en;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: en.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Len/d;", "", "B", "Len/f;", "Len/e;", "beneathModals", "", "modals", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AlertContainerScreen<B> implements f<B, AlertScreen> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final B beneathModals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AlertScreen> modals;

    public AlertContainerScreen(@NotNull B beneathModals, @NotNull List<AlertScreen> modals) {
        Intrinsics.checkNotNullParameter(beneathModals, "beneathModals");
        Intrinsics.checkNotNullParameter(modals, "modals");
        this.beneathModals = beneathModals;
        this.modals = modals;
    }

    @Override // en.f
    @NotNull
    public List<AlertScreen> a() {
        return this.modals;
    }

    @Override // en.f
    @NotNull
    public B b() {
        return this.beneathModals;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) other;
        return Intrinsics.c(b(), alertContainerScreen.b()) && Intrinsics.c(a(), alertContainerScreen.a());
    }

    public int hashCode() {
        return (b().hashCode() * 31) + a().hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertContainerScreen(beneathModals=" + b() + ", modals=" + a() + ')';
    }

    public /* synthetic */ AlertContainerScreen(Object obj, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? p.k() : list);
    }
}

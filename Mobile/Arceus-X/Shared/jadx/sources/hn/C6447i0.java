package hn;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hn.i0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lhn/i0;", "", "<init>", "()V", "Lhn/h0;", "choice", "", "a", "(Lhn/h0;)V", "", "b", "(Lhn/h0;)Z", "", "Ljava/util/List;", "badCameraChoices", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6447i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<C6445h0> badCameraChoices = C7699p.m31892k();

    /* JADX INFO: renamed from: a */
    public final void m28104a(@NotNull C6445h0 choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.badCameraChoices = CollectionsKt.m31726x0(this.badCameraChoices, choice);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28105b(@NotNull C6445h0 choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        return this.badCameraChoices.contains(choice);
    }
}

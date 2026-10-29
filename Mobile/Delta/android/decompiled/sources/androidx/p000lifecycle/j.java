package androidx.p000lifecycle;

import k4.CreationExtras;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/j;", "", "Landroidx/lifecycle/a1$c;", "X", "()Landroidx/lifecycle/a1$c;", "defaultViewModelProviderFactory", "Lk4/a;", "Z", "()Lk4/a;", "defaultViewModelCreationExtras", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface j {
    @NotNull
    a1.c X();

    @NotNull
    default CreationExtras Z() {
        return CreationExtras.b.f22169c;
    }
}

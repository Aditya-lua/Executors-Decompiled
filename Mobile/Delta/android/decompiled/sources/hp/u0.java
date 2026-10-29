package hp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhp/u0;", "Lhp/s0;", "Lzo/y$a;", "inquiryLoadingScreen", "", "didGoBack", "<init>", "(Lzo/y$a;Z)V", "a", "Lzo/y$a;", "d", "()Lzo/y$a;", "b", "Z", "getDidGoBack", "()Z", "", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zo.y.a inquiryLoadingScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean didGoBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    public u0(@NotNull zo.y.a inquiryLoadingScreen, boolean z10) {
        Intrinsics.checkNotNullParameter(inquiryLoadingScreen, "inquiryLoadingScreen");
        this.inquiryLoadingScreen = inquiryLoadingScreen;
        this.didGoBack = z10;
        this.name = "$pi2_loading";
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final zo.y.a getInquiryLoadingScreen() {
        return this.inquiryLoadingScreen;
    }

    @Override // hp.s0
    @NotNull
    public String getName() {
        return this.name;
    }
}

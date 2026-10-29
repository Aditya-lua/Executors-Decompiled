package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lmp/q;", "", "Lg/c;", "", "", "openDocumentResultLauncher", "<init>", "(Lg/c;)V", "a", "()Lg/c;", "Lg/c;", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.c<String[]> openDocumentResultLauncher;

    public q(@NotNull g.c<String[]> openDocumentResultLauncher) {
        Intrinsics.checkNotNullParameter(openDocumentResultLauncher, "openDocumentResultLauncher");
        this.openDocumentResultLauncher = openDocumentResultLauncher;
    }

    @NotNull
    public final g.c<String[]> a() {
        return this.openDocumentResultLauncher;
    }
}

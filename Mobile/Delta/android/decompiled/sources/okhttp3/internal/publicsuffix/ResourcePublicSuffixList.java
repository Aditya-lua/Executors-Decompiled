package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu.h0;
import xu.l;
import xu.r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lxu/h0;", "path", "Lxu/l;", "fileSystem", "<init>", "(Lxu/h0;Lxu/l;)V", "Lxu/r0;", "listSource", "()Lxu/r0;", "Lxu/h0;", "getPath", "()Lxu/h0;", "Lxu/l;", "getFileSystem", "()Lxu/l;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    @NotNull
    public static final h0 PUBLIC_SUFFIX_RESOURCE = h0.Companion.e(h0.INSTANCE, "okhttp3/internal/publicsuffix/" + PublicSuffixDatabase.class.getSimpleName() + ".list", false, 1, null);

    @NotNull
    private final l fileSystem;

    @NotNull
    private final h0 path;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final l getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public r0 listSource() {
        return this.fileSystem.source(getPath());
    }

    public ResourcePublicSuffixList(@NotNull h0 path, @NotNull l fileSystem) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.path = path;
        this.fileSystem = fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public h0 getPath() {
        return this.path;
    }

    public /* synthetic */ ResourcePublicSuffixList(h0 h0Var, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : h0Var, (i10 & 2) != 0 ? l.RESOURCES : lVar);
    }
}

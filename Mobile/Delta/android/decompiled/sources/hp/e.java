package hp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhp/e;", "Lhp/z0;", "", "name", "Ljp/b;", "fragment", "<init>", "(Ljava/lang/String;Ljp/b;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljp/b;", "()Ljp/b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jp.b fragment;

    public e(@NotNull String name, @NotNull jp.b fragment) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.name = name;
        this.fragment = fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final jp.b getFragment() {
        return this.fragment;
    }

    @Override // hp.z0
    @NotNull
    public String getName() {
        return this.name;
    }
}

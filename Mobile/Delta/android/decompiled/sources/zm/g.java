package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzm/g;", "Lzm/e$a;", "", "key", "Lku/d2;", "job", "<init>", "(Ljava/lang/String;Lku/d2;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lku/d2;", "c", "()Lku/d2;", "Lzm/g;", "e", "()Lzm/g;", "f", "(Lzm/g;)V", "nextListNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class g implements e.a<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d2 job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g nextListNode;

    public g(@NotNull String key, @NotNull d2 job) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(job, "job");
        this.key = key;
        this.job = job;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d2 getJob() {
        return this.job;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // zm.e.a
    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public g a() {
        return this.nextListNode;
    }

    @Override // zm.e.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(@Nullable g gVar) {
        this.nextListNode = gVar;
    }
}

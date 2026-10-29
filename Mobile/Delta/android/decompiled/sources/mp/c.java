package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmp/c;", "Lmp/b;", "Lw/d;", "intent", "", "url", "packageName", "<init>", "(Lw/d;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lw/d;", "b", "()Lw/d;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w.d intent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String packageName;

    public c(@NotNull w.d intent, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(url, "url");
        this.intent = intent;
        this.url = url;
        this.packageName = str;
    }

    @Override // mp.b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final w.d getIntent() {
        return this.intent;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public /* synthetic */ c(w.d dVar, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, str, (i10 & 4) != 0 ? null : str2);
    }
}

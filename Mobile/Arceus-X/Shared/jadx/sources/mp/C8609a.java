package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479v.C11984b;

/* JADX INFO: renamed from: mp.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lmp/a;", "Lmp/b;", "Lv/b;", "intent", "", "url", "host", "path", "packageName", "<init>", "(Lv/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lv/b;", "c", "()Lv/b;", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8609a implements InterfaceC8611b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C11984b intent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String packageName;

    public C8609a(@NotNull C11984b intent, @NotNull String url, @NotNull String host, @NotNull String path, @Nullable String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.intent = intent;
        this.url = url;
        this.host = host;
        this.path = path;
        this.packageName = str;
    }

    @Override // mp.InterfaceC8611b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11984b getIntent() {
        return this.intent;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUrl() {
        return this.url;
    }
}

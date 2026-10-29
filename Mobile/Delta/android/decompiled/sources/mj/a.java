package mj;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B-\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmj/a;", "Lmj/m;", "", "categoryName", "", "conversationId", "conversationTitle", "", "isChatMessageModerated", "<init>", "(Ljava/lang/String;JLjava/lang/String;Z)V", "conversationGuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "n", "Z", "I", "()Z", "o", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean isChatMessageModerated;

    public a(@Nullable String str, long j10, @Nullable String str2, boolean z10) {
        super(str, j10, str2, "FAILURE_NOTIFICATION_ID");
        this.isChatMessageModerated = z10;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getIsChatMessageModerated() {
        return this.isChatMessageModerated;
    }

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        super(str, str2, str3, "FAILURE_NOTIFICATION_ID");
        this.isChatMessageModerated = z10;
    }
}

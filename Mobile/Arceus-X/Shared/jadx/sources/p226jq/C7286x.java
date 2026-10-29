package p226jq;

import android.webkit.MimeTypeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Ljq/x;", "Ljq/k;", "<init>", "()V", "", "path", "a", "(Ljava/lang/String;)Ljava/lang/String;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7286x implements InterfaceC7267k {
    @Override // p226jq.InterfaceC7267k
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo30293a(@NotNull String path) {
        String mimeTypeFromExtension;
        Intrinsics.checkNotNullParameter(path, "path");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
        return (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) ? "image/*" : mimeTypeFromExtension;
    }
}

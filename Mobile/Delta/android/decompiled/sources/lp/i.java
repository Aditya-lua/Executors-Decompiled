package lp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Llp/i;", "", "<init>", "()V", "Llp/i$a;", "request", "", "a", "(Llp/i$a;)V", "b", "Llp/i$a;", "pending", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f23502a = new i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile a pending;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llp/i$a;", "", "", "", "passwords", "nonce", "Llp/a;", "hashAlgorithm", "<init>", "(Ljava/util/List;Ljava/lang/String;Llp/a;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getPasswords", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getNonce", "c", "Llp/a;", "getHashAlgorithm", "()Llp/a;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> passwords;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String nonce;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final lp.a hashAlgorithm;

        public a(@NotNull List<String> passwords, @NotNull String nonce, @NotNull lp.a hashAlgorithm) {
            Intrinsics.checkNotNullParameter(passwords, "passwords");
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(hashAlgorithm, "hashAlgorithm");
            this.passwords = passwords;
            this.nonce = nonce;
            this.hashAlgorithm = hashAlgorithm;
        }

        @NotNull
        public String toString() {
            return "JpMyNumberNfcScanRequestStore.Request(<redacted>)";
        }
    }

    public final void a(@NotNull a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        pending = request;
    }
}

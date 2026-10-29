package zq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0005\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzq/c;", "", "Lzq/c$b;", "a", "()Lzq/c$b;", "b", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lzq/c$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "Lzq/c;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;)Lzq/c;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzq/c$b;", "", "b", "a", "Lzq/c$b$a;", "Lzq/c$b$b;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: zq.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lzq/c$b$a;", "Lzq/c$b;", "", "errorName", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String errorName;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String errorMessage;

            public Error(@NotNull String errorName, @NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorName, "errorName");
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorName = errorName;
                this.errorMessage = errorMessage;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getErrorName() {
                return this.errorName;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.c(this.errorName, error.errorName) && Intrinsics.c(this.errorMessage, error.errorMessage);
            }

            public int hashCode() {
                return (this.errorName.hashCode() * 31) + this.errorMessage.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorName=" + this.errorName + ", errorMessage=" + this.errorMessage + ")";
            }
        }

        /* JADX INFO: renamed from: zq.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzq/c$b$b;", "Lzq/c$b;", "", "code", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0691b implements b {
            @NotNull
            public final String a() {
                throw null;
            }
        }
    }

    @NotNull
    b a();
}

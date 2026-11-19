package sv;

import com.github.luben.zstd.BuildConfig;
import java.net.ProtocolException;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsv/k;", BuildConfig.FLAVOR, "Lmv/e0;", "protocol", BuildConfig.FLAVOR, "code", BuildConfig.FLAVOR, "message", "<init>", "(Lmv/e0;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Lmv/e0;", "b", "I", "c", "Ljava/lang/String;", "d", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 protocol;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: sv.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsv/k$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "statusLine", "Lsv/k;", "a", "(Ljava/lang/String;)Lsv/k;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a(@NotNull String statusLine) throws ProtocolException {
            e0 e0Var;
            int i10;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (x.T(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    e0Var = e0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    e0Var = e0.HTTP_1_1;
                }
            } else if (x.T(statusLine, "ICY ", false, 2, null)) {
                e0Var = e0.HTTP_1_0;
                i10 = 4;
            } else {
                if (!x.T(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                e0Var = e0.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Integer intOrNull = StringsKt.toIntOrNull(strSubstring2);
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = intOrNull.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = BuildConfig.FLAVOR;
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i10 + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            return new k(e0Var, iIntValue, strSubstring);
        }

        public Companion() {
        }
    }

    public k(@NotNull e0 protocol, int i10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.protocol = protocol;
        this.code = i10;
        this.message = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == e0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        return sb2.toString();
    }
}

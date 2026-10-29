package okhttp3.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, m31665d2 = {"normalizeNfc", "", InquiryField.StringField.TYPE, "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class _NormalizeJvmKt {
    @NotNull
    public static final String normalizeNfc(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return strNormalize;
    }
}

package nv;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.Normalizer;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {BuildConfig.FLAVOR, InquiryField.StringField.TYPE, "a", "(Ljava/lang/String;)Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    @NotNull
    public static final String a(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return strNormalize;
    }
}

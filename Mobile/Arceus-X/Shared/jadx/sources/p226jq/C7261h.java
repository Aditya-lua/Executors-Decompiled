package p226jq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "", "a", "(J)Ljava/lang/String;", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7261h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m30280a(long j10) {
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(j10));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}

package ps;

import kotlin.Metadata;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "oldValue", "newValue", "", "times", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "operations-stdlib_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final String b(String str, String str2, String str3, int i10) {
        return i10 > 0 ? b(x.P(str, str2, str3, false, 4, null), str2, str3, i10 - 1) : str;
    }
}

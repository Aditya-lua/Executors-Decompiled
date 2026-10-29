package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.text.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "", "b", "(Ljava/lang/String;)Z", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7780g {
    /* JADX INFO: renamed from: b */
    public static final boolean m32250b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.m31983f(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}

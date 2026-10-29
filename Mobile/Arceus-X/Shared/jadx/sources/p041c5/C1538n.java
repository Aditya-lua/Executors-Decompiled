package p041c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: c5.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "", "a", "(Ljava/lang/StringBuilder;I)V", "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1538n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String[] f6199a = new String[0];

    /* JADX INFO: renamed from: a */
    public static final void m8111a(@NotNull StringBuilder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }
}

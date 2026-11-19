package eq;

import aq.h0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laq/h0;", "Leq/f;", "Leq/l;", "b", "()Laq/h0;", "nfc_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    @NotNull
    public static final h0<PassportNfcReaderConfig, l> b() {
        return new h0<>(new g(), new g.b() { // from class: eq.i
            @Override // g.b
            public final void a(Object obj) {
                j.c((l) obj);
            }
        });
    }

    public static final void c(l result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new m().b(result);
    }
}

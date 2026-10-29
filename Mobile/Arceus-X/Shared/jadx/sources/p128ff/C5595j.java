package p128ff;

import androidx.annotation.NonNull;
import p305n9.C8953m;

/* JADX INFO: renamed from: ff.j */
/* JADX INFO: loaded from: classes2.dex */
public class C5595j extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C5595j() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5595j(@NonNull String str) {
        super(str);
        C8953m.m36042g(str, "Detail message must not be empty");
    }
}

package hf;

import androidx.annotation.NonNull;
import o9.s;

/* JADX INFO: loaded from: classes2.dex */
public class j extends Exception {
    @Deprecated
    public j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NonNull String str) {
        super(str);
        s.g(str, "Detail message must not be empty");
    }
}

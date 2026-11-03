package qn;

import java.util.Objects;
import mn.l;
import on.s;

/* JADX INFO: loaded from: classes3.dex */
public interface g {
    static g a() {
        return null;
    }

    static g b(s sVar, h hVar) {
        Objects.requireNonNull(sVar, "node must not be null");
        Objects.requireNonNull(hVar, "position must not be null");
        return new l(sVar, hVar);
    }
}

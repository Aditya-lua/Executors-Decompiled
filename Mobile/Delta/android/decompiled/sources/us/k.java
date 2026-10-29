package us;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public interface a {
        @NonNull
        <N extends qn.s> a a(@NonNull Class<N> cls, t tVar);

        @NonNull
        k build();
    }

    <N extends qn.s> t a(@NonNull Class<N> cls);
}

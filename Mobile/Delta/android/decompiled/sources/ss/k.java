package ss;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public interface a {
        @NonNull
        <N extends on.s> a a(@NonNull Class<N> cls, t tVar);

        @NonNull
        k build();
    }

    <N extends on.s> t a(@NonNull Class<N> cls);
}

package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class Pair<F, S> {

    @Nullable
    public final F first;

    @Nullable
    public final S second;

    public Pair(@Nullable F first, @Nullable S second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object o8) {
        if (!(o8 instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p8 = (Pair) o8;
        return ObjectsCompat.equals(p8.first, this.first) && ObjectsCompat.equals(p8.second, this.second);
    }

    public int hashCode() {
        F f10 = this.first;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s8 = this.second;
        return iHashCode ^ (s8 != null ? s8.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
    }

    @NonNull
    public static <A, B> Pair<A, B> create(@Nullable A a10, @Nullable B b) {
        return new Pair<>(a10, b);
    }
}

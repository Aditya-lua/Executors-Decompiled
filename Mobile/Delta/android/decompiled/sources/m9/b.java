package m9;

import androidx.annotation.NonNull;
import java.io.Closeable;
import k9.k;

/* JADX INFO: loaded from: classes.dex */
public interface b<T> extends Iterable<T>, k, Closeable {
    @NonNull
    T get(int i10);

    int getCount();
}

package n9;

import androidx.annotation.NonNull;
import java.io.Closeable;
import l9.m;

/* JADX INFO: loaded from: classes.dex */
public interface b<T> extends Iterable<T>, m, Closeable {
    @NonNull
    T get(int i10);

    int getCount();
}

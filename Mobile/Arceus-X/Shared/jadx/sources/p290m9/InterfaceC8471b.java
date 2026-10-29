package p290m9;

import androidx.annotation.NonNull;
import java.io.Closeable;
import p242k9.InterfaceC7501k;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8471b<T> extends Iterable<T>, InterfaceC7501k, Closeable {
    @NonNull
    T get(int i10);

    int getCount();
}

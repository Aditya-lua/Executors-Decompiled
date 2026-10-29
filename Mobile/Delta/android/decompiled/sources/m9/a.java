package m9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataHolder f24041a;

    public a(DataHolder dataHolder) {
        this.f24041a = dataHolder;
    }

    @Override // k9.k
    public void a() {
        DataHolder dataHolder = this.f24041a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // m9.b
    public int getCount() {
        DataHolder dataHolder = this.f24041a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return new c(this);
    }
}

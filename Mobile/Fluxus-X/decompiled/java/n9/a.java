package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataHolder f25491a;

    public a(DataHolder dataHolder) {
        this.f25491a = dataHolder;
    }

    @Override // l9.m
    public void a() {
        DataHolder dataHolder = this.f25491a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // n9.b
    public int getCount() {
        DataHolder dataHolder = this.f25491a;
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

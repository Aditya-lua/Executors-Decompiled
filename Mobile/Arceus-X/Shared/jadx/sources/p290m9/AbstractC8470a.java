package p290m9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: renamed from: m9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8470a<T> implements InterfaceC8471b<T> {

    /* JADX INFO: renamed from: a */
    public final DataHolder f31182a;

    public AbstractC8470a(DataHolder dataHolder) {
        this.f31182a = dataHolder;
    }

    @Override // p242k9.InterfaceC7501k
    /* JADX INFO: renamed from: a */
    public void mo31162a() {
        DataHolder dataHolder = this.f31182a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo31162a();
    }

    @Override // p290m9.InterfaceC8471b
    public int getCount() {
        DataHolder dataHolder = this.f31182a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return new C8472c(this);
    }
}

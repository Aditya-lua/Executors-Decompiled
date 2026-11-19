package c8;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Closeable {

    public interface a {
        a a(Context context);

        u build();
    }

    public abstract k8.d a();

    public abstract t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}

package b8;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Closeable {

    public interface a {
        u build();

        a setApplicationContext(Context context);
    }

    public abstract j8.d a();

    public abstract t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}

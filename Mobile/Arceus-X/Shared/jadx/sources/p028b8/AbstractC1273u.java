package p028b8;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p212j8.InterfaceC7044d;

/* JADX INFO: renamed from: b8.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1273u implements Closeable {

    /* JADX INFO: renamed from: b8.u$a */
    public interface a {
        AbstractC1273u build();

        a setApplicationContext(Context context);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC7044d mo7015a();

    /* JADX INFO: renamed from: b */
    public abstract C1272t mo7016b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo7015a().close();
    }
}

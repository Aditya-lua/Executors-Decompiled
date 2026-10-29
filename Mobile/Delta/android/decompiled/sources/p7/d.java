package p7;

import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends Closeable {
    String B0();

    @NonNull
    InputStream I0();

    boolean isSuccessful();

    String u2();
}

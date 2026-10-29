package gk;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroid/os/StatFs;", "b", "()Landroid/os/StatFs;", "a", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    @NotNull
    public static final StatFs a() {
        return new StatFs(Environment.getExternalStorageDirectory().getPath());
    }

    @NotNull
    public static final StatFs b() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}

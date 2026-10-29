package p151gk;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gk.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, m31665d2 = {"Landroid/os/StatFs;", "b", "()Landroid/os/StatFs;", "a", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6117j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StatFs m27039a() {
        return new StatFs(Environment.getExternalStorageDirectory().getPath());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final StatFs m27040b() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}

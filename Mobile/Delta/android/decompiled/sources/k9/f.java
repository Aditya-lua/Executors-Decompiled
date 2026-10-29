package k9;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22283a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends l9.e {
    }

    @Deprecated
    public interface b extends l9.n {
    }

    @NonNull
    public static Set<f> b() {
        Set<f> set = f22283a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends k9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T a(@NonNull T t8) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(@NonNull l9.r rVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}

package l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22015a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends m9.e {
    }

    @Deprecated
    public interface b extends m9.n {
    }

    @NonNull
    public static Set<h> b() {
        Set<h> set = f22015a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends l9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends p, A>> T a(@NonNull T t8) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(@NonNull m9.r rVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}

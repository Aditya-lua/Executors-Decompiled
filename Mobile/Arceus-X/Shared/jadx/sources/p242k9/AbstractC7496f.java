package p242k9;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.AbstractC1899a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p268l9.InterfaceC8069r;

/* JADX INFO: renamed from: k9.f */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC7496f {

    /* JADX INFO: renamed from: a */
    public static final Set f28865a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k9.f$a */
    @Deprecated
    public interface a extends InterfaceC8030e {
    }

    /* JADX INFO: renamed from: k9.f$b */
    @Deprecated
    public interface b extends InterfaceC8057n {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static Set<AbstractC7496f> m31154b() {
        Set<AbstractC7496f> set = f28865a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: a */
    public <A extends C7491a.b, T extends AbstractC1899a<? extends InterfaceC7504n, A>> T mo31155a(@NonNull T t8) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Looper mo31156c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public boolean m31157d(@NonNull InterfaceC8069r interfaceC8069r) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public void m31158e() {
        throw new UnsupportedOperationException();
    }
}

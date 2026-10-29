package yn;

import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lyn/b0;", "Lyn/m;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Ljava/lang/Boolean;", "b", "Landroid/content/Context;", "Lyn/n;", "m", "()Lyn/n;", "status", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Boolean a() {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Object systemService = this.context.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            boolean z10 = true;
            if (audioManager.getMode() != 1 && audioManager.getMode() != 2) {
                z10 = false;
            }
            objB = jt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        if (jt.n.g(objB)) {
            objB = null;
        }
        return (Boolean) objB;
    }

    public final Boolean b() {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Object systemService = this.context.getSystemService("phone");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            objB = jt.n.b(Boolean.valueOf(((TelephonyManager) systemService).getCallState() != 0));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        if (jt.n.g(objB)) {
            objB = null;
        }
        return (Boolean) objB;
    }

    @Override // yn.m
    @NotNull
    public n m() {
        Boolean boolA = a();
        Boolean boolB = b();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(boolA, bool) || Intrinsics.c(boolB, bool)) {
            return n.ON_CALL;
        }
        return (boolA == null && boolB == null) ? n.UNAVAILABLE : n.NONE_DETECTED;
    }
}

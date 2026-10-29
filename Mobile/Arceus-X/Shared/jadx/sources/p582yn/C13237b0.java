package p582yn;

import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: yn.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lyn/b0;", "Lyn/m;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Ljava/lang/Boolean;", "b", "Landroid/content/Context;", "Lyn/n;", "m", "()Lyn/n;", NotificationCompat.CATEGORY_STATUS, "device_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13237b0 implements InterfaceC13250m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public C13237b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m48957a() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object systemService = this.context.getSystemService("audio");
            Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            boolean z10 = true;
            if (audioManager.getMode() != 1 && audioManager.getMode() != 2) {
                z10 = false;
            }
            objM30460b = C7347n.m30460b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        return (Boolean) objM30460b;
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m48958b() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object systemService = this.context.getSystemService("phone");
            Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            objM30460b = C7347n.m30460b(Boolean.valueOf(((TelephonyManager) systemService).getCallState() != 0));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        return (Boolean) objM30460b;
    }

    @Override // p582yn.InterfaceC13250m
    @NotNull
    /* JADX INFO: renamed from: m */
    public EnumC13251n mo48959m() {
        Boolean boolM48957a = m48957a();
        Boolean boolM48958b = m48958b();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.m31980c(boolM48957a, bool) || Intrinsics.m31980c(boolM48958b, bool)) {
            return EnumC13251n.ON_CALL;
        }
        return (boolM48957a == null && boolM48958b == null) ? EnumC13251n.UNAVAILABLE : EnumC13251n.NONE_DETECTED;
    }
}

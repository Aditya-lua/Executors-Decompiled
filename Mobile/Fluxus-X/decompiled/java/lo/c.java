package lo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import dv.p0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import zt.h;
import zt.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\"\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ldv/h;", "Llo/a;", "b", "()Ldv/h;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "d", "(Landroid/content/Context;)V", "f", "Landroid/content/BroadcastReceiver;", "a", "Lzt/h;", "c", "()Landroid/content/BroadcastReceiver;", "threatEventReceiver", "appdome-threatevents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f22379a = i.a(new Function0() { // from class: lo.b
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.e();
        }
    });

    @Nullable
    public static final dv.h<ThreatEventState> b() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState>");
            return (p0) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final BroadcastReceiver c() {
        return (BroadcastReceiver) f22379a.getValue();
    }

    public static final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverC = c();
        if (c() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = ThreatEventState.INSTANCE.a().iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(broadcastReceiverC, intentFilter, null, null, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiverC, intentFilter);
        }
    }

    public static final BroadcastReceiver e() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventReceiver").getConstructor(null).newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            return (BroadcastReceiver) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverC = c();
        if (c() == null) {
            return;
        }
        try {
            applicationContext.unregisterReceiver(broadcastReceiverC);
        } catch (Exception unused) {
        }
    }
}

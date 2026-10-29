package p553xn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: xn.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\"\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lnu/h;", "Lxn/a;", "b", "()Lnu/h;", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)V", "f", "Landroid/content/BroadcastReceiver;", "a", "Ljt/h;", "c", "()Landroid/content/BroadcastReceiver;", "threatEventReceiver", "appdome-threatevents_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12868c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC7341h f45723a = C7342i.m30456b(new Function0() { // from class: xn.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12868c.m47897e();
        }
    });

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC9575h<ThreatEventState> m47894b() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState>");
            return (InterfaceC9592p0) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final BroadcastReceiver m47895c() {
        return (BroadcastReceiver) f45723a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final void m47896d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverM47895c = m47895c();
        if (m47895c() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = ThreatEventState.INSTANCE.m47890a().iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(broadcastReceiverM47895c, intentFilter, null, null, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiverM47895c, intentFilter);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final BroadcastReceiver m47897e() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventReceiver").getConstructor(null).newInstance(null);
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            return (BroadcastReceiver) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m47898f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverM47895c = m47895c();
        if (m47895c() == null) {
            return;
        }
        try {
            applicationContext.unregisterReceiver(broadcastReceiverM47895c);
        } catch (Exception unused) {
        }
    }
}

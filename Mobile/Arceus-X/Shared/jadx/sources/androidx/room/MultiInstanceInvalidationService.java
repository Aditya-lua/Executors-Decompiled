package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/a;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/b$a;", "Landroidx/room/b$a;", "binder", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxClientId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, String> clientNames = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final RemoteCallbackList<InterfaceC1073a> callbackList = new RemoteCallbackListC1072b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1074b.a binder = new BinderC1071a();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/b$a;", "Landroidx/room/a;", "callback", "", "name", "", "Y0", "(Landroidx/room/a;Ljava/lang/String;)I", "clientId", "", "n2", "(Landroidx/room/a;I)V", "", "tables", "B0", "(I[Ljava/lang/String;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class BinderC1071a extends InterfaceC1074b.a {
        public BinderC1071a() {
        }

        @Override // androidx.room.InterfaceC1074b
        /* JADX INFO: renamed from: B0 */
        public void mo6093B0(int clientId, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<InterfaceC1073a> remoteCallbackListM6089a = MultiInstanceInvalidationService.this.m6089a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM6089a) {
                String str = multiInstanceInvalidationService.m6090b().get(Integer.valueOf(clientId));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.m6089a().beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.m6089a().getBroadcastCookie(i10);
                        Intrinsics.m31981d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.m6090b().get(num);
                        if (clientId != iIntValue && Intrinsics.m31980c(str, str2)) {
                            try {
                                ((InterfaceC1073a) multiInstanceInvalidationService.m6089a().getBroadcastItem(i10)).mo6097A(tables);
                                Unit unit = Unit.f29331a;
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.m6089a().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.m6089a().finishBroadcast();
                Unit unit2 = Unit.f29331a;
            }
        }

        @Override // androidx.room.InterfaceC1074b
        /* JADX INFO: renamed from: Y0 */
        public int mo6094Y0(InterfaceC1073a callback, String name) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i10 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<InterfaceC1073a> remoteCallbackListM6089a = MultiInstanceInvalidationService.this.m6089a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM6089a) {
                try {
                    multiInstanceInvalidationService.m6092d(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.m6089a().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.m6090b().put(Integer.valueOf(maxClientId), name);
                        i10 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.m6092d(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        @Override // androidx.room.InterfaceC1074b
        /* JADX INFO: renamed from: n2 */
        public void mo6095n2(InterfaceC1073a callback, int clientId) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<InterfaceC1073a> remoteCallbackListM6089a = MultiInstanceInvalidationService.this.m6089a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM6089a) {
                multiInstanceInvalidationService.m6089a().unregister(callback);
                multiInstanceInvalidationService.m6090b().remove(Integer.valueOf(clientId));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/a;", "callback", "", "cookie", "", "a", "(Landroidx/room/a;Ljava/lang/Object;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class RemoteCallbackListC1072b extends RemoteCallbackList<InterfaceC1073a> {
        public RemoteCallbackListC1072b() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCallbackDied(Landroid/os/IInterface;Ljava/lang/Object;)V */
        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC1073a callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.m6090b().remove((Integer) cookie);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final RemoteCallbackList<InterfaceC1073a> m6089a() {
        return this.callbackList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<Integer, String> m6090b() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    /* JADX INFO: renamed from: d */
    public final void m6092d(int i10) {
        this.maxClientId = i10;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}

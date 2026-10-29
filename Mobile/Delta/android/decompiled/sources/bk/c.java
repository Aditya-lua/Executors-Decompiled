package bk;

import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbk/c;", "", "<init>", "()V", "Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;", "listener", "", "a", "(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getSetAppBridgeNotificationListenerDelegate", "()Lkotlin/jvm/functions/Function1;", "setSetAppBridgeNotificationListenerDelegate", "(Lkotlin/jvm/functions/Function1;)V", "setAppBridgeNotificationListenerDelegate", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f4207a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super OnAppBridgeNotificationListener, Unit> setAppBridgeNotificationListenerDelegate = a.f4208a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function1<OnAppBridgeNotificationListener, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4208a = new a();

        public a() {
            super(1, NativeGLJavaInterface.class, "setAppBridgeNotificationListener", "setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V", 0);
        }

        public final void d(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
            NativeGLJavaInterface.setAppBridgeNotificationListener(onAppBridgeNotificationListener);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
            d(onAppBridgeNotificationListener);
            return Unit.f22483a;
        }
    }

    public static final void a(@NotNull OnAppBridgeNotificationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setAppBridgeNotificationListenerDelegate.invoke(listener);
    }
}

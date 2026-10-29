package p030bk;

import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bk.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lbk/c;", "", "<init>", "()V", "Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;", "listener", "", "a", "(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getSetAppBridgeNotificationListenerDelegate", "()Lkotlin/jvm/functions/Function1;", "setSetAppBridgeNotificationListenerDelegate", "(Lkotlin/jvm/functions/Function1;)V", "setAppBridgeNotificationListenerDelegate", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1443c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1443c f5647a = new C1443c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super OnAppBridgeNotificationListener, Unit> setAppBridgeNotificationListenerDelegate = a.f5649a;

    /* JADX INFO: renamed from: bk.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function1<OnAppBridgeNotificationListener, Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f5649a = new a();

        public a() {
            super(1, NativeGLJavaInterface.class, "setAppBridgeNotificationListener", "setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7451d(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
            NativeGLJavaInterface.setAppBridgeNotificationListener(onAppBridgeNotificationListener);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
            m7451d(onAppBridgeNotificationListener);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7450a(@NotNull OnAppBridgeNotificationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setAppBridgeNotificationListenerDelegate.invoke(listener);
    }
}

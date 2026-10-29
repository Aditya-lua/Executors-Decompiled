package bk;

import com.roblox.engine.jni.NativeAppBridgeInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import zt.p;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018RF\u0010$\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lbk/a;", "", "<init>", "()V", "", "isFirstInstall", "", "c", "(Z)V", "enabled", "b", "", "launchIntentAction", "launchIntentDataString", "isInBackground", "launchIntentExtrasJson", "launchSource", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getSetEnableConnectivityV2ForAndroidDelegate", "()Lkotlin/jvm/functions/Function1;", "setSetEnableConnectivityV2ForAndroidDelegate", "(Lkotlin/jvm/functions/Function1;)V", "setEnableConnectivityV2ForAndroidDelegate", "getSetIsFirstInstallDelegate", "setSetIsFirstInstallDelegate", "setIsFirstInstallDelegate", "Lkotlin/Function5;", "d", "Lzt/p;", "getNativeAppBridgeAppStartDelegate", "()Lzt/p;", "setNativeAppBridgeAppStartDelegate", "(Lzt/p;)V", "nativeAppBridgeAppStartDelegate", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f4199a = new a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super Boolean, Unit> setEnableConnectivityV2ForAndroidDelegate = b.f4203a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super Boolean, Unit> setIsFirstInstallDelegate = c.f4204a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static p<? super String, ? super String, ? super Boolean, ? super String, ? super String, Unit> nativeAppBridgeAppStartDelegate = C0083a.f4202a;

    /* JADX INFO: renamed from: bk.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0083a extends k implements p<String, String, Boolean, String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0083a f4202a = new C0083a();

        public C0083a() {
            super(5, NativeAppBridgeInterface.class, "nativeAppBridgeAppStart", "nativeAppBridgeAppStart(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final void d(String str, String str2, boolean z10, String str3, String str4) {
            NativeAppBridgeInterface.a(str, str2, z10, str3, str4);
        }

        @Override // zt.p
        public /* bridge */ /* synthetic */ Unit l(String str, String str2, Boolean bool, String str3, String str4) {
            d(str, str2, bool.booleanValue(), str3, str4);
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4203a = new b();

        public b() {
            super(1, NativeAppBridgeInterface.class, "setEnableConnectivityV2ForAndroid", "setEnableConnectivityV2ForAndroid(Z)V", 0);
        }

        public final void d(boolean z10) {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            d(bool.booleanValue());
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends k implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4204a = new c();

        public c() {
            super(1, NativeAppBridgeInterface.class, "setIsFirstInstall", "setIsFirstInstall(Z)V", 0);
        }

        public final void d(boolean z10) {
            NativeAppBridgeInterface.setIsFirstInstall(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            d(bool.booleanValue());
            return Unit.f22483a;
        }
    }

    public static final void a(@NotNull String launchIntentAction, @NotNull String launchIntentDataString, boolean isInBackground, @NotNull String launchIntentExtrasJson, @NotNull String launchSource) {
        Intrinsics.checkNotNullParameter(launchIntentAction, "launchIntentAction");
        Intrinsics.checkNotNullParameter(launchIntentDataString, "launchIntentDataString");
        Intrinsics.checkNotNullParameter(launchIntentExtrasJson, "launchIntentExtrasJson");
        Intrinsics.checkNotNullParameter(launchSource, "launchSource");
        nativeAppBridgeAppStartDelegate.l(launchIntentAction, launchIntentDataString, Boolean.valueOf(isInBackground), launchIntentExtrasJson, launchSource);
    }

    public static final void b(boolean enabled) {
        setEnableConnectivityV2ForAndroidDelegate.invoke(Boolean.valueOf(enabled));
    }

    public static final void c(boolean isFirstInstall) {
        setIsFirstInstallDelegate.invoke(Boolean.valueOf(isFirstInstall));
    }
}

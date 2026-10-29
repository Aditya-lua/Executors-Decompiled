package p030bk;

import com.roblox.engine.jni.NativeAppBridgeInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p615zt.InterfaceC14059p;

/* JADX INFO: renamed from: bk.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018RF\u0010$\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lbk/a;", "", "<init>", "()V", "", "isFirstInstall", "", "c", "(Z)V", "enabled", "b", "", "launchIntentAction", "launchIntentDataString", "isInBackground", "launchIntentExtrasJson", "launchSource", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getSetEnableConnectivityV2ForAndroidDelegate", "()Lkotlin/jvm/functions/Function1;", "setSetEnableConnectivityV2ForAndroidDelegate", "(Lkotlin/jvm/functions/Function1;)V", "setEnableConnectivityV2ForAndroidDelegate", "getSetIsFirstInstallDelegate", "setSetIsFirstInstallDelegate", "setIsFirstInstallDelegate", "Lkotlin/Function5;", "d", "Lzt/p;", "getNativeAppBridgeAppStartDelegate", "()Lzt/p;", "setNativeAppBridgeAppStartDelegate", "(Lzt/p;)V", "nativeAppBridgeAppStartDelegate", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1441a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1441a f5637a = new C1441a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super Boolean, Unit> setEnableConnectivityV2ForAndroidDelegate = b.f5642a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super Boolean, Unit> setIsFirstInstallDelegate = c.f5643a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC14059p<? super String, ? super String, ? super Boolean, ? super String, ? super String, Unit> nativeAppBridgeAppStartDelegate = a.f5641a;

    /* JADX INFO: renamed from: bk.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements InterfaceC14059p<String, String, Boolean, String, String, Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f5641a = new a();

        public a() {
            super(5, NativeAppBridgeInterface.class, "nativeAppBridgeAppStart", "nativeAppBridgeAppStart(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7444d(String str, String str2, boolean z10, String str3, String str4) {
            NativeAppBridgeInterface.m15789a(str, str2, z10, str3, str4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14059p
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ Unit mo7445l(String str, String str2, Boolean bool, String str3, String str4) {
            m7444d(str, str2, bool.booleanValue(), str3, str4);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: bk.a$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a */
        public static final b f5642a = new b();

        public b() {
            super(1, NativeAppBridgeInterface.class, "setEnableConnectivityV2ForAndroid", "setEnableConnectivityV2ForAndroid(Z)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7446d(boolean z10) {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            m7446d(bool.booleanValue());
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: bk.a$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a */
        public static final c f5643a = new c();

        public c() {
            super(1, NativeAppBridgeInterface.class, "setIsFirstInstall", "setIsFirstInstall(Z)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7447d(boolean z10) {
            NativeAppBridgeInterface.setIsFirstInstall(z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            m7447d(bool.booleanValue());
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7441a(@NotNull String launchIntentAction, @NotNull String launchIntentDataString, boolean isInBackground, @NotNull String launchIntentExtrasJson, @NotNull String launchSource) {
        Intrinsics.checkNotNullParameter(launchIntentAction, "launchIntentAction");
        Intrinsics.checkNotNullParameter(launchIntentDataString, "launchIntentDataString");
        Intrinsics.checkNotNullParameter(launchIntentExtrasJson, "launchIntentExtrasJson");
        Intrinsics.checkNotNullParameter(launchSource, "launchSource");
        nativeAppBridgeAppStartDelegate.mo7445l(launchIntentAction, launchIntentDataString, Boolean.valueOf(isInBackground), launchIntentExtrasJson, launchSource);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7442b(boolean enabled) {
        setEnableConnectivityV2ForAndroidDelegate.invoke(Boolean.valueOf(enabled));
    }

    /* JADX INFO: renamed from: c */
    public static final void m7443c(boolean isFirstInstall) {
        setIsFirstInstallDelegate.invoke(Boolean.valueOf(isFirstInstall));
    }
}

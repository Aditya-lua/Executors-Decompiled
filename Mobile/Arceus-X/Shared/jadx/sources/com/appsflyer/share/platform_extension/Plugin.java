package com.appsflyer.share.platform_extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.appsflyer.share.platform_extension.Plugin[], still in use, count: 1, list:
  (r0v4 com.appsflyer.share.platform_extension.Plugin[]) from 0x00c9: INVOKE (r0v4 com.appsflyer.share.platform_extension.Plugin[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, m31665d2 = {"Lcom/appsflyer/share/platform_extension/Plugin;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pluginName", "Ljava/lang/String;", "getPluginName", "()Ljava/lang/String;", "NATIVE", "UNITY", "FLUTTER", "REACT_NATIVE", "ADOBE_AIR", "ADOBE_MOBILE", "COCOS_2DX", "CORDOVA", "MPARTICLE", "NATIVE_SCRIPT", "EXPO", "UNREAL", "XAMARIN", "CAPACITOR", "SEGMENT"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class Plugin {
    NATIVE("android_native"),
    UNITY("android_unity"),
    FLUTTER("android_flutter"),
    REACT_NATIVE("android_react_native"),
    ADOBE_AIR("android_adobe_air"),
    ADOBE_MOBILE("android_adobe_mobile"),
    COCOS_2DX("android_cocos2dx"),
    CORDOVA("android_cordova"),
    MPARTICLE("android_mparticle"),
    NATIVE_SCRIPT("android_native_script"),
    EXPO("android_expo"),
    UNREAL("android_unreal"),
    XAMARIN("android_xamarin"),
    CAPACITOR("android_capacitor"),
    SEGMENT("android_segment");

    private static final /* synthetic */ InterfaceC10707a registerClient;

    @NotNull
    private final String pluginName;

    static {
        registerClient = C10708b.m40805a(pluginArr);
    }

    private Plugin(String str) {
        super(str, i);
        this.pluginName = str;
    }

    @NotNull
    public static InterfaceC10707a<Plugin> getEntries() {
        return registerClient;
    }

    public static Plugin valueOf(String str) {
        return (Plugin) Enum.valueOf(Plugin.class, str);
    }

    public static Plugin[] values() {
        return (Plugin[]) AFKeystoreWrapper.clone();
    }

    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }
}

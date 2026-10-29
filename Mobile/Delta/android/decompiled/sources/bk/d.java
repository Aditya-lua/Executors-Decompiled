package bk;

import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.DeviceParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006-"}, d2 = {"Lbk/d;", "", "<init>", "()V", "", "externalDirectory", "", "d", "(Ljava/lang/String;)V", "internalDirectory", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "preferencesFile", "e", "Lcom/roblox/engine/jni/model/DeviceParams;", "deviceParams", "c", "(Lcom/roblox/engine/jni/model/DeviceParams;)V", "url", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getNativeSetExternalDirectoryDelegate", "()Lkotlin/jvm/functions/Function1;", "setNativeSetExternalDirectoryDelegate", "(Lkotlin/jvm/functions/Function1;)V", "nativeSetExternalDirectoryDelegate", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getNativeSetBaseDataDirectoriesDelegate", "()Lkotlin/jvm/functions/Function2;", "setNativeSetBaseDataDirectoriesDelegate", "(Lkotlin/jvm/functions/Function2;)V", "nativeSetBaseDataDirectoriesDelegate", "getNativeSetPreferencesFileDelegate", "setNativeSetPreferencesFileDelegate", "nativeSetPreferencesFileDelegate", "getNativeSetDeviceInfoDelegate", "setNativeSetDeviceInfoDelegate", "nativeSetDeviceInfoDelegate", "f", "getNativeGetCookiesInNetscapeFormatDelegate", "setNativeGetCookiesInNetscapeFormatDelegate", "nativeGetCookiesInNetscapeFormatDelegate", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f4209a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> nativeSetExternalDirectoryDelegate = C0084d.f4217a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function2<? super String, ? super String, Unit> nativeSetBaseDataDirectoriesDelegate = b.f4215a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> nativeSetPreferencesFileDelegate = e.f4218a;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super DeviceParams, Unit> nativeSetDeviceInfoDelegate = c.f4216a;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super String, String> nativeGetCookiesInNetscapeFormatDelegate = a.f4214a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function1<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4214a = new a();

        public a() {
            super(1, NativeSettingsInterface.class, "nativeGetCookiesInNetscapeFormat", "nativeGetCookiesInNetscapeFormat(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4215a = new b();

        public b() {
            super(2, NativeSettingsInterface.class, "nativeSetBaseDataDirectories", "nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final void d(String str, String str2) {
            NativeSettingsInterface.nativeSetBaseDataDirectories(str, str2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            d(str, str2);
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends k implements Function1<DeviceParams, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4216a = new c();

        public c() {
            super(1, NativeSettingsInterface.class, "nativeSetDeviceInfo", "nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V", 0);
        }

        public final void d(DeviceParams deviceParams) {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParams);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceParams deviceParams) {
            d(deviceParams);
            return Unit.f22483a;
        }
    }

    /* JADX INFO: renamed from: bk.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0084d extends k implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0084d f4217a = new C0084d();

        public C0084d() {
            super(1, NativeSettingsInterface.class, "nativeSetExternalDirectory", "nativeSetExternalDirectory(Ljava/lang/String;)V", 0);
        }

        public final void d(String str) {
            NativeSettingsInterface.nativeSetExternalDirectory(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            d(str);
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e extends k implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4218a = new e();

        public e() {
            super(1, NativeSettingsInterface.class, "nativeSetPreferencesFile", "nativeSetPreferencesFile(Ljava/lang/String;)V", 0);
        }

        public final void d(String str) {
            NativeSettingsInterface.nativeSetPreferencesFile(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            d(str);
            return Unit.f22483a;
        }
    }

    @NotNull
    public static final String a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return nativeGetCookiesInNetscapeFormatDelegate.invoke(url);
    }

    public static final void b(@NotNull String internalDirectory, @NotNull String externalDirectory) {
        Intrinsics.checkNotNullParameter(internalDirectory, "internalDirectory");
        Intrinsics.checkNotNullParameter(externalDirectory, "externalDirectory");
        nativeSetBaseDataDirectoriesDelegate.invoke(internalDirectory, externalDirectory);
    }

    public static final void c(@NotNull DeviceParams deviceParams) {
        Intrinsics.checkNotNullParameter(deviceParams, "deviceParams");
        nativeSetDeviceInfoDelegate.invoke(deviceParams);
    }

    public static final void d(@NotNull String externalDirectory) {
        Intrinsics.checkNotNullParameter(externalDirectory, "externalDirectory");
        nativeSetExternalDirectoryDelegate.invoke(externalDirectory);
    }

    public static final void e(@NotNull String preferencesFile) {
        Intrinsics.checkNotNullParameter(preferencesFile, "preferencesFile");
        nativeSetPreferencesFileDelegate.invoke(preferencesFile);
    }
}

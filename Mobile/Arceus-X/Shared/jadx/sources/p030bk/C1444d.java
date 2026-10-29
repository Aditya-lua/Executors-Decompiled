package p030bk;

import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.DeviceParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bk.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006-"}, m31665d2 = {"Lbk/d;", "", "<init>", "()V", "", "externalDirectory", "", "d", "(Ljava/lang/String;)V", "internalDirectory", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "preferencesFile", "e", "Lcom/roblox/engine/jni/model/DeviceParams;", "deviceParams", "c", "(Lcom/roblox/engine/jni/model/DeviceParams;)V", "url", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getNativeSetExternalDirectoryDelegate", "()Lkotlin/jvm/functions/Function1;", "setNativeSetExternalDirectoryDelegate", "(Lkotlin/jvm/functions/Function1;)V", "nativeSetExternalDirectoryDelegate", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getNativeSetBaseDataDirectoriesDelegate", "()Lkotlin/jvm/functions/Function2;", "setNativeSetBaseDataDirectoriesDelegate", "(Lkotlin/jvm/functions/Function2;)V", "nativeSetBaseDataDirectoriesDelegate", "getNativeSetPreferencesFileDelegate", "setNativeSetPreferencesFileDelegate", "nativeSetPreferencesFileDelegate", "getNativeSetDeviceInfoDelegate", "setNativeSetDeviceInfoDelegate", "nativeSetDeviceInfoDelegate", "f", "getNativeGetCookiesInNetscapeFormatDelegate", "setNativeGetCookiesInNetscapeFormatDelegate", "nativeGetCookiesInNetscapeFormatDelegate", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1444d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1444d f5650a = new C1444d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> nativeSetExternalDirectoryDelegate = d.f5659a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Function2<? super String, ? super String, Unit> nativeSetBaseDataDirectoriesDelegate = b.f5657a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> nativeSetPreferencesFileDelegate = e.f5660a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super DeviceParams, Unit> nativeSetDeviceInfoDelegate = c.f5658a;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super String, String> nativeGetCookiesInNetscapeFormatDelegate = a.f5656a;

    /* JADX INFO: renamed from: bk.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function1<String, String> {

        /* JADX INFO: renamed from: a */
        public static final a f5656a = new a();

        public a() {
            super(1, NativeSettingsInterface.class, "nativeGetCookiesInNetscapeFormat", "nativeGetCookiesInNetscapeFormat(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(str);
        }
    }

    /* JADX INFO: renamed from: bk.d$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a */
        public static final b f5657a = new b();

        public b() {
            super(2, NativeSettingsInterface.class, "nativeSetBaseDataDirectories", "nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7458d(String str, String str2) {
            NativeSettingsInterface.nativeSetBaseDataDirectories(str, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            m7458d(str, str2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: bk.d$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function1<DeviceParams, Unit> {

        /* JADX INFO: renamed from: a */
        public static final c f5658a = new c();

        public c() {
            super(1, NativeSettingsInterface.class, "nativeSetDeviceInfo", "nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7459d(DeviceParams deviceParams) {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParams);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceParams deviceParams) {
            m7459d(deviceParams);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: bk.d$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d extends C7744k implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public static final d f5659a = new d();

        public d() {
            super(1, NativeSettingsInterface.class, "nativeSetExternalDirectory", "nativeSetExternalDirectory(Ljava/lang/String;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7460d(String str) {
            NativeSettingsInterface.nativeSetExternalDirectory(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m7460d(str);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: bk.d$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class e extends C7744k implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public static final e f5660a = new e();

        public e() {
            super(1, NativeSettingsInterface.class, "nativeSetPreferencesFile", "nativeSetPreferencesFile(Ljava/lang/String;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7461d(String str) {
            NativeSettingsInterface.nativeSetPreferencesFile(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m7461d(str);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m7452a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return nativeGetCookiesInNetscapeFormatDelegate.invoke(url);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7453b(@NotNull String internalDirectory, @NotNull String externalDirectory) {
        Intrinsics.checkNotNullParameter(internalDirectory, "internalDirectory");
        Intrinsics.checkNotNullParameter(externalDirectory, "externalDirectory");
        nativeSetBaseDataDirectoriesDelegate.invoke(internalDirectory, externalDirectory);
    }

    /* JADX INFO: renamed from: c */
    public static final void m7454c(@NotNull DeviceParams deviceParams) {
        Intrinsics.checkNotNullParameter(deviceParams, "deviceParams");
        nativeSetDeviceInfoDelegate.invoke(deviceParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m7455d(@NotNull String externalDirectory) {
        Intrinsics.checkNotNullParameter(externalDirectory, "externalDirectory");
        nativeSetExternalDirectoryDelegate.invoke(externalDirectory);
    }

    /* JADX INFO: renamed from: e */
    public static final void m7456e(@NotNull String preferencesFile) {
        Intrinsics.checkNotNullParameter(preferencesFile, "preferencesFile");
        nativeSetPreferencesFileDelegate.invoke(preferencesFile);
    }
}

package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import bh.e2;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.PlatformParams;
import com.roblox.platform.util.DeviceUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13777a;

    public p(Context context) {
        this.f13777a = context;
    }

    public static f.d a(Context context) {
        return b(context, null);
    }

    public static f.d b(Context context, Activity activity) {
        p pVar = new p(context);
        com.roblox.engine.jni.model.a aVar = new com.roblox.engine.jni.model.a(pVar.f());
        aVar.f9663a = true;
        aVar.b = true;
        aVar.f9664c = true;
        aVar.f9665d = bh.a1.r0();
        DeviceParams deviceParamsD = pVar.d();
        f.d dVar = new f.d();
        dVar.b = aVar;
        dVar.f13699c = deviceParamsD;
        dVar.f13700d = "rbxasset://places/Mobile.rbxl";
        dVar.f13701e = "LuaAppStarterScript";
        dVar.f13702f = nk.c.c().j();
        dVar.f13703g = nk.c.c().n();
        dVar.f13704h = nk.c.c().k();
        dVar.f13705i = nk.c.c().d();
        dVar.f13706j = nk.c.c().i();
        dVar.f13698a = activity;
        return dVar;
    }

    public static DeviceParams c(Context context) {
        return new p(context).d();
    }

    public static DeviceStaticParams e() {
        DeviceStaticParams deviceStaticParams = new DeviceStaticParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceStaticParams.osVersion = Integer.toString(i10);
        deviceStaticParams.deviceName = bh.v.b();
        deviceStaticParams.appVersion = bh.a1.e1();
        deviceStaticParams.manufacturer = Build.MANUFACTURER;
        if (i10 >= 31) {
            deviceStaticParams.deviceSku = Build.SKU;
            deviceStaticParams.socModel = Build.SOC_MODEL;
        }
        deviceStaticParams.appBuildVariant = ok.h.a();
        deviceStaticParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        return deviceStaticParams;
    }

    public DeviceParams d() {
        DeviceParams deviceParams = new DeviceParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i10);
        deviceParams.deviceName = bh.v.b();
        deviceParams.appVersion = bh.a1.e1();
        Locale localeE = yi.b.f().e();
        deviceParams.country = localeE != null ? localeE.getCountry() : BuildConfig.FLAVOR;
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = DeviceUtils.getDeviceTotalMegabytes(this.f13777a);
        Point screenSize = DeviceUtils.getScreenSize(this.f13777a);
        deviceParams.displayResolution = screenSize.x + "x" + screenSize.y;
        Point screenPhysicalSize = DeviceUtils.getScreenPhysicalSize(this.f13777a);
        deviceParams.displayPhysicalWidthPixels = screenPhysicalSize.x;
        deviceParams.displayPhysicalHeightPixels = screenPhysicalSize.y;
        deviceParams.networkType = e2.g(this.f13777a);
        e2.b(this.f13777a, deviceParams);
        e2.c(this.f13777a, deviceParams);
        deviceParams.isChrome = bh.a1.k0();
        deviceParams.appBuildVariant = ok.h.a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i10 >= 31) {
            deviceParams.deviceSku = Build.SKU;
            deviceParams.socModel = Build.SOC_MODEL;
        }
        if (bi.h.a().c2()) {
            deviceParams.testDeviceName = bh.v.c(this.f13777a);
        }
        return deviceParams;
    }

    public PlatformParams f() {
        String strR = uk.c.p().r();
        ok.q.b("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = this.f13777a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f13777a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f13777a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = DeviceUtils.getScreenDensity(this.f13777a);
        Point screenPhysicalSizeInMillimeters = DeviceUtils.getScreenPhysicalSizeInMillimeters(this.f13777a);
        platformParams.viewportWidthMm = screenPhysicalSizeInMillimeters.x;
        platformParams.viewportHeightMm = screenPhysicalSizeInMillimeters.y;
        return platformParams;
    }
}

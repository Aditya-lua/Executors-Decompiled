package uh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Locale;
import rg.e2;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33039a;

    public p(Context context) {
        this.f33039a = context;
    }

    public static f.d a(Context context) {
        return b(context, null);
    }

    public static f.d b(Context context, Activity activity) {
        p pVar = new p(context);
        ok.a aVar = new ok.a(pVar.f());
        aVar.isLuaHomePageEnabled = true;
        aVar.isLuaGamesPageEnabled = true;
        aVar.isLuaChatEnabled = true;
        aVar.isTablet = rg.a1.r0();
        DeviceParams deviceParamsD = pVar.d();
        f.d dVar = new f.d();
        dVar.b = aVar;
        dVar.f32961c = deviceParamsD;
        dVar.f32962d = "rbxasset://places/Mobile.rbxl";
        dVar.f32963e = "LuaAppStarterScript";
        dVar.f32964f = dk.c.c().j();
        dVar.f32965g = dk.c.c().n();
        dVar.f32966h = dk.c.c().k();
        dVar.f32967i = dk.c.c().d();
        dVar.f32968j = dk.c.c().i();
        dVar.f32960a = activity;
        return dVar;
    }

    public static DeviceParams c(Context context) {
        return new p(context).d();
    }

    public static DeviceStaticParams e() {
        DeviceStaticParams deviceStaticParams = new DeviceStaticParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceStaticParams.osVersion = Integer.toString(i10);
        deviceStaticParams.deviceName = rg.v.b();
        deviceStaticParams.appVersion = rg.a1.e1();
        deviceStaticParams.manufacturer = Build.MANUFACTURER;
        if (i10 >= 31) {
            deviceStaticParams.deviceSku = Build.SKU;
            deviceStaticParams.socModel = Build.SOC_MODEL;
        }
        deviceStaticParams.appBuildVariant = ek.h.a();
        deviceStaticParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        return deviceStaticParams;
    }

    public DeviceParams d() {
        DeviceParams deviceParams = new DeviceParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i10);
        deviceParams.deviceName = rg.v.b();
        deviceParams.appVersion = rg.a1.e1();
        Locale localeE = oi.b.f().e();
        deviceParams.country = localeE != null ? localeE.getCountry() : "";
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = cl.a.c(this.f33039a);
        Point pointJ = cl.a.j(this.f33039a);
        deviceParams.displayResolution = pointJ.x + "x" + pointJ.y;
        Point pointH = cl.a.h(this.f33039a);
        deviceParams.displayPhysicalWidthPixels = pointH.x;
        deviceParams.displayPhysicalHeightPixels = pointH.y;
        deviceParams.networkType = e2.g(this.f33039a);
        e2.b(this.f33039a, deviceParams);
        e2.c(this.f33039a, deviceParams);
        deviceParams.isChrome = rg.a1.k0();
        deviceParams.appBuildVariant = ek.h.a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i10 >= 31) {
            deviceParams.deviceSku = Build.SKU;
            deviceParams.socModel = Build.SOC_MODEL;
        }
        if (rh.h.a().c2()) {
            deviceParams.testDeviceName = rg.v.c(this.f33039a);
        }
        return deviceParams;
    }

    public PlatformParams f() {
        String strR = kk.c.p().r();
        ek.q.b("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = this.f33039a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f33039a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f33039a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = cl.a.e(this.f33039a);
        Point pointI = cl.a.i(this.f33039a);
        platformParams.viewportWidthMm = pointI.x;
        platformParams.viewportHeightMm = pointI.y;
        return platformParams;
    }
}

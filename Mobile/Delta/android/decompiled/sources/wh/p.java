package wh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Locale;
import sg.a1;
import sg.e2;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34362a;

    public p(Context context) {
        this.f34362a = context;
    }

    public static f.d a(Context context) {
        return b(context, null);
    }

    public static f.d b(Context context, Activity activity) {
        p pVar = new p(context);
        qk.a aVar = new qk.a(pVar.f());
        aVar.isLuaHomePageEnabled = true;
        aVar.isLuaGamesPageEnabled = true;
        aVar.isLuaChatEnabled = true;
        aVar.isTablet = a1.r0();
        DeviceParams deviceParamsD = pVar.d();
        f.d dVar = new f.d();
        dVar.b = aVar;
        dVar.f34284c = deviceParamsD;
        dVar.f34285d = "rbxasset://places/Mobile.rbxl";
        dVar.f34286e = "LuaAppStarterScript";
        dVar.f34287f = fk.c.c().j();
        dVar.f34288g = fk.c.c().n();
        dVar.f34289h = fk.c.c().k();
        dVar.f34290i = fk.c.c().d();
        dVar.f34291j = fk.c.c().i();
        dVar.f34283a = activity;
        return dVar;
    }

    public static DeviceParams c(Context context) {
        return new p(context).d();
    }

    public static DeviceStaticParams e() {
        DeviceStaticParams deviceStaticParams = new DeviceStaticParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceStaticParams.osVersion = Integer.toString(i10);
        deviceStaticParams.deviceName = sg.v.b();
        deviceStaticParams.appVersion = a1.d1();
        deviceStaticParams.manufacturer = Build.MANUFACTURER;
        if (i10 >= 31) {
            deviceStaticParams.deviceSku = Build.SKU;
            deviceStaticParams.socModel = Build.SOC_MODEL;
        }
        deviceStaticParams.appBuildVariant = gk.h.a();
        deviceStaticParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        return deviceStaticParams;
    }

    public DeviceParams d() {
        DeviceParams deviceParams = new DeviceParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i10);
        deviceParams.deviceName = sg.v.b();
        deviceParams.appVersion = a1.d1();
        Locale localeE = qi.b.f().e();
        deviceParams.country = localeE != null ? localeE.getCountry() : "";
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = el.a.c(this.f34362a);
        Point pointJ = el.a.j(this.f34362a);
        deviceParams.displayResolution = pointJ.x + "x" + pointJ.y;
        Point pointH = el.a.h(this.f34362a);
        deviceParams.displayPhysicalWidthPixels = pointH.x;
        deviceParams.displayPhysicalHeightPixels = pointH.y;
        deviceParams.networkType = e2.g(this.f34362a);
        e2.b(this.f34362a, deviceParams);
        e2.c(this.f34362a, deviceParams);
        deviceParams.isChrome = a1.k0();
        deviceParams.appBuildVariant = gk.h.a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i10 >= 31) {
            deviceParams.deviceSku = Build.SKU;
            deviceParams.socModel = Build.SOC_MODEL;
        }
        if (th.h.a().S1()) {
            deviceParams.testDeviceName = sg.v.c(this.f34362a);
        }
        return deviceParams;
    }

    public PlatformParams f() {
        String strR = mk.c.p().r();
        gk.p.b("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = this.f34362a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f34362a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f34362a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = el.a.e(this.f34362a);
        Point pointI = el.a.i(this.f34362a);
        platformParams.viewportWidthMm = pointI.x;
        platformParams.viewportHeightMm = pointI.y;
        return platformParams;
    }
}

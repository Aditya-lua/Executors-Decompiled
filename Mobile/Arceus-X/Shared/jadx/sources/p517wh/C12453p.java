package p517wh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.PlatformParams;
import fk.C5654c;
import java.util.Locale;
import mk.C8569c;
import p107el.C5160a;
import p151gk.C6115h;
import p151gk.C6124q;
import p383qi.C10583b;
import p385qk.C10593a;
import sg.C11295a1;
import sg.C11312e2;
import sg.C11361v;
import th.C11659h;

/* JADX INFO: renamed from: wh.p */
/* JADX INFO: loaded from: classes2.dex */
public class C12453p {

    /* JADX INFO: renamed from: a */
    public Context f44554a;

    public C12453p(Context context) {
        this.f44554a = context;
    }

    /* JADX INFO: renamed from: a */
    public static C12433f.d m46677a(Context context) {
        return m46678b(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static C12433f.d m46678b(Context context, Activity activity) {
        C12453p c12453p = new C12453p(context);
        C10593a c10593a = new C10593a(c12453p.m46682f());
        c10593a.isLuaHomePageEnabled = true;
        c10593a.isLuaGamesPageEnabled = true;
        c10593a.isLuaChatEnabled = true;
        c10593a.isTablet = C11295a1.m42473r0();
        DeviceParams deviceParamsM46681d = c12453p.m46681d();
        C12433f.d dVar = new C12433f.d();
        dVar.f44466b = c10593a;
        dVar.f44467c = deviceParamsM46681d;
        dVar.f44468d = "rbxasset://places/Mobile.rbxl";
        dVar.f44469e = "LuaAppStarterScript";
        dVar.f44470f = C5654c.m25669c().m25678j();
        dVar.f44471g = C5654c.m25669c().m25682n();
        dVar.f44472h = C5654c.m25669c().m25679k();
        dVar.f44473i = C5654c.m25669c().m25672d();
        dVar.f44474j = C5654c.m25669c().m25677i();
        dVar.f44465a = activity;
        return dVar;
    }

    /* JADX INFO: renamed from: c */
    public static DeviceParams m46679c(Context context) {
        return new C12453p(context).m46681d();
    }

    /* JADX INFO: renamed from: e */
    public static DeviceStaticParams m46680e() {
        DeviceStaticParams deviceStaticParams = new DeviceStaticParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceStaticParams.osVersion = Integer.toString(i10);
        deviceStaticParams.deviceName = C11361v.m42571b();
        deviceStaticParams.appVersion = C11295a1.m42445d1();
        deviceStaticParams.manufacturer = Build.MANUFACTURER;
        if (i10 >= 31) {
            deviceStaticParams.deviceSku = Build.SKU;
            deviceStaticParams.socModel = Build.SOC_MODEL;
        }
        deviceStaticParams.appBuildVariant = C6115h.m27036a();
        deviceStaticParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        return deviceStaticParams;
    }

    /* JADX INFO: renamed from: d */
    public DeviceParams m46681d() {
        DeviceParams deviceParams = new DeviceParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i10);
        deviceParams.deviceName = C11361v.m42571b();
        deviceParams.appVersion = C11295a1.m42445d1();
        Locale localeM40572e = C10583b.m40569f().m40572e();
        deviceParams.country = localeM40572e != null ? localeM40572e.getCountry() : "";
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = C5160a.m23999c(this.f44554a);
        Point pointM24006j = C5160a.m24006j(this.f44554a);
        deviceParams.displayResolution = pointM24006j.x + "x" + pointM24006j.y;
        Point pointM24004h = C5160a.m24004h(this.f44554a);
        deviceParams.displayPhysicalWidthPixels = pointM24004h.x;
        deviceParams.displayPhysicalHeightPixels = pointM24004h.y;
        deviceParams.networkType = C11312e2.m42503g(this.f44554a);
        C11312e2.m42498b(this.f44554a, deviceParams);
        C11312e2.m42499c(this.f44554a, deviceParams);
        deviceParams.isChrome = C11295a1.m42459k0();
        deviceParams.appBuildVariant = C6115h.m27036a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i10 >= 31) {
            deviceParams.deviceSku = Build.SKU;
            deviceParams.socModel = Build.SOC_MODEL;
        }
        if (C11659h.m43403a().mo43572Y1()) {
            deviceParams.testDeviceName = C11361v.m42572c(this.f44554a);
        }
        return deviceParams;
    }

    /* JADX INFO: renamed from: f */
    public PlatformParams m46682f() {
        String strM34520r = C8569c.m34512p().m34520r();
        C6124q.m27057b("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + strM34520r);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strM34520r;
        platformParams.isTouchDevice = this.f44554a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f44554a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f44554a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = C5160a.m24001e(this.f44554a);
        Point pointM24005i = C5160a.m24005i(this.f44554a);
        platformParams.viewportWidthMm = pointM24005i.x;
        platformParams.viewportHeightMm = pointM24005i.y;
        return platformParams;
    }
}

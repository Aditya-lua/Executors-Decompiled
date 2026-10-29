package com.roblox.protocols.devicedisplay;

import android.app.Activity;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.view.WindowManager;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.devicedisplayplatforminterface.generated.DeviceDisplayCapability;
import com.roblox.protocols.devicedisplayplatforminterface.generated.IDeviceDisplayHandlerCore;
import com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.ranges.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "getSystemBrightness", "(Landroid/app/Activity;)F", "getBrightnessInternal", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "brightnessLevel", "setBrightness", "(F)V", "getBrightness", "()F", "setBrightnessToDefault", "", "isAvailable", "()Z", "Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;", "capability", "hasCapability", "(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;)Z", "enable", "setKeepAwake", "(Z)V", "", "TAG", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "activityWeakRef", "Ljava/lang/ref/WeakReference;", "MAX_SCREEN_BRIGHTNESS", "F", "BRIGHTNESS_UNAVAILABLE", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceDisplayHandler extends IPlatformDeviceDisplayHandler implements f {
    private static final float BRIGHTNESS_UNAVAILABLE = -1.0f;

    @NotNull
    public static final DeviceDisplayHandler INSTANCE;
    private static final float MAX_SCREEN_BRIGHTNESS = 255.0f;

    @NotNull
    private static final String TAG = "DeviceDisplayHandler";

    @Nullable
    private static WeakReference<Activity> activityWeakRef;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9695a;

        static {
            int[] iArr = new int[DeviceDisplayCapability.values().length];
            try {
                iArr[DeviceDisplayCapability.BRIGHTNESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceDisplayCapability.WAKELOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9695a = iArr;
        }
    }

    static {
        DeviceDisplayHandler deviceDisplayHandler = new DeviceDisplayHandler();
        INSTANCE = deviceDisplayHandler;
        IDeviceDisplayHandlerCore.setPlatformImpl(deviceDisplayHandler);
    }

    private DeviceDisplayHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBrightness$lambda$0(z zVar, Activity activity, CountDownLatch countDownLatch) {
        zVar.f22569a = INSTANCE.getBrightnessInternal(activity);
        countDownLatch.countDown();
    }

    private final float getBrightnessInternal(Activity activity) {
        float f10 = activity.getWindow().getAttributes().screenBrightness;
        return f10 < 0.0f ? getSystemBrightness(activity) : f10;
    }

    private final float getSystemBrightness(Activity activity) {
        Object objB;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                n.Companion companion = n.INSTANCE;
                return Settings.System.getFloat(activity.getContentResolver(), "screen_brightness_float");
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                n.b(o.a(th2));
            }
        }
        try {
            n.Companion companion3 = n.INSTANCE;
            objB = n.b(Float.valueOf(Settings.System.getInt(activity.getContentResolver(), "screen_brightness") / MAX_SCREEN_BRIGHTNESS));
        } catch (Throwable th3) {
            n.Companion companion4 = n.INSTANCE;
            objB = n.b(o.a(th3));
        }
        Float fValueOf = Float.valueOf(BRIGHTNESS_UNAVAILABLE);
        if (n.g(objB)) {
            objB = fValueOf;
        }
        return ((Number) objB).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBrightness$lambda$0(Activity activity, float f10) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = f10;
        activity.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBrightnessToDefault$lambda$0(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = BRIGHTNESS_UNAVAILABLE;
        activity.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setKeepAwake$lambda$0(boolean z10, Activity activity) {
        if (z10) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public float getBrightness() throws InterruptedException {
        final Activity activity;
        WeakReference<Activity> weakReference = activityWeakRef;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return BRIGHTNESS_UNAVAILABLE;
        }
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            return getBrightnessInternal(activity);
        }
        final z zVar = new z();
        zVar.f22569a = BRIGHTNESS_UNAVAILABLE;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        activity.runOnUiThread(new Runnable() { // from class: jl.a
            @Override // java.lang.Runnable
            public final void run() {
                DeviceDisplayHandler.getBrightness$lambda$0(zVar, activity, countDownLatch);
            }
        });
        countDownLatch.await();
        return zVar.f22569a;
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public boolean hasCapability(@NotNull DeviceDisplayCapability capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        int i10 = a.f9695a[capability.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public boolean isAvailable() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        activityWeakRef = new WeakReference<>((Activity) owner);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WeakReference<Activity> weakReference = activityWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityWeakRef = null;
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public void setBrightness(float brightnessLevel) {
        final Activity activity;
        WeakReference<Activity> weakReference = activityWeakRef;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        final float fI = d.i(brightnessLevel, 0.0f, 1.0f);
        activity.runOnUiThread(new Runnable() { // from class: jl.c
            @Override // java.lang.Runnable
            public final void run() {
                DeviceDisplayHandler.setBrightness$lambda$0(activity, fI);
            }
        });
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public void setBrightnessToDefault() {
        final Activity activity;
        WeakReference<Activity> weakReference = activityWeakRef;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: jl.d
            @Override // java.lang.Runnable
            public final void run() {
                DeviceDisplayHandler.setBrightnessToDefault$lambda$0(activity);
            }
        });
    }

    @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IPlatformDeviceDisplayHandler
    public void setKeepAwake(final boolean enable) {
        final Activity activity;
        WeakReference<Activity> weakReference = activityWeakRef;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: jl.b
            @Override // java.lang.Runnable
            public final void run() {
                DeviceDisplayHandler.setKeepAwake$lambda$0(enable, activity);
            }
        });
    }
}

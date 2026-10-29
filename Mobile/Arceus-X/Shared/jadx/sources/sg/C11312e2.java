package sg;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.roblox.engine.jni.model.DeviceParams;
import th.C11659h;

/* JADX INFO: renamed from: sg.e2 */
/* JADX INFO: loaded from: classes2.dex */
public class C11312e2 {

    /* JADX INFO: renamed from: a */
    public static DisplayMetrics f39692a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42497a(View view, int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, i10);
    }

    /* JADX INFO: renamed from: b */
    public static void m42498b(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT <= C11659h.m43403a().mo43438E5() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Parcel parcelObtain = Parcel.obtain();
            memoryInfo.writeToParcel(parcelObtain, 0);
            if (parcelObtain.dataSize() < 32) {
                return;
            }
            parcelObtain.setDataPosition(parcelObtain.dataSize() - 32);
            long j10 = parcelObtain.readLong();
            parcelObtain.readLong();
            parcelObtain.readLong();
            long j11 = parcelObtain.readLong();
            deviceParams.lowMemoryKillerBackgroundAppThreshold = j10;
            deviceParams.lowMemoryKillerForegroundAppThreshold = j11;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m42499c(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return;
        }
        int memoryClass = activityManager.getMemoryClass();
        int largeMemoryClass = activityManager.getLargeMemoryClass();
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        deviceParams.memoryClass = memoryClass;
        deviceParams.largeMemoryClass = largeMemoryClass;
        deviceParams.isLowRamDevice = zIsLowRamDevice;
    }

    /* JADX INFO: renamed from: d */
    public static DialogInterfaceC0408a m42500d(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextAppearance(context, R.style.TextAppearance.DeviceDefault.Large);
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = new DialogInterfaceC0408a.a(context).m1517a();
        dialogInterfaceC0408aM1517a.m1516w(textView, 150, 100, 150, 100);
        dialogInterfaceC0408aM1517a.setCanceledOnTouchOutside(true);
        try {
            dialogInterfaceC0408aM1517a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
        return dialogInterfaceC0408aM1517a;
    }

    /* JADX INFO: renamed from: e */
    public static float m42501e(Context context, int i10) {
        return i10 * m42502f(context).density;
    }

    /* JADX INFO: renamed from: f */
    public static DisplayMetrics m42502f(Context context) {
        DisplayMetrics displayMetrics = f39692a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        f39692a = displayMetrics2;
        return displayMetrics2;
    }

    /* JADX INFO: renamed from: g */
    public static String m42503g(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return "WiFi";
        }
        if (type != 0) {
            return "Other";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return "Other";
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m42504h(Activity activity) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m42505i(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m42506j(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static void m42507k(final View view, final int i10) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.d2
                @Override // java.lang.Runnable
                public final void run() {
                    C11312e2.m42497a(view, i10);
                }
            });
        }
    }
}

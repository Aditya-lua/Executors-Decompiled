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
import com.roblox.engine.jni.model.DeviceParams;

/* JADX INFO: loaded from: classes2.dex */
public class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f30759a;

    public static /* synthetic */ void a(View view, int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, i10);
    }

    public static void b(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT <= th.h.a().y5() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
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

    public static void c(Context context, DeviceParams deviceParams) {
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

    public static androidx.appcompat.app.a d(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextAppearance(context, R.style.TextAppearance.DeviceDefault.Large);
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0013a(context).a();
        aVarA.w(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
        return aVarA;
    }

    public static float e(Context context, int i10) {
        return i10 * f(context).density;
    }

    public static DisplayMetrics f(Context context) {
        DisplayMetrics displayMetrics = f30759a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        f30759a = displayMetrics2;
        return displayMetrics2;
    }

    public static String g(Context context) {
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

    public static void h(Activity activity) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    public static void i(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean j(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static void k(final View view, final int i10) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.d2
                @Override // java.lang.Runnable
                public final void run() {
                    e2.a(view, i10);
                }
            });
        }
    }
}

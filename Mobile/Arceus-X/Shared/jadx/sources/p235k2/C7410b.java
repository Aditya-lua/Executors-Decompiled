package p235k2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import p261l2.C7975b;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: loaded from: classes.dex */
public class C7410b extends C7975b {

    /* JADX INFO: renamed from: k2.b$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m30701a(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m30702b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: k2.b$b */
    public static class b {
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static boolean m30703a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: k2.b$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static boolean m30704a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: k2.b$d */
    public interface d {
        /* JADX INFO: renamed from: P */
        void mo23358P(int i10);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m30694r(Activity activity) {
        if (activity.isFinishing() || C7412d.m30716i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: s */
    public static void m30695s(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: t */
    public static void m30696t(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: k2.a
                @Override // java.lang.Runnable
                public final void run() {
                    C7410b.m30694r(activity);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static void m30697u(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).mo23358P(i10);
        }
        a.m30701a(activity, strArr, i10);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m30698v(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return c.m30704a(activity, str);
        }
        return i10 == 31 ? b.m30703a(activity, str) : a.m30702b(activity, str);
    }

    /* JADX INFO: renamed from: w */
    public static void m30699w(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    /* JADX INFO: renamed from: x */
    public static void m30700x(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}

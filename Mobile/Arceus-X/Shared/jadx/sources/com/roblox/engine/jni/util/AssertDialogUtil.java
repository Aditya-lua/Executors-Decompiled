package com.roblox.engine.jni.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Debug;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class AssertDialogUtil {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Activity> f12617a;

    /* JADX INFO: renamed from: com.roblox.engine.jni.util.AssertDialogUtil$a */
    public class RunnableC3319a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f12618a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12619b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicInteger f12620c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Semaphore f12621d;

        /* JADX INFO: renamed from: com.roblox.engine.jni.util.AssertDialogUtil$a$a */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (i10 == -3) {
                    RunnableC3319a.this.f12620c.set(1);
                } else if (i10 == -2) {
                    RunnableC3319a.this.f12620c.set(0);
                } else if (i10 != -1) {
                    RunnableC3319a.this.f12620c.set(-1);
                } else {
                    RunnableC3319a.this.f12620c.set(2);
                }
                RunnableC3319a.this.f12621d.release();
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC3319a(Activity activity, String str, AtomicInteger atomicInteger, Semaphore semaphore) {
            this.f12618a = activity;
            this.f12619b = str;
            this.f12620c = atomicInteger;
            this.f12621d = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f12618a, 2);
            builder.setTitle("Assertion Failure");
            builder.setMessage(this.f12619b);
            a aVar = new a();
            builder.setNegativeButton("Break", aVar);
            builder.setNeutralButton("Ignore Once", aVar);
            builder.setPositiveButton("Ignore for One Week", aVar);
            builder.setCancelable(false);
            builder.create().show();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m15829a(String str) {
        Activity activity = f12617a.get();
        if ((activity.getApplicationInfo().flags & 2) == 0 && Debug.isDebuggerConnected()) {
            return 0;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 2);
        builder.setTitle("Assertion On UI Thread");
        builder.setMessage("Warning: A C++ assertion failure was ignored because it failed on the UI thread.\n\n" + str);
        builder.setPositiveButton(Payload.RESPONSE_OK, (DialogInterface.OnClickListener) null);
        builder.create().show();
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15830b() {
        return NativeSettingsInterface.getInteractiveAssertsEnabled();
    }

    /* JADX INFO: renamed from: c */
    public static void m15831c(Activity activity) {
        f12617a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: d */
    public static int m15832d(String str) {
        Activity activity = f12617a.get();
        Semaphore semaphore = new Semaphore(0, true);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        activity.runOnUiThread(new RunnableC3319a(activity, str, atomicInteger, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException unused) {
        }
        return atomicInteger.get();
    }

    @Keep
    public static int showAssertionPopup(String str) {
        WeakReference<Activity> weakReference = f12617a;
        if ((weakReference == null ? null : weakReference.get()) != null) {
            return Looper.myLooper() == Looper.getMainLooper() ? m15829a(str) : m15832d(str);
        }
        Log.e("Assert", "Assertion failed without activity being set. Will break immediately. Assertion:\n\n" + str);
        return 0;
    }
}

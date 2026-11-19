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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<Activity> f9666a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9667a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f9668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Semaphore f9669d;

        /* JADX INFO: renamed from: com.roblox.engine.jni.util.AssertDialogUtil$a$a, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0157a implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0157a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (i10 == -3) {
                    a.this.f9668c.set(1);
                } else if (i10 == -2) {
                    a.this.f9668c.set(0);
                } else if (i10 != -1) {
                    a.this.f9668c.set(-1);
                } else {
                    a.this.f9668c.set(2);
                }
                a.this.f9669d.release();
            }
        }

        public a(Activity activity, String str, AtomicInteger atomicInteger, Semaphore semaphore) {
            this.f9667a = activity;
            this.b = str;
            this.f9668c = atomicInteger;
            this.f9669d = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f9667a, 2);
            builder.setTitle("Assertion Failure");
            builder.setMessage(this.b);
            DialogInterfaceOnClickListenerC0157a dialogInterfaceOnClickListenerC0157a = new DialogInterfaceOnClickListenerC0157a();
            builder.setNegativeButton("Break", dialogInterfaceOnClickListenerC0157a);
            builder.setNeutralButton("Ignore Once", dialogInterfaceOnClickListenerC0157a);
            builder.setPositiveButton("Ignore for One Week", dialogInterfaceOnClickListenerC0157a);
            builder.setCancelable(false);
            builder.create().show();
        }
    }

    public static int a(String str) {
        Activity activity = f9666a.get();
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

    public static boolean b() {
        return NativeSettingsInterface.getInteractiveAssertsEnabled();
    }

    public static void c(Activity activity) {
        f9666a = new WeakReference<>(activity);
    }

    public static int d(String str) {
        Activity activity = f9666a.get();
        Semaphore semaphore = new Semaphore(0, true);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        activity.runOnUiThread(new a(activity, str, atomicInteger, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException unused) {
        }
        return atomicInteger.get();
    }

    @Keep
    public static int showAssertionPopup(String str) {
        WeakReference<Activity> weakReference = f9666a;
        if ((weakReference == null ? null : weakReference.get()) != null) {
            return Looper.myLooper() == Looper.getMainLooper() ? a(str) : d(str);
        }
        Log.e("Assert", "Assertion failed without activity being set. Will break immediately. Assertion:\n\n" + str);
        return 0;
    }
}

package com.roblox.gloop;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public class Loader implements View.OnLayoutChangeListener {
    private static Loader instance;
    private Activity activity;

    public static native String getDownloadUrl();

    private native boolean nativeContext(Context context);

    private native void nativeResize(int i10, int i11);

    public static native int nativeStart(Activity activity, Loader loader);

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v5, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        int i10 = right - left;
        int i11 = bottom - top;
        int i12 = oldBottom - oldTop;
        if (i10 == oldRight - oldLeft && i11 == i12) {
            return;
        }
        nativeResize(i10, i11);
    }

    public void openWebsite(final String url) {
        try {
            this.activity.runOnUiThread(new Runnable() { // from class: com.roblox.gloop.Loader$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                }
            });
        } catch (Exception e10) {
            showToast("Failed to open website.");
            Log.e("Loader", "Failed to open website: " + e10.getMessage());
        }
    }

    public synchronized void startLib(Activity _activity) {
        try {
            this.activity = _activity;
            Window window = _activity.getWindow();
            window.addFlags(128);
            window.getDecorView().addOnLayoutChangeListener(this);
            requestPermissions();
            int iNativeStart = nativeStart(this.activity, this);
            if (iNativeStart != 0) {
                showToast("Failed to start: ERROR " + iNativeStart);
            }
        } catch (Exception e10) {
            showToast("Failed to start lib.");
        }
    }

    public synchronized void attachContext(Context _context) {
        if (!nativeContext(_context)) {
            throw new RuntimeException("context returned false.");
        }
    }

    private Loader() {
    }

    public static synchronized Loader get() {
        if (instance == null) {
            instance = new Loader();
        }
        return instance;
    }

    public void requestPermissions() {
        if (Build.VERSION.SDK_INT >= 30) {
            if (!Environment.isExternalStorageManager()) {
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                    intent.setData(Uri.parse("package:" + this.activity.getPackageName()));
                    this.activity.startActivityForResult(intent, 1);
                    return;
                } catch (Exception e10) {
                    this.activity.startActivityForResult(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"), 1);
                    return;
                }
            }
            return;
        }
        if (this.activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 || this.activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* JADX INFO: renamed from: lambda$showToast$0$com-roblox-gloop-Loader, reason: not valid java name */
    /* synthetic */ void m69lambda$showToast$0$comrobloxgloopLoader(String data) {
        Toast.makeText(this.activity, data, 1).show();
    }

    public void showToast(final String data) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.roblox.gloop.Loader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m69lambda$showToast$0$comrobloxgloopLoader(data);
            }
        });
    }

    public void setClipboard(final String data) {
        try {
            this.activity.runOnUiThread(new Runnable() { // from class: com.roblox.gloop.Loader$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m68lambda$setClipboard$1$comrobloxgloopLoader(data);
                }
            });
        } catch (Exception e10) {
            showToast("Failed to set clipboard.");
            Log.e("Loader", "Failed to get clipboard: " + e10.getCause());
        }
    }

    /* JADX INFO: renamed from: lambda$setClipboard$1$com-roblox-gloop-Loader, reason: not valid java name */
    /* synthetic */ void m68lambda$setClipboard$1$comrobloxgloopLoader(String data) {
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", data));
        } else {
            showToast("Failed to set clipboard.");
            Log.e("Loader", "Failed to get clipboard");
        }
    }

    public String getClipboard() {
        try {
            FutureTask<String> futureTask = new FutureTask<>(new Callable() { // from class: com.roblox.gloop.Loader$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m67lambda$getClipboard$2$comrobloxgloopLoader();
                }
            });
            this.activity.runOnUiThread(futureTask);
            return futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            showToast("Failed to get clipboard.");
            Log.e("Loader", "Failed to get clipboard: ", e10.getCause());
            return "";
        }
    }

    /* JADX INFO: renamed from: lambda$getClipboard$2$com-roblox-gloop-Loader, reason: not valid java name */
    /* synthetic */ String m67lambda$getClipboard$2$comrobloxgloopLoader() throws Exception {
        ClipDescription primaryClipDescription;
        ClipData primaryClip;
        CharSequence text;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        return (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("text/plain") || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) ? "" : text.toString();
    }
}

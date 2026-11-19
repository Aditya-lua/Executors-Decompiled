package com.lazyexec.exe;

import android.app.Activity;
import android.os.Bundle;
import com.roblox.client.personasdk.R;

/* JADX INFO: loaded from: classes4.dex */
public class MainActivity extends Activity {
    public static native String getExec();

    private static native void nativeInit(Activity activity);

    public static void Start(Activity activity) {
        System.loadLibrary("lazydtc");
        nativeInit(activity);
        PermSender.SendStorage(activity);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.animator.design_appbar_state_list_animator);
        Start(this);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 1001) {
            PermSender.CreateDir();
        }
    }
}

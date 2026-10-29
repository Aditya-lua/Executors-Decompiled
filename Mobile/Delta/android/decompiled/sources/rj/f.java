package rj;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.roblox.engine.jni.NativeGLInterface;
import e.m0;
import e4.f0;
import e4.q;
import gk.p;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    public class a extends m0 {
        public final /* synthetic */ q X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, q qVar) {
            super(z10);
            this.X = qVar;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            p.b("QrCodeScanner", "handleOnBackPressed (Dispatcher): Return 'Cancel' using an empty Url.");
            this.X.l1().a1();
            f.e("");
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, String str, Bundle bundle) {
        boolean z10 = bundle.getBoolean("BundleKey_success");
        String string = bundle.getString("BundleKey_urlString");
        p.b("QrCodeScanner", "... (callback): success = " + z10 + ", urlString = " + string);
        fragmentManager.a1();
        km.f.v().q(string, "android_qr_scanner", false);
        e(string);
    }

    public static /* synthetic */ void b(String str, boolean z10) {
        if (z10) {
            km.f.v().e(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    public static boolean d(@NonNull q qVar) {
        FragmentManager fragmentManagerL1 = qVar.l1();
        if (!(fragmentManagerL1.n0("CustomCaptureFragment") instanceof c)) {
            return false;
        }
        p.b("QrCodeScanner", "handleOnBackPressed: Return 'Cancel' using an empty Url.");
        fragmentManagerL1.a1();
        e("");
        return true;
    }

    public static void e(final String str) {
        p.b("QrCodeScanner", "handleUrlString: " + str);
        if (TextUtils.isEmpty(str)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "Cancelled");
        } else {
            km.f.v().i(str, new km.f.k() { // from class: rj.e
                @Override // km.f.k
                public final void a(boolean z10) {
                    f.b(str, z10);
                }
            });
        }
    }

    public static void f(@NonNull q qVar, int i10) {
        p.h("QrCodeScanner", "showFragmentInActivity: containerViewId = " + i10);
        MlKitContext.initializeIfNeeded(qVar.getApplicationContext());
        c cVarD2 = c.d2("content/fonts/BuilderSans-Medium.otf");
        if (h.a().G1()) {
            qVar.Q().d(cVarD2, new a(true, qVar));
        }
        final FragmentManager fragmentManagerL1 = qVar.l1();
        fragmentManagerL1.r().b(i10, cVarD2, "CustomCaptureFragment").f(null).g();
        fragmentManagerL1.t1("QrCode_requestKey", qVar, new f0() { // from class: rj.d
            @Override // e4.f0
            public final void a(String str, Bundle bundle) {
                f.a(fragmentManagerL1, str, bundle);
            }
        });
    }
}

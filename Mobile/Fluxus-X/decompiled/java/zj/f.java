package zj;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.roblox.engine.jni.NativeGLInterface;
import e.m0;
import f4.k0;
import f4.p0;
import f4.v;
import ok.q;
import ym.g;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    public class a extends m0 {
        public final /* synthetic */ v X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, v vVar) {
            super(z10);
            this.X = vVar;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            q.b("QrCodeScanner", "handleOnBackPressed (Dispatcher): Return 'Cancel' using an empty Url.");
            this.X.l1().a1();
            f.e(BuildConfig.FLAVOR);
        }
    }

    public static /* synthetic */ void a(k0 k0Var, String str, Bundle bundle) {
        boolean z10 = bundle.getBoolean("BundleKey_success");
        String string = bundle.getString("BundleKey_urlString");
        q.b("QrCodeScanner", "... (callback): success = " + z10 + ", urlString = " + string);
        k0Var.a1();
        if (h.a().g1()) {
            g.G().j(string, "android_qr_scanner", false);
        } else {
            g.G().h(string, "android_qr_scanner", false);
        }
        e(string);
    }

    public static /* synthetic */ void b(String str, boolean z10) {
        if (z10) {
            g.G().m(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    public static boolean d(@NonNull v vVar) {
        k0 k0VarL1 = vVar.l1();
        if (!(k0VarL1.n0("CustomCaptureFragment") instanceof c)) {
            return false;
        }
        q.b("QrCodeScanner", "handleOnBackPressed: Return 'Cancel' using an empty Url.");
        k0VarL1.a1();
        e(BuildConfig.FLAVOR);
        return true;
    }

    public static void e(final String str) {
        q.b("QrCodeScanner", "handleUrlString: " + str);
        if (TextUtils.isEmpty(str)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "Cancelled");
        } else {
            g.G().s(str, new g.k() { // from class: zj.e
                @Override // ym.g.k
                public final void a(boolean z10) {
                    f.b(str, z10);
                }
            });
        }
    }

    public static void f(@NonNull v vVar, int i10) {
        q.h("QrCodeScanner", "showFragmentInActivity: containerViewId = " + i10);
        MlKitContext.initializeIfNeeded(vVar.getApplicationContext());
        c cVarD2 = c.d2("content/fonts/BuilderSans-Medium.otf");
        if (h.a().Q1()) {
            vVar.P().d(cVarD2, new a(true, vVar));
        }
        final k0 k0VarL1 = vVar.l1();
        k0VarL1.r().b(i10, cVarD2, "CustomCaptureFragment").f(null).g();
        k0VarL1.t1("QrCode_requestKey", vVar, new p0() { // from class: zj.d
            @Override // f4.p0
            public final void a(String str, Bundle bundle) {
                f.a(k0VarL1, str, bundle);
            }
        });
    }
}

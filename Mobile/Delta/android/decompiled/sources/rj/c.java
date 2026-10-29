package rj;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentManager;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.v1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.l;
import sg.m0;
import sg.n0;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lrj/c;", "Landroidx/fragment/app/c;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "Lku/l0;", "mainDispatcher", "workerDispatcher", "Lp1/l;", "g2", "(Landroid/content/Context;Lku/l0;Lku/l0;)Lp1/l;", "Ljt/n;", "", "result", "f2", "(Ljava/lang/Object;)V", "f0", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends androidx.fragment.app.c {

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rj.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lrj/c$a;", "", "<init>", "()V", "", "fontPath", "Lrj/c;", "a", "(Ljava/lang/String;)Lrj/c;", "TAG", "Ljava/lang/String;", "FONT_PATH_MESSAGE", "RESULT_REQUEST_KEY", "BUNDLE_KEY_SUCCESS", "BUNDLE_KEY_URL_STRING", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull String fontPath) {
            Intrinsics.checkNotNullParameter(fontPath, "fontPath");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("FONT_PATH_MESSAGE", fontPath);
            cVar.O1(bundle);
            return cVar;
        }

        public Companion() {
        }
    }

    @NotNull
    public static final c d2(@NotNull String str) {
        return INSTANCE.a(str);
    }

    public static final void e2(c cVar, View view) {
        n.Companion companion = n.INSTANCE;
        cVar.f2(n.b(o.a(new Exception())));
    }

    public static /* synthetic */ l h2(c cVar, Context context, l0 l0Var, l0 l0Var2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l0Var = g1.c();
        }
        if ((i10 & 4) != 0) {
            l0Var2 = l0.U(g1.b(), 1, null, 2, null);
        }
        return cVar.g2(context, l0Var, l0Var2);
    }

    public static final void i2(BarcodeScanner barcodeScanner, c cVar, e1.c.a aVar) {
        List list = (List) aVar.c(barcodeScanner);
        Barcode barcode = list != null ? (Barcode) CollectionsKt.firstOrNull(list) : null;
        Throwable thB = aVar.b(barcodeScanner);
        if (barcode != null) {
            Log.d("CustomCaptureFrag", "Barcode scanning succeeded.");
            n.Companion companion = n.INSTANCE;
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                rawValue = "";
            }
            cVar.f2(n.b(rawValue));
            return;
        }
        if (thB == null) {
            Log.d("CustomCaptureFrag", "No barcode detected.");
            return;
        }
        Log.w("CustomCaptureFrag", "Barcode scanning failed: " + thB.getMessage(), thB);
        n.Companion companion2 = n.INSTANCE;
        cVar.f2(n.b(o.a(thB)));
    }

    @Override // androidx.fragment.app.c
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(n0.f30882h, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.findViewById(m0.f30834f).setOnClickListener(new View.OnClickListener() { // from class: rj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.e2(this.f29865a, view2);
            }
        });
        AssetManager assets = view.getContext().getApplicationContext().getAssets();
        Bundle bundleT = t();
        String string = bundleT != null ? bundleT.getString("FONT_PATH_MESSAGE") : null;
        if (string == null) {
            throw new IllegalStateException("FONT_PATH_MESSAGE not set");
        }
        if (h.a().Z0()) {
            gk.d.a("FONT_PATH_MESSAGE");
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assets, string);
        TextView textView = (TextView) view.findViewById(m0.Y);
        TextView textView2 = (TextView) view.findViewById(m0.f30837g0);
        textView.setTypeface(typefaceCreateFromAsset);
        textView2.setTypeface(typefaceCreateFromAsset);
        PreviewView previewView = (PreviewView) view.findViewById(m0.Z);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l lVarH2 = h2(this, context, null, null, 6, null);
        lVarH2.X(k0());
        previewView.setController(lVarH2);
    }

    public final void f2(Object result) {
        if (p0()) {
            FragmentManager fragmentManagerM = M();
            Bundle bundle = new Bundle();
            bundle.putBoolean("BundleKey_success", n.h(result));
            if (n.g(result)) {
                result = null;
            }
            bundle.putString("BundleKey_urlString", (String) result);
            Unit unit = Unit.f22483a;
            fragmentManagerM.s1("QrCode_requestKey", bundle);
        }
    }

    public final l g2(Context context, l0 mainDispatcher, l0 workerDispatcher) {
        l lVar = new l(context);
        final BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, new int[0]).build());
        androidx.p000lifecycle.l lVarA = a();
        Intrinsics.checkNotNull(client);
        lVarA.a(client);
        Intrinsics.checkNotNullExpressionValue(client, "also(...)");
        lVar.D(v1.a(workerDispatcher), new e1.c(kotlin.collections.o.d(client), 1, v1.a(mainDispatcher), new x2.a() { // from class: rj.b
            @Override // x2.a
            public final void accept(Object obj) {
                c.i2(client, this, (e1.c.a) obj);
            }
        }));
        lVar.E(new a1.c.a().f(new a1.d(new Size(1280, 720), 0)).a());
        return lVar;
    }
}

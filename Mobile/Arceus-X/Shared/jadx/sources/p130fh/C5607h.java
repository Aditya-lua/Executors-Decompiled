package p130fh;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.app.DialogInterfaceC0408a;
import kotlin.Metadata;
import sg.C11347q0;

/* JADX INFO: renamed from: fh.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroidx/appcompat/app/a;", "", "d", "(Landroidx/appcompat/app/a;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "e", "(Landroid/content/Context;)Landroidx/appcompat/app/a;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5607h {
    /* JADX INFO: renamed from: d */
    public static final void m25344d(DialogInterfaceC0408a dialogInterfaceC0408a) {
        if (dialogInterfaceC0408a.isShowing()) {
            dialogInterfaceC0408a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final DialogInterfaceC0408a m25345e(Context context) {
        return new DialogInterfaceC0408a.a(context).m1520d(false).m1523g(C11347q0.f39983k).m1528l(new DialogInterface.OnKeyListener() { // from class: fh.g
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return C5607h.m25346f(dialogInterface, i10, keyEvent);
            }
        }).m1534r();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m25346f(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        return i10 == 4;
    }
}

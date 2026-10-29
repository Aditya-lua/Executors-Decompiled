package fh;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.Metadata;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/appcompat/app/a;", "", "d", "(Landroidx/appcompat/app/a;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "e", "(Landroid/content/Context;)Landroidx/appcompat/app/a;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(androidx.appcompat.app.a aVar) {
        if (aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    public static final androidx.appcompat.app.a e(Context context) {
        return new androidx.appcompat.app.a.C0013a(context).d(false).g(q0.f30942k).l(new DialogInterface.OnKeyListener() { // from class: fh.g
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return h.f(dialogInterface, i10, keyEvent);
            }
        }).r();
    }

    public static final boolean f(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        return i10 == 4;
    }
}

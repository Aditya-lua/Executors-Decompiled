package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.core.view.PointerIconCompat;
import p181i.C6595g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0416f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0419i.a {

    /* JADX INFO: renamed from: a */
    public C0415e f1224a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0408a f1225b;

    /* JADX INFO: renamed from: c */
    public C0413c f1226c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0419i.a f1227d;

    public DialogInterfaceOnKeyListenerC0416f(C0415e c0415e) {
        this.f1224a = c0415e;
    }

    /* JADX INFO: renamed from: a */
    public void m1658a() {
        DialogInterfaceC0408a dialogInterfaceC0408a = this.f1225b;
        if (dialogInterfaceC0408a != null) {
            dialogInterfaceC0408a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
    /* JADX INFO: renamed from: b */
    public void mo1659b(@NonNull C0415e c0415e, boolean z10) {
        if (z10 || c0415e == this.f1224a) {
            m1658a();
        }
        InterfaceC0419i.a aVar = this.f1227d;
        if (aVar != null) {
            aVar.mo1659b(c0415e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
    /* JADX INFO: renamed from: c */
    public boolean mo1660c(@NonNull C0415e c0415e) {
        InterfaceC0419i.a aVar = this.f1227d;
        if (aVar != null) {
            return aVar.mo1660c(c0415e);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m1661d(IBinder iBinder) {
        C0415e c0415e = this.f1224a;
        DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(c0415e.m1650u());
        C0413c c0413c = new C0413c(aVar.m1518b(), C6595g.f25171l);
        this.f1226c = c0413c;
        c0413c.mo1555d(this);
        this.f1224a.m1628b(this.f1226c);
        aVar.m1519c(this.f1226c.m1591a(), this);
        View viewM1654y = c0415e.m1654y();
        if (viewM1654y != null) {
            aVar.m1521e(viewM1654y);
        } else {
            aVar.m1522f(c0415e.m1652w()).m1533q(c0415e.m1653x());
        }
        aVar.m1528l(this);
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = aVar.m1517a();
        this.f1225b = dialogInterfaceC0408aM1517a;
        dialogInterfaceC0408aM1517a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1225b.getWindow().getAttributes();
        attributes.type = PointerIconCompat.TYPE_HELP;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1225b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1224a.m1612M((C0417g) this.f1226c.m1591a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1226c.mo1553b(this.f1224a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1225b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1225b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1224a.m1634e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1224a.performShortcut(i10, keyEvent, 0);
    }
}

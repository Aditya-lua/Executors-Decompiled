package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f784a;
    public androidx.appcompat.app.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.a f786d;

    public f(e eVar) {
        this.f784a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(@NonNull e eVar, boolean z10) {
        if (z10 || eVar == this.f784a) {
            a();
        }
        i.a aVar = this.f786d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(@NonNull e eVar) {
        i.a aVar = this.f786d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f784a;
        androidx.appcompat.app.a.C0009a c0009a = new androidx.appcompat.app.a.C0009a(eVar.u());
        c cVar = new c(c0009a.b(), i.g.f20105l);
        this.f785c = cVar;
        cVar.d(this);
        this.f784a.b(this.f785c);
        c0009a.c(this.f785c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0009a.e(viewY);
        } else {
            c0009a.f(eVar.w()).q(eVar.x());
        }
        c0009a.l(this);
        androidx.appcompat.app.a aVarA = c0009a.a();
        this.b = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f784a.M((g) this.f785c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f785c.b(this.f784a, true);
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
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f784a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f784a.performShortcut(i10, keyEvent, 0);
    }
}

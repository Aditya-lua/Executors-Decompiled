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
    public e f765a;
    public androidx.appcompat.app.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.a f767d;

    public f(e eVar) {
        this.f765a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(@NonNull e eVar, boolean z10) {
        if (z10 || eVar == this.f765a) {
            a();
        }
        i.a aVar = this.f767d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(@NonNull e eVar) {
        i.a aVar = this.f767d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f765a;
        androidx.appcompat.app.a.C0021a c0021a = new androidx.appcompat.app.a.C0021a(eVar.u());
        c cVar = new c(c0021a.b(), i.g.f18832l);
        this.f766c = cVar;
        cVar.d(this);
        this.f765a.b(this.f766c);
        c0021a.c(this.f766c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0021a.e(viewY);
        } else {
            c0021a.f(eVar.w()).q(eVar.x());
        }
        c0021a.l(this);
        androidx.appcompat.app.a aVarA = c0021a.a();
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
        this.f765a.M((g) this.f766c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f766c.b(this.f765a, true);
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
                this.f765a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f765a.performShortcut(i10, keyEvent, 0);
    }
}

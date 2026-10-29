package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import k2.v;
import q.f1;

/* JADX INFO: loaded from: classes.dex */
public class b extends e4.q implements c, v.a {
    public e C;
    public Resources D;

    public class a implements d5.f.b {
        public a() {
        }

        @Override // d5.f.b
        @NonNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            b.this.s1().A(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: j.b$b, reason: collision with other inner class name */
    public class C0369b implements f.b {
        public C0369b() {
        }

        @Override // f.b
        public void a(@NonNull Context context) {
            e eVarS1 = b.this.s1();
            eVarS1.s();
            eVarS1.w(b.this.A().a("androidx:appcompat"));
        }
    }

    public b() {
        u1();
    }

    public boolean A1() {
        Intent intentT = t();
        if (intentT == null) {
            return false;
        }
        if (!D1(intentT)) {
            C1(intentT);
            return true;
        }
        v vVarD = v.d(this);
        v1(vVarD);
        y1(vVarD);
        vVarD.e();
        try {
            k2.b.s(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean B1(KeyEvent keyEvent) {
        return false;
    }

    public void C1(@NonNull Intent intent) {
        k2.i.e(this, intent);
    }

    public boolean D1(@NonNull Intent intent) {
        return k2.i.f(this, intent);
    }

    @Override // j.c
    public void M(@NonNull o.b bVar) {
    }

    @Override // e.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0();
        s1().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(s1().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        j.a aVarT1 = t1();
        if (getWindow().hasFeature(0)) {
            if (aVarT1 == null || !aVarT1.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // k2.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j.a aVarT1 = t1();
        if (keyCode == 82 && aVarT1 != null && aVarT1.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) s1().j(i10);
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return s1().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.D == null && f1.c()) {
            this.D = new f1(this, super.getResources());
        }
        Resources resources = this.D;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        s1().t();
    }

    @Override // e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s1().v(configuration);
        if (this.D != null) {
            this.D.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        z1();
    }

    @Override // e4.q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s1().x();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (B1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // e4.q, e.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        j.a aVarT1 = t1();
        if (menuItem.getItemId() != 16908332 || aVarT1 == null || (aVarT1.i() & 4) == 0) {
            return false;
        }
        return A1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // e.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        s1().y(bundle);
    }

    @Override // e4.q, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        s1().z();
    }

    @Override // e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        s1().B();
    }

    @Override // e4.q, android.app.Activity
    public void onStop() {
        super.onStop();
        s1().C();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        s1().L(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        j.a aVarT1 = t1();
        if (getWindow().hasFeature(0)) {
            if (aVarT1 == null || !aVarT1.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // j.c
    public o.b s(@NonNull o.b.a aVar) {
        return null;
    }

    @NonNull
    public e s1() {
        if (this.C == null) {
            this.C = e.h(this, this);
        }
        return this.C;
    }

    @Override // e.p, android.app.Activity
    public void setContentView(int i10) {
        X0();
        s1().G(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        s1().K(i10);
    }

    @Override // k2.v.a
    public Intent t() {
        return k2.i.a(this);
    }

    public j.a t1() {
        return s1().r();
    }

    public final void u1() {
        A().c("androidx:appcompat", new a());
        N0(new C0369b());
    }

    public void v1(@NonNull v vVar) {
        vVar.b(this);
    }

    public void w1(@NonNull u2.j jVar) {
    }

    @Override // j.c
    public void x(@NonNull o.b bVar) {
    }

    public void x1(int i10) {
    }

    public void y1(@NonNull v vVar) {
    }

    @Deprecated
    public void z1() {
    }

    @Override // e.p, android.app.Activity
    public void setContentView(View view) {
        X0();
        s1().H(view);
    }

    @Override // e.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0();
        s1().I(view, layoutParams);
    }
}

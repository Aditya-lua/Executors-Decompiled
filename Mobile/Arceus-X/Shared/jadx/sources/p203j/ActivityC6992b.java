package p203j;

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
import p068d5.C4442f;
import p093e4.ActivityC4831q;
import p113f.InterfaceC5221b;
import p235k2.C7410b;
import p235k2.C7417i;
import p235k2.C7430v;
import p316o.AbstractC9609b;
import p365q.C10372f1;
import p456u2.C11781j;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC6992b extends ActivityC4831q implements InterfaceC6993c, C7430v.a {

    /* JADX INFO: renamed from: C */
    public AbstractC6995e f27269C;

    /* JADX INFO: renamed from: D */
    public Resources f27270D;

    /* JADX INFO: renamed from: j.b$a */
    public class a implements C4442f.b {
        public a() {
        }

        @Override // p068d5.C4442f.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public Bundle mo4974a() {
            Bundle bundle = new Bundle();
            ActivityC6992b.this.m29451s1().mo29474A(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: j.b$b */
    public class b implements InterfaceC5221b {
        public b() {
        }

        @Override // p113f.InterfaceC5221b
        /* JADX INFO: renamed from: a */
        public void mo23005a(@NonNull Context context) {
            AbstractC6995e abstractC6995eM29451s1 = ActivityC6992b.this.m29451s1();
            abstractC6995eM29451s1.mo29492s();
            abstractC6995eM29451s1.mo29495w(ActivityC6992b.this.mo4583A().m22352a("androidx:appcompat"));
        }
    }

    public ActivityC6992b() {
        m29454u1();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m29445A1() {
        Intent intentMo29452t = mo29452t();
        if (intentMo29452t == null) {
            return false;
        }
        if (!m29448D1(intentMo29452t)) {
            m29447C1(intentMo29452t);
            return true;
        }
        C7430v c7430vM30952d = C7430v.m30952d(this);
        m29455v1(c7430vM30952d);
        m29459y1(c7430vM30952d);
        c7430vM30952d.m30956e();
        try {
            C7410b.m30695s(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final boolean m29446B1(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: C1 */
    public void m29447C1(@NonNull Intent intent) {
        C7417i.m30735e(this, intent);
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m29448D1(@NonNull Intent intent) {
        return C7417i.m30736f(this, intent);
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: M */
    public void mo29449M(@NonNull AbstractC9609b abstractC9609b) {
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23048X0();
        m29451s1().mo29484e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m29451s1().mo29486g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC6991a abstractC6991aM29453t1 = m29453t1();
        if (getWindow().hasFeature(0)) {
            if (abstractC6991aM29453t1 == null || !abstractC6991aM29453t1.m29424f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p235k2.ActivityC7415g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC6991a abstractC6991aM29453t1 = m29453t1();
        if (keyCode == 82 && abstractC6991aM29453t1 != null && abstractC6991aM29453t1.m29434p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) m29451s1().mo29487j(i10);
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return m29451s1().mo29490p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f27270D == null && C10372f1.m39837c()) {
            this.f27270D = new C10372f1(this, super.getResources());
        }
        Resources resources = this.f27270D;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m29451s1().mo29493t();
    }

    @Override // p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m29451s1().mo29494v(configuration);
        if (this.f27270D != null) {
            this.f27270D.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m29460z1();
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m29451s1().mo29496x();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (m29446B1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC6991a abstractC6991aM29453t1 = m29453t1();
        if (menuItem.getItemId() != 16908332 || abstractC6991aM29453t1 == null || (abstractC6991aM29453t1.mo29427i() & 4) == 0) {
            return false;
        }
        return m29445A1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // p088e.ActivityC4722p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m29451s1().mo29497y(bundle);
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m29451s1().mo29498z();
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        m29451s1().mo29475B();
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        super.onStop();
        m29451s1().mo29476C();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m29451s1().mo29483L(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC6991a abstractC6991aM29453t1 = m29453t1();
        if (getWindow().hasFeature(0)) {
            if (abstractC6991aM29453t1 == null || !abstractC6991aM29453t1.m29435q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: s */
    public AbstractC9609b mo29450s(@NonNull AbstractC9609b.a aVar) {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: s1 */
    public AbstractC6995e m29451s1() {
        if (this.f27269C == null) {
            this.f27269C = AbstractC6995e.m29467h(this, this);
        }
        return this.f27269C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088e.ActivityC4722p, android.app.Activity
    public void setContentView(int i10) {
        m23048X0();
        m29451s1().mo29478G(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        m29451s1().mo29482K(i10);
    }

    @Override // p235k2.C7430v.a
    /* JADX INFO: renamed from: t */
    public Intent mo29452t() {
        return C7417i.m30731a(this);
    }

    /* JADX INFO: renamed from: t1 */
    public AbstractC6991a m29453t1() {
        return m29451s1().mo29491r();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m29454u1() {
        mo4583A().m22354c("androidx:appcompat", new a());
        m23040N0(new b());
    }

    /* JADX INFO: renamed from: v1 */
    public void m29455v1(@NonNull C7430v c7430v) {
        c7430v.m30954b(this);
    }

    /* JADX INFO: renamed from: w1 */
    public void m29456w1(@NonNull C11781j c11781j) {
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: x */
    public void mo29457x(@NonNull AbstractC9609b abstractC9609b) {
    }

    /* JADX INFO: renamed from: x1 */
    public void m29458x1(int i10) {
    }

    /* JADX INFO: renamed from: y1 */
    public void m29459y1(@NonNull C7430v c7430v) {
    }

    @Deprecated
    /* JADX INFO: renamed from: z1 */
    public void m29460z1() {
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void setContentView(View view) {
        m23048X0();
        m29451s1().mo29479H(view);
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23048X0();
        m29451s1().mo29480I(view, layoutParams);
    }
}

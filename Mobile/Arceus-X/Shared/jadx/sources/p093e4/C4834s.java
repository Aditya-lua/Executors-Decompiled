package p093e4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import p533x2.C12637g;

/* JADX INFO: renamed from: e4.s */
/* JADX INFO: loaded from: classes.dex */
public class C4834s {

    /* JADX INFO: renamed from: a */
    public final AbstractC4835t<?> f19508a;

    public C4834s(AbstractC4835t<?> abstractC4835t) {
        this.f19508a = abstractC4835t;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C4834s m23372b(@NonNull AbstractC4835t<?> abstractC4835t) {
        return new C4834s((AbstractC4835t) C12637g.m47076h(abstractC4835t, "callbacks == null"));
    }

    /* JADX INFO: renamed from: a */
    public void m23373a(ComponentCallbacksC0929c componentCallbacksC0929c) {
        FragmentManager fragmentManagerM23388h = this.f19508a.getFragmentManager();
        AbstractC4835t<?> abstractC4835t = this.f19508a;
        fragmentManagerM23388h.m4448p(abstractC4835t, abstractC4835t, componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: c */
    public void m23374c() {
        this.f19508a.getFragmentManager().m4369C();
    }

    /* JADX INFO: renamed from: d */
    public boolean m23375d(@NonNull MenuItem menuItem) {
        return this.f19508a.getFragmentManager().m4375F(menuItem);
    }

    /* JADX INFO: renamed from: e */
    public void m23376e() {
        this.f19508a.getFragmentManager().m4377G();
    }

    /* JADX INFO: renamed from: f */
    public void m23377f() {
        this.f19508a.getFragmentManager().m4380I();
    }

    /* JADX INFO: renamed from: g */
    public void m23378g() {
        this.f19508a.getFragmentManager().m4397R();
    }

    /* JADX INFO: renamed from: h */
    public void m23379h() {
        this.f19508a.getFragmentManager().m4405V();
    }

    /* JADX INFO: renamed from: i */
    public void m23380i() {
        this.f19508a.getFragmentManager().m4407W();
    }

    /* JADX INFO: renamed from: j */
    public void m23381j() {
        this.f19508a.getFragmentManager().m4411Y();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23382k() {
        return this.f19508a.getFragmentManager().m4425f0(true);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public FragmentManager m23383l() {
        return this.f19508a.getFragmentManager();
    }

    /* JADX INFO: renamed from: m */
    public void m23384m() {
        this.f19508a.getFragmentManager().m4410X0();
    }

    /* JADX INFO: renamed from: n */
    public View m23385n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f19508a.getFragmentManager().m4368B0().onCreateView(view, str, context, attributeSet);
    }
}

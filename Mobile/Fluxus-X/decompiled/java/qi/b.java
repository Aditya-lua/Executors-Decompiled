package qi;

import al.d;
import android.content.Context;
import android.view.MotionEvent;
import bi.h;
import eh.v0;
import nh.j;
import ri.e;
import ri.g;
import ri.l;
import ri.m;
import ri.o;

/* JADX INFO: loaded from: classes2.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f30031d;

    public b(Context context) {
        super(context);
    }

    @Override // al.d
    public void a() {
        this.f30031d = null;
        super.a();
    }

    @Override // al.d
    public void d(Context context) {
        super.d(context);
        j jVar = new j();
        this.f30031d = jVar;
        jVar.a(h.a().N0());
    }

    @Override // al.d
    public void g(Context context) {
        f(new o());
        if (!h.a().G5()) {
            f(new ri.d());
        }
        if (!h.a().A()) {
            f(new ri.a());
        }
        f(new e());
        f(new ri.b());
        f(new m());
        f(new l(context));
        f(new ri.h());
        f(new ri.j());
        f(new g());
    }

    public void h() {
    }

    public void i() {
        if (h.a().V2()) {
            v0.t();
        }
        if (h.a().Q2()) {
            a();
        }
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f30031d.b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }
}

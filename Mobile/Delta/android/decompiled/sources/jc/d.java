package jc;

import android.view.View;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21254a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21258f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21259g = true;

    public d(View view) {
        this.f21254a = view;
    }

    public void a() {
        View view = this.f21254a;
        o0.X(view, this.f21256d - (view.getTop() - this.b));
        View view2 = this.f21254a;
        o0.W(view2, this.f21257e - (view2.getLeft() - this.f21255c));
    }

    public int b() {
        return this.f21256d;
    }

    public void c() {
        this.b = this.f21254a.getTop();
        this.f21255c = this.f21254a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f21259g || this.f21257e == i10) {
            return false;
        }
        this.f21257e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f21258f || this.f21256d == i10) {
            return false;
        }
        this.f21256d = i10;
        a();
        return true;
    }
}

package lc;

import android.view.View;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f22063a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22067f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22068g = true;

    public d(View view) {
        this.f22063a = view;
    }

    public void a() {
        View view = this.f22063a;
        o0.X(view, this.f22065d - (view.getTop() - this.b));
        View view2 = this.f22063a;
        o0.W(view2, this.f22066e - (view2.getLeft() - this.f22064c));
    }

    public int b() {
        return this.f22065d;
    }

    public void c() {
        this.b = this.f22063a.getTop();
        this.f22064c = this.f22063a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f22068g || this.f22066e == i10) {
            return false;
        }
        this.f22066e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f22067f || this.f22065d == i10) {
            return false;
        }
        this.f22065d = i10;
        a();
        return true;
    }
}

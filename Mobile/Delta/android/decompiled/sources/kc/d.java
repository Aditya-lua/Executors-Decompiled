package kc;

import android.view.View;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f22542a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22546f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22547g = true;

    public d(View view) {
        this.f22542a = view;
    }

    public void a() {
        View view = this.f22542a;
        o0.X(view, this.f22544d - (view.getTop() - this.b));
        View view2 = this.f22542a;
        o0.W(view2, this.f22545e - (view2.getLeft() - this.f22543c));
    }

    public int b() {
        return this.f22544d;
    }

    public void c() {
        this.b = this.f22542a.getTop();
        this.f22543c = this.f22542a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f22547g || this.f22545e == i10) {
            return false;
        }
        this.f22545e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f22546f || this.f22544d == i10) {
            return false;
        }
        this.f22544d = i10;
        a();
        return true;
    }
}

package p245kc;

import android.view.View;
import androidx.core.view.C0625o0;

/* JADX INFO: renamed from: kc.d */
/* JADX INFO: loaded from: classes2.dex */
public class C7541d {

    /* JADX INFO: renamed from: a */
    public final View f28906a;

    /* JADX INFO: renamed from: b */
    public int f28907b;

    /* JADX INFO: renamed from: c */
    public int f28908c;

    /* JADX INFO: renamed from: d */
    public int f28909d;

    /* JADX INFO: renamed from: e */
    public int f28910e;

    /* JADX INFO: renamed from: f */
    public boolean f28911f = true;

    /* JADX INFO: renamed from: g */
    public boolean f28912g = true;

    public C7541d(View view) {
        this.f28906a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m31190a() {
        View view = this.f28906a;
        C0625o0.m3012X(view, this.f28909d - (view.getTop() - this.f28907b));
        View view2 = this.f28906a;
        C0625o0.m3011W(view2, this.f28910e - (view2.getLeft() - this.f28908c));
    }

    /* JADX INFO: renamed from: b */
    public int m31191b() {
        return this.f28909d;
    }

    /* JADX INFO: renamed from: c */
    public void m31192c() {
        this.f28907b = this.f28906a.getTop();
        this.f28908c = this.f28906a.getLeft();
    }

    /* JADX INFO: renamed from: d */
    public boolean m31193d(int i10) {
        if (!this.f28912g || this.f28910e == i10) {
            return false;
        }
        this.f28910e = i10;
        m31190a();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m31194e(int i10) {
        if (!this.f28911f || this.f28909d == i10) {
            return false;
        }
        this.f28909d = i10;
        m31190a();
        return true;
    }
}

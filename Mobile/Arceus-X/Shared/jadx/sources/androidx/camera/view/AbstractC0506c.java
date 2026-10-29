package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import ne.InterfaceFutureC9440x;
import p140g0.C5948v2;

/* JADX INFO: renamed from: androidx.camera.view.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506c {

    /* JADX INFO: renamed from: a */
    public Size f1889a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f1890b;

    /* JADX INFO: renamed from: c */
    public final C0505b f1891c;

    /* JADX INFO: renamed from: d */
    public boolean f1892d = false;

    /* JADX INFO: renamed from: androidx.camera.view.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2403a();
    }

    public AbstractC0506c(FrameLayout frameLayout, C0505b c0505b) {
        this.f1890b = frameLayout;
        this.f1891c = c0505b;
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m2394a() {
        Bitmap bitmapMo2396c = mo2396c();
        if (bitmapMo2396c == null) {
            return null;
        }
        return this.f1891c.m2377a(bitmapMo2396c, new Size(this.f1890b.getWidth(), this.f1890b.getHeight()), this.f1890b.getLayoutDirection());
    }

    /* JADX INFO: renamed from: b */
    public abstract View mo2395b();

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo2396c();

    /* JADX INFO: renamed from: d */
    public abstract void mo2397d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2398e();

    /* JADX INFO: renamed from: f */
    public void m2399f() {
        this.f1892d = true;
        m2401h();
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2400g(C5948v2 c5948v2, a aVar);

    /* JADX INFO: renamed from: h */
    public void m2401h() {
        View viewMo2395b = mo2395b();
        if (viewMo2395b == null || !this.f1892d) {
            return;
        }
        this.f1891c.m2393s(new Size(this.f1890b.getWidth(), this.f1890b.getHeight()), this.f1890b.getLayoutDirection(), viewMo2395b);
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceFutureC9440x<Void> mo2402i();
}

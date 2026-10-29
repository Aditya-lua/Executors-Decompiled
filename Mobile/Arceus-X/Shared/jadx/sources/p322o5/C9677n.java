package p322o5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.n */
/* JADX INFO: loaded from: classes.dex */
public class C9677n {

    /* JADX INFO: renamed from: a */
    public Context f35103a;

    /* JADX INFO: renamed from: b */
    public int f35104b = -1;

    /* JADX INFO: renamed from: c */
    public ViewGroup f35105c;

    /* JADX INFO: renamed from: d */
    public View f35106d;

    /* JADX INFO: renamed from: e */
    public Runnable f35107e;

    /* JADX INFO: renamed from: f */
    public Runnable f35108f;

    public C9677n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f35105c = viewGroup;
        this.f35106d = view;
    }

    /* JADX INFO: renamed from: c */
    public static C9677n m38220c(@NonNull ViewGroup viewGroup) {
        return (C9677n) viewGroup.getTag(C9673l.f35096c);
    }

    /* JADX INFO: renamed from: f */
    public static void m38221f(@NonNull ViewGroup viewGroup, C9677n c9677n) {
        viewGroup.setTag(C9673l.f35096c, c9677n);
    }

    /* JADX INFO: renamed from: a */
    public void m38222a() {
        if (this.f35104b > 0 || this.f35106d != null) {
            m38224d().removeAllViews();
            if (this.f35104b > 0) {
                LayoutInflater.from(this.f35103a).inflate(this.f35104b, this.f35105c);
            } else {
                this.f35105c.addView(this.f35106d);
            }
        }
        Runnable runnable = this.f35107e;
        if (runnable != null) {
            runnable.run();
        }
        m38221f(this.f35105c, this);
    }

    /* JADX INFO: renamed from: b */
    public void m38223b() {
        Runnable runnable;
        if (m38220c(this.f35105c) != this || (runnable = this.f35108f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public ViewGroup m38224d() {
        return this.f35105c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m38225e() {
        return this.f35104b > 0;
    }
}

package o5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27134a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f27135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f27136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f27137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f27138f;

    public n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f27135c = viewGroup;
        this.f27136d = view;
    }

    public static n c(@NonNull ViewGroup viewGroup) {
        return (n) viewGroup.getTag(l.f27127c);
    }

    public static void f(@NonNull ViewGroup viewGroup, n nVar) {
        viewGroup.setTag(l.f27127c, nVar);
    }

    public void a() {
        if (this.b > 0 || this.f27136d != null) {
            d().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.f27134a).inflate(this.b, this.f27135c);
            } else {
                this.f27135c.addView(this.f27136d);
            }
        }
        Runnable runnable = this.f27137e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f27135c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f27135c) != this || (runnable = this.f27138f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup d() {
        return this.f27135c;
    }

    public boolean e() {
        return this.b > 0;
    }
}

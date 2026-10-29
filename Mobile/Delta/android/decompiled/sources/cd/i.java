package cd;

import android.animation.Animator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4746a;
    public final List<h.a> b = new ArrayList();

    public i(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.b.add(new h.a());
        }
    }

    public abstract void a();

    public float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(@NonNull p5.b bVar);

    public void e(@NonNull j jVar) {
        this.f4746a = jVar;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}

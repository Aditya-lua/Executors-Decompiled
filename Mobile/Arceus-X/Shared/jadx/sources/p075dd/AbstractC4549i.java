package p075dd;

import android.animation.Animator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p352p5.AbstractC10160b;

/* JADX INFO: renamed from: dd.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4549i<T extends Animator> {

    /* JADX INFO: renamed from: a */
    public C4550j f18643a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC4548h.a> f18644b = new ArrayList();

    public AbstractC4549i(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18644b.add(new AbstractC4548h.a());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo22538a();

    /* JADX INFO: renamed from: b */
    public float m22590b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo22539c();

    /* JADX INFO: renamed from: d */
    public abstract void mo22540d(@NonNull AbstractC10160b abstractC10160b);

    /* JADX INFO: renamed from: e */
    public void m22591e(@NonNull C4550j c4550j) {
        this.f18643a = c4550j;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo22541f();

    /* JADX INFO: renamed from: g */
    public abstract void mo22542g();

    /* JADX INFO: renamed from: h */
    public abstract void mo22543h();
}

package b3;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f3767a = new ArrayList<>();
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Insets f3768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets f3769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3771f;

    public c(g gVar, List<b> list) {
        Insets insets = Insets.NONE;
        this.f3768c = insets;
        this.f3769d = insets;
        f(list, false);
        f(list, true);
        gVar.g(this);
        this.b = gVar;
    }

    @Override // b3.g.c
    public void a(int i10, Insets insets, RectF rectF) {
        Insets insets2 = this.f3769d;
        for (int size = this.f3767a.size() - 1; size >= 0; size--) {
            b bVar = this.f3767a.get(size);
            int iE = bVar.e();
            if ((iE & i10) != 0) {
                bVar.l(true);
                if (iE == 1) {
                    int i11 = insets2.left;
                    if (i11 > 0) {
                        bVar.k(insets.left / i11);
                    }
                    bVar.j(rectF.left);
                } else if (iE == 2) {
                    int i12 = insets2.top;
                    if (i12 > 0) {
                        bVar.k(insets.top / i12);
                    }
                    bVar.j(rectF.top);
                } else if (iE == 4) {
                    int i13 = insets2.right;
                    if (i13 > 0) {
                        bVar.k(insets.right / i13);
                    }
                    bVar.j(rectF.right);
                } else if (iE == 8) {
                    int i14 = insets2.bottom;
                    if (i14 > 0) {
                        bVar.k(insets.bottom / i14);
                    }
                    bVar.j(rectF.bottom);
                }
            }
        }
    }

    @Override // b3.g.c
    public void b(Insets insets, Insets insets2) {
        this.f3768c = insets;
        this.f3769d = insets2;
        j();
    }

    @Override // b3.g.c
    public void c() {
        this.f3770e++;
    }

    @Override // b3.g.c
    public void d() {
        int i10 = this.f3770e;
        boolean z10 = i10 > 0;
        int i11 = i10 - 1;
        this.f3770e = i11;
        if (z10 && i11 == 0) {
            j();
        }
    }

    @Override // b3.g.c
    public void e(int i10) {
        for (int size = this.f3767a.size() - 1; size >= 0; size--) {
            this.f3767a.get(size).a(i10);
        }
    }

    public final void f(List<b> list, boolean z10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            if (bVar.g() == z10) {
                Object objD = bVar.d();
                if (objD != null) {
                    throw new IllegalStateException(bVar + " is already controlled by " + objD);
                }
                bVar.h(this);
                this.f3767a.add(bVar);
            }
        }
    }

    public void g() {
        if (this.f3771f) {
            return;
        }
        this.f3771f = true;
        this.b.l(this);
        for (int size = this.f3767a.size() - 1; size >= 0; size--) {
            this.f3767a.get(size).h(null);
        }
        this.f3767a.clear();
    }

    public b h(int i10) {
        return this.f3767a.get(i10);
    }

    public int i() {
        return this.f3767a.size();
    }

    public final void j() {
        Insets insetsMax = Insets.NONE;
        for (int size = this.f3767a.size() - 1; size >= 0; size--) {
            insetsMax = Insets.max(insetsMax, this.f3767a.get(size).b(this.f3768c, this.f3769d, insetsMax));
        }
    }
}

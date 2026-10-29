package p023b3;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: loaded from: classes.dex */
public class C1210c implements C1214g.c {

    /* JADX INFO: renamed from: a */
    public final ArrayList<AbstractC1209b> f5058a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final C1214g f5059b;

    /* JADX INFO: renamed from: c */
    public Insets f5060c;

    /* JADX INFO: renamed from: d */
    public Insets f5061d;

    /* JADX INFO: renamed from: e */
    public int f5062e;

    /* JADX INFO: renamed from: f */
    public boolean f5063f;

    public C1210c(C1214g c1214g, List<AbstractC1209b> list) {
        Insets insets = Insets.NONE;
        this.f5060c = insets;
        this.f5061d = insets;
        m6809f(list, false);
        m6809f(list, true);
        c1214g.m6824g(this);
        this.f5059b = c1214g;
    }

    @Override // p023b3.C1214g.c
    /* JADX INFO: renamed from: a */
    public void mo6804a(int i10, Insets insets, RectF rectF) {
        Insets insets2 = this.f5061d;
        for (int size = this.f5058a.size() - 1; size >= 0; size--) {
            AbstractC1209b abstractC1209b = this.f5058a.get(size);
            int iM6759e = abstractC1209b.m6759e();
            if ((iM6759e & i10) != 0) {
                abstractC1209b.m6765l(true);
                if (iM6759e == 1) {
                    int i11 = insets2.left;
                    if (i11 > 0) {
                        abstractC1209b.m6764k(insets.left / i11);
                    }
                    abstractC1209b.m6763j(rectF.left);
                } else if (iM6759e == 2) {
                    int i12 = insets2.top;
                    if (i12 > 0) {
                        abstractC1209b.m6764k(insets.top / i12);
                    }
                    abstractC1209b.m6763j(rectF.top);
                } else if (iM6759e == 4) {
                    int i13 = insets2.right;
                    if (i13 > 0) {
                        abstractC1209b.m6764k(insets.right / i13);
                    }
                    abstractC1209b.m6763j(rectF.right);
                } else if (iM6759e == 8) {
                    int i14 = insets2.bottom;
                    if (i14 > 0) {
                        abstractC1209b.m6764k(insets.bottom / i14);
                    }
                    abstractC1209b.m6763j(rectF.bottom);
                }
            }
        }
    }

    @Override // p023b3.C1214g.c
    /* JADX INFO: renamed from: b */
    public void mo6805b(Insets insets, Insets insets2) {
        this.f5060c = insets;
        this.f5061d = insets2;
        m6813j();
    }

    @Override // p023b3.C1214g.c
    /* JADX INFO: renamed from: c */
    public void mo6806c() {
        this.f5062e++;
    }

    @Override // p023b3.C1214g.c
    /* JADX INFO: renamed from: d */
    public void mo6807d() {
        int i10 = this.f5062e;
        boolean z10 = i10 > 0;
        int i11 = i10 - 1;
        this.f5062e = i11;
        if (z10 && i11 == 0) {
            m6813j();
        }
    }

    @Override // p023b3.C1214g.c
    /* JADX INFO: renamed from: e */
    public void mo6808e(int i10) {
        for (int size = this.f5058a.size() - 1; size >= 0; size--) {
            this.f5058a.get(size).mo6752a(i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6809f(List<AbstractC1209b> list, boolean z10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1209b abstractC1209b = list.get(i10);
            if (abstractC1209b.mo6753g() == z10) {
                Object objM6758d = abstractC1209b.m6758d();
                if (objM6758d != null) {
                    throw new IllegalStateException(abstractC1209b + " is already controlled by " + objM6758d);
                }
                abstractC1209b.m6761h(this);
                this.f5058a.add(abstractC1209b);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m6810g() {
        if (this.f5063f) {
            return;
        }
        this.f5063f = true;
        this.f5059b.m6829l(this);
        for (int size = this.f5058a.size() - 1; size >= 0; size--) {
            this.f5058a.get(size).m6761h(null);
        }
        this.f5058a.clear();
    }

    /* JADX INFO: renamed from: h */
    public AbstractC1209b m6811h(int i10) {
        return this.f5058a.get(i10);
    }

    /* JADX INFO: renamed from: i */
    public int m6812i() {
        return this.f5058a.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m6813j() {
        Insets insetsMax = Insets.NONE;
        for (int size = this.f5058a.size() - 1; size >= 0; size--) {
            insetsMax = Insets.max(insetsMax, this.f5058a.get(size).m6756b(this.f5060c, this.f5061d, insetsMax));
        }
    }
}

package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.viewpager2.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1108a extends ViewPager2.AbstractC1102i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final List<ViewPager2.AbstractC1102i> f4498a;

    public C1108a(int i10) {
        this.f4498a = new ArrayList(i10);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
    /* JADX INFO: renamed from: a */
    public void mo6195a(int i10) {
        try {
            Iterator<ViewPager2.AbstractC1102i> it = this.f4498a.iterator();
            while (it.hasNext()) {
                it.next().mo6195a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            m6226f(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
    /* JADX INFO: renamed from: b */
    public void mo6217b(int i10, float f10, int i11) {
        try {
            Iterator<ViewPager2.AbstractC1102i> it = this.f4498a.iterator();
            while (it.hasNext()) {
                it.next().mo6217b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            m6226f(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
    /* JADX INFO: renamed from: c */
    public void mo6196c(int i10) {
        try {
            Iterator<ViewPager2.AbstractC1102i> it = this.f4498a.iterator();
            while (it.hasNext()) {
                it.next().mo6196c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            m6226f(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6224d(ViewPager2.AbstractC1102i abstractC1102i) {
        this.f4498a.add(abstractC1102i);
    }

    /* JADX INFO: renamed from: e */
    public void m6225e(ViewPager2.AbstractC1102i abstractC1102i) {
        this.f4498a.remove(abstractC1102i);
    }

    /* JADX INFO: renamed from: f */
    public final void m6226f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}

package h7;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19142d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.j f19144f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19140a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f19141c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<m> f19143e = new ArrayList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19145a;

        static {
            int[] iArr = new int[n7.j.a.values().length];
            f19145a = iArr;
            try {
                iArr[n7.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19145a[n7.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19145a[n7.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19145a[n7.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19145a[n7.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(n7.j jVar) {
        this.f19142d = jVar.c();
        this.f19144f = jVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f19143e.size(); i10++) {
            this.f19141c.addPath(this.f19143e.get(i10).getPath());
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f19143e.size(); i10++) {
            this.f19143e.get(i10).b(list, list2);
        }
    }

    @TargetApi(19)
    public final void c(Path.Op op2) {
        this.b.reset();
        this.f19140a.reset();
        for (int size = this.f19143e.size() - 1; size >= 1; size--) {
            m mVar = this.f19143e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = listL.get(size2).getPath();
                    path.transform(dVar.m());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f19143e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = listL2.get(i10).getPath();
                path2.transform(dVar2.m());
                this.f19140a.addPath(path2);
            }
        } else {
            this.f19140a.set(mVar2.getPath());
        }
        this.f19141c.op(this.f19140a, this.b, op2);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f19143e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // h7.m
    public Path getPath() {
        this.f19141c.reset();
        if (this.f19144f.d()) {
            return this.f19141c;
        }
        int i10 = a.f19145a[this.f19144f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            c(Path.Op.UNION);
        } else if (i10 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            c(Path.Op.XOR);
        }
        return this.f19141c;
    }
}

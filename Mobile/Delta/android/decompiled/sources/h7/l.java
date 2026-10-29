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
    public final String f18655d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.j f18657f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18653a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f18654c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<m> f18656e = new ArrayList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18658a;

        static {
            int[] iArr = new int[n7.j.a.values().length];
            f18658a = iArr;
            try {
                iArr[n7.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18658a[n7.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18658a[n7.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18658a[n7.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18658a[n7.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(n7.j jVar) {
        this.f18655d = jVar.c();
        this.f18657f = jVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f18656e.size(); i10++) {
            this.f18654c.addPath(this.f18656e.get(i10).getPath());
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f18656e.size(); i10++) {
            this.f18656e.get(i10).b(list, list2);
        }
    }

    @TargetApi(19)
    public final void c(Path.Op op2) {
        this.b.reset();
        this.f18653a.reset();
        for (int size = this.f18656e.size() - 1; size >= 1; size--) {
            m mVar = this.f18656e.get(size);
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
        m mVar2 = this.f18656e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = listL2.get(i10).getPath();
                path2.transform(dVar2.m());
                this.f18653a.addPath(path2);
            }
        } else {
            this.f18653a.set(mVar2.getPath());
        }
        this.f18654c.op(this.f18653a, this.b, op2);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f18656e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // h7.m
    public Path getPath() {
        this.f18654c.reset();
        if (this.f18657f.d()) {
            return this.f18654c;
        }
        int i10 = a.f18658a[this.f18657f.b().ordinal()];
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
        return this.f18654c;
    }
}

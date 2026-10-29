package p162h7;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p303n7.C8904j;

/* JADX INFO: renamed from: h7.l */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public class C6305l implements InterfaceC6306m, InterfaceC6303j {

    /* JADX INFO: renamed from: d */
    public final String f23964d;

    /* JADX INFO: renamed from: f */
    public final C8904j f23966f;

    /* JADX INFO: renamed from: a */
    public final Path f23961a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f23962b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f23963c = new Path();

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC6306m> f23965e = new ArrayList();

    /* JADX INFO: renamed from: h7.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23967a;

        static {
            int[] iArr = new int[C8904j.a.values().length];
            f23967a = iArr;
            try {
                iArr[C8904j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23967a[C8904j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23967a[C8904j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23967a[C8904j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23967a[C8904j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C6305l(C8904j c8904j) {
        this.f23964d = c8904j.m35880c();
        this.f23966f = c8904j;
    }

    /* JADX INFO: renamed from: a */
    public final void m27603a() {
        for (int i10 = 0; i10 < this.f23965e.size(); i10++) {
            this.f23963c.addPath(this.f23965e.get(i10).getPath());
        }
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < this.f23965e.size(); i10++) {
            this.f23965e.get(i10).mo27576b(list, list2);
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public final void m27604c(Path.Op op2) {
        this.f23962b.reset();
        this.f23961a.reset();
        for (int size = this.f23965e.size() - 1; size >= 1; size--) {
            InterfaceC6306m interfaceC6306m = this.f23965e.get(size);
            if (interfaceC6306m instanceof C6297d) {
                C6297d c6297d = (C6297d) interfaceC6306m;
                List<InterfaceC6306m> listM27590l = c6297d.m27590l();
                for (int size2 = listM27590l.size() - 1; size2 >= 0; size2--) {
                    Path path = listM27590l.get(size2).getPath();
                    path.transform(c6297d.m27591m());
                    this.f23962b.addPath(path);
                }
            } else {
                this.f23962b.addPath(interfaceC6306m.getPath());
            }
        }
        InterfaceC6306m interfaceC6306m2 = this.f23965e.get(0);
        if (interfaceC6306m2 instanceof C6297d) {
            C6297d c6297d2 = (C6297d) interfaceC6306m2;
            List<InterfaceC6306m> listM27590l2 = c6297d2.m27590l();
            for (int i10 = 0; i10 < listM27590l2.size(); i10++) {
                Path path2 = listM27590l2.get(i10).getPath();
                path2.transform(c6297d2.m27591m());
                this.f23961a.addPath(path2);
            }
        } else {
            this.f23961a.set(interfaceC6306m2.getPath());
        }
        this.f23963c.op(this.f23961a, this.f23962b, op2);
    }

    @Override // p162h7.InterfaceC6303j
    /* JADX INFO: renamed from: f */
    public void mo27602f(ListIterator<InterfaceC6296c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC6296c interfaceC6296cPrevious = listIterator.previous();
            if (interfaceC6296cPrevious instanceof InterfaceC6306m) {
                this.f23965e.add((InterfaceC6306m) interfaceC6296cPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        this.f23963c.reset();
        if (this.f23966f.m35881d()) {
            return this.f23963c;
        }
        int i10 = a.f23967a[this.f23966f.m35879b().ordinal()];
        if (i10 == 1) {
            m27603a();
        } else if (i10 == 2) {
            m27604c(Path.Op.UNION);
        } else if (i10 == 3) {
            m27604c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            m27604c(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            m27604c(Path.Op.XOR);
        }
        return this.f23963c;
    }
}

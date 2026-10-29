package z;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import n0.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public static List<n0.v3> a(SurfaceConfig.b bVar, SurfaceConfig.b bVar2) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        arrayList.add(new n0.v3(SurfaceConfig.c(dVar, bVar), SurfaceConfig.c(SurfaceConfig.d.JPEG, bVar2)));
        arrayList.add(new n0.v3(SurfaceConfig.c(dVar, bVar), SurfaceConfig.c(SurfaceConfig.d.JPEG_R, bVar2)));
        return arrayList;
    }

    public static List<n0.v3> b(Size size, n0.x3 x3Var) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig surfaceConfigK = SurfaceConfig.k(34, size, x3Var);
        n0.v3 v3Var = new n0.v3();
        v3Var.a(surfaceConfigK);
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(surfaceConfigK);
        v3Var2.a(surfaceConfigK);
        arrayList.add(v3Var2);
        return arrayList;
    }

    public static List<n0.v3> c() {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24913h;
        arrayList.add(new n0.v3(SurfaceConfig.c(dVar, bVar)));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24910e;
        arrayList.add(new n0.v3(SurfaceConfig.c(dVar, bVar2)));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24920o;
        arrayList.addAll(a(bVar, bVar3));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f24916k;
        arrayList.addAll(a(bVar, bVar4));
        arrayList.addAll(a(bVar, SurfaceConfig.b.f24915j));
        arrayList.addAll(a(bVar, bVar));
        arrayList.addAll(a(bVar2, bVar3));
        arrayList.addAll(a(bVar2, bVar4));
        arrayList.addAll(a(bVar2, bVar));
        SurfaceConfig.b bVar5 = SurfaceConfig.b.f24909d;
        SurfaceConfig.b bVar6 = SurfaceConfig.b.f24919n;
        arrayList.addAll(a(bVar5, bVar6));
        arrayList.addAll(a(SurfaceConfig.b.f24912g, bVar6));
        return arrayList;
    }

    public static List<n0.v3> d(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(i());
        if (i10 == 0 || i10 == 4 || i10 == 1 || i10 == 3) {
            arrayList.addAll(k());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (z10) {
            arrayList.addAll(m());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(f());
        }
        if (i10 == 3) {
            arrayList.addAll(j());
        }
        return arrayList;
    }

    public static List<n0.v3> e() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24911f;
        v3Var3.a(SurfaceConfig.c(dVar, bVar2));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        v3Var3.a(SurfaceConfig.c(dVar3, bVar));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar, bVar2));
        v3Var4.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar, bVar2));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24917l;
        v3Var6.a(SurfaceConfig.c(dVar, bVar3));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        v3Var7.a(SurfaceConfig.c(dVar, bVar2));
        v3Var7.a(SurfaceConfig.c(dVar, bVar3));
        v3Var7.a(SurfaceConfig.c(dVar2, bVar3));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar, bVar3));
        v3Var8.a(SurfaceConfig.c(dVar3, bVar3));
        arrayList.add(v3Var8);
        return arrayList;
    }

    public static List<n0.v3> f() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24911f;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar2));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        v3Var3.a(SurfaceConfig.c(dVar2, bVar));
        v3Var3.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var3);
        return arrayList;
    }

    public static List<n0.v3> g() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24914i;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        v3Var3.a(SurfaceConfig.c(dVar3, bVar));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24910e;
        v3Var4.a(SurfaceConfig.c(dVar, bVar2));
        v3Var4.a(SurfaceConfig.c(dVar3, bVar));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar3, bVar));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar, bVar2));
        v3Var6.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        v3Var7.a(SurfaceConfig.c(dVar, bVar2));
        v3Var7.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var8);
        n0.v3 v3Var9 = new n0.v3();
        v3Var9.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var9.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var9);
        return arrayList;
    }

    public static List<n0.v3> h() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24911f;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar2));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        v3Var3.a(SurfaceConfig.c(dVar2, bVar));
        v3Var3.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar, bVar));
        v3Var4.a(SurfaceConfig.c(dVar, bVar));
        v3Var4.a(SurfaceConfig.c(SurfaceConfig.d.JPEG, bVar2));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24908c;
        v3Var5.a(SurfaceConfig.c(dVar2, bVar3));
        v3Var5.a(SurfaceConfig.c(dVar, bVar));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar2, bVar3));
        v3Var6.a(SurfaceConfig.c(dVar2, bVar));
        v3Var6.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var6);
        return arrayList;
    }

    public static List<n0.v3> i() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.JPEG;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        v3Var3.a(SurfaceConfig.c(dVar3, bVar));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24911f;
        v3Var4.a(SurfaceConfig.c(dVar, bVar2));
        v3Var4.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar, bVar2));
        v3Var6.a(SurfaceConfig.c(dVar, bVar2));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        v3Var7.a(SurfaceConfig.c(dVar, bVar2));
        v3Var7.a(SurfaceConfig.c(dVar3, bVar2));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var8);
        return arrayList;
    }

    public static List<n0.v3> j() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24911f;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24908c;
        v3Var.a(SurfaceConfig.c(dVar, bVar2));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar2, bVar3));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.RAW;
        v3Var.a(SurfaceConfig.c(dVar3, bVar3));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        v3Var2.a(SurfaceConfig.c(dVar, bVar2));
        v3Var2.a(SurfaceConfig.c(SurfaceConfig.d.JPEG, bVar3));
        v3Var2.a(SurfaceConfig.c(dVar3, bVar3));
        arrayList.add(v3Var2);
        return arrayList;
    }

    public static List<n0.v3> k() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24911f;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24917l;
        v3Var.a(SurfaceConfig.c(dVar, bVar2));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        v3Var3.a(SurfaceConfig.c(dVar2, bVar));
        v3Var3.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar, bVar));
        v3Var4.a(SurfaceConfig.c(dVar, bVar2));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        v3Var4.a(SurfaceConfig.c(dVar3, bVar2));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar, bVar));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar3, bVar2));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar2, bVar));
        v3Var6.a(SurfaceConfig.c(dVar2, bVar));
        v3Var6.a(SurfaceConfig.c(dVar3, SurfaceConfig.b.f24918m));
        arrayList.add(v3Var6);
        return arrayList;
    }

    public static List<n0.v3> l() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24914i;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        v3Var3.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24918m;
        v3Var3.a(SurfaceConfig.c(dVar3, bVar2));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar2, bVar));
        v3Var4.a(SurfaceConfig.c(dVar3, bVar2));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar, bVar));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar2, bVar));
        v3Var6.a(SurfaceConfig.c(dVar2, bVar2));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24911f;
        v3Var7.a(SurfaceConfig.c(dVar, bVar3));
        v3Var7.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar2, bVar3));
        v3Var8.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var8);
        n0.v3 v3Var9 = new n0.v3();
        v3Var9.a(SurfaceConfig.c(dVar, bVar3));
        v3Var9.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var9);
        n0.v3 v3Var10 = new n0.v3();
        v3Var10.a(SurfaceConfig.c(dVar2, bVar3));
        v3Var10.a(SurfaceConfig.c(dVar2, bVar));
        arrayList.add(v3Var10);
        return arrayList;
    }

    public static List<n0.v3> m() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.RAW;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24911f;
        v3Var2.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        v3Var3.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var3.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var4.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var4.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var6.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var6.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        v3Var7.a(SurfaceConfig.c(dVar2, bVar2));
        SurfaceConfig.d dVar4 = SurfaceConfig.d.JPEG;
        v3Var7.a(SurfaceConfig.c(dVar4, bVar));
        v3Var7.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar3, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar4, bVar));
        v3Var8.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var8);
        return arrayList;
    }

    public static List<n0.v3> n() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24914i;
        n0.u3 u3Var = n0.u3.PREVIEW_VIDEO_STILL;
        v3Var.a(SurfaceConfig.d(dVar, bVar, u3Var));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        v3Var2.a(SurfaceConfig.d(dVar2, bVar, u3Var));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24917l;
        n0.u3 u3Var2 = n0.u3.VIDEO_RECORD;
        v3Var3.a(SurfaceConfig.d(dVar, bVar2, u3Var2));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.d(dVar2, bVar2, u3Var2));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24918m;
        n0.u3 u3Var3 = n0.u3.STILL_CAPTURE;
        v3Var5.a(SurfaceConfig.d(dVar3, bVar3, u3Var3));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.d(dVar2, bVar3, u3Var3));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f24911f;
        n0.u3 u3Var4 = n0.u3.PREVIEW;
        v3Var7.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var7.a(SurfaceConfig.d(dVar3, bVar3, u3Var3));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var8.a(SurfaceConfig.d(dVar2, bVar3, u3Var3));
        arrayList.add(v3Var8);
        n0.v3 v3Var9 = new n0.v3();
        v3Var9.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var9.a(SurfaceConfig.d(dVar, bVar2, u3Var2));
        arrayList.add(v3Var9);
        n0.v3 v3Var10 = new n0.v3();
        v3Var10.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var10.a(SurfaceConfig.d(dVar2, bVar2, u3Var2));
        arrayList.add(v3Var10);
        n0.v3 v3Var11 = new n0.v3();
        v3Var11.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var11.a(SurfaceConfig.d(dVar2, bVar4, u3Var4));
        arrayList.add(v3Var11);
        n0.v3 v3Var12 = new n0.v3();
        v3Var12.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var12.a(SurfaceConfig.d(dVar, bVar2, u3Var2));
        v3Var12.a(SurfaceConfig.d(dVar3, bVar2, u3Var3));
        arrayList.add(v3Var12);
        n0.v3 v3Var13 = new n0.v3();
        v3Var13.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var13.a(SurfaceConfig.d(dVar2, bVar2, u3Var2));
        v3Var13.a(SurfaceConfig.d(dVar3, bVar2, u3Var3));
        arrayList.add(v3Var13);
        n0.v3 v3Var14 = new n0.v3();
        v3Var14.a(SurfaceConfig.d(dVar, bVar4, u3Var4));
        v3Var14.a(SurfaceConfig.d(dVar2, bVar4, u3Var4));
        v3Var14.a(SurfaceConfig.d(dVar3, bVar3, u3Var3));
        arrayList.add(v3Var14);
        return arrayList;
    }

    public static List<n0.v3> o() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.JPEG_R;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24918m;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        v3Var2.a(SurfaceConfig.c(SurfaceConfig.d.PRIV, SurfaceConfig.b.f24911f));
        v3Var2.a(SurfaceConfig.c(dVar, bVar));
        arrayList.add(v3Var2);
        return arrayList;
    }

    public static List<n0.v3> p() {
        ArrayList arrayList = new ArrayList();
        n0.v3 v3Var = new n0.v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f24921p;
        v3Var.a(SurfaceConfig.c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f24911f;
        v3Var.a(SurfaceConfig.c(dVar2, bVar2));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f24917l;
        v3Var.a(SurfaceConfig.c(dVar2, bVar3));
        arrayList.add(v3Var);
        n0.v3 v3Var2 = new n0.v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        v3Var2.a(SurfaceConfig.c(dVar3, bVar));
        v3Var2.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var2.a(SurfaceConfig.c(dVar2, bVar3));
        arrayList.add(v3Var2);
        n0.v3 v3Var3 = new n0.v3();
        SurfaceConfig.d dVar4 = SurfaceConfig.d.RAW;
        v3Var3.a(SurfaceConfig.c(dVar4, bVar));
        v3Var3.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var3.a(SurfaceConfig.c(dVar2, bVar3));
        arrayList.add(v3Var3);
        n0.v3 v3Var4 = new n0.v3();
        v3Var4.a(SurfaceConfig.c(dVar, bVar));
        v3Var4.a(SurfaceConfig.c(dVar2, bVar2));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f24918m;
        v3Var4.a(SurfaceConfig.c(dVar3, bVar4));
        arrayList.add(v3Var4);
        n0.v3 v3Var5 = new n0.v3();
        v3Var5.a(SurfaceConfig.c(dVar3, bVar));
        v3Var5.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var5.a(SurfaceConfig.c(dVar3, bVar4));
        arrayList.add(v3Var5);
        n0.v3 v3Var6 = new n0.v3();
        v3Var6.a(SurfaceConfig.c(dVar4, bVar));
        v3Var6.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var6.a(SurfaceConfig.c(dVar3, bVar4));
        arrayList.add(v3Var6);
        n0.v3 v3Var7 = new n0.v3();
        v3Var7.a(SurfaceConfig.c(dVar, bVar));
        v3Var7.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var7.a(SurfaceConfig.c(dVar, bVar4));
        arrayList.add(v3Var7);
        n0.v3 v3Var8 = new n0.v3();
        v3Var8.a(SurfaceConfig.c(dVar3, bVar));
        v3Var8.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var8.a(SurfaceConfig.c(dVar, bVar4));
        arrayList.add(v3Var8);
        n0.v3 v3Var9 = new n0.v3();
        v3Var9.a(SurfaceConfig.c(dVar4, bVar));
        v3Var9.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var9.a(SurfaceConfig.c(dVar, bVar4));
        arrayList.add(v3Var9);
        n0.v3 v3Var10 = new n0.v3();
        v3Var10.a(SurfaceConfig.c(dVar, bVar));
        v3Var10.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var10.a(SurfaceConfig.c(dVar4, bVar4));
        arrayList.add(v3Var10);
        n0.v3 v3Var11 = new n0.v3();
        v3Var11.a(SurfaceConfig.c(dVar3, bVar));
        v3Var11.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var11.a(SurfaceConfig.c(dVar4, bVar4));
        arrayList.add(v3Var11);
        n0.v3 v3Var12 = new n0.v3();
        v3Var12.a(SurfaceConfig.c(dVar4, bVar));
        v3Var12.a(SurfaceConfig.c(dVar2, bVar2));
        v3Var12.a(SurfaceConfig.c(dVar4, bVar4));
        arrayList.add(v3Var12);
        return arrayList;
    }
}

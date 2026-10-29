package p589z;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p296n0.AbstractC8847x3;
import p296n0.C8837v3;
import p296n0.EnumC8832u3;
import p296n0.SurfaceConfig;

/* JADX INFO: renamed from: z.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C13544i4 {
    /* JADX INFO: renamed from: a */
    public static List<C8837v3> m49436a(SurfaceConfig.b bVar, SurfaceConfig.b bVar2) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        arrayList.add(new C8837v3(SurfaceConfig.m35476c(dVar, bVar), SurfaceConfig.m35476c(SurfaceConfig.d.JPEG, bVar2)));
        arrayList.add(new C8837v3(SurfaceConfig.m35476c(dVar, bVar), SurfaceConfig.m35476c(SurfaceConfig.d.JPEG_R, bVar2)));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<C8837v3> m49437b(Size size, AbstractC8847x3 abstractC8847x3) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig surfaceConfigM35479k = SurfaceConfig.m35479k(34, size, abstractC8847x3);
        C8837v3 c8837v3 = new C8837v3();
        c8837v3.m35467a(surfaceConfigM35479k);
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(surfaceConfigM35479k);
        c8837v4.m35467a(surfaceConfigM35479k);
        arrayList.add(c8837v4);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<C8837v3> m49438c() {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32166h;
        arrayList.add(new C8837v3(SurfaceConfig.m35476c(dVar, bVar)));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32163e;
        arrayList.add(new C8837v3(SurfaceConfig.m35476c(dVar, bVar2)));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32173o;
        arrayList.addAll(m49436a(bVar, bVar3));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f32169k;
        arrayList.addAll(m49436a(bVar, bVar4));
        arrayList.addAll(m49436a(bVar, SurfaceConfig.b.f32168j));
        arrayList.addAll(m49436a(bVar, bVar));
        arrayList.addAll(m49436a(bVar2, bVar3));
        arrayList.addAll(m49436a(bVar2, bVar4));
        arrayList.addAll(m49436a(bVar2, bVar));
        SurfaceConfig.b bVar5 = SurfaceConfig.b.f32162d;
        SurfaceConfig.b bVar6 = SurfaceConfig.b.f32172n;
        arrayList.addAll(m49436a(bVar5, bVar6));
        arrayList.addAll(m49436a(SurfaceConfig.b.f32165g, bVar6));
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<C8837v3> m49439d(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m49444i());
        if (i10 == 0 || i10 == 4 || i10 == 1 || i10 == 3) {
            arrayList.addAll(m49446k());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(m49443h());
        }
        if (z10) {
            arrayList.addAll(m49448m());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(m49441f());
        }
        if (i10 == 3) {
            arrayList.addAll(m49445j());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<C8837v3> m49440e() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32164f;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32170l;
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar3));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar3));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar3));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar3, bVar3));
        arrayList.add(c8837v10);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static List<C8837v3> m49441f() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32164f;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v5);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<C8837v3> m49442g() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32167i;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32163e;
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v10);
        C8837v3 c8837v11 = new C8837v3();
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v11);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<C8837v3> m49443h() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32164f;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v6.m35467a(SurfaceConfig.m35476c(SurfaceConfig.d.JPEG, bVar2));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32161c;
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v8);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static List<C8837v3> m49444i() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.JPEG;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32164f;
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v10);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static List<C8837v3> m49445j() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32164f;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32161c;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.RAW;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar3, bVar3));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        c8837v4.m35467a(SurfaceConfig.m35476c(SurfaceConfig.d.JPEG, bVar3));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar3, bVar3));
        arrayList.add(c8837v4);
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static List<C8837v3> m49446k() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32164f;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32170l;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar2));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar3, SurfaceConfig.b.f32171m));
        arrayList.add(c8837v8);
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static List<C8837v3> m49447l() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32167i;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32171m;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32164f;
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar3));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v10);
        C8837v3 c8837v11 = new C8837v3();
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar, bVar3));
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v11);
        C8837v3 c8837v12 = new C8837v3();
        c8837v12.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        c8837v12.m35467a(SurfaceConfig.m35476c(dVar2, bVar));
        arrayList.add(c8837v12);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static List<C8837v3> m49448m() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.RAW;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32164f;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        SurfaceConfig.d dVar4 = SurfaceConfig.d.JPEG;
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar3, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v10);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static List<C8837v3> m49449n() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32167i;
        EnumC8832u3 enumC8832u3 = EnumC8832u3.PREVIEW_VIDEO_STILL;
        c8837v3.m35467a(SurfaceConfig.m35477d(dVar, bVar, enumC8832u3));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        c8837v4.m35467a(SurfaceConfig.m35477d(dVar2, bVar, enumC8832u3));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32170l;
        EnumC8832u3 enumC8832u4 = EnumC8832u3.VIDEO_RECORD;
        c8837v5.m35467a(SurfaceConfig.m35477d(dVar, bVar2, enumC8832u4));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35477d(dVar2, bVar2, enumC8832u4));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32171m;
        EnumC8832u3 enumC8832u5 = EnumC8832u3.STILL_CAPTURE;
        c8837v7.m35467a(SurfaceConfig.m35477d(dVar3, bVar3, enumC8832u5));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35477d(dVar2, bVar3, enumC8832u5));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f32164f;
        EnumC8832u3 enumC8832u6 = EnumC8832u3.PREVIEW;
        c8837v9.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v9.m35467a(SurfaceConfig.m35477d(dVar3, bVar3, enumC8832u5));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v10.m35467a(SurfaceConfig.m35477d(dVar2, bVar3, enumC8832u5));
        arrayList.add(c8837v10);
        C8837v3 c8837v11 = new C8837v3();
        c8837v11.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v11.m35467a(SurfaceConfig.m35477d(dVar, bVar2, enumC8832u4));
        arrayList.add(c8837v11);
        C8837v3 c8837v12 = new C8837v3();
        c8837v12.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v12.m35467a(SurfaceConfig.m35477d(dVar2, bVar2, enumC8832u4));
        arrayList.add(c8837v12);
        C8837v3 c8837v13 = new C8837v3();
        c8837v13.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v13.m35467a(SurfaceConfig.m35477d(dVar2, bVar4, enumC8832u6));
        arrayList.add(c8837v13);
        C8837v3 c8837v14 = new C8837v3();
        c8837v14.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v14.m35467a(SurfaceConfig.m35477d(dVar, bVar2, enumC8832u4));
        c8837v14.m35467a(SurfaceConfig.m35477d(dVar3, bVar2, enumC8832u5));
        arrayList.add(c8837v14);
        C8837v3 c8837v15 = new C8837v3();
        c8837v15.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v15.m35467a(SurfaceConfig.m35477d(dVar2, bVar2, enumC8832u4));
        c8837v15.m35467a(SurfaceConfig.m35477d(dVar3, bVar2, enumC8832u5));
        arrayList.add(c8837v15);
        C8837v3 c8837v16 = new C8837v3();
        c8837v16.m35467a(SurfaceConfig.m35477d(dVar, bVar4, enumC8832u6));
        c8837v16.m35467a(SurfaceConfig.m35477d(dVar2, bVar4, enumC8832u6));
        c8837v16.m35467a(SurfaceConfig.m35477d(dVar3, bVar3, enumC8832u5));
        arrayList.add(c8837v16);
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static List<C8837v3> m49450o() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.JPEG_R;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32171m;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        c8837v4.m35467a(SurfaceConfig.m35476c(SurfaceConfig.d.PRIV, SurfaceConfig.b.f32164f));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        arrayList.add(c8837v4);
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static List<C8837v3> m49451p() {
        ArrayList arrayList = new ArrayList();
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f32174p;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f32164f;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f32170l;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        arrayList.add(c8837v3);
        C8837v3 c8837v4 = new C8837v3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v4.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        arrayList.add(c8837v4);
        C8837v3 c8837v5 = new C8837v3();
        SurfaceConfig.d dVar4 = SurfaceConfig.d.RAW;
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v5.m35467a(SurfaceConfig.m35476c(dVar2, bVar3));
        arrayList.add(c8837v5);
        C8837v3 c8837v6 = new C8837v3();
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f32171m;
        c8837v6.m35467a(SurfaceConfig.m35476c(dVar3, bVar4));
        arrayList.add(c8837v6);
        C8837v3 c8837v7 = new C8837v3();
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v7.m35467a(SurfaceConfig.m35476c(dVar3, bVar4));
        arrayList.add(c8837v7);
        C8837v3 c8837v8 = new C8837v3();
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v8.m35467a(SurfaceConfig.m35476c(dVar3, bVar4));
        arrayList.add(c8837v8);
        C8837v3 c8837v9 = new C8837v3();
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v9.m35467a(SurfaceConfig.m35476c(dVar, bVar4));
        arrayList.add(c8837v9);
        C8837v3 c8837v10 = new C8837v3();
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v10.m35467a(SurfaceConfig.m35476c(dVar, bVar4));
        arrayList.add(c8837v10);
        C8837v3 c8837v11 = new C8837v3();
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v11.m35467a(SurfaceConfig.m35476c(dVar, bVar4));
        arrayList.add(c8837v11);
        C8837v3 c8837v12 = new C8837v3();
        c8837v12.m35467a(SurfaceConfig.m35476c(dVar, bVar));
        c8837v12.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v12.m35467a(SurfaceConfig.m35476c(dVar4, bVar4));
        arrayList.add(c8837v12);
        C8837v3 c8837v13 = new C8837v3();
        c8837v13.m35467a(SurfaceConfig.m35476c(dVar3, bVar));
        c8837v13.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v13.m35467a(SurfaceConfig.m35476c(dVar4, bVar4));
        arrayList.add(c8837v13);
        C8837v3 c8837v14 = new C8837v3();
        c8837v14.m35467a(SurfaceConfig.m35476c(dVar4, bVar));
        c8837v14.m35467a(SurfaceConfig.m35476c(dVar2, bVar2));
        c8837v14.m35467a(SurfaceConfig.m35476c(dVar4, bVar4));
        arrayList.add(c8837v14);
        return arrayList;
    }
}

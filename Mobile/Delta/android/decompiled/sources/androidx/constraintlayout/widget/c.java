package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f2.j;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1439g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SparseIntArray f1440h = new SparseIntArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SparseIntArray f1441i = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1442a = "";
    public String[] b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1443c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f1444d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1445e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<Integer, a> f1446f = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1447a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f1448c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0020c f1449d = new C0020c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1450e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f1451f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f1452g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0019a f1453h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0019a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f1454a = new int[10];
            public int[] b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f1455c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f1456d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f1457e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f1458f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f1459g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f1460h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f1461i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f1462j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f1463k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f1464l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1458f;
                int[] iArr = this.f1456d;
                if (i11 >= iArr.length) {
                    this.f1456d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1457e;
                    this.f1457e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1456d;
                int i12 = this.f1458f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1457e;
                this.f1458f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1455c;
                int[] iArr = this.f1454a;
                if (i12 >= iArr.length) {
                    this.f1454a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1454a;
                int i13 = this.f1455c;
                iArr3[i13] = i10;
                int[] iArr4 = this.b;
                this.f1455c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1461i;
                int[] iArr = this.f1459g;
                if (i11 >= iArr.length) {
                    this.f1459g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1460h;
                    this.f1460h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1459g;
                int i12 = this.f1461i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1460h;
                this.f1461i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1464l;
                int[] iArr = this.f1462j;
                if (i11 >= iArr.length) {
                    this.f1462j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1463k;
                    this.f1463k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1462j;
                int i12 = this.f1464l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1463k;
                this.f1464l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1450e;
            bVar.f1366e = bVar2.f1483j;
            bVar.f1368f = bVar2.f1485k;
            bVar.f1370g = bVar2.f1487l;
            bVar.f1372h = bVar2.f1489m;
            bVar.f1374i = bVar2.f1491n;
            bVar.f1376j = bVar2.f1493o;
            bVar.f1378k = bVar2.f1495p;
            bVar.f1380l = bVar2.f1497q;
            bVar.f1382m = bVar2.f1499r;
            bVar.f1384n = bVar2.f1500s;
            bVar.f1386o = bVar2.f1501t;
            bVar.f1394s = bVar2.f1502u;
            bVar.f1396t = bVar2.f1503v;
            bVar.f1398u = bVar2.f1504w;
            bVar.f1400v = bVar2.f1505x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1404x = bVar2.P;
            bVar.f1406z = bVar2.R;
            bVar.G = bVar2.f1506y;
            bVar.H = bVar2.f1507z;
            bVar.f1388p = bVar2.B;
            bVar.f1390q = bVar2.C;
            bVar.f1392r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1360a0 = bVar2.f1492n0;
            bVar.f1361b0 = bVar2.f1494o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1467a0;
            bVar.T = bVar2.f1468b0;
            bVar.U = bVar2.f1470c0;
            bVar.R = bVar2.f1472d0;
            bVar.S = bVar2.f1474e0;
            bVar.V = bVar2.f1476f0;
            bVar.W = bVar2.f1478g0;
            bVar.Z = bVar2.G;
            bVar.f1362c = bVar2.f1479h;
            bVar.f1359a = bVar2.f1475f;
            bVar.b = bVar2.f1477g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1471d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1473e;
            String str = bVar2.f1490m0;
            if (str != null) {
                bVar.f1363c0 = str;
            }
            bVar.f1365d0 = bVar2.f1498q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1450e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1450e.a(this.f1450e);
            aVar.f1449d.a(this.f1449d);
            aVar.f1448c.a(this.f1448c);
            aVar.f1451f.a(this.f1451f);
            aVar.f1447a = this.f1447a;
            aVar.f1453h = this.f1453h;
            return aVar;
        }

        public final void f(int i10, ConstraintLayout.b bVar) {
            this.f1447a = i10;
            b bVar2 = this.f1450e;
            bVar2.f1483j = bVar.f1366e;
            bVar2.f1485k = bVar.f1368f;
            bVar2.f1487l = bVar.f1370g;
            bVar2.f1489m = bVar.f1372h;
            bVar2.f1491n = bVar.f1374i;
            bVar2.f1493o = bVar.f1376j;
            bVar2.f1495p = bVar.f1378k;
            bVar2.f1497q = bVar.f1380l;
            bVar2.f1499r = bVar.f1382m;
            bVar2.f1500s = bVar.f1384n;
            bVar2.f1501t = bVar.f1386o;
            bVar2.f1502u = bVar.f1394s;
            bVar2.f1503v = bVar.f1396t;
            bVar2.f1504w = bVar.f1398u;
            bVar2.f1505x = bVar.f1400v;
            bVar2.f1506y = bVar.G;
            bVar2.f1507z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1388p;
            bVar2.C = bVar.f1390q;
            bVar2.D = bVar.f1392r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1479h = bVar.f1362c;
            bVar2.f1475f = bVar.f1359a;
            bVar2.f1477g = bVar.b;
            bVar2.f1471d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1473e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1492n0 = bVar.f1360a0;
            bVar2.f1494o0 = bVar.f1361b0;
            bVar2.Z = bVar.P;
            bVar2.f1467a0 = bVar.Q;
            bVar2.f1468b0 = bVar.T;
            bVar2.f1470c0 = bVar.U;
            bVar2.f1472d0 = bVar.R;
            bVar2.f1474e0 = bVar.S;
            bVar2.f1476f0 = bVar.V;
            bVar2.f1478g0 = bVar.W;
            bVar2.f1490m0 = bVar.f1363c0;
            bVar2.P = bVar.f1404x;
            bVar2.R = bVar.f1406z;
            bVar2.O = bVar.f1402w;
            bVar2.Q = bVar.f1405y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1498q0 = bVar.f1365d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1450e.M = bVar.getMarginStart();
        }

        public final void g(int i10, androidx.constraintlayout.widget.d.a aVar) {
            f(i10, aVar);
            this.f1448c.f1524d = aVar.f1541x0;
            e eVar = this.f1451f;
            eVar.b = aVar.A0;
            eVar.f1528c = aVar.B0;
            eVar.f1529d = aVar.C0;
            eVar.f1530e = aVar.D0;
            eVar.f1531f = aVar.E0;
            eVar.f1532g = aVar.F0;
            eVar.f1533h = aVar.G0;
            eVar.f1535j = aVar.H0;
            eVar.f1536k = aVar.I0;
            eVar.f1537l = aVar.J0;
            eVar.f1539n = aVar.f1543z0;
            eVar.f1538m = aVar.f1542y0;
        }

        public final void h(androidx.constraintlayout.widget.b bVar, int i10, androidx.constraintlayout.widget.d.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f1450e;
                bVar2.f1484j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1480h0 = barrier.getType();
                this.f1450e.f1486k0 = barrier.getReferencedIds();
                this.f1450e.f1482i0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static SparseIntArray f1465r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1473e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f1486k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f1488l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f1490m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1466a = false;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1469c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1475f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1477g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1479h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1481i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1483j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1485k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1487l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1489m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1491n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1493o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1495p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1497q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1499r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1500s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1501t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1502u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1503v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1504w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1505x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f1506y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f1507z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f1467a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f1468b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f1470c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1472d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f1474e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f1476f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f1478g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f1480h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1482i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f1484j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f1492n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f1494o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f1496p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1498q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1465r0 = sparseIntArray;
            sparseIntArray.append(g2.d.O5, 24);
            f1465r0.append(g2.d.P5, 25);
            f1465r0.append(g2.d.R5, 28);
            f1465r0.append(g2.d.S5, 29);
            f1465r0.append(g2.d.X5, 35);
            f1465r0.append(g2.d.W5, 34);
            f1465r0.append(g2.d.f18396x5, 4);
            f1465r0.append(g2.d.w5, 3);
            f1465r0.append(g2.d.f18374u5, 1);
            f1465r0.append(g2.d.f18244f6, 6);
            f1465r0.append(g2.d.f18253g6, 7);
            f1465r0.append(g2.d.E5, 17);
            f1465r0.append(g2.d.F5, 18);
            f1465r0.append(g2.d.G5, 19);
            SparseIntArray sparseIntArray2 = f1465r0;
            int i10 = g2.d.f18342q5;
            sparseIntArray2.append(i10, 90);
            f1465r0.append(g2.d.f18216c5, 26);
            f1465r0.append(g2.d.T5, 31);
            f1465r0.append(g2.d.U5, 32);
            f1465r0.append(g2.d.D5, 10);
            f1465r0.append(g2.d.C5, 9);
            f1465r0.append(g2.d.f18280j6, 13);
            f1465r0.append(g2.d.f18307m6, 16);
            f1465r0.append(g2.d.f18289k6, 14);
            f1465r0.append(g2.d.f18262h6, 11);
            f1465r0.append(g2.d.f18298l6, 15);
            f1465r0.append(g2.d.f18271i6, 12);
            f1465r0.append(g2.d.f18200a6, 38);
            f1465r0.append(g2.d.M5, 37);
            f1465r0.append(g2.d.L5, 39);
            f1465r0.append(g2.d.Z5, 40);
            f1465r0.append(g2.d.K5, 20);
            f1465r0.append(g2.d.Y5, 36);
            f1465r0.append(g2.d.B5, 5);
            f1465r0.append(g2.d.N5, 91);
            f1465r0.append(g2.d.V5, 91);
            f1465r0.append(g2.d.Q5, 91);
            f1465r0.append(g2.d.v5, 91);
            f1465r0.append(g2.d.f18366t5, 91);
            f1465r0.append(g2.d.f18243f5, 23);
            f1465r0.append(g2.d.f18261h5, 27);
            f1465r0.append(g2.d.f18279j5, 30);
            f1465r0.append(g2.d.f18288k5, 8);
            f1465r0.append(g2.d.f18252g5, 33);
            f1465r0.append(g2.d.f18270i5, 2);
            f1465r0.append(g2.d.f18225d5, 22);
            f1465r0.append(g2.d.f18234e5, 21);
            SparseIntArray sparseIntArray3 = f1465r0;
            int i11 = g2.d.f18208b6;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f1465r0;
            int i12 = g2.d.H5;
            sparseIntArray4.append(i12, 42);
            f1465r0.append(g2.d.f18358s5, 87);
            f1465r0.append(g2.d.f18350r5, 88);
            f1465r0.append(g2.d.f18316n6, 76);
            f1465r0.append(g2.d.f18404y5, 61);
            f1465r0.append(g2.d.A5, 62);
            f1465r0.append(g2.d.f18412z5, 63);
            f1465r0.append(g2.d.f18235e6, 69);
            f1465r0.append(g2.d.J5, 70);
            f1465r0.append(g2.d.f18324o5, 71);
            f1465r0.append(g2.d.f18306m5, 72);
            f1465r0.append(g2.d.f18315n5, 73);
            f1465r0.append(g2.d.f18333p5, 74);
            f1465r0.append(g2.d.f18297l5, 75);
            SparseIntArray sparseIntArray5 = f1465r0;
            int i13 = g2.d.f18217c6;
            sparseIntArray5.append(i13, 84);
            f1465r0.append(g2.d.f18226d6, 86);
            f1465r0.append(i13, 83);
            f1465r0.append(g2.d.I5, 85);
            f1465r0.append(i11, 87);
            f1465r0.append(i12, 88);
            f1465r0.append(g2.d.f18355s2, 89);
            f1465r0.append(i10, 90);
        }

        public void a(b bVar) {
            this.f1466a = bVar.f1466a;
            this.f1471d = bVar.f1471d;
            this.b = bVar.b;
            this.f1473e = bVar.f1473e;
            this.f1475f = bVar.f1475f;
            this.f1477g = bVar.f1477g;
            this.f1479h = bVar.f1479h;
            this.f1481i = bVar.f1481i;
            this.f1483j = bVar.f1483j;
            this.f1485k = bVar.f1485k;
            this.f1487l = bVar.f1487l;
            this.f1489m = bVar.f1489m;
            this.f1491n = bVar.f1491n;
            this.f1493o = bVar.f1493o;
            this.f1495p = bVar.f1495p;
            this.f1497q = bVar.f1497q;
            this.f1499r = bVar.f1499r;
            this.f1500s = bVar.f1500s;
            this.f1501t = bVar.f1501t;
            this.f1502u = bVar.f1502u;
            this.f1503v = bVar.f1503v;
            this.f1504w = bVar.f1504w;
            this.f1505x = bVar.f1505x;
            this.f1506y = bVar.f1506y;
            this.f1507z = bVar.f1507z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1467a0 = bVar.f1467a0;
            this.f1468b0 = bVar.f1468b0;
            this.f1470c0 = bVar.f1470c0;
            this.f1472d0 = bVar.f1472d0;
            this.f1474e0 = bVar.f1474e0;
            this.f1476f0 = bVar.f1476f0;
            this.f1478g0 = bVar.f1478g0;
            this.f1480h0 = bVar.f1480h0;
            this.f1482i0 = bVar.f1482i0;
            this.f1484j0 = bVar.f1484j0;
            this.f1490m0 = bVar.f1490m0;
            int[] iArr = bVar.f1486k0;
            if (iArr == null || bVar.f1488l0 != null) {
                this.f1486k0 = null;
            } else {
                this.f1486k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1488l0 = bVar.f1488l0;
            this.f1492n0 = bVar.f1492n0;
            this.f1494o0 = bVar.f1494o0;
            this.f1496p0 = bVar.f1496p0;
            this.f1498q0 = bVar.f1498q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f18207b5);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1465r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1499r = c.v(typedArrayObtainStyledAttributes, index, this.f1499r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1497q = c.v(typedArrayObtainStyledAttributes, index, this.f1497q);
                        break;
                    case 4:
                        this.f1495p = c.v(typedArrayObtainStyledAttributes, index, this.f1495p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1505x = c.v(typedArrayObtainStyledAttributes, index, this.f1505x);
                        break;
                    case 10:
                        this.f1504w = c.v(typedArrayObtainStyledAttributes, index, this.f1504w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1475f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1475f);
                        break;
                    case 18:
                        this.f1477g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1477g);
                        break;
                    case 19:
                        this.f1479h = typedArrayObtainStyledAttributes.getFloat(index, this.f1479h);
                        break;
                    case 20:
                        this.f1506y = typedArrayObtainStyledAttributes.getFloat(index, this.f1506y);
                        break;
                    case 21:
                        this.f1473e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1473e);
                        break;
                    case 22:
                        this.f1471d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1471d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1483j = c.v(typedArrayObtainStyledAttributes, index, this.f1483j);
                        break;
                    case 25:
                        this.f1485k = c.v(typedArrayObtainStyledAttributes, index, this.f1485k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1487l = c.v(typedArrayObtainStyledAttributes, index, this.f1487l);
                        break;
                    case 29:
                        this.f1489m = c.v(typedArrayObtainStyledAttributes, index, this.f1489m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1502u = c.v(typedArrayObtainStyledAttributes, index, this.f1502u);
                        break;
                    case 32:
                        this.f1503v = c.v(typedArrayObtainStyledAttributes, index, this.f1503v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1493o = c.v(typedArrayObtainStyledAttributes, index, this.f1493o);
                        break;
                    case 35:
                        this.f1491n = c.v(typedArrayObtainStyledAttributes, index, this.f1491n);
                        break;
                    case 36:
                        this.f1507z = typedArrayObtainStyledAttributes.getFloat(index, this.f1507z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        c.w(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.w(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = c.v(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1476f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1478g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1480h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1480h0);
                                        break;
                                    case 73:
                                        this.f1482i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1482i0);
                                        break;
                                    case 74:
                                        this.f1488l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1496p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1496p0);
                                        break;
                                    case 76:
                                        this.f1498q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1498q0);
                                        break;
                                    case 77:
                                        this.f1500s = c.v(typedArrayObtainStyledAttributes, index, this.f1500s);
                                        break;
                                    case 78:
                                        this.f1501t = c.v(typedArrayObtainStyledAttributes, index, this.f1501t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f1467a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1467a0);
                                        break;
                                    case 83:
                                        this.f1470c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1470c0);
                                        break;
                                    case 84:
                                        this.f1468b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1468b0);
                                        break;
                                    case 85:
                                        this.f1474e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1474e0);
                                        break;
                                    case 86:
                                        this.f1472d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1472d0);
                                        break;
                                    case 87:
                                        this.f1492n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1492n0);
                                        break;
                                    case 88:
                                        this.f1494o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1494o0);
                                        break;
                                    case 89:
                                        this.f1490m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1481i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1481i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1465r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1465r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0020c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1508o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1509a = false;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1510c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1511d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1512e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1513f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1514g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1515h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1516i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1517j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1518k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1519l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1520m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1521n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1508o = sparseIntArray;
            sparseIntArray.append(g2.d.f18367t6, 1);
            f1508o.append(g2.d.f18382v6, 2);
            f1508o.append(g2.d.f18413z6, 3);
            f1508o.append(g2.d.f18359s6, 4);
            f1508o.append(g2.d.f18351r6, 5);
            f1508o.append(g2.d.f18343q6, 6);
            f1508o.append(g2.d.f18375u6, 7);
            f1508o.append(g2.d.f18405y6, 8);
            f1508o.append(g2.d.f18397x6, 9);
            f1508o.append(g2.d.f18389w6, 10);
        }

        public void a(C0020c c0020c) {
            this.f1509a = c0020c.f1509a;
            this.b = c0020c.b;
            this.f1511d = c0020c.f1511d;
            this.f1512e = c0020c.f1512e;
            this.f1513f = c0020c.f1513f;
            this.f1516i = c0020c.f1516i;
            this.f1514g = c0020c.f1514g;
            this.f1515h = c0020c.f1515h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f18334p6);
            this.f1509a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1508o.get(index)) {
                    case 1:
                        this.f1516i = typedArrayObtainStyledAttributes.getFloat(index, this.f1516i);
                        break;
                    case 2:
                        this.f1512e = typedArrayObtainStyledAttributes.getInt(index, this.f1512e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1511d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f1511d = a2.b.f79c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f1513f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.v(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f1510c = typedArrayObtainStyledAttributes.getInteger(index, this.f1510c);
                        break;
                    case 7:
                        this.f1514g = typedArrayObtainStyledAttributes.getFloat(index, this.f1514g);
                        break;
                    case 8:
                        this.f1518k = typedArrayObtainStyledAttributes.getInteger(index, this.f1518k);
                        break;
                    case 9:
                        this.f1517j = typedArrayObtainStyledAttributes.getFloat(index, this.f1517j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1521n = resourceId;
                            if (resourceId != -1) {
                                this.f1520m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1519l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1521n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1520m = -2;
                            } else {
                                this.f1520m = -1;
                            }
                        } else {
                            this.f1520m = typedArrayObtainStyledAttributes.getInteger(index, this.f1521n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1522a = false;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1523c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1524d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1525e = Float.NaN;

        public void a(d dVar) {
            this.f1522a = dVar.f1522a;
            this.b = dVar.b;
            this.f1524d = dVar.f1524d;
            this.f1525e = dVar.f1525e;
            this.f1523c = dVar.f1523c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.K6);
            this.f1522a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g2.d.M6) {
                    this.f1524d = typedArrayObtainStyledAttributes.getFloat(index, this.f1524d);
                } else if (index == g2.d.L6) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = c.f1439g[this.b];
                } else if (index == g2.d.O6) {
                    this.f1523c = typedArrayObtainStyledAttributes.getInt(index, this.f1523c);
                } else if (index == g2.d.N6) {
                    this.f1525e = typedArrayObtainStyledAttributes.getFloat(index, this.f1525e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1526o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1527a = false;
        public float b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1528c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1529d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1530e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1531f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1532g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1533h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1534i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1535j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1536k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1537l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1538m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1539n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1526o = sparseIntArray;
            sparseIntArray.append(g2.d.f18209b7, 1);
            f1526o.append(g2.d.f18218c7, 2);
            f1526o.append(g2.d.f18227d7, 3);
            f1526o.append(g2.d.Z6, 4);
            f1526o.append(g2.d.f18201a7, 5);
            f1526o.append(g2.d.V6, 6);
            f1526o.append(g2.d.W6, 7);
            f1526o.append(g2.d.X6, 8);
            f1526o.append(g2.d.Y6, 9);
            f1526o.append(g2.d.f18236e7, 10);
            f1526o.append(g2.d.f18245f7, 11);
            f1526o.append(g2.d.f18254g7, 12);
        }

        public void a(e eVar) {
            this.f1527a = eVar.f1527a;
            this.b = eVar.b;
            this.f1528c = eVar.f1528c;
            this.f1529d = eVar.f1529d;
            this.f1530e = eVar.f1530e;
            this.f1531f = eVar.f1531f;
            this.f1532g = eVar.f1532g;
            this.f1533h = eVar.f1533h;
            this.f1534i = eVar.f1534i;
            this.f1535j = eVar.f1535j;
            this.f1536k = eVar.f1536k;
            this.f1537l = eVar.f1537l;
            this.f1538m = eVar.f1538m;
            this.f1539n = eVar.f1539n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.U6);
            this.f1527a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1526o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.f1528c = typedArrayObtainStyledAttributes.getFloat(index, this.f1528c);
                        break;
                    case 3:
                        this.f1529d = typedArrayObtainStyledAttributes.getFloat(index, this.f1529d);
                        break;
                    case 4:
                        this.f1530e = typedArrayObtainStyledAttributes.getFloat(index, this.f1530e);
                        break;
                    case 5:
                        this.f1531f = typedArrayObtainStyledAttributes.getFloat(index, this.f1531f);
                        break;
                    case 6:
                        this.f1532g = typedArrayObtainStyledAttributes.getDimension(index, this.f1532g);
                        break;
                    case 7:
                        this.f1533h = typedArrayObtainStyledAttributes.getDimension(index, this.f1533h);
                        break;
                    case 8:
                        this.f1535j = typedArrayObtainStyledAttributes.getDimension(index, this.f1535j);
                        break;
                    case 9:
                        this.f1536k = typedArrayObtainStyledAttributes.getDimension(index, this.f1536k);
                        break;
                    case 10:
                        this.f1537l = typedArrayObtainStyledAttributes.getDimension(index, this.f1537l);
                        break;
                    case 11:
                        this.f1538m = true;
                        this.f1539n = typedArrayObtainStyledAttributes.getDimension(index, this.f1539n);
                        break;
                    case 12:
                        this.f1534i = c.v(typedArrayObtainStyledAttributes, index, this.f1534i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1440h.append(g2.d.f18265i0, 25);
        f1440h.append(g2.d.f18274j0, 26);
        f1440h.append(g2.d.f18292l0, 29);
        f1440h.append(g2.d.f18301m0, 30);
        f1440h.append(g2.d.f18353s0, 36);
        f1440h.append(g2.d.f18345r0, 35);
        f1440h.append(g2.d.P, 4);
        f1440h.append(g2.d.O, 3);
        f1440h.append(g2.d.K, 1);
        f1440h.append(g2.d.M, 91);
        f1440h.append(g2.d.L, 92);
        f1440h.append(g2.d.B0, 6);
        f1440h.append(g2.d.C0, 7);
        f1440h.append(g2.d.W, 17);
        f1440h.append(g2.d.X, 18);
        f1440h.append(g2.d.Y, 19);
        f1440h.append(g2.d.G, 99);
        f1440h.append(g2.d.f18210c, 27);
        f1440h.append(g2.d.f18310n0, 32);
        f1440h.append(g2.d.f18319o0, 33);
        f1440h.append(g2.d.V, 10);
        f1440h.append(g2.d.U, 9);
        f1440h.append(g2.d.F0, 13);
        f1440h.append(g2.d.I0, 16);
        f1440h.append(g2.d.G0, 14);
        f1440h.append(g2.d.D0, 11);
        f1440h.append(g2.d.H0, 15);
        f1440h.append(g2.d.E0, 12);
        f1440h.append(g2.d.f18377v0, 40);
        f1440h.append(g2.d.f18247g0, 39);
        f1440h.append(g2.d.f18238f0, 41);
        f1440h.append(g2.d.f18369u0, 42);
        f1440h.append(g2.d.f18229e0, 20);
        f1440h.append(g2.d.f18361t0, 37);
        f1440h.append(g2.d.T, 5);
        f1440h.append(g2.d.f18256h0, 87);
        f1440h.append(g2.d.f18337q0, 87);
        f1440h.append(g2.d.f18283k0, 87);
        f1440h.append(g2.d.N, 87);
        f1440h.append(g2.d.J, 87);
        f1440h.append(g2.d.f18255h, 24);
        f1440h.append(g2.d.f18273j, 28);
        f1440h.append(g2.d.f18376v, 31);
        f1440h.append(g2.d.f18383w, 8);
        f1440h.append(g2.d.f18264i, 34);
        f1440h.append(g2.d.f18282k, 2);
        f1440h.append(g2.d.f18237f, 23);
        f1440h.append(g2.d.f18246g, 21);
        f1440h.append(g2.d.f18384w0, 95);
        f1440h.append(g2.d.Z, 96);
        f1440h.append(g2.d.f18228e, 22);
        f1440h.append(g2.d.f18291l, 43);
        f1440h.append(g2.d.f18398y, 44);
        f1440h.append(g2.d.f18360t, 45);
        f1440h.append(g2.d.f18368u, 46);
        f1440h.append(g2.d.f18352s, 60);
        f1440h.append(g2.d.f18336q, 47);
        f1440h.append(g2.d.f18344r, 48);
        f1440h.append(g2.d.f18300m, 49);
        f1440h.append(g2.d.f18309n, 50);
        f1440h.append(g2.d.f18318o, 51);
        f1440h.append(g2.d.f18327p, 52);
        f1440h.append(g2.d.f18390x, 53);
        f1440h.append(g2.d.f18391x0, 54);
        f1440h.append(g2.d.f18194a0, 55);
        f1440h.append(g2.d.f18399y0, 56);
        f1440h.append(g2.d.f18202b0, 57);
        f1440h.append(g2.d.f18407z0, 58);
        f1440h.append(g2.d.f18211c0, 59);
        f1440h.append(g2.d.Q, 61);
        f1440h.append(g2.d.S, 62);
        f1440h.append(g2.d.R, 63);
        f1440h.append(g2.d.f18406z, 64);
        f1440h.append(g2.d.S0, 65);
        f1440h.append(g2.d.F, 66);
        f1440h.append(g2.d.T0, 67);
        f1440h.append(g2.d.L0, 79);
        f1440h.append(g2.d.f18219d, 38);
        f1440h.append(g2.d.K0, 68);
        f1440h.append(g2.d.A0, 69);
        f1440h.append(g2.d.f18220d0, 70);
        f1440h.append(g2.d.J0, 97);
        f1440h.append(g2.d.D, 71);
        f1440h.append(g2.d.B, 72);
        f1440h.append(g2.d.C, 73);
        f1440h.append(g2.d.E, 74);
        f1440h.append(g2.d.A, 75);
        f1440h.append(g2.d.M0, 76);
        f1440h.append(g2.d.f18328p0, 77);
        f1440h.append(g2.d.U0, 78);
        f1440h.append(g2.d.I, 80);
        f1440h.append(g2.d.H, 81);
        f1440h.append(g2.d.N0, 82);
        f1440h.append(g2.d.R0, 83);
        f1440h.append(g2.d.Q0, 84);
        f1440h.append(g2.d.P0, 85);
        f1440h.append(g2.d.O0, 86);
        SparseIntArray sparseIntArray = f1441i;
        int i10 = g2.d.Y3;
        sparseIntArray.append(i10, 6);
        f1441i.append(i10, 7);
        f1441i.append(g2.d.T2, 27);
        f1441i.append(g2.d.f18206b4, 13);
        f1441i.append(g2.d.f18233e4, 16);
        f1441i.append(g2.d.f18215c4, 14);
        f1441i.append(g2.d.Z3, 11);
        f1441i.append(g2.d.f18224d4, 15);
        f1441i.append(g2.d.f18198a4, 12);
        f1441i.append(g2.d.S3, 40);
        f1441i.append(g2.d.L3, 39);
        f1441i.append(g2.d.K3, 41);
        f1441i.append(g2.d.R3, 42);
        f1441i.append(g2.d.J3, 20);
        f1441i.append(g2.d.Q3, 37);
        f1441i.append(g2.d.D3, 5);
        f1441i.append(g2.d.M3, 87);
        f1441i.append(g2.d.P3, 87);
        f1441i.append(g2.d.N3, 87);
        f1441i.append(g2.d.A3, 87);
        f1441i.append(g2.d.f18410z3, 87);
        f1441i.append(g2.d.Y2, 24);
        f1441i.append(g2.d.f18197a3, 28);
        f1441i.append(g2.d.f18304m3, 31);
        f1441i.append(g2.d.f18313n3, 8);
        f1441i.append(g2.d.Z2, 34);
        f1441i.append(g2.d.f18205b3, 2);
        f1441i.append(g2.d.W2, 23);
        f1441i.append(g2.d.X2, 21);
        f1441i.append(g2.d.T3, 95);
        f1441i.append(g2.d.E3, 96);
        f1441i.append(g2.d.V2, 22);
        f1441i.append(g2.d.f18214c3, 43);
        f1441i.append(g2.d.f18331p3, 44);
        f1441i.append(g2.d.f18286k3, 45);
        f1441i.append(g2.d.f18295l3, 46);
        f1441i.append(g2.d.f18277j3, 60);
        f1441i.append(g2.d.f18259h3, 47);
        f1441i.append(g2.d.f18268i3, 48);
        f1441i.append(g2.d.f18223d3, 49);
        f1441i.append(g2.d.f18232e3, 50);
        f1441i.append(g2.d.f18241f3, 51);
        f1441i.append(g2.d.f18250g3, 52);
        f1441i.append(g2.d.f18322o3, 53);
        f1441i.append(g2.d.U3, 54);
        f1441i.append(g2.d.F3, 55);
        f1441i.append(g2.d.V3, 56);
        f1441i.append(g2.d.G3, 57);
        f1441i.append(g2.d.W3, 58);
        f1441i.append(g2.d.H3, 59);
        f1441i.append(g2.d.C3, 62);
        f1441i.append(g2.d.B3, 63);
        f1441i.append(g2.d.f18340q3, 64);
        f1441i.append(g2.d.f18332p4, 65);
        f1441i.append(g2.d.f18387w3, 66);
        f1441i.append(g2.d.f18341q4, 67);
        f1441i.append(g2.d.f18260h4, 79);
        f1441i.append(g2.d.U2, 38);
        f1441i.append(g2.d.f18269i4, 98);
        f1441i.append(g2.d.f18251g4, 68);
        f1441i.append(g2.d.X3, 69);
        f1441i.append(g2.d.I3, 70);
        f1441i.append(g2.d.f18372u3, 71);
        f1441i.append(g2.d.f18356s3, 72);
        f1441i.append(g2.d.f18364t3, 73);
        f1441i.append(g2.d.f18380v3, 74);
        f1441i.append(g2.d.f18348r3, 75);
        f1441i.append(g2.d.f18278j4, 76);
        f1441i.append(g2.d.O3, 77);
        f1441i.append(g2.d.f18349r4, 78);
        f1441i.append(g2.d.f18402y3, 80);
        f1441i.append(g2.d.f18394x3, 81);
        f1441i.append(g2.d.f18287k4, 82);
        f1441i.append(g2.d.f18323o4, 83);
        f1441i.append(g2.d.f18314n4, 84);
        f1441i.append(g2.d.f18305m4, 85);
        f1441i.append(g2.d.f18296l4, 86);
        f1441i.append(g2.d.f18242f4, 97);
    }

    public static void A(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0019a c0019a = new a.C0019a();
        aVar.f1453h = c0019a;
        aVar.f1449d.f1509a = false;
        aVar.f1450e.b = false;
        aVar.f1448c.f1522a = false;
        aVar.f1451f.f1527a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1441i.get(index)) {
                case 2:
                    c0019a.b(2, typedArray.getDimensionPixelSize(index, aVar.f1450e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1440h.get(index));
                    break;
                case 5:
                    c0019a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0019a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1450e.E));
                    break;
                case 7:
                    c0019a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1450e.F));
                    break;
                case 8:
                    c0019a.b(8, typedArray.getDimensionPixelSize(index, aVar.f1450e.L));
                    break;
                case 11:
                    c0019a.b(11, typedArray.getDimensionPixelSize(index, aVar.f1450e.R));
                    break;
                case 12:
                    c0019a.b(12, typedArray.getDimensionPixelSize(index, aVar.f1450e.S));
                    break;
                case 13:
                    c0019a.b(13, typedArray.getDimensionPixelSize(index, aVar.f1450e.O));
                    break;
                case 14:
                    c0019a.b(14, typedArray.getDimensionPixelSize(index, aVar.f1450e.Q));
                    break;
                case 15:
                    c0019a.b(15, typedArray.getDimensionPixelSize(index, aVar.f1450e.T));
                    break;
                case 16:
                    c0019a.b(16, typedArray.getDimensionPixelSize(index, aVar.f1450e.P));
                    break;
                case 17:
                    c0019a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1450e.f1475f));
                    break;
                case 18:
                    c0019a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1450e.f1477g));
                    break;
                case 19:
                    c0019a.a(19, typedArray.getFloat(index, aVar.f1450e.f1479h));
                    break;
                case 20:
                    c0019a.a(20, typedArray.getFloat(index, aVar.f1450e.f1506y));
                    break;
                case 21:
                    c0019a.b(21, typedArray.getLayoutDimension(index, aVar.f1450e.f1473e));
                    break;
                case 22:
                    c0019a.b(22, f1439g[typedArray.getInt(index, aVar.f1448c.b)]);
                    break;
                case 23:
                    c0019a.b(23, typedArray.getLayoutDimension(index, aVar.f1450e.f1471d));
                    break;
                case 24:
                    c0019a.b(24, typedArray.getDimensionPixelSize(index, aVar.f1450e.H));
                    break;
                case 27:
                    c0019a.b(27, typedArray.getInt(index, aVar.f1450e.G));
                    break;
                case 28:
                    c0019a.b(28, typedArray.getDimensionPixelSize(index, aVar.f1450e.I));
                    break;
                case 31:
                    c0019a.b(31, typedArray.getDimensionPixelSize(index, aVar.f1450e.M));
                    break;
                case 34:
                    c0019a.b(34, typedArray.getDimensionPixelSize(index, aVar.f1450e.J));
                    break;
                case 37:
                    c0019a.a(37, typedArray.getFloat(index, aVar.f1450e.f1507z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1447a);
                    aVar.f1447a = resourceId;
                    c0019a.b(38, resourceId);
                    break;
                case 39:
                    c0019a.a(39, typedArray.getFloat(index, aVar.f1450e.W));
                    break;
                case 40:
                    c0019a.a(40, typedArray.getFloat(index, aVar.f1450e.V));
                    break;
                case 41:
                    c0019a.b(41, typedArray.getInt(index, aVar.f1450e.X));
                    break;
                case 42:
                    c0019a.b(42, typedArray.getInt(index, aVar.f1450e.Y));
                    break;
                case 43:
                    c0019a.a(43, typedArray.getFloat(index, aVar.f1448c.f1524d));
                    break;
                case 44:
                    c0019a.d(44, true);
                    c0019a.a(44, typedArray.getDimension(index, aVar.f1451f.f1539n));
                    break;
                case 45:
                    c0019a.a(45, typedArray.getFloat(index, aVar.f1451f.f1528c));
                    break;
                case 46:
                    c0019a.a(46, typedArray.getFloat(index, aVar.f1451f.f1529d));
                    break;
                case 47:
                    c0019a.a(47, typedArray.getFloat(index, aVar.f1451f.f1530e));
                    break;
                case 48:
                    c0019a.a(48, typedArray.getFloat(index, aVar.f1451f.f1531f));
                    break;
                case 49:
                    c0019a.a(49, typedArray.getDimension(index, aVar.f1451f.f1532g));
                    break;
                case 50:
                    c0019a.a(50, typedArray.getDimension(index, aVar.f1451f.f1533h));
                    break;
                case 51:
                    c0019a.a(51, typedArray.getDimension(index, aVar.f1451f.f1535j));
                    break;
                case 52:
                    c0019a.a(52, typedArray.getDimension(index, aVar.f1451f.f1536k));
                    break;
                case 53:
                    c0019a.a(53, typedArray.getDimension(index, aVar.f1451f.f1537l));
                    break;
                case 54:
                    c0019a.b(54, typedArray.getInt(index, aVar.f1450e.Z));
                    break;
                case 55:
                    c0019a.b(55, typedArray.getInt(index, aVar.f1450e.f1467a0));
                    break;
                case 56:
                    c0019a.b(56, typedArray.getDimensionPixelSize(index, aVar.f1450e.f1468b0));
                    break;
                case 57:
                    c0019a.b(57, typedArray.getDimensionPixelSize(index, aVar.f1450e.f1470c0));
                    break;
                case 58:
                    c0019a.b(58, typedArray.getDimensionPixelSize(index, aVar.f1450e.f1472d0));
                    break;
                case 59:
                    c0019a.b(59, typedArray.getDimensionPixelSize(index, aVar.f1450e.f1474e0));
                    break;
                case 60:
                    c0019a.a(60, typedArray.getFloat(index, aVar.f1451f.b));
                    break;
                case 62:
                    c0019a.b(62, typedArray.getDimensionPixelSize(index, aVar.f1450e.C));
                    break;
                case 63:
                    c0019a.a(63, typedArray.getFloat(index, aVar.f1450e.D));
                    break;
                case 64:
                    c0019a.b(64, v(typedArray, index, aVar.f1449d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0019a.c(65, typedArray.getString(index));
                    } else {
                        c0019a.c(65, a2.b.f79c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0019a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0019a.a(67, typedArray.getFloat(index, aVar.f1449d.f1516i));
                    break;
                case 68:
                    c0019a.a(68, typedArray.getFloat(index, aVar.f1448c.f1525e));
                    break;
                case 69:
                    c0019a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0019a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0019a.b(72, typedArray.getInt(index, aVar.f1450e.f1480h0));
                    break;
                case 73:
                    c0019a.b(73, typedArray.getDimensionPixelSize(index, aVar.f1450e.f1482i0));
                    break;
                case 74:
                    c0019a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0019a.d(75, typedArray.getBoolean(index, aVar.f1450e.f1496p0));
                    break;
                case 76:
                    c0019a.b(76, typedArray.getInt(index, aVar.f1449d.f1512e));
                    break;
                case 77:
                    c0019a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0019a.b(78, typedArray.getInt(index, aVar.f1448c.f1523c));
                    break;
                case 79:
                    c0019a.a(79, typedArray.getFloat(index, aVar.f1449d.f1514g));
                    break;
                case 80:
                    c0019a.d(80, typedArray.getBoolean(index, aVar.f1450e.f1492n0));
                    break;
                case 81:
                    c0019a.d(81, typedArray.getBoolean(index, aVar.f1450e.f1494o0));
                    break;
                case 82:
                    c0019a.b(82, typedArray.getInteger(index, aVar.f1449d.f1510c));
                    break;
                case 83:
                    c0019a.b(83, v(typedArray, index, aVar.f1451f.f1534i));
                    break;
                case 84:
                    c0019a.b(84, typedArray.getInteger(index, aVar.f1449d.f1518k));
                    break;
                case 85:
                    c0019a.a(85, typedArray.getFloat(index, aVar.f1449d.f1517j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1449d.f1521n = typedArray.getResourceId(index, -1);
                        c0019a.b(89, aVar.f1449d.f1521n);
                        C0020c c0020c = aVar.f1449d;
                        if (c0020c.f1521n != -1) {
                            c0020c.f1520m = -2;
                            c0019a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f1449d.f1519l = typedArray.getString(index);
                        c0019a.c(90, aVar.f1449d.f1519l);
                        if (aVar.f1449d.f1519l.indexOf("/") > 0) {
                            aVar.f1449d.f1521n = typedArray.getResourceId(index, -1);
                            c0019a.b(89, aVar.f1449d.f1521n);
                            aVar.f1449d.f1520m = -2;
                            c0019a.b(88, -2);
                        } else {
                            aVar.f1449d.f1520m = -1;
                            c0019a.b(88, -1);
                        }
                    } else {
                        C0020c c0020c2 = aVar.f1449d;
                        c0020c2.f1520m = typedArray.getInteger(index, c0020c2.f1521n);
                        c0019a.b(88, aVar.f1449d.f1520m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1440h.get(index));
                    break;
                case 93:
                    c0019a.b(93, typedArray.getDimensionPixelSize(index, aVar.f1450e.N));
                    break;
                case 94:
                    c0019a.b(94, typedArray.getDimensionPixelSize(index, aVar.f1450e.U));
                    break;
                case 95:
                    w(c0019a, typedArray, index, 0);
                    break;
                case 96:
                    w(c0019a, typedArray, index, 1);
                    break;
                case 97:
                    c0019a.b(97, typedArray.getInt(index, aVar.f1450e.f1498q0));
                    break;
                case 98:
                    if (j.f16717v0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1447a);
                        aVar.f1447a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.f1447a = typedArray.getResourceId(index, aVar.f1447a);
                    }
                    break;
                case 99:
                    c0019a.d(99, typedArray.getBoolean(index, aVar.f1450e.f1481i));
                    break;
            }
        }
    }

    public static int v(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static void w(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        a.C0019a c0019a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            x(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                    bVar2.f1360a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f1361b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f1471d = i13;
                    bVar.f1492n0 = z10;
                    return;
                } else {
                    bVar.f1473e = i13;
                    bVar.f1494o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0019a) {
                c0019a = (a.C0019a) obj;
                if (i11 == 0) {
                    c0019a.b(23, i13);
                    c0019a.d(80, z10);
                } else {
                    c0019a.b(21, i13);
                    c0019a.d(81, z10);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                bVar2.f1360a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f1361b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f1471d = i13;
                bVar.f1492n0 = z10;
                return;
            } else {
                bVar.f1473e = i13;
                bVar.f1494o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0019a) {
            c0019a = (a.C0019a) obj;
            if (i11 == 0) {
                c0019a.b(23, i13);
                c0019a.d(80, z10);
            } else {
                c0019a.b(21, i13);
                c0019a.d(81, z10);
            }
        }
    }

    public static void x(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    y(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0019a) {
                        ((a.C0019a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f1471d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f1473e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0019a) {
                        a.C0019a c0019a = (a.C0019a) obj;
                        if (i10 == 0) {
                            c0019a.b(23, 0);
                            c0019a.a(39, f10);
                            return;
                        } else {
                            c0019a.b(21, 0);
                            c0019a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f1471d = 0;
                            bVar5.f1476f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1473e = 0;
                            bVar5.f1478g0 = fMax;
                            bVar5.f1467a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0019a) {
                        a.C0019a c0019a2 = (a.C0019a) obj;
                        if (i10 == 0) {
                            c0019a2.b(23, 0);
                            c0019a2.b(54, 2);
                        } else {
                            c0019a2.b(21, 0);
                            c0019a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void y(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    public void B(int i10, float f10) {
        s(i10).f1450e.f1506y = f10;
    }

    public void C(int i10, int i11) {
        s(i10).f1450e.X = i11;
    }

    public void D(int i10, float f10) {
        s(i10).f1450e.W = f10;
    }

    public void E(int i10, int i11, int i12) {
        a aVarS = s(i10);
        switch (i11) {
            case 1:
                aVarS.f1450e.H = i12;
                return;
            case 2:
                aVarS.f1450e.I = i12;
                return;
            case 3:
                aVarS.f1450e.J = i12;
                return;
            case 4:
                aVarS.f1450e.K = i12;
                return;
            case 5:
                aVarS.f1450e.N = i12;
                return;
            case 6:
                aVarS.f1450e.M = i12;
                return;
            case 7:
                aVarS.f1450e.L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F(int i10, float f10) {
        s(i10).f1450e.f1507z = f10;
    }

    public void G(int i10, int i11) {
        s(i10).f1450e.Y = i11;
    }

    public final String H(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1446f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1446f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + f2.a.b(childAt));
            } else {
                if (this.f1445e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f1446f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f1446f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1450e.f1484j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f1450e.f1480h0);
                                barrier.setMargin(aVar.f1450e.f1482i0);
                                barrier.setAllowsGoneWidget(aVar.f1450e.f1496p0);
                                b bVar = aVar.f1450e;
                                int[] iArr = bVar.f1486k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1488l0;
                                    if (str != null) {
                                        bVar.f1486k0 = p(barrier, str);
                                        barrier.setReferencedIds(aVar.f1450e.f1486k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.f1452g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1448c;
                            if (dVar.f1523c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.f1448c.f1524d);
                            childAt.setRotation(aVar.f1451f.b);
                            childAt.setRotationX(aVar.f1451f.f1528c);
                            childAt.setRotationY(aVar.f1451f.f1529d);
                            childAt.setScaleX(aVar.f1451f.f1530e);
                            childAt.setScaleY(aVar.f1451f.f1531f);
                            e eVar = aVar.f1451f;
                            if (eVar.f1534i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f1451f.f1534i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1532g)) {
                                    childAt.setPivotX(aVar.f1451f.f1532g);
                                }
                                if (!Float.isNaN(aVar.f1451f.f1533h)) {
                                    childAt.setPivotY(aVar.f1451f.f1533h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1451f.f1535j);
                            childAt.setTranslationY(aVar.f1451f.f1536k);
                            childAt.setTranslationZ(aVar.f1451f.f1537l);
                            e eVar2 = aVar.f1451f;
                            if (eVar2.f1538m) {
                                childAt.setElevation(eVar2.f1539n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f1446f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1450e.f1484j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1450e;
                    int[] iArr2 = bVar3.f1486k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1488l0;
                        if (str2 != null) {
                            bVar3.f1486k0 = p(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1450e.f1486k0);
                        }
                    }
                    barrier2.setType(aVar2.f1450e.f1480h0);
                    barrier2.setMargin(aVar2.f1450e.f1482i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1450e.f1466a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1446f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1445e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1446f.containsKey(Integer.valueOf(id2))) {
                this.f1446f.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f1446f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f1452g = androidx.constraintlayout.widget.a.a(this.f1444d, childAt);
                aVar.f(id2, bVar);
                aVar.f1448c.b = childAt.getVisibility();
                aVar.f1448c.f1524d = childAt.getAlpha();
                aVar.f1451f.b = childAt.getRotation();
                aVar.f1451f.f1528c = childAt.getRotationX();
                aVar.f1451f.f1529d = childAt.getRotationY();
                aVar.f1451f.f1530e = childAt.getScaleX();
                aVar.f1451f.f1531f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1451f;
                    eVar.f1532g = pivotX;
                    eVar.f1533h = pivotY;
                }
                aVar.f1451f.f1535j = childAt.getTranslationX();
                aVar.f1451f.f1536k = childAt.getTranslationY();
                aVar.f1451f.f1537l = childAt.getTranslationZ();
                e eVar2 = aVar.f1451f;
                if (eVar2.f1538m) {
                    eVar2.f1539n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1450e.f1496p0 = barrier.getAllowsGoneWidget();
                    aVar.f1450e.f1486k0 = barrier.getReferencedIds();
                    aVar.f1450e.f1480h0 = barrier.getType();
                    aVar.f1450e.f1482i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.f1446f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            androidx.constraintlayout.widget.d.a aVar = (androidx.constraintlayout.widget.d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1445e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1446f.containsKey(Integer.valueOf(id2))) {
                this.f1446f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f1446f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (!this.f1446f.containsKey(Integer.valueOf(i10))) {
            this.f1446f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1446f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1450e;
                    bVar.f1483j = i12;
                    bVar.f1485k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f1450e;
                    bVar2.f1485k = i12;
                    bVar2.f1483j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + H(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1450e;
                    bVar3.f1487l = i12;
                    bVar3.f1489m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f1450e;
                    bVar4.f1489m = i12;
                    bVar4.f1487l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1450e;
                    bVar5.f1491n = i12;
                    bVar5.f1493o = -1;
                    bVar5.f1499r = -1;
                    bVar5.f1500s = -1;
                    bVar5.f1501t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar6 = aVar.f1450e;
                bVar6.f1493o = i12;
                bVar6.f1491n = -1;
                bVar6.f1499r = -1;
                bVar6.f1500s = -1;
                bVar6.f1501t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1450e;
                    bVar7.f1497q = i12;
                    bVar7.f1495p = -1;
                    bVar7.f1499r = -1;
                    bVar7.f1500s = -1;
                    bVar7.f1501t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar8 = aVar.f1450e;
                bVar8.f1495p = i12;
                bVar8.f1497q = -1;
                bVar8.f1499r = -1;
                bVar8.f1500s = -1;
                bVar8.f1501t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1450e;
                    bVar9.f1499r = i12;
                    bVar9.f1497q = -1;
                    bVar9.f1495p = -1;
                    bVar9.f1491n = -1;
                    bVar9.f1493o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1450e;
                    bVar10.f1500s = i12;
                    bVar10.f1497q = -1;
                    bVar10.f1495p = -1;
                    bVar10.f1491n = -1;
                    bVar10.f1493o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1450e;
                bVar11.f1501t = i12;
                bVar11.f1497q = -1;
                bVar11.f1495p = -1;
                bVar11.f1491n = -1;
                bVar11.f1493o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1450e;
                    bVar12.f1503v = i12;
                    bVar12.f1502u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f1450e;
                    bVar13.f1502u = i12;
                    bVar13.f1503v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1450e;
                    bVar14.f1505x = i12;
                    bVar14.f1504w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f1450e;
                    bVar15.f1504w = i12;
                    bVar15.f1505x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f1446f.containsKey(Integer.valueOf(i10))) {
            this.f1446f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1446f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1450e;
                    bVar.f1483j = i12;
                    bVar.f1485k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + H(i13) + " undefined");
                    }
                    b bVar2 = aVar.f1450e;
                    bVar2.f1485k = i12;
                    bVar2.f1483j = -1;
                }
                aVar.f1450e.H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1450e;
                    bVar3.f1487l = i12;
                    bVar3.f1489m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar4 = aVar.f1450e;
                    bVar4.f1489m = i12;
                    bVar4.f1487l = -1;
                }
                aVar.f1450e.I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1450e;
                    bVar5.f1491n = i12;
                    bVar5.f1493o = -1;
                    bVar5.f1499r = -1;
                    bVar5.f1500s = -1;
                    bVar5.f1501t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar6 = aVar.f1450e;
                    bVar6.f1493o = i12;
                    bVar6.f1491n = -1;
                    bVar6.f1499r = -1;
                    bVar6.f1500s = -1;
                    bVar6.f1501t = -1;
                }
                aVar.f1450e.J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1450e;
                    bVar7.f1497q = i12;
                    bVar7.f1495p = -1;
                    bVar7.f1499r = -1;
                    bVar7.f1500s = -1;
                    bVar7.f1501t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar8 = aVar.f1450e;
                    bVar8.f1495p = i12;
                    bVar8.f1497q = -1;
                    bVar8.f1499r = -1;
                    bVar8.f1500s = -1;
                    bVar8.f1501t = -1;
                }
                aVar.f1450e.K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1450e;
                    bVar9.f1499r = i12;
                    bVar9.f1497q = -1;
                    bVar9.f1495p = -1;
                    bVar9.f1491n = -1;
                    bVar9.f1493o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1450e;
                    bVar10.f1500s = i12;
                    bVar10.f1497q = -1;
                    bVar10.f1495p = -1;
                    bVar10.f1491n = -1;
                    bVar10.f1493o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1450e;
                bVar11.f1501t = i12;
                bVar11.f1497q = -1;
                bVar11.f1495p = -1;
                bVar11.f1491n = -1;
                bVar11.f1493o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1450e;
                    bVar12.f1503v = i12;
                    bVar12.f1502u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar13 = aVar.f1450e;
                    bVar13.f1502u = i12;
                    bVar13.f1503v = -1;
                }
                aVar.f1450e.M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1450e;
                    bVar14.f1505x = i12;
                    bVar14.f1504w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar15 = aVar.f1450e;
                    bVar15.f1504w = i12;
                    bVar15.f1505x = -1;
                }
                aVar.f1450e.L = i14;
                return;
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = s(i10).f1450e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void k(int i10, int i11) {
        s(i10).f1450e.Z = i11;
    }

    public void l(int i10, int i11) {
        s(i10).f1450e.f1473e = i11;
    }

    public void m(int i10, int i11) {
        s(i10).f1450e.f1471d = i11;
    }

    public void n(int i10, boolean z10) {
        s(i10).f1450e.f1494o0 = z10;
    }

    public void o(int i10, boolean z10) {
        s(i10).f1450e.f1492n0 = z10;
    }

    public final int[] p(View view, String str) {
        int iIntValue;
        Object objL;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = g2.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objL = ((ConstraintLayout) view.getParent()).l(0, strTrim)) != null && (objL instanceof Integer)) {
                iIntValue = ((Integer) objL).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public void q(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            s(iArr[0]).f1450e.V = fArr[0];
        }
        s(iArr[0]).f1450e.Y = i14;
        i(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            i(iArr[i15], 3, iArr[i16], 4, 0);
            i(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                s(iArr[i15]).f1450e.V = fArr[i15];
            }
        }
        i(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public final a r(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g2.d.S2 : g2.d.b);
        z(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a s(int i10) {
        if (!this.f1446f.containsKey(Integer.valueOf(i10))) {
            this.f1446f.put(Integer.valueOf(i10), new a());
        }
        return this.f1446f.get(Integer.valueOf(i10));
    }

    public void t(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarR = r(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarR.f1450e.f1466a = true;
                    }
                    this.f1446f.put(Integer.valueOf(aVarR.f1447a), aVarR);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void u(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarR = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1450e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1449d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1448c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1451f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarR.f1450e;
                                bVar.f1466a = true;
                                bVar.b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarR.f1450e.f1484j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarR == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.d(context, xmlPullParser, aVarR.f1452g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f1446f.put(Integer.valueOf(aVarR.f1447a), aVarR);
                    aVarR = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }

    public final void z(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            A(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != g2.d.f18219d && g2.d.f18376v != index && g2.d.f18383w != index) {
                aVar.f1449d.f1509a = true;
                aVar.f1450e.b = true;
                aVar.f1448c.f1522a = true;
                aVar.f1451f.f1527a = true;
            }
            switch (f1440h.get(index)) {
                case 1:
                    b bVar = aVar.f1450e;
                    bVar.f1499r = v(typedArray, index, bVar.f1499r);
                    break;
                case 2:
                    b bVar2 = aVar.f1450e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1450e;
                    bVar3.f1497q = v(typedArray, index, bVar3.f1497q);
                    break;
                case 4:
                    b bVar4 = aVar.f1450e;
                    bVar4.f1495p = v(typedArray, index, bVar4.f1495p);
                    break;
                case 5:
                    aVar.f1450e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1450e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1450e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f1450e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f1450e;
                    bVar8.f1505x = v(typedArray, index, bVar8.f1505x);
                    break;
                case 10:
                    b bVar9 = aVar.f1450e;
                    bVar9.f1504w = v(typedArray, index, bVar9.f1504w);
                    break;
                case 11:
                    b bVar10 = aVar.f1450e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1450e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1450e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1450e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1450e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1450e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1450e;
                    bVar16.f1475f = typedArray.getDimensionPixelOffset(index, bVar16.f1475f);
                    break;
                case 18:
                    b bVar17 = aVar.f1450e;
                    bVar17.f1477g = typedArray.getDimensionPixelOffset(index, bVar17.f1477g);
                    break;
                case 19:
                    b bVar18 = aVar.f1450e;
                    bVar18.f1479h = typedArray.getFloat(index, bVar18.f1479h);
                    break;
                case 20:
                    b bVar19 = aVar.f1450e;
                    bVar19.f1506y = typedArray.getFloat(index, bVar19.f1506y);
                    break;
                case 21:
                    b bVar20 = aVar.f1450e;
                    bVar20.f1473e = typedArray.getLayoutDimension(index, bVar20.f1473e);
                    break;
                case 22:
                    d dVar = aVar.f1448c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.f1448c;
                    dVar2.b = f1439g[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.f1450e;
                    bVar21.f1471d = typedArray.getLayoutDimension(index, bVar21.f1471d);
                    break;
                case 24:
                    b bVar22 = aVar.f1450e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1450e;
                    bVar23.f1483j = v(typedArray, index, bVar23.f1483j);
                    break;
                case 26:
                    b bVar24 = aVar.f1450e;
                    bVar24.f1485k = v(typedArray, index, bVar24.f1485k);
                    break;
                case 27:
                    b bVar25 = aVar.f1450e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1450e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1450e;
                    bVar27.f1487l = v(typedArray, index, bVar27.f1487l);
                    break;
                case 30:
                    b bVar28 = aVar.f1450e;
                    bVar28.f1489m = v(typedArray, index, bVar28.f1489m);
                    break;
                case 31:
                    b bVar29 = aVar.f1450e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f1450e;
                    bVar30.f1502u = v(typedArray, index, bVar30.f1502u);
                    break;
                case 33:
                    b bVar31 = aVar.f1450e;
                    bVar31.f1503v = v(typedArray, index, bVar31.f1503v);
                    break;
                case 34:
                    b bVar32 = aVar.f1450e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f1450e;
                    bVar33.f1493o = v(typedArray, index, bVar33.f1493o);
                    break;
                case 36:
                    b bVar34 = aVar.f1450e;
                    bVar34.f1491n = v(typedArray, index, bVar34.f1491n);
                    break;
                case 37:
                    b bVar35 = aVar.f1450e;
                    bVar35.f1507z = typedArray.getFloat(index, bVar35.f1507z);
                    break;
                case 38:
                    aVar.f1447a = typedArray.getResourceId(index, aVar.f1447a);
                    break;
                case 39:
                    b bVar36 = aVar.f1450e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f1450e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f1450e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f1450e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f1448c;
                    dVar3.f1524d = typedArray.getFloat(index, dVar3.f1524d);
                    break;
                case 44:
                    e eVar = aVar.f1451f;
                    eVar.f1538m = true;
                    eVar.f1539n = typedArray.getDimension(index, eVar.f1539n);
                    break;
                case 45:
                    e eVar2 = aVar.f1451f;
                    eVar2.f1528c = typedArray.getFloat(index, eVar2.f1528c);
                    break;
                case 46:
                    e eVar3 = aVar.f1451f;
                    eVar3.f1529d = typedArray.getFloat(index, eVar3.f1529d);
                    break;
                case 47:
                    e eVar4 = aVar.f1451f;
                    eVar4.f1530e = typedArray.getFloat(index, eVar4.f1530e);
                    break;
                case 48:
                    e eVar5 = aVar.f1451f;
                    eVar5.f1531f = typedArray.getFloat(index, eVar5.f1531f);
                    break;
                case 49:
                    e eVar6 = aVar.f1451f;
                    eVar6.f1532g = typedArray.getDimension(index, eVar6.f1532g);
                    break;
                case 50:
                    e eVar7 = aVar.f1451f;
                    eVar7.f1533h = typedArray.getDimension(index, eVar7.f1533h);
                    break;
                case 51:
                    e eVar8 = aVar.f1451f;
                    eVar8.f1535j = typedArray.getDimension(index, eVar8.f1535j);
                    break;
                case 52:
                    e eVar9 = aVar.f1451f;
                    eVar9.f1536k = typedArray.getDimension(index, eVar9.f1536k);
                    break;
                case 53:
                    e eVar10 = aVar.f1451f;
                    eVar10.f1537l = typedArray.getDimension(index, eVar10.f1537l);
                    break;
                case 54:
                    b bVar40 = aVar.f1450e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1450e;
                    bVar41.f1467a0 = typedArray.getInt(index, bVar41.f1467a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1450e;
                    bVar42.f1468b0 = typedArray.getDimensionPixelSize(index, bVar42.f1468b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1450e;
                    bVar43.f1470c0 = typedArray.getDimensionPixelSize(index, bVar43.f1470c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1450e;
                    bVar44.f1472d0 = typedArray.getDimensionPixelSize(index, bVar44.f1472d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1450e;
                    bVar45.f1474e0 = typedArray.getDimensionPixelSize(index, bVar45.f1474e0);
                    break;
                case 60:
                    e eVar11 = aVar.f1451f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.f1450e;
                    bVar46.B = v(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1450e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1450e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0020c c0020c = aVar.f1449d;
                    c0020c.b = v(typedArray, index, c0020c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1449d.f1511d = typedArray.getString(index);
                    } else {
                        aVar.f1449d.f1511d = a2.b.f79c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f1449d.f1513f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0020c c0020c2 = aVar.f1449d;
                    c0020c2.f1516i = typedArray.getFloat(index, c0020c2.f1516i);
                    break;
                case 68:
                    d dVar4 = aVar.f1448c;
                    dVar4.f1525e = typedArray.getFloat(index, dVar4.f1525e);
                    break;
                case 69:
                    aVar.f1450e.f1476f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1450e.f1478g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1450e;
                    bVar49.f1480h0 = typedArray.getInt(index, bVar49.f1480h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1450e;
                    bVar50.f1482i0 = typedArray.getDimensionPixelSize(index, bVar50.f1482i0);
                    break;
                case 74:
                    aVar.f1450e.f1488l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1450e;
                    bVar51.f1496p0 = typedArray.getBoolean(index, bVar51.f1496p0);
                    break;
                case 76:
                    C0020c c0020c3 = aVar.f1449d;
                    c0020c3.f1512e = typedArray.getInt(index, c0020c3.f1512e);
                    break;
                case 77:
                    aVar.f1450e.f1490m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1448c;
                    dVar5.f1523c = typedArray.getInt(index, dVar5.f1523c);
                    break;
                case 79:
                    C0020c c0020c4 = aVar.f1449d;
                    c0020c4.f1514g = typedArray.getFloat(index, c0020c4.f1514g);
                    break;
                case 80:
                    b bVar52 = aVar.f1450e;
                    bVar52.f1492n0 = typedArray.getBoolean(index, bVar52.f1492n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1450e;
                    bVar53.f1494o0 = typedArray.getBoolean(index, bVar53.f1494o0);
                    break;
                case 82:
                    C0020c c0020c5 = aVar.f1449d;
                    c0020c5.f1510c = typedArray.getInteger(index, c0020c5.f1510c);
                    break;
                case 83:
                    e eVar12 = aVar.f1451f;
                    eVar12.f1534i = v(typedArray, index, eVar12.f1534i);
                    break;
                case 84:
                    C0020c c0020c6 = aVar.f1449d;
                    c0020c6.f1518k = typedArray.getInteger(index, c0020c6.f1518k);
                    break;
                case 85:
                    C0020c c0020c7 = aVar.f1449d;
                    c0020c7.f1517j = typedArray.getFloat(index, c0020c7.f1517j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1449d.f1521n = typedArray.getResourceId(index, -1);
                        C0020c c0020c8 = aVar.f1449d;
                        if (c0020c8.f1521n != -1) {
                            c0020c8.f1520m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f1449d.f1519l = typedArray.getString(index);
                        if (aVar.f1449d.f1519l.indexOf("/") > 0) {
                            aVar.f1449d.f1521n = typedArray.getResourceId(index, -1);
                            aVar.f1449d.f1520m = -2;
                        } else {
                            aVar.f1449d.f1520m = -1;
                        }
                    } else {
                        C0020c c0020c9 = aVar.f1449d;
                        c0020c9.f1520m = typedArray.getInteger(index, c0020c9.f1521n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1440h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1440h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1450e;
                    bVar54.f1500s = v(typedArray, index, bVar54.f1500s);
                    break;
                case 92:
                    b bVar55 = aVar.f1450e;
                    bVar55.f1501t = v(typedArray, index, bVar55.f1501t);
                    break;
                case 93:
                    b bVar56 = aVar.f1450e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1450e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    w(aVar.f1450e, typedArray, index, 0);
                    break;
                case 96:
                    w(aVar.f1450e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1450e;
                    bVar58.f1498q0 = typedArray.getInt(index, bVar58.f1498q0);
                    break;
            }
        }
        b bVar59 = aVar.f1450e;
        if (bVar59.f1488l0 != null) {
            bVar59.f1486k0 = null;
        }
    }
}

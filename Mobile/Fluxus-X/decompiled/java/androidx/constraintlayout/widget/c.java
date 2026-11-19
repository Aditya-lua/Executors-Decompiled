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
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
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
    public static final int[] f1401g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SparseIntArray f1402h = new SparseIntArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SparseIntArray f1403i = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1404a = BuildConfig.FLAVOR;
    public String[] b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1405c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f1406d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1407e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<Integer, a> f1408f = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1409a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f1410c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0032c f1411d = new C0032c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1412e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f1413f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f1414g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0031a f1415h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0031a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f1416a = new int[10];
            public int[] b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f1417c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f1418d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f1419e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f1420f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f1421g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f1422h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f1423i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f1424j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f1425k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f1426l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1420f;
                int[] iArr = this.f1418d;
                if (i11 >= iArr.length) {
                    this.f1418d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1419e;
                    this.f1419e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1418d;
                int i12 = this.f1420f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1419e;
                this.f1420f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1417c;
                int[] iArr = this.f1416a;
                if (i12 >= iArr.length) {
                    this.f1416a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1416a;
                int i13 = this.f1417c;
                iArr3[i13] = i10;
                int[] iArr4 = this.b;
                this.f1417c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1423i;
                int[] iArr = this.f1421g;
                if (i11 >= iArr.length) {
                    this.f1421g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1422h;
                    this.f1422h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1421g;
                int i12 = this.f1423i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1422h;
                this.f1423i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1426l;
                int[] iArr = this.f1424j;
                if (i11 >= iArr.length) {
                    this.f1424j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1425k;
                    this.f1425k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1424j;
                int i12 = this.f1426l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1425k;
                this.f1426l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1412e;
            bVar.f1328e = bVar2.f1445j;
            bVar.f1330f = bVar2.f1447k;
            bVar.f1332g = bVar2.f1449l;
            bVar.f1334h = bVar2.f1451m;
            bVar.f1336i = bVar2.f1453n;
            bVar.f1338j = bVar2.f1455o;
            bVar.f1340k = bVar2.f1457p;
            bVar.f1342l = bVar2.f1459q;
            bVar.f1344m = bVar2.f1461r;
            bVar.f1346n = bVar2.f1462s;
            bVar.f1348o = bVar2.f1463t;
            bVar.f1356s = bVar2.f1464u;
            bVar.f1358t = bVar2.f1465v;
            bVar.f1360u = bVar2.f1466w;
            bVar.f1362v = bVar2.f1467x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1366x = bVar2.P;
            bVar.f1368z = bVar2.R;
            bVar.G = bVar2.f1468y;
            bVar.H = bVar2.f1469z;
            bVar.f1350p = bVar2.B;
            bVar.f1352q = bVar2.C;
            bVar.f1354r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1322a0 = bVar2.f1454n0;
            bVar.f1323b0 = bVar2.f1456o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1429a0;
            bVar.T = bVar2.f1430b0;
            bVar.U = bVar2.f1432c0;
            bVar.R = bVar2.f1434d0;
            bVar.S = bVar2.f1436e0;
            bVar.V = bVar2.f1438f0;
            bVar.W = bVar2.f1440g0;
            bVar.Z = bVar2.G;
            bVar.f1324c = bVar2.f1441h;
            bVar.f1321a = bVar2.f1437f;
            bVar.b = bVar2.f1439g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1433d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1435e;
            String str = bVar2.f1452m0;
            if (str != null) {
                bVar.f1325c0 = str;
            }
            bVar.f1327d0 = bVar2.f1460q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1412e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1412e.a(this.f1412e);
            aVar.f1411d.a(this.f1411d);
            aVar.f1410c.a(this.f1410c);
            aVar.f1413f.a(this.f1413f);
            aVar.f1409a = this.f1409a;
            aVar.f1415h = this.f1415h;
            return aVar;
        }

        public final void f(int i10, ConstraintLayout.b bVar) {
            this.f1409a = i10;
            b bVar2 = this.f1412e;
            bVar2.f1445j = bVar.f1328e;
            bVar2.f1447k = bVar.f1330f;
            bVar2.f1449l = bVar.f1332g;
            bVar2.f1451m = bVar.f1334h;
            bVar2.f1453n = bVar.f1336i;
            bVar2.f1455o = bVar.f1338j;
            bVar2.f1457p = bVar.f1340k;
            bVar2.f1459q = bVar.f1342l;
            bVar2.f1461r = bVar.f1344m;
            bVar2.f1462s = bVar.f1346n;
            bVar2.f1463t = bVar.f1348o;
            bVar2.f1464u = bVar.f1356s;
            bVar2.f1465v = bVar.f1358t;
            bVar2.f1466w = bVar.f1360u;
            bVar2.f1467x = bVar.f1362v;
            bVar2.f1468y = bVar.G;
            bVar2.f1469z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1350p;
            bVar2.C = bVar.f1352q;
            bVar2.D = bVar.f1354r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1441h = bVar.f1324c;
            bVar2.f1437f = bVar.f1321a;
            bVar2.f1439g = bVar.b;
            bVar2.f1433d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1435e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1454n0 = bVar.f1322a0;
            bVar2.f1456o0 = bVar.f1323b0;
            bVar2.Z = bVar.P;
            bVar2.f1429a0 = bVar.Q;
            bVar2.f1430b0 = bVar.T;
            bVar2.f1432c0 = bVar.U;
            bVar2.f1434d0 = bVar.R;
            bVar2.f1436e0 = bVar.S;
            bVar2.f1438f0 = bVar.V;
            bVar2.f1440g0 = bVar.W;
            bVar2.f1452m0 = bVar.f1325c0;
            bVar2.P = bVar.f1366x;
            bVar2.R = bVar.f1368z;
            bVar2.O = bVar.f1364w;
            bVar2.Q = bVar.f1367y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1460q0 = bVar.f1327d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1412e.M = bVar.getMarginStart();
        }

        public final void g(int i10, androidx.constraintlayout.widget.d.a aVar) {
            f(i10, aVar);
            this.f1410c.f1486d = aVar.f1503x0;
            e eVar = this.f1413f;
            eVar.b = aVar.A0;
            eVar.f1490c = aVar.B0;
            eVar.f1491d = aVar.C0;
            eVar.f1492e = aVar.D0;
            eVar.f1493f = aVar.E0;
            eVar.f1494g = aVar.F0;
            eVar.f1495h = aVar.G0;
            eVar.f1497j = aVar.H0;
            eVar.f1498k = aVar.I0;
            eVar.f1499l = aVar.J0;
            eVar.f1501n = aVar.f1505z0;
            eVar.f1500m = aVar.f1504y0;
        }

        public final void h(androidx.constraintlayout.widget.b bVar, int i10, androidx.constraintlayout.widget.d.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f1412e;
                bVar2.f1446j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1442h0 = barrier.getType();
                this.f1412e.f1448k0 = barrier.getReferencedIds();
                this.f1412e.f1444i0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static SparseIntArray f1427r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1435e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f1448k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f1450l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f1452m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1428a = false;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1431c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1437f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1439g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1441h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1443i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1445j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1447k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1449l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1451m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1453n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1455o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1457p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1459q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1461r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1462s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1463t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1464u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1465v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1466w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1467x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f1468y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f1469z = 0.5f;
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
        public int f1429a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f1430b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f1432c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1434d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f1436e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f1438f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f1440g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f1442h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1444i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f1446j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f1454n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f1456o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f1458p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1460q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1427r0 = sparseIntArray;
            sparseIntArray.append(g2.d.O5, 24);
            f1427r0.append(g2.d.P5, 25);
            f1427r0.append(g2.d.R5, 28);
            f1427r0.append(g2.d.S5, 29);
            f1427r0.append(g2.d.X5, 35);
            f1427r0.append(g2.d.W5, 34);
            f1427r0.append(g2.d.x5, 4);
            f1427r0.append(g2.d.w5, 3);
            f1427r0.append(g2.d.f17232u5, 1);
            f1427r0.append(g2.d.f17102f6, 6);
            f1427r0.append(g2.d.f17111g6, 7);
            f1427r0.append(g2.d.E5, 17);
            f1427r0.append(g2.d.F5, 18);
            f1427r0.append(g2.d.G5, 19);
            f1427r0.append(g2.d.f17200q5, 90);
            f1427r0.append(g2.d.f17074c5, 26);
            f1427r0.append(g2.d.T5, 31);
            f1427r0.append(g2.d.U5, 32);
            f1427r0.append(g2.d.D5, 10);
            f1427r0.append(g2.d.C5, 9);
            f1427r0.append(g2.d.f17138j6, 13);
            f1427r0.append(g2.d.f17165m6, 16);
            f1427r0.append(g2.d.f17147k6, 14);
            f1427r0.append(g2.d.f17120h6, 11);
            f1427r0.append(g2.d.f17156l6, 15);
            f1427r0.append(g2.d.f17129i6, 12);
            f1427r0.append(g2.d.f17058a6, 38);
            f1427r0.append(g2.d.M5, 37);
            f1427r0.append(g2.d.L5, 39);
            f1427r0.append(g2.d.Z5, 40);
            f1427r0.append(g2.d.K5, 20);
            f1427r0.append(g2.d.Y5, 36);
            f1427r0.append(g2.d.B5, 5);
            f1427r0.append(g2.d.N5, 91);
            f1427r0.append(g2.d.V5, 91);
            f1427r0.append(g2.d.Q5, 91);
            f1427r0.append(g2.d.f17240v5, 91);
            f1427r0.append(g2.d.f17224t5, 91);
            f1427r0.append(g2.d.f17101f5, 23);
            f1427r0.append(g2.d.f17119h5, 27);
            f1427r0.append(g2.d.f17137j5, 30);
            f1427r0.append(g2.d.f17146k5, 8);
            f1427r0.append(g2.d.f17110g5, 33);
            f1427r0.append(g2.d.f17128i5, 2);
            f1427r0.append(g2.d.f17083d5, 22);
            f1427r0.append(g2.d.f17092e5, 21);
            f1427r0.append(g2.d.f17066b6, 41);
            f1427r0.append(g2.d.H5, 42);
            f1427r0.append(g2.d.f17216s5, 87);
            f1427r0.append(g2.d.f17208r5, 88);
            f1427r0.append(g2.d.f17174n6, 76);
            f1427r0.append(g2.d.f17262y5, 61);
            f1427r0.append(g2.d.A5, 62);
            f1427r0.append(g2.d.f17270z5, 63);
            f1427r0.append(g2.d.f17093e6, 69);
            f1427r0.append(g2.d.J5, 70);
            f1427r0.append(g2.d.f17182o5, 71);
            f1427r0.append(g2.d.f17164m5, 72);
            f1427r0.append(g2.d.f17173n5, 73);
            f1427r0.append(g2.d.f17191p5, 74);
            f1427r0.append(g2.d.f17155l5, 75);
            f1427r0.append(g2.d.f17075c6, 84);
            f1427r0.append(g2.d.f17084d6, 86);
            f1427r0.append(g2.d.f17075c6, 83);
            f1427r0.append(g2.d.I5, 85);
            f1427r0.append(g2.d.f17066b6, 87);
            f1427r0.append(g2.d.H5, 88);
            f1427r0.append(g2.d.f17213s2, 89);
            f1427r0.append(g2.d.f17200q5, 90);
        }

        public void a(b bVar) {
            this.f1428a = bVar.f1428a;
            this.f1433d = bVar.f1433d;
            this.b = bVar.b;
            this.f1435e = bVar.f1435e;
            this.f1437f = bVar.f1437f;
            this.f1439g = bVar.f1439g;
            this.f1441h = bVar.f1441h;
            this.f1443i = bVar.f1443i;
            this.f1445j = bVar.f1445j;
            this.f1447k = bVar.f1447k;
            this.f1449l = bVar.f1449l;
            this.f1451m = bVar.f1451m;
            this.f1453n = bVar.f1453n;
            this.f1455o = bVar.f1455o;
            this.f1457p = bVar.f1457p;
            this.f1459q = bVar.f1459q;
            this.f1461r = bVar.f1461r;
            this.f1462s = bVar.f1462s;
            this.f1463t = bVar.f1463t;
            this.f1464u = bVar.f1464u;
            this.f1465v = bVar.f1465v;
            this.f1466w = bVar.f1466w;
            this.f1467x = bVar.f1467x;
            this.f1468y = bVar.f1468y;
            this.f1469z = bVar.f1469z;
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
            this.f1429a0 = bVar.f1429a0;
            this.f1430b0 = bVar.f1430b0;
            this.f1432c0 = bVar.f1432c0;
            this.f1434d0 = bVar.f1434d0;
            this.f1436e0 = bVar.f1436e0;
            this.f1438f0 = bVar.f1438f0;
            this.f1440g0 = bVar.f1440g0;
            this.f1442h0 = bVar.f1442h0;
            this.f1444i0 = bVar.f1444i0;
            this.f1446j0 = bVar.f1446j0;
            this.f1452m0 = bVar.f1452m0;
            int[] iArr = bVar.f1448k0;
            if (iArr == null || bVar.f1450l0 != null) {
                this.f1448k0 = null;
            } else {
                this.f1448k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1450l0 = bVar.f1450l0;
            this.f1454n0 = bVar.f1454n0;
            this.f1456o0 = bVar.f1456o0;
            this.f1458p0 = bVar.f1458p0;
            this.f1460q0 = bVar.f1460q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f17065b5);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1427r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1461r = c.v(typedArrayObtainStyledAttributes, index, this.f1461r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1459q = c.v(typedArrayObtainStyledAttributes, index, this.f1459q);
                        break;
                    case 4:
                        this.f1457p = c.v(typedArrayObtainStyledAttributes, index, this.f1457p);
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
                        this.f1467x = c.v(typedArrayObtainStyledAttributes, index, this.f1467x);
                        break;
                    case 10:
                        this.f1466w = c.v(typedArrayObtainStyledAttributes, index, this.f1466w);
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
                        this.f1437f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1437f);
                        break;
                    case MlKitException.UNSUPPORTED /* 18 */:
                        this.f1439g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1439g);
                        break;
                    case 19:
                        this.f1441h = typedArrayObtainStyledAttributes.getFloat(index, this.f1441h);
                        break;
                    case 20:
                        this.f1468y = typedArrayObtainStyledAttributes.getFloat(index, this.f1468y);
                        break;
                    case 21:
                        this.f1435e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1435e);
                        break;
                    case 22:
                        this.f1433d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1433d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1445j = c.v(typedArrayObtainStyledAttributes, index, this.f1445j);
                        break;
                    case 25:
                        this.f1447k = c.v(typedArrayObtainStyledAttributes, index, this.f1447k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1449l = c.v(typedArrayObtainStyledAttributes, index, this.f1449l);
                        break;
                    case 29:
                        this.f1451m = c.v(typedArrayObtainStyledAttributes, index, this.f1451m);
                        break;
                    case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1464u = c.v(typedArrayObtainStyledAttributes, index, this.f1464u);
                        break;
                    case Barcode.FORMAT_EAN_13 /* 32 */:
                        this.f1465v = c.v(typedArrayObtainStyledAttributes, index, this.f1465v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1455o = c.v(typedArrayObtainStyledAttributes, index, this.f1455o);
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        this.f1453n = c.v(typedArrayObtainStyledAttributes, index, this.f1453n);
                        break;
                    case 36:
                        this.f1469z = typedArrayObtainStyledAttributes.getFloat(index, this.f1469z);
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
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
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
                                        this.f1438f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1440g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1442h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1442h0);
                                        break;
                                    case 73:
                                        this.f1444i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1444i0);
                                        break;
                                    case 74:
                                        this.f1450l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1458p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1458p0);
                                        break;
                                    case 76:
                                        this.f1460q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1460q0);
                                        break;
                                    case 77:
                                        this.f1462s = c.v(typedArrayObtainStyledAttributes, index, this.f1462s);
                                        break;
                                    case 78:
                                        this.f1463t = c.v(typedArrayObtainStyledAttributes, index, this.f1463t);
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
                                        this.f1429a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1429a0);
                                        break;
                                    case 83:
                                        this.f1432c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1432c0);
                                        break;
                                    case 84:
                                        this.f1430b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1430b0);
                                        break;
                                    case 85:
                                        this.f1436e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1436e0);
                                        break;
                                    case 86:
                                        this.f1434d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1434d0);
                                        break;
                                    case 87:
                                        this.f1454n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1454n0);
                                        break;
                                    case 88:
                                        this.f1456o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1456o0);
                                        break;
                                    case 89:
                                        this.f1452m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1443i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1443i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1427r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1427r0.get(index));
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
    public static class C0032c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1470o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1471a = false;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1472c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1473d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1474e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1475f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1476g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1477h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1478i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1479j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1480k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1481l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1482m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1483n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1470o = sparseIntArray;
            sparseIntArray.append(g2.d.f17225t6, 1);
            f1470o.append(g2.d.f17241v6, 2);
            f1470o.append(g2.d.f17271z6, 3);
            f1470o.append(g2.d.f17217s6, 4);
            f1470o.append(g2.d.f17209r6, 5);
            f1470o.append(g2.d.f17201q6, 6);
            f1470o.append(g2.d.f17233u6, 7);
            f1470o.append(g2.d.f17263y6, 8);
            f1470o.append(g2.d.f17255x6, 9);
            f1470o.append(g2.d.f17248w6, 10);
        }

        public void a(C0032c c0032c) {
            this.f1471a = c0032c.f1471a;
            this.b = c0032c.b;
            this.f1473d = c0032c.f1473d;
            this.f1474e = c0032c.f1474e;
            this.f1475f = c0032c.f1475f;
            this.f1478i = c0032c.f1478i;
            this.f1476g = c0032c.f1476g;
            this.f1477h = c0032c.f1477h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f17192p6);
            this.f1471a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1470o.get(index)) {
                    case 1:
                        this.f1478i = typedArrayObtainStyledAttributes.getFloat(index, this.f1478i);
                        break;
                    case 2:
                        this.f1474e = typedArrayObtainStyledAttributes.getInt(index, this.f1474e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1473d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f1473d = a2.b.f79c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f1475f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.v(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f1472c = typedArrayObtainStyledAttributes.getInteger(index, this.f1472c);
                        break;
                    case 7:
                        this.f1476g = typedArrayObtainStyledAttributes.getFloat(index, this.f1476g);
                        break;
                    case 8:
                        this.f1480k = typedArrayObtainStyledAttributes.getInteger(index, this.f1480k);
                        break;
                    case 9:
                        this.f1479j = typedArrayObtainStyledAttributes.getFloat(index, this.f1479j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1483n = resourceId;
                            if (resourceId != -1) {
                                this.f1482m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1481l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1483n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1482m = -2;
                            } else {
                                this.f1482m = -1;
                            }
                        } else {
                            this.f1482m = typedArrayObtainStyledAttributes.getInteger(index, this.f1483n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1484a = false;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1485c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1486d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1487e = Float.NaN;

        public void a(d dVar) {
            this.f1484a = dVar.f1484a;
            this.b = dVar.b;
            this.f1486d = dVar.f1486d;
            this.f1487e = dVar.f1487e;
            this.f1485c = dVar.f1485c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.K6);
            this.f1484a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g2.d.M6) {
                    this.f1486d = typedArrayObtainStyledAttributes.getFloat(index, this.f1486d);
                } else if (index == g2.d.L6) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = c.f1401g[this.b];
                } else if (index == g2.d.O6) {
                    this.f1485c = typedArrayObtainStyledAttributes.getInt(index, this.f1485c);
                } else if (index == g2.d.N6) {
                    this.f1487e = typedArrayObtainStyledAttributes.getFloat(index, this.f1487e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1488o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1489a = false;
        public float b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1490c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1491d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1492e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1493f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1494g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1495h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1496i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1497j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1498k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1499l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1500m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1501n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1488o = sparseIntArray;
            sparseIntArray.append(g2.d.f17067b7, 1);
            f1488o.append(g2.d.f17076c7, 2);
            f1488o.append(g2.d.f17085d7, 3);
            f1488o.append(g2.d.Z6, 4);
            f1488o.append(g2.d.f17059a7, 5);
            f1488o.append(g2.d.V6, 6);
            f1488o.append(g2.d.W6, 7);
            f1488o.append(g2.d.X6, 8);
            f1488o.append(g2.d.Y6, 9);
            f1488o.append(g2.d.f17094e7, 10);
            f1488o.append(g2.d.f17103f7, 11);
            f1488o.append(g2.d.f17112g7, 12);
        }

        public void a(e eVar) {
            this.f1489a = eVar.f1489a;
            this.b = eVar.b;
            this.f1490c = eVar.f1490c;
            this.f1491d = eVar.f1491d;
            this.f1492e = eVar.f1492e;
            this.f1493f = eVar.f1493f;
            this.f1494g = eVar.f1494g;
            this.f1495h = eVar.f1495h;
            this.f1496i = eVar.f1496i;
            this.f1497j = eVar.f1497j;
            this.f1498k = eVar.f1498k;
            this.f1499l = eVar.f1499l;
            this.f1500m = eVar.f1500m;
            this.f1501n = eVar.f1501n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.U6);
            this.f1489a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1488o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.f1490c = typedArrayObtainStyledAttributes.getFloat(index, this.f1490c);
                        break;
                    case 3:
                        this.f1491d = typedArrayObtainStyledAttributes.getFloat(index, this.f1491d);
                        break;
                    case 4:
                        this.f1492e = typedArrayObtainStyledAttributes.getFloat(index, this.f1492e);
                        break;
                    case 5:
                        this.f1493f = typedArrayObtainStyledAttributes.getFloat(index, this.f1493f);
                        break;
                    case 6:
                        this.f1494g = typedArrayObtainStyledAttributes.getDimension(index, this.f1494g);
                        break;
                    case 7:
                        this.f1495h = typedArrayObtainStyledAttributes.getDimension(index, this.f1495h);
                        break;
                    case 8:
                        this.f1497j = typedArrayObtainStyledAttributes.getDimension(index, this.f1497j);
                        break;
                    case 9:
                        this.f1498k = typedArrayObtainStyledAttributes.getDimension(index, this.f1498k);
                        break;
                    case 10:
                        this.f1499l = typedArrayObtainStyledAttributes.getDimension(index, this.f1499l);
                        break;
                    case 11:
                        this.f1500m = true;
                        this.f1501n = typedArrayObtainStyledAttributes.getDimension(index, this.f1501n);
                        break;
                    case 12:
                        this.f1496i = c.v(typedArrayObtainStyledAttributes, index, this.f1496i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1402h.append(g2.d.f17123i0, 25);
        f1402h.append(g2.d.f17132j0, 26);
        f1402h.append(g2.d.f17150l0, 29);
        f1402h.append(g2.d.f17159m0, 30);
        f1402h.append(g2.d.f17211s0, 36);
        f1402h.append(g2.d.f17203r0, 35);
        f1402h.append(g2.d.P, 4);
        f1402h.append(g2.d.O, 3);
        f1402h.append(g2.d.K, 1);
        f1402h.append(g2.d.M, 91);
        f1402h.append(g2.d.L, 92);
        f1402h.append(g2.d.B0, 6);
        f1402h.append(g2.d.C0, 7);
        f1402h.append(g2.d.W, 17);
        f1402h.append(g2.d.X, 18);
        f1402h.append(g2.d.Y, 19);
        f1402h.append(g2.d.G, 99);
        f1402h.append(g2.d.f17068c, 27);
        f1402h.append(g2.d.f17168n0, 32);
        f1402h.append(g2.d.f17177o0, 33);
        f1402h.append(g2.d.V, 10);
        f1402h.append(g2.d.U, 9);
        f1402h.append(g2.d.F0, 13);
        f1402h.append(g2.d.I0, 16);
        f1402h.append(g2.d.G0, 14);
        f1402h.append(g2.d.D0, 11);
        f1402h.append(g2.d.H0, 15);
        f1402h.append(g2.d.E0, 12);
        f1402h.append(g2.d.f17235v0, 40);
        f1402h.append(g2.d.f17105g0, 39);
        f1402h.append(g2.d.f17096f0, 41);
        f1402h.append(g2.d.f17227u0, 42);
        f1402h.append(g2.d.f17087e0, 20);
        f1402h.append(g2.d.f17219t0, 37);
        f1402h.append(g2.d.T, 5);
        f1402h.append(g2.d.f17114h0, 87);
        f1402h.append(g2.d.f17195q0, 87);
        f1402h.append(g2.d.f17141k0, 87);
        f1402h.append(g2.d.N, 87);
        f1402h.append(g2.d.J, 87);
        f1402h.append(g2.d.f17113h, 24);
        f1402h.append(g2.d.f17131j, 28);
        f1402h.append(g2.d.f17234v, 31);
        f1402h.append(g2.d.f17242w, 8);
        f1402h.append(g2.d.f17122i, 34);
        f1402h.append(g2.d.f17140k, 2);
        f1402h.append(g2.d.f17095f, 23);
        f1402h.append(g2.d.f17104g, 21);
        f1402h.append(g2.d.f17243w0, 95);
        f1402h.append(g2.d.Z, 96);
        f1402h.append(g2.d.f17086e, 22);
        f1402h.append(g2.d.f17149l, 43);
        f1402h.append(g2.d.f17256y, 44);
        f1402h.append(g2.d.f17218t, 45);
        f1402h.append(g2.d.f17226u, 46);
        f1402h.append(g2.d.f17210s, 60);
        f1402h.append(g2.d.f17194q, 47);
        f1402h.append(g2.d.f17202r, 48);
        f1402h.append(g2.d.f17158m, 49);
        f1402h.append(g2.d.f17167n, 50);
        f1402h.append(g2.d.f17176o, 51);
        f1402h.append(g2.d.f17185p, 52);
        f1402h.append(g2.d.f17249x, 53);
        f1402h.append(g2.d.f17250x0, 54);
        f1402h.append(g2.d.f17052a0, 55);
        f1402h.append(g2.d.f17257y0, 56);
        f1402h.append(g2.d.f17060b0, 57);
        f1402h.append(g2.d.f17265z0, 58);
        f1402h.append(g2.d.f17069c0, 59);
        f1402h.append(g2.d.Q, 61);
        f1402h.append(g2.d.S, 62);
        f1402h.append(g2.d.R, 63);
        f1402h.append(g2.d.f17264z, 64);
        f1402h.append(g2.d.S0, 65);
        f1402h.append(g2.d.F, 66);
        f1402h.append(g2.d.T0, 67);
        f1402h.append(g2.d.L0, 79);
        f1402h.append(g2.d.f17077d, 38);
        f1402h.append(g2.d.K0, 68);
        f1402h.append(g2.d.A0, 69);
        f1402h.append(g2.d.f17078d0, 70);
        f1402h.append(g2.d.J0, 97);
        f1402h.append(g2.d.D, 71);
        f1402h.append(g2.d.B, 72);
        f1402h.append(g2.d.C, 73);
        f1402h.append(g2.d.E, 74);
        f1402h.append(g2.d.A, 75);
        f1402h.append(g2.d.M0, 76);
        f1402h.append(g2.d.f17186p0, 77);
        f1402h.append(g2.d.U0, 78);
        f1402h.append(g2.d.I, 80);
        f1402h.append(g2.d.H, 81);
        f1402h.append(g2.d.N0, 82);
        f1402h.append(g2.d.R0, 83);
        f1402h.append(g2.d.Q0, 84);
        f1402h.append(g2.d.P0, 85);
        f1402h.append(g2.d.O0, 86);
        f1403i.append(g2.d.Y3, 6);
        f1403i.append(g2.d.Y3, 7);
        f1403i.append(g2.d.T2, 27);
        f1403i.append(g2.d.f17064b4, 13);
        f1403i.append(g2.d.f17091e4, 16);
        f1403i.append(g2.d.f17073c4, 14);
        f1403i.append(g2.d.Z3, 11);
        f1403i.append(g2.d.f17082d4, 15);
        f1403i.append(g2.d.f17056a4, 12);
        f1403i.append(g2.d.S3, 40);
        f1403i.append(g2.d.L3, 39);
        f1403i.append(g2.d.K3, 41);
        f1403i.append(g2.d.R3, 42);
        f1403i.append(g2.d.J3, 20);
        f1403i.append(g2.d.Q3, 37);
        f1403i.append(g2.d.D3, 5);
        f1403i.append(g2.d.M3, 87);
        f1403i.append(g2.d.P3, 87);
        f1403i.append(g2.d.N3, 87);
        f1403i.append(g2.d.A3, 87);
        f1403i.append(g2.d.f17268z3, 87);
        f1403i.append(g2.d.Y2, 24);
        f1403i.append(g2.d.f17055a3, 28);
        f1403i.append(g2.d.f17162m3, 31);
        f1403i.append(g2.d.f17171n3, 8);
        f1403i.append(g2.d.Z2, 34);
        f1403i.append(g2.d.f17063b3, 2);
        f1403i.append(g2.d.W2, 23);
        f1403i.append(g2.d.X2, 21);
        f1403i.append(g2.d.T3, 95);
        f1403i.append(g2.d.E3, 96);
        f1403i.append(g2.d.V2, 22);
        f1403i.append(g2.d.f17072c3, 43);
        f1403i.append(g2.d.f17189p3, 44);
        f1403i.append(g2.d.f17144k3, 45);
        f1403i.append(g2.d.f17153l3, 46);
        f1403i.append(g2.d.f17135j3, 60);
        f1403i.append(g2.d.f17117h3, 47);
        f1403i.append(g2.d.f17126i3, 48);
        f1403i.append(g2.d.f17081d3, 49);
        f1403i.append(g2.d.f17090e3, 50);
        f1403i.append(g2.d.f17099f3, 51);
        f1403i.append(g2.d.f17108g3, 52);
        f1403i.append(g2.d.f17180o3, 53);
        f1403i.append(g2.d.U3, 54);
        f1403i.append(g2.d.F3, 55);
        f1403i.append(g2.d.V3, 56);
        f1403i.append(g2.d.G3, 57);
        f1403i.append(g2.d.W3, 58);
        f1403i.append(g2.d.H3, 59);
        f1403i.append(g2.d.C3, 62);
        f1403i.append(g2.d.B3, 63);
        f1403i.append(g2.d.f17198q3, 64);
        f1403i.append(g2.d.f17190p4, 65);
        f1403i.append(g2.d.f17246w3, 66);
        f1403i.append(g2.d.f17199q4, 67);
        f1403i.append(g2.d.f17118h4, 79);
        f1403i.append(g2.d.U2, 38);
        f1403i.append(g2.d.f17127i4, 98);
        f1403i.append(g2.d.f17109g4, 68);
        f1403i.append(g2.d.X3, 69);
        f1403i.append(g2.d.I3, 70);
        f1403i.append(g2.d.f17230u3, 71);
        f1403i.append(g2.d.f17214s3, 72);
        f1403i.append(g2.d.f17222t3, 73);
        f1403i.append(g2.d.f17238v3, 74);
        f1403i.append(g2.d.f17206r3, 75);
        f1403i.append(g2.d.f17136j4, 76);
        f1403i.append(g2.d.O3, 77);
        f1403i.append(g2.d.f17207r4, 78);
        f1403i.append(g2.d.f17260y3, 80);
        f1403i.append(g2.d.f17253x3, 81);
        f1403i.append(g2.d.f17145k4, 82);
        f1403i.append(g2.d.f17181o4, 83);
        f1403i.append(g2.d.f17172n4, 84);
        f1403i.append(g2.d.f17163m4, 85);
        f1403i.append(g2.d.f17154l4, 86);
        f1403i.append(g2.d.f17100f4, 97);
    }

    public static void A(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0031a c0031a = new a.C0031a();
        aVar.f1415h = c0031a;
        aVar.f1411d.f1471a = false;
        aVar.f1412e.b = false;
        aVar.f1410c.f1484a = false;
        aVar.f1413f.f1489a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1403i.get(index)) {
                case 2:
                    c0031a.b(2, typedArray.getDimensionPixelSize(index, aVar.f1412e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case Barcode.FORMAT_EAN_13 /* 32 */:
                case 33:
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1402h.get(index));
                    break;
                case 5:
                    c0031a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0031a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1412e.E));
                    break;
                case 7:
                    c0031a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1412e.F));
                    break;
                case 8:
                    c0031a.b(8, typedArray.getDimensionPixelSize(index, aVar.f1412e.L));
                    break;
                case 11:
                    c0031a.b(11, typedArray.getDimensionPixelSize(index, aVar.f1412e.R));
                    break;
                case 12:
                    c0031a.b(12, typedArray.getDimensionPixelSize(index, aVar.f1412e.S));
                    break;
                case 13:
                    c0031a.b(13, typedArray.getDimensionPixelSize(index, aVar.f1412e.O));
                    break;
                case 14:
                    c0031a.b(14, typedArray.getDimensionPixelSize(index, aVar.f1412e.Q));
                    break;
                case 15:
                    c0031a.b(15, typedArray.getDimensionPixelSize(index, aVar.f1412e.T));
                    break;
                case 16:
                    c0031a.b(16, typedArray.getDimensionPixelSize(index, aVar.f1412e.P));
                    break;
                case 17:
                    c0031a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1412e.f1437f));
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    c0031a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1412e.f1439g));
                    break;
                case 19:
                    c0031a.a(19, typedArray.getFloat(index, aVar.f1412e.f1441h));
                    break;
                case 20:
                    c0031a.a(20, typedArray.getFloat(index, aVar.f1412e.f1468y));
                    break;
                case 21:
                    c0031a.b(21, typedArray.getLayoutDimension(index, aVar.f1412e.f1435e));
                    break;
                case 22:
                    c0031a.b(22, f1401g[typedArray.getInt(index, aVar.f1410c.b)]);
                    break;
                case 23:
                    c0031a.b(23, typedArray.getLayoutDimension(index, aVar.f1412e.f1433d));
                    break;
                case 24:
                    c0031a.b(24, typedArray.getDimensionPixelSize(index, aVar.f1412e.H));
                    break;
                case 27:
                    c0031a.b(27, typedArray.getInt(index, aVar.f1412e.G));
                    break;
                case 28:
                    c0031a.b(28, typedArray.getDimensionPixelSize(index, aVar.f1412e.I));
                    break;
                case 31:
                    c0031a.b(31, typedArray.getDimensionPixelSize(index, aVar.f1412e.M));
                    break;
                case 34:
                    c0031a.b(34, typedArray.getDimensionPixelSize(index, aVar.f1412e.J));
                    break;
                case 37:
                    c0031a.a(37, typedArray.getFloat(index, aVar.f1412e.f1469z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1409a);
                    aVar.f1409a = resourceId;
                    c0031a.b(38, resourceId);
                    break;
                case 39:
                    c0031a.a(39, typedArray.getFloat(index, aVar.f1412e.W));
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    c0031a.a(40, typedArray.getFloat(index, aVar.f1412e.V));
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    c0031a.b(41, typedArray.getInt(index, aVar.f1412e.X));
                    break;
                case 42:
                    c0031a.b(42, typedArray.getInt(index, aVar.f1412e.Y));
                    break;
                case 43:
                    c0031a.a(43, typedArray.getFloat(index, aVar.f1410c.f1486d));
                    break;
                case 44:
                    c0031a.d(44, true);
                    c0031a.a(44, typedArray.getDimension(index, aVar.f1413f.f1501n));
                    break;
                case 45:
                    c0031a.a(45, typedArray.getFloat(index, aVar.f1413f.f1490c));
                    break;
                case 46:
                    c0031a.a(46, typedArray.getFloat(index, aVar.f1413f.f1491d));
                    break;
                case 47:
                    c0031a.a(47, typedArray.getFloat(index, aVar.f1413f.f1492e));
                    break;
                case 48:
                    c0031a.a(48, typedArray.getFloat(index, aVar.f1413f.f1493f));
                    break;
                case 49:
                    c0031a.a(49, typedArray.getDimension(index, aVar.f1413f.f1494g));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    c0031a.a(50, typedArray.getDimension(index, aVar.f1413f.f1495h));
                    break;
                case 51:
                    c0031a.a(51, typedArray.getDimension(index, aVar.f1413f.f1497j));
                    break;
                case 52:
                    c0031a.a(52, typedArray.getDimension(index, aVar.f1413f.f1498k));
                    break;
                case 53:
                    c0031a.a(53, typedArray.getDimension(index, aVar.f1413f.f1499l));
                    break;
                case 54:
                    c0031a.b(54, typedArray.getInt(index, aVar.f1412e.Z));
                    break;
                case 55:
                    c0031a.b(55, typedArray.getInt(index, aVar.f1412e.f1429a0));
                    break;
                case 56:
                    c0031a.b(56, typedArray.getDimensionPixelSize(index, aVar.f1412e.f1430b0));
                    break;
                case 57:
                    c0031a.b(57, typedArray.getDimensionPixelSize(index, aVar.f1412e.f1432c0));
                    break;
                case 58:
                    c0031a.b(58, typedArray.getDimensionPixelSize(index, aVar.f1412e.f1434d0));
                    break;
                case 59:
                    c0031a.b(59, typedArray.getDimensionPixelSize(index, aVar.f1412e.f1436e0));
                    break;
                case 60:
                    c0031a.a(60, typedArray.getFloat(index, aVar.f1413f.b));
                    break;
                case 62:
                    c0031a.b(62, typedArray.getDimensionPixelSize(index, aVar.f1412e.C));
                    break;
                case 63:
                    c0031a.a(63, typedArray.getFloat(index, aVar.f1412e.D));
                    break;
                case Barcode.FORMAT_EAN_8 /* 64 */:
                    c0031a.b(64, v(typedArray, index, aVar.f1411d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0031a.c(65, typedArray.getString(index));
                    } else {
                        c0031a.c(65, a2.b.f79c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0031a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0031a.a(67, typedArray.getFloat(index, aVar.f1411d.f1478i));
                    break;
                case 68:
                    c0031a.a(68, typedArray.getFloat(index, aVar.f1410c.f1487e));
                    break;
                case 69:
                    c0031a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0031a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0031a.b(72, typedArray.getInt(index, aVar.f1412e.f1442h0));
                    break;
                case 73:
                    c0031a.b(73, typedArray.getDimensionPixelSize(index, aVar.f1412e.f1444i0));
                    break;
                case 74:
                    c0031a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0031a.d(75, typedArray.getBoolean(index, aVar.f1412e.f1458p0));
                    break;
                case 76:
                    c0031a.b(76, typedArray.getInt(index, aVar.f1411d.f1474e));
                    break;
                case 77:
                    c0031a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0031a.b(78, typedArray.getInt(index, aVar.f1410c.f1485c));
                    break;
                case 79:
                    c0031a.a(79, typedArray.getFloat(index, aVar.f1411d.f1476g));
                    break;
                case 80:
                    c0031a.d(80, typedArray.getBoolean(index, aVar.f1412e.f1454n0));
                    break;
                case 81:
                    c0031a.d(81, typedArray.getBoolean(index, aVar.f1412e.f1456o0));
                    break;
                case 82:
                    c0031a.b(82, typedArray.getInteger(index, aVar.f1411d.f1472c));
                    break;
                case 83:
                    c0031a.b(83, v(typedArray, index, aVar.f1413f.f1496i));
                    break;
                case 84:
                    c0031a.b(84, typedArray.getInteger(index, aVar.f1411d.f1480k));
                    break;
                case 85:
                    c0031a.a(85, typedArray.getFloat(index, aVar.f1411d.f1479j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1411d.f1483n = typedArray.getResourceId(index, -1);
                        c0031a.b(89, aVar.f1411d.f1483n);
                        C0032c c0032c = aVar.f1411d;
                        if (c0032c.f1483n != -1) {
                            c0032c.f1482m = -2;
                            c0031a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f1411d.f1481l = typedArray.getString(index);
                        c0031a.c(90, aVar.f1411d.f1481l);
                        if (aVar.f1411d.f1481l.indexOf("/") > 0) {
                            aVar.f1411d.f1483n = typedArray.getResourceId(index, -1);
                            c0031a.b(89, aVar.f1411d.f1483n);
                            aVar.f1411d.f1482m = -2;
                            c0031a.b(88, -2);
                        } else {
                            aVar.f1411d.f1482m = -1;
                            c0031a.b(88, -1);
                        }
                    } else {
                        C0032c c0032c2 = aVar.f1411d;
                        c0032c2.f1482m = typedArray.getInteger(index, c0032c2.f1483n);
                        c0031a.b(88, aVar.f1411d.f1482m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1402h.get(index));
                    break;
                case 93:
                    c0031a.b(93, typedArray.getDimensionPixelSize(index, aVar.f1412e.N));
                    break;
                case 94:
                    c0031a.b(94, typedArray.getDimensionPixelSize(index, aVar.f1412e.U));
                    break;
                case 95:
                    w(c0031a, typedArray, index, 0);
                    break;
                case 96:
                    w(c0031a, typedArray, index, 1);
                    break;
                case 97:
                    c0031a.b(97, typedArray.getInt(index, aVar.f1412e.f1460q0));
                    break;
                case 98:
                    if (j.f15194v0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1409a);
                        aVar.f1409a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.f1409a = typedArray.getResourceId(index, aVar.f1409a);
                    }
                    break;
                case 99:
                    c0031a.d(99, typedArray.getBoolean(index, aVar.f1412e.f1443i));
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
        a.C0031a c0031a;
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
                    bVar2.f1322a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f1323b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f1433d = i13;
                    bVar.f1454n0 = z10;
                    return;
                } else {
                    bVar.f1435e = i13;
                    bVar.f1456o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0031a) {
                c0031a = (a.C0031a) obj;
                if (i11 == 0) {
                    c0031a.b(23, i13);
                    c0031a.d(80, z10);
                } else {
                    c0031a.b(21, i13);
                    c0031a.d(81, z10);
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
                bVar2.f1322a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f1323b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f1433d = i13;
                bVar.f1454n0 = z10;
                return;
            } else {
                bVar.f1435e = i13;
                bVar.f1456o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0031a) {
            c0031a = (a.C0031a) obj;
            if (i11 == 0) {
                c0031a.b(23, i13);
                c0031a.d(80, z10);
            } else {
                c0031a.b(21, i13);
                c0031a.d(81, z10);
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
                    if (obj instanceof a.C0031a) {
                        ((a.C0031a) obj).c(5, strTrim2);
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
                            bVar3.f1433d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f1435e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0031a) {
                        a.C0031a c0031a = (a.C0031a) obj;
                        if (i10 == 0) {
                            c0031a.b(23, 0);
                            c0031a.a(39, f10);
                            return;
                        } else {
                            c0031a.b(21, 0);
                            c0031a.a(40, f10);
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
                            bVar5.f1433d = 0;
                            bVar5.f1438f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1435e = 0;
                            bVar5.f1440g0 = fMax;
                            bVar5.f1429a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0031a) {
                        a.C0031a c0031a2 = (a.C0031a) obj;
                        if (i10 == 0) {
                            c0031a2.b(23, 0);
                            c0031a2.b(54, 2);
                        } else {
                            c0031a2.b(21, 0);
                            c0031a2.b(55, 2);
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
        s(i10).f1412e.f1468y = f10;
    }

    public void C(int i10, int i11) {
        s(i10).f1412e.X = i11;
    }

    public void D(int i10, float f10) {
        s(i10).f1412e.W = f10;
    }

    public void E(int i10, int i11, int i12) {
        a aVarS = s(i10);
        switch (i11) {
            case 1:
                aVarS.f1412e.H = i12;
                return;
            case 2:
                aVarS.f1412e.I = i12;
                return;
            case 3:
                aVarS.f1412e.J = i12;
                return;
            case 4:
                aVarS.f1412e.K = i12;
                return;
            case 5:
                aVarS.f1412e.N = i12;
                return;
            case 6:
                aVarS.f1412e.M = i12;
                return;
            case 7:
                aVarS.f1412e.L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F(int i10, float f10) {
        s(i10).f1412e.f1469z = f10;
    }

    public void G(int i10, int i11) {
        s(i10).f1412e.Y = i11;
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
        HashSet<Integer> hashSet = new HashSet(this.f1408f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1408f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + f2.a.b(childAt));
            } else {
                if (this.f1407e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f1408f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f1408f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1412e.f1446j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f1412e.f1442h0);
                                barrier.setMargin(aVar.f1412e.f1444i0);
                                barrier.setAllowsGoneWidget(aVar.f1412e.f1458p0);
                                b bVar = aVar.f1412e;
                                int[] iArr = bVar.f1448k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1450l0;
                                    if (str != null) {
                                        bVar.f1448k0 = p(barrier, str);
                                        barrier.setReferencedIds(aVar.f1412e.f1448k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.f1414g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1410c;
                            if (dVar.f1485c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.f1410c.f1486d);
                            childAt.setRotation(aVar.f1413f.b);
                            childAt.setRotationX(aVar.f1413f.f1490c);
                            childAt.setRotationY(aVar.f1413f.f1491d);
                            childAt.setScaleX(aVar.f1413f.f1492e);
                            childAt.setScaleY(aVar.f1413f.f1493f);
                            e eVar = aVar.f1413f;
                            if (eVar.f1496i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f1413f.f1496i);
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
                                if (!Float.isNaN(eVar.f1494g)) {
                                    childAt.setPivotX(aVar.f1413f.f1494g);
                                }
                                if (!Float.isNaN(aVar.f1413f.f1495h)) {
                                    childAt.setPivotY(aVar.f1413f.f1495h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1413f.f1497j);
                            childAt.setTranslationY(aVar.f1413f.f1498k);
                            childAt.setTranslationZ(aVar.f1413f.f1499l);
                            e eVar2 = aVar.f1413f;
                            if (eVar2.f1500m) {
                                childAt.setElevation(eVar2.f1501n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f1408f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1412e.f1446j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1412e;
                    int[] iArr2 = bVar3.f1448k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1450l0;
                        if (str2 != null) {
                            bVar3.f1448k0 = p(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1412e.f1448k0);
                        }
                    }
                    barrier2.setType(aVar2.f1412e.f1442h0);
                    barrier2.setMargin(aVar2.f1412e.f1444i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1412e.f1428a) {
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
        this.f1408f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1407e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1408f.containsKey(Integer.valueOf(id2))) {
                this.f1408f.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f1408f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f1414g = androidx.constraintlayout.widget.a.a(this.f1406d, childAt);
                aVar.f(id2, bVar);
                aVar.f1410c.b = childAt.getVisibility();
                aVar.f1410c.f1486d = childAt.getAlpha();
                aVar.f1413f.b = childAt.getRotation();
                aVar.f1413f.f1490c = childAt.getRotationX();
                aVar.f1413f.f1491d = childAt.getRotationY();
                aVar.f1413f.f1492e = childAt.getScaleX();
                aVar.f1413f.f1493f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1413f;
                    eVar.f1494g = pivotX;
                    eVar.f1495h = pivotY;
                }
                aVar.f1413f.f1497j = childAt.getTranslationX();
                aVar.f1413f.f1498k = childAt.getTranslationY();
                aVar.f1413f.f1499l = childAt.getTranslationZ();
                e eVar2 = aVar.f1413f;
                if (eVar2.f1500m) {
                    eVar2.f1501n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1412e.f1458p0 = barrier.getAllowsGoneWidget();
                    aVar.f1412e.f1448k0 = barrier.getReferencedIds();
                    aVar.f1412e.f1442h0 = barrier.getType();
                    aVar.f1412e.f1444i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.f1408f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            androidx.constraintlayout.widget.d.a aVar = (androidx.constraintlayout.widget.d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1407e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1408f.containsKey(Integer.valueOf(id2))) {
                this.f1408f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f1408f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (!this.f1408f.containsKey(Integer.valueOf(i10))) {
            this.f1408f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1408f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1412e;
                    bVar.f1445j = i12;
                    bVar.f1447k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f1412e;
                    bVar2.f1447k = i12;
                    bVar2.f1445j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + H(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1412e;
                    bVar3.f1449l = i12;
                    bVar3.f1451m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f1412e;
                    bVar4.f1451m = i12;
                    bVar4.f1449l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1412e;
                    bVar5.f1453n = i12;
                    bVar5.f1455o = -1;
                    bVar5.f1461r = -1;
                    bVar5.f1462s = -1;
                    bVar5.f1463t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar6 = aVar.f1412e;
                bVar6.f1455o = i12;
                bVar6.f1453n = -1;
                bVar6.f1461r = -1;
                bVar6.f1462s = -1;
                bVar6.f1463t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1412e;
                    bVar7.f1459q = i12;
                    bVar7.f1457p = -1;
                    bVar7.f1461r = -1;
                    bVar7.f1462s = -1;
                    bVar7.f1463t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar8 = aVar.f1412e;
                bVar8.f1457p = i12;
                bVar8.f1459q = -1;
                bVar8.f1461r = -1;
                bVar8.f1462s = -1;
                bVar8.f1463t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1412e;
                    bVar9.f1461r = i12;
                    bVar9.f1459q = -1;
                    bVar9.f1457p = -1;
                    bVar9.f1453n = -1;
                    bVar9.f1455o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1412e;
                    bVar10.f1462s = i12;
                    bVar10.f1459q = -1;
                    bVar10.f1457p = -1;
                    bVar10.f1453n = -1;
                    bVar10.f1455o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1412e;
                bVar11.f1463t = i12;
                bVar11.f1459q = -1;
                bVar11.f1457p = -1;
                bVar11.f1453n = -1;
                bVar11.f1455o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1412e;
                    bVar12.f1465v = i12;
                    bVar12.f1464u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f1412e;
                    bVar13.f1464u = i12;
                    bVar13.f1465v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1412e;
                    bVar14.f1467x = i12;
                    bVar14.f1466w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f1412e;
                    bVar15.f1466w = i12;
                    bVar15.f1467x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f1408f.containsKey(Integer.valueOf(i10))) {
            this.f1408f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1408f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1412e;
                    bVar.f1445j = i12;
                    bVar.f1447k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + H(i13) + " undefined");
                    }
                    b bVar2 = aVar.f1412e;
                    bVar2.f1447k = i12;
                    bVar2.f1445j = -1;
                }
                aVar.f1412e.H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1412e;
                    bVar3.f1449l = i12;
                    bVar3.f1451m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar4 = aVar.f1412e;
                    bVar4.f1451m = i12;
                    bVar4.f1449l = -1;
                }
                aVar.f1412e.I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1412e;
                    bVar5.f1453n = i12;
                    bVar5.f1455o = -1;
                    bVar5.f1461r = -1;
                    bVar5.f1462s = -1;
                    bVar5.f1463t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar6 = aVar.f1412e;
                    bVar6.f1455o = i12;
                    bVar6.f1453n = -1;
                    bVar6.f1461r = -1;
                    bVar6.f1462s = -1;
                    bVar6.f1463t = -1;
                }
                aVar.f1412e.J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1412e;
                    bVar7.f1459q = i12;
                    bVar7.f1457p = -1;
                    bVar7.f1461r = -1;
                    bVar7.f1462s = -1;
                    bVar7.f1463t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar8 = aVar.f1412e;
                    bVar8.f1457p = i12;
                    bVar8.f1459q = -1;
                    bVar8.f1461r = -1;
                    bVar8.f1462s = -1;
                    bVar8.f1463t = -1;
                }
                aVar.f1412e.K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1412e;
                    bVar9.f1461r = i12;
                    bVar9.f1459q = -1;
                    bVar9.f1457p = -1;
                    bVar9.f1453n = -1;
                    bVar9.f1455o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1412e;
                    bVar10.f1462s = i12;
                    bVar10.f1459q = -1;
                    bVar10.f1457p = -1;
                    bVar10.f1453n = -1;
                    bVar10.f1455o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1412e;
                bVar11.f1463t = i12;
                bVar11.f1459q = -1;
                bVar11.f1457p = -1;
                bVar11.f1453n = -1;
                bVar11.f1455o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1412e;
                    bVar12.f1465v = i12;
                    bVar12.f1464u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar13 = aVar.f1412e;
                    bVar13.f1464u = i12;
                    bVar13.f1465v = -1;
                }
                aVar.f1412e.M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1412e;
                    bVar14.f1467x = i12;
                    bVar14.f1466w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar15 = aVar.f1412e;
                    bVar15.f1466w = i12;
                    bVar15.f1467x = -1;
                }
                aVar.f1412e.L = i14;
                return;
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = s(i10).f1412e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void k(int i10, int i11) {
        s(i10).f1412e.Z = i11;
    }

    public void l(int i10, int i11) {
        s(i10).f1412e.f1435e = i11;
    }

    public void m(int i10, int i11) {
        s(i10).f1412e.f1433d = i11;
    }

    public void n(int i10, boolean z10) {
        s(i10).f1412e.f1456o0 = z10;
    }

    public void o(int i10, boolean z10) {
        s(i10).f1412e.f1454n0 = z10;
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
            s(iArr[0]).f1412e.V = fArr[0];
        }
        s(iArr[0]).f1412e.Y = i14;
        i(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            i(iArr[i15], 3, iArr[i16], 4, 0);
            i(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                s(iArr[i15]).f1412e.V = fArr[i15];
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
        if (!this.f1408f.containsKey(Integer.valueOf(i10))) {
            this.f1408f.put(Integer.valueOf(i10), new a());
        }
        return this.f1408f.get(Integer.valueOf(i10));
    }

    public void t(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarR = r(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarR.f1412e.f1428a = true;
                    }
                    this.f1408f.put(Integer.valueOf(aVarR.f1409a), aVarR);
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
                                aVarR.f1412e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1411d.b(context, Xml.asAttributeSet(xmlPullParser));
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
                                aVarR.f1410c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1413f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarR.f1412e;
                                bVar.f1428a = true;
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
                                aVarR.f1412e.f1446j0 = 1;
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
                    androidx.constraintlayout.widget.a.d(context, xmlPullParser, aVarR.f1414g);
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
                    this.f1408f.put(Integer.valueOf(aVarR.f1409a), aVarR);
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
            if (index != g2.d.f17077d && g2.d.f17234v != index && g2.d.f17242w != index) {
                aVar.f1411d.f1471a = true;
                aVar.f1412e.b = true;
                aVar.f1410c.f1484a = true;
                aVar.f1413f.f1489a = true;
            }
            switch (f1402h.get(index)) {
                case 1:
                    b bVar = aVar.f1412e;
                    bVar.f1461r = v(typedArray, index, bVar.f1461r);
                    break;
                case 2:
                    b bVar2 = aVar.f1412e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1412e;
                    bVar3.f1459q = v(typedArray, index, bVar3.f1459q);
                    break;
                case 4:
                    b bVar4 = aVar.f1412e;
                    bVar4.f1457p = v(typedArray, index, bVar4.f1457p);
                    break;
                case 5:
                    aVar.f1412e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1412e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1412e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f1412e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f1412e;
                    bVar8.f1467x = v(typedArray, index, bVar8.f1467x);
                    break;
                case 10:
                    b bVar9 = aVar.f1412e;
                    bVar9.f1466w = v(typedArray, index, bVar9.f1466w);
                    break;
                case 11:
                    b bVar10 = aVar.f1412e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1412e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1412e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1412e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1412e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1412e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1412e;
                    bVar16.f1437f = typedArray.getDimensionPixelOffset(index, bVar16.f1437f);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    b bVar17 = aVar.f1412e;
                    bVar17.f1439g = typedArray.getDimensionPixelOffset(index, bVar17.f1439g);
                    break;
                case 19:
                    b bVar18 = aVar.f1412e;
                    bVar18.f1441h = typedArray.getFloat(index, bVar18.f1441h);
                    break;
                case 20:
                    b bVar19 = aVar.f1412e;
                    bVar19.f1468y = typedArray.getFloat(index, bVar19.f1468y);
                    break;
                case 21:
                    b bVar20 = aVar.f1412e;
                    bVar20.f1435e = typedArray.getLayoutDimension(index, bVar20.f1435e);
                    break;
                case 22:
                    d dVar = aVar.f1410c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.f1410c;
                    dVar2.b = f1401g[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.f1412e;
                    bVar21.f1433d = typedArray.getLayoutDimension(index, bVar21.f1433d);
                    break;
                case 24:
                    b bVar22 = aVar.f1412e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1412e;
                    bVar23.f1445j = v(typedArray, index, bVar23.f1445j);
                    break;
                case 26:
                    b bVar24 = aVar.f1412e;
                    bVar24.f1447k = v(typedArray, index, bVar24.f1447k);
                    break;
                case 27:
                    b bVar25 = aVar.f1412e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1412e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1412e;
                    bVar27.f1449l = v(typedArray, index, bVar27.f1449l);
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    b bVar28 = aVar.f1412e;
                    bVar28.f1451m = v(typedArray, index, bVar28.f1451m);
                    break;
                case 31:
                    b bVar29 = aVar.f1412e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case Barcode.FORMAT_EAN_13 /* 32 */:
                    b bVar30 = aVar.f1412e;
                    bVar30.f1464u = v(typedArray, index, bVar30.f1464u);
                    break;
                case 33:
                    b bVar31 = aVar.f1412e;
                    bVar31.f1465v = v(typedArray, index, bVar31.f1465v);
                    break;
                case 34:
                    b bVar32 = aVar.f1412e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    b bVar33 = aVar.f1412e;
                    bVar33.f1455o = v(typedArray, index, bVar33.f1455o);
                    break;
                case 36:
                    b bVar34 = aVar.f1412e;
                    bVar34.f1453n = v(typedArray, index, bVar34.f1453n);
                    break;
                case 37:
                    b bVar35 = aVar.f1412e;
                    bVar35.f1469z = typedArray.getFloat(index, bVar35.f1469z);
                    break;
                case 38:
                    aVar.f1409a = typedArray.getResourceId(index, aVar.f1409a);
                    break;
                case 39:
                    b bVar36 = aVar.f1412e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    b bVar37 = aVar.f1412e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    b bVar38 = aVar.f1412e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f1412e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f1410c;
                    dVar3.f1486d = typedArray.getFloat(index, dVar3.f1486d);
                    break;
                case 44:
                    e eVar = aVar.f1413f;
                    eVar.f1500m = true;
                    eVar.f1501n = typedArray.getDimension(index, eVar.f1501n);
                    break;
                case 45:
                    e eVar2 = aVar.f1413f;
                    eVar2.f1490c = typedArray.getFloat(index, eVar2.f1490c);
                    break;
                case 46:
                    e eVar3 = aVar.f1413f;
                    eVar3.f1491d = typedArray.getFloat(index, eVar3.f1491d);
                    break;
                case 47:
                    e eVar4 = aVar.f1413f;
                    eVar4.f1492e = typedArray.getFloat(index, eVar4.f1492e);
                    break;
                case 48:
                    e eVar5 = aVar.f1413f;
                    eVar5.f1493f = typedArray.getFloat(index, eVar5.f1493f);
                    break;
                case 49:
                    e eVar6 = aVar.f1413f;
                    eVar6.f1494g = typedArray.getDimension(index, eVar6.f1494g);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    e eVar7 = aVar.f1413f;
                    eVar7.f1495h = typedArray.getDimension(index, eVar7.f1495h);
                    break;
                case 51:
                    e eVar8 = aVar.f1413f;
                    eVar8.f1497j = typedArray.getDimension(index, eVar8.f1497j);
                    break;
                case 52:
                    e eVar9 = aVar.f1413f;
                    eVar9.f1498k = typedArray.getDimension(index, eVar9.f1498k);
                    break;
                case 53:
                    e eVar10 = aVar.f1413f;
                    eVar10.f1499l = typedArray.getDimension(index, eVar10.f1499l);
                    break;
                case 54:
                    b bVar40 = aVar.f1412e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1412e;
                    bVar41.f1429a0 = typedArray.getInt(index, bVar41.f1429a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1412e;
                    bVar42.f1430b0 = typedArray.getDimensionPixelSize(index, bVar42.f1430b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1412e;
                    bVar43.f1432c0 = typedArray.getDimensionPixelSize(index, bVar43.f1432c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1412e;
                    bVar44.f1434d0 = typedArray.getDimensionPixelSize(index, bVar44.f1434d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1412e;
                    bVar45.f1436e0 = typedArray.getDimensionPixelSize(index, bVar45.f1436e0);
                    break;
                case 60:
                    e eVar11 = aVar.f1413f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.f1412e;
                    bVar46.B = v(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1412e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1412e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case Barcode.FORMAT_EAN_8 /* 64 */:
                    C0032c c0032c = aVar.f1411d;
                    c0032c.b = v(typedArray, index, c0032c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1411d.f1473d = typedArray.getString(index);
                    } else {
                        aVar.f1411d.f1473d = a2.b.f79c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f1411d.f1475f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0032c c0032c2 = aVar.f1411d;
                    c0032c2.f1478i = typedArray.getFloat(index, c0032c2.f1478i);
                    break;
                case 68:
                    d dVar4 = aVar.f1410c;
                    dVar4.f1487e = typedArray.getFloat(index, dVar4.f1487e);
                    break;
                case 69:
                    aVar.f1412e.f1438f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1412e.f1440g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1412e;
                    bVar49.f1442h0 = typedArray.getInt(index, bVar49.f1442h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1412e;
                    bVar50.f1444i0 = typedArray.getDimensionPixelSize(index, bVar50.f1444i0);
                    break;
                case 74:
                    aVar.f1412e.f1450l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1412e;
                    bVar51.f1458p0 = typedArray.getBoolean(index, bVar51.f1458p0);
                    break;
                case 76:
                    C0032c c0032c3 = aVar.f1411d;
                    c0032c3.f1474e = typedArray.getInt(index, c0032c3.f1474e);
                    break;
                case 77:
                    aVar.f1412e.f1452m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1410c;
                    dVar5.f1485c = typedArray.getInt(index, dVar5.f1485c);
                    break;
                case 79:
                    C0032c c0032c4 = aVar.f1411d;
                    c0032c4.f1476g = typedArray.getFloat(index, c0032c4.f1476g);
                    break;
                case 80:
                    b bVar52 = aVar.f1412e;
                    bVar52.f1454n0 = typedArray.getBoolean(index, bVar52.f1454n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1412e;
                    bVar53.f1456o0 = typedArray.getBoolean(index, bVar53.f1456o0);
                    break;
                case 82:
                    C0032c c0032c5 = aVar.f1411d;
                    c0032c5.f1472c = typedArray.getInteger(index, c0032c5.f1472c);
                    break;
                case 83:
                    e eVar12 = aVar.f1413f;
                    eVar12.f1496i = v(typedArray, index, eVar12.f1496i);
                    break;
                case 84:
                    C0032c c0032c6 = aVar.f1411d;
                    c0032c6.f1480k = typedArray.getInteger(index, c0032c6.f1480k);
                    break;
                case 85:
                    C0032c c0032c7 = aVar.f1411d;
                    c0032c7.f1479j = typedArray.getFloat(index, c0032c7.f1479j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1411d.f1483n = typedArray.getResourceId(index, -1);
                        C0032c c0032c8 = aVar.f1411d;
                        if (c0032c8.f1483n != -1) {
                            c0032c8.f1482m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f1411d.f1481l = typedArray.getString(index);
                        if (aVar.f1411d.f1481l.indexOf("/") > 0) {
                            aVar.f1411d.f1483n = typedArray.getResourceId(index, -1);
                            aVar.f1411d.f1482m = -2;
                        } else {
                            aVar.f1411d.f1482m = -1;
                        }
                    } else {
                        C0032c c0032c9 = aVar.f1411d;
                        c0032c9.f1482m = typedArray.getInteger(index, c0032c9.f1483n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1402h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1402h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1412e;
                    bVar54.f1462s = v(typedArray, index, bVar54.f1462s);
                    break;
                case 92:
                    b bVar55 = aVar.f1412e;
                    bVar55.f1463t = v(typedArray, index, bVar55.f1463t);
                    break;
                case 93:
                    b bVar56 = aVar.f1412e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1412e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    w(aVar.f1412e, typedArray, index, 0);
                    break;
                case 96:
                    w(aVar.f1412e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1412e;
                    bVar58.f1460q0 = typedArray.getInt(index, bVar58.f1460q0);
                    break;
            }
        }
        b bVar59 = aVar.f1412e;
        if (bVar59.f1450l0 != null) {
            bVar59.f1448k0 = null;
        }
    }
}

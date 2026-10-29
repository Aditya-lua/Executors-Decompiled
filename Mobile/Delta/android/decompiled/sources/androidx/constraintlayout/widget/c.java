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
    public static final int[] f1594g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SparseIntArray f1595h = new SparseIntArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SparseIntArray f1596i = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1597a = "";
    public String[] b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1598c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f1599d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1600e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<Integer, a> f1601f = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1602a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f1603c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0024c f1604d = new C0024c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1605e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f1606f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f1607g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0023a f1608h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0023a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f1609a = new int[10];
            public int[] b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f1610c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f1611d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f1612e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f1613f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f1614g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f1615h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f1616i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f1617j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f1618k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f1619l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1613f;
                int[] iArr = this.f1611d;
                if (i11 >= iArr.length) {
                    this.f1611d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1612e;
                    this.f1612e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1611d;
                int i12 = this.f1613f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1612e;
                this.f1613f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1610c;
                int[] iArr = this.f1609a;
                if (i12 >= iArr.length) {
                    this.f1609a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1609a;
                int i13 = this.f1610c;
                iArr3[i13] = i10;
                int[] iArr4 = this.b;
                this.f1610c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1616i;
                int[] iArr = this.f1614g;
                if (i11 >= iArr.length) {
                    this.f1614g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1615h;
                    this.f1615h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1614g;
                int i12 = this.f1616i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1615h;
                this.f1616i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1619l;
                int[] iArr = this.f1617j;
                if (i11 >= iArr.length) {
                    this.f1617j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1618k;
                    this.f1618k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1617j;
                int i12 = this.f1619l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1618k;
                this.f1619l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1605e;
            bVar.f1521e = bVar2.f1638j;
            bVar.f1523f = bVar2.f1640k;
            bVar.f1525g = bVar2.f1642l;
            bVar.f1527h = bVar2.f1644m;
            bVar.f1529i = bVar2.f1646n;
            bVar.f1531j = bVar2.f1648o;
            bVar.f1533k = bVar2.f1650p;
            bVar.f1535l = bVar2.f1652q;
            bVar.f1537m = bVar2.f1654r;
            bVar.f1539n = bVar2.f1655s;
            bVar.f1541o = bVar2.f1656t;
            bVar.f1549s = bVar2.f1657u;
            bVar.f1551t = bVar2.f1658v;
            bVar.f1553u = bVar2.f1659w;
            bVar.f1555v = bVar2.f1660x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1559x = bVar2.P;
            bVar.f1561z = bVar2.R;
            bVar.G = bVar2.f1661y;
            bVar.H = bVar2.f1662z;
            bVar.f1543p = bVar2.B;
            bVar.f1545q = bVar2.C;
            bVar.f1547r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1515a0 = bVar2.f1647n0;
            bVar.f1516b0 = bVar2.f1649o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1622a0;
            bVar.T = bVar2.f1623b0;
            bVar.U = bVar2.f1625c0;
            bVar.R = bVar2.f1627d0;
            bVar.S = bVar2.f1629e0;
            bVar.V = bVar2.f1631f0;
            bVar.W = bVar2.f1633g0;
            bVar.Z = bVar2.G;
            bVar.f1517c = bVar2.f1634h;
            bVar.f1514a = bVar2.f1630f;
            bVar.b = bVar2.f1632g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1626d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1628e;
            String str = bVar2.f1645m0;
            if (str != null) {
                bVar.f1518c0 = str;
            }
            bVar.f1520d0 = bVar2.f1653q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1605e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1605e.a(this.f1605e);
            aVar.f1604d.a(this.f1604d);
            aVar.f1603c.a(this.f1603c);
            aVar.f1606f.a(this.f1606f);
            aVar.f1602a = this.f1602a;
            aVar.f1608h = this.f1608h;
            return aVar;
        }

        public final void f(int i10, ConstraintLayout.b bVar) {
            this.f1602a = i10;
            b bVar2 = this.f1605e;
            bVar2.f1638j = bVar.f1521e;
            bVar2.f1640k = bVar.f1523f;
            bVar2.f1642l = bVar.f1525g;
            bVar2.f1644m = bVar.f1527h;
            bVar2.f1646n = bVar.f1529i;
            bVar2.f1648o = bVar.f1531j;
            bVar2.f1650p = bVar.f1533k;
            bVar2.f1652q = bVar.f1535l;
            bVar2.f1654r = bVar.f1537m;
            bVar2.f1655s = bVar.f1539n;
            bVar2.f1656t = bVar.f1541o;
            bVar2.f1657u = bVar.f1549s;
            bVar2.f1658v = bVar.f1551t;
            bVar2.f1659w = bVar.f1553u;
            bVar2.f1660x = bVar.f1555v;
            bVar2.f1661y = bVar.G;
            bVar2.f1662z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1543p;
            bVar2.C = bVar.f1545q;
            bVar2.D = bVar.f1547r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1634h = bVar.f1517c;
            bVar2.f1630f = bVar.f1514a;
            bVar2.f1632g = bVar.b;
            bVar2.f1626d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1628e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1647n0 = bVar.f1515a0;
            bVar2.f1649o0 = bVar.f1516b0;
            bVar2.Z = bVar.P;
            bVar2.f1622a0 = bVar.Q;
            bVar2.f1623b0 = bVar.T;
            bVar2.f1625c0 = bVar.U;
            bVar2.f1627d0 = bVar.R;
            bVar2.f1629e0 = bVar.S;
            bVar2.f1631f0 = bVar.V;
            bVar2.f1633g0 = bVar.W;
            bVar2.f1645m0 = bVar.f1518c0;
            bVar2.P = bVar.f1559x;
            bVar2.R = bVar.f1561z;
            bVar2.O = bVar.f1557w;
            bVar2.Q = bVar.f1560y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1653q0 = bVar.f1520d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1605e.M = bVar.getMarginStart();
        }

        public final void g(int i10, androidx.constraintlayout.widget.d.a aVar) {
            f(i10, aVar);
            this.f1603c.f1679d = aVar.f1696x0;
            e eVar = this.f1606f;
            eVar.b = aVar.A0;
            eVar.f1683c = aVar.B0;
            eVar.f1684d = aVar.C0;
            eVar.f1685e = aVar.D0;
            eVar.f1686f = aVar.E0;
            eVar.f1687g = aVar.F0;
            eVar.f1688h = aVar.G0;
            eVar.f1690j = aVar.H0;
            eVar.f1691k = aVar.I0;
            eVar.f1692l = aVar.J0;
            eVar.f1694n = aVar.f1698z0;
            eVar.f1693m = aVar.f1697y0;
        }

        public final void h(androidx.constraintlayout.widget.b bVar, int i10, androidx.constraintlayout.widget.d.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f1605e;
                bVar2.f1639j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1635h0 = barrier.getType();
                this.f1605e.f1641k0 = barrier.getReferencedIds();
                this.f1605e.f1637i0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static SparseIntArray f1620r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1628e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f1641k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f1643l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f1645m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1621a = false;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1624c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1630f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1632g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1634h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1636i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1638j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1640k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1642l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1644m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1646n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1648o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1650p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1652q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1654r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1655s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1656t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1657u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1658v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1659w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1660x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f1661y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f1662z = 0.5f;
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
        public int f1622a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f1623b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f1625c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1627d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f1629e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f1631f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f1633g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f1635h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1637i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f1639j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f1647n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f1649o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f1651p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1653q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1620r0 = sparseIntArray;
            sparseIntArray.append(g2.d.O5, 24);
            f1620r0.append(g2.d.P5, 25);
            f1620r0.append(g2.d.R5, 28);
            f1620r0.append(g2.d.S5, 29);
            f1620r0.append(g2.d.X5, 35);
            f1620r0.append(g2.d.W5, 34);
            f1620r0.append(g2.d.f17857x5, 4);
            f1620r0.append(g2.d.w5, 3);
            f1620r0.append(g2.d.f17835u5, 1);
            f1620r0.append(g2.d.f17705f6, 6);
            f1620r0.append(g2.d.f17714g6, 7);
            f1620r0.append(g2.d.E5, 17);
            f1620r0.append(g2.d.F5, 18);
            f1620r0.append(g2.d.G5, 19);
            SparseIntArray sparseIntArray2 = f1620r0;
            int i10 = g2.d.f17803q5;
            sparseIntArray2.append(i10, 90);
            f1620r0.append(g2.d.f17677c5, 26);
            f1620r0.append(g2.d.T5, 31);
            f1620r0.append(g2.d.U5, 32);
            f1620r0.append(g2.d.D5, 10);
            f1620r0.append(g2.d.C5, 9);
            f1620r0.append(g2.d.f17741j6, 13);
            f1620r0.append(g2.d.f17768m6, 16);
            f1620r0.append(g2.d.f17750k6, 14);
            f1620r0.append(g2.d.f17723h6, 11);
            f1620r0.append(g2.d.f17759l6, 15);
            f1620r0.append(g2.d.f17732i6, 12);
            f1620r0.append(g2.d.f17661a6, 38);
            f1620r0.append(g2.d.M5, 37);
            f1620r0.append(g2.d.L5, 39);
            f1620r0.append(g2.d.Z5, 40);
            f1620r0.append(g2.d.K5, 20);
            f1620r0.append(g2.d.Y5, 36);
            f1620r0.append(g2.d.B5, 5);
            f1620r0.append(g2.d.N5, 91);
            f1620r0.append(g2.d.V5, 91);
            f1620r0.append(g2.d.Q5, 91);
            f1620r0.append(g2.d.v5, 91);
            f1620r0.append(g2.d.f17827t5, 91);
            f1620r0.append(g2.d.f17704f5, 23);
            f1620r0.append(g2.d.f17722h5, 27);
            f1620r0.append(g2.d.f17740j5, 30);
            f1620r0.append(g2.d.f17749k5, 8);
            f1620r0.append(g2.d.f17713g5, 33);
            f1620r0.append(g2.d.f17731i5, 2);
            f1620r0.append(g2.d.f17686d5, 22);
            f1620r0.append(g2.d.f17695e5, 21);
            SparseIntArray sparseIntArray3 = f1620r0;
            int i11 = g2.d.f17669b6;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f1620r0;
            int i12 = g2.d.H5;
            sparseIntArray4.append(i12, 42);
            f1620r0.append(g2.d.f17819s5, 87);
            f1620r0.append(g2.d.f17811r5, 88);
            f1620r0.append(g2.d.f17777n6, 76);
            f1620r0.append(g2.d.f17865y5, 61);
            f1620r0.append(g2.d.A5, 62);
            f1620r0.append(g2.d.f17873z5, 63);
            f1620r0.append(g2.d.f17696e6, 69);
            f1620r0.append(g2.d.J5, 70);
            f1620r0.append(g2.d.f17785o5, 71);
            f1620r0.append(g2.d.f17767m5, 72);
            f1620r0.append(g2.d.f17776n5, 73);
            f1620r0.append(g2.d.f17794p5, 74);
            f1620r0.append(g2.d.f17758l5, 75);
            SparseIntArray sparseIntArray5 = f1620r0;
            int i13 = g2.d.f17678c6;
            sparseIntArray5.append(i13, 84);
            f1620r0.append(g2.d.f17687d6, 86);
            f1620r0.append(i13, 83);
            f1620r0.append(g2.d.I5, 85);
            f1620r0.append(i11, 87);
            f1620r0.append(i12, 88);
            f1620r0.append(g2.d.f17816s2, 89);
            f1620r0.append(i10, 90);
        }

        public void a(b bVar) {
            this.f1621a = bVar.f1621a;
            this.f1626d = bVar.f1626d;
            this.b = bVar.b;
            this.f1628e = bVar.f1628e;
            this.f1630f = bVar.f1630f;
            this.f1632g = bVar.f1632g;
            this.f1634h = bVar.f1634h;
            this.f1636i = bVar.f1636i;
            this.f1638j = bVar.f1638j;
            this.f1640k = bVar.f1640k;
            this.f1642l = bVar.f1642l;
            this.f1644m = bVar.f1644m;
            this.f1646n = bVar.f1646n;
            this.f1648o = bVar.f1648o;
            this.f1650p = bVar.f1650p;
            this.f1652q = bVar.f1652q;
            this.f1654r = bVar.f1654r;
            this.f1655s = bVar.f1655s;
            this.f1656t = bVar.f1656t;
            this.f1657u = bVar.f1657u;
            this.f1658v = bVar.f1658v;
            this.f1659w = bVar.f1659w;
            this.f1660x = bVar.f1660x;
            this.f1661y = bVar.f1661y;
            this.f1662z = bVar.f1662z;
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
            this.f1622a0 = bVar.f1622a0;
            this.f1623b0 = bVar.f1623b0;
            this.f1625c0 = bVar.f1625c0;
            this.f1627d0 = bVar.f1627d0;
            this.f1629e0 = bVar.f1629e0;
            this.f1631f0 = bVar.f1631f0;
            this.f1633g0 = bVar.f1633g0;
            this.f1635h0 = bVar.f1635h0;
            this.f1637i0 = bVar.f1637i0;
            this.f1639j0 = bVar.f1639j0;
            this.f1645m0 = bVar.f1645m0;
            int[] iArr = bVar.f1641k0;
            if (iArr == null || bVar.f1643l0 != null) {
                this.f1641k0 = null;
            } else {
                this.f1641k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1643l0 = bVar.f1643l0;
            this.f1647n0 = bVar.f1647n0;
            this.f1649o0 = bVar.f1649o0;
            this.f1651p0 = bVar.f1651p0;
            this.f1653q0 = bVar.f1653q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f17668b5);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1620r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1654r = c.v(typedArrayObtainStyledAttributes, index, this.f1654r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1652q = c.v(typedArrayObtainStyledAttributes, index, this.f1652q);
                        break;
                    case 4:
                        this.f1650p = c.v(typedArrayObtainStyledAttributes, index, this.f1650p);
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
                        this.f1660x = c.v(typedArrayObtainStyledAttributes, index, this.f1660x);
                        break;
                    case 10:
                        this.f1659w = c.v(typedArrayObtainStyledAttributes, index, this.f1659w);
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
                        this.f1630f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1630f);
                        break;
                    case 18:
                        this.f1632g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1632g);
                        break;
                    case 19:
                        this.f1634h = typedArrayObtainStyledAttributes.getFloat(index, this.f1634h);
                        break;
                    case 20:
                        this.f1661y = typedArrayObtainStyledAttributes.getFloat(index, this.f1661y);
                        break;
                    case 21:
                        this.f1628e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1628e);
                        break;
                    case 22:
                        this.f1626d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1626d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1638j = c.v(typedArrayObtainStyledAttributes, index, this.f1638j);
                        break;
                    case 25:
                        this.f1640k = c.v(typedArrayObtainStyledAttributes, index, this.f1640k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1642l = c.v(typedArrayObtainStyledAttributes, index, this.f1642l);
                        break;
                    case 29:
                        this.f1644m = c.v(typedArrayObtainStyledAttributes, index, this.f1644m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1657u = c.v(typedArrayObtainStyledAttributes, index, this.f1657u);
                        break;
                    case 32:
                        this.f1658v = c.v(typedArrayObtainStyledAttributes, index, this.f1658v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1648o = c.v(typedArrayObtainStyledAttributes, index, this.f1648o);
                        break;
                    case 35:
                        this.f1646n = c.v(typedArrayObtainStyledAttributes, index, this.f1646n);
                        break;
                    case 36:
                        this.f1662z = typedArrayObtainStyledAttributes.getFloat(index, this.f1662z);
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
                                        this.f1631f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1633g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1635h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1635h0);
                                        break;
                                    case 73:
                                        this.f1637i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1637i0);
                                        break;
                                    case 74:
                                        this.f1643l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1651p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1651p0);
                                        break;
                                    case 76:
                                        this.f1653q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1653q0);
                                        break;
                                    case 77:
                                        this.f1655s = c.v(typedArrayObtainStyledAttributes, index, this.f1655s);
                                        break;
                                    case 78:
                                        this.f1656t = c.v(typedArrayObtainStyledAttributes, index, this.f1656t);
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
                                        this.f1622a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1622a0);
                                        break;
                                    case 83:
                                        this.f1625c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1625c0);
                                        break;
                                    case 84:
                                        this.f1623b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1623b0);
                                        break;
                                    case 85:
                                        this.f1629e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1629e0);
                                        break;
                                    case 86:
                                        this.f1627d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1627d0);
                                        break;
                                    case 87:
                                        this.f1647n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1647n0);
                                        break;
                                    case 88:
                                        this.f1649o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1649o0);
                                        break;
                                    case 89:
                                        this.f1645m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1636i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1636i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1620r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1620r0.get(index));
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
    public static class C0024c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1663o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1664a = false;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1665c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1666d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1667e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1668f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1669g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1670h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1671i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1672j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1673k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1674l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1675m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1676n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1663o = sparseIntArray;
            sparseIntArray.append(g2.d.f17828t6, 1);
            f1663o.append(g2.d.f17843v6, 2);
            f1663o.append(g2.d.f17874z6, 3);
            f1663o.append(g2.d.f17820s6, 4);
            f1663o.append(g2.d.f17812r6, 5);
            f1663o.append(g2.d.f17804q6, 6);
            f1663o.append(g2.d.f17836u6, 7);
            f1663o.append(g2.d.f17866y6, 8);
            f1663o.append(g2.d.f17858x6, 9);
            f1663o.append(g2.d.f17850w6, 10);
        }

        public void a(C0024c c0024c) {
            this.f1664a = c0024c.f1664a;
            this.b = c0024c.b;
            this.f1666d = c0024c.f1666d;
            this.f1667e = c0024c.f1667e;
            this.f1668f = c0024c.f1668f;
            this.f1671i = c0024c.f1671i;
            this.f1669g = c0024c.f1669g;
            this.f1670h = c0024c.f1670h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f17795p6);
            this.f1664a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1663o.get(index)) {
                    case 1:
                        this.f1671i = typedArrayObtainStyledAttributes.getFloat(index, this.f1671i);
                        break;
                    case 2:
                        this.f1667e = typedArrayObtainStyledAttributes.getInt(index, this.f1667e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1666d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f1666d = a2.b.f79c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f1668f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.v(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f1665c = typedArrayObtainStyledAttributes.getInteger(index, this.f1665c);
                        break;
                    case 7:
                        this.f1669g = typedArrayObtainStyledAttributes.getFloat(index, this.f1669g);
                        break;
                    case 8:
                        this.f1673k = typedArrayObtainStyledAttributes.getInteger(index, this.f1673k);
                        break;
                    case 9:
                        this.f1672j = typedArrayObtainStyledAttributes.getFloat(index, this.f1672j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1676n = resourceId;
                            if (resourceId != -1) {
                                this.f1675m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1674l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1676n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1675m = -2;
                            } else {
                                this.f1675m = -1;
                            }
                        } else {
                            this.f1675m = typedArrayObtainStyledAttributes.getInteger(index, this.f1676n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1677a = false;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1678c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1679d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1680e = Float.NaN;

        public void a(d dVar) {
            this.f1677a = dVar.f1677a;
            this.b = dVar.b;
            this.f1679d = dVar.f1679d;
            this.f1680e = dVar.f1680e;
            this.f1678c = dVar.f1678c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.K6);
            this.f1677a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g2.d.M6) {
                    this.f1679d = typedArrayObtainStyledAttributes.getFloat(index, this.f1679d);
                } else if (index == g2.d.L6) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = c.f1594g[this.b];
                } else if (index == g2.d.O6) {
                    this.f1678c = typedArrayObtainStyledAttributes.getInt(index, this.f1678c);
                } else if (index == g2.d.N6) {
                    this.f1680e = typedArrayObtainStyledAttributes.getFloat(index, this.f1680e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1681o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1682a = false;
        public float b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1683c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1684d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1685e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1686f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1687g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1688h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1689i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1690j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1691k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1692l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1693m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1694n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1681o = sparseIntArray;
            sparseIntArray.append(g2.d.f17670b7, 1);
            f1681o.append(g2.d.f17679c7, 2);
            f1681o.append(g2.d.f17688d7, 3);
            f1681o.append(g2.d.Z6, 4);
            f1681o.append(g2.d.f17662a7, 5);
            f1681o.append(g2.d.V6, 6);
            f1681o.append(g2.d.W6, 7);
            f1681o.append(g2.d.X6, 8);
            f1681o.append(g2.d.Y6, 9);
            f1681o.append(g2.d.f17697e7, 10);
            f1681o.append(g2.d.f17706f7, 11);
            f1681o.append(g2.d.f17715g7, 12);
        }

        public void a(e eVar) {
            this.f1682a = eVar.f1682a;
            this.b = eVar.b;
            this.f1683c = eVar.f1683c;
            this.f1684d = eVar.f1684d;
            this.f1685e = eVar.f1685e;
            this.f1686f = eVar.f1686f;
            this.f1687g = eVar.f1687g;
            this.f1688h = eVar.f1688h;
            this.f1689i = eVar.f1689i;
            this.f1690j = eVar.f1690j;
            this.f1691k = eVar.f1691k;
            this.f1692l = eVar.f1692l;
            this.f1693m = eVar.f1693m;
            this.f1694n = eVar.f1694n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.U6);
            this.f1682a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1681o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.f1683c = typedArrayObtainStyledAttributes.getFloat(index, this.f1683c);
                        break;
                    case 3:
                        this.f1684d = typedArrayObtainStyledAttributes.getFloat(index, this.f1684d);
                        break;
                    case 4:
                        this.f1685e = typedArrayObtainStyledAttributes.getFloat(index, this.f1685e);
                        break;
                    case 5:
                        this.f1686f = typedArrayObtainStyledAttributes.getFloat(index, this.f1686f);
                        break;
                    case 6:
                        this.f1687g = typedArrayObtainStyledAttributes.getDimension(index, this.f1687g);
                        break;
                    case 7:
                        this.f1688h = typedArrayObtainStyledAttributes.getDimension(index, this.f1688h);
                        break;
                    case 8:
                        this.f1690j = typedArrayObtainStyledAttributes.getDimension(index, this.f1690j);
                        break;
                    case 9:
                        this.f1691k = typedArrayObtainStyledAttributes.getDimension(index, this.f1691k);
                        break;
                    case 10:
                        this.f1692l = typedArrayObtainStyledAttributes.getDimension(index, this.f1692l);
                        break;
                    case 11:
                        this.f1693m = true;
                        this.f1694n = typedArrayObtainStyledAttributes.getDimension(index, this.f1694n);
                        break;
                    case 12:
                        this.f1689i = c.v(typedArrayObtainStyledAttributes, index, this.f1689i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1595h.append(g2.d.f17726i0, 25);
        f1595h.append(g2.d.f17735j0, 26);
        f1595h.append(g2.d.f17753l0, 29);
        f1595h.append(g2.d.f17762m0, 30);
        f1595h.append(g2.d.f17814s0, 36);
        f1595h.append(g2.d.f17806r0, 35);
        f1595h.append(g2.d.P, 4);
        f1595h.append(g2.d.O, 3);
        f1595h.append(g2.d.K, 1);
        f1595h.append(g2.d.M, 91);
        f1595h.append(g2.d.L, 92);
        f1595h.append(g2.d.B0, 6);
        f1595h.append(g2.d.C0, 7);
        f1595h.append(g2.d.W, 17);
        f1595h.append(g2.d.X, 18);
        f1595h.append(g2.d.Y, 19);
        f1595h.append(g2.d.G, 99);
        f1595h.append(g2.d.f17671c, 27);
        f1595h.append(g2.d.f17771n0, 32);
        f1595h.append(g2.d.f17780o0, 33);
        f1595h.append(g2.d.V, 10);
        f1595h.append(g2.d.U, 9);
        f1595h.append(g2.d.F0, 13);
        f1595h.append(g2.d.I0, 16);
        f1595h.append(g2.d.G0, 14);
        f1595h.append(g2.d.D0, 11);
        f1595h.append(g2.d.H0, 15);
        f1595h.append(g2.d.E0, 12);
        f1595h.append(g2.d.f17838v0, 40);
        f1595h.append(g2.d.f17708g0, 39);
        f1595h.append(g2.d.f17699f0, 41);
        f1595h.append(g2.d.f17830u0, 42);
        f1595h.append(g2.d.f17690e0, 20);
        f1595h.append(g2.d.f17822t0, 37);
        f1595h.append(g2.d.T, 5);
        f1595h.append(g2.d.f17717h0, 87);
        f1595h.append(g2.d.f17798q0, 87);
        f1595h.append(g2.d.f17744k0, 87);
        f1595h.append(g2.d.N, 87);
        f1595h.append(g2.d.J, 87);
        f1595h.append(g2.d.f17716h, 24);
        f1595h.append(g2.d.f17734j, 28);
        f1595h.append(g2.d.f17837v, 31);
        f1595h.append(g2.d.f17844w, 8);
        f1595h.append(g2.d.f17725i, 34);
        f1595h.append(g2.d.f17743k, 2);
        f1595h.append(g2.d.f17698f, 23);
        f1595h.append(g2.d.f17707g, 21);
        f1595h.append(g2.d.f17845w0, 95);
        f1595h.append(g2.d.Z, 96);
        f1595h.append(g2.d.f17689e, 22);
        f1595h.append(g2.d.f17752l, 43);
        f1595h.append(g2.d.f17859y, 44);
        f1595h.append(g2.d.f17821t, 45);
        f1595h.append(g2.d.f17829u, 46);
        f1595h.append(g2.d.f17813s, 60);
        f1595h.append(g2.d.f17797q, 47);
        f1595h.append(g2.d.f17805r, 48);
        f1595h.append(g2.d.f17761m, 49);
        f1595h.append(g2.d.f17770n, 50);
        f1595h.append(g2.d.f17779o, 51);
        f1595h.append(g2.d.f17788p, 52);
        f1595h.append(g2.d.f17851x, 53);
        f1595h.append(g2.d.f17852x0, 54);
        f1595h.append(g2.d.f17655a0, 55);
        f1595h.append(g2.d.f17860y0, 56);
        f1595h.append(g2.d.f17663b0, 57);
        f1595h.append(g2.d.f17868z0, 58);
        f1595h.append(g2.d.f17672c0, 59);
        f1595h.append(g2.d.Q, 61);
        f1595h.append(g2.d.S, 62);
        f1595h.append(g2.d.R, 63);
        f1595h.append(g2.d.f17867z, 64);
        f1595h.append(g2.d.S0, 65);
        f1595h.append(g2.d.F, 66);
        f1595h.append(g2.d.T0, 67);
        f1595h.append(g2.d.L0, 79);
        f1595h.append(g2.d.f17680d, 38);
        f1595h.append(g2.d.K0, 68);
        f1595h.append(g2.d.A0, 69);
        f1595h.append(g2.d.f17681d0, 70);
        f1595h.append(g2.d.J0, 97);
        f1595h.append(g2.d.D, 71);
        f1595h.append(g2.d.B, 72);
        f1595h.append(g2.d.C, 73);
        f1595h.append(g2.d.E, 74);
        f1595h.append(g2.d.A, 75);
        f1595h.append(g2.d.M0, 76);
        f1595h.append(g2.d.f17789p0, 77);
        f1595h.append(g2.d.U0, 78);
        f1595h.append(g2.d.I, 80);
        f1595h.append(g2.d.H, 81);
        f1595h.append(g2.d.N0, 82);
        f1595h.append(g2.d.R0, 83);
        f1595h.append(g2.d.Q0, 84);
        f1595h.append(g2.d.P0, 85);
        f1595h.append(g2.d.O0, 86);
        SparseIntArray sparseIntArray = f1596i;
        int i10 = g2.d.Y3;
        sparseIntArray.append(i10, 6);
        f1596i.append(i10, 7);
        f1596i.append(g2.d.T2, 27);
        f1596i.append(g2.d.f17667b4, 13);
        f1596i.append(g2.d.f17694e4, 16);
        f1596i.append(g2.d.f17676c4, 14);
        f1596i.append(g2.d.Z3, 11);
        f1596i.append(g2.d.f17685d4, 15);
        f1596i.append(g2.d.f17659a4, 12);
        f1596i.append(g2.d.S3, 40);
        f1596i.append(g2.d.L3, 39);
        f1596i.append(g2.d.K3, 41);
        f1596i.append(g2.d.R3, 42);
        f1596i.append(g2.d.J3, 20);
        f1596i.append(g2.d.Q3, 37);
        f1596i.append(g2.d.D3, 5);
        f1596i.append(g2.d.M3, 87);
        f1596i.append(g2.d.P3, 87);
        f1596i.append(g2.d.N3, 87);
        f1596i.append(g2.d.A3, 87);
        f1596i.append(g2.d.f17871z3, 87);
        f1596i.append(g2.d.Y2, 24);
        f1596i.append(g2.d.f17658a3, 28);
        f1596i.append(g2.d.f17765m3, 31);
        f1596i.append(g2.d.f17774n3, 8);
        f1596i.append(g2.d.Z2, 34);
        f1596i.append(g2.d.f17666b3, 2);
        f1596i.append(g2.d.W2, 23);
        f1596i.append(g2.d.X2, 21);
        f1596i.append(g2.d.T3, 95);
        f1596i.append(g2.d.E3, 96);
        f1596i.append(g2.d.V2, 22);
        f1596i.append(g2.d.f17675c3, 43);
        f1596i.append(g2.d.f17792p3, 44);
        f1596i.append(g2.d.f17747k3, 45);
        f1596i.append(g2.d.f17756l3, 46);
        f1596i.append(g2.d.f17738j3, 60);
        f1596i.append(g2.d.f17720h3, 47);
        f1596i.append(g2.d.f17729i3, 48);
        f1596i.append(g2.d.f17684d3, 49);
        f1596i.append(g2.d.f17693e3, 50);
        f1596i.append(g2.d.f17702f3, 51);
        f1596i.append(g2.d.f17711g3, 52);
        f1596i.append(g2.d.f17783o3, 53);
        f1596i.append(g2.d.U3, 54);
        f1596i.append(g2.d.F3, 55);
        f1596i.append(g2.d.V3, 56);
        f1596i.append(g2.d.G3, 57);
        f1596i.append(g2.d.W3, 58);
        f1596i.append(g2.d.H3, 59);
        f1596i.append(g2.d.C3, 62);
        f1596i.append(g2.d.B3, 63);
        f1596i.append(g2.d.f17801q3, 64);
        f1596i.append(g2.d.f17793p4, 65);
        f1596i.append(g2.d.f17848w3, 66);
        f1596i.append(g2.d.f17802q4, 67);
        f1596i.append(g2.d.f17721h4, 79);
        f1596i.append(g2.d.U2, 38);
        f1596i.append(g2.d.f17730i4, 98);
        f1596i.append(g2.d.f17712g4, 68);
        f1596i.append(g2.d.X3, 69);
        f1596i.append(g2.d.I3, 70);
        f1596i.append(g2.d.f17833u3, 71);
        f1596i.append(g2.d.f17817s3, 72);
        f1596i.append(g2.d.f17825t3, 73);
        f1596i.append(g2.d.f17841v3, 74);
        f1596i.append(g2.d.f17809r3, 75);
        f1596i.append(g2.d.f17739j4, 76);
        f1596i.append(g2.d.O3, 77);
        f1596i.append(g2.d.f17810r4, 78);
        f1596i.append(g2.d.f17863y3, 80);
        f1596i.append(g2.d.f17855x3, 81);
        f1596i.append(g2.d.f17748k4, 82);
        f1596i.append(g2.d.f17784o4, 83);
        f1596i.append(g2.d.f17775n4, 84);
        f1596i.append(g2.d.f17766m4, 85);
        f1596i.append(g2.d.f17757l4, 86);
        f1596i.append(g2.d.f17703f4, 97);
    }

    public static void A(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0023a c0023a = new a.C0023a();
        aVar.f1608h = c0023a;
        aVar.f1604d.f1664a = false;
        aVar.f1605e.b = false;
        aVar.f1603c.f1677a = false;
        aVar.f1606f.f1682a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1596i.get(index)) {
                case 2:
                    c0023a.b(2, typedArray.getDimensionPixelSize(index, aVar.f1605e.K));
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
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1595h.get(index));
                    break;
                case 5:
                    c0023a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0023a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1605e.E));
                    break;
                case 7:
                    c0023a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1605e.F));
                    break;
                case 8:
                    c0023a.b(8, typedArray.getDimensionPixelSize(index, aVar.f1605e.L));
                    break;
                case 11:
                    c0023a.b(11, typedArray.getDimensionPixelSize(index, aVar.f1605e.R));
                    break;
                case 12:
                    c0023a.b(12, typedArray.getDimensionPixelSize(index, aVar.f1605e.S));
                    break;
                case 13:
                    c0023a.b(13, typedArray.getDimensionPixelSize(index, aVar.f1605e.O));
                    break;
                case 14:
                    c0023a.b(14, typedArray.getDimensionPixelSize(index, aVar.f1605e.Q));
                    break;
                case 15:
                    c0023a.b(15, typedArray.getDimensionPixelSize(index, aVar.f1605e.T));
                    break;
                case 16:
                    c0023a.b(16, typedArray.getDimensionPixelSize(index, aVar.f1605e.P));
                    break;
                case 17:
                    c0023a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1605e.f1630f));
                    break;
                case 18:
                    c0023a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1605e.f1632g));
                    break;
                case 19:
                    c0023a.a(19, typedArray.getFloat(index, aVar.f1605e.f1634h));
                    break;
                case 20:
                    c0023a.a(20, typedArray.getFloat(index, aVar.f1605e.f1661y));
                    break;
                case 21:
                    c0023a.b(21, typedArray.getLayoutDimension(index, aVar.f1605e.f1628e));
                    break;
                case 22:
                    c0023a.b(22, f1594g[typedArray.getInt(index, aVar.f1603c.b)]);
                    break;
                case 23:
                    c0023a.b(23, typedArray.getLayoutDimension(index, aVar.f1605e.f1626d));
                    break;
                case 24:
                    c0023a.b(24, typedArray.getDimensionPixelSize(index, aVar.f1605e.H));
                    break;
                case 27:
                    c0023a.b(27, typedArray.getInt(index, aVar.f1605e.G));
                    break;
                case 28:
                    c0023a.b(28, typedArray.getDimensionPixelSize(index, aVar.f1605e.I));
                    break;
                case 31:
                    c0023a.b(31, typedArray.getDimensionPixelSize(index, aVar.f1605e.M));
                    break;
                case 34:
                    c0023a.b(34, typedArray.getDimensionPixelSize(index, aVar.f1605e.J));
                    break;
                case 37:
                    c0023a.a(37, typedArray.getFloat(index, aVar.f1605e.f1662z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1602a);
                    aVar.f1602a = resourceId;
                    c0023a.b(38, resourceId);
                    break;
                case 39:
                    c0023a.a(39, typedArray.getFloat(index, aVar.f1605e.W));
                    break;
                case 40:
                    c0023a.a(40, typedArray.getFloat(index, aVar.f1605e.V));
                    break;
                case 41:
                    c0023a.b(41, typedArray.getInt(index, aVar.f1605e.X));
                    break;
                case 42:
                    c0023a.b(42, typedArray.getInt(index, aVar.f1605e.Y));
                    break;
                case 43:
                    c0023a.a(43, typedArray.getFloat(index, aVar.f1603c.f1679d));
                    break;
                case 44:
                    c0023a.d(44, true);
                    c0023a.a(44, typedArray.getDimension(index, aVar.f1606f.f1694n));
                    break;
                case 45:
                    c0023a.a(45, typedArray.getFloat(index, aVar.f1606f.f1683c));
                    break;
                case 46:
                    c0023a.a(46, typedArray.getFloat(index, aVar.f1606f.f1684d));
                    break;
                case 47:
                    c0023a.a(47, typedArray.getFloat(index, aVar.f1606f.f1685e));
                    break;
                case 48:
                    c0023a.a(48, typedArray.getFloat(index, aVar.f1606f.f1686f));
                    break;
                case 49:
                    c0023a.a(49, typedArray.getDimension(index, aVar.f1606f.f1687g));
                    break;
                case 50:
                    c0023a.a(50, typedArray.getDimension(index, aVar.f1606f.f1688h));
                    break;
                case 51:
                    c0023a.a(51, typedArray.getDimension(index, aVar.f1606f.f1690j));
                    break;
                case 52:
                    c0023a.a(52, typedArray.getDimension(index, aVar.f1606f.f1691k));
                    break;
                case 53:
                    c0023a.a(53, typedArray.getDimension(index, aVar.f1606f.f1692l));
                    break;
                case 54:
                    c0023a.b(54, typedArray.getInt(index, aVar.f1605e.Z));
                    break;
                case 55:
                    c0023a.b(55, typedArray.getInt(index, aVar.f1605e.f1622a0));
                    break;
                case 56:
                    c0023a.b(56, typedArray.getDimensionPixelSize(index, aVar.f1605e.f1623b0));
                    break;
                case 57:
                    c0023a.b(57, typedArray.getDimensionPixelSize(index, aVar.f1605e.f1625c0));
                    break;
                case 58:
                    c0023a.b(58, typedArray.getDimensionPixelSize(index, aVar.f1605e.f1627d0));
                    break;
                case 59:
                    c0023a.b(59, typedArray.getDimensionPixelSize(index, aVar.f1605e.f1629e0));
                    break;
                case 60:
                    c0023a.a(60, typedArray.getFloat(index, aVar.f1606f.b));
                    break;
                case 62:
                    c0023a.b(62, typedArray.getDimensionPixelSize(index, aVar.f1605e.C));
                    break;
                case 63:
                    c0023a.a(63, typedArray.getFloat(index, aVar.f1605e.D));
                    break;
                case 64:
                    c0023a.b(64, v(typedArray, index, aVar.f1604d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0023a.c(65, typedArray.getString(index));
                    } else {
                        c0023a.c(65, a2.b.f79c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0023a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0023a.a(67, typedArray.getFloat(index, aVar.f1604d.f1671i));
                    break;
                case 68:
                    c0023a.a(68, typedArray.getFloat(index, aVar.f1603c.f1680e));
                    break;
                case 69:
                    c0023a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0023a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0023a.b(72, typedArray.getInt(index, aVar.f1605e.f1635h0));
                    break;
                case 73:
                    c0023a.b(73, typedArray.getDimensionPixelSize(index, aVar.f1605e.f1637i0));
                    break;
                case 74:
                    c0023a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0023a.d(75, typedArray.getBoolean(index, aVar.f1605e.f1651p0));
                    break;
                case 76:
                    c0023a.b(76, typedArray.getInt(index, aVar.f1604d.f1667e));
                    break;
                case 77:
                    c0023a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0023a.b(78, typedArray.getInt(index, aVar.f1603c.f1678c));
                    break;
                case 79:
                    c0023a.a(79, typedArray.getFloat(index, aVar.f1604d.f1669g));
                    break;
                case 80:
                    c0023a.d(80, typedArray.getBoolean(index, aVar.f1605e.f1647n0));
                    break;
                case 81:
                    c0023a.d(81, typedArray.getBoolean(index, aVar.f1605e.f1649o0));
                    break;
                case 82:
                    c0023a.b(82, typedArray.getInteger(index, aVar.f1604d.f1665c));
                    break;
                case 83:
                    c0023a.b(83, v(typedArray, index, aVar.f1606f.f1689i));
                    break;
                case 84:
                    c0023a.b(84, typedArray.getInteger(index, aVar.f1604d.f1673k));
                    break;
                case 85:
                    c0023a.a(85, typedArray.getFloat(index, aVar.f1604d.f1672j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1604d.f1676n = typedArray.getResourceId(index, -1);
                        c0023a.b(89, aVar.f1604d.f1676n);
                        C0024c c0024c = aVar.f1604d;
                        if (c0024c.f1676n != -1) {
                            c0024c.f1675m = -2;
                            c0023a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f1604d.f1674l = typedArray.getString(index);
                        c0023a.c(90, aVar.f1604d.f1674l);
                        if (aVar.f1604d.f1674l.indexOf("/") > 0) {
                            aVar.f1604d.f1676n = typedArray.getResourceId(index, -1);
                            c0023a.b(89, aVar.f1604d.f1676n);
                            aVar.f1604d.f1675m = -2;
                            c0023a.b(88, -2);
                        } else {
                            aVar.f1604d.f1675m = -1;
                            c0023a.b(88, -1);
                        }
                    } else {
                        C0024c c0024c2 = aVar.f1604d;
                        c0024c2.f1675m = typedArray.getInteger(index, c0024c2.f1676n);
                        c0023a.b(88, aVar.f1604d.f1675m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1595h.get(index));
                    break;
                case 93:
                    c0023a.b(93, typedArray.getDimensionPixelSize(index, aVar.f1605e.N));
                    break;
                case 94:
                    c0023a.b(94, typedArray.getDimensionPixelSize(index, aVar.f1605e.U));
                    break;
                case 95:
                    w(c0023a, typedArray, index, 0);
                    break;
                case 96:
                    w(c0023a, typedArray, index, 1);
                    break;
                case 97:
                    c0023a.b(97, typedArray.getInt(index, aVar.f1605e.f1653q0));
                    break;
                case 98:
                    if (j.f16121v0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1602a);
                        aVar.f1602a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.f1602a = typedArray.getResourceId(index, aVar.f1602a);
                    }
                    break;
                case 99:
                    c0023a.d(99, typedArray.getBoolean(index, aVar.f1605e.f1636i));
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
        a.C0023a c0023a;
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
                    bVar2.f1515a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f1516b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f1626d = i13;
                    bVar.f1647n0 = z10;
                    return;
                } else {
                    bVar.f1628e = i13;
                    bVar.f1649o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0023a) {
                c0023a = (a.C0023a) obj;
                if (i11 == 0) {
                    c0023a.b(23, i13);
                    c0023a.d(80, z10);
                } else {
                    c0023a.b(21, i13);
                    c0023a.d(81, z10);
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
                bVar2.f1515a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f1516b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f1626d = i13;
                bVar.f1647n0 = z10;
                return;
            } else {
                bVar.f1628e = i13;
                bVar.f1649o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0023a) {
            c0023a = (a.C0023a) obj;
            if (i11 == 0) {
                c0023a.b(23, i13);
                c0023a.d(80, z10);
            } else {
                c0023a.b(21, i13);
                c0023a.d(81, z10);
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
                    if (obj instanceof a.C0023a) {
                        ((a.C0023a) obj).c(5, strTrim2);
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
                            bVar3.f1626d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f1628e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0023a) {
                        a.C0023a c0023a = (a.C0023a) obj;
                        if (i10 == 0) {
                            c0023a.b(23, 0);
                            c0023a.a(39, f10);
                            return;
                        } else {
                            c0023a.b(21, 0);
                            c0023a.a(40, f10);
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
                            bVar5.f1626d = 0;
                            bVar5.f1631f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1628e = 0;
                            bVar5.f1633g0 = fMax;
                            bVar5.f1622a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0023a) {
                        a.C0023a c0023a2 = (a.C0023a) obj;
                        if (i10 == 0) {
                            c0023a2.b(23, 0);
                            c0023a2.b(54, 2);
                        } else {
                            c0023a2.b(21, 0);
                            c0023a2.b(55, 2);
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
        s(i10).f1605e.f1661y = f10;
    }

    public void C(int i10, int i11) {
        s(i10).f1605e.X = i11;
    }

    public void D(int i10, float f10) {
        s(i10).f1605e.W = f10;
    }

    public void E(int i10, int i11, int i12) {
        a aVarS = s(i10);
        switch (i11) {
            case 1:
                aVarS.f1605e.H = i12;
                return;
            case 2:
                aVarS.f1605e.I = i12;
                return;
            case 3:
                aVarS.f1605e.J = i12;
                return;
            case 4:
                aVarS.f1605e.K = i12;
                return;
            case 5:
                aVarS.f1605e.N = i12;
                return;
            case 6:
                aVarS.f1605e.M = i12;
                return;
            case 7:
                aVarS.f1605e.L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F(int i10, float f10) {
        s(i10).f1605e.f1662z = f10;
    }

    public void G(int i10, int i11) {
        s(i10).f1605e.Y = i11;
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
        HashSet<Integer> hashSet = new HashSet(this.f1601f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1601f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + f2.a.b(childAt));
            } else {
                if (this.f1600e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f1601f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f1601f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1605e.f1639j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f1605e.f1635h0);
                                barrier.setMargin(aVar.f1605e.f1637i0);
                                barrier.setAllowsGoneWidget(aVar.f1605e.f1651p0);
                                b bVar = aVar.f1605e;
                                int[] iArr = bVar.f1641k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1643l0;
                                    if (str != null) {
                                        bVar.f1641k0 = p(barrier, str);
                                        barrier.setReferencedIds(aVar.f1605e.f1641k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.f1607g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1603c;
                            if (dVar.f1678c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.f1603c.f1679d);
                            childAt.setRotation(aVar.f1606f.b);
                            childAt.setRotationX(aVar.f1606f.f1683c);
                            childAt.setRotationY(aVar.f1606f.f1684d);
                            childAt.setScaleX(aVar.f1606f.f1685e);
                            childAt.setScaleY(aVar.f1606f.f1686f);
                            e eVar = aVar.f1606f;
                            if (eVar.f1689i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f1606f.f1689i);
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
                                if (!Float.isNaN(eVar.f1687g)) {
                                    childAt.setPivotX(aVar.f1606f.f1687g);
                                }
                                if (!Float.isNaN(aVar.f1606f.f1688h)) {
                                    childAt.setPivotY(aVar.f1606f.f1688h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1606f.f1690j);
                            childAt.setTranslationY(aVar.f1606f.f1691k);
                            childAt.setTranslationZ(aVar.f1606f.f1692l);
                            e eVar2 = aVar.f1606f;
                            if (eVar2.f1693m) {
                                childAt.setElevation(eVar2.f1694n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f1601f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1605e.f1639j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1605e;
                    int[] iArr2 = bVar3.f1641k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1643l0;
                        if (str2 != null) {
                            bVar3.f1641k0 = p(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1605e.f1641k0);
                        }
                    }
                    barrier2.setType(aVar2.f1605e.f1635h0);
                    barrier2.setMargin(aVar2.f1605e.f1637i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1605e.f1621a) {
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
        this.f1601f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1600e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1601f.containsKey(Integer.valueOf(id2))) {
                this.f1601f.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f1601f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f1607g = androidx.constraintlayout.widget.a.a(this.f1599d, childAt);
                aVar.f(id2, bVar);
                aVar.f1603c.b = childAt.getVisibility();
                aVar.f1603c.f1679d = childAt.getAlpha();
                aVar.f1606f.b = childAt.getRotation();
                aVar.f1606f.f1683c = childAt.getRotationX();
                aVar.f1606f.f1684d = childAt.getRotationY();
                aVar.f1606f.f1685e = childAt.getScaleX();
                aVar.f1606f.f1686f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1606f;
                    eVar.f1687g = pivotX;
                    eVar.f1688h = pivotY;
                }
                aVar.f1606f.f1690j = childAt.getTranslationX();
                aVar.f1606f.f1691k = childAt.getTranslationY();
                aVar.f1606f.f1692l = childAt.getTranslationZ();
                e eVar2 = aVar.f1606f;
                if (eVar2.f1693m) {
                    eVar2.f1694n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1605e.f1651p0 = barrier.getAllowsGoneWidget();
                    aVar.f1605e.f1641k0 = barrier.getReferencedIds();
                    aVar.f1605e.f1635h0 = barrier.getType();
                    aVar.f1605e.f1637i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.f1601f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            androidx.constraintlayout.widget.d.a aVar = (androidx.constraintlayout.widget.d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1600e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1601f.containsKey(Integer.valueOf(id2))) {
                this.f1601f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f1601f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (!this.f1601f.containsKey(Integer.valueOf(i10))) {
            this.f1601f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1601f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1605e;
                    bVar.f1638j = i12;
                    bVar.f1640k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f1605e;
                    bVar2.f1640k = i12;
                    bVar2.f1638j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + H(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1605e;
                    bVar3.f1642l = i12;
                    bVar3.f1644m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f1605e;
                    bVar4.f1644m = i12;
                    bVar4.f1642l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1605e;
                    bVar5.f1646n = i12;
                    bVar5.f1648o = -1;
                    bVar5.f1654r = -1;
                    bVar5.f1655s = -1;
                    bVar5.f1656t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar6 = aVar.f1605e;
                bVar6.f1648o = i12;
                bVar6.f1646n = -1;
                bVar6.f1654r = -1;
                bVar6.f1655s = -1;
                bVar6.f1656t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1605e;
                    bVar7.f1652q = i12;
                    bVar7.f1650p = -1;
                    bVar7.f1654r = -1;
                    bVar7.f1655s = -1;
                    bVar7.f1656t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar8 = aVar.f1605e;
                bVar8.f1650p = i12;
                bVar8.f1652q = -1;
                bVar8.f1654r = -1;
                bVar8.f1655s = -1;
                bVar8.f1656t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1605e;
                    bVar9.f1654r = i12;
                    bVar9.f1652q = -1;
                    bVar9.f1650p = -1;
                    bVar9.f1646n = -1;
                    bVar9.f1648o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1605e;
                    bVar10.f1655s = i12;
                    bVar10.f1652q = -1;
                    bVar10.f1650p = -1;
                    bVar10.f1646n = -1;
                    bVar10.f1648o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1605e;
                bVar11.f1656t = i12;
                bVar11.f1652q = -1;
                bVar11.f1650p = -1;
                bVar11.f1646n = -1;
                bVar11.f1648o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1605e;
                    bVar12.f1658v = i12;
                    bVar12.f1657u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f1605e;
                    bVar13.f1657u = i12;
                    bVar13.f1658v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1605e;
                    bVar14.f1660x = i12;
                    bVar14.f1659w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f1605e;
                    bVar15.f1659w = i12;
                    bVar15.f1660x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f1601f.containsKey(Integer.valueOf(i10))) {
            this.f1601f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1601f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f1605e;
                    bVar.f1638j = i12;
                    bVar.f1640k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + H(i13) + " undefined");
                    }
                    b bVar2 = aVar.f1605e;
                    bVar2.f1640k = i12;
                    bVar2.f1638j = -1;
                }
                aVar.f1605e.H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f1605e;
                    bVar3.f1642l = i12;
                    bVar3.f1644m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar4 = aVar.f1605e;
                    bVar4.f1644m = i12;
                    bVar4.f1642l = -1;
                }
                aVar.f1605e.I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f1605e;
                    bVar5.f1646n = i12;
                    bVar5.f1648o = -1;
                    bVar5.f1654r = -1;
                    bVar5.f1655s = -1;
                    bVar5.f1656t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar6 = aVar.f1605e;
                    bVar6.f1648o = i12;
                    bVar6.f1646n = -1;
                    bVar6.f1654r = -1;
                    bVar6.f1655s = -1;
                    bVar6.f1656t = -1;
                }
                aVar.f1605e.J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f1605e;
                    bVar7.f1652q = i12;
                    bVar7.f1650p = -1;
                    bVar7.f1654r = -1;
                    bVar7.f1655s = -1;
                    bVar7.f1656t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar8 = aVar.f1605e;
                    bVar8.f1650p = i12;
                    bVar8.f1652q = -1;
                    bVar8.f1654r = -1;
                    bVar8.f1655s = -1;
                    bVar8.f1656t = -1;
                }
                aVar.f1605e.K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f1605e;
                    bVar9.f1654r = i12;
                    bVar9.f1652q = -1;
                    bVar9.f1650p = -1;
                    bVar9.f1646n = -1;
                    bVar9.f1648o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f1605e;
                    bVar10.f1655s = i12;
                    bVar10.f1652q = -1;
                    bVar10.f1650p = -1;
                    bVar10.f1646n = -1;
                    bVar10.f1648o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                }
                b bVar11 = aVar.f1605e;
                bVar11.f1656t = i12;
                bVar11.f1652q = -1;
                bVar11.f1650p = -1;
                bVar11.f1646n = -1;
                bVar11.f1648o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f1605e;
                    bVar12.f1658v = i12;
                    bVar12.f1657u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar13 = aVar.f1605e;
                    bVar13.f1657u = i12;
                    bVar13.f1658v = -1;
                }
                aVar.f1605e.M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f1605e;
                    bVar14.f1660x = i12;
                    bVar14.f1659w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + H(i13) + " undefined");
                    }
                    b bVar15 = aVar.f1605e;
                    bVar15.f1659w = i12;
                    bVar15.f1660x = -1;
                }
                aVar.f1605e.L = i14;
                return;
            default:
                throw new IllegalArgumentException(H(i11) + " to " + H(i13) + " unknown");
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = s(i10).f1605e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void k(int i10, int i11) {
        s(i10).f1605e.Z = i11;
    }

    public void l(int i10, int i11) {
        s(i10).f1605e.f1628e = i11;
    }

    public void m(int i10, int i11) {
        s(i10).f1605e.f1626d = i11;
    }

    public void n(int i10, boolean z10) {
        s(i10).f1605e.f1649o0 = z10;
    }

    public void o(int i10, boolean z10) {
        s(i10).f1605e.f1647n0 = z10;
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
            s(iArr[0]).f1605e.V = fArr[0];
        }
        s(iArr[0]).f1605e.Y = i14;
        i(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            i(iArr[i15], 3, iArr[i16], 4, 0);
            i(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                s(iArr[i15]).f1605e.V = fArr[i15];
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
        if (!this.f1601f.containsKey(Integer.valueOf(i10))) {
            this.f1601f.put(Integer.valueOf(i10), new a());
        }
        return this.f1601f.get(Integer.valueOf(i10));
    }

    public void t(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarR = r(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarR.f1605e.f1621a = true;
                    }
                    this.f1601f.put(Integer.valueOf(aVarR.f1602a), aVarR);
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
                                aVarR.f1605e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1604d.b(context, Xml.asAttributeSet(xmlPullParser));
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
                                aVarR.f1603c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarR == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarR.f1606f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarR = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarR.f1605e;
                                bVar.f1621a = true;
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
                                aVarR.f1605e.f1639j0 = 1;
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
                    androidx.constraintlayout.widget.a.d(context, xmlPullParser, aVarR.f1607g);
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
                    this.f1601f.put(Integer.valueOf(aVarR.f1602a), aVarR);
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
            if (index != g2.d.f17680d && g2.d.f17837v != index && g2.d.f17844w != index) {
                aVar.f1604d.f1664a = true;
                aVar.f1605e.b = true;
                aVar.f1603c.f1677a = true;
                aVar.f1606f.f1682a = true;
            }
            switch (f1595h.get(index)) {
                case 1:
                    b bVar = aVar.f1605e;
                    bVar.f1654r = v(typedArray, index, bVar.f1654r);
                    break;
                case 2:
                    b bVar2 = aVar.f1605e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1605e;
                    bVar3.f1652q = v(typedArray, index, bVar3.f1652q);
                    break;
                case 4:
                    b bVar4 = aVar.f1605e;
                    bVar4.f1650p = v(typedArray, index, bVar4.f1650p);
                    break;
                case 5:
                    aVar.f1605e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1605e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1605e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f1605e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f1605e;
                    bVar8.f1660x = v(typedArray, index, bVar8.f1660x);
                    break;
                case 10:
                    b bVar9 = aVar.f1605e;
                    bVar9.f1659w = v(typedArray, index, bVar9.f1659w);
                    break;
                case 11:
                    b bVar10 = aVar.f1605e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1605e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1605e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1605e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1605e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1605e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1605e;
                    bVar16.f1630f = typedArray.getDimensionPixelOffset(index, bVar16.f1630f);
                    break;
                case 18:
                    b bVar17 = aVar.f1605e;
                    bVar17.f1632g = typedArray.getDimensionPixelOffset(index, bVar17.f1632g);
                    break;
                case 19:
                    b bVar18 = aVar.f1605e;
                    bVar18.f1634h = typedArray.getFloat(index, bVar18.f1634h);
                    break;
                case 20:
                    b bVar19 = aVar.f1605e;
                    bVar19.f1661y = typedArray.getFloat(index, bVar19.f1661y);
                    break;
                case 21:
                    b bVar20 = aVar.f1605e;
                    bVar20.f1628e = typedArray.getLayoutDimension(index, bVar20.f1628e);
                    break;
                case 22:
                    d dVar = aVar.f1603c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.f1603c;
                    dVar2.b = f1594g[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.f1605e;
                    bVar21.f1626d = typedArray.getLayoutDimension(index, bVar21.f1626d);
                    break;
                case 24:
                    b bVar22 = aVar.f1605e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1605e;
                    bVar23.f1638j = v(typedArray, index, bVar23.f1638j);
                    break;
                case 26:
                    b bVar24 = aVar.f1605e;
                    bVar24.f1640k = v(typedArray, index, bVar24.f1640k);
                    break;
                case 27:
                    b bVar25 = aVar.f1605e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1605e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1605e;
                    bVar27.f1642l = v(typedArray, index, bVar27.f1642l);
                    break;
                case 30:
                    b bVar28 = aVar.f1605e;
                    bVar28.f1644m = v(typedArray, index, bVar28.f1644m);
                    break;
                case 31:
                    b bVar29 = aVar.f1605e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f1605e;
                    bVar30.f1657u = v(typedArray, index, bVar30.f1657u);
                    break;
                case 33:
                    b bVar31 = aVar.f1605e;
                    bVar31.f1658v = v(typedArray, index, bVar31.f1658v);
                    break;
                case 34:
                    b bVar32 = aVar.f1605e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f1605e;
                    bVar33.f1648o = v(typedArray, index, bVar33.f1648o);
                    break;
                case 36:
                    b bVar34 = aVar.f1605e;
                    bVar34.f1646n = v(typedArray, index, bVar34.f1646n);
                    break;
                case 37:
                    b bVar35 = aVar.f1605e;
                    bVar35.f1662z = typedArray.getFloat(index, bVar35.f1662z);
                    break;
                case 38:
                    aVar.f1602a = typedArray.getResourceId(index, aVar.f1602a);
                    break;
                case 39:
                    b bVar36 = aVar.f1605e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f1605e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f1605e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f1605e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f1603c;
                    dVar3.f1679d = typedArray.getFloat(index, dVar3.f1679d);
                    break;
                case 44:
                    e eVar = aVar.f1606f;
                    eVar.f1693m = true;
                    eVar.f1694n = typedArray.getDimension(index, eVar.f1694n);
                    break;
                case 45:
                    e eVar2 = aVar.f1606f;
                    eVar2.f1683c = typedArray.getFloat(index, eVar2.f1683c);
                    break;
                case 46:
                    e eVar3 = aVar.f1606f;
                    eVar3.f1684d = typedArray.getFloat(index, eVar3.f1684d);
                    break;
                case 47:
                    e eVar4 = aVar.f1606f;
                    eVar4.f1685e = typedArray.getFloat(index, eVar4.f1685e);
                    break;
                case 48:
                    e eVar5 = aVar.f1606f;
                    eVar5.f1686f = typedArray.getFloat(index, eVar5.f1686f);
                    break;
                case 49:
                    e eVar6 = aVar.f1606f;
                    eVar6.f1687g = typedArray.getDimension(index, eVar6.f1687g);
                    break;
                case 50:
                    e eVar7 = aVar.f1606f;
                    eVar7.f1688h = typedArray.getDimension(index, eVar7.f1688h);
                    break;
                case 51:
                    e eVar8 = aVar.f1606f;
                    eVar8.f1690j = typedArray.getDimension(index, eVar8.f1690j);
                    break;
                case 52:
                    e eVar9 = aVar.f1606f;
                    eVar9.f1691k = typedArray.getDimension(index, eVar9.f1691k);
                    break;
                case 53:
                    e eVar10 = aVar.f1606f;
                    eVar10.f1692l = typedArray.getDimension(index, eVar10.f1692l);
                    break;
                case 54:
                    b bVar40 = aVar.f1605e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1605e;
                    bVar41.f1622a0 = typedArray.getInt(index, bVar41.f1622a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1605e;
                    bVar42.f1623b0 = typedArray.getDimensionPixelSize(index, bVar42.f1623b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1605e;
                    bVar43.f1625c0 = typedArray.getDimensionPixelSize(index, bVar43.f1625c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1605e;
                    bVar44.f1627d0 = typedArray.getDimensionPixelSize(index, bVar44.f1627d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1605e;
                    bVar45.f1629e0 = typedArray.getDimensionPixelSize(index, bVar45.f1629e0);
                    break;
                case 60:
                    e eVar11 = aVar.f1606f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.f1605e;
                    bVar46.B = v(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1605e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1605e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0024c c0024c = aVar.f1604d;
                    c0024c.b = v(typedArray, index, c0024c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1604d.f1666d = typedArray.getString(index);
                    } else {
                        aVar.f1604d.f1666d = a2.b.f79c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f1604d.f1668f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0024c c0024c2 = aVar.f1604d;
                    c0024c2.f1671i = typedArray.getFloat(index, c0024c2.f1671i);
                    break;
                case 68:
                    d dVar4 = aVar.f1603c;
                    dVar4.f1680e = typedArray.getFloat(index, dVar4.f1680e);
                    break;
                case 69:
                    aVar.f1605e.f1631f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1605e.f1633g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1605e;
                    bVar49.f1635h0 = typedArray.getInt(index, bVar49.f1635h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1605e;
                    bVar50.f1637i0 = typedArray.getDimensionPixelSize(index, bVar50.f1637i0);
                    break;
                case 74:
                    aVar.f1605e.f1643l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1605e;
                    bVar51.f1651p0 = typedArray.getBoolean(index, bVar51.f1651p0);
                    break;
                case 76:
                    C0024c c0024c3 = aVar.f1604d;
                    c0024c3.f1667e = typedArray.getInt(index, c0024c3.f1667e);
                    break;
                case 77:
                    aVar.f1605e.f1645m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1603c;
                    dVar5.f1678c = typedArray.getInt(index, dVar5.f1678c);
                    break;
                case 79:
                    C0024c c0024c4 = aVar.f1604d;
                    c0024c4.f1669g = typedArray.getFloat(index, c0024c4.f1669g);
                    break;
                case 80:
                    b bVar52 = aVar.f1605e;
                    bVar52.f1647n0 = typedArray.getBoolean(index, bVar52.f1647n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1605e;
                    bVar53.f1649o0 = typedArray.getBoolean(index, bVar53.f1649o0);
                    break;
                case 82:
                    C0024c c0024c5 = aVar.f1604d;
                    c0024c5.f1665c = typedArray.getInteger(index, c0024c5.f1665c);
                    break;
                case 83:
                    e eVar12 = aVar.f1606f;
                    eVar12.f1689i = v(typedArray, index, eVar12.f1689i);
                    break;
                case 84:
                    C0024c c0024c6 = aVar.f1604d;
                    c0024c6.f1673k = typedArray.getInteger(index, c0024c6.f1673k);
                    break;
                case 85:
                    C0024c c0024c7 = aVar.f1604d;
                    c0024c7.f1672j = typedArray.getFloat(index, c0024c7.f1672j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1604d.f1676n = typedArray.getResourceId(index, -1);
                        C0024c c0024c8 = aVar.f1604d;
                        if (c0024c8.f1676n != -1) {
                            c0024c8.f1675m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f1604d.f1674l = typedArray.getString(index);
                        if (aVar.f1604d.f1674l.indexOf("/") > 0) {
                            aVar.f1604d.f1676n = typedArray.getResourceId(index, -1);
                            aVar.f1604d.f1675m = -2;
                        } else {
                            aVar.f1604d.f1675m = -1;
                        }
                    } else {
                        C0024c c0024c9 = aVar.f1604d;
                        c0024c9.f1675m = typedArray.getInteger(index, c0024c9.f1676n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1595h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1595h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1605e;
                    bVar54.f1655s = v(typedArray, index, bVar54.f1655s);
                    break;
                case 92:
                    b bVar55 = aVar.f1605e;
                    bVar55.f1656t = v(typedArray, index, bVar55.f1656t);
                    break;
                case 93:
                    b bVar56 = aVar.f1605e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1605e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    w(aVar.f1605e, typedArray, index, 0);
                    break;
                case 96:
                    w(aVar.f1605e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1605e;
                    bVar58.f1653q0 = typedArray.getInt(index, bVar58.f1653q0);
                    break;
            }
        }
        b bVar59 = aVar.f1605e;
        if (bVar59.f1643l0 != null) {
            bVar59.f1641k0 = null;
        }
    }
}

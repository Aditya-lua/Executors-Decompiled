package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u<?> f8586d = new u<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1<T, Object> f8587a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8588c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8589a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[s1.b.values().length];
            b = iArr;
            try {
                iArr[s1.b.f8554c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[s1.b.f8555d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[s1.b.f8556e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[s1.b.f8557f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[s1.b.f8558g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[s1.b.f8559h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[s1.b.f8560i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[s1.b.f8561j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[s1.b.f8563l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[s1.b.f8564m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[s1.b.f8562k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[s1.b.f8565n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[s1.b.f8566o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[s1.b.f8568q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[s1.b.f8569r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[s1.b.f8570s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[s1.b.f8571t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[s1.b.f8567p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s1.c.values().length];
            f8589a = iArr2;
            try {
                iArr2[s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8589a[s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8589a[s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8589a[s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8589a[s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8589a[s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8589a[s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8589a[s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8589a[s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean f();

        s1.b g();

        int getNumber();

        s0.a i(s0.a aVar, s0 s0Var);

        s1.c k();

        boolean m();
    }

    public u() {
        this.f8587a = j1.r();
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(s1.b bVar, int i10, Object obj) {
        int iU = k.U(i10);
        if (bVar == s1.b.f8563l) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    public static int e(s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.Y(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((s0) obj);
            case 10:
                return obj instanceof d0 ? k.B((d0) obj) : k.G((s0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.T((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.W(((Integer) obj).intValue());
            case 14:
                return k.L(((Integer) obj).intValue());
            case 15:
                return k.N(((Long) obj).longValue());
            case 16:
                return k.P(((Integer) obj).intValue());
            case 17:
                return k.R(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).getNumber()) : k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        s1.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(bVarG, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.m()) {
            int iD = 0;
            while (i10 < size) {
                iD += d(bVarG, number, list.get(i10));
                i10++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i10 < size) {
            iE += e(bVarG, list.get(i10));
            i10++;
        }
        return k.U(number) + iE + k.W(iE);
    }

    public static <T extends b<T>> u<T> h() {
        return (u<T>) f8586d;
    }

    public static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.k() != s1.c.MESSAGE) {
            return true;
        }
        if (!key.f()) {
            return q(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!q(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(Object obj) {
        if (obj instanceof t0) {
            return ((t0) obj).isInitialized();
        }
        if (obj instanceof d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean r(s1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f8589a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof d0);
            default:
                return false;
        }
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    public void a(T t8, Object obj) {
        List arrayList;
        if (!t8.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t8, obj);
        Object objI = i(t8);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f8587a.s(t8, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u<T> clone() {
        u<T> uVarW = w();
        int iL = this.f8587a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f8587a.k(i10);
            uVarW.x((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f8587a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            uVarW.x((b) entry.getKey(), entry.getValue());
        }
        uVarW.f8588c = this.f8588c;
        return uVarW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f8587a.equals(((u) obj).f8587a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        if (m()) {
            return Collections.emptyIterator();
        }
        return this.f8588c ? new d0.c(this.f8587a.i().iterator()) : this.f8587a.i().iterator();
    }

    public int hashCode() {
        return this.f8587a.hashCode();
    }

    public Object i(T t8) {
        Object obj = this.f8587a.get(t8);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int iL = this.f8587a.l();
        int iK = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iK += k(this.f8587a.k(i10));
        }
        Iterator it = this.f8587a.n().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.k() != s1.c.MESSAGE || key.f() || key.m()) {
            return f(key, value);
        }
        return value instanceof d0 ? k.z(entry.getKey().getNumber(), (d0) value) : k.D(entry.getKey().getNumber(), (s0) value);
    }

    public int l() {
        int iL = this.f8587a.l();
        int iF = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f8587a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f8587a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m() {
        return this.f8587a.isEmpty();
    }

    public boolean n() {
        return this.b;
    }

    public boolean o() {
        int iL = this.f8587a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!p(this.f8587a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f8587a.n().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (m()) {
            return Collections.emptyIterator();
        }
        return this.f8588c ? new d0.c(this.f8587a.entrySet().iterator()) : this.f8587a.entrySet().iterator();
    }

    public void t() {
        if (this.b) {
            return;
        }
        int iL = this.f8587a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f8587a.k(i10);
            if (entryK.getValue() instanceof y) {
                ((y) entryK.getValue()).K();
            }
        }
        this.f8587a.q();
        this.b = true;
    }

    public void u(u<T> uVar) {
        int iL = uVar.f8587a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            v(uVar.f8587a.k(i10));
        }
        Iterator it = uVar.f8587a.n().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public final void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof d0;
        if (key.f()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f8587a.s(key, objI);
            return;
        }
        if (key.k() != s1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f8587a.s(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f8587a.s(key, c(value));
            if (z10) {
                this.f8588c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((d0) value).f();
        }
        this.f8587a.s(key, key.i(((s0) objI2).a(), (s0) value).build());
    }

    public void x(T t8, Object obj) {
        if (!t8.f()) {
            y(t8, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                y(t8, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof d0) {
            this.f8588c = true;
        }
        this.f8587a.s(t8, obj);
    }

    public final void y(T t8, Object obj) {
        if (!r(t8.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.g().a(), obj.getClass().getName()));
        }
    }

    public u(boolean z10) {
        this(j1.r());
        t();
    }

    public u(j1<T, Object> j1Var) {
        this.f8587a = j1Var;
        t();
    }
}

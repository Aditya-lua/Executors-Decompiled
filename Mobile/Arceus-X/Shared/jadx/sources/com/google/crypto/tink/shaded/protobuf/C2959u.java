package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C2959u.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C2959u<T extends b<T>> {

    /* JADX INFO: renamed from: d */
    public static final C2959u<?> f11031d = new C2959u<>(true);

    /* JADX INFO: renamed from: a */
    public final C2928j1<T, Object> f11032a;

    /* JADX INFO: renamed from: b */
    public boolean f11033b;

    /* JADX INFO: renamed from: c */
    public boolean f11034c;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11035a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11036b;

        static {
            int[] iArr = new int[C2955s1.b.values().length];
            f11036b = iArr;
            try {
                iArr[C2955s1.b.f10996c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11036b[C2955s1.b.f10997d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11036b[C2955s1.b.f10998e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11036b[C2955s1.b.f10999f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11036b[C2955s1.b.f11000g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11036b[C2955s1.b.f11001h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11036b[C2955s1.b.f11002i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11036b[C2955s1.b.f11003j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11036b[C2955s1.b.f11005l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11036b[C2955s1.b.f11006m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11036b[C2955s1.b.f11004k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11036b[C2955s1.b.f11007n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11036b[C2955s1.b.f11008o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11036b[C2955s1.b.f11010q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11036b[C2955s1.b.f11011r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11036b[C2955s1.b.f11012s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11036b[C2955s1.b.f11013t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11036b[C2955s1.b.f11009p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C2955s1.c.values().length];
            f11035a = iArr2;
            try {
                iArr2[C2955s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11035a[C2955s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11035a[C2955s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11035a[C2955s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11035a[C2955s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11035a[C2955s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11035a[C2955s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11035a[C2955s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11035a[C2955s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: f */
        boolean mo14208f();

        /* JADX INFO: renamed from: g */
        C2955s1.b mo14209g();

        int getNumber();

        /* JADX INFO: renamed from: i */
        InterfaceC2954s0.a mo14210i(InterfaceC2954s0.a aVar, InterfaceC2954s0 interfaceC2954s0);

        /* JADX INFO: renamed from: k */
        C2955s1.c mo14211k();

        /* JADX INFO: renamed from: m */
        boolean mo14212m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2959u() {
        this.f11032a = C2928j1.m13733r();
    }

    /* JADX INFO: renamed from: c */
    public static Object m14183c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m14184d(C2955s1.b bVar, int i10, Object obj) {
        int iM13775U = AbstractC2929k.m13775U(i10);
        if (bVar == C2955s1.b.f11005l) {
            iM13775U *= 2;
        }
        return iM13775U + m14185e(bVar, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m14185e(C2955s1.b bVar, Object obj) {
        switch (a.f11036b[bVar.ordinal()]) {
            case 1:
                return AbstractC2929k.m13792j(((Double) obj).doubleValue());
            case 2:
                return AbstractC2929k.m13800r(((Float) obj).floatValue());
            case 3:
                return AbstractC2929k.m13807y(((Long) obj).longValue());
            case 4:
                return AbstractC2929k.m13779Y(((Long) obj).longValue());
            case 5:
                return AbstractC2929k.m13805w(((Integer) obj).intValue());
            case 6:
                return AbstractC2929k.m13798p(((Long) obj).longValue());
            case 7:
                return AbstractC2929k.m13796n(((Integer) obj).intValue());
            case 8:
                return AbstractC2929k.m13784e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2929k.m13802t((InterfaceC2954s0) obj);
            case 10:
                return obj instanceof C2909d0 ? AbstractC2929k.m13756B((C2909d0) obj) : AbstractC2929k.m13761G((InterfaceC2954s0) obj);
            case 11:
                return obj instanceof AbstractC2920h ? AbstractC2929k.m13790h((AbstractC2920h) obj) : AbstractC2929k.m13774T((String) obj);
            case 12:
                return obj instanceof AbstractC2920h ? AbstractC2929k.m13790h((AbstractC2920h) obj) : AbstractC2929k.m13786f((byte[]) obj);
            case 13:
                return AbstractC2929k.m13777W(((Integer) obj).intValue());
            case 14:
                return AbstractC2929k.m13766L(((Integer) obj).intValue());
            case 15:
                return AbstractC2929k.m13768N(((Long) obj).longValue());
            case 16:
                return AbstractC2929k.m13770P(((Integer) obj).intValue());
            case 17:
                return AbstractC2929k.m13772R(((Long) obj).longValue());
            case 18:
                return obj instanceof C2900a0.c ? AbstractC2929k.m13794l(((C2900a0.c) obj).getNumber()) : AbstractC2929k.m13794l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m14186f(b<?> bVar, Object obj) {
        C2955s1.b bVarMo14209g = bVar.mo14209g();
        int number = bVar.getNumber();
        if (!bVar.mo14208f()) {
            return m14184d(bVarMo14209g, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.mo14212m()) {
            int iM14184d = 0;
            while (i10 < size) {
                iM14184d += m14184d(bVarMo14209g, number, list.get(i10));
                i10++;
            }
            return iM14184d;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM14185e = 0;
        while (i10 < size) {
            iM14185e += m14185e(bVarMo14209g, list.get(i10));
            i10++;
        }
        return AbstractC2929k.m13775U(number) + iM14185e + AbstractC2929k.m13777W(iM14185e);
    }

    /* JADX INFO: renamed from: h */
    public static <T extends b<T>> C2959u<T> m14187h() {
        return (C2959u<T>) f11031d;
    }

    /* JADX INFO: renamed from: p */
    public static <T extends b<T>> boolean m14188p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo14211k() != C2955s1.c.MESSAGE) {
            return true;
        }
        if (!key.mo14208f()) {
            return m14189q(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m14189q(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14189q(Object obj) {
        if (obj instanceof InterfaceC2957t0) {
            return ((InterfaceC2957t0) obj).isInitialized();
        }
        if (obj instanceof C2909d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m14190r(C2955s1.b bVar, Object obj) {
        C2900a0.m13379a(obj);
        switch (a.f11035a[bVar.m14182a().ordinal()]) {
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
                return (obj instanceof AbstractC2920h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C2900a0.c);
            case 9:
                return (obj instanceof InterfaceC2954s0) || (obj instanceof C2909d0);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static <T extends b<T>> C2959u<T> m14191w() {
        return new C2959u<>();
    }

    /* JADX INFO: renamed from: a */
    public void m14192a(T t8, Object obj) {
        List arrayList;
        if (!t8.mo14208f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m14207y(t8, obj);
        Object objM14195i = m14195i(t8);
        if (objM14195i == null) {
            arrayList = new ArrayList();
            this.f11032a.m13745s(t8, arrayList);
        } else {
            arrayList = (List) objM14195i;
        }
        arrayList.add(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2959u<T> clone() {
        C2959u<T> c2959uM14191w = m14191w();
        int iM13739l = this.f11032a.m13739l();
        for (int i10 = 0; i10 < iM13739l; i10++) {
            Map.Entry<K, Object> entryM13738k = this.f11032a.m13738k(i10);
            c2959uM14191w.m14206x((b) entryM13738k.getKey(), entryM13738k.getValue());
        }
        Iterator it = this.f11032a.m13741n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2959uM14191w.m14206x((b) entry.getKey(), entry.getValue());
        }
        c2959uM14191w.f11034c = this.f11034c;
        return c2959uM14191w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2959u) {
            return this.f11032a.equals(((C2959u) obj).f11032a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Iterator<Map.Entry<T, Object>> m14194g() {
        if (m14199m()) {
            return Collections.emptyIterator();
        }
        return this.f11034c ? new C2909d0.c(this.f11032a.m13736i().iterator()) : this.f11032a.m13736i().iterator();
    }

    public int hashCode() {
        return this.f11032a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m14195i(T t8) {
        Object obj = this.f11032a.get(t8);
        return obj instanceof C2909d0 ? ((C2909d0) obj).m13419f() : obj;
    }

    /* JADX INFO: renamed from: j */
    public int m14196j() {
        int iM13739l = this.f11032a.m13739l();
        int iM14197k = 0;
        for (int i10 = 0; i10 < iM13739l; i10++) {
            iM14197k += m14197k(this.f11032a.m13738k(i10));
        }
        Iterator it = this.f11032a.m13741n().iterator();
        while (it.hasNext()) {
            iM14197k += m14197k((Map.Entry) it.next());
        }
        return iM14197k;
    }

    /* JADX INFO: renamed from: k */
    public final int m14197k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo14211k() != C2955s1.c.MESSAGE || key.mo14208f() || key.mo14212m()) {
            return m14186f(key, value);
        }
        return value instanceof C2909d0 ? AbstractC2929k.m13808z(entry.getKey().getNumber(), (C2909d0) value) : AbstractC2929k.m13758D(entry.getKey().getNumber(), (InterfaceC2954s0) value);
    }

    /* JADX INFO: renamed from: l */
    public int m14198l() {
        int iM13739l = this.f11032a.m13739l();
        int iM14186f = 0;
        for (int i10 = 0; i10 < iM13739l; i10++) {
            Map.Entry<K, Object> entryM13738k = this.f11032a.m13738k(i10);
            iM14186f += m14186f((b) entryM13738k.getKey(), entryM13738k.getValue());
        }
        Iterator it = this.f11032a.m13741n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM14186f += m14186f((b) entry.getKey(), entry.getValue());
        }
        return iM14186f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m14199m() {
        return this.f11032a.isEmpty();
    }

    /* JADX INFO: renamed from: n */
    public boolean m14200n() {
        return this.f11033b;
    }

    /* JADX INFO: renamed from: o */
    public boolean m14201o() {
        int iM13739l = this.f11032a.m13739l();
        for (int i10 = 0; i10 < iM13739l; i10++) {
            if (!m14188p(this.f11032a.m13738k(i10))) {
                return false;
            }
        }
        Iterator it = this.f11032a.m13741n().iterator();
        while (it.hasNext()) {
            if (!m14188p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public Iterator<Map.Entry<T, Object>> m14202s() {
        if (m14199m()) {
            return Collections.emptyIterator();
        }
        return this.f11034c ? new C2909d0.c(this.f11032a.entrySet().iterator()) : this.f11032a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: t */
    public void m14203t() {
        if (this.f11033b) {
            return;
        }
        int iM13739l = this.f11032a.m13739l();
        for (int i10 = 0; i10 < iM13739l; i10++) {
            Map.Entry<K, Object> entryM13738k = this.f11032a.m13738k(i10);
            if (entryM13738k.getValue() instanceof AbstractC2967y) {
                ((AbstractC2967y) entryM13738k.getValue()).m14325K();
            }
        }
        this.f11032a.mo13744q();
        this.f11033b = true;
    }

    /* JADX INFO: renamed from: u */
    public void m14204u(C2959u<T> c2959u) {
        int iM13739l = c2959u.f11032a.m13739l();
        for (int i10 = 0; i10 < iM13739l; i10++) {
            m14205v(c2959u.f11032a.m13738k(i10));
        }
        Iterator it = c2959u.f11032a.m13741n().iterator();
        while (it.hasNext()) {
            m14205v((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14205v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof C2909d0;
        if (key.mo14208f()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM14195i = m14195i(key);
            if (objM14195i == null) {
                objM14195i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM14195i).add(m14183c(it.next()));
            }
            this.f11032a.m13745s(key, objM14195i);
            return;
        }
        if (key.mo14211k() != C2955s1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f11032a.m13745s(key, m14183c(value));
            return;
        }
        Object objM14195i2 = m14195i(key);
        if (objM14195i2 == null) {
            this.f11032a.m13745s(key, m14183c(value));
            if (z10) {
                this.f11034c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((C2909d0) value).m13419f();
        }
        this.f11032a.m13745s(key, key.mo14210i(((InterfaceC2954s0) objM14195i2).mo564a(), (InterfaceC2954s0) value).build());
    }

    /* JADX INFO: renamed from: x */
    public void m14206x(T t8, Object obj) {
        if (!t8.mo14208f()) {
            m14207y(t8, obj);
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
                m14207y(t8, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2909d0) {
            this.f11034c = true;
        }
        this.f11032a.m13745s(t8, obj);
    }

    /* JADX INFO: renamed from: y */
    public final void m14207y(T t8, Object obj) {
        if (!m14190r(t8.mo14209g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.mo14209g().m14182a(), obj.getClass().getName()));
        }
    }

    public C2959u(boolean z10) {
        this(C2928j1.m13733r());
        m14203t();
    }

    public C2959u(C2928j1<T, Object> c2928j1) {
        this.f11032a = c2928j1;
        m14203t();
    }
}

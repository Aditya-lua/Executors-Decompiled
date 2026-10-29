package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0879t.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0879t<T extends b<T>> {

    /* JADX INFO: renamed from: d */
    public static final C0879t<?> f3034d = new C0879t<>(true);

    /* JADX INFO: renamed from: a */
    public final C0851j1<T, Object> f3035a;

    /* JADX INFO: renamed from: b */
    public boolean f3036b;

    /* JADX INFO: renamed from: c */
    public boolean f3037c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3038a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3039b;

        static {
            int[] iArr = new int[C0878s1.b.values().length];
            f3039b = iArr;
            try {
                iArr[C0878s1.b.f3002c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3039b[C0878s1.b.f3003d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3039b[C0878s1.b.f3004e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3039b[C0878s1.b.f3005f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3039b[C0878s1.b.f3006g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3039b[C0878s1.b.f3007h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3039b[C0878s1.b.f3008i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3039b[C0878s1.b.f3009j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3039b[C0878s1.b.f3011l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3039b[C0878s1.b.f3012m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3039b[C0878s1.b.f3010k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3039b[C0878s1.b.f3013n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3039b[C0878s1.b.f3014o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3039b[C0878s1.b.f3016q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3039b[C0878s1.b.f3017r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3039b[C0878s1.b.f3018s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3039b[C0878s1.b.f3019t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3039b[C0878s1.b.f3015p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C0878s1.c.values().length];
            f3038a = iArr2;
            try {
                iArr2[C0878s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3038a[C0878s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3038a[C0878s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3038a[C0878s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3038a[C0878s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3038a[C0878s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3038a[C0878s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3038a[C0878s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3038a[C0878s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: f */
        boolean mo4091f();

        /* JADX INFO: renamed from: g */
        C0878s1.b mo4092g();

        int getNumber();

        /* JADX INFO: renamed from: k */
        C0878s1.c mo4093k();

        /* JADX INFO: renamed from: m */
        boolean mo4094m();

        /* JADX INFO: renamed from: p */
        InterfaceC0874r0.a mo4095p(InterfaceC0874r0.a aVar, InterfaceC0874r0 interfaceC0874r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0879t() {
        this.f3035a = C0851j1.m3755r();
    }

    /* JADX INFO: renamed from: A */
    public static void m4063A(AbstractC0849j abstractC0849j, C0878s1.b bVar, int i10, Object obj) {
        if (bVar == C0878s1.b.f3011l) {
            abstractC0849j.m3728z0(i10, (InterfaceC0874r0) obj);
        } else {
            abstractC0849j.mo3701V0(i10, m4070m(bVar, false));
            m4064B(abstractC0849j, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m4064B(AbstractC0849j abstractC0849j, C0878s1.b bVar, Object obj) {
        switch (a.f3039b[bVar.ordinal()]) {
            case 1:
                abstractC0849j.m3719q0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC0849j.m3727y0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC0849j.m3686G0(((Long) obj).longValue());
                break;
            case 4:
                abstractC0849j.mo3705Z0(((Long) obj).longValue());
                break;
            case 5:
                abstractC0849j.mo3684E0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC0849j.mo3725w0(((Long) obj).longValue());
                break;
            case 7:
                abstractC0849j.mo3723u0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC0849j.m3713k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC0849j.m3681B0((InterfaceC0874r0) obj);
                break;
            case 10:
                abstractC0849j.mo3688I0((InterfaceC0874r0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0840g)) {
                    abstractC0849j.mo3700U0((String) obj);
                } else {
                    abstractC0849j.mo3717o0((AbstractC0840g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC0840g)) {
                    abstractC0849j.m3714l0((byte[]) obj);
                } else {
                    abstractC0849j.mo3717o0((AbstractC0840g) obj);
                }
                break;
            case 13:
                abstractC0849j.mo3703X0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC0849j.m3692M0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0849j.m3694O0(((Long) obj).longValue());
                break;
            case 16:
                abstractC0849j.m3696Q0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC0849j.m3698S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C0892z.a)) {
                    abstractC0849j.m3721s0(((Integer) obj).intValue());
                } else {
                    abstractC0849j.m3721s0(((C0892z.a) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m4065c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m4066d(C0878s1.b bVar, int i10, Object obj) {
        int iM3646U = AbstractC0849j.m3646U(i10);
        if (bVar == C0878s1.b.f3011l) {
            iM3646U *= 2;
        }
        return iM3646U + m4067e(bVar, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m4067e(C0878s1.b bVar, Object obj) {
        switch (a.f3039b[bVar.ordinal()]) {
            case 1:
                return AbstractC0849j.m3663j(((Double) obj).doubleValue());
            case 2:
                return AbstractC0849j.m3671r(((Float) obj).floatValue());
            case 3:
                return AbstractC0849j.m3678y(((Long) obj).longValue());
            case 4:
                return AbstractC0849j.m3650Y(((Long) obj).longValue());
            case 5:
                return AbstractC0849j.m3676w(((Integer) obj).intValue());
            case 6:
                return AbstractC0849j.m3669p(((Long) obj).longValue());
            case 7:
                return AbstractC0849j.m3667n(((Integer) obj).intValue());
            case 8:
                return AbstractC0849j.m3655e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0849j.m3673t((InterfaceC0874r0) obj);
            case 10:
                return obj instanceof C0829c0 ? AbstractC0849j.m3627B((C0829c0) obj) : AbstractC0849j.m3632G((InterfaceC0874r0) obj);
            case 11:
                return obj instanceof AbstractC0840g ? AbstractC0849j.m3661h((AbstractC0840g) obj) : AbstractC0849j.m3645T((String) obj);
            case 12:
                return obj instanceof AbstractC0840g ? AbstractC0849j.m3661h((AbstractC0840g) obj) : AbstractC0849j.m3657f((byte[]) obj);
            case 13:
                return AbstractC0849j.m3648W(((Integer) obj).intValue());
            case 14:
                return AbstractC0849j.m3637L(((Integer) obj).intValue());
            case 15:
                return AbstractC0849j.m3639N(((Long) obj).longValue());
            case 16:
                return AbstractC0849j.m3641P(((Integer) obj).intValue());
            case 17:
                return AbstractC0849j.m3643R(((Long) obj).longValue());
            case 18:
                return obj instanceof C0892z.a ? AbstractC0849j.m3665l(((C0892z.a) obj).getNumber()) : AbstractC0849j.m3665l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m4068f(b<?> bVar, Object obj) {
        C0878s1.b bVarMo4092g = bVar.mo4092g();
        int number = bVar.getNumber();
        if (!bVar.mo4091f()) {
            return m4066d(bVarMo4092g, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.mo4094m()) {
            int iM4066d = 0;
            while (i10 < size) {
                iM4066d += m4066d(bVarMo4092g, number, list.get(i10));
                i10++;
            }
            return iM4066d;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM4067e = 0;
        while (i10 < size) {
            iM4067e += m4067e(bVarMo4092g, list.get(i10));
            i10++;
        }
        return AbstractC0849j.m3646U(number) + iM4067e + AbstractC0849j.m3648W(iM4067e);
    }

    /* JADX INFO: renamed from: h */
    public static <T extends b<T>> C0879t<T> m4069h() {
        return (C0879t<T>) f3034d;
    }

    /* JADX INFO: renamed from: m */
    public static int m4070m(C0878s1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.m4062b();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends b<T>> boolean m4071q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo4093k() != C0878s1.c.MESSAGE) {
            return true;
        }
        if (!key.mo4091f()) {
            return m4072r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m4072r(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m4072r(Object obj) {
        if (obj instanceof InterfaceC0877s0) {
            return ((InterfaceC0877s0) obj).isInitialized();
        }
        if (obj instanceof C0829c0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4073s(C0878s1.b bVar, Object obj) {
        C0892z.m4236a(obj);
        switch (a.f3038a[bVar.m4061a().ordinal()]) {
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
                return (obj instanceof AbstractC0840g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C0892z.a);
            case 9:
                return (obj instanceof InterfaceC0874r0) || (obj instanceof C0829c0);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static <T extends b<T>> C0879t<T> m4074x() {
        return new C0879t<>();
    }

    /* JADX INFO: renamed from: a */
    public void m4075a(T t8, Object obj) {
        List arrayList;
        if (!t8.mo4091f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m4090z(t8, obj);
        Object objM4078i = m4078i(t8);
        if (objM4078i == null) {
            arrayList = new ArrayList();
            this.f3035a.m3767s(t8, arrayList);
        } else {
            arrayList = (List) objM4078i;
        }
        arrayList.add(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0879t<T> clone() {
        C0879t<T> c0879tM4074x = m4074x();
        int iM3761l = this.f3035a.m3761l();
        for (int i10 = 0; i10 < iM3761l; i10++) {
            Map.Entry<K, Object> entryM3760k = this.f3035a.m3760k(i10);
            c0879tM4074x.m4089y((b) entryM3760k.getKey(), entryM3760k.getValue());
        }
        Iterator it = this.f3035a.m3763n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0879tM4074x.m4089y((b) entry.getKey(), entry.getValue());
        }
        c0879tM4074x.f3037c = this.f3037c;
        return c0879tM4074x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0879t) {
            return this.f3035a.equals(((C0879t) obj).f3035a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Iterator<Map.Entry<T, Object>> m4077g() {
        if (m4082n()) {
            return Collections.emptyIterator();
        }
        return this.f3037c ? new C0829c0.c(this.f3035a.m3758i().iterator()) : this.f3035a.m3758i().iterator();
    }

    public int hashCode() {
        return this.f3035a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m4078i(T t8) {
        Object obj = this.f3035a.get(t8);
        return obj instanceof C0829c0 ? ((C0829c0) obj).m3361f() : obj;
    }

    /* JADX INFO: renamed from: j */
    public int m4079j() {
        int iM3761l = this.f3035a.m3761l();
        int iM4080k = 0;
        for (int i10 = 0; i10 < iM3761l; i10++) {
            iM4080k += m4080k(this.f3035a.m3760k(i10));
        }
        Iterator it = this.f3035a.m3763n().iterator();
        while (it.hasNext()) {
            iM4080k += m4080k((Map.Entry) it.next());
        }
        return iM4080k;
    }

    /* JADX INFO: renamed from: k */
    public final int m4080k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo4093k() != C0878s1.c.MESSAGE || key.mo4091f() || key.mo4094m()) {
            return m4068f(key, value);
        }
        return value instanceof C0829c0 ? AbstractC0849j.m3679z(entry.getKey().getNumber(), (C0829c0) value) : AbstractC0849j.m3629D(entry.getKey().getNumber(), (InterfaceC0874r0) value);
    }

    /* JADX INFO: renamed from: l */
    public int m4081l() {
        int iM3761l = this.f3035a.m3761l();
        int iM4068f = 0;
        for (int i10 = 0; i10 < iM3761l; i10++) {
            Map.Entry<K, Object> entryM3760k = this.f3035a.m3760k(i10);
            iM4068f += m4068f((b) entryM3760k.getKey(), entryM3760k.getValue());
        }
        Iterator it = this.f3035a.m3763n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM4068f += m4068f((b) entry.getKey(), entry.getValue());
        }
        return iM4068f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m4082n() {
        return this.f3035a.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public boolean m4083o() {
        return this.f3036b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m4084p() {
        int iM3761l = this.f3035a.m3761l();
        for (int i10 = 0; i10 < iM3761l; i10++) {
            if (!m4071q(this.f3035a.m3760k(i10))) {
                return false;
            }
        }
        Iterator it = this.f3035a.m3763n().iterator();
        while (it.hasNext()) {
            if (!m4071q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public Iterator<Map.Entry<T, Object>> m4085t() {
        if (m4082n()) {
            return Collections.emptyIterator();
        }
        return this.f3037c ? new C0829c0.c(this.f3035a.entrySet().iterator()) : this.f3035a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: u */
    public void m4086u() {
        if (this.f3036b) {
            return;
        }
        int iM3761l = this.f3035a.m3761l();
        for (int i10 = 0; i10 < iM3761l; i10++) {
            Map.Entry<K, Object> entryM3760k = this.f3035a.m3760k(i10);
            if (entryM3760k.getValue() instanceof AbstractC0888x) {
                ((AbstractC0888x) entryM3760k.getValue()).m4187J();
            }
        }
        this.f3035a.mo3766q();
        this.f3036b = true;
    }

    /* JADX INFO: renamed from: v */
    public void m4087v(C0879t<T> c0879t) {
        int iM3761l = c0879t.f3035a.m3761l();
        for (int i10 = 0; i10 < iM3761l; i10++) {
            m4088w(c0879t.f3035a.m3760k(i10));
        }
        Iterator it = c0879t.f3035a.m3763n().iterator();
        while (it.hasNext()) {
            m4088w((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4088w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof C0829c0;
        if (key.mo4091f()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM4078i = m4078i(key);
            if (objM4078i == null) {
                objM4078i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM4078i).add(m4065c(it.next()));
            }
            this.f3035a.m3767s(key, objM4078i);
            return;
        }
        if (key.mo4093k() != C0878s1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f3035a.m3767s(key, m4065c(value));
            return;
        }
        Object objM4078i2 = m4078i(key);
        if (objM4078i2 == null) {
            this.f3035a.m3767s(key, m4065c(value));
            if (z10) {
                this.f3037c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((C0829c0) value).m3361f();
        }
        this.f3035a.m3767s(key, key.mo4095p(((InterfaceC0874r0) objM4078i2).mo4025a(), (InterfaceC0874r0) value).build());
    }

    /* JADX INFO: renamed from: y */
    public void m4089y(T t8, Object obj) {
        if (!t8.mo4091f()) {
            m4090z(t8, obj);
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
                m4090z(t8, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C0829c0) {
            this.f3037c = true;
        }
        this.f3035a.m3767s(t8, obj);
    }

    /* JADX INFO: renamed from: z */
    public final void m4090z(T t8, Object obj) {
        if (!m4073s(t8.mo4092g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.mo4092g().m4061a(), obj.getClass().getName()));
        }
    }

    public C0879t(boolean z10) {
        this(C0851j1.m3755r());
        m4086u();
    }

    public C0879t(C0851j1<T, Object> c0851j1) {
        this.f3035a = c0851j1;
        m4086u();
    }
}

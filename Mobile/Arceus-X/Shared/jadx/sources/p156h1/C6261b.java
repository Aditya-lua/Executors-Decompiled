package p156h1;

import android.util.Rational;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p140g0.C5931r1;
import p282m1.InterfaceC8389r1;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;

/* JADX INFO: renamed from: h1.b */
/* JADX INFO: loaded from: classes.dex */
public class C6261b implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f23784c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8389r1.a f23785d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, InterfaceC8721a2> f23786e = new HashMap();

    public C6261b(InterfaceC8855z1 interfaceC8855z1, InterfaceC8389r1.a aVar) {
        this.f23784c = interfaceC8855z1;
        this.f23785d = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static int m27495d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    /* JADX INFO: renamed from: e */
    public static String m27496e(int i10) {
        return InterfaceC8721a2.m34977d(i10);
    }

    /* JADX INFO: renamed from: f */
    public static int m27497f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4096;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC8721a2.c m27498g(InterfaceC8721a2.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int iMo34991e = cVar.mo34991e();
        String strMo34995i = cVar.mo34995i();
        int iMo34996j = cVar.mo34996j();
        if (i10 != cVar.mo34993g()) {
            iMo34991e = m27495d(i10);
            strMo34995i = m27496e(iMo34991e);
            iMo34996j = m27497f(i10);
        }
        return InterfaceC8721a2.c.m34987a(iMo34991e, strMo34995i, m27501j(cVar.mo34989c(), i11, cVar.mo34988b()), cVar.mo34992f(), cVar.mo34998l(), cVar.mo34994h(), iMo34996j, i11, cVar.mo34990d(), i10);
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC8721a2 m27499h(int i10) {
        if (this.f23786e.containsKey(Integer.valueOf(i10))) {
            return this.f23786e.get(Integer.valueOf(i10));
        }
        if (!this.f23784c.mo27503a(i10)) {
            return null;
        }
        InterfaceC8721a2 interfaceC8721a2M27505c = m27505c(this.f23784c.mo27504b(i10), 1, 10);
        this.f23786e.put(Integer.valueOf(i10), interfaceC8721a2M27505c);
        return interfaceC8721a2M27505c;
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC8721a2.c m27500i(InterfaceC8721a2.c cVar, int i10) {
        return InterfaceC8721a2.c.m34987a(cVar.mo34991e(), cVar.mo34995i(), i10, cVar.mo34992f(), cVar.mo34998l(), cVar.mo34994h(), cVar.mo34996j(), cVar.mo34988b(), cVar.mo34990d(), cVar.mo34993g());
    }

    /* JADX INFO: renamed from: j */
    public static int m27501j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue());
        if (C5931r1.m26566f("BackupHdrProfileEncoderProfilesProvider")) {
            C5931r1.m26561a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC8721a2.c m27502k(InterfaceC8721a2.c cVar, InterfaceC8389r1.a aVar) {
        InterfaceC8389r1 interfaceC8389r1Mo34064a;
        if (cVar == null || (interfaceC8389r1Mo34064a = aVar.mo34064a(cVar.mo34995i())) == null || !interfaceC8389r1Mo34064a.m34063e(cVar.mo34998l(), cVar.mo34994h())) {
            return null;
        }
        int iMo34989c = cVar.mo34989c();
        int iIntValue = ((Integer) interfaceC8389r1Mo34064a.mo34057g().clamp(Integer.valueOf(iMo34989c))).intValue();
        return iIntValue == iMo34989c ? cVar : m27500i(cVar, iIntValue);
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return this.f23784c.mo27503a(i10) && m27499h(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        return m27499h(i10);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8721a2 m27505c(InterfaceC8721a2 interfaceC8721a2, int i10, int i11) {
        InterfaceC8721a2.c next;
        if (interfaceC8721a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC8721a2.mo27490b());
        Iterator<InterfaceC8721a2.c> it = interfaceC8721a2.mo27490b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.mo34993g() != 0);
        InterfaceC8721a2.c cVarM27502k = m27502k(m27498g(next, i10, i11), this.f23785d);
        if (cVarM27502k != null) {
            arrayList.add(cVarM27502k);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC8721a2.b.m34986h(interfaceC8721a2.mo27489a(), interfaceC8721a2.mo27491e(), interfaceC8721a2.mo27492f(), arrayList);
    }
}

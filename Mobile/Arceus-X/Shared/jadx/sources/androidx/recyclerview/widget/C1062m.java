package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public class C1062m {

    /* JADX INFO: renamed from: a */
    public final a f4312a;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C1050a.b mo5829a(int i10, int i11, int i12, Object obj);

        /* JADX INFO: renamed from: b */
        void mo5830b(C1050a.b bVar);
    }

    public C1062m(a aVar) {
        this.f4312a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m5998a(List<C1050a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4127a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m5999b(List<C1050a.b> list) {
        while (true) {
            int iM5998a = m5998a(list);
            if (iM5998a == -1) {
                return;
            } else {
                m6001d(list, iM5998a, iM5998a + 1);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6000c(List<C1050a.b> list, int i10, C1050a.b bVar, int i11, C1050a.b bVar2) {
        int i12 = bVar.f4130d;
        int i13 = bVar2.f4128b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f4128b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f4128b = i15 + bVar2.f4130d;
        }
        int i16 = bVar2.f4128b;
        if (i16 <= i12) {
            bVar.f4130d = i12 + bVar2.f4130d;
        }
        bVar2.f4128b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m6001d(List<C1050a.b> list, int i10, int i11) {
        C1050a.b bVar = list.get(i10);
        C1050a.b bVar2 = list.get(i11);
        int i12 = bVar2.f4127a;
        if (i12 == 1) {
            m6000c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            m6002e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            m6003f(list, i10, bVar, i11, bVar2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6002e(List<C1050a.b> list, int i10, C1050a.b bVar, int i11, C1050a.b bVar2) {
        boolean z10;
        int i12 = bVar.f4128b;
        int i13 = bVar.f4130d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f4128b == i12 && bVar2.f4130d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f4128b == i13 + 1 && bVar2.f4130d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f4128b;
        if (i13 < i14) {
            bVar2.f4128b = i14 - 1;
        } else {
            int i15 = bVar2.f4130d;
            if (i13 < i14 + i15) {
                bVar2.f4130d = i15 - 1;
                bVar.f4127a = 2;
                bVar.f4130d = 1;
                if (bVar2.f4130d == 0) {
                    list.remove(i11);
                    this.f4312a.mo5830b(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f4128b;
        int i17 = bVar2.f4128b;
        C1050a.b bVarMo5829a = null;
        if (i16 <= i17) {
            bVar2.f4128b = i17 + 1;
        } else {
            int i18 = bVar2.f4130d;
            if (i16 < i17 + i18) {
                bVarMo5829a = this.f4312a.mo5829a(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f4130d = bVar.f4128b - bVar2.f4128b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f4312a.mo5830b(bVar);
            return;
        }
        if (z10) {
            if (bVarMo5829a != null) {
                int i19 = bVar.f4128b;
                if (i19 > bVarMo5829a.f4128b) {
                    bVar.f4128b = i19 - bVarMo5829a.f4130d;
                }
                int i20 = bVar.f4130d;
                if (i20 > bVarMo5829a.f4128b) {
                    bVar.f4130d = i20 - bVarMo5829a.f4130d;
                }
            }
            int i21 = bVar.f4128b;
            if (i21 > bVar2.f4128b) {
                bVar.f4128b = i21 - bVar2.f4130d;
            }
            int i22 = bVar.f4130d;
            if (i22 > bVar2.f4128b) {
                bVar.f4130d = i22 - bVar2.f4130d;
            }
        } else {
            if (bVarMo5829a != null) {
                int i23 = bVar.f4128b;
                if (i23 >= bVarMo5829a.f4128b) {
                    bVar.f4128b = i23 - bVarMo5829a.f4130d;
                }
                int i24 = bVar.f4130d;
                if (i24 >= bVarMo5829a.f4128b) {
                    bVar.f4130d = i24 - bVarMo5829a.f4130d;
                }
            }
            int i25 = bVar.f4128b;
            if (i25 >= bVar2.f4128b) {
                bVar.f4128b = i25 - bVar2.f4130d;
            }
            int i26 = bVar.f4130d;
            if (i26 >= bVar2.f4128b) {
                bVar.f4130d = i26 - bVar2.f4130d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f4128b != bVar.f4130d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarMo5829a != null) {
            list.add(i10, bVarMo5829a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public void m6003f(List<C1050a.b> list, int i10, C1050a.b bVar, int i11, C1050a.b bVar2) {
        C1050a.b bVarMo5829a;
        int i12;
        int i13;
        int i14;
        int i15 = bVar.f4130d;
        int i16 = bVar2.f4128b;
        C1050a.b bVarMo5829a2 = null;
        if (i15 >= i16) {
            int i17 = bVar2.f4130d;
            if (i15 < i16 + i17) {
                bVar2.f4130d = i17 - 1;
                bVarMo5829a = this.f4312a.mo5829a(4, bVar.f4128b, 1, bVar2.f4129c);
            }
            i12 = bVar.f4128b;
            i13 = bVar2.f4128b;
            if (i12 <= i13) {
                bVar2.f4128b = i13 + 1;
            } else {
                i14 = bVar2.f4130d;
                if (i12 < i13 + i14) {
                    int i18 = (i13 + i14) - i12;
                    bVarMo5829a2 = this.f4312a.mo5829a(4, i12 + 1, i18, bVar2.f4129c);
                    bVar2.f4130d -= i18;
                }
            }
            list.set(i11, bVar);
            if (bVar2.f4130d > 0) {
                list.set(i10, bVar2);
            } else {
                list.remove(i10);
                this.f4312a.mo5830b(bVar2);
            }
            if (bVarMo5829a != null) {
                list.add(i10, bVarMo5829a);
            }
            if (bVarMo5829a2 != null) {
                list.add(i10, bVarMo5829a2);
            }
        }
        bVar2.f4128b = i16 - 1;
        bVarMo5829a = null;
        i12 = bVar.f4128b;
        i13 = bVar2.f4128b;
        if (i12 <= i13) {
            bVar2.f4128b = i13 + 1;
        } else {
            i14 = bVar2.f4130d;
            if (i12 < i13 + i14) {
                int i19 = (i13 + i14) - i12;
                bVarMo5829a2 = this.f4312a.mo5829a(4, i12 + 1, i19, bVar2.f4129c);
                bVar2.f4130d -= i19;
            }
        }
        list.set(i11, bVar);
        if (bVar2.f4130d > 0) {
            list.set(i10, bVar2);
        } else {
            list.remove(i10);
            this.f4312a.mo5830b(bVar2);
        }
        if (bVarMo5829a != null) {
            list.add(i10, bVarMo5829a);
        }
        if (bVarMo5829a2 != null) {
            list.add(i10, bVarMo5829a2);
        }
    }
}

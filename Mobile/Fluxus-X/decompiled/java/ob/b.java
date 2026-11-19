package ob;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.d4 f27096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f27097h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, int i10, com.google.android.gms.internal.measurement.d4 d4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f27097h = eVar;
        this.f27096g = d4Var;
    }

    @Override // ob.c
    public final int a() {
        return this.f27096g.G();
    }

    @Override // ob.c
    public final boolean b() {
        return false;
    }

    @Override // ob.c
    public final boolean c() {
        return this.f27096g.L();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a A[EDGE_INSN: B:121:0x030a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:122:0x032a A[EDGE_INSN: B:122:0x032a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x034a A[EDGE_INSN: B:176:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x034a A[EDGE_INSN: B:178:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x034a A[EDGE_INSN: B:187:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[LOOP:0: B:40:0x00f4->B:45:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.s6 s6Var, long j10, e0 e0Var, boolean z10) {
        HashSet hashSet;
        Iterator it;
        w1.a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.f4 f4Var;
        boolean z11;
        String strM;
        V v8;
        Boolean boolG;
        Boolean boolH;
        String str;
        Boolean boolI;
        com.google.android.gms.internal.measurement.w6 w6Var;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.f4 f4Var2;
        com.google.android.gms.internal.measurement.cf.a();
        e eVar = this.f27097h;
        l7 l7Var = eVar.f27641a;
        m mVarW = l7Var.w();
        String str2 = this.f27133a;
        boolean zH = mVarW.H(str2, e5.G0);
        com.google.android.gms.internal.measurement.d4 d4Var = this.f27096g;
        long j11 = d4Var.R() ? e0Var.f27213e : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(l7Var.a().z(), 2)) {
            l7Var.a().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.b), d4Var.F() ? Integer.valueOf(d4Var.G()) : null, l7Var.D().a(d4Var.H()));
            l7Var.a().w().b("Filter definition", eVar.b.K0().L(d4Var));
        }
        if (!d4Var.F() || d4Var.G() > 256) {
            l7Var.a().r().c("Invalid event filter ID. appId, id", b6.x(str2), String.valueOf(d4Var.F() ? Integer.valueOf(d4Var.G()) : null));
            return false;
        }
        Object[] objArr = d4Var.N() || d4Var.O() || d4Var.R();
        if (z10 && objArr != true) {
            l7Var.a().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), d4Var.F() ? Integer.valueOf(d4Var.G()) : null);
            return true;
        }
        String strI = s6Var.I();
        if (!d4Var.L()) {
            hashSet = new HashSet();
            it = d4Var.I().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new w1.a();
                    it2 = s6Var.F().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = d4Var.I().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                f4Var = (com.google.android.gms.internal.measurement.f4) it3.next();
                                if (f4Var.J() || !f4Var.K()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strM = f4Var.M();
                                if (strM.isEmpty()) {
                                    v8 = aVar.get(strM);
                                    if (v8 instanceof Long) {
                                        if (v8 instanceof Double) {
                                            if (v8 instanceof String) {
                                                if (v8 == 0) {
                                                    l7Var.a().r().c("Unknown param type. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                    break;
                                                }
                                                l7Var.a().w().c("Missing param for filter. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (f4Var.F()) {
                                                if (f4Var.H()) {
                                                    l7Var.a().r().c("No filter for String param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                    break;
                                                }
                                                str = (String) v8;
                                                if (af.O(str)) {
                                                    l7Var.a().r().c("Invalid param value for number filter. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                    break;
                                                }
                                                boolI = c.i(str, f4Var.I());
                                            } else {
                                                boolI = c.f((String) v8, f4Var.G(), l7Var.a());
                                            }
                                            if (boolI != null) {
                                                break;
                                            }
                                            if (boolI.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (f4Var.H()) {
                                                l7Var.a().r().c("No number filter for double param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                break;
                                            }
                                            boolH = c.h(((Double) v8).doubleValue(), f4Var.I());
                                            if (boolH != null) {
                                                break;
                                            }
                                            if (boolH.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (f4Var.H()) {
                                            l7Var.a().r().c("No number filter for long param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                            break;
                                        }
                                        boolG = c.g(((Long) v8).longValue(), f4Var.I());
                                        if (boolG != null) {
                                            break;
                                        }
                                        if (boolG.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    l7Var.a().r().b("Event has empty param name. event", l7Var.D().a(strI));
                                    break;
                                }
                            }
                        } else {
                            w6Var = (com.google.android.gms.internal.measurement.w6) it2.next();
                            if (!hashSet.contains(w6Var.G())) {
                                if (w6Var.J()) {
                                    if (w6Var.N()) {
                                        if (w6Var.H()) {
                                            l7Var.a().r().c("Unknown value for param. event, param", l7Var.D().a(strI), l7Var.D().b(w6Var.G()));
                                            break;
                                        }
                                        aVar.put(w6Var.G(), w6Var.I());
                                    } else {
                                        String strG = w6Var.G();
                                        if (w6Var.N()) {
                                            dValueOf = Double.valueOf(w6Var.O());
                                        } else {
                                            dValueOf = null;
                                        }
                                        aVar.put(strG, dValueOf);
                                    }
                                } else {
                                    String strG2 = w6Var.G();
                                    if (w6Var.J()) {
                                        lValueOf = Long.valueOf(w6Var.K());
                                    } else {
                                        lValueOf = null;
                                    }
                                    aVar.put(strG2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    f4Var2 = (com.google.android.gms.internal.measurement.f4) it.next();
                    if (f4Var2.M().isEmpty()) {
                        l7Var.a().r().b("null or empty param name in filter. event", l7Var.D().a(strI));
                        break;
                    }
                    hashSet.add(f4Var2.M());
                }
            }
        } else {
            Boolean boolG2 = c.g(j11, d4Var.M());
            if (boolG2 != null) {
                if (boolG2.booleanValue()) {
                    hashSet = new HashSet();
                    it = d4Var.I().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = new w1.a();
                            it2 = s6Var.F().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = d4Var.I().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        f4Var = (com.google.android.gms.internal.measurement.f4) it3.next();
                                        if (f4Var.J()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strM = f4Var.M();
                                        if (strM.isEmpty()) {
                                            v8 = aVar.get(strM);
                                            if (v8 instanceof Long) {
                                                if (v8 instanceof Double) {
                                                    if (v8 instanceof String) {
                                                        if (v8 == 0) {
                                                            l7Var.a().r().c("Unknown param type. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                            break;
                                                        }
                                                        l7Var.a().w().c("Missing param for filter. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (f4Var.F()) {
                                                        if (f4Var.H()) {
                                                            l7Var.a().r().c("No filter for String param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                            break;
                                                        }
                                                        str = (String) v8;
                                                        if (af.O(str)) {
                                                            l7Var.a().r().c("Invalid param value for number filter. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                            break;
                                                        }
                                                        boolI = c.i(str, f4Var.I());
                                                    } else {
                                                        boolI = c.f((String) v8, f4Var.G(), l7Var.a());
                                                    }
                                                    if (boolI != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolI.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (f4Var.H()) {
                                                    boolH = c.h(((Double) v8).doubleValue(), f4Var.I());
                                                    if (boolH != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolH.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    l7Var.a().r().c("No number filter for double param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                    break;
                                                }
                                            } else if (f4Var.H()) {
                                                boolG = c.g(((Long) v8).longValue(), f4Var.I());
                                                if (boolG != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolG.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                l7Var.a().r().c("No number filter for long param. event, param", l7Var.D().a(strI), l7Var.D().b(strM));
                                                break;
                                            }
                                        } else {
                                            l7Var.a().r().b("Event has empty param name. event", l7Var.D().a(strI));
                                            break;
                                        }
                                    }
                                } else {
                                    w6Var = (com.google.android.gms.internal.measurement.w6) it2.next();
                                    if (!hashSet.contains(w6Var.G())) {
                                        if (w6Var.J()) {
                                            if (w6Var.N()) {
                                                if (w6Var.H()) {
                                                    l7Var.a().r().c("Unknown value for param. event, param", l7Var.D().a(strI), l7Var.D().b(w6Var.G()));
                                                    break;
                                                }
                                                aVar.put(w6Var.G(), w6Var.I());
                                            } else {
                                                String strG3 = w6Var.G();
                                                if (w6Var.N()) {
                                                    dValueOf = Double.valueOf(w6Var.O());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                aVar.put(strG3, dValueOf);
                                            }
                                        } else {
                                            String strG4 = w6Var.G();
                                            if (w6Var.J()) {
                                                lValueOf = Long.valueOf(w6Var.K());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(strG4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            f4Var2 = (com.google.android.gms.internal.measurement.f4) it.next();
                            if (f4Var2.M().isEmpty()) {
                                l7Var.a().r().b("null or empty param name in filter. event", l7Var.D().a(strI));
                                break;
                            }
                            hashSet.add(f4Var2.M());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        l7Var.a().w().b("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f27134c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f27135d = bool2;
        if (objArr != false && s6Var.J()) {
            Long lValueOf2 = Long.valueOf(s6Var.K());
            if (d4Var.O()) {
                if (zH && d4Var.L()) {
                    lValueOf2 = l10;
                }
                this.f27137f = lValueOf2;
            } else {
                if (zH && d4Var.L()) {
                    lValueOf2 = l11;
                }
                this.f27136e = lValueOf2;
            }
        }
        return true;
    }
}

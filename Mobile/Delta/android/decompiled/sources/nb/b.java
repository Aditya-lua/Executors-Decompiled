package nb;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.z3 f25344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f25345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, int i10, com.google.android.gms.internal.measurement.z3 z3Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f25345h = eVar;
        this.f25344g = z3Var;
    }

    @Override // nb.c
    public final int a() {
        return this.f25344g.G();
    }

    @Override // nb.c
    public final boolean b() {
        return false;
    }

    @Override // nb.c
    public final boolean c() {
        return this.f25344g.N();
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
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.o6 o6Var, long j10, b0 b0Var, boolean z10) {
        HashSet hashSet;
        Iterator it;
        w1.a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.b4 b4Var;
        boolean z11;
        String strO;
        V v5;
        Boolean boolG;
        Boolean boolH;
        String str;
        Boolean boolI;
        com.google.android.gms.internal.measurement.s6 s6Var;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.b4 b4Var2;
        com.google.android.gms.internal.measurement.ye.a();
        e eVar = this.f25345h;
        g7 g7Var = eVar.f25625a;
        k kVarW = g7Var.w();
        String str2 = this.f25377a;
        boolean zH = kVarW.H(str2, z4.G0);
        com.google.android.gms.internal.measurement.z3 z3Var = this.f25344g;
        long j11 = z3Var.S() ? b0Var.f25349e : j10;
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
        if (Log.isLoggable(g7Var.a().z(), 2)) {
            g7Var.a().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.b), z3Var.F() ? Integer.valueOf(z3Var.G()) : null, g7Var.D().a(z3Var.H()));
            g7Var.a().w().b("Filter definition", eVar.b.K0().L(z3Var));
        }
        if (!z3Var.F() || z3Var.G() > 256) {
            g7Var.a().r().c("Invalid event filter ID. appId, id", w5.x(str2), String.valueOf(z3Var.F() ? Integer.valueOf(z3Var.G()) : null));
            return false;
        }
        Object[] objArr = z3Var.P() || z3Var.Q() || z3Var.S();
        if (z10 && objArr != true) {
            g7Var.a().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), z3Var.F() ? Integer.valueOf(z3Var.G()) : null);
            return true;
        }
        String strJ = o6Var.J();
        if (!z3Var.N()) {
            hashSet = new HashSet();
            it = z3Var.J().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new w1.a();
                    it2 = o6Var.F().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = z3Var.J().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                b4Var = (com.google.android.gms.internal.measurement.b4) it3.next();
                                if (b4Var.K() || !b4Var.L()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strO = b4Var.O();
                                if (strO.isEmpty()) {
                                    v5 = aVar.get(strO);
                                    if (v5 instanceof Long) {
                                        if (v5 instanceof Double) {
                                            if (v5 instanceof String) {
                                                if (v5 == 0) {
                                                    g7Var.a().r().c("Unknown param type. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                    break;
                                                }
                                                g7Var.a().w().c("Missing param for filter. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (b4Var.F()) {
                                                if (b4Var.H()) {
                                                    g7Var.a().r().c("No filter for String param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                    break;
                                                }
                                                str = (String) v5;
                                                if (re.O(str)) {
                                                    g7Var.a().r().c("Invalid param value for number filter. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                    break;
                                                }
                                                boolI = c.i(str, b4Var.J());
                                            } else {
                                                boolI = c.f((String) v5, b4Var.G(), g7Var.a());
                                            }
                                            if (boolI != null) {
                                                break;
                                            }
                                            if (boolI.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (b4Var.H()) {
                                                g7Var.a().r().c("No number filter for double param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                break;
                                            }
                                            boolH = c.h(((Double) v5).doubleValue(), b4Var.J());
                                            if (boolH != null) {
                                                break;
                                            }
                                            if (boolH.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (b4Var.H()) {
                                            g7Var.a().r().c("No number filter for long param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                            break;
                                        }
                                        boolG = c.g(((Long) v5).longValue(), b4Var.J());
                                        if (boolG != null) {
                                            break;
                                        }
                                        if (boolG.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    g7Var.a().r().b("Event has empty param name. event", g7Var.D().a(strJ));
                                    break;
                                }
                            }
                        } else {
                            s6Var = (com.google.android.gms.internal.measurement.s6) it2.next();
                            if (!hashSet.contains(s6Var.G())) {
                                if (s6Var.K()) {
                                    if (s6Var.P()) {
                                        if (s6Var.H()) {
                                            g7Var.a().r().c("Unknown value for param. event, param", g7Var.D().a(strJ), g7Var.D().b(s6Var.G()));
                                            break;
                                        }
                                        aVar.put(s6Var.G(), s6Var.J());
                                    } else {
                                        String strG = s6Var.G();
                                        if (s6Var.P()) {
                                            dValueOf = Double.valueOf(s6Var.Q());
                                        } else {
                                            dValueOf = null;
                                        }
                                        aVar.put(strG, dValueOf);
                                    }
                                } else {
                                    String strG2 = s6Var.G();
                                    if (s6Var.K()) {
                                        lValueOf = Long.valueOf(s6Var.L());
                                    } else {
                                        lValueOf = null;
                                    }
                                    aVar.put(strG2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    b4Var2 = (com.google.android.gms.internal.measurement.b4) it.next();
                    if (b4Var2.O().isEmpty()) {
                        g7Var.a().r().b("null or empty param name in filter. event", g7Var.D().a(strJ));
                        break;
                    }
                    hashSet.add(b4Var2.O());
                }
            }
        } else {
            Boolean boolG2 = c.g(j11, z3Var.O());
            if (boolG2 != null) {
                if (boolG2.booleanValue()) {
                    hashSet = new HashSet();
                    it = z3Var.J().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = new w1.a();
                            it2 = o6Var.F().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = z3Var.J().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        b4Var = (com.google.android.gms.internal.measurement.b4) it3.next();
                                        if (b4Var.K()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strO = b4Var.O();
                                        if (strO.isEmpty()) {
                                            v5 = aVar.get(strO);
                                            if (v5 instanceof Long) {
                                                if (v5 instanceof Double) {
                                                    if (v5 instanceof String) {
                                                        if (v5 == 0) {
                                                            g7Var.a().r().c("Unknown param type. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                            break;
                                                        }
                                                        g7Var.a().w().c("Missing param for filter. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (b4Var.F()) {
                                                        if (b4Var.H()) {
                                                            g7Var.a().r().c("No filter for String param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                            break;
                                                        }
                                                        str = (String) v5;
                                                        if (re.O(str)) {
                                                            g7Var.a().r().c("Invalid param value for number filter. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                            break;
                                                        }
                                                        boolI = c.i(str, b4Var.J());
                                                    } else {
                                                        boolI = c.f((String) v5, b4Var.G(), g7Var.a());
                                                    }
                                                    if (boolI != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolI.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (b4Var.H()) {
                                                    boolH = c.h(((Double) v5).doubleValue(), b4Var.J());
                                                    if (boolH != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolH.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    g7Var.a().r().c("No number filter for double param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                    break;
                                                }
                                            } else if (b4Var.H()) {
                                                boolG = c.g(((Long) v5).longValue(), b4Var.J());
                                                if (boolG != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolG.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                g7Var.a().r().c("No number filter for long param. event, param", g7Var.D().a(strJ), g7Var.D().b(strO));
                                                break;
                                            }
                                        } else {
                                            g7Var.a().r().b("Event has empty param name. event", g7Var.D().a(strJ));
                                            break;
                                        }
                                    }
                                } else {
                                    s6Var = (com.google.android.gms.internal.measurement.s6) it2.next();
                                    if (!hashSet.contains(s6Var.G())) {
                                        if (s6Var.K()) {
                                            if (s6Var.P()) {
                                                if (s6Var.H()) {
                                                    g7Var.a().r().c("Unknown value for param. event, param", g7Var.D().a(strJ), g7Var.D().b(s6Var.G()));
                                                    break;
                                                }
                                                aVar.put(s6Var.G(), s6Var.J());
                                            } else {
                                                String strG3 = s6Var.G();
                                                if (s6Var.P()) {
                                                    dValueOf = Double.valueOf(s6Var.Q());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                aVar.put(strG3, dValueOf);
                                            }
                                        } else {
                                            String strG4 = s6Var.G();
                                            if (s6Var.K()) {
                                                lValueOf = Long.valueOf(s6Var.L());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(strG4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            b4Var2 = (com.google.android.gms.internal.measurement.b4) it.next();
                            if (b4Var2.O().isEmpty()) {
                                g7Var.a().r().b("null or empty param name in filter. event", g7Var.D().a(strJ));
                                break;
                            }
                            hashSet.add(b4Var2.O());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        g7Var.a().w().b("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f25378c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f25379d = bool2;
        if (objArr != false && o6Var.K()) {
            Long lValueOf2 = Long.valueOf(o6Var.L());
            if (z3Var.Q()) {
                if (zH && z3Var.N()) {
                    lValueOf2 = l10;
                }
                this.f25381f = lValueOf2;
            } else {
                if (zH && z3Var.N()) {
                    lValueOf2 = l11;
                }
                this.f25380e = lValueOf2;
            }
        }
        return true;
    }
}

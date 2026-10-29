package p306nb;

import android.util.Log;
import com.google.android.gms.internal.measurement.C1984b4;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2298s6;
import com.google.android.gms.internal.measurement.C2414ye;
import com.google.android.gms.internal.measurement.C2421z3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p504w1.C12277a;

/* JADX INFO: renamed from: nb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9002b extends AbstractC9019c {

    /* JADX INFO: renamed from: g */
    public final C2421z3 f32698g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C9053e f32699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9002b(C9053e c9053e, String str, int i10, C2421z3 c2421z3) {
        super(str, i10);
        Objects.requireNonNull(c9053e);
        this.f32699h = c9053e;
        this.f32698g = c2421z3;
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: a */
    public final int mo36113a() {
        return this.f32698g.m11040G();
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: b */
    public final boolean mo36114b() {
        return false;
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: c */
    public final boolean mo36115c() {
        return this.f32698g.m11045N();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object[] */
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
    /* JADX INFO: renamed from: k */
    public final boolean m36116k(Long l10, Long l11, C2226o6 c2226o6, long j10, C9003b0 c9003b0, boolean z10) {
        HashSet hashSet;
        Iterator it;
        C12277a c12277a;
        Iterator it2;
        Iterator it3;
        C1984b4 c1984b4;
        boolean z11;
        String strM9784O;
        V v5;
        Boolean boolM36155g;
        Boolean boolM36156h;
        String str;
        Boolean boolM36157i;
        C2298s6 c2298s6;
        Long lValueOf;
        Double dValueOf;
        C1984b4 c1984b5;
        C2414ye.m11027a();
        C9053e c9053e = this.f32699h;
        C9094g7 c9094g7 = c9053e.f33067a;
        C9150k c9150kM36338w = c9094g7.m36338w();
        String str2 = this.f32739a;
        boolean zM36406H = c9150kM36338w.m36406H(str2, C9395z4.f33718G0);
        C2421z3 c2421z3 = this.f32698g;
        long j11 = c2421z3.m11050S() ? c9003b0.f32704e : j10;
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
        if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
            c9094g7.mo36321a().m37011w().m36914d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f32740b), c2421z3.m11039F() ? Integer.valueOf(c2421z3.m11040G()) : null, c9094g7.m36309D().m36620a(c2421z3.m11041H()));
            c9094g7.mo36321a().m37011w().m36912b("Filter definition", c9053e.f33516b.m36515K0().m36755L(c2421z3));
        }
        if (!c2421z3.m11039F() || c2421z3.m11040G() > 256) {
            c9094g7.mo36321a().m37006r().m36913c("Invalid event filter ID. appId, id", C9348w5.m36998x(str2), String.valueOf(c2421z3.m11039F() ? Integer.valueOf(c2421z3.m11040G()) : null));
            return false;
        }
        Object[] objArr = c2421z3.m11047P() || c2421z3.m11048Q() || c2421z3.m11050S();
        if (z10 && objArr != true) {
            c9094g7.mo36321a().m37011w().m36913c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f32740b), c2421z3.m11039F() ? Integer.valueOf(c2421z3.m11040G()) : null);
            return true;
        }
        String strM10490J = c2226o6.m10490J();
        if (!c2421z3.m11045N()) {
            hashSet = new HashSet();
            it = c2421z3.m11042J().iterator();
            while (true) {
                if (it.hasNext()) {
                    c12277a = new C12277a();
                    it2 = c2226o6.m10487F().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c2421z3.m11042J().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c1984b4 = (C1984b4) it3.next();
                                if (c1984b4.m9781K() || !c1984b4.m9782M()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strM9784O = c1984b4.m9784O();
                                if (strM9784O.isEmpty()) {
                                    v5 = c12277a.get(strM9784O);
                                    if (v5 instanceof Long) {
                                        if (v5 instanceof Double) {
                                            if (v5 instanceof String) {
                                                if (v5 == 0) {
                                                    c9094g7.mo36321a().m37006r().m36913c("Unknown param type. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                    break;
                                                }
                                                c9094g7.mo36321a().m37011w().m36913c("Missing param for filter. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (c1984b4.m9777F()) {
                                                if (c1984b4.m9779H()) {
                                                    c9094g7.mo36321a().m37006r().m36913c("No filter for String param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                    break;
                                                }
                                                str = (String) v5;
                                                if (C9277re.m36734O(str)) {
                                                    c9094g7.mo36321a().m37006r().m36913c("Invalid param value for number filter. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                    break;
                                                }
                                                boolM36157i = AbstractC9019c.m36157i(str, c1984b4.m9780J());
                                            } else {
                                                boolM36157i = AbstractC9019c.m36154f((String) v5, c1984b4.m9778G(), c9094g7.mo36321a());
                                            }
                                            if (boolM36157i != null) {
                                                break;
                                            }
                                            if (boolM36157i.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (c1984b4.m9779H()) {
                                                c9094g7.mo36321a().m37006r().m36913c("No number filter for double param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                break;
                                            }
                                            boolM36156h = AbstractC9019c.m36156h(((Double) v5).doubleValue(), c1984b4.m9780J());
                                            if (boolM36156h != null) {
                                                break;
                                            }
                                            if (boolM36156h.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (c1984b4.m9779H()) {
                                            c9094g7.mo36321a().m37006r().m36913c("No number filter for long param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                            break;
                                        }
                                        boolM36155g = AbstractC9019c.m36155g(((Long) v5).longValue(), c1984b4.m9780J());
                                        if (boolM36155g != null) {
                                            break;
                                        }
                                        if (boolM36155g.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    c9094g7.mo36321a().m37006r().m36912b("Event has empty param name. event", c9094g7.m36309D().m36620a(strM10490J));
                                    break;
                                }
                            }
                        } else {
                            c2298s6 = (C2298s6) it2.next();
                            if (!hashSet.contains(c2298s6.m10697G())) {
                                if (c2298s6.m10700K()) {
                                    if (c2298s6.m10704P()) {
                                        if (c2298s6.m10698H()) {
                                            c9094g7.mo36321a().m37006r().m36913c("Unknown value for param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(c2298s6.m10697G()));
                                            break;
                                        }
                                        c12277a.put(c2298s6.m10697G(), c2298s6.m10699J());
                                    } else {
                                        String strM10697G = c2298s6.m10697G();
                                        if (c2298s6.m10704P()) {
                                            dValueOf = Double.valueOf(c2298s6.m10705Q());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c12277a.put(strM10697G, dValueOf);
                                    }
                                } else {
                                    String strM10697G2 = c2298s6.m10697G();
                                    if (c2298s6.m10700K()) {
                                        lValueOf = Long.valueOf(c2298s6.m10701M());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c12277a.put(strM10697G2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    c1984b5 = (C1984b4) it.next();
                    if (c1984b5.m9784O().isEmpty()) {
                        c9094g7.mo36321a().m37006r().m36912b("null or empty param name in filter. event", c9094g7.m36309D().m36620a(strM10490J));
                        break;
                    }
                    hashSet.add(c1984b5.m9784O());
                }
            }
        } else {
            Boolean boolM36155g2 = AbstractC9019c.m36155g(j11, c2421z3.m11046O());
            if (boolM36155g2 != null) {
                if (boolM36155g2.booleanValue()) {
                    hashSet = new HashSet();
                    it = c2421z3.m11042J().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c12277a = new C12277a();
                            it2 = c2226o6.m10487F().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = c2421z3.m11042J().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        c1984b4 = (C1984b4) it3.next();
                                        if (c1984b4.m9781K()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strM9784O = c1984b4.m9784O();
                                        if (strM9784O.isEmpty()) {
                                            v5 = c12277a.get(strM9784O);
                                            if (v5 instanceof Long) {
                                                if (v5 instanceof Double) {
                                                    if (v5 instanceof String) {
                                                        if (v5 == 0) {
                                                            c9094g7.mo36321a().m37006r().m36913c("Unknown param type. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                            break;
                                                        }
                                                        c9094g7.mo36321a().m37011w().m36913c("Missing param for filter. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (c1984b4.m9777F()) {
                                                        if (c1984b4.m9779H()) {
                                                            c9094g7.mo36321a().m37006r().m36913c("No filter for String param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                            break;
                                                        }
                                                        str = (String) v5;
                                                        if (C9277re.m36734O(str)) {
                                                            c9094g7.mo36321a().m37006r().m36913c("Invalid param value for number filter. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                            break;
                                                        }
                                                        boolM36157i = AbstractC9019c.m36157i(str, c1984b4.m9780J());
                                                    } else {
                                                        boolM36157i = AbstractC9019c.m36154f((String) v5, c1984b4.m9778G(), c9094g7.mo36321a());
                                                    }
                                                    if (boolM36157i != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolM36157i.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (c1984b4.m9779H()) {
                                                    boolM36156h = AbstractC9019c.m36156h(((Double) v5).doubleValue(), c1984b4.m9780J());
                                                    if (boolM36156h != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolM36156h.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    c9094g7.mo36321a().m37006r().m36913c("No number filter for double param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                    break;
                                                }
                                            } else if (c1984b4.m9779H()) {
                                                boolM36155g = AbstractC9019c.m36155g(((Long) v5).longValue(), c1984b4.m9780J());
                                                if (boolM36155g != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM36155g.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                c9094g7.mo36321a().m37006r().m36913c("No number filter for long param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(strM9784O));
                                                break;
                                            }
                                        } else {
                                            c9094g7.mo36321a().m37006r().m36912b("Event has empty param name. event", c9094g7.m36309D().m36620a(strM10490J));
                                            break;
                                        }
                                    }
                                } else {
                                    c2298s6 = (C2298s6) it2.next();
                                    if (!hashSet.contains(c2298s6.m10697G())) {
                                        if (c2298s6.m10700K()) {
                                            if (c2298s6.m10704P()) {
                                                if (c2298s6.m10698H()) {
                                                    c9094g7.mo36321a().m37006r().m36913c("Unknown value for param. event, param", c9094g7.m36309D().m36620a(strM10490J), c9094g7.m36309D().m36621b(c2298s6.m10697G()));
                                                    break;
                                                }
                                                c12277a.put(c2298s6.m10697G(), c2298s6.m10699J());
                                            } else {
                                                String strM10697G3 = c2298s6.m10697G();
                                                if (c2298s6.m10704P()) {
                                                    dValueOf = Double.valueOf(c2298s6.m10705Q());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                c12277a.put(strM10697G3, dValueOf);
                                            }
                                        } else {
                                            String strM10697G4 = c2298s6.m10697G();
                                            if (c2298s6.m10700K()) {
                                                lValueOf = Long.valueOf(c2298s6.m10701M());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c12277a.put(strM10697G4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            c1984b5 = (C1984b4) it.next();
                            if (c1984b5.m9784O().isEmpty()) {
                                c9094g7.mo36321a().m37006r().m36912b("null or empty param name in filter. event", c9094g7.m36309D().m36620a(strM10490J));
                                break;
                            }
                            hashSet.add(c1984b5.m9784O());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        c9094g7.mo36321a().m37011w().m36912b("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f32741c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f32742d = bool2;
        if (objArr != false && c2226o6.m10491K()) {
            Long lValueOf2 = Long.valueOf(c2226o6.m10492M());
            if (c2421z3.m11048Q()) {
                if (zM36406H && c2421z3.m11045N()) {
                    lValueOf2 = l10;
                }
                this.f32744f = lValueOf2;
            } else {
                if (zM36406H && c2421z3.m11045N()) {
                    lValueOf2 = l11;
                }
                this.f32743e = lValueOf2;
            }
        }
        return true;
    }
}

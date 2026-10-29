package com.google.android.gms.internal.measurement;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends x {
    public m0() {
        this.f6892a.add(n0.ASSIGN);
        this.f6892a.add(n0.CONST);
        this.f6892a.add(n0.CREATE_ARRAY);
        this.f6892a.add(n0.CREATE_OBJECT);
        this.f6892a.add(n0.EXPRESSION_LIST);
        this.f6892a.add(n0.GET);
        this.f6892a.add(n0.GET_INDEX);
        this.f6892a.add(n0.GET_PROPERTY);
        this.f6892a.add(n0.NULL);
        this.f6892a.add(n0.SET_PROPERTY);
        this.f6892a.add(n0.TYPEOF);
        this.f6892a.add(n0.UNDEFINED);
        this.f6892a.add(n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        String str2;
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            v5.a(n0.ASSIGN.name(), 2, list);
            q qVarA = u4Var.a((q) list.get(0));
            if (!(qVarA instanceof u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", qVarA.getClass().getCanonicalName()));
            }
            if (!u4Var.d(qVarA.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", qVarA.zzc()));
            }
            q qVarA2 = u4Var.a((q) list.get(1));
            u4Var.e(qVarA.zzc(), qVarA2);
            return qVarA2;
        }
        if (iOrdinal == 14) {
            v5.b(n0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                q qVarA3 = u4Var.a((q) list.get(i10));
                if (!(qVarA3 instanceof u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", qVarA3.getClass().getCanonicalName()));
                }
                u4Var.g(qVarA3.zzc(), u4Var.a((q) list.get(i10 + 1)));
                i10 += 2;
            }
            return q.f6743zo;
        }
        if (iOrdinal == 24) {
            v5.b(n0.EXPRESSION_LIST.name(), 1, list);
            q qVarA4 = q.f6743zo;
            while (i10 < list.size()) {
                qVarA4 = u4Var.a((q) list.get(i10));
                if (qVarA4 instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return qVarA4;
        }
        if (iOrdinal == 33) {
            v5.a(n0.GET.name(), 1, list);
            q qVarA5 = u4Var.a((q) list.get(0));
            if (qVarA5 instanceof u) {
                return u4Var.h(qVarA5.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", qVarA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            v5.a(n0.NULL.name(), 0, list);
            return q.Ao;
        }
        if (iOrdinal == 58) {
            v5.a(n0.SET_PROPERTY.name(), 3, list);
            q qVarA6 = u4Var.a((q) list.get(0));
            q qVarA7 = u4Var.a((q) list.get(1));
            q qVarA8 = u4Var.a((q) list.get(2));
            if (qVarA6 == q.f6743zo || qVarA6 == q.Ao) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", qVarA7.zzc(), qVarA6.zzc()));
            }
            if ((qVarA6 instanceof f) && (qVarA7 instanceof j)) {
                ((f) qVarA6).p(qVarA7.zzd().intValue(), qVarA8);
                return qVarA8;
            }
            if (!(qVarA6 instanceof m)) {
                return qVarA8;
            }
            ((m) qVarA6).d(qVarA7.zzc(), qVarA8);
            return qVarA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q qVarA9 = u4Var.a((q) it.next());
                if (qVarA9 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.p(i10, qVarA9);
                i10++;
            }
            return fVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            n nVar = new n();
            while (i10 < list.size() - 1) {
                q qVarA10 = u4Var.a((q) list.get(i10));
                q qVarA11 = u4Var.a((q) list.get(i10 + 1));
                if ((qVarA10 instanceof h) || (qVarA11 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                nVar.d(qVarA10.zzc(), qVarA11);
                i10 += 2;
            }
            return nVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            v5.a(n0.GET_PROPERTY.name(), 2, list);
            q qVarA12 = u4Var.a((q) list.get(0));
            q qVarA13 = u4Var.a((q) list.get(1));
            if ((qVarA12 instanceof f) && v5.d(qVarA13)) {
                return ((f) qVarA12).m(qVarA13.zzd().intValue());
            }
            if (qVarA12 instanceof m) {
                return ((m) qVarA12).c(qVarA13.zzc());
            }
            if (qVarA12 instanceof u) {
                if ("length".equals(qVarA13.zzc())) {
                    return new j(Double.valueOf(qVarA12.zzc().length()));
                }
                if (v5.d(qVarA13) && qVarA13.zzd().doubleValue() < qVarA12.zzc().length()) {
                    return new u(String.valueOf(qVarA12.zzc().charAt(qVarA13.zzd().intValue())));
                }
            }
            return q.f6743zo;
        }
        switch (iOrdinal) {
            case 62:
                v5.a(n0.TYPEOF.name(), 1, list);
                q qVarA14 = u4Var.a((q) list.get(0));
                if (qVarA14 instanceof v) {
                    str2 = "undefined";
                } else if (qVarA14 instanceof g) {
                    str2 = InquiryField.BooleanField.TYPE;
                } else if (qVarA14 instanceof j) {
                    str2 = InquiryField.FloatField.TYPE2;
                } else if (qVarA14 instanceof u) {
                    str2 = InquiryField.StringField.TYPE;
                } else if (qVarA14 instanceof p) {
                    str2 = "function";
                } else {
                    if ((qVarA14 instanceof r) || (qVarA14 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", qVarA14));
                    }
                    str2 = "object";
                }
                return new u(str2);
            case 63:
                v5.a(n0.UNDEFINED.name(), 0, list);
                return q.f6743zo;
            case 64:
                v5.b(n0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    q qVarA15 = u4Var.a((q) it2.next());
                    if (!(qVarA15 instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", qVarA15.getClass().getCanonicalName()));
                    }
                    u4Var.f(qVarA15.zzc(), q.f6743zo);
                }
                return q.f6743zo;
            default:
                return super.b(str);
        }
    }
}

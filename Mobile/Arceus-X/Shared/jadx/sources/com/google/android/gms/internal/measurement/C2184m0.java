package com.google.android.gms.internal.measurement;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2184m0 extends AbstractC2381x {
    public C2184m0() {
        this.f8765a.add(EnumC2202n0.ASSIGN);
        this.f8765a.add(EnumC2202n0.CONST);
        this.f8765a.add(EnumC2202n0.CREATE_ARRAY);
        this.f8765a.add(EnumC2202n0.CREATE_OBJECT);
        this.f8765a.add(EnumC2202n0.EXPRESSION_LIST);
        this.f8765a.add(EnumC2202n0.GET);
        this.f8765a.add(EnumC2202n0.GET_INDEX);
        this.f8765a.add(EnumC2202n0.GET_PROPERTY);
        this.f8765a.add(EnumC2202n0.NULL);
        this.f8765a.add(EnumC2202n0.SET_PROPERTY);
        this.f8765a.add(EnumC2202n0.TYPEOF);
        this.f8765a.add(EnumC2202n0.UNDEFINED);
        this.f8765a.add(EnumC2202n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        String str2;
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            C2351v5.m10828a(EnumC2202n0.ASSIGN.name(), 2, list);
            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            if (!(interfaceC2255qM10776a instanceof C2327u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC2255qM10776a.getClass().getCanonicalName()));
            }
            if (!c2332u4.m10779d(interfaceC2255qM10776a.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC2255qM10776a.zzc()));
            }
            InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            c2332u4.m10780e(interfaceC2255qM10776a.zzc(), interfaceC2255qM10776a2);
            return interfaceC2255qM10776a2;
        }
        if (iOrdinal == 14) {
            C2351v5.m10829b(EnumC2202n0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                InterfaceC2255q interfaceC2255qM10776a3 = c2332u4.m10776a((InterfaceC2255q) list.get(i10));
                if (!(interfaceC2255qM10776a3 instanceof C2327u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC2255qM10776a3.getClass().getCanonicalName()));
                }
                c2332u4.m10782g(interfaceC2255qM10776a3.zzc(), c2332u4.m10776a((InterfaceC2255q) list.get(i10 + 1)));
                i10 += 2;
            }
            return InterfaceC2255q.f8587zo;
        }
        if (iOrdinal == 24) {
            C2351v5.m10829b(EnumC2202n0.EXPRESSION_LIST.name(), 1, list);
            InterfaceC2255q interfaceC2255qM10776a4 = InterfaceC2255q.f8587zo;
            while (i10 < list.size()) {
                interfaceC2255qM10776a4 = c2332u4.m10776a((InterfaceC2255q) list.get(i10));
                if (interfaceC2255qM10776a4 instanceof C2093h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC2255qM10776a4;
        }
        if (iOrdinal == 33) {
            C2351v5.m10828a(EnumC2202n0.GET.name(), 1, list);
            InterfaceC2255q interfaceC2255qM10776a5 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            if (interfaceC2255qM10776a5 instanceof C2327u) {
                return c2332u4.m10783h(interfaceC2255qM10776a5.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC2255qM10776a5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            C2351v5.m10828a(EnumC2202n0.NULL.name(), 0, list);
            return InterfaceC2255q.f8580Ao;
        }
        if (iOrdinal == 58) {
            C2351v5.m10828a(EnumC2202n0.SET_PROPERTY.name(), 3, list);
            InterfaceC2255q interfaceC2255qM10776a6 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            InterfaceC2255q interfaceC2255qM10776a7 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            InterfaceC2255q interfaceC2255qM10776a8 = c2332u4.m10776a((InterfaceC2255q) list.get(2));
            if (interfaceC2255qM10776a6 == InterfaceC2255q.f8587zo || interfaceC2255qM10776a6 == InterfaceC2255q.f8580Ao) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC2255qM10776a7.zzc(), interfaceC2255qM10776a6.zzc()));
            }
            if ((interfaceC2255qM10776a6 instanceof C2055f) && (interfaceC2255qM10776a7 instanceof C2129j)) {
                ((C2055f) interfaceC2255qM10776a6).m9960p(interfaceC2255qM10776a7.zzd().intValue(), interfaceC2255qM10776a8);
                return interfaceC2255qM10776a8;
            }
            if (!(interfaceC2255qM10776a6 instanceof InterfaceC2183m)) {
                return interfaceC2255qM10776a8;
            }
            ((InterfaceC2183m) interfaceC2255qM10776a6).mo9952d(interfaceC2255qM10776a7.zzc(), interfaceC2255qM10776a8);
            return interfaceC2255qM10776a8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C2055f();
            }
            C2055f c2055f = new C2055f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC2255q interfaceC2255qM10776a9 = c2332u4.m10776a((InterfaceC2255q) it.next());
                if (interfaceC2255qM10776a9 instanceof C2093h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c2055f.m9960p(i10, interfaceC2255qM10776a9);
                i10++;
            }
            return c2055f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C2201n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C2201n c2201n = new C2201n();
            while (i10 < list.size() - 1) {
                InterfaceC2255q interfaceC2255qM10776a10 = c2332u4.m10776a((InterfaceC2255q) list.get(i10));
                InterfaceC2255q interfaceC2255qM10776a11 = c2332u4.m10776a((InterfaceC2255q) list.get(i10 + 1));
                if ((interfaceC2255qM10776a10 instanceof C2093h) || (interfaceC2255qM10776a11 instanceof C2093h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c2201n.mo9952d(interfaceC2255qM10776a10.zzc(), interfaceC2255qM10776a11);
                i10 += 2;
            }
            return c2201n;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            C2351v5.m10828a(EnumC2202n0.GET_PROPERTY.name(), 2, list);
            InterfaceC2255q interfaceC2255qM10776a12 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            InterfaceC2255q interfaceC2255qM10776a13 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            if ((interfaceC2255qM10776a12 instanceof C2055f) && C2351v5.m10831d(interfaceC2255qM10776a13)) {
                return ((C2055f) interfaceC2255qM10776a12).m9959m(interfaceC2255qM10776a13.zzd().intValue());
            }
            if (interfaceC2255qM10776a12 instanceof InterfaceC2183m) {
                return ((InterfaceC2183m) interfaceC2255qM10776a12).mo9951c(interfaceC2255qM10776a13.zzc());
            }
            if (interfaceC2255qM10776a12 instanceof C2327u) {
                if ("length".equals(interfaceC2255qM10776a13.zzc())) {
                    return new C2129j(Double.valueOf(interfaceC2255qM10776a12.zzc().length()));
                }
                if (C2351v5.m10831d(interfaceC2255qM10776a13) && interfaceC2255qM10776a13.zzd().doubleValue() < interfaceC2255qM10776a12.zzc().length()) {
                    return new C2327u(String.valueOf(interfaceC2255qM10776a12.zzc().charAt(interfaceC2255qM10776a13.zzd().intValue())));
                }
            }
            return InterfaceC2255q.f8587zo;
        }
        switch (iOrdinal) {
            case 62:
                C2351v5.m10828a(EnumC2202n0.TYPEOF.name(), 1, list);
                InterfaceC2255q interfaceC2255qM10776a14 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                if (interfaceC2255qM10776a14 instanceof C2345v) {
                    str2 = "undefined";
                } else if (interfaceC2255qM10776a14 instanceof C2074g) {
                    str2 = InquiryField.BooleanField.TYPE;
                } else if (interfaceC2255qM10776a14 instanceof C2129j) {
                    str2 = InquiryField.FloatField.TYPE2;
                } else if (interfaceC2255qM10776a14 instanceof C2327u) {
                    str2 = InquiryField.StringField.TYPE;
                } else if (interfaceC2255qM10776a14 instanceof C2237p) {
                    str2 = "function";
                } else {
                    if ((interfaceC2255qM10776a14 instanceof C2273r) || (interfaceC2255qM10776a14 instanceof C2093h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC2255qM10776a14));
                    }
                    str2 = "object";
                }
                return new C2327u(str2);
            case 63:
                C2351v5.m10828a(EnumC2202n0.UNDEFINED.name(), 0, list);
                return InterfaceC2255q.f8587zo;
            case 64:
                C2351v5.m10829b(EnumC2202n0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC2255q interfaceC2255qM10776a15 = c2332u4.m10776a((InterfaceC2255q) it2.next());
                    if (!(interfaceC2255qM10776a15 instanceof C2327u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC2255qM10776a15.getClass().getCanonicalName()));
                    }
                    c2332u4.m10781f(interfaceC2255qM10776a15.zzc(), InterfaceC2255q.f8587zo);
                }
                return InterfaceC2255q.f8587zo;
            default:
                return super.m10957b(str);
        }
    }
}

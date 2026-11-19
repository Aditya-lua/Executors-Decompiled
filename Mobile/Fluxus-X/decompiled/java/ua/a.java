package ua;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import ta.c0;
import ta.e0;
import ta.g0;
import ta.i;
import ta.i0;
import ta.k0;
import ta.m;
import ta.m0;
import ta.q0;
import ta.s;
import ta.u;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: ua.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0671a extends hb.b implements a {
        public AbstractBinderC0671a() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // hb.b
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            switch (i10) {
                case 1:
                    Status status = (Status) hb.c.a(parcel, Status.CREATOR);
                    e0 e0Var = (e0) hb.c.a(parcel, e0.CREATOR);
                    s2(parcel);
                    K0(status, e0Var);
                    return true;
                case 2:
                    Status status2 = (Status) hb.c.a(parcel, Status.CREATOR);
                    m0 m0Var = (m0) hb.c.a(parcel, m0.CREATOR);
                    s2(parcel);
                    f0(status2, m0Var);
                    return true;
                case 3:
                    Status status3 = (Status) hb.c.a(parcel, Status.CREATOR);
                    ta.g gVar = (ta.g) hb.c.a(parcel, ta.g.CREATOR);
                    s2(parcel);
                    c2(status3, gVar);
                    return true;
                case 4:
                    Status status4 = (Status) hb.c.a(parcel, Status.CREATOR);
                    g0 g0Var = (g0) hb.c.a(parcel, g0.CREATOR);
                    s2(parcel);
                    R0(status4, g0Var);
                    return true;
                case 5:
                    Status status5 = (Status) hb.c.a(parcel, Status.CREATOR);
                    k0 k0Var = (k0) hb.c.a(parcel, k0.CREATOR);
                    s2(parcel);
                    Q0(status5, k0Var);
                    return true;
                case 6:
                    Status status6 = (Status) hb.c.a(parcel, Status.CREATOR);
                    m mVar = (m) hb.c.a(parcel, m.CREATOR);
                    s2(parcel);
                    b1(status6, mVar);
                    return true;
                case 7:
                    Status status7 = (Status) hb.c.a(parcel, Status.CREATOR);
                    i iVar = (i) hb.c.a(parcel, i.CREATOR);
                    s2(parcel);
                    I1(status7, iVar);
                    return true;
                case 8:
                    Status status8 = (Status) hb.c.a(parcel, Status.CREATOR);
                    i0 i0Var = (i0) hb.c.a(parcel, i0.CREATOR);
                    s2(parcel);
                    b0(status8, i0Var);
                    return true;
                case 9:
                    Status status9 = (Status) hb.c.a(parcel, Status.CREATOR);
                    ta.c cVar = (ta.c) hb.c.a(parcel, ta.c.CREATOR);
                    s2(parcel);
                    B(status9, cVar);
                    return true;
                case 10:
                    Status status10 = (Status) hb.c.a(parcel, Status.CREATOR);
                    q0 q0Var = (q0) hb.c.a(parcel, q0.CREATOR);
                    s2(parcel);
                    e0(status10, q0Var);
                    return true;
                case 11:
                    Status status11 = (Status) hb.c.a(parcel, Status.CREATOR);
                    ta.e eVar = (ta.e) hb.c.a(parcel, ta.e.CREATOR);
                    s2(parcel);
                    M1(status11, eVar);
                    return true;
                case 12:
                    Status status12 = (Status) hb.c.a(parcel, Status.CREATOR);
                    c0 c0Var = (c0) hb.c.a(parcel, c0.CREATOR);
                    s2(parcel);
                    e2(status12, c0Var);
                    return true;
                case 13:
                    Status status13 = (Status) hb.c.a(parcel, Status.CREATOR);
                    u uVar = (u) hb.c.a(parcel, u.CREATOR);
                    s2(parcel);
                    f1(status13, uVar);
                    return true;
                case 14:
                    Status status14 = (Status) hb.c.a(parcel, Status.CREATOR);
                    s sVar = (s) hb.c.a(parcel, s.CREATOR);
                    s2(parcel);
                    C0(status14, sVar);
                    return true;
                case 15:
                    Status status15 = (Status) hb.c.a(parcel, Status.CREATOR);
                    ta.a aVar = (ta.a) hb.c.a(parcel, ta.a.CREATOR);
                    s2(parcel);
                    Q(status15, aVar);
                    return true;
                default:
                    return false;
            }
        }
    }

    void B(@NonNull Status status, ta.c cVar);

    void C0(@NonNull Status status, s sVar);

    void I1(@NonNull Status status, i iVar);

    void K0(@NonNull Status status, e0 e0Var);

    void M1(@NonNull Status status, ta.e eVar);

    void Q(@NonNull Status status, ta.a aVar);

    void Q0(@NonNull Status status, k0 k0Var);

    void R0(@NonNull Status status, g0 g0Var);

    void b0(@NonNull Status status, i0 i0Var);

    void b1(@NonNull Status status, m mVar);

    void c2(@NonNull Status status, ta.g gVar);

    void e0(@NonNull Status status, q0 q0Var);

    void e2(@NonNull Status status, c0 c0Var);

    void f0(@NonNull Status status, m0 m0Var);

    void f1(@NonNull Status status, u uVar);
}

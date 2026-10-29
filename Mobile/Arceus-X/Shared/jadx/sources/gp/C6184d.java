package gp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import p082dp.C4655i;
import p111ep.C5174a;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p525wp.C12504c;
import p582yn.InterfaceC13234a;

/* JADX INFO: renamed from: gp.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6184d implements InterfaceC5830d<C3706e> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f23571a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC6203w> f23572b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC6205y> f23573c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C4655i> f23574d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C12504c> f23575e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<InterfaceC13234a> f23576f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C5174a> f23577g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<Boolean> f23578h;

    public C6184d(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC6203w> interfaceC5835i2, InterfaceC5835i<InterfaceC6205y> interfaceC5835i3, InterfaceC5835i<C4655i> interfaceC5835i4, InterfaceC5835i<C12504c> interfaceC5835i5, InterfaceC5835i<InterfaceC13234a> interfaceC5835i6, InterfaceC5835i<C5174a> interfaceC5835i7, InterfaceC5835i<Boolean> interfaceC5835i8) {
        this.f23571a = interfaceC5835i;
        this.f23572b = interfaceC5835i2;
        this.f23573c = interfaceC5835i3;
        this.f23574d = interfaceC5835i4;
        this.f23575e = interfaceC5835i5;
        this.f23576f = interfaceC5835i6;
        this.f23577g = interfaceC5835i7;
        this.f23578h = interfaceC5835i8;
    }

    /* JADX INFO: renamed from: a */
    public static C6184d m27247a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC6203w> interfaceC5835i2, InterfaceC5835i<InterfaceC6205y> interfaceC5835i3, InterfaceC5835i<C4655i> interfaceC5835i4, InterfaceC5835i<C12504c> interfaceC5835i5, InterfaceC5835i<InterfaceC13234a> interfaceC5835i6, InterfaceC5835i<C5174a> interfaceC5835i7, InterfaceC5835i<Boolean> interfaceC5835i8) {
        return new C6184d(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8);
    }

    /* JADX INFO: renamed from: c */
    public static C3706e m27248c(Context context, InterfaceC6203w interfaceC6203w, InterfaceC6205y interfaceC6205y, C4655i c4655i, C12504c c12504c, InterfaceC13234a interfaceC13234a, C5174a c5174a, boolean z10) {
        return new C3706e(context, interfaceC6203w, interfaceC6205y, c4655i, c12504c, interfaceC13234a, c5174a, z10);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3706e get() {
        return m27248c(this.f23571a.get(), this.f23572b.get(), this.f23573c.get(), this.f23574d.get(), this.f23575e.get(), this.f23576f.get(), this.f23577g.get(), this.f23578h.get().booleanValue());
    }
}

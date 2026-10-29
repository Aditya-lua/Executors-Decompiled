package p507w4;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: loaded from: classes.dex */
public class C12306a implements InterfaceC12307b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12307b f43603a;

    /* JADX INFO: renamed from: b */
    public int f43604b = 0;

    /* JADX INFO: renamed from: c */
    public int f43605c = -1;

    /* JADX INFO: renamed from: d */
    public int f43606d = -1;

    /* JADX INFO: renamed from: e */
    public Object f43607e = null;

    public C12306a(@NonNull InterfaceC12307b interfaceC12307b) {
        this.f43603a = interfaceC12307b;
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: a */
    public void mo5856a(int i10, int i11) {
        int i12;
        if (this.f43604b == 1 && i10 >= (i12 = this.f43605c)) {
            int i13 = this.f43606d;
            if (i10 <= i12 + i13) {
                this.f43606d = i13 + i11;
                this.f43605c = Math.min(i10, i12);
                return;
            }
        }
        m45756e();
        this.f43605c = i10;
        this.f43606d = i11;
        this.f43604b = 1;
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: b */
    public void mo5857b(int i10, int i11) {
        int i12;
        if (this.f43604b == 2 && (i12 = this.f43605c) >= i10 && i12 <= i10 + i11) {
            this.f43606d += i11;
            this.f43605c = i10;
        } else {
            m45756e();
            this.f43605c = i10;
            this.f43606d = i11;
            this.f43604b = 2;
        }
    }

    @Override // p507w4.InterfaceC12307b
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public void mo5858c(int i10, int i11, Object obj) {
        int i12;
        if (this.f43604b == 3) {
            int i13 = this.f43605c;
            int i14 = this.f43606d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f43607e == obj) {
                this.f43605c = Math.min(i10, i13);
                this.f43606d = Math.max(i14 + i13, i12) - this.f43605c;
                return;
            }
        }
        m45756e();
        this.f43605c = i10;
        this.f43606d = i11;
        this.f43607e = obj;
        this.f43604b = 3;
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: d */
    public void mo5859d(int i10, int i11) {
        m45756e();
        this.f43603a.mo5859d(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public void m45756e() {
        int i10 = this.f43604b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f43603a.mo5856a(this.f43605c, this.f43606d);
        } else if (i10 == 2) {
            this.f43603a.mo5857b(this.f43605c, this.f43606d);
        } else if (i10 == 3) {
            this.f43603a.mo5858c(this.f43605c, this.f43606d, this.f43607e);
        }
        this.f43607e = null;
        this.f43604b = 0;
    }
}

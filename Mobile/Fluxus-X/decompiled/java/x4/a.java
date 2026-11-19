package x4;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f36176a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36177c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36178d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f36179e = null;

    public a(@NonNull b bVar) {
        this.f36176a = bVar;
    }

    @Override // x4.b
    public void a(int i10, int i11) {
        int i12;
        if (this.b == 1 && i10 >= (i12 = this.f36177c)) {
            int i13 = this.f36178d;
            if (i10 <= i12 + i13) {
                this.f36178d = i13 + i11;
                this.f36177c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f36177c = i10;
        this.f36178d = i11;
        this.b = 1;
    }

    @Override // x4.b
    public void b(int i10, int i11) {
        int i12;
        if (this.b == 2 && (i12 = this.f36177c) >= i10 && i12 <= i10 + i11) {
            this.f36178d += i11;
            this.f36177c = i10;
        } else {
            e();
            this.f36177c = i10;
            this.f36178d = i11;
            this.b = 2;
        }
    }

    @Override // x4.b
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.b == 3) {
            int i13 = this.f36177c;
            int i14 = this.f36178d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f36179e == obj) {
                this.f36177c = Math.min(i10, i13);
                this.f36178d = Math.max(i14 + i13, i12) - this.f36177c;
                return;
            }
        }
        e();
        this.f36177c = i10;
        this.f36178d = i11;
        this.f36179e = obj;
        this.b = 3;
    }

    @Override // x4.b
    public void d(int i10, int i11) {
        e();
        this.f36176a.d(i10, i11);
    }

    public void e() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f36176a.a(this.f36177c, this.f36178d);
        } else if (i10 == 2) {
            this.f36176a.b(this.f36177c, this.f36178d);
        } else if (i10 == 3) {
            this.f36176a.c(this.f36177c, this.f36178d, this.f36179e);
        }
        this.f36179e = null;
        this.b = 0;
    }
}

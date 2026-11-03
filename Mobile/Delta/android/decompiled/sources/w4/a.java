package w4;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f33892a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33893c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33894d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f33895e = null;

    public a(@NonNull b bVar) {
        this.f33892a = bVar;
    }

    @Override // w4.b
    public void a(int i10, int i11) {
        int i12;
        if (this.b == 1 && i10 >= (i12 = this.f33893c)) {
            int i13 = this.f33894d;
            if (i10 <= i12 + i13) {
                this.f33894d = i13 + i11;
                this.f33893c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f33893c = i10;
        this.f33894d = i11;
        this.b = 1;
    }

    @Override // w4.b
    public void b(int i10, int i11) {
        int i12;
        if (this.b == 2 && (i12 = this.f33893c) >= i10 && i12 <= i10 + i11) {
            this.f33894d += i11;
            this.f33893c = i10;
        } else {
            e();
            this.f33893c = i10;
            this.f33894d = i11;
            this.b = 2;
        }
    }

    @Override // w4.b
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.b == 3) {
            int i13 = this.f33893c;
            int i14 = this.f33894d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f33895e == obj) {
                this.f33893c = Math.min(i10, i13);
                this.f33894d = Math.max(i14 + i13, i12) - this.f33893c;
                return;
            }
        }
        e();
        this.f33893c = i10;
        this.f33894d = i11;
        this.f33895e = obj;
        this.b = 3;
    }

    @Override // w4.b
    public void d(int i10, int i11) {
        e();
        this.f33892a.d(i10, i11);
    }

    public void e() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f33892a.a(this.f33893c, this.f33894d);
        } else if (i10 == 2) {
            this.f33892a.b(this.f33893c, this.f33894d);
        } else if (i10 == 3) {
            this.f33892a.c(this.f33893c, this.f33894d, this.f33895e);
        }
        this.f33895e = null;
        this.b = 0;
    }
}

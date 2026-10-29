package p365q;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* JADX INFO: renamed from: q.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C10402t0 {

    /* JADX INFO: renamed from: a */
    public int f37467a = 0;

    /* JADX INFO: renamed from: b */
    public int f37468b = 0;

    /* JADX INFO: renamed from: c */
    public int f37469c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: d */
    public int f37470d = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: e */
    public int f37471e = 0;

    /* JADX INFO: renamed from: f */
    public int f37472f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f37473g = false;

    /* JADX INFO: renamed from: h */
    public boolean f37474h = false;

    /* JADX INFO: renamed from: a */
    public int m40031a() {
        return this.f37473g ? this.f37467a : this.f37468b;
    }

    /* JADX INFO: renamed from: b */
    public int m40032b() {
        return this.f37467a;
    }

    /* JADX INFO: renamed from: c */
    public int m40033c() {
        return this.f37468b;
    }

    /* JADX INFO: renamed from: d */
    public int m40034d() {
        return this.f37473g ? this.f37468b : this.f37467a;
    }

    /* JADX INFO: renamed from: e */
    public void m40035e(int i10, int i11) {
        this.f37474h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f37471e = i10;
            this.f37467a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f37472f = i11;
            this.f37468b = i11;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m40036f(boolean z10) {
        if (z10 == this.f37473g) {
            return;
        }
        this.f37473g = z10;
        if (!this.f37474h) {
            this.f37467a = this.f37471e;
            this.f37468b = this.f37472f;
            return;
        }
        if (z10) {
            int i10 = this.f37470d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f37471e;
            }
            this.f37467a = i10;
            int i11 = this.f37469c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f37472f;
            }
            this.f37468b = i11;
            return;
        }
        int i12 = this.f37469c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f37471e;
        }
        this.f37467a = i12;
        int i13 = this.f37470d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f37472f;
        }
        this.f37468b = i13;
    }

    /* JADX INFO: renamed from: g */
    public void m40037g(int i10, int i11) {
        this.f37469c = i10;
        this.f37470d = i11;
        this.f37474h = true;
        if (this.f37473g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f37467a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f37468b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f37467a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f37468b = i11;
        }
    }
}

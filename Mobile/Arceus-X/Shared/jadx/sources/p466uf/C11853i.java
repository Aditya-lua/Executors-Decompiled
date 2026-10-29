package p466uf;

import androidx.annotation.NonNull;
import p410rf.C10867c;
import p410rf.C10868d;
import p410rf.InterfaceC10872h;

/* JADX INFO: renamed from: uf.i */
/* JADX INFO: loaded from: classes2.dex */
public class C11853i implements InterfaceC10872h {

    /* JADX INFO: renamed from: a */
    public boolean f41630a = false;

    /* JADX INFO: renamed from: b */
    public boolean f41631b = false;

    /* JADX INFO: renamed from: c */
    public C10868d f41632c;

    /* JADX INFO: renamed from: d */
    public final C11850f f41633d;

    public C11853i(C11850f c11850f) {
        this.f41633d = c11850f;
    }

    /* JADX INFO: renamed from: a */
    public final void m44273a() {
        if (this.f41630a) {
            throw new C10867c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f41630a = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p410rf.InterfaceC10872h
    @NonNull
    public InterfaceC10872h add(String str) {
        m44273a();
        this.f41633d.m44254d(this.f41632c, str, this.f41631b);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m44274b(C10868d c10868d, boolean z10) {
        this.f41630a = false;
        this.f41632c = c10868d;
        this.f41631b = z10;
    }

    @Override // p410rf.InterfaceC10872h
    @NonNull
    public InterfaceC10872h add(boolean z10) {
        m44273a();
        this.f41633d.m44259i(this.f41632c, z10, this.f41631b);
        return this;
    }
}

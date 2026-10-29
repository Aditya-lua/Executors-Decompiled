package p168hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: hd.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6358b implements InterfaceC6359c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6359c f24118a;

    /* JADX INFO: renamed from: b */
    public final float f24119b;

    public C6358b(float f10, @NonNull InterfaceC6359c interfaceC6359c) {
        while (interfaceC6359c instanceof C6358b) {
            interfaceC6359c = ((C6358b) interfaceC6359c).f24118a;
            f10 += ((C6358b) interfaceC6359c).f24119b;
        }
        this.f24118a = interfaceC6359c;
        this.f24119b = f10;
    }

    @Override // p168hd.InterfaceC6359c
    /* JADX INFO: renamed from: a */
    public float mo27683a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f24118a.mo27683a(rectF) + this.f24119b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6358b)) {
            return false;
        }
        C6358b c6358b = (C6358b) obj;
        return this.f24118a.equals(c6358b.f24118a) && this.f24119b == c6358b.f24119b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24118a, Float.valueOf(this.f24119b)});
    }
}

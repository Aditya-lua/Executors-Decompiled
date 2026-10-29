package p168hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: hd.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6357a implements InterfaceC6359c {

    /* JADX INFO: renamed from: a */
    public final float f24117a;

    public C6357a(float f10) {
        this.f24117a = f10;
    }

    @Override // p168hd.InterfaceC6359c
    /* JADX INFO: renamed from: a */
    public float mo27683a(@NonNull RectF rectF) {
        return this.f24117a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6357a) && this.f24117a == ((C6357a) obj).f24117a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24117a)});
    }
}

package p168hd;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: hd.e */
/* JADX INFO: loaded from: classes2.dex */
public class C6361e extends C6360d {

    /* JADX INFO: renamed from: a */
    public float f24120a = -1.0f;

    @Override // p168hd.C6360d
    /* JADX INFO: renamed from: a */
    public void mo27684a(@NonNull C6369m c6369m, float f10, float f11, float f12) {
        c6369m.m27847o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        c6369m.m27845m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}

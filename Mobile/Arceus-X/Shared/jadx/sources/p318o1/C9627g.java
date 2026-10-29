package p318o1;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.HashSet;
import java.util.Set;
import p140g0.C5931r1;
import p234k1.C7407c;
import p282m1.InterfaceC8389r1;
import p533x2.C12637g;

/* JADX INFO: renamed from: o1.g */
/* JADX INFO: loaded from: classes.dex */
public class C9627g implements InterfaceC8389r1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8389r1 f34917a;

    /* JADX INFO: renamed from: b */
    public final Range<Integer> f34918b;

    /* JADX INFO: renamed from: c */
    public final Range<Integer> f34919c;

    /* JADX INFO: renamed from: d */
    public final Set<Size> f34920d;

    public C9627g(InterfaceC8389r1 interfaceC8389r1) {
        HashSet hashSet = new HashSet();
        this.f34920d = hashSet;
        this.f34917a = interfaceC8389r1;
        int iMo34056f = interfaceC8389r1.mo34056f();
        this.f34918b = Range.create(Integer.valueOf(iMo34056f), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iMo34056f))) * iMo34056f));
        int iMo34054c = interfaceC8389r1.mo34054c();
        this.f34919c = Range.create(Integer.valueOf(iMo34054c), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iMo34054c))) * iMo34054c));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.m2301g());
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC8389r1 m37990l(InterfaceC8389r1 interfaceC8389r1, Size size) {
        if (!(interfaceC8389r1 instanceof C9627g)) {
            if (C7407c.m30691b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                interfaceC8389r1 = new C9627g(interfaceC8389r1);
            } else if (size != null && !interfaceC8389r1.m34063e(size.getWidth(), size.getHeight())) {
                C5931r1.m26572l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, interfaceC8389r1.mo34059i(), interfaceC8389r1.mo34060j()));
                interfaceC8389r1 = new C9627g(interfaceC8389r1);
            }
        }
        if (size != null && (interfaceC8389r1 instanceof C9627g)) {
            ((C9627g) interfaceC8389r1).m37991k(size);
        }
        return interfaceC8389r1;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: a */
    public boolean mo34052a() {
        return this.f34917a.mo34052a();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: b */
    public Range<Integer> mo34053b(int i10) {
        C12637g.m47070b(this.f34919c.contains(Integer.valueOf(i10)) && i10 % this.f34917a.mo34054c() == 0, "Not supported height: " + i10 + " which is not in " + this.f34919c + " or can not be divided by alignment " + this.f34917a.mo34054c());
        return this.f34918b;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: c */
    public int mo34054c() {
        return this.f34917a.mo34054c();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: d */
    public boolean mo34055d(int i10, int i11) {
        if (this.f34917a.mo34055d(i10, i11)) {
            return true;
        }
        for (Size size : this.f34920d) {
            if (size.getWidth() == i10 && size.getHeight() == i11) {
                return true;
            }
        }
        return this.f34918b.contains(Integer.valueOf(i10)) && this.f34919c.contains(Integer.valueOf(i11)) && i10 % this.f34917a.mo34056f() == 0 && i11 % this.f34917a.mo34054c() == 0;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: f */
    public int mo34056f() {
        return this.f34917a.mo34056f();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: g */
    public Range<Integer> mo34057g() {
        return this.f34917a.mo34057g();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: h */
    public Range<Integer> mo34058h(int i10) {
        C12637g.m47070b(this.f34918b.contains(Integer.valueOf(i10)) && i10 % this.f34917a.mo34056f() == 0, "Not supported width: " + i10 + " which is not in " + this.f34918b + " or can not be divided by alignment " + this.f34917a.mo34056f());
        return this.f34919c;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: i */
    public Range<Integer> mo34059i() {
        return this.f34918b;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: j */
    public Range<Integer> mo34060j() {
        return this.f34919c;
    }

    /* JADX INFO: renamed from: k */
    public final void m37991k(Size size) {
        this.f34920d.add(size);
    }
}

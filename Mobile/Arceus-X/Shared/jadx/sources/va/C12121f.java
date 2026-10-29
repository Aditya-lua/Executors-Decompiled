package va;

import android.content.Context;

/* JADX INFO: renamed from: va.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12121f extends AbstractC12129j {

    /* JADX INFO: renamed from: a */
    public final Context f42734a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12145r f42735b;

    public C12121f(Context context, InterfaceC12145r interfaceC12145r) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f42734a = context;
        this.f42735b = interfaceC12145r;
    }

    @Override // va.AbstractC12129j
    /* JADX INFO: renamed from: a */
    public final Context mo44958a() {
        return this.f42734a;
    }

    @Override // va.AbstractC12129j
    /* JADX INFO: renamed from: b */
    public final InterfaceC12145r mo44959b() {
        return this.f42735b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12129j) {
            AbstractC12129j abstractC12129j = (AbstractC12129j) obj;
            if (this.f42734a.equals(abstractC12129j.mo44958a()) && this.f42735b.equals(abstractC12129j.mo44959b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f42734a.hashCode() ^ 1000003) * 1000003) ^ this.f42735b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f42734a.toString() + ", hermeticFileOverrides=" + this.f42735b.toString() + "}";
    }
}

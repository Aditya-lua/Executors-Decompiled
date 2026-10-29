package p260l1;

import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: l1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7965h extends AbstractC7962e {

    /* JADX INFO: renamed from: a */
    public final String f29856a;

    /* JADX INFO: renamed from: b */
    public final int f29857b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8721a2.a f29858c;

    /* JADX INFO: renamed from: l1.h$b */
    public static final class b extends AbstractC7962e.a {

        /* JADX INFO: renamed from: a */
        public String f29859a;

        /* JADX INFO: renamed from: b */
        public Integer f29860b;

        /* JADX INFO: renamed from: c */
        public InterfaceC8721a2.a f29861c;

        @Override // p260l1.AbstractC7962e.a
        /* JADX INFO: renamed from: b */
        public AbstractC7962e mo32973b() {
            String str = "";
            if (this.f29859a == null) {
                str = " mimeType";
            }
            if (this.f29860b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C7965h(this.f29859a, this.f29860b.intValue(), this.f29861c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p260l1.AbstractC7962e.a
        /* JADX INFO: renamed from: c */
        public AbstractC7962e.a mo32974c(InterfaceC8721a2.a aVar) {
            this.f29861c = aVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC7962e.a m32980d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f29859a = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: a(I)Ljava/lang/Object; */
        @Override // p260l1.AbstractC7969l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC7962e.a mo32979a(int i10) {
            this.f29860b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p260l1.AbstractC7969l
    /* JADX INFO: renamed from: a */
    public String mo32977a() {
        return this.f29856a;
    }

    @Override // p260l1.AbstractC7969l
    /* JADX INFO: renamed from: b */
    public int mo32978b() {
        return this.f29857b;
    }

    @Override // p260l1.AbstractC7962e
    /* JADX INFO: renamed from: d */
    public InterfaceC8721a2.a mo32972d() {
        return this.f29858c;
    }

    public boolean equals(Object obj) {
        InterfaceC8721a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7962e) {
            AbstractC7962e abstractC7962e = (AbstractC7962e) obj;
            if (this.f29856a.equals(abstractC7962e.mo32977a()) && this.f29857b == abstractC7962e.mo32978b() && ((aVar = this.f29858c) != null ? aVar.equals(abstractC7962e.mo32972d()) : abstractC7962e.mo32972d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f29856a.hashCode() ^ 1000003) * 1000003) ^ this.f29857b) * 1000003;
        InterfaceC8721a2.a aVar = this.f29858c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f29856a + ", profile=" + this.f29857b + ", compatibleAudioProfile=" + this.f29858c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7965h(String str, int i10, InterfaceC8721a2.a aVar) {
        this.f29856a = str;
        this.f29857b = i10;
        this.f29858c = aVar;
    }
}

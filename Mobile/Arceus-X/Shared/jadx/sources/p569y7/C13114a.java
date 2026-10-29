package p569y7;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13114a<T> extends AbstractC13117d<T> {

    /* JADX INFO: renamed from: a */
    public final Integer f46358a;

    /* JADX INFO: renamed from: b */
    public final T f46359b;

    /* JADX INFO: renamed from: c */
    public final EnumC13118e f46360c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13119f f46361d;

    public C13114a(Integer num, T t8, EnumC13118e enumC13118e, AbstractC13119f abstractC13119f) {
        this.f46358a = num;
        if (t8 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f46359b = t8;
        if (enumC13118e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f46360c = enumC13118e;
        this.f46361d = abstractC13119f;
    }

    @Override // p569y7.AbstractC13117d
    /* JADX INFO: renamed from: a */
    public Integer mo48724a() {
        return this.f46358a;
    }

    @Override // p569y7.AbstractC13117d
    /* JADX INFO: renamed from: b */
    public T mo48725b() {
        return this.f46359b;
    }

    @Override // p569y7.AbstractC13117d
    /* JADX INFO: renamed from: c */
    public EnumC13118e mo48726c() {
        return this.f46360c;
    }

    @Override // p569y7.AbstractC13117d
    /* JADX INFO: renamed from: d */
    public AbstractC13119f mo48727d() {
        return this.f46361d;
    }

    public boolean equals(Object obj) {
        AbstractC13119f abstractC13119f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13117d) {
            AbstractC13117d abstractC13117d = (AbstractC13117d) obj;
            Integer num = this.f46358a;
            if (num != null ? num.equals(abstractC13117d.mo48724a()) : abstractC13117d.mo48724a() == null) {
                if (this.f46359b.equals(abstractC13117d.mo48725b()) && this.f46360c.equals(abstractC13117d.mo48726c()) && ((abstractC13119f = this.f46361d) != null ? abstractC13119f.equals(abstractC13117d.mo48727d()) : abstractC13117d.mo48727d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f46358a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f46359b.hashCode()) * 1000003) ^ this.f46360c.hashCode()) * 1000003;
        AbstractC13119f abstractC13119f = this.f46361d;
        return iHashCode ^ (abstractC13119f != null ? abstractC13119f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f46358a + ", payload=" + this.f46359b + ", priority=" + this.f46360c + ", productData=" + this.f46361d + "}";
    }
}
